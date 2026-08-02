package ru.ok.android.webrtc.signaling.api;

import android.os.Handler;
import android.os.Looper;
import android.util.LongSparseArray;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicLong;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import ru.ok.android.webrtc.CallState;
import ru.ok.android.webrtc.ConversationIdProvider;
import ru.ok.android.webrtc.RTCLog;
import ru.ok.android.webrtc.cid.CidExtKt;
import ru.ok.android.webrtc.signaling.api.Signaling;
import ru.ok.android.webrtc.signaling.command.GenericCommand;
import ru.ok.android.webrtc.signaling.command.SignalingCommand;
import ru.ok.android.webrtc.signaling.command.SignalingCommandAutoRecover;
import ru.ok.android.webrtc.signaling.command.SignalingCommandQueueIterator;
import ru.ok.android.webrtc.signaling.command.merge.SignalingCommandMerge;
import ru.ok.android.webrtc.signaling.sensor.NetworkAvailabilitySensor;
import ru.ok.android.webrtc.utils.MiscHelper;
import xsna.eul;
import xsna.he6;
import xsna.mh40;
import xsna.opq;
import xsna.qny;
import xsna.wc2;
import xsna.wm8;

/* loaded from: classes9.dex */
public class Signaling {
    public static final String TAG = "OKSignaling";
    public final RTCLog a;
    public final Handler b;
    public final Handler c;
    public final Transport f;
    public final int m;
    public final int n;
    public final ConversationIdProvider o;
    public boolean q;
    public boolean r;
    public volatile long s;
    public volatile long t;

    @Nullable
    public final TransportType transportType;
    public final boolean u;
    public final boolean v;
    public final boolean w;
    public final MessageInterceptor x;
    public final NetworkAvailabilitySensor y;
    public final AtomicLong d = new AtomicLong(1);
    public final Object e = new Object();
    public final ArrayList g = new ArrayList();
    public final LongSparseArray h = new LongSparseArray();
    public final ArrayList i = new ArrayList();
    public final CopyOnWriteArraySet j = new CopyOnWriteArraySet();
    public final CopyOnWriteArraySet k = new CopyOnWriteArraySet();
    public final CopyOnWriteArraySet l = new CopyOnWriteArraySet();
    public boolean p = true;

    public interface ConnectFailureListener {

        public interface FailureReason {

            public static class BadEndpoint implements FailureReason {
                public final String message;

                public BadEndpoint(String str) {
                    this.message = str;
                }
            }

            public static class ReconnectTimeout implements FailureReason {
            }
        }

        void onConnectFailed(FailureReason failureReason, Transport transport);
    }

    public interface ConnectionListener {
        void onConnectedStateChanged(boolean z);
    }

    public interface Listener {
        void onResponse(JSONObject jSONObject) throws JSONException;
    }

    public interface MessageInterceptor {
        JSONObject onMessage(JSONObject jSONObject);
    }

    public interface Transport {

        public interface Listener {
            void onConnected();

            void onDisconnected();

            void onMessage(JSONObject jSONObject) throws JSONException;
        }

        void dispose();

        void registerListener(Listener listener);

        void restart(String str, Long l);

        void send(String str);

        void tryReconnectNow();

        @Nullable
        TransportType type();

        void updateActivityTimeout(long j);
    }

    public Signaling(Transport transport, ConversationIdProvider conversationIdProvider, RTCLog rTCLog, int i, int i2, boolean z, boolean z2, boolean z3, MessageInterceptor messageInterceptor, Looper looper, NetworkAvailabilitySensor networkAvailabilitySensor) {
        this.b = new Handler(looper == null ? Looper.getMainLooper() : looper);
        this.c = new Handler(looper == null ? Looper.getMainLooper() : looper);
        this.f = transport;
        this.o = conversationIdProvider;
        this.a = rTCLog;
        this.n = i;
        this.m = i2;
        this.u = z;
        this.v = z2;
        this.x = messageInterceptor;
        this.transportType = transport.type();
        this.w = z3;
        this.y = networkAvailabilitySensor;
        if (networkAvailabilitySensor != null) {
            networkAvailabilitySensor.setListener(new mh40(transport, 13));
        }
        transport.registerListener(new a(this));
    }

    public void addConnectionListener(ConnectionListener connectionListener) {
        this.l.add(connectionListener);
    }

    public void addErrorListener(Listener listener) {
        this.k.add(listener);
    }

    public void addNotificationListener(Listener listener) {
        this.j.add(listener);
    }

    public final /* synthetic */ void b(boolean z) {
        Iterator it = this.l.iterator();
        while (it.hasNext()) {
            ((ConnectionListener) it.next()).onConnectedStateChanged(z);
        }
    }

    public final void c(JSONObject jSONObject) {
        Listener listener;
        JSONObject onMessage;
        MessageInterceptor messageInterceptor = this.x;
        if (messageInterceptor != null && (onMessage = messageInterceptor.onMessage(jSONObject)) != null) {
            jSONObject = onMessage;
        }
        String string = jSONObject.getString("type");
        long optLong = jSONObject.optLong(SignalingProtocol.KEY_STAMP, 0L);
        if (optLong != 0) {
            this.s = Math.max(optLong, this.s);
        }
        if (!string.equals("response")) {
            if (string.equals("notification")) {
                if (SignalingProtocol.NOTIFY_CONNECTION.equals(jSONObject.getString("notification"))) {
                    b(jSONObject);
                }
                a(jSONObject);
                return;
            }
            if (string.equals("error")) {
                if (!jSONObject.has(SignalingProtocol.KEY_SEQUENCE)) {
                    a(jSONObject, "listener.response.error");
                    return;
                }
                long j = jSONObject.getLong(SignalingProtocol.KEY_SEQUENCE);
                e a = a(j);
                listener = a != null ? a.e : null;
                if (listener != null) {
                    this.b.post(new qny(this, listener, jSONObject, 2));
                }
                if (!"service-unavailable".equals(jSONObject.getString("error"))) {
                    a(jSONObject, "signaling.listener.response.error.seq");
                    return;
                } else if (jSONObject.optBoolean(SignalingProtocol.KEY_ERROR_RECOVERABLE, false)) {
                    b(j);
                    return;
                } else {
                    a(jSONObject, "signaling.listener.response.error.seq");
                    return;
                }
            }
            return;
        }
        String optString = jSONObject.optString("response", null);
        long j2 = jSONObject.getLong(SignalingProtocol.KEY_SEQUENCE);
        if (!"recover".equals(optString) || this.u) {
            e a2 = a(j2);
            listener = a2 != null ? a2.d : null;
            if (listener != null) {
                this.b.post(new eul(this, listener, jSONObject, 2));
                return;
            }
            return;
        }
        JSONArray optJSONArray = jSONObject.optJSONArray("messages");
        if (optJSONArray != null) {
            for (int i = 0; i < optJSONArray.length(); i++) {
                c(optJSONArray.getJSONObject(i));
            }
        }
        synchronized (this.e) {
            for (int i2 = 0; i2 < this.h.size(); i2++) {
                try {
                    e eVar = (e) this.h.valueAt(i2);
                    c cVar = eVar.c;
                    if (cVar.b <= j2) {
                        SignalingCommand command = eVar.getCommand();
                        if (command == null || !command.isSmart()) {
                            this.f.send(cVar.a);
                        } else {
                            this.h.removeAt(i2);
                            eVar.onDiscard();
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public void dispose() {
        this.f.dispose();
        NetworkAvailabilitySensor networkAvailabilitySensor = this.y;
        if (networkAvailabilitySensor != null) {
            networkAvailabilitySensor.release();
        }
        synchronized (this.e) {
            try {
                ArrayList arrayList = this.i;
                int size = arrayList.size();
                int i = 0;
                while (i < size) {
                    Object obj = arrayList.get(i);
                    i++;
                    this.c.removeCallbacks((Runnable) obj);
                }
                this.i.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public boolean isConnected() {
        return this.r;
    }

    public void onCallConnected(CallState callState) {
        int i;
        if (this.w) {
            LongSparseArray longSparseArray = new LongSparseArray();
            synchronized (this.e) {
                for (int i2 = 0; i2 < this.h.size(); i2++) {
                    try {
                        e eVar = (e) this.h.valueAt(i2);
                        c cVar = eVar.c;
                        SignalingCommand command = eVar.getCommand();
                        if (command.isSmart() && (command instanceof SignalingCommandAutoRecover)) {
                            longSparseArray.put(cVar.b, (SignalingCommandAutoRecover) command);
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            for (i = 0; i < longSparseArray.size(); i++) {
                long keyAt = longSparseArray.keyAt(i);
                SignalingCommandAutoRecover signalingCommandAutoRecover = (SignalingCommandAutoRecover) longSparseArray.valueAt(i);
                try {
                    JSONObject recoverResponse = signalingCommandAutoRecover.recoverResponse(keyAt, callState);
                    if (recoverResponse != null) {
                        c(recoverResponse);
                    }
                } catch (JSONException e) {
                    this.a.logException(TAG, "Can't recover command response" + signalingCommandAutoRecover + " by call state", e);
                }
            }
        }
    }

    public void removeConnectionListener(ConnectionListener connectionListener) {
        this.l.remove(connectionListener);
    }

    public void removeErrorListener(Listener listener) {
        this.k.remove(listener);
    }

    public void removeNotificationListener(Listener listener) {
        this.j.remove(listener);
    }

    @Deprecated
    public void send(@NonNull JSONObject jSONObject) {
        send(new GenericCommand(jSONObject));
    }

    public void sendLastCommand(@NonNull JSONObject jSONObject) {
        this.p = false;
        MiscHelper.throwIfNotMainThread();
        wc2 wc2Var = new wc2(this, 17);
        this.b.postDelayed(wc2Var, 8000L);
        a((SignalingCommand) new GenericCommand(jSONObject), true, (Listener) new b(this, wc2Var), (Listener) null);
    }

    public final void a(final boolean z) {
        this.b.post(new Runnable() { // from class: xsna.jmj0
            @Override // java.lang.Runnable
            public final void run() {
                Signaling.this.b(z);
            }
        });
    }

    @Deprecated
    public void send(@NonNull JSONObject jSONObject, Listener listener) {
        send(new GenericCommand(jSONObject), listener);
    }

    public final /* synthetic */ void a(Listener listener, JSONObject jSONObject) {
        try {
            if (listener instanceof d) {
                listener.onResponse(jSONObject);
                return;
            }
            if (this.p) {
                listener.onResponse(jSONObject);
                return;
            }
            this.a.log(TAG, "<!> ignoring " + jSONObject);
        } catch (Exception e) {
            this.a.reportException(TAG, "signaling.response", e);
        }
    }

    public final /* synthetic */ void b(Listener listener, JSONObject jSONObject) {
        try {
            if (listener instanceof d) {
                listener.onResponse(jSONObject);
                return;
            }
            if (this.p) {
                listener.onResponse(jSONObject);
                return;
            }
            this.a.log(TAG, "<!> ignoring " + jSONObject);
        } catch (Exception e) {
            this.a.reportException(TAG, "signaling.response", e);
        }
    }

    @Deprecated
    public void send(@NonNull JSONObject jSONObject, Listener listener, Listener listener2) {
        send(new GenericCommand(jSONObject), listener, listener2);
    }

    public void send(@NonNull SignalingCommand signalingCommand) {
        a(signalingCommand, false, (Listener) null, (Listener) null);
    }

    public void send(@NonNull SignalingCommand signalingCommand, Listener listener) {
        a(signalingCommand, false, listener, (Listener) null);
    }

    public void send(@NonNull SignalingCommand signalingCommand, Listener listener, Listener listener2) {
        a(signalingCommand, false, listener, listener2);
    }

    public final void a(JSONObject jSONObject, String str) {
        this.b.post(new wm8(this, jSONObject, str, 5));
    }

    public final void b(JSONObject jSONObject) {
        JSONArray optJSONArray = jSONObject.optJSONArray("recoverMessages");
        if (optJSONArray != null && this.u) {
            for (int i = 0; i < optJSONArray.length(); i++) {
                c(optJSONArray.getJSONObject(i));
            }
        }
        String string = jSONObject.getJSONObject(SignalingProtocol.KEY_CONVERSATION).getString("id");
        this.a.log(TAG, "cur cid=" + this.o.getConversationId() + ", new cid=" + string);
        CidExtKt.update(this.o, string);
        JSONObject optJSONObject = jSONObject.optJSONObject("conversationParams");
        if (optJSONObject != null) {
            long optLong = optJSONObject.optLong("activityTimeout", -1L);
            if (optLong > 0) {
                this.f.updateActivityTimeout(optLong);
            }
        }
        synchronized (this.e) {
            this.r = true;
            if (this.q && !this.u) {
                try {
                    c a = a(SignalingProtocol.createRequestRecovery(this.t), this.d.getAndIncrement());
                    if (a != null) {
                        this.f.send(a.a);
                    }
                } catch (JSONException e) {
                    this.a.reportException(TAG, "signaling.recover", e);
                }
            } else {
                this.q = true;
                while (!this.g.isEmpty()) {
                    e eVar = (e) this.g.remove(0);
                    c cVar = eVar.c;
                    this.a.log(TAG, "send postponed " + cVar);
                    c cVar2 = eVar.c;
                    this.h.put(cVar2.b, eVar);
                    this.f.send(cVar2.a);
                }
            }
        }
    }

    public final void a(JSONObject jSONObject) {
        this.b.post(new he6(5, this, jSONObject));
    }

    public final c a(SignalingCommand signalingCommand, long j) {
        try {
            return new c(signalingCommand.extractParams().put(SignalingProtocol.KEY_SEQUENCE, j).toString(), j);
        } catch (JSONException e) {
            this.a.reportException(TAG, "signaling.create.command", e);
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0047 A[Catch: all -> 0x000f, TRY_LEAVE, TryCatch #3 {all -> 0x000f, blocks: (B:44:0x0009, B:9:0x0017, B:16:0x0023, B:24:0x0029, B:25:0x0045, B:18:0x0047, B:30:0x003c, B:37:0x0058), top: B:43:0x0009, inners: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0029 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0058 A[Catch: all -> 0x000f, DONT_GENERATE, TRY_ENTER, TRY_LEAVE, TryCatch #3 {all -> 0x000f, blocks: (B:44:0x0009, B:9:0x0017, B:16:0x0023, B:24:0x0029, B:25:0x0045, B:18:0x0047, B:30:0x003c, B:37:0x0058), top: B:43:0x0009, inners: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x005a A[Catch: all -> 0x0078, TRY_ENTER, TRY_LEAVE, TryCatch #1 {all -> 0x0078, blocks: (B:4:0x0003, B:35:0x004c, B:39:0x005a), top: B:3:0x0003 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(SignalingCommand signalingCommand, boolean z, Listener listener, Listener listener2) {
        Throwable th;
        boolean z2;
        c a;
        synchronized (this.e) {
            try {
                try {
                    boolean z3 = this.u;
                    boolean z4 = false;
                    if (!z3) {
                        try {
                            if (this.q) {
                                z2 = true;
                                if (z3 && this.r) {
                                    z4 = true;
                                }
                                if (!z2 && !z4 && !z) {
                                    if (!signalingCommand.isSmart()) {
                                        try {
                                            listener2.onResponse(new JSONObject().put("error", SignalingProtocol.ERROR_COMMAND_CAN_NOT_BE_POSTPONED));
                                        } catch (JSONException e) {
                                            this.a.logException(TAG, "Can't handle unsupported enqueue error", e);
                                        }
                                        return;
                                    }
                                    a(signalingCommand, listener, listener2);
                                    return;
                                }
                                a = a(signalingCommand, this.d.getAndIncrement());
                                if (a != null) {
                                    return;
                                }
                                e eVar = new e(this, signalingCommand, a, listener, listener2);
                                c cVar = eVar.c;
                                this.h.put(cVar.b, eVar);
                                this.f.send(cVar.a);
                                return;
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            throw th;
                        }
                    }
                    z2 = false;
                    if (z3) {
                        z4 = true;
                    }
                    if (!z2) {
                        if (!signalingCommand.isSmart()) {
                        }
                    }
                    a = a(signalingCommand, this.d.getAndIncrement());
                    if (a != null) {
                    }
                } catch (Throwable th3) {
                    th = th3;
                    th = th;
                    throw th;
                }
            } catch (Throwable th4) {
                th = th4;
                th = th;
                throw th;
            }
        }
    }

    public final void a(SignalingCommand signalingCommand, Listener listener, Listener listener2) {
        synchronized (this.e) {
            try {
                this.a.log(TAG, "<!> postpone send " + signalingCommand);
                if (this.v && b(signalingCommand, listener, listener2)) {
                    return;
                }
                c a = a(signalingCommand, this.d.getAndIncrement());
                if (a == null) {
                    return;
                }
                this.g.add(new e(this, signalingCommand, a, listener, listener2));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final /* synthetic */ void b(JSONObject jSONObject, String str) {
        if (!this.p) {
            this.a.log(TAG, "<!> ignoring " + jSONObject.toString());
            return;
        }
        try {
            Iterator it = this.k.iterator();
            while (it.hasNext()) {
                ((Listener) it.next()).onResponse(jSONObject);
            }
        } catch (JSONException e) {
            this.a.reportException(TAG, str, e);
        }
    }

    public final /* synthetic */ e a(Listener listener, Listener listener2, SignalingCommand signalingCommand, Long l) {
        c a = a(signalingCommand, l == null ? this.d.getAndIncrement() : l.longValue());
        if (a == null) {
            return null;
        }
        return new e(this, signalingCommand, a, listener, listener2);
    }

    public final e a(long j) {
        e eVar;
        synchronized (this.e) {
            try {
                int indexOfKey = this.h.indexOfKey(j);
                if (indexOfKey >= 0) {
                    eVar = (e) this.h.valueAt(indexOfKey);
                    this.h.removeAt(indexOfKey);
                } else {
                    eVar = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return eVar;
    }

    public final void b(long j) {
        synchronized (this.e) {
            try {
                int indexOfKey = this.h.indexOfKey(j);
                e eVar = indexOfKey >= 0 ? (e) this.h.valueAt(indexOfKey) : null;
                if (eVar != null) {
                    c cVar = eVar.c;
                    long j2 = cVar.d + 1;
                    cVar.d = j2;
                    if (j2 >= this.n) {
                        this.a.log(TAG, "<!> quit retrying " + this.o.getConversationId() + " " + cVar);
                        this.a.reportException(TAG, "signaling.retry", new RuntimeException("retry.fail"));
                        this.h.removeAt(indexOfKey);
                        return;
                    }
                    f fVar = new f(this, cVar);
                    this.i.add(fVar);
                    this.a.log(TAG, "<!> retrying " + cVar);
                    this.c.postDelayed(fVar, cVar.c);
                    long j3 = cVar.c * 2;
                    cVar.c = j3;
                    cVar.c = Math.min(j3, this.m);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final /* synthetic */ void c(JSONObject jSONObject, String str) {
        if (!this.p) {
            this.a.log(TAG, "<!> ignoring " + jSONObject.toString());
            return;
        }
        try {
            Iterator it = this.j.iterator();
            while (it.hasNext()) {
                ((Listener) it.next()).onResponse(jSONObject);
            }
        } catch (JSONException e) {
            this.a.reportException(TAG, str, e);
        }
    }

    public final boolean c(SignalingCommand signalingCommand, Listener listener, Listener listener2) {
        SignalingCommandMerge create = SignalingCommandMerge.create(signalingCommand);
        if (create == null) {
            return false;
        }
        return create.merge(new SignalingCommandQueueIterator(this.g, this.a, new opq(this, listener, listener2, 5)));
    }

    public final boolean b(SignalingCommand signalingCommand, Listener listener, Listener listener2) {
        Long permittedEnqueueTime = signalingCommand.getPermittedEnqueueTime();
        if (permittedEnqueueTime != null && permittedEnqueueTime.longValue() == 0) {
            this.a.log(TAG, "Enqueue is not supported, fail command " + signalingCommand);
            if (listener2 == null) {
                return true;
            }
            try {
                listener2.onResponse(new JSONObject().put("error", SignalingProtocol.ERROR_COMMAND_CAN_NOT_BE_POSTPONED));
                return true;
            } catch (JSONException e) {
                this.a.logException(TAG, "Can't handle enqueue error", e);
                return true;
            }
        }
        return c(signalingCommand, listener, listener2);
    }
}

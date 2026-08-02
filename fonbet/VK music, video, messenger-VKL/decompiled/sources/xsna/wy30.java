package xsna;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import com.ironsource.X3;
import com.vk.api.sdk.exceptions.VKApiExecutionException;
import com.vk.dto.attaches.Attach;
import com.vk.dto.attaches.AttachAudio;
import com.vk.dto.attaches.AttachAudioMsg;
import com.vk.dto.attaches.AttachDoc;
import com.vk.dto.attaches.AttachImage;
import com.vk.dto.messages.MsgSyncState;
import com.vk.im.engine.exceptions.attach.AttachUploadException;
import com.vk.im.engine.models.ImBgSyncState;
import com.vk.im.engine.models.attaches.AttachVideo;
import com.vk.im.engine.models.messages.LocalMsgId;
import com.vk.im.engine.models.messages.Msg;
import com.vk.im.engine.models.reporters.CancelReason;
import com.vk.metrics.eventtracking.Event;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
import ru.ok.android.webrtc.signaling.transport.SignalingTransport;
import ru.ok.android.webrtc.stat.scheme.StatCustomFieldKey;
import xsna.wy30;

/* compiled from: MsgSendReporterImpl.kt */
/* loaded from: classes5.dex */
public final class wy30 implements ry30 {
    public static final wy30 a = new wy30();
    public static final Handler b = new Handler(Looper.getMainLooper());
    public static final long c = TimeUnit.SECONDS.toMillis(2);
    public static final ConcurrentHashMap<Long, a> d = new ConcurrentHashMap<>();

    /* compiled from: MsgSendReporterImpl.kt */
    public static final class a {
        public int a;
        public long b;
        public long c;
        public long d;
        public long e;
        public int f;
        public String g;
        public boolean h;
        public boolean i;
        public long j;
        public long k;
        public long l;
        public long m;
        public String n;
        public boolean o;
        public int p;
        public ImBgSyncState q;
        public String r;
        public String s;
        public Throwable t;
        public String u;
        public int v;

        public a() {
            this(0);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a == aVar.a && this.b == aVar.b && this.c == aVar.c && this.d == aVar.d && this.e == aVar.e && this.f == aVar.f && epx.f(this.g, aVar.g) && this.h == aVar.h && this.i == aVar.i && this.j == aVar.j && this.k == aVar.k && this.l == aVar.l && this.m == aVar.m && epx.f(this.n, aVar.n) && this.o == aVar.o && this.p == aVar.p && this.q == aVar.q && epx.f(this.r, aVar.r) && epx.f(this.s, aVar.s) && epx.f(this.t, aVar.t) && epx.f(this.u, aVar.u) && this.v == aVar.v;
        }

        public final int hashCode() {
            int a = urd0.a(urd0.a((this.q.hashCode() + shy.a(this.p, qoy.b(urd0.a(bh10.a(bh10.a(bh10.a(bh10.a(qoy.b(qoy.b(urd0.a(shy.a(this.f, bh10.a(bh10.a(bh10.a(bh10.a(Integer.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31), 31, this.g), 31, this.h), 31, this.i), 31, this.j), 31, this.k), 31, this.l), 31, this.m), 31, this.n), 31, this.o), 31)) * 31, 31, this.r), 31, this.s);
            Throwable th = this.t;
            return Integer.hashCode(this.v) + urd0.a((a + (th == null ? 0 : th.hashCode())) * 31, 31, this.u);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("ReportParams(localId=");
            sb.append(this.a);
            sb.append(", dialogId=");
            sb.append(this.b);
            sb.append(", startUiTime=");
            sb.append(this.c);
            sb.append(", endUiTime=");
            sb.append(this.d);
            sb.append(", endStorageTime=");
            sb.append(this.e);
            sb.append(", msgSizeBytes=");
            sb.append(this.f);
            sb.append(", entryPoint=");
            sb.append(this.g);
            sb.append(", edit=");
            sb.append(this.h);
            sb.append(", retry=");
            sb.append(this.i);
            sb.append(", startRequestTime=");
            sb.append(this.j);
            sb.append(", endRequestTime=");
            sb.append(this.k);
            sb.append(", endFullTime=");
            sb.append(this.l);
            sb.append(", endFailTime=");
            sb.append(this.m);
            sb.append(", media=");
            sb.append(this.n);
            sb.append(", needUpload=");
            sb.append(this.o);
            sb.append(", mediaCount=");
            sb.append(this.p);
            sb.append(", imBgSyncState=");
            sb.append(this.q);
            sb.append(", networkType=");
            sb.append(this.r);
            sb.append(", mobileSubType=");
            sb.append(this.s);
            sb.append(", error=");
            sb.append(this.t);
            sb.append(", cancelReason=");
            sb.append(this.u);
            sb.append(", networkStrength=");
            return vu5.b(sb, this.v, ')');
        }

        public a(int i) {
            ImBgSyncState imBgSyncState = ImBgSyncState.CONNECTED;
            this.a = 0;
            this.b = 0L;
            this.c = 0L;
            this.d = 0L;
            this.e = 0L;
            this.f = 0;
            this.g = "unknown";
            this.h = false;
            this.i = false;
            this.j = 0L;
            this.k = 0L;
            this.l = 0L;
            this.m = 0L;
            this.n = "";
            this.o = false;
            this.p = 0;
            this.q = imBgSyncState;
            this.r = "";
            this.s = "";
            this.t = null;
            this.u = "";
            this.v = 0;
        }
    }

    public static final boolean l(long j) {
        return j != 0;
    }

    public static void m(final long j, final int i, final a aVar, long j2) {
        Handler handler = b;
        handler.removeCallbacksAndMessages(aVar);
        handler.postAtTime(new Runnable() { // from class: xsna.vy30
            @Override // java.lang.Runnable
            public final void run() {
                com.vk.metrics.eventtracking.b bVar = com.vk.metrics.eventtracking.b.a;
                wy30.a aVar2 = wy30.a.this;
                aVar2.getClass();
                wy30 wy30Var = wy30.a;
                String o = wy30.o(aVar2.t);
                el3 el3Var = Event.b;
                Event.a b2 = h5s.b("crucial_im_msg_send");
                b2.c(X3.i.I0, aVar2.n);
                b2.b("media_count", Integer.valueOf(aVar2.p));
                b2.a(Boolean.valueOf(aVar2.h), "edit");
                b2.a(Boolean.valueOf(aVar2.i), SignalingTransport.URL_TYPE_RETRY);
                b2.a(aVar2.q, "longpoll_state");
                b2.c("network_strength", String.valueOf(aVar2.v));
                b2.c("entry_point", aVar2.g);
                b2.b("dialog_id", Long.valueOf(aVar2.b));
                b2.b("need_upload", Integer.valueOf(aVar2.o ? 1 : 0));
                b2.b("msg_size", Integer.valueOf(aVar2.f));
                if (aVar2.r.length() > 0) {
                    b2.c(StatCustomFieldKey.NETWORK_TYPE, aVar2.r);
                }
                if (aVar2.s.length() > 0) {
                    b2.c("network_subtype", aVar2.s);
                }
                if (o.length() > 0) {
                    b2.c("error", o);
                }
                if (aVar2.u.length() > 0) {
                    b2.c("cancel_reason", aVar2.u);
                }
                if (wy30.l(aVar2.k)) {
                    b2.b("request_duration", Long.valueOf(aVar2.k - aVar2.j));
                }
                if (wy30.l(aVar2.l)) {
                    b2.b("full_duration", Long.valueOf(aVar2.l - aVar2.c));
                }
                if (wy30.l(aVar2.d)) {
                    b2.b("ui_delay", Long.valueOf(aVar2.d - aVar2.c));
                }
                if (wy30.l(aVar2.m)) {
                    b2.b("fail_delay", Long.valueOf(aVar2.m - aVar2.c));
                }
                if (wy30.l(aVar2.e)) {
                    b2.b("storage_duration", Long.valueOf(aVar2.e - aVar2.c));
                }
                b2.i("StatlogTracker");
                bVar.k(b2.e());
                wy30.b.removeCallbacksAndMessages(wy30Var);
                wy30.d.remove(Long.valueOf((i << 32) | j));
            }
        }, aVar, SystemClock.uptimeMillis() + j2);
    }

    public static String n(List list) {
        if (list.isEmpty()) {
            return "none";
        }
        List list2 = list;
        boolean z = list2 instanceof Collection;
        if (z && list2.isEmpty()) {
            return "photo";
        }
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            if (!(((Attach) it.next()) instanceof AttachImage)) {
                if (z && list2.isEmpty()) {
                    return "video";
                }
                Iterator it2 = list2.iterator();
                while (it2.hasNext()) {
                    if (!(((Attach) it2.next()) instanceof AttachVideo)) {
                        if (z && list2.isEmpty()) {
                            return "audiomsg";
                        }
                        Iterator it3 = list2.iterator();
                        while (it3.hasNext()) {
                            if (!(((Attach) it3.next()) instanceof AttachAudioMsg)) {
                                if (z && list2.isEmpty()) {
                                    return "doc";
                                }
                                Iterator it4 = list2.iterator();
                                while (it4.hasNext()) {
                                    if (!(((Attach) it4.next()) instanceof AttachDoc)) {
                                        return list.size() == 1 ? "other" : "mixed";
                                    }
                                }
                                return "doc";
                            }
                        }
                        return "audiomsg";
                    }
                }
                return "video";
            }
        }
        return "photo";
    }

    public static String o(Throwable th) {
        if (th == null) {
            return "";
        }
        if (!(th instanceof VKApiExecutionException)) {
            if (th instanceof InterruptedException) {
                return "send cancelled";
            }
            if (!(th instanceof AttachUploadException)) {
                return qjg.a(th);
            }
            return "attach_upload_failed (" + ((AttachUploadException) th).getMessage() + ')';
        }
        VKApiExecutionException vKApiExecutionException = (VKApiExecutionException) th;
        int s = vKApiExecutionException.s();
        if (s == 6) {
            return "to_many_requests";
        }
        if (s == 7) {
            return "no_permission";
        }
        if (s == 10) {
            return "server_error";
        }
        if (s == 14) {
            return "captcha_required";
        }
        if (s == 17) {
            return "validation_required";
        }
        if (s == 917) {
            return "no_access_to_chat";
        }
        if (s == 921) {
            return "fail_to_resend_fwds";
        }
        if (s == 913) {
            return "to_many_fwds";
        }
        if (s == 914) {
            return "msg_too_long";
        }
        switch (s) {
            case 900:
                return "recipient_blacklisted";
            case 901:
                return "recipient_forbid_groups_msgs";
            case 902:
                return "violation_of_privacy_settings";
            default:
                return qjg.a(th) + ": " + vKApiExecutionException.s();
        }
    }

    @Override // xsna.ry30
    public final void a(long j, List<? extends Attach> list) {
        String str;
        Class cls;
        el3 el3Var = Event.b;
        Event.a b2 = h5s.b("vkm_attach_batch_send");
        b2.b("dialog_id", Long.valueOf(j));
        int b3 = bu00.b(list, AttachImage.class);
        int b4 = bu00.b(list, AttachVideo.class);
        if (b3 == 0 || b4 == 0 || b3 + b4 != list.size()) {
            Class cls2 = null;
            if (!list.isEmpty()) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Object obj : list) {
                    Class<?> cls3 = ((Attach) obj).getClass();
                    Object obj2 = linkedHashMap.get(cls3);
                    if (obj2 == null) {
                        obj2 = new ArrayList();
                        linkedHashMap.put(cls3, obj2);
                    }
                    ((List) obj2).add(obj);
                }
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(on00.e(linkedHashMap.size()));
                for (Map.Entry entry : linkedHashMap.entrySet()) {
                    linkedHashMap2.put(entry.getKey(), Integer.valueOf(((List) entry.getValue()).size()));
                }
                int i = 0;
                loop2: while (true) {
                    cls = null;
                    for (Map.Entry entry2 : linkedHashMap2.entrySet()) {
                        int intValue = ((Number) entry2.getValue()).intValue();
                        Class cls4 = (Class) entry2.getKey();
                        if (intValue <= i) {
                            if (intValue == i) {
                                break;
                            }
                        } else {
                            cls = cls4;
                            i = intValue;
                        }
                    }
                }
                cls2 = cls;
            }
            str = epx.f(cls2, AttachImage.class) ? "photo" : epx.f(cls2, AttachVideo.class) ? "video" : epx.f(cls2, AttachDoc.class) ? "doc" : epx.f(cls2, AttachAudio.class) ? "audio" : cls2 == null ? "mixed" : "other";
        } else {
            str = "photo_video";
        }
        b2.c(X3.i.I0, str);
        b2.b("media_count", Integer.valueOf(list.size()));
        b2.i("StatlogTracker");
        com.vk.metrics.eventtracking.b.a.k(b2.e());
    }

    @Override // xsna.ry30
    public final void b(long j) {
        p(j, 0, new oqu(12), new wb1(25));
    }

    @Override // xsna.ry30
    public final void c(Collection<? extends Msg> collection) {
        for (Msg msg : collection) {
            final long j = msg.c;
            final int i = msg.b;
            final boolean z = msg.o == MsgSyncState.DONE;
            a.p(j, i, new izs() { // from class: xsna.uy30
                @Override // xsna.izs
                public final Object invoke(Object obj) {
                    wy30.a aVar = (wy30.a) obj;
                    wy30 wy30Var = wy30.a;
                    if (z && aVar.l == 0) {
                        aVar.l = SystemClock.uptimeMillis();
                        wy30.m(j, i, aVar, 0L);
                    } else if (aVar.d == 0) {
                        aVar.d = SystemClock.uptimeMillis();
                    }
                    return s3q0.a;
                }
            }, null);
        }
    }

    @Override // xsna.ry30
    public final void d(xy30 xy30Var) {
        LocalMsgId localMsgId = xy30Var.a;
        p(localMsgId.b, localMsgId.c, new dn20(xy30Var, 3), new wb1(25));
    }

    @Override // xsna.ry30
    public final void e(Collection<? extends Msg> collection) {
        for (Msg msg : collection) {
            a.p(msg.c, msg.b, new qi00(msg, 9), null);
        }
    }

    @Override // xsna.ry30
    public final void f(int i, long j) {
        p(j, i, new gvs(10), new wb1(25));
    }

    @Override // xsna.ry30
    public final void g(ArrayList arrayList) {
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            com.vk.metrics.eventtracking.b bVar = com.vk.metrics.eventtracking.b.a;
            el3 el3Var = Event.b;
            Event.a aVar = new Event.a();
            aVar.g("CRUCIAL.IM.FAILED_MSG_DELETE");
            aVar.i("StatlogTracker");
            bVar.k(aVar.e());
        }
    }

    @Override // xsna.ry30
    public final void h(final int i, final long j) {
        p(j, i, new izs() { // from class: xsna.ty30
            @Override // xsna.izs
            public final Object invoke(Object obj) {
                wy30.a aVar = (wy30.a) obj;
                aVar.k = SystemClock.uptimeMillis();
                wy30 wy30Var = wy30.a;
                wy30.m(j, i, aVar, wy30.c);
                return s3q0.a;
            }
        }, null);
    }

    @Override // xsna.ry30
    public final void i(Collection<? extends Msg> collection, CancelReason cancelReason) {
        String lowerCase = cancelReason.name().toLowerCase(Locale.ROOT);
        for (Msg msg : collection) {
            a.p(msg.c, msg.b, new qt5(15, lowerCase, msg), null);
        }
    }

    @Override // xsna.ry30
    public final void j(long j, int i, ArrayList arrayList) {
        p(j, i, new u6k(arrayList, 24), new wb1(25));
    }

    @Override // xsna.ry30
    public final void k(final int i, final long j, final Throwable th) {
        p(j, i, new izs() { // from class: xsna.sy30
            @Override // xsna.izs
            public final Object invoke(Object obj) {
                wy30.a aVar = (wy30.a) obj;
                aVar.t = th;
                aVar.m = SystemClock.uptimeMillis();
                wy30 wy30Var = wy30.a;
                wy30.m(j, i, aVar, wy30.c);
                return s3q0.a;
            }
        }, null);
        com.vk.metrics.eventtracking.b.a.m(o(th), "ERROR.IM.MSG_SEND", "msg_send_error_type");
    }

    public final synchronized void p(long j, int i, izs izsVar, wb1 wb1Var) {
        ConcurrentHashMap<Long, a> concurrentHashMap = d;
        long j2 = (i << 32) | j;
        a aVar = concurrentHashMap.get(Long.valueOf(j2));
        if (aVar == null && (aVar = concurrentHashMap.get(Long.valueOf((0 << 32) | j))) == null) {
            aVar = wb1Var != null ? (a) wb1Var.invoke() : null;
            if (aVar == null) {
                return;
            }
        }
        aVar.b = j;
        if (i != 0) {
            aVar.a = i;
            concurrentHashMap.remove(Long.valueOf(j | (0 << 32)));
        }
        concurrentHashMap.put(Long.valueOf(j2), aVar);
        izsVar.invoke(aVar);
    }
}

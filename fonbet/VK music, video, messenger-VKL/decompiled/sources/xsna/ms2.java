package xsna;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.ironsource.X3;
import com.vk.core.native_loader.NativeLib;
import com.vk.core.native_loader.NativeLibLoadException;
import com.vk.core.native_loader.NativeLibLoader;
import com.vk.core.serialize.Serializer;
import com.vk.dto.common.id.UserId;
import com.vk.medianative.MediaNative;
import com.vk.toggle.features.VoipFeatures;
import com.vk.voip.OKVoipEngine;
import com.vk.voip.api.id.CallId;
import com.vk.voip.dto.call_member.CallMemberId;
import java.io.File;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import ru.ok.android.externcalls.sdk.Conversation;
import ru.ok.android.externcalls.sdk.id.ParticipantId;
import ru.ok.android.webrtc.animoji.render.api.AnimojiDataSupplierInterface;
import ru.ok.android.webrtc.animoji.render.api.AnimojiRenderInterface;
import ru.ok.android.webrtc.animoji.render.api.AnimojiSvgResource;
import ru.ok.android.webrtc.animoji.util.AnimojiChannelBehavior;
import ru.ok.android.webrtc.participant.CallParticipant;
import xsna.or2;

/* compiled from: AnimojiRendererProvider.kt */
/* loaded from: classes7.dex */
public final class ms2 implements AnimojiDataSupplierInterface, w8i {
    public static final ParticipantId j = ParticipantId.authorized("");
    public final Context b;
    public final or2 c;
    public final Handler d = new Handler(Looper.getMainLooper());
    public final ConcurrentHashMap<CallParticipant.ParticipantId, ParticipantId> e = new ConcurrentHashMap<>();
    public final ConcurrentLinkedQueue<gzs<s3q0>> f = new ConcurrentLinkedQueue<>();
    public final io.reactivex.rxjava3.disposables.c g;
    public final bpn0 h;
    public final AnimojiChannelBehavior i;

    /* compiled from: AnimojiRendererProvider.kt */
    public static final class a implements or2.a.InterfaceC3466a {
        public final com.vk.voip.b a;

        public a(com.vk.voip.b bVar) {
            this.a = bVar;
        }

        @Override // xsna.or2.a.InterfaceC3466a
        public final UserId a() {
            String str;
            Long n;
            CallMemberId b = this.a.d().b();
            return (b == null || (str = b.b) == null || (n = arm0.n(str)) == null) ? UserId.d : new UserId(n.longValue());
        }

        @Override // xsna.or2.a.InterfaceC3466a
        public final CallId b() {
            return this.a.b();
        }

        @Override // xsna.or2.a.InterfaceC3466a
        public final xdw0 c() {
            return this.a.d().a();
        }

        @Override // xsna.or2.a.InterfaceC3466a
        public final void d(String str) {
            this.a.d().g(str);
        }

        @Override // xsna.or2.a.InterfaceC3466a
        public final boolean e() {
            return this.a.d().f();
        }
    }

    public ms2(Context context, or2 or2Var, om60 om60Var, pm60 pm60Var, io.reactivex.rxjava3.core.q qVar) {
        this.b = context;
        this.c = or2Var;
        yi2 yi2Var = new yi2(new ol(2), 1);
        qVar.getClass();
        io.reactivex.rxjava3.internal.operators.observable.b1 b1Var = new io.reactivex.rxjava3.internal.operators.observable.b1(new io.reactivex.rxjava3.internal.operators.observable.q2(qVar, yi2Var));
        asu0.a.getClass();
        io.reactivex.rxjava3.internal.operators.completable.u o = MediaNative.isCallEffectsSupported() ? null : b1Var.o(asu0.i());
        this.g = o != null ? o.subscribe(new is2(this, 0)) : null;
        this.h = new bpn0(new yg(this, 5));
        this.i = AnimojiChannelBehavior.CREATE_FIXED_ID;
    }

    @Override // ru.ok.android.webrtc.animoji.render.api.AnimojiDataSupplierInterface
    public final void addOnReadyCallback(gzs<s3q0> gzsVar) {
        gzs<s3q0> poll;
        if (MediaNative.isCallEffectsSupported()) {
            gzsVar.invoke();
            return;
        }
        ConcurrentLinkedQueue<gzs<s3q0>> concurrentLinkedQueue = this.f;
        concurrentLinkedQueue.offer(gzsVar);
        if (!MediaNative.isCallEffectsSupported() || (poll = concurrentLinkedQueue.poll()) == null) {
            return;
        }
        poll.invoke();
    }

    @Override // ru.ok.android.webrtc.animoji.render.api.AnimojiDataSupplierInterface
    /* renamed from: createRender */
    public final void mo363createRender(izs<? super AnimojiRenderInterface, s3q0> izsVar) {
        addOnReadyCallback(new g4(3, izsVar, this));
    }

    @Override // ru.ok.android.webrtc.animoji.render.api.AnimojiDataSupplierInterface
    public final boolean enabled() {
        this.c.getClass();
        return true;
    }

    @Override // ru.ok.android.webrtc.animoji.render.api.AnimojiDataSupplierInterface
    public final AnimojiChannelBehavior getBehavior() {
        return this.i;
    }

    @Override // ru.ok.android.webrtc.animoji.render.api.AnimojiDataSupplierInterface
    public final String getLibPath() {
        File file;
        Object obj;
        String str;
        VoipFeatures voipFeatures = VoipFeatures.DISABLE_NATIVE_LIB_LOADER_REFACTOR;
        voipFeatures.getClass();
        boolean a2 = com.vk.toggle.b.A.a(voipFeatures);
        boolean z = !a2;
        NativeLibLoader nativeLibLoader = NativeLibLoader.a;
        NativeLib nativeLib = NativeLib.TFLITE;
        nativeLibLoader.getClass();
        Iterator it = NativeLibLoader.f().iterator();
        while (true) {
            file = null;
            file = null;
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (new File((String) obj, nativeLib.j()).exists()) {
                break;
            }
        }
        String str2 = (String) obj;
        File file2 = str2 != null ? new File(str2, nativeLib.j()) : null;
        if (file2 != null) {
            file = file2;
        } else if (!a2) {
            long currentTimeMillis = System.currentTimeMillis();
            try {
                NativeLibLoader.a<String> aVar = NativeLibLoader.p;
                aVar.c = new bpn0(aVar.b);
                NativeLibLoader.a<Set<String>> aVar2 = NativeLibLoader.q;
                aVar2.c = new bpn0(aVar2.b);
                File b = NativeLibLoader.b(nativeLib, (Map) new io.reactivex.rxjava3.internal.operators.observable.s0(new tv50(true)).a());
                long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
                if (b == null) {
                    str = "Native library not found in " + currentTimeMillis2 + "ms: " + nativeLib.l();
                } else {
                    str = "Native library found (in " + currentTimeMillis2 + "ms) at unexpected path: " + b.getAbsolutePath();
                }
                NativeLibLoadException nativeLibLoadException = new NativeLibLoadException(str, null);
                NativeLibLoader.b bVar = NativeLibLoader.i;
                (bVar != null ? bVar : null).b(nativeLibLoadException, NativeLibLoader.f, nativeLib.l(), "path-finder");
                file = b;
            } catch (Exception e) {
                NativeLibLoadException nativeLibLoadException2 = new NativeLibLoadException("Couldn't find native library " + nativeLib.l(), e);
                NativeLibLoader.b bVar2 = NativeLibLoader.i;
                if (bVar2 == null) {
                    bVar2 = null;
                }
                bVar2.b(nativeLibLoadException2, NativeLibLoader.f, nativeLib.l(), "path-finder");
            } catch (Throwable th) {
                throw th;
            }
        }
        if (file != null) {
            return file.getAbsolutePath();
        }
        StringBuilder sb = new StringBuilder("Failed to load CallEffects TFLite: ");
        sb.append(NativeLib.TFLITE.j());
        sb.append(" not found: (forcedSearch: ");
        sb.append(z);
        sb.append(") ");
        NativeLibLoader.a.getClass();
        sb.append(j5g.g0(NativeLibLoader.f(), null, X3.j.d, X3.j.e, 0, null, 57));
        throw new IllegalStateException(sb.toString());
    }

    @Override // ru.ok.android.webrtc.animoji.render.api.AnimojiDataSupplierInterface
    public final String getModelPath() {
        return this.c.g();
    }

    @Override // ru.ok.android.webrtc.animoji.render.api.AnimojiDataSupplierInterface
    public final String getResourcePackPath() {
        return this.c.g();
    }

    @Override // ru.ok.android.webrtc.animoji.render.api.AnimojiDataSupplierInterface
    public final AnimojiSvgResource getSvg(CallParticipant.ParticipantId participantId) {
        String str;
        ParticipantId participantId2 = this.e.get(participantId);
        if (participantId2 == null || (str = participantId2.id) == null) {
            throw new IllegalArgumentException("missing participant id");
        }
        Long n = arm0.n(str);
        if (n == null) {
            throw new IllegalArgumentException("Contact participant id");
        }
        UserId userId = new UserId(n.longValue());
        Serializer.c<CallId> cVar = CallId.CREATOR;
        OKVoipEngine.b.getClass();
        Conversation z = OKVoipEngine.z();
        return new rs2(userId, CallId.a.a(z != null ? z.getConversationId() : null), new ks2(0, this, userId));
    }

    @Override // ru.ok.android.webrtc.animoji.render.api.AnimojiDataSupplierInterface
    public final void handleAnimojiChanged(CallParticipant.ParticipantId participantId) {
        String str;
        Long n;
        ParticipantId participantId2 = this.e.get(participantId);
        if (participantId2 == null || (str = participantId2.id) == null || (n = arm0.n(str)) == null) {
            return;
        }
        this.c.d(new UserId(n.longValue()));
    }

    @Override // ru.ok.android.webrtc.animoji.render.api.AnimojiDataSupplierInterface
    public final void release() {
        this.c.b();
        io.reactivex.rxjava3.disposables.c cVar = this.g;
        if (cVar != null) {
            cVar.dispose();
        }
        this.d.removeCallbacksAndMessages(null);
        this.e.clear();
    }

    @Override // ru.ok.android.webrtc.animoji.render.api.AnimojiDataSupplierInterface
    public final boolean requestResolveParticipantIdFromInternal(CallParticipant.ParticipantId participantId) {
        ConcurrentHashMap<CallParticipant.ParticipantId, ParticipantId> concurrentHashMap = this.e;
        ParticipantId participantId2 = concurrentHashMap.get(participantId);
        ParticipantId participantId3 = j;
        if (participantId2 != null) {
            return !participantId2.equals(participantId3);
        }
        concurrentHashMap.put(participantId, participantId3);
        this.d.post(new js2(0, this, participantId));
        return false;
    }
}

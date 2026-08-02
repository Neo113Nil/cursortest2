package xsna;

import android.annotation.SuppressLint;
import com.vk.dto.common.im.codec.AudioMessageCodecBitrate;
import com.vk.dto.common.im.codec.AudioMessageCodecSampleRate;
import com.vk.im.engine.models.EngineWatchdogConfig;
import com.vk.im.engine.models.a;
import com.vk.im.engine.models.b;
import com.vk.im.engine.models.c;
import com.vk.im.engine.models.e;
import com.vk.im.engine.models.sync.MaxEntryPointsConfig;
import com.vk.toggle.Features;
import com.vk.toggle.b;
import com.vk.toggle.features.ComFeatures;
import com.vk.toggle.features.ImFeatures;
import com.vk.toggle.features.SoccomFeatures;
import com.vk.toggle.features.VasFeatures;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.WeakHashMap;
import xsna.mq4;

/* compiled from: VkAppExperiments.kt */
@SuppressLint({"CheckResult"})
/* loaded from: classes11.dex */
public final class cau0 implements com.vk.im.engine.models.c {
    public final h360 b;
    public final Set<c.b> c = Collections.newSetFromMap(new WeakHashMap());
    public final v3w<com.vk.im.engine.models.d> d;
    public final v3w<com.vk.im.engine.models.d> e;
    public final v3w<com.vk.im.engine.models.d> f;
    public final v3w<EngineWatchdogConfig> g;
    public final v3w<com.vk.im.engine.models.b> h;
    public final v3w<yn10> i;
    public final v3w<il2> j;
    public final v3w<com.vk.im.engine.models.a> k;
    public final v3w<vbw> l;
    public final v3w<MaxEntryPointsConfig> m;
    public final v3w<com.vk.im.engine.models.f> n;
    public final bpn0 o;
    public final v3w<com.vk.im.engine.models.e> p;

    public cau0(h360 h360Var) {
        this.b = h360Var;
        int i = 14;
        lnf lnfVar = new lnf(i);
        mw90 mw90Var = mw90.a;
        this.d = new v3w<>(lnfVar, new y9u0(1, mw90Var, mw90.class, "parse", "parse(Ljava/lang/String;)Lcom/vk/im/engine/models/PerformanceMetricsConfig;", 0));
        int i2 = 12;
        this.e = new v3w<>(new s12(i2), new z9u0(1, mw90Var, mw90.class, "parse", "parse(Ljava/lang/String;)Lcom/vk/im/engine/models/PerformanceMetricsConfig;", 0));
        this.f = new v3w<>(new tog(i2), new aau0(1, mw90Var, mw90.class, "parse", "parse(Ljava/lang/String;)Lcom/vk/im/engine/models/PerformanceMetricsConfig;", 0));
        this.g = new v3w<>(new j55(17), new w9u0(1, xlp.a, xlp.class, "parse", "parse(Ljava/lang/String;)Lcom/vk/im/engine/models/EngineWatchdogConfig;", 0));
        this.h = new v3w<>(new k55(13), new v9u0(1, com.vk.im.engine.models.b.c, b.a.class, "parse", "parse(Ljava/lang/String;)Lcom/vk/im/engine/models/ImDatabaseStatConfig;", 0));
        this.i = new v3w<>(new u94(13), new h260(1));
        this.j = new v3w<>(new w94(19), new u9u0());
        this.k = new v3w<>(new z58(i), new z0v(3));
        this.l = new v3w<>(new ug9(13), new b1v(5));
        this.m = new v3w<>(new qn6(9), new x9u0(1, MaxEntryPointsConfig.d, MaxEntryPointsConfig.a.class, "parse", "parse(Ljava/lang/String;)Lcom/vk/im/engine/models/sync/MaxEntryPointsConfig;", 0));
        this.n = new v3w<>(new t0f(i), new fml(2));
        io.reactivex.rxjava3.internal.operators.observable.m1 a0 = com.vk.toggle.b.A.k().a.a0(asu0.a.d());
        bwt bwtVar = new bwt(new xq40(1, this, cau0.class, "onToggleEvent", "onToggleEvent(Lcom/vk/toggle/internal/TogglesEvent;)V", 0), 1);
        int i3 = kwg0.a;
        a0.subscribe(bwtVar, new ck40(new nu2("toggles observable error", 2), 3));
        this.o = new bpn0(new b63(16));
        this.p = new v3w<>(new r12(15), new bau0(1, com.vk.im.engine.models.e.c, e.a.class, "parse", "parse(Ljava/lang/String;)Lcom/vk/im/engine/models/StallsReporterConfig;", 0));
    }

    @Override // com.vk.im.engine.models.c
    public final boolean A() {
        ImFeatures imFeatures = ImFeatures.MSG_VIDEO_FWD_ASR_DISABLE;
        imFeatures.getClass();
        return com.vk.toggle.b.A.a(imFeatures);
    }

    @Override // com.vk.im.engine.models.c
    public final EngineWatchdogConfig B() {
        EngineWatchdogConfig a = this.g.a();
        if (a != null) {
            return a;
        }
        EngineWatchdogConfig engineWatchdogConfig = EngineWatchdogConfig.b;
        return EngineWatchdogConfig.b;
    }

    @Override // com.vk.im.engine.models.c
    public final com.vk.im.engine.models.a C() {
        com.vk.im.engine.models.a a = this.k.a();
        if (a != null) {
            return a;
        }
        com.vk.im.engine.models.a.b.getClass();
        return a.C1121a.a();
    }

    @Override // com.vk.im.engine.models.c
    public final boolean D() {
        ImFeatures imFeatures = ImFeatures.ANTISPAM_MODAL;
        imFeatures.getClass();
        return com.vk.toggle.b.A.a(imFeatures);
    }

    @Override // com.vk.im.engine.models.c
    public final boolean E() {
        ImFeatures imFeatures = ImFeatures.FEATURE_DIFF_SYNC_WARMUP_ARCHIVED_REACTIONS;
        imFeatures.getClass();
        return com.vk.toggle.b.A.a(imFeatures);
    }

    @Override // com.vk.im.engine.models.c
    public final boolean F() {
        ImFeatures imFeatures = ImFeatures.FIX_GET_CONVERSATION_LOOP;
        imFeatures.getClass();
        return com.vk.toggle.b.A.a(imFeatures);
    }

    @Override // com.vk.im.engine.models.c
    public final boolean G() {
        ComFeatures comFeatures = ComFeatures.COM_DONUT_PRICE_DISCOUNT;
        comFeatures.getClass();
        return com.vk.toggle.b.A.a(comFeatures);
    }

    @Override // com.vk.im.engine.models.c
    public final boolean H() {
        ImFeatures imFeatures = ImFeatures.CHAT_STORY_MENTION_REPOST;
        imFeatures.getClass();
        return com.vk.toggle.b.A.a(imFeatures);
    }

    public final MaxEntryPointsConfig I() {
        MaxEntryPointsConfig a = this.m.a();
        if (a != null) {
            return a;
        }
        MaxEntryPointsConfig.d.getClass();
        return MaxEntryPointsConfig.e;
    }

    public final boolean J() {
        ImFeatures imFeatures = ImFeatures.IM_DROP_CACHE_WITHOUT_ENGINE_RESTART;
        imFeatures.getClass();
        return com.vk.toggle.b.A.a(imFeatures);
    }

    public final boolean K() {
        VasFeatures vasFeatures = VasFeatures.VAS_REACTION_TO_GIFT;
        vasFeatures.getClass();
        return com.vk.toggle.b.A.a(vasFeatures);
    }

    public final mq4 a() {
        List<String> f;
        mq4 mq4Var = mq4.c;
        mq4 a = mq4.a.a();
        b.d i = com.vk.toggle.b.A.i(Features.Type.FEATURE_IM_AUDIO_MSG_PARAMS);
        if (!p1p0.a(i)) {
            return a;
        }
        int[] iArr = null;
        if (i != null && (f = i.f()) != null) {
            List<String> list = f;
            ArrayList arrayList = new ArrayList(c5g.u(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(Integer.valueOf(Integer.parseInt((String) it.next())));
            }
            iArr = j5g.N0(arrayList);
        }
        if (iArr == null || iArr.length != 2) {
            return a;
        }
        AudioMessageCodecBitrate.a aVar = AudioMessageCodecBitrate.Companion;
        int i2 = iArr[0];
        aVar.getClass();
        AudioMessageCodecBitrate a2 = AudioMessageCodecBitrate.a.a(i2);
        AudioMessageCodecSampleRate.a aVar2 = AudioMessageCodecSampleRate.Companion;
        int i3 = iArr[1];
        aVar2.getClass();
        AudioMessageCodecSampleRate a3 = AudioMessageCodecSampleRate.a.a(i3);
        return (a2 == null || a3 == null) ? a : new mq4(a2, a3);
    }

    public final yn10 b() {
        yn10 a = this.i.a();
        return a == null ? yn10.c : a;
    }

    @Override // com.vk.im.engine.models.c
    public final w3w c() {
        h360 h360Var = this.b;
        return new w3w(h360Var.c().d, h360Var.c().a, h360Var.c().e, h360Var.c().f, h360Var.c().g);
    }

    @Override // com.vk.im.engine.models.c
    public final com.vk.im.engine.models.e d() {
        com.vk.im.engine.models.e a = this.p.a();
        if (a != null) {
            return a;
        }
        com.vk.im.engine.models.e.c.getClass();
        return com.vk.im.engine.models.e.d;
    }

    @Override // com.vk.im.engine.models.c
    public final boolean e() {
        ImFeatures imFeatures = ImFeatures.FEATURE_DIFF_SYNC_WARMUP_ALL;
        imFeatures.getClass();
        return com.vk.toggle.b.A.a(imFeatures);
    }

    @Override // com.vk.im.engine.models.c
    public final boolean f() {
        ImFeatures imFeatures = ImFeatures.CONTACTS_BANNER_PRIORITY;
        imFeatures.getClass();
        return com.vk.toggle.b.A.a(imFeatures);
    }

    @Override // com.vk.im.engine.models.c
    public final boolean g() {
        Features.Type type = Features.Type.FEATURE_IM_BAN_WRITING_TO_CHAT;
        type.getClass();
        return com.vk.toggle.b.A.a(type);
    }

    @Override // com.vk.im.engine.models.c
    public final boolean h() {
        ImFeatures imFeatures = ImFeatures.SHOW_VISUAL_MESSAGE_DEBUG_INFO;
        imFeatures.getClass();
        return com.vk.toggle.b.A.a(imFeatures);
    }

    @Override // com.vk.im.engine.models.c
    public final boolean i() {
        return ((Boolean) this.o.getValue()).booleanValue();
    }

    @Override // com.vk.im.engine.models.c
    public final vbw j() {
        return this.l.a();
    }

    @Override // com.vk.im.engine.models.c
    public final boolean k() {
        ImFeatures imFeatures = ImFeatures.ERROR_COMMANDS_FAILFAST;
        imFeatures.getClass();
        return com.vk.toggle.b.A.a(imFeatures);
    }

    @Override // com.vk.im.engine.models.c
    public final boolean l() {
        Features.Type type = Features.Type.FEATURE_IM_KEYBOARD_ANIMATION;
        type.getClass();
        return com.vk.toggle.b.A.a(type);
    }

    @Override // com.vk.im.engine.models.c
    public final boolean m() {
        ImFeatures imFeatures = ImFeatures.CLIPS_MSG_PAGINATION;
        imFeatures.getClass();
        return com.vk.toggle.b.A.a(imFeatures);
    }

    @Override // com.vk.im.engine.models.c
    public final boolean n() {
        ImFeatures imFeatures = ImFeatures.CHANNELS_IN_ALL_FOLDER;
        imFeatures.getClass();
        return com.vk.toggle.b.A.a(imFeatures);
    }

    @Override // com.vk.im.engine.models.c
    public final boolean o() {
        ImFeatures imFeatures = ImFeatures.BUSINESS_FOLDER;
        imFeatures.getClass();
        return com.vk.toggle.b.A.a(imFeatures);
    }

    @Override // com.vk.im.engine.models.c
    public final boolean p() {
        Features.Type type = Features.Type.FEATURE_IM_DONT_REMOVE_CHAT_ON_CLEAR_HISTORY;
        type.getClass();
        return com.vk.toggle.b.A.a(type);
    }

    @Override // com.vk.im.engine.models.c
    public final boolean q() {
        return com.vk.toggle.d.h().d;
    }

    @Override // com.vk.im.engine.models.c
    public final boolean r() {
        SoccomFeatures soccomFeatures = SoccomFeatures.MESSENGER_CLIP_SNIPPET;
        soccomFeatures.getClass();
        return com.vk.toggle.b.A.a(soccomFeatures);
    }

    @Override // com.vk.im.engine.models.c
    public final boolean s() {
        Features.Type type = Features.Type.FEATURE_IM_RESTRICTED_REFETCH_OFF;
        type.getClass();
        return com.vk.toggle.b.A.a(type);
    }

    @Override // com.vk.im.engine.models.c
    public final void t(c.b bVar) {
        this.c.add(bVar);
    }

    @Override // com.vk.im.engine.models.c
    public final boolean u() {
        ImFeatures imFeatures = ImFeatures.IM_CMD_SHUTDOWN_CANCEL;
        imFeatures.getClass();
        return com.vk.toggle.b.A.a(imFeatures);
    }

    @Override // com.vk.im.engine.models.c
    public final boolean v() {
        Features.Type type = Features.Type.FEATURE_CORE_CLEAR_DEVICE_TOKEN;
        type.getClass();
        return com.vk.toggle.b.A.a(type);
    }

    @Override // com.vk.im.engine.models.c
    public final boolean w() {
        ImFeatures imFeatures = ImFeatures.FOLDER_NOT_FOUND_FIX;
        imFeatures.getClass();
        return com.vk.toggle.b.A.a(imFeatures);
    }

    @Override // com.vk.im.engine.models.c
    public final boolean x() {
        Features.Type type = Features.Type.FEATURE_IM_RESTORE_CHAT;
        type.getClass();
        return com.vk.toggle.b.A.a(type);
    }

    @Override // com.vk.im.engine.models.c
    public final il2 y() {
        il2 a = this.j.a();
        return a == null ? new il2((Object) null) : a;
    }

    @Override // com.vk.im.engine.models.c
    public final boolean z() {
        ImFeatures imFeatures = ImFeatures.FS_TRANSFER_RECOM_PAYLOAD;
        imFeatures.getClass();
        return com.vk.toggle.b.A.a(imFeatures);
    }
}

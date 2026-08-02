package xsna;

import android.content.Context;
import com.vk.clips.config.viewers.api.experiments.models.ClipsAutoScrollConfig;
import com.vk.clips.config.viewers.api.experiments.models.ClipsRtmpLivePlaybackSettings;
import com.vk.clips.sdk.shared.viewer.experiments.models.ClipsBannerCompanionConfig;
import com.vk.clips.sdk.shared.viewer.experiments.models.ClipsButtonToVideoConfig;
import com.vk.clips.sdk.shared.viewer.experiments.models.ClipsFeedRecyclerPoolSettings;
import com.vk.clips.sdk.shared.viewer.experiments.models.ClipsMarketAdHeaderClickConfig;
import com.vk.clips.sdk.shared.viewer.experiments.models.ClipsMarketItemsShowTimeConfig;
import com.vk.clips.sdk.shared.viewer.experiments.models.TabsPositionConfig;
import com.vk.toggle.data.ClipButtonToLongVideoConfig;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.PropertyReference1Impl;

/* compiled from: ClipsViewersExperimentsImpl.kt */
/* loaded from: classes.dex */
public final class dpf implements zof {
    public static final /* synthetic */ qcy<Object>[] m;
    public final Context b;
    public final b25 c;
    public final kuq d;
    public final bpn0 e;
    public final bpn0 f;
    public final bpn0 g;
    public final bpn0 h;
    public final bpn0 i;
    public final boolean j;
    public final fpf k;
    public final boolean l;

    /* compiled from: ClipsViewersExperimentsImpl.kt */
    /* loaded from: classes16.dex */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ClipButtonToLongVideoConfig.Variant.values().length];
            try {
                iArr[ClipButtonToLongVideoConfig.Variant.BUTTON_RECOLOR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ClipButtonToLongVideoConfig.Variant.COMPACT_CAROUSEL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ClipButtonToLongVideoConfig.Variant.EXPANDED_CAROUSEL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ClipButtonToLongVideoConfig.Variant.NONE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    static {
        PropertyReference1Impl propertyReference1Impl = new PropertyReference1Impl(dpf.class, "tabsPositionConfig", "getTabsPositionConfig()Lcom/vk/clips/sdk/shared/viewer/experiments/models/TabsPositionConfig;", 0);
        fpf0.a.getClass();
        m = new qcy[]{propertyReference1Impl};
    }

    public dpf(Context context, b25 b25Var, izs izsVar) {
        this.b = context;
        this.c = b25Var;
        gpf gpfVar = new gpf(this);
        epf epfVar = new epf(this);
        this.d = new kuq(gpfVar, epfVar, izsVar);
        this.e = new bpn0(new apf(this, 0));
        this.f = new bpn0(new bpf(this, 0));
        this.g = new bpn0(new cpf(this, 0));
        this.h = new bpn0(new s0f(this, 1));
        this.i = new bpn0(new an(this, 2));
        this.j = true;
        this.k = new fpf(epfVar, gpfVar);
        qof i0 = i0();
        this.l = i0.s.getValue(i0, qof.S[19]).booleanValue();
    }

    @Override // xsna.zof
    public final gaf A() {
        qof i0 = i0();
        return i0.O.getValue(i0, qof.S[41]);
    }

    @Override // xsna.zof
    public final boolean B() {
        qof i0 = i0();
        return i0.H.getValue(i0, qof.S[34]).booleanValue();
    }

    @Override // xsna.zof
    public final ClipsAutoScrollConfig C() {
        qof i0 = i0();
        return i0.Q.getValue(i0, qof.S[43]);
    }

    @Override // xsna.zof
    public final boolean D() {
        qof i0 = i0();
        return i0.P.getValue(i0, qof.S[42]).booleanValue();
    }

    @Override // xsna.yof
    public final ClipsBannerCompanionConfig E() {
        qof i0 = i0();
        return i0.u.getValue(i0, qof.S[21]);
    }

    @Override // xsna.zof
    public final boolean F() {
        qof i0 = i0();
        return i0.D.getValue(i0, qof.S[30]).booleanValue();
    }

    @Override // xsna.zof
    public final boolean G() {
        return this.l;
    }

    @Override // xsna.zof
    public final f8e H() {
        qof i0 = i0();
        return i0.m.getValue(i0, qof.S[13]);
    }

    @Override // xsna.zof
    public final haf I() {
        qof i0 = i0();
        return i0.L.getValue(i0, qof.S[38]);
    }

    @Override // xsna.yof
    public final maf J() {
        qof i0 = i0();
        return i0.x.getValue(i0, qof.S[24]);
    }

    @Override // xsna.zof
    public final boolean K() {
        return ((sof) this.f.getValue()).a();
    }

    @Override // xsna.yof
    public final mle L() {
        qof i0 = i0();
        return i0.z.getValue(i0, qof.S[26]);
    }

    @Override // xsna.zof
    public final h4f M() {
        qof i0 = i0();
        return i0.q.getValue(i0, qof.S[17]);
    }

    @Override // xsna.yof
    public final a6e N() {
        pof pofVar = (pof) this.e.getValue();
        return pofVar.c.getValue(pofVar, pof.f[2]);
    }

    @Override // xsna.yof
    public final y6e O() {
        qof i0 = i0();
        return i0.f.getValue(i0, qof.S[5]);
    }

    @Override // xsna.yof
    public final ClipsButtonToVideoConfig P() {
        ClipsButtonToVideoConfig.Variant variant;
        eqy<bek0> eqyVar = com.vk.toggle.d.a;
        ClipButtonToLongVideoConfig b = com.vk.toggle.d.i0.b();
        if (b == null) {
            ClipButtonToLongVideoConfig.b.getClass();
            b = ClipButtonToLongVideoConfig.c;
        }
        int i = a.$EnumSwitchMapping$0[b.a.ordinal()];
        if (i == 1) {
            variant = ClipsButtonToVideoConfig.Variant.BUTTON_RECOLOR;
        } else if (i == 2) {
            variant = ClipsButtonToVideoConfig.Variant.COMPACT_CAROUSEL;
        } else if (i == 3) {
            variant = ClipsButtonToVideoConfig.Variant.EXPANDED_CAROUSEL;
        } else {
            if (i != 4) {
                throw new NoWhenBranchMatchedException();
            }
            variant = ClipsButtonToVideoConfig.Variant.NONE;
        }
        return new ClipsButtonToVideoConfig(variant);
    }

    @Override // xsna.yof
    public final boolean Q() {
        qof i0 = i0();
        return i0.j.getValue(i0, qof.S[9]).booleanValue();
    }

    @Override // xsna.zof
    public final boolean R() {
        qof i0 = i0();
        return i0.K.getValue(i0, qof.S[37]).booleanValue();
    }

    @Override // xsna.zof
    public final boolean S() {
        pof pofVar = (pof) this.e.getValue();
        return pofVar.b.getValue(pofVar, pof.f[1]).booleanValue();
    }

    @Override // xsna.zof
    public final zme T() {
        return ((sof) this.f.getValue()).d();
    }

    @Override // xsna.zof
    public final boolean U() {
        qof i0 = i0();
        return i0.o.getValue(i0, qof.S[15]).booleanValue();
    }

    @Override // xsna.zof
    public final oje V() {
        qof i0 = i0();
        return i0.h.getValue(i0, qof.S[7]);
    }

    @Override // xsna.yof
    public final lle W() {
        qof i0 = i0();
        return i0.y.getValue(i0, qof.S[25]);
    }

    @Override // xsna.zof
    public final boolean X() {
        qof i0 = i0();
        return i0.I.getValue(i0, qof.S[35]).booleanValue();
    }

    @Override // xsna.zof
    public final boolean Y() {
        qof i0 = i0();
        return i0.a.getValue(i0, qof.S[0]).booleanValue();
    }

    @Override // xsna.yof
    public final boolean Z() {
        qof i0 = i0();
        return i0.k.getValue(i0, qof.S[10]).booleanValue();
    }

    @Override // xsna.zof
    public final boolean a() {
        return this.j;
    }

    @Override // xsna.zof
    public final yuf a0() {
        return ((sof) this.f.getValue()).c();
    }

    @Override // xsna.zof
    public final boolean b() {
        qof i0 = i0();
        return i0.C.getValue(i0, qof.S[29]).booleanValue();
    }

    @Override // xsna.yof
    public final ClipsMarketAdHeaderClickConfig b0() {
        qof i0 = i0();
        return i0.R.getValue(i0, qof.S[44]);
    }

    @Override // xsna.yof
    public final boolean c() {
        pof pofVar = (pof) this.e.getValue();
        return pofVar.a.getValue(pofVar, pof.f[0]).booleanValue();
    }

    @Override // xsna.zof
    public final boolean c0() {
        qof i0 = i0();
        return i0.J.getValue(i0, qof.S[36]).booleanValue();
    }

    @Override // xsna.zof
    public final TabsPositionConfig d() {
        return this.k.getValue(this, m[0]);
    }

    @Override // xsna.zof
    public final boolean d0() {
        return ((rof) this.h.getValue()).a();
    }

    @Override // xsna.yof
    public final f2e e() {
        i0().getClass();
        return f2e.a;
    }

    @Override // xsna.yof
    public final lgd e0() {
        qof i0 = i0();
        return i0.c.getValue(i0, qof.S[2]);
    }

    @Override // xsna.zof
    public final boolean f() {
        return ((sof) this.f.getValue()).b();
    }

    @Override // xsna.zof
    public final xof f0() {
        qof i0 = i0();
        return i0.w.getValue(i0, qof.S[23]);
    }

    @Override // xsna.yof
    public final boolean g() {
        qof i0 = i0();
        return i0.F.getValue(i0, qof.S[32]).booleanValue();
    }

    @Override // xsna.yof
    public final b6e g0() {
        qof i0 = i0();
        return i0.e.getValue(i0, qof.S[4]);
    }

    @Override // xsna.zof
    public final boolean h() {
        return ((rof) this.h.getValue()).b();
    }

    @Override // xsna.yof
    public final ClipsFeedRecyclerPoolSettings h0() {
        qof i0 = i0();
        return i0.i.getValue(i0, qof.S[8]);
    }

    @Override // xsna.zof
    public final ClipsRtmpLivePlaybackSettings i() {
        return ((tof) this.i.getValue()).a();
    }

    public final qof i0() {
        return (qof) this.g.getValue();
    }

    @Override // xsna.zof
    public final boolean j() {
        qof i0 = i0();
        return i0.b.getValue(i0, qof.S[1]).booleanValue();
    }

    @Override // xsna.zof
    public final boolean k() {
        return this.j;
    }

    @Override // xsna.zof
    public final vqd l() {
        pof pofVar = (pof) this.e.getValue();
        return pofVar.d.getValue(pofVar, pof.f[3]);
    }

    @Override // xsna.yof
    public final ClipsBannerCompanionConfig m() {
        qof i0 = i0();
        return i0.t.getValue(i0, qof.S[20]);
    }

    @Override // xsna.yof
    public final ClipsMarketItemsShowTimeConfig n() {
        qof i0 = i0();
        return i0.l.getValue(i0, qof.S[12]);
    }

    @Override // xsna.yof
    public final boolean o() {
        qof i0 = i0();
        return i0.r.getValue(i0, qof.S[18]).booleanValue();
    }

    @Override // xsna.yof
    public final f0f p() {
        qof i0 = i0();
        return i0.B.getValue(i0, qof.S[28]);
    }

    @Override // xsna.zof
    public final boolean q() {
        qof i0 = i0();
        return i0.n.getValue(i0, qof.S[14]).booleanValue();
    }

    @Override // xsna.zof
    public final tke r() {
        qof i0 = i0();
        return i0.d.getValue(i0, qof.S[3]);
    }

    @Override // xsna.zof
    public final iaf s() {
        qof i0 = i0();
        return i0.M.getValue(i0, qof.S[39]);
    }

    @Override // xsna.yof
    public final wme t() {
        qof i0 = i0();
        return i0.A.getValue(i0, qof.S[27]);
    }

    @Override // xsna.zof
    public final boolean u() {
        qof i0 = i0();
        return i0.G.getValue(i0, qof.S[33]).booleanValue();
    }

    @Override // xsna.yof
    public final boolean v() {
        qof i0 = i0();
        return i0.E.getValue(i0, qof.S[31]).booleanValue();
    }

    @Override // xsna.zof
    public final boolean w() {
        qof i0 = i0();
        return i0.N.getValue(i0, qof.S[40]).booleanValue();
    }

    @Override // xsna.zof
    public final boolean x() {
        qof i0 = i0();
        return i0.p.getValue(i0, qof.S[16]).booleanValue();
    }

    @Override // xsna.yof
    public final boolean y() {
        qof i0 = i0();
        return i0.g.getValue(i0, qof.S[6]).booleanValue();
    }

    @Override // xsna.yof
    public final boolean z() {
        qof i0 = i0();
        return i0.v.getValue(i0, qof.S[22]).booleanValue();
    }
}

package xsna;

import androidx.compose.foundation.layout.a;
import androidx.compose.runtime.a;
import androidx.lifecycle.Lifecycle;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.compose.component.defaults.ButtonAppearance;
import com.vk.core.compose.component.group.header.GroupHeader$Right;
import com.vk.core.compose.component.group.header.a;
import com.vk.core.compose.component.group.header.b;
import com.vk.core.compose.component.group.header.f;
import com.vk.donut.video.model.domain.action.DonutVideoAction;
import com.vkontakte.android.R;
import com.vungle.ads.internal.protos.Sdk;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import kotlin.LazyThreadSafetyMode;
import kotlin.collections.EmptySet;
import kotlin.collections.builders.SetBuilder;
import kotlin.jvm.internal.FunctionReferenceImpl;
import one.video.exo.offline.DownloadInfo;
import one.video.exo.offline.OfflineRequirement;
import xsna.cco;
import xsna.dai;
import xsna.q630;
import xsna.zao;

/* compiled from: DownloadedSliderView.kt */
/* loaded from: classes.dex */
public final class mbo extends m2a<nbo, zao, cbo> {
    public final x4o b;
    public final mm80 c;
    public final Object d;
    public final ebo e;

    /* compiled from: DownloadedSliderView.kt */
    /* loaded from: classes16.dex */
    public static final class a implements izs<DonutVideoAction, s3q0> {
        public final /* synthetic */ izs<zao, s3q0> b;
        public final /* synthetic */ nbo c;

        /* JADX WARN: Multi-variable type inference failed */
        public a(izs<? super zao, s3q0> izsVar, nbo nboVar) {
            this.b = izsVar;
            this.c = nboVar;
        }

        @Override // xsna.izs
        public final s3q0 invoke(DonutVideoAction donutVideoAction) {
            this.b.invoke(new zao.b(this.c.b, donutVideoAction));
            return s3q0.a;
        }
    }

    /* compiled from: DownloadedSliderView.kt */
    /* loaded from: classes16.dex */
    public static final class b implements izs<DonutVideoAction, s3q0> {
        public final /* synthetic */ izs<zao, s3q0> b;
        public final /* synthetic */ nbo c;

        /* JADX WARN: Multi-variable type inference failed */
        public b(izs<? super zao, s3q0> izsVar, nbo nboVar) {
            this.b = izsVar;
            this.c = nboVar;
        }

        @Override // xsna.izs
        public final s3q0 invoke(DonutVideoAction donutVideoAction) {
            this.b.invoke(new zao.a(this.c.b, donutVideoAction));
            return s3q0.a;
        }
    }

    /* compiled from: DownloadedSliderView.kt */
    /* loaded from: classes16.dex */
    public static final class c implements gzs<Set<? extends OfflineRequirement>> {
        public final /* synthetic */ mm80 b;

        public c(mm80 mm80Var) {
            this.b = mm80Var;
        }

        @Override // xsna.gzs
        public final Set<? extends OfflineRequirement> invoke() {
            SetBuilder a;
            mm80 mm80Var = this.b;
            synchronized (mm80Var) {
                one.video.exo.offline.c e = mm80Var.e();
                OfflineRequirement.a aVar = OfflineRequirement.Companion;
                int i = e.c.m;
                aVar.getClass();
                a = OfflineRequirement.a.a(i);
            }
            return a;
        }
    }

    /* compiled from: DownloadedSliderView.kt */
    /* loaded from: classes16.dex */
    public static final class d implements gzs<Set<? extends OfflineRequirement>> {
        public static final d b = new d();

        @Override // xsna.gzs
        public final Set<? extends OfflineRequirement> invoke() {
            return EmptySet.b;
        }
    }

    /* compiled from: DownloadedSliderView.kt */
    /* loaded from: classes16.dex */
    public static final class e implements gzs<s3q0> {
        public final /* synthetic */ izs<zao, s3q0> b;
        public final /* synthetic */ nbo c;
        public final /* synthetic */ cco d;
        public final /* synthetic */ bpf0<tny> e;

        /* JADX WARN: Multi-variable type inference failed */
        public e(izs<? super zao, s3q0> izsVar, nbo nboVar, cco ccoVar, bpf0<tny> bpf0Var) {
            this.b = izsVar;
            this.c = nboVar;
            this.d = ccoVar;
            this.e = bpf0Var;
        }

        @Override // xsna.gzs
        public final s3q0 invoke() {
            DownloadInfo.State state;
            boolean z;
            String str = this.c.b;
            cco ccoVar = this.d;
            String str2 = ccoVar.a;
            DownloadInfo.State state2 = ccoVar.o;
            if (state2 == DownloadInfo.State.STATE_COMPLETED) {
                state = state2;
                z = true;
            } else {
                state = state2;
                z = false;
            }
            this.b.invoke(new zao.f(str, str2, z, state == DownloadInfo.State.STATE_DOWNLOADING, p490.C(this.e.a)));
            return s3q0.a;
        }
    }

    /* compiled from: DownloadedSliderView.kt */
    /* loaded from: classes16.dex */
    public static final class f implements izs<tny, s3q0> {
        public final /* synthetic */ bpf0<tny> b;

        public f(bpf0<tny> bpf0Var) {
            this.b = bpf0Var;
        }

        /* JADX WARN: Type inference failed for: r2v1, types: [T, xsna.tny] */
        @Override // xsna.izs
        public final s3q0 invoke(tny tnyVar) {
            this.b.a = tnyVar;
            return s3q0.a;
        }
    }

    /* compiled from: DownloadedSliderView.kt */
    /* loaded from: classes16.dex */
    public static final /* synthetic */ class g extends FunctionReferenceImpl implements gzs<Long> {
        @Override // xsna.gzs
        public final Long invoke() {
            return Long.valueOf(qni0.a());
        }
    }

    /* compiled from: DownloadedSliderView.kt */
    /* loaded from: classes16.dex */
    public static final class h implements izs<s2u0, s3q0> {
        public final /* synthetic */ izs<zao, s3q0> b;
        public final /* synthetic */ nbo c;
        public final /* synthetic */ cco d;

        /* JADX WARN: Multi-variable type inference failed */
        public h(izs<? super zao, s3q0> izsVar, nbo nboVar, cco ccoVar) {
            this.b = izsVar;
            this.c = nboVar;
            this.d = ccoVar;
        }

        @Override // xsna.izs
        public final s3q0 invoke(s2u0 s2u0Var) {
            s2u0 s2u0Var2 = s2u0Var;
            this.b.invoke(new zao.e(this.c.b, this.d.a, s2u0Var2.a, s2u0Var2.b));
            return s3q0.a;
        }
    }

    /* compiled from: LazyDsl.kt */
    /* loaded from: classes16.dex */
    public static final class i implements izs<Integer, Object> {
        public final /* synthetic */ List b;

        public i(ArrayList arrayList) {
            this.b = arrayList;
        }

        @Override // xsna.izs
        public final Object invoke(Integer num) {
            this.b.get(num.intValue());
            return null;
        }
    }

    /* compiled from: LazyDsl.kt */
    /* loaded from: classes16.dex */
    public static final class j implements zzs<ksy, Integer, androidx.compose.runtime.a, Integer, s3q0> {
        public final /* synthetic */ List b;
        public final /* synthetic */ izs c;
        public final /* synthetic */ nbo d;
        public final /* synthetic */ mbo e;

        public j(ArrayList arrayList, izs izsVar, nbo nboVar, mbo mboVar) {
            this.b = arrayList;
            this.c = izsVar;
            this.d = nboVar;
            this.e = mboVar;
        }

        /* JADX WARN: Type inference failed for: r1v23, types: [java.lang.Object, kotlin.Lazy] */
        /* JADX WARN: Type inference failed for: r1v27, types: [java.lang.Object, kotlin.Lazy] */
        /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Object, kotlin.Lazy] */
        @Override // xsna.zzs
        public final s3q0 invoke(ksy ksyVar, Integer num, androidx.compose.runtime.a aVar, Integer num2) {
            int i;
            ksy ksyVar2 = ksyVar;
            int intValue = num.intValue();
            androidx.compose.runtime.a aVar2 = aVar;
            int intValue2 = num2.intValue();
            if ((intValue2 & 6) == 0) {
                i = (aVar2.J(ksyVar2) ? 4 : 2) | intValue2;
            } else {
                i = intValue2;
            }
            if ((intValue2 & 48) == 0) {
                i |= aVar2.o(intValue) ? 32 : 16;
            }
            if (aVar2.t(i & 1, (i & 147) != 146)) {
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(2039820996, i, -1, "androidx.compose.foundation.lazy.itemsIndexed.<anonymous> (LazyDsl.kt:214)");
                }
                cco ccoVar = (cco) this.b.get(intValue);
                aVar2.K(115434368);
                cco.b bVar = ccoVar.j;
                gzs gzsVar = null;
                dai daiVar = bVar != null ? (dai.d) bVar.b.getValue() : null;
                Object obj = a.C0011a.a;
                nbo nboVar = this.d;
                izs izsVar = this.c;
                if (daiVar == null) {
                    aVar2.K(115388827);
                } else {
                    aVar2.K(1943384870);
                    boolean J = aVar2.J(izsVar) | aVar2.J(nboVar);
                    Object x = aVar2.x();
                    if (J || x == obj) {
                        x = new a(izsVar, nboVar);
                        aVar2.R(x);
                    }
                    daiVar.c((izs) x, aVar2, 0);
                }
                aVar2.j();
                cco.a aVar3 = ccoVar.k;
                dai.d dVar = aVar3 != null ? (dai.d) aVar3.b.getValue() : null;
                if (dVar == null) {
                    aVar2.K(115587258);
                } else {
                    aVar2.K(1943391271);
                    boolean J2 = aVar2.J(izsVar) | aVar2.J(nboVar);
                    Object x2 = aVar2.x();
                    if (J2 || x2 == obj) {
                        x2 = new b(izsVar, nboVar);
                        aVar2.R(x2);
                    }
                    dVar.c((izs) x2, aVar2, 0);
                }
                aVar2.j();
                Object x3 = aVar2.x();
                if (x3 == obj) {
                    x3 = new bpf0();
                    aVar2.R(x3);
                }
                bpf0 bpf0Var = (bpf0) x3;
                mbo mboVar = this.e;
                mm80 mm80Var = mboVar.c;
                if (mm80Var == null) {
                    aVar2.K(115973146);
                } else {
                    aVar2.K(115973147);
                    boolean y = aVar2.y(mm80Var);
                    Object x4 = aVar2.x();
                    if (y || x4 == obj) {
                        x4 = new c(mm80Var);
                        aVar2.R(x4);
                    }
                    gzsVar = (gzs) x4;
                }
                aVar2.j();
                if (gzsVar == null) {
                    aVar2.K(116023677);
                    Object x5 = aVar2.x();
                    if (x5 == obj) {
                        x5 = d.b;
                        aVar2.R(x5);
                    }
                    gzsVar = (gzs) x5;
                } else {
                    aVar2.K(1943402993);
                }
                aVar2.j();
                boolean J3 = aVar2.J(izsVar) | aVar2.J(nboVar) | aVar2.J(ccoVar) | aVar2.y(bpf0Var);
                Object x6 = aVar2.x();
                if (J3 || x6 == obj) {
                    x6 = new e(izsVar, nboVar, ccoVar, bpf0Var);
                    aVar2.R(x6);
                }
                gzs gzsVar2 = (gzs) x6;
                float f = ccoVar.b.a;
                q630 q630Var = q630.a.a;
                q630 v = txj0.v(q630Var, f);
                if (((Boolean) mboVar.d.getValue()).booleanValue()) {
                    aVar2.K(116981174);
                    boolean y2 = aVar2.y(bpf0Var);
                    Object x7 = aVar2.x();
                    if (y2 || x7 == obj) {
                        x7 = new f(bpf0Var);
                        aVar2.R(x7);
                    }
                    q630Var = egi.o(q630Var, (izs) x7);
                    aVar2.j();
                } else {
                    aVar2.K(117194299);
                    aVar2.j();
                }
                q630 g = v.g(q630Var);
                Object obj2 = qni0.a;
                boolean y3 = aVar2.y(obj2);
                Object x8 = aVar2.x();
                if (y3 || x8 == obj) {
                    Object gVar = new g(0, obj2, qni0.class, "currentServerTimeMillis", "currentServerTimeMillis()J", 0);
                    aVar2.R(gVar);
                    x8 = gVar;
                }
                gzs gzsVar3 = (gzs) ((fcy) x8);
                boolean J4 = aVar2.J(izsVar) | aVar2.J(nboVar) | aVar2.J(ccoVar);
                Object x9 = aVar2.x();
                if (J4 || x9 == obj) {
                    x9 = new h(izsVar, nboVar, ccoVar);
                    aVar2.R(x9);
                }
                bco.a(ccoVar, gzsVar, gzsVar2, v630.a(g, gzsVar3, (izs) x9), aVar2, 0);
                aVar2.j();
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
            } else {
                aVar2.h();
            }
            return s3q0.a;
        }
    }

    /* compiled from: Effects.kt */
    /* loaded from: classes16.dex */
    public static final class k implements kgn {
        public final /* synthetic */ Lifecycle a;
        public final /* synthetic */ lbo b;

        public k(Lifecycle lifecycle, lbo lboVar) {
            this.a = lifecycle;
            this.b = lboVar;
        }

        @Override // xsna.kgn
        public final void dispose() {
            this.a.removeObserver(this.b);
        }
    }

    public mbo(x4o x4oVar, mm80 mm80Var) {
        super(cbo.class);
        this.b = x4oVar;
        this.c = mm80Var;
        this.d = msy.a(LazyThreadSafetyMode.NONE, new s63(3));
        this.e = new ebo(x4oVar);
    }

    @Override // xsna.m2a
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final void b(a8a a8aVar, nbo nboVar, izs izsVar, ksr ksrVar, q630 q630Var, androidx.compose.runtime.a aVar, int i2) {
        int i3;
        nbo nboVar2;
        izs izsVar2;
        androidx.compose.runtime.a M = aVar.M(74610954);
        if ((i2 & 48) == 0) {
            i3 = (M.J(nboVar) ? 32 : 16) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 384) == 0) {
            i3 |= M.y(izsVar) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= M.J(ksrVar) ? 2048 : 1024;
        }
        if ((196608 & i2) == 0) {
            i3 |= M.J(this) ? 131072 : 65536;
        }
        if (M.t(i3 & 1, (66705 & i3) != 66704)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(74610954, i3, -1, "com.vk.catalog.mvi.block.video.impl.downloaded.DownloadedSliderView.DownloadedSliderBlockView.ContentImpl (DownloadedSliderView.kt:161)");
            }
            if (nboVar.d.isEmpty()) {
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                androidx.compose.runtime.f s = M.s();
                if (s != null) {
                    s.l(new ibo(this, a8aVar, nboVar, izsVar, ksrVar, q630Var, i2));
                    return;
                }
                return;
            }
            this.e.a(ksrVar, M, (i3 >> 9) & 14);
            Lifecycle lifecycle = ((f5z) M.r(bvz.a())).getLifecycle();
            int i4 = i3 & 896;
            int i5 = i3 & 112;
            boolean y = (i4 == 256) | (i5 == 32) | M.y(lifecycle);
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (y || x == c0012a) {
                x = new jbo(lifecycle, izsVar, nboVar, 0);
                M.R(x);
            }
            bap.c(lifecycle, (izs) x, M, 0);
            b.c cVar = b.c.a;
            int i6 = i3;
            nboVar2 = nboVar;
            com.vk.core.compose.component.group.header.a a2 = a.C0748a.a(f.a.a(nboVar.c, null, null, null, null, null, null, null, false, M, 805306368, 510), M);
            String N = d370.N(R.string.show_all, 0, M);
            ButtonAppearance buttonAppearance = nboVar2.f ? ButtonAppearance.Neutral : ButtonAppearance.Accent;
            Object x2 = M.x();
            if (x2 == c0012a) {
                x2 = new y90(26);
                M.R(x2);
            }
            com.vk.core.compose.component.semantics.a a3 = com.vk.core.compose.component.semantics.b.a(null, (izs) x2, 3);
            boolean z = (i4 == 256) | (i5 == 32);
            Object x3 = M.x();
            if (z || x3 == c0012a) {
                x3 = new com.vk.catalog2.common.ui.holders.b(10, izsVar, nboVar2);
                M.R(x3);
            }
            izsVar2 = izsVar;
            GroupHeader$Right.a.C0743a a4 = GroupHeader$Right.a.C0743a.C0744a.a(N, (gzs) x3, null, null, buttonAppearance, null, a3, M, 0, 16364);
            M = M;
            com.vk.core.compose.component.group.header.g.a(a2, null, cVar, null, GroupHeader$Right.c.a(a4, null, null, null, M, 14), false, M, 384, Sdk.SDKError.Reason.INVALID_REQUEST_BUILDER_ERROR_VALUE);
            xvy xvyVar = nboVar2.e;
            u890 m = s200.m(16, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2);
            a.j g2 = androidx.compose.foundation.layout.a.g(12);
            boolean z2 = (i4 == 256) | (i5 == 32) | ((i6 & 458752) == 131072);
            Object x4 = M.x();
            if (z2 || x4 == c0012a) {
                x4 = new apg(nboVar2, izsVar2, this, 1);
                M.R(x4);
            }
            lqy.b(null, xvyVar, m, g2, null, null, false, null, (izs) x4, M, 24960, 489);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            nboVar2 = nboVar;
            izsVar2 = izsVar;
            M.h();
        }
        androidx.compose.runtime.f s2 = M.s();
        if (s2 != null) {
            s2.l(new kbo(this, a8aVar, nboVar2, izsVar2, ksrVar, q630Var, i2, 0));
        }
    }
}

package xsna;

import android.content.Context;
import android.content.res.Configuration;
import androidx.compose.foundation.layout.a;
import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.unity3d.services.UnityAdsConstants;
import com.vkontakte.android.R;
import com.vungle.ads.internal.protos.Sdk;
import java.util.Arrays;
import java.util.List;
import ru.ok.android.api.core.ApiInvocationException;
import xsna.c1b0;
import xsna.cri;
import xsna.dt1;
import xsna.n1b0;
import xsna.q630;
import xsna.ztp;

/* compiled from: PlayerEqualizerSettingsMviView.kt */
/* loaded from: classes3.dex */
public final class i1b0 extends i6v0<n1b0, c1b0> {
    public final boolean f;
    public final List g;

    /* compiled from: PlayerEqualizerSettingsMviView.kt */
    public static final class a implements gzs<s3q0> {
        public final /* synthetic */ izs<c1b0, s3q0> b;
        public final /* synthetic */ ztp c;

        /* JADX WARN: Multi-variable type inference failed */
        public a(izs<? super c1b0, s3q0> izsVar, ztp ztpVar) {
            this.b = izsVar;
            this.c = ztpVar;
        }

        @Override // xsna.gzs
        public final s3q0 invoke() {
            this.b.invoke(new c1b0.b(this.c));
            return s3q0.a;
        }
    }

    /* compiled from: LazyDsl.kt */
    public static final class b implements izs<Integer, Object> {
        public final /* synthetic */ wow b;

        public b(wow wowVar) {
            this.b = wowVar;
        }

        @Override // xsna.izs
        public final Object invoke(Integer num) {
            this.b.get(num.intValue());
            return null;
        }
    }

    /* compiled from: LazyDsl.kt */
    public static final class c implements zzs<ksy, Integer, androidx.compose.runtime.a, Integer, s3q0> {
        public final /* synthetic */ wow b;
        public final /* synthetic */ izs c;
        public final /* synthetic */ mtk0 d;

        public c(wow wowVar, izs izsVar, mtk0 mtk0Var) {
            this.b = wowVar;
            this.c = izsVar;
            this.d = mtk0Var;
        }

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
            boolean z = true;
            if (aVar2.t(i & 1, (i & 147) != 146)) {
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(802480018, i, -1, "androidx.compose.foundation.lazy.items.<anonymous> (LazyDsl.kt:178)");
                }
                ztp ztpVar = (ztp) this.b.b.get(intValue);
                aVar2.K(1326142121);
                int b = bup.b(ztpVar);
                Integer a = bup.a(ztpVar);
                mtk0 mtk0Var = this.d;
                if (!epx.f((ztp) mtk0Var.getValue(), ztpVar) && (!(ztpVar instanceof ztp.g) || !(((ztp) mtk0Var.getValue()) instanceof ztp.g))) {
                    z = false;
                }
                izs izsVar = this.c;
                boolean J = aVar2.J(izsVar) | aVar2.y(ztpVar);
                Object x = aVar2.x();
                if (J || x == a.C0011a.a) {
                    x = new a(izsVar, ztpVar);
                    aVar2.R(x);
                }
                cup.a(b, z, (gzs) x, null, a, aVar2, 0);
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

    /* compiled from: PlayerEqualizerSettingsMviView.kt */
    public static final class d implements gzs<s3q0> {
        public final /* synthetic */ izs<c1b0, s3q0> b;
        public final /* synthetic */ ztp c;

        /* JADX WARN: Multi-variable type inference failed */
        public d(izs<? super c1b0, s3q0> izsVar, ztp ztpVar) {
            this.b = izsVar;
            this.c = ztpVar;
        }

        @Override // xsna.gzs
        public final s3q0 invoke() {
            this.b.invoke(new c1b0.b(this.c));
            return s3q0.a;
        }
    }

    /* compiled from: LazyDsl.kt */
    public static final class e implements izs<Integer, Object> {
        public final /* synthetic */ wow b;

        public e(wow wowVar) {
            this.b = wowVar;
        }

        @Override // xsna.izs
        public final Object invoke(Integer num) {
            this.b.get(num.intValue());
            return null;
        }
    }

    /* compiled from: LazyDsl.kt */
    public static final class f implements zzs<ksy, Integer, androidx.compose.runtime.a, Integer, s3q0> {
        public final /* synthetic */ wow b;
        public final /* synthetic */ izs c;
        public final /* synthetic */ mtk0 d;

        public f(wow wowVar, izs izsVar, mtk0 mtk0Var) {
            this.b = wowVar;
            this.c = izsVar;
            this.d = mtk0Var;
        }

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
            boolean z = true;
            if (aVar2.t(i & 1, (i & 147) != 146)) {
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(802480018, i, -1, "androidx.compose.foundation.lazy.items.<anonymous> (LazyDsl.kt:178)");
                }
                ztp ztpVar = (ztp) this.b.b.get(intValue);
                aVar2.K(-695059293);
                int b = bup.b(ztpVar);
                Integer a = bup.a(ztpVar);
                mtk0 mtk0Var = this.d;
                if (!epx.f((ztp) mtk0Var.getValue(), ztpVar) && (!(ztpVar instanceof ztp.g) || !(((ztp) mtk0Var.getValue()) instanceof ztp.g))) {
                    z = false;
                }
                izs izsVar = this.c;
                boolean J = aVar2.J(izsVar) | aVar2.y(ztpVar);
                Object x = aVar2.x();
                if (J || x == a.C0011a.a) {
                    x = new d(izsVar, ztpVar);
                    aVar2.R(x);
                }
                cup.a(b, z, (gzs) x, null, a, aVar2, 0);
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

    public i1b0(d1b0 d1b0Var, Context context, boolean z) {
        super(context, d1b0Var);
        this.f = z;
        this.g = aup.a;
    }

    @Override // xsna.xpo0
    public final /* bridge */ /* synthetic */ void a(ao50 ao50Var, izs izsVar, androidx.compose.runtime.a aVar) {
        k((n1b0) ao50Var, izsVar, aVar, 512);
    }

    @Override // xsna.i6v0
    public final void g(int i, androidx.compose.runtime.a aVar, jai jaiVar) {
        int i2;
        androidx.compose.runtime.a aVar2;
        androidx.compose.runtime.a M = aVar.M(802579158);
        if ((i & 6) == 0) {
            i2 = (M.y(jaiVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? M.J(this) : M.y(this) ? 32 : 16;
        }
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(802579158, i2, -1, "com.vk.music.bottomsheets.equalizer.PlayerEqualizerSettingsMviView.Theme (PlayerEqualizerSettingsMviView.kt:58)");
            }
            if (this.f) {
                M.K(-447141404);
                aVar2 = M;
                rrv0.e(true, null, null, null, null, null, kai.c(-152710248, new om9(jaiVar, 12), M), aVar2, 1572870, 62);
                aVar2.j();
            } else {
                M.K(-447064865);
                rrv0.d(null, null, null, null, kai.c(829805229, new ed1(1, jaiVar), M), M, 24576, 15);
                aVar2 = M;
                aVar2.j();
            }
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            aVar2 = M;
            aVar2.h();
        }
        androidx.compose.runtime.f s = aVar2.s();
        if (s != null) {
            s.d = new qol(this, jaiVar, i, 2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void h(n1b0.b bVar, izs<? super c1b0, s3q0> izsVar, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a M = aVar.M(2039416732);
        int i2 = i | (M.J(bVar) ? 4 : 2) | (M.y(izsVar) ? 32 : 16) | (M.y(this) ? 256 : 128);
        boolean z = true;
        if (M.t(i2 & 1, (i2 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(2039416732, i2, -1, "com.vk.music.bottomsheets.equalizer.PlayerEqualizerSettingsMviView.DefaultOrientationContent (PlayerEqualizerSettingsMviView.kt:113)");
            }
            wh50 c2 = jk50.c(bVar.a, M);
            Object c3 = jk50.c(bVar.d, M);
            wh50 c4 = jk50.c(bVar.c, M);
            wh50 c5 = jk50.c(bVar.b, M);
            m(((i2 >> 6) & 14) | 8, M);
            q630.a aVar2 = q630.a.a;
            l(p490.D(s200.E(txj0.f(aVar2, 1.0f), 16, 14), p490.x(M), 14), M, ((i2 >> 3) & 112) | 64);
            q630 D = p490.D(aVar2, p490.x(M), 14);
            ytp ytpVar = (ytp) c4.getValue();
            List<T> list = ((wow) c5.getValue()).b;
            boolean booleanValue = ((Boolean) c2.getValue()).booleanValue();
            int i3 = i2 & 112;
            boolean z2 = i3 == 32;
            Object x = M.x();
            Object obj = a.C0011a.a;
            if (z2 || x == obj) {
                x = new com.vk.movika.tools.controls.seekbar.s(izsVar, 13);
                M.R(x);
            }
            wzs wzsVar = (wzs) x;
            boolean z3 = i3 == 32;
            Object x2 = M.x();
            if (z3 || x2 == obj) {
                x2 = new c97(izsVar, 6);
                M.R(x2);
            }
            t5v0.a(ytpVar, list, booleanValue, wzsVar, (gzs) x2, D, this.f, M, 0, 0);
            boolean J = (i3 == 32) | M.J(c2);
            if ((i2 & 896) != 256 && !M.y(this)) {
                z = false;
            }
            boolean J2 = J | z | M.J(c3);
            Object x3 = M.x();
            if (J2 || x3 == obj) {
                Object jk30Var = new jk30(this, izsVar, c2, c3, 1);
                M.R(jk30Var);
                x3 = jk30Var;
            }
            lqy.a(null, null, null, null, null, null, false, null, (izs) x3, M, 0, ApiInvocationException.ErrorCodes.IDS_BLOCKED);
            M = M;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new ar0(i, 7, this, bVar, izsVar);
        }
    }

    public final void i(n1b0.b bVar, izs<? super c1b0, s3q0> izsVar, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a aVar2;
        androidx.compose.runtime.a M = aVar.M(93171682);
        int i2 = i | (M.J(bVar) ? 4 : 2) | (M.y(izsVar) ? 32 : 16) | (M.y(this) ? 256 : 128);
        if (M.t(i2 & 1, (i2 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(93171682, i2, -1, "com.vk.music.bottomsheets.equalizer.PlayerEqualizerSettingsMviView.LandscapeOrientationContent (PlayerEqualizerSettingsMviView.kt:169)");
            }
            wh50 c2 = jk50.c(bVar.a, M);
            wh50 c3 = jk50.c(bVar.d, M);
            wh50 c4 = jk50.c(bVar.c, M);
            wh50 c5 = jk50.c(bVar.b, M);
            m(((i2 >> 6) & 14) | 8, M);
            boolean J = ((i2 & 896) == 256 || M.y(this)) | M.J(c4) | M.J(c5) | M.J(c2) | ((i2 & 112) == 32) | M.J(c3);
            Object x = M.x();
            if (J || x == a.C0011a.a) {
                f1b0 f1b0Var = new f1b0(this, izsVar, c4, c5, c2, c3, 0);
                M.R(f1b0Var);
                x = f1b0Var;
            }
            aVar2 = M;
            lqy.a(null, null, null, null, null, null, false, null, (izs) x, aVar2, 0, ApiInvocationException.ErrorCodes.IDS_BLOCKED);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            aVar2 = M;
            aVar2.h();
        }
        androidx.compose.runtime.f s = aVar2.s();
        if (s != null) {
            s.d = new v(i, 7, this, bVar, izsVar);
        }
    }

    public final void j(n1b0.b bVar, izs<? super c1b0, s3q0> izsVar, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a M = aVar.M(631789093);
        int i2 = (M.J(bVar) ? 4 : 2) | i | (M.y(izsVar) ? 32 : 16) | (M.y(this) ? 256 : 128);
        if (M.t(i2 & 1, (i2 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(631789093, i2, -1, "com.vk.music.bottomsheets.equalizer.PlayerEqualizerSettingsMviView.PlayerEqualizerSettingsContent (PlayerEqualizerSettingsMviView.kt:85)");
            }
            q630 t = n34.t(txj0.d(ahn.E(q630.a.a, "equalizerBottomSheet"), 1.0f), dz5.I(0, 1, M, false), null);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            float f2 = 12;
            q630 m = hr80.m(t, ylu0Var.getBackground().r, vog0.d(f2, f2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 12));
            a.c cVar = androidx.compose.foundation.layout.a.e;
            dt1.a.getClass();
            androidx.compose.foundation.layout.c a2 = androidx.compose.foundation.layout.b.a(cVar, dt1.a.n, M, 6);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c2 = qri.c(M, m);
            cri.h7.getClass();
            LayoutNode.a aVar2 = cri.a.b;
            if (M.N() == null) {
                n34.r();
                throw null;
            }
            M.H();
            if (M.L()) {
                M.I(aVar2);
            } else {
                M.f();
            }
            k9q0.w(M, a2, cri.a.f);
            k9q0.w(M, D, cri.a.e);
            k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
            k9q0.t(M, cri.a.h);
            k9q0.w(M, c2, cri.a.d);
            if (((Configuration) M.r(AndroidCompositionLocals_androidKt.a)).orientation == 2) {
                M.K(-101109966);
                i(bVar, izsVar, M, (i2 & Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE) | 512 | (i2 & 896));
                M.j();
            } else {
                M.K(-100999916);
                h(bVar, izsVar, M, (i2 & Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE) | 512 | (i2 & 896));
                M.j();
            }
            M.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new mt(i, 6, this, bVar, izsVar);
        }
    }

    public final void k(n1b0 n1b0Var, izs<? super c1b0, s3q0> izsVar, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a M = aVar.M(-599966217);
        int i2 = (M.J(n1b0Var) ? 4 : 2) | i | (M.y(izsVar) ? 32 : 16) | (M.y(this) ? 256 : 128);
        if (M.t(i2 & 1, (i2 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-599966217, i2, -1, "com.vk.music.bottomsheets.equalizer.PlayerEqualizerSettingsMviView.ThemedContent (PlayerEqualizerSettingsMviView.kt:70)");
            }
            fm50 fm50Var = (fm50) d(n1b0.a.a, (n0u0[]) Arrays.copyOf(new n0u0[]{n1b0Var.a}, 1), M, (((((i2 << 3) & 7168) | 4102) >> 3) & 896) | 6).getValue();
            if (fm50Var instanceof n1b0.b) {
                M.K(353893992);
                j((n1b0.b) fm50Var, izsVar, M, (i2 & 896) | (i2 & 112) | 512);
            } else {
                M.K(350678176);
            }
            M.j();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new vb5(i, 5, this, n1b0Var, izsVar);
        }
    }

    public final void l(q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        int i2;
        androidx.compose.runtime.a aVar2;
        androidx.compose.runtime.a M = aVar.M(1232143301);
        if ((i & 6) == 0) {
            i2 = (M.J(q630Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (M.t(i2 & 1, (i2 & 3) != 2)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1232143301, i2, -1, "com.vk.music.bottomsheets.equalizer.PlayerEqualizerSettingsMviView.TitleRow (PlayerEqualizerSettingsMviView.kt:246)");
            }
            dt1.a.getClass();
            androidx.compose.foundation.layout.k a2 = androidx.compose.foundation.layout.j.a(androidx.compose.foundation.layout.a.a, dt1.a.l, M, 48);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c2 = qri.c(M, q630Var);
            cri.h7.getClass();
            LayoutNode.a aVar3 = cri.a.b;
            if (M.N() == null) {
                n34.r();
                throw null;
            }
            M.H();
            if (M.L()) {
                M.I(aVar3);
            } else {
                M.f();
            }
            k9q0.w(M, a2, cri.a.f);
            k9q0.w(M, D, cri.a.e);
            k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
            k9q0.t(M, cri.a.h);
            k9q0.w(M, c2, cri.a.d);
            String N = d370.N(R.string.equalizer_settings_menu, 0, M);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            long j = ylu0Var.getText().m;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-473561179, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-typography> (VkTheme.kt:165)");
            }
            wuv0 wuv0Var = (wuv0) M.r(rrv0.c);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            aVar2 = M;
            yqv0.c(N, null, j, null, null, 0, 0, null, 0, false, 0, 0, null, wuv0Var.f, aVar2, 0, 0, 8186);
            aVar2.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            aVar2 = M;
            aVar2.h();
        }
        androidx.compose.runtime.f s = aVar2.s();
        if (s != null) {
            s.d = new kka(this, q630Var, i, 1);
        }
    }

    public final void m(int i, androidx.compose.runtime.a aVar) {
        androidx.compose.runtime.a M = aVar.M(304683944);
        int i2 = i & 1;
        if (M.t(i2, i2 != 0)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(304683944, i, -1, "com.vk.music.bottomsheets.equalizer.PlayerEqualizerSettingsMviView.TopGrabber (PlayerEqualizerSettingsMviView.kt:228)");
            }
            q630.a aVar2 = q630.a.a;
            q630 D = p490.D(txj0.h(txj0.f(aVar2, 1.0f), 24), p490.x(M), 14);
            dt1.a.getClass();
            androidx.compose.foundation.layout.k a2 = androidx.compose.foundation.layout.j.a(androidx.compose.foundation.layout.a.e, dt1.a.l, M, 54);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D2 = M.D();
            q630 c2 = qri.c(M, D);
            cri.h7.getClass();
            LayoutNode.a aVar3 = cri.a.b;
            if (M.N() == null) {
                n34.r();
                throw null;
            }
            M.H();
            if (M.L()) {
                M.I(aVar3);
            } else {
                M.f();
            }
            k9q0.w(M, a2, cri.a.f);
            k9q0.w(M, D2, cri.a.e);
            k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
            k9q0.t(M, cri.a.h);
            k9q0.w(M, c2, cri.a.d);
            q630 s = txj0.s(aVar2, 32, 4);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            if (dt.c(hr80.m(s, ylu0Var.getIcon().n, vog0.b(100)), M, 0)) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s2 = M.s();
        if (s2 != null) {
            s2.d = new g1b0(this, i, 0);
        }
    }
}

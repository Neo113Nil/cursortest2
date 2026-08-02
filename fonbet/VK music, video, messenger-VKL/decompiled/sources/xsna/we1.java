package xsna;

import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.vk.core.compose.component.defaults.ButtonAppearance;
import com.vk.core.compose.component.defaults.ButtonSize;
import com.vk.core.compose.component.defaults.ButtonStyle;
import com.vkontakte.android.R;
import com.vungle.ads.internal.protos.Sdk;
import xsna.cd1;
import xsna.cri;
import xsna.dt1;
import xsna.q630;
import xsna.wra0;
import xsna.zra0;

/* compiled from: AlbumChooseViewRedesign.kt */
/* loaded from: classes7.dex */
public final class we1 {

    /* compiled from: AlbumChooseViewRedesign.kt */
    public static final class a implements izs<rl1, s3q0> {
        public final /* synthetic */ izs<cd1, s3q0> b;

        /* JADX WARN: Multi-variable type inference failed */
        public a(izs<? super cd1, s3q0> izsVar) {
            this.b = izsVar;
        }

        @Override // xsna.izs
        public final s3q0 invoke(rl1 rl1Var) {
            this.b.invoke(new cd1.b(rl1Var));
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

        public c(wow wowVar, izs izsVar) {
            this.b = wowVar;
            this.c = izsVar;
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
            if (aVar2.t(i & 1, (i & 147) != 146)) {
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(802480018, i, -1, "androidx.compose.foundation.lazy.items.<anonymous> (LazyDsl.kt:178)");
                }
                rl1 rl1Var = (rl1) this.b.b.get(intValue);
                aVar2.K(-1504739728);
                izs izsVar = this.c;
                boolean J = aVar2.J(izsVar);
                Object x = aVar2.x();
                if (J || x == a.C0011a.a) {
                    x = new a(izsVar);
                    aVar2.R(x);
                }
                nk1.a(rl1Var, (izs) x, null, aVar2, 0);
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

    public static final void a(final xe1 xe1Var, final izs izsVar, q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        int i2;
        androidx.compose.runtime.a aVar2;
        q630 q630Var2;
        androidx.compose.runtime.a M = aVar.M(-1273020019);
        if ((i & 6) == 0) {
            i2 = i | (M.J(xe1Var) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.y(izsVar) ? 32 : 16;
        }
        int i3 = i2 | 384;
        if (M.t(i3 & 1, (i3 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1273020019, i3, -1, "com.vk.video.ui.upload.impl.publish.presentation.albumchoose.compose.screen.AlbumChooseViewRedesign (AlbumChooseViewRedesign.kt:44)");
            }
            final boolean isEmpty = xe1Var.d.isEmpty();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            long j = ylu0Var.getBackground().g;
            q630.a aVar3 = q630.a.a;
            aVar2 = M;
            phv0.b(txj0.d(aVar3, 1.0f), kai.c(-1299219628, new te1(izsVar, 0), M), kai.c(412058739, new wzs() { // from class: xsna.ue1
                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    androidx.compose.runtime.a aVar4 = (androidx.compose.runtime.a) obj;
                    int intValue = ((Integer) obj2).intValue();
                    if (aVar4.t(intValue & 1, (intValue & 3) != 2)) {
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(412058739, intValue, -1, "com.vk.video.ui.upload.impl.publish.presentation.albumchoose.compose.screen.AlbumChooseViewRedesign.<anonymous> (AlbumChooseViewRedesign.kt:50)");
                        }
                        if (isEmpty) {
                            aVar4.K(622956975);
                        } else {
                            aVar4.K(625397512);
                            izs izsVar2 = izsVar;
                            boolean J = aVar4.J(izsVar2);
                            Object x = aVar4.x();
                            if (J || x == a.C0011a.a) {
                                x = new me1(izsVar2, 0);
                                aVar4.R(x);
                            }
                            sq8.a(0, aVar4, d370.N(R.string.album_choose_save, 0, aVar4), (gzs) x, null, xe1Var.e);
                        }
                        aVar4.j();
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                    } else {
                        aVar4.h();
                    }
                    return s3q0.a;
                }
            }, M), null, null, 0, j, 0L, kai.c(-11291927, new yzs() { // from class: xsna.ve1
                @Override // xsna.yzs
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    s890 s890Var = (s890) obj;
                    androidx.compose.runtime.a aVar4 = (androidx.compose.runtime.a) obj2;
                    int intValue = ((Integer) obj3).intValue();
                    if ((intValue & 6) == 0) {
                        intValue |= aVar4.J(s890Var) ? 4 : 2;
                    }
                    if (aVar4.t(intValue & 1, (intValue & 19) != 18)) {
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(-11291927, intValue, -1, "com.vk.video.ui.upload.impl.publish.presentation.albumchoose.compose.screen.AlbumChooseViewRedesign.<anonymous> (AlbumChooseViewRedesign.kt:67)");
                        }
                        xvy a2 = zvy.a(0, 3, aVar4);
                        izs izsVar2 = izsVar;
                        boolean J = aVar4.J(izsVar2);
                        Object x = aVar4.x();
                        if (J || x == a.C0011a.a) {
                            x = new ne1(izsVar2, 0);
                            aVar4.R(x);
                        }
                        xe1 xe1Var2 = xe1Var;
                        ke1.b(0, 0, aVar4, (gzs) x, a2, xe1Var2.b);
                        if (!isEmpty || xe1Var2.c) {
                            aVar4.K(-1389982367);
                            we1.c(s890Var, xe1Var2, izsVar2, aVar4, intValue & 14);
                            aVar4.j();
                        } else {
                            aVar4.K(-1390039159);
                            we1.b(izsVar2, aVar4, 0);
                            aVar4.j();
                        }
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                    } else {
                        aVar4.h();
                    }
                    return s3q0.a;
                }
            }, M), aVar2, 805306800, 376);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            q630Var2 = aVar3;
        } else {
            aVar2 = M;
            aVar2.h();
            q630Var2 = q630Var;
        }
        androidx.compose.runtime.f s = aVar2.s();
        if (s != null) {
            s.d = new le1(i, 0, xe1Var, izsVar, q630Var2);
        }
    }

    public static final void b(izs<? super cd1, s3q0> izsVar, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a aVar2;
        androidx.compose.runtime.a M = aVar.M(826580699);
        int i2 = i | (M.y(izsVar) ? 4 : 2);
        if (M.t(i2 & 1, (i2 & 3) != 2)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(826580699, i2, -1, "com.vk.video.ui.upload.impl.publish.presentation.albumchoose.compose.screen.EmptyStateView (AlbumChooseViewRedesign.kt:88)");
            }
            q630.a aVar3 = q630.a.a;
            q630 d = txj0.d(aVar3, 1.0f);
            dt1.a.getClass();
            cp10 d2 = ja8.d(dt1.a.b, false);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c2 = qri.c(M, d);
            cri.h7.getClass();
            LayoutNode.a aVar4 = cri.a.b;
            if (M.N() == null) {
                n34.r();
                throw null;
            }
            M.H();
            if (M.L()) {
                M.I(aVar4);
            } else {
                M.f();
            }
            k9q0.w(M, d2, cri.a.f);
            k9q0.w(M, D, cri.a.e);
            k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
            k9q0.t(M, cri.a.h);
            k9q0.w(M, c2, cri.a.d);
            q630 b2 = ra8.a.b(aVar3, dt1.a.f);
            vl20 a2 = zra0.a.a(d370.N(R.string.choose_album_empty_state_title, 0, M), null, d370.N(R.string.choose_album_empty_state_description, 0, M), null, M, 196608, 26);
            String N = d370.N(R.string.choose_album_empty_state_button, 0, M);
            ButtonAppearance buttonAppearance = ButtonAppearance.Accent;
            ButtonStyle buttonStyle = ButtonStyle.Primary;
            ButtonSize buttonSize = ButtonSize.Small;
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (x == c0012a) {
                x = new pe1(0);
                M.R(x);
            }
            com.vk.core.compose.component.semantics.a a3 = com.vk.core.compose.component.semantics.b.a(null, (izs) x, 3);
            boolean z = (i2 & 14) == 4;
            Object x2 = M.x();
            if (z || x2 == c0012a) {
                x2 = new tw(izsVar, 1);
                M.R(x2);
            }
            aVar2 = M;
            ldv0.d(b2, null, a2, wra0.b.a(wra0.a.C3954a.a(N, (gzs) x2, buttonSize, buttonStyle, buttonAppearance, false, null, null, null, null, null, null, false, false, null, a3, aVar2, 28032, 12582912, 65504), null, null, aVar2, 14), null, null, false, aVar2, 0, Sdk.SDKError.Reason.ASSET_WRITE_ERROR_VALUE);
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
            s.d = new qe1(izsVar, i);
        }
    }

    public static final void c(s890 s890Var, xe1 xe1Var, izs<? super cd1, s3q0> izsVar, androidx.compose.runtime.a aVar, int i) {
        int i2;
        androidx.compose.runtime.a M = aVar.M(1275493753);
        if ((i & 6) == 0) {
            i2 = (M.J(s890Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.J(xe1Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= M.y(izsVar) ? 256 : 128;
        }
        if (M.t(i2 & 1, (i2 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1275493753, i2, -1, "com.vk.video.ui.upload.impl.publish.presentation.albumchoose.compose.screen.ListStateView (AlbumChooseViewRedesign.kt:121)");
            }
            q630 E = ahn.E(q630.a.a, "AlbumChooseTags.ALBUMS");
            boolean z = ((i2 & 896) == 256) | ((i2 & 112) == 32);
            Object x = M.x();
            if (z || x == a.C0011a.a) {
                x = new n9(1, xe1Var, izsVar);
                M.R(x);
            }
            x1v0.a(E, null, s890Var, null, null, null, false, null, (izs) x, M, ((i2 << 6) & 896) | 6, IronSourceError.ERROR_CODE_INVALID_KEY_VALUE);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new ts0(i, 1, s890Var, xe1Var, izsVar);
        }
    }
}

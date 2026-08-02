package xsna;

import androidx.compose.foundation.layout.a;
import androidx.compose.ui.node.LayoutNode;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.compose.component.defaults.ButtonSize;
import com.vk.core.compose.component.defaults.ButtonStyle;
import com.vkontakte.android.R;
import xsna.cri;
import xsna.dt1;
import xsna.q630;

/* compiled from: CoverButtonWithIcon.kt */
/* loaded from: classes16.dex */
public final class c0k {
    public static final void a(int i, final q630 q630Var, final gzs<s3q0> gzsVar, String str, String str2, androidx.compose.runtime.a aVar, final int i2, final int i3) {
        final String str3;
        int i4;
        String str4;
        int i5;
        androidx.compose.runtime.a aVar2;
        final String str5;
        final int i6 = i;
        androidx.compose.runtime.a M = aVar.M(-1523384051);
        int i7 = i2 | (M.o(i6) ? 4 : 2) | (M.J(q630Var) ? 32 : 16) | (M.y(gzsVar) ? 256 : 128);
        int i8 = i3 & 8;
        if (i8 != 0) {
            i4 = i7 | 3072;
            str3 = str;
        } else {
            str3 = str;
            i4 = i7 | (M.J(str3) ? 2048 : 1024);
        }
        int i9 = i3 & 16;
        if (i9 != 0) {
            i5 = i4 | 24576;
            str4 = str2;
        } else {
            str4 = str2;
            i5 = i4 | (M.J(str4) ? 16384 : 8192);
        }
        int i10 = i5;
        if (M.t(i10 & 1, (i10 & 9363) != 9362)) {
            String str6 = i8 != 0 ? "" : str3;
            String str7 = i9 != 0 ? null : str4;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1523384051, i10, -1, "com.vk.catalog2.common.ui.holders.video.playlist.cover.ui.CoverButtonWithIcon (CoverButtonWithIcon.kt:31)");
            }
            bn20 z = hr80.z();
            ButtonSize buttonSize = ButtonSize.Medium;
            r5j0 x = z.x(6, M);
            s890 value = hr80.z().c(buttonSize, ButtonStyle.Secondary, false, M, 438, 0).getValue();
            bn20 z2 = hr80.z();
            long a = s7g.a(R.color.vk_white_alpha20, M);
            long a2 = s7g.a(R.color.vk_white, M);
            z2.getClass();
            final String str8 = str6;
            final String str9 = str7;
            i6 = i;
            aVar2 = M;
            bhu0.f(gzsVar, q630Var, false, null, null, null, hr80.z().y(buttonSize, M, 6), null, x, op8.a(a, 0L, a2, 0L, 0L, 0L, 0L, 0L, 0L, 0L, M, 0, 0, 1018), value, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, false, kai.c(1565389910, new yzs() { // from class: xsna.a0k
                @Override // xsna.yzs
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    androidx.compose.runtime.a aVar3 = (androidx.compose.runtime.a) obj2;
                    int intValue = ((Integer) obj3).intValue();
                    if (aVar3.t(intValue & 1, (intValue & 17) != 16)) {
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(1565389910, intValue, -1, "com.vk.catalog2.common.ui.holders.video.playlist.cover.ui.CoverButtonWithIcon.<anonymous> (CoverButtonWithIcon.kt:47)");
                        }
                        float f = 4;
                        q630 H = s200.H(q630.a.a, f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 10);
                        a.l lVar = androidx.compose.foundation.layout.a.a;
                        hr80.z().getClass();
                        op8.h();
                        a.j g = androidx.compose.foundation.layout.a.g(kqu0.s);
                        dt1.a.getClass();
                        androidx.compose.foundation.layout.k a3 = androidx.compose.foundation.layout.j.a(g, dt1.a.l, aVar3, 48);
                        int hashCode = Long.hashCode(n34.n(aVar3));
                        sy90 D = aVar3.D();
                        q630 c = qri.c(aVar3, H);
                        cri.h7.getClass();
                        LayoutNode.a aVar4 = cri.a.b;
                        if (aVar3.N() == null) {
                            n34.r();
                            throw null;
                        }
                        aVar3.H();
                        if (aVar3.L()) {
                            aVar3.I(aVar4);
                        } else {
                            aVar3.f();
                        }
                        k9q0.w(aVar3, a3, cri.a.f);
                        k9q0.w(aVar3, D, cri.a.e);
                        k9q0.w(aVar3, Integer.valueOf(hashCode), cri.a.g);
                        k9q0.t(aVar3, cri.a.h);
                        k9q0.w(aVar3, c, cri.a.d);
                        pzu0.b(pg90.a(i6, 0, aVar3), str9, null, s7g.a(R.color.vk_white, aVar3), aVar3, 8, 4);
                        String str10 = str8;
                        if (str10.length() > 0) {
                            aVar3.K(-1965729579);
                            yqv0.c(str10, null, 0L, null, null, 0, 0, null, 0, false, 0, 0, null, null, aVar3, 0, 0, 16382);
                            aVar3 = aVar3;
                        } else {
                            aVar3.K(-1968066328);
                        }
                        aVar3.j();
                        aVar3.G();
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                    } else {
                        aVar3.h();
                    }
                    return s3q0.a;
                }
            }, M), aVar2, ((i10 >> 6) & 14) | (i10 & 112), 1572864, 63676);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            str5 = str9;
            str3 = str8;
        } else {
            aVar2 = M;
            aVar2.h();
            str5 = str4;
        }
        androidx.compose.runtime.f s = aVar2.s();
        if (s != null) {
            s.d = new wzs(i6, q630Var, gzsVar, str3, str5, i2, i3) { // from class: xsna.b0k
                public final /* synthetic */ int b;
                public final /* synthetic */ q630 c;
                public final /* synthetic */ gzs d;
                public final /* synthetic */ String e;
                public final /* synthetic */ String f;
                public final /* synthetic */ int g;

                {
                    this.g = i3;
                }

                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int I = ne7.I(1);
                    c0k.a(this.b, this.c, this.d, this.e, this.f, (androidx.compose.runtime.a) obj, I, this.g);
                    return s3q0.a;
                }
            };
        }
    }
}

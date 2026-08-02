package xsna;

import androidx.compose.foundation.layout.a;
import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.compose.component.topbar.TopBar$Before;
import com.vk.core.compose.component.topbar.TopBar$Middle;
import com.vk.core.compose.component.topbar.k;
import com.vkontakte.android.R;
import ru.ok.gl.tf.Tensorflow;
import xsna.cri;
import xsna.dt1;
import xsna.q630;

/* compiled from: BiometricLockSettingsToolbar.kt */
/* loaded from: classes15.dex */
public final class b57 {
    /* JADX WARN: Removed duplicated region for block: B:14:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x01ff  */
    /* JADX WARN: Removed duplicated region for block: B:54:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01ef  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0050  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(final gzs<s3q0> gzsVar, q630 q630Var, boolean z, String str, long j, androidx.compose.runtime.a aVar, final int i, final int i2) {
        boolean z2;
        int i3;
        long j2;
        int i4;
        int i5;
        androidx.compose.runtime.a aVar2;
        final q630 q630Var2;
        final String str2;
        final boolean z3;
        final long j3;
        androidx.compose.runtime.f s;
        int i6;
        long j4;
        String str3;
        boolean z4;
        q630 q630Var3;
        TopBar$Before.e eVar;
        androidx.compose.runtime.a M = aVar.M(1092053009);
        int i7 = i | (M.y(gzsVar) ? 4 : 2);
        int i8 = i7 | 48;
        int i9 = i2 & 4;
        if (i9 != 0) {
            i3 = i7 | Tensorflow.FRAME_WIDTH;
            z2 = z;
        } else {
            z2 = z;
            i3 = i8 | (M.l(z2) ? 256 : 128);
        }
        int i10 = i3 | 3072;
        if ((i2 & 16) == 0) {
            j2 = j;
            if (M.p(j2)) {
                i4 = 16384;
                i5 = i10 | i4;
                if (M.t(i5 & 1, (i5 & 9363) == 9362)) {
                    aVar2 = M;
                    aVar2.h();
                    q630Var2 = q630Var;
                    str2 = str;
                    z3 = z2;
                    j3 = j2;
                } else {
                    M.V();
                    if ((i & 1) == 0 || M.i()) {
                        boolean z5 = i9 == 0 ? z2 : true;
                        int i11 = i2 & 16;
                        q630.a aVar3 = q630.a.a;
                        if (i11 != 0) {
                            if (androidx.compose.runtime.b.d()) {
                                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                            }
                            ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
                            if (androidx.compose.runtime.b.d()) {
                                androidx.compose.runtime.b.e();
                            }
                            j2 = ylu0Var.getHeader().a;
                            i5 &= -57345;
                        }
                        i6 = i5;
                        j4 = j2;
                        str3 = "";
                        z4 = z5;
                        q630Var3 = aVar3;
                    } else {
                        M.h();
                        if ((i2 & 16) != 0) {
                            i5 &= -57345;
                        }
                        q630Var3 = q630Var;
                        z4 = z2;
                        i6 = i5;
                        j4 = j2;
                        str3 = str;
                    }
                    M.S();
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1092053009, i6, -1, "com.vk.biometrics.lock.impl.presentation.base.view.BiometricsLockToolbar (BiometricLockSettingsToolbar.kt:23)");
                    }
                    q630 f = txj0.f(q630Var3, 1.0f);
                    a.m mVar = androidx.compose.foundation.layout.a.c;
                    dt1.a.getClass();
                    androidx.compose.foundation.layout.c a = androidx.compose.foundation.layout.b.a(mVar, dt1.a.n, M, 0);
                    int hashCode = Long.hashCode(n34.n(M));
                    sy90 D = M.D();
                    q630 c = qri.c(M, f);
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
                    k9q0.w(M, a, cri.a.f);
                    k9q0.w(M, D, cri.a.e);
                    k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
                    k9q0.t(M, cri.a.h);
                    k9q0.w(M, c, cri.a.d);
                    androidx.compose.runtime.a aVar5 = M;
                    String str4 = str3;
                    TopBar$Middle.Text a2 = TopBar$Middle.Text.b.a(TopBar$Middle.Text.Title.b.a(str3, null, null, null, null, aVar5, 196614, 30), null, null, null, aVar5, 14);
                    k.b bVar = k.b.a;
                    if (z4) {
                        aVar5.K(120120545);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(1616143740, 0, -1, "com.vk.core.compose.icons.generated.VkSdkIcons.<get-ArrowLeftOutline28> (VkSdkIcons.kt:100)");
                        }
                        lg90 b = or.b(aVar5, -45049119, R.drawable.vk_icon_arrow_left_outline_28, aVar5, 0);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                        String N = d370.N(R.string.talkback_ic_back, 0, aVar5);
                        Object x = aVar5.x();
                        if (x == a.C0011a.a) {
                            x = new pe1(4);
                            aVar5.R(x);
                        }
                        eVar = TopBar$Before.e.a.a(b, N, gzsVar, null, null, com.vk.core.compose.component.semantics.b.a(null, (izs) x, 3), aVar5, 1572872 | ((i6 << 6) & 896), 24);
                        aVar5 = aVar5;
                        aVar5.j();
                    } else {
                        aVar5.K(120533155);
                        aVar5.j();
                        eVar = null;
                    }
                    int i12 = ((i6 << 15) & 1879048192) | 384;
                    androidx.compose.runtime.a aVar6 = aVar5;
                    q630 q630Var4 = q630Var3;
                    long j5 = j4;
                    muv0.h(a2, null, bVar, null, null, eVar, null, null, false, j5, null, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, aVar6, i12, 0, 7642);
                    aVar2 = aVar6;
                    aVar2.G();
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    j3 = j5;
                    z3 = z4;
                    str2 = str4;
                    q630Var2 = q630Var4;
                }
                s = aVar2.s();
                if (s == null) {
                    s.d = new wzs(q630Var2, z3, str2, j3, i, i2) { // from class: xsna.a57
                        public final /* synthetic */ q630 c;
                        public final /* synthetic */ boolean d;
                        public final /* synthetic */ String e;
                        public final /* synthetic */ long f;
                        public final /* synthetic */ int g;

                        {
                            this.g = i2;
                        }

                        @Override // xsna.wzs
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            int I = ne7.I(1);
                            b57.a(gzs.this, this.c, this.d, this.e, this.f, (androidx.compose.runtime.a) obj, I, this.g);
                            return s3q0.a;
                        }
                    };
                    return;
                }
                return;
            }
        } else {
            j2 = j;
        }
        i4 = 8192;
        i5 = i10 | i4;
        if (M.t(i5 & 1, (i5 & 9363) == 9362)) {
        }
        s = aVar2.s();
        if (s == null) {
        }
    }
}

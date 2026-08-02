package xsna;

import android.content.Context;
import android.text.Spanned;
import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.unity3d.services.UnityAdsConstants;
import com.vk.dto.music.MusicTrack;
import com.vkontakte.android.R;
import com.vungle.ads.internal.protos.Sdk;
import xsna.cri;
import xsna.dt1;
import xsna.q630;

/* compiled from: AudioBookDescriptionBottomSheetView.kt */
/* loaded from: classes3.dex */
public final class dg4 {
    public static final void a(r1m r1mVar, izs<? super l2v0, s3q0> izsVar, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a M = aVar.M(512041727);
        int i2 = (M.J(r1mVar) ? 4 : 2) | i | (M.y(izsVar) ? 32 : 16);
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(512041727, i2, -1, "com.vk.music.playlist.display.audiobook.presentation.AudioBookDescriptionBottomSheetContentView (AudioBookDescriptionBottomSheetView.kt:38)");
            }
            q630 E = ahn.E(n34.t(txj0.d(q630.a.a, 1.0f), fz5.z(null, M, 1), null), "audiobookDescriptionBottomSheet");
            dt1.a.getClass();
            cp10 d = ja8.d(dt1.a.b, false);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, E);
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
            k9q0.w(M, d, cri.a.f);
            k9q0.w(M, D, cri.a.e);
            k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
            k9q0.t(M, cri.a.h);
            k9q0.w(M, c, cri.a.d);
            b(r1mVar, izsVar, M, i2 & Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE);
            M.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new xf4(r1mVar, izsVar, i, 0);
        }
    }

    public static final void b(r1m r1mVar, izs<? super l2v0, s3q0> izsVar, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a M = aVar.M(-1861410886);
        int i2 = (M.J(r1mVar) ? 4 : 2) | i | (M.y(izsVar) ? 32 : 16);
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1861410886, i2, -1, "com.vk.music.playlist.display.audiobook.presentation.BottomSheetContentBlock (AudioBookDescriptionBottomSheetView.kt:52)");
            }
            q630.a aVar2 = q630.a.a;
            q630 D = p490.D(txj0.f(aVar2, 1.0f), p490.x(M), 14);
            Object x = M.x();
            if (x == a.C0011a.a) {
                x = new oc0(4);
                M.R(x);
            }
            q630 b = egi0.b(D, false, (izs) x);
            dt1.a.getClass();
            androidx.compose.foundation.layout.c a = androidx.compose.foundation.layout.b.a(androidx.compose.foundation.layout.a.c, dt1.a.n, M, 48);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D2 = M.D();
            q630 c = qri.c(M, b);
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
            k9q0.w(M, a, cri.a.f);
            k9q0.w(M, D2, cri.a.e);
            k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
            k9q0.t(M, cri.a.h);
            k9q0.w(M, c, cri.a.d);
            e(s200.H(aVar2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 14, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 13), M, 6);
            f(r1mVar.a, s200.H(aVar2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 20, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 13), M, 48);
            Spanned spanned = r1mVar.b;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1412929589, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-elevation> (VkTheme.kt:170)");
            }
            iyk0 iyk0Var = rrv0.b;
            squ0 squ0Var = (squ0) M.r(iyk0Var);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            squ0Var.getClass();
            float f = tqu0.e;
            c(spanned, s200.H(aVar2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 13), izsVar, M, (i2 << 3) & 896);
            int i3 = r1mVar.c;
            boolean z = r1mVar.e;
            int i4 = r1mVar.d;
            String str = r1mVar.f;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1412929589, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-elevation> (VkTheme.kt:170)");
            }
            squ0 squ0Var2 = (squ0) M.r(iyk0Var);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            squ0Var2.getClass();
            d(i3, i4, z, str, s200.H(aVar2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 13), M, 0);
            M.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new yf4(r1mVar, izsVar, i, 0);
        }
    }

    public static final void c(Spanned spanned, q630 q630Var, izs izsVar, androidx.compose.runtime.a aVar, int i) {
        int i2;
        androidx.compose.runtime.a aVar2;
        androidx.compose.runtime.a M = aVar.M(418549923);
        if ((i & 6) == 0) {
            i2 = (M.y(spanned) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.J(q630Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= M.y(izsVar) ? 256 : 128;
        }
        if (M.t(i2 & 1, (i2 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(418549923, i2, -1, "com.vk.music.playlist.display.audiobook.presentation.Description (AudioBookDescriptionBottomSheetView.kt:115)");
            }
            us2 c = ws2.c(spanned, izsVar);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-473561179, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-typography> (VkTheme.kt:165)");
            }
            wuv0 wuv0Var = (wuv0) M.r(rrv0.c);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            aVar2 = M;
            yqv0.d(c, q630Var, 0L, 0, null, 0, false, 0, null, null, wuv0Var.X, aVar2, i2 & 112, 0, 8188);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            aVar2 = M;
            aVar2.h();
        }
        androidx.compose.runtime.f s = aVar2.s();
        if (s != null) {
            s.d = new bg4(i, 0, spanned, q630Var, izsVar);
        }
    }

    public static final void d(final int i, final int i2, final boolean z, final String str, final q630 q630Var, androidx.compose.runtime.a aVar, final int i3) {
        androidx.compose.runtime.a aVar2;
        String f;
        androidx.compose.runtime.a M = aVar.M(128147185);
        int i4 = i3 | (M.o(i) ? 4 : 2) | (M.o(i2) ? 32 : 16) | (M.l(z) ? 256 : 128) | (M.J(str) ? 2048 : 1024) | (M.J(q630Var) ? 16384 : 8192);
        if (M.t(i4 & 1, (i4 & 9363) != 9362)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(128147185, i4, -1, "com.vk.music.playlist.display.audiobook.presentation.Footer (AudioBookDescriptionBottomSheetView.kt:134)");
            }
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-473561179, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-typography> (VkTheme.kt:165)");
            }
            wuv0 wuv0Var = (wuv0) M.r(rrv0.c);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            frv0 frv0Var = wuv0Var.X;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            long j = ylu0Var.getText().p;
            Context context = (Context) M.r(AndroidCompositionLocals_androidKt.b);
            int i5 = new MusicTrack(0, null, null, null, i, 0, null, null, null, 0, false, false, 0, null, false, null, null, false, null, null, null, null, null, null, 0L, 0, false, 0L, null, false, false, false, null, null, null, null, false, false, 0, null, false, 0, false, null, null, false, 0, null, false, null, null, null, -17, 1048575, null).f;
            long j2 = i5 % 60;
            int i6 = (i5 % 3600) / 60;
            int i7 = i5 / 3600;
            if (i7 > 0) {
                f = enj.f(R.plurals.music_hours, i7, context);
                String f2 = enj.f(R.plurals.music_minutes, i6, context);
                if (i6 > 0) {
                    f = v1v.a(' ', f, f2);
                }
            } else {
                f = i6 > 0 ? enj.f(R.plurals.music_minutes, i6, context) : enj.f(R.plurals.music_seconds, (int) j2, context);
            }
            yqv0.c(f.toString(), q630Var, j, null, null, 0, 0, null, 0, false, 0, 0, null, frv0Var, M, (i4 >> 9) & 112, 0, 8184);
            aVar2 = M;
            yqv0.c(d370.O(R.string.music_age_limit, new Object[]{Integer.valueOf(i2)}, aVar2), null, j, null, null, 0, 0, null, 0, false, 0, 0, null, frv0Var, M, 0, 0, 8186);
            if (z) {
                aVar2.K(-592411353);
                yqv0.c(d370.N(R.string.music_profanity, 0, aVar2), null, j, null, null, 0, 0, null, 0, false, 0, 0, null, frv0Var, aVar2, 0, 0, 8186);
            } else {
                aVar2.K(-597199055);
            }
            aVar2.j();
            if (str == null) {
                aVar2.K(-592228051);
            } else {
                aVar2.K(-592228050);
                yqv0.c(str, null, j, null, null, 0, 0, null, 0, false, 0, 0, null, frv0Var, aVar2, 0, 0, 8186);
            }
            aVar2.j();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            aVar2 = M;
            aVar2.h();
        }
        androidx.compose.runtime.f s = aVar2.s();
        if (s != null) {
            s.d = new wzs(i, i2, z, str, q630Var, i3) { // from class: xsna.ag4
                public final /* synthetic */ int b;
                public final /* synthetic */ int c;
                public final /* synthetic */ boolean d;
                public final /* synthetic */ String e;
                public final /* synthetic */ q630 f;

                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int I = ne7.I(1);
                    dg4.d(this.b, this.c, this.d, this.e, this.f, (androidx.compose.runtime.a) obj, I);
                    return s3q0.a;
                }
            };
        }
    }

    public static final void e(q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a aVar2;
        androidx.compose.runtime.a M = aVar.M(-1205542624);
        if (M.t(i & 1, (i & 3) != 2)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1205542624, i, -1, "com.vk.music.playlist.display.audiobook.presentation.Header (AudioBookDescriptionBottomSheetView.kt:80)");
            }
            aVar2 = M;
            yqv0.c(d370.N(R.string.music_audio_book_about_book, 0, M), q630Var, wlb0.h(M).getText().m, null, null, 0, 0, null, 0, false, 0, 0, null, wlb0.l(M).g, aVar2, 48, 0, 8184);
            jqu0.a(txj0.f(s200.H(q630.a.a, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 14, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 13), 1.0f), wlb0.h(aVar2).p().a, (float) 0.5d, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, aVar2, 390, 8);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            aVar2 = M;
            aVar2.h();
        }
        androidx.compose.runtime.f s = aVar2.s();
        if (s != null) {
            s.d = new zf4(q630Var, i, 0);
        }
    }

    public static final void f(String str, q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a M = aVar.M(60997552);
        int i2 = i | (M.J(str) ? 4 : 2);
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(60997552, i2, -1, "com.vk.music.playlist.display.audiobook.presentation.Title (AudioBookDescriptionBottomSheetView.kt:100)");
            }
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-473561179, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-typography> (VkTheme.kt:165)");
            }
            wuv0 wuv0Var = (wuv0) M.r(rrv0.c);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            frv0 frv0Var = wuv0Var.q;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            yqv0.c(str, q630Var, ylu0Var.getText().m, null, null, 0, 0, null, 0, false, 0, 0, null, frv0Var, M, i2 & Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE, 0, 8184);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new cg4(str, q630Var, i, 0);
        }
    }
}

package xsna;

import android.graphics.ColorFilter;
import android.graphics.PorterDuffColorFilter;
import android.os.Build;
import com.unity3d.services.UnityAdsConstants;
import com.vungle.ads.internal.protos.Sdk;
import xsna.chs;
import xsna.q630;
import xsna.wkj;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class zai implements a0t {
    public final /* synthetic */ int b;

    public /* synthetic */ zai(int i) {
        this.b = i;
    }

    @Override // xsna.a0t
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        int i;
        ColorFilter porterDuffColorFilter;
        switch (this.b) {
            case 0:
                lg90 lg90Var = (lg90) obj3;
                androidx.compose.runtime.a aVar = (androidx.compose.runtime.a) obj4;
                int intValue = ((Integer) obj5).intValue();
                if ((intValue & 384) == 0) {
                    intValue |= (intValue & 512) == 0 ? aVar.J(lg90Var) : aVar.y(lg90Var) ? 256 : 128;
                }
                if (aVar.t(intValue & 1, (intValue & 1153) != 1152)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(275923769, intValue, -1, "com.vk.catalog.mvi.block.music.impl.artists.mix.ComposableSingletons$ArtistMixCardKt.lambda$275923769.<anonymous> (ArtistMixCard.kt:156)");
                    }
                    r0v0.a(lg90Var, null, null, wkj.a.a, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, null, null, aVar, 3080 | ((intValue >> 6) & 14), 246);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar.h();
                }
                break;
            case 1:
                lg90 lg90Var2 = (lg90) obj3;
                androidx.compose.runtime.a aVar2 = (androidx.compose.runtime.a) obj4;
                int intValue2 = ((Integer) obj5).intValue();
                if ((intValue2 & 384) == 0) {
                    intValue2 |= (intValue2 & 512) == 0 ? aVar2.J(lg90Var2) : aVar2.y(lg90Var2) ? 256 : 128;
                }
                if (aVar2.t(intValue2 & 1, (intValue2 & 1153) != 1152)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(858942453, intValue2, -1, "com.vk.games.presentation.components.ComposableSingletons$GamesCatalogPWAModalBottomSheetContentKt.lambda$858942453.<anonymous> (GamesCatalogPWAModalBottomSheetContent.kt:60)");
                    }
                    vjw.a(lg90Var2, null, null, null, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, aVar2, 56 | ((intValue2 >> 6) & 14), Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar2.h();
                }
                break;
            default:
                chs chsVar = (chs) obj2;
                lg90 lg90Var3 = (lg90) obj3;
                androidx.compose.runtime.a aVar3 = (androidx.compose.runtime.a) obj4;
                int intValue3 = ((Integer) obj5).intValue();
                float f = nz40.a;
                float f2 = nz40.b;
                if ((intValue3 & 48) == 0) {
                    i = (aVar3.J(chsVar) ? 32 : 16) | intValue3;
                } else {
                    i = intValue3;
                }
                if ((intValue3 & 384) == 0) {
                    i |= (intValue3 & 512) == 0 ? aVar3.J(lg90Var3) : aVar3.y(lg90Var3) ? 256 : 128;
                }
                if (aVar3.t(i & 1, (i & 1169) != 1168)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-1129568080, i, -1, "com.vk.newsfeed.posting.music_picker.presentation.view.ComplexCoverImage.<anonymous> (MusicPlaylistCell.kt:210)");
                    }
                    boolean z = chsVar instanceof chs.c;
                    q630.a aVar4 = q630.a.a;
                    if (z) {
                        aVar3.K(106203552);
                        q630 q = txj0.q(aVar4, f2);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                        }
                        iyk0 iyk0Var = rrv0.a;
                        ylu0 ylu0Var = (ylu0) aVar3.r(iyk0Var);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                        q630 m = hr80.m(q, ylu0Var.getBackground().x, vog0.b(f));
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                        }
                        ylu0 ylu0Var2 = (ylu0) aVar3.r(iyk0Var);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                        y18 a = aqw.a(0.5f, ylu0Var2.getImage().a);
                        ja8.a(ahn.E(r18.b(a.a, a.b, m, vog0.b(f)), "MusicPickerPlaylistCover"), aVar3, 0);
                        aVar3.j();
                    } else if ((chsVar instanceof chs.b) || (chsVar instanceof chs.a)) {
                        aVar3.K(107061725);
                        q630 m2 = hr80.m(txj0.q(aVar4, f2), wlb0.h(aVar3).getBackground().x, vog0.b(f));
                        y18 a2 = aqw.a(0.5f, wlb0.h(aVar3).getImage().a);
                        q630 E = ahn.E(r18.b(a2.a, a2.b, m2, vog0.b(f)), "MusicPickerPlaylistCover");
                        qzu0.a.getClass();
                        lg90 f1 = qzu0.f1(aVar3);
                        long j = wlb0.h(aVar3).getIcon().l;
                        if (Build.VERSION.SDK_INT >= 29) {
                            se7.b();
                            porterDuffColorFilter = re7.b(f870.H(j), z42.a(5));
                        } else {
                            porterDuffColorFilter = new PorterDuffColorFilter(f870.H(j), z42.b(5));
                        }
                        vjw.a(f1, null, E, null, wkj.a.f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, new oe7(j, 5, porterDuffColorFilter), aVar3, 24584, 40);
                        aVar3.j();
                    } else {
                        aVar3.K(108110703);
                        q630 d = rte0.d(txj0.q(aVar4, f2), vog0.b(f));
                        float f3 = 1;
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                        }
                        ylu0 ylu0Var3 = (ylu0) aVar3.r(rrv0.a);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                        y18 a3 = aqw.a(f3, ylu0Var3.getImage().a);
                        vjw.a(lg90Var3, null, ahn.E(r18.b(a3.a, a3.b, d, vog0.b(f)), "MusicPickerPlaylistCover"), null, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, aVar3, ((i >> 6) & 14) | 8, 120);
                        aVar3.j();
                    }
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar3.h();
                }
                break;
        }
        return s3q0.a;
    }
}

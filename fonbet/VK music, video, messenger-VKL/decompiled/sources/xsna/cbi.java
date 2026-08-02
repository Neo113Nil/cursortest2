package xsna;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import android.graphics.ColorFilter;
import android.graphics.PorterDuffColorFilter;
import android.os.Build;
import com.unity3d.services.UnityAdsConstants;
import xsna.chs;
import xsna.q630;
import xsna.wkj;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class cbi implements a0t {
    public final /* synthetic */ int b;

    public /* synthetic */ cbi(int i) {
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
                        androidx.compose.runtime.b.f(-331512130, intValue, -1, "com.vk.catalog.mvi.block.music.impl.artists.slider.ComposableSingletons$ArtistSliderCardKt.lambda$-331512130.<anonymous> (ArtistSliderCard.kt:179)");
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
                chs chsVar = (chs) obj2;
                lg90 lg90Var2 = (lg90) obj3;
                androidx.compose.runtime.a aVar2 = (androidx.compose.runtime.a) obj4;
                int intValue2 = ((Integer) obj5).intValue();
                float f = nz40.a;
                float f2 = nz40.b;
                if ((intValue2 & 48) == 0) {
                    i = (aVar2.J(chsVar) ? 32 : 16) | intValue2;
                } else {
                    i = intValue2;
                }
                if ((intValue2 & 384) == 0) {
                    i |= (intValue2 & 512) == 0 ? aVar2.J(lg90Var2) : aVar2.y(lg90Var2) ? 256 : 128;
                }
                if (aVar2.t(i & 1, (i & 1169) != 1168)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-810323756, i, -1, "com.vk.newsfeed.posting.music_picker.presentation.view.SimpleCoverImage.<anonymous> (MusicPlaylistCell.kt:294)");
                    }
                    boolean z = chsVar instanceof chs.c;
                    q630.a aVar3 = q630.a.a;
                    if (z) {
                        aVar2.K(1656266492);
                        q630 q = txj0.q(aVar3, f2);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                        }
                        iyk0 iyk0Var = rrv0.a;
                        ylu0 ylu0Var = (ylu0) aVar2.r(iyk0Var);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                        q630 m = hr80.m(q, ylu0Var.getBackground().x, vog0.b(f));
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                        }
                        ylu0 ylu0Var2 = (ylu0) aVar2.r(iyk0Var);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                        y18 a = aqw.a(0.5f, ylu0Var2.getImage().a);
                        ja8.a(ahn.E(r18.b(a.a, a.b, m, vog0.b(f)), "MusicPickerPlaylistCover"), aVar2, 0);
                        aVar2.j();
                    } else if ((chsVar instanceof chs.b) || (chsVar instanceof chs.a)) {
                        aVar2.K(1657124665);
                        q630 m2 = hr80.m(txj0.q(aVar3, f2), wlb0.h(aVar2).getBackground().x, vog0.b(f));
                        y18 a2 = aqw.a(0.5f, wlb0.h(aVar2).getImage().a);
                        q630 E = ahn.E(r18.b(a2.a, a2.b, m2, vog0.b(f)), "MusicPickerPlaylistCover");
                        qzu0.a.getClass();
                        lg90 f1 = qzu0.f1(aVar2);
                        long j = wlb0.h(aVar2).getIcon().l;
                        if (Build.VERSION.SDK_INT >= 29) {
                            se7.b();
                            porterDuffColorFilter = re7.b(f870.H(j), z42.a(5));
                        } else {
                            porterDuffColorFilter = new PorterDuffColorFilter(f870.H(j), z42.b(5));
                        }
                        vjw.a(f1, null, E, null, wkj.a.f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, new oe7(j, 5, porterDuffColorFilter), aVar2, 24584, 40);
                        aVar2.j();
                    } else {
                        aVar2.K(1658173643);
                        q630 d = rte0.d(txj0.q(aVar3, f2), vog0.b(f));
                        float f3 = 1;
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                        }
                        ylu0 ylu0Var3 = (ylu0) aVar2.r(rrv0.a);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                        y18 a3 = aqw.a(f3, ylu0Var3.getImage().a);
                        vjw.a(lg90Var2, null, ahn.E(r18.b(a3.a, a3.b, d, vog0.b(f)), "MusicPickerPlaylistCover"), null, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, aVar2, ((i >> 6) & 14) | 8, 120);
                        aVar2.j();
                    }
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar2.h();
                }
                break;
            default:
                boolean booleanValue = ((Boolean) obj3).booleanValue();
                qko0 qko0Var = (qko0) obj5;
                String obj6 = ((CharSequence) obj4).subSequence(qko0.f(qko0Var.a), qko0.e(qko0Var.a)).toString();
                Intent putExtra = new Intent().setAction("android.intent.action.PROCESS_TEXT").setType("text/plain").putExtra("android.intent.extra.PROCESS_TEXT_READONLY", booleanValue);
                ActivityInfo activityInfo = ((ResolveInfo) obj2).activityInfo;
                Intent className = putExtra.setClassName(activityInfo.packageName, activityInfo.name);
                className.putExtra("android.intent.extra.PROCESS_TEXT", obj6);
                ((Context) obj).startActivity(className);
                break;
        }
        return s3q0.a;
    }
}

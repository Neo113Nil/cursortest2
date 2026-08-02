package xsna;

import android.graphics.ColorFilter;
import android.graphics.PorterDuffColorFilter;
import android.os.Build;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.serialize.Serializer;
import com.vk.dto.music.Thumb;
import xsna.chs;
import xsna.q630;
import xsna.wkj;

/* compiled from: OfflinePodcastEpisodesMviComposeComponent.kt */
/* loaded from: classes3.dex */
public final class tsp implements efj {
    public static final float b = 72;
    public static final float c = 6;
    public final wh50 a;

    public tsp(Thumb thumb) {
        this.a = androidx.compose.runtime.k.b(thumb);
    }

    @Override // xsna.efj
    public final void a(int i, long j, androidx.compose.runtime.a aVar, q630 q630Var) {
        long j2;
        int i2;
        String str;
        androidx.compose.runtime.a M = aVar.M(6775811);
        if ((i & 6) == 0) {
            j2 = j;
            i2 = (M.p(j2) ? 4 : 2) | i;
        } else {
            j2 = j;
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.J(q630Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= M.J(this) ? 256 : 128;
        }
        if (M.t(i2 & 1, (i2 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(6775811, i2, -1, "com.vk.music.podcast.impl.ui.offlinepage.presentation.compose.EpisodeCover.invoke (OfflinePodcastEpisodesMviComposeComponent.kt:410)");
            }
            azl azlVar = (azl) M.r(uvi.h);
            Thumb thumb = (Thumb) ((zak0) this.a).getValue();
            if (thumb != null) {
                int I0 = (int) azlVar.I0(b);
                Serializer.c<Thumb> cVar = Thumb.CREATOR;
                str = thumb.Ab(I0, false);
            } else {
                str = null;
            }
            if (str == null) {
                str = "";
            }
            fwu0.c(txj0.s(q630Var, uco.c(j2), uco.b(j2)), null, str, null, null, null, null, kai.c(189240978, new a0t() { // from class: xsna.ssp
                @Override // xsna.a0t
                public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
                    int i3;
                    chs chsVar = (chs) obj2;
                    lg90 lg90Var = (lg90) obj3;
                    androidx.compose.runtime.a aVar2 = (androidx.compose.runtime.a) obj4;
                    int intValue = ((Integer) obj5).intValue();
                    if ((intValue & 48) == 0) {
                        i3 = (aVar2.J(chsVar) ? 32 : 16) | intValue;
                    } else {
                        i3 = intValue;
                    }
                    if ((intValue & 384) == 0) {
                        i3 |= (intValue & 512) == 0 ? aVar2.J(lg90Var) : aVar2.y(lg90Var) ? 256 : 128;
                    }
                    if (aVar2.t(i3 & 1, (i3 & 1169) != 1168)) {
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(189240978, i3, -1, "com.vk.music.podcast.impl.ui.offlinepage.presentation.compose.EpisodeCover.invoke.<anonymous> (OfflinePodcastEpisodesMviComposeComponent.kt:418)");
                        }
                        boolean z = chsVar instanceof chs.b;
                        q630.a aVar3 = q630.a.a;
                        if (z || (chsVar instanceof chs.a) || (chsVar instanceof chs.c)) {
                            aVar2.K(1471958885);
                            tsp.this.b(txj0.d(aVar3, 1.0f), aVar2, 6);
                            aVar2.j();
                        } else {
                            aVar2.K(-1613823555);
                            q630 d = txj0.d(aVar3, 1.0f);
                            float f = (float) 0.5d;
                            if (androidx.compose.runtime.b.d()) {
                                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                            }
                            ylu0 ylu0Var = (ylu0) aVar2.r(rrv0.a);
                            if (androidx.compose.runtime.b.d()) {
                                androidx.compose.runtime.b.e();
                            }
                            y18 a = aqw.a(f, ylu0Var.getImage().a);
                            vjw.a(lg90Var, null, r18.b(a.a, a.b, d, vog0.b(tsp.c)), null, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, aVar2, 56 | ((i3 >> 6) & 14), 120);
                            aVar2.j();
                        }
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                    } else {
                        aVar2.h();
                    }
                    return s3q0.a;
                }
            }, M), M, 100663296, 250);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new sgp(this, j2, q630Var, i, 1);
        }
    }

    public final void b(q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        ColorFilter porterDuffColorFilter;
        androidx.compose.runtime.a M = aVar.M(-477367336);
        if (M.t(i & 1, (i & 3) != 2)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-477367336, i, -1, "com.vk.music.podcast.impl.ui.offlinepage.presentation.compose.EpisodeCover.PlaceHolderImage (OfflinePodcastEpisodesMviComposeComponent.kt:440)");
            }
            long j = wlb0.h(M).getBackground().x;
            float f = c;
            q630 m = hr80.m(q630Var, j, vog0.b(f));
            y18 a = aqw.a((float) 0.5d, wlb0.h(M).getImage().a);
            q630 b2 = r18.b(a.a, a.b, m, vog0.b(f));
            qzu0.a.getClass();
            lg90 i2 = qzu0.i(M);
            long j2 = wlb0.h(M).getIcon().l;
            if (Build.VERSION.SDK_INT >= 29) {
                se7.b();
                porterDuffColorFilter = re7.b(f870.H(j2), z42.a(5));
            } else {
                porterDuffColorFilter = new PorterDuffColorFilter(f870.H(j2), z42.b(5));
            }
            vjw.a(i2, null, b2, null, wkj.a.f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, new oe7(j2, 5, porterDuffColorFilter), M, 24632, 40);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new cx(this, q630Var, i, 6);
        }
    }
}

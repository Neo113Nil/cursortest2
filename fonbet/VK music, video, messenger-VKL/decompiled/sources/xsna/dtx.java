package xsna;

import androidx.compose.ui.graphics.e;
import com.unity3d.services.UnityAdsConstants;
import com.vk.clips.upload.ui.impl.compose.views.island.IslandPart;
import xsna.q630;

/* compiled from: IslandExt.kt */
/* loaded from: classes17.dex */
public final class dtx {

    /* compiled from: IslandExt.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[IslandPart.values().length];
            try {
                iArr[IslandPart.Top.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[IslandPart.Middle.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[IslandPart.Bottom.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final q630 a(q630 q630Var, IslandPart islandPart, long j) {
        u890 u890Var;
        r5j0 d;
        u890 u890Var2;
        if (islandPart == IslandPart.None) {
            return q630Var;
        }
        int[] iArr = a.$EnumSwitchMapping$0;
        if (iArr[islandPart.ordinal()] == 1) {
            u890Var = s200.n(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 13);
        } else {
            float f = 0;
            u890Var = new u890(f, f, f, f);
        }
        q630 C = s200.C(q630.a.a, u890Var);
        int i = iArr[islandPart.ordinal()];
        e.a aVar = androidx.compose.ui.graphics.e.a;
        if (i == 1) {
            float f2 = 20;
            d = vog0.d(f2, f2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 12);
        } else if (i == 2 || i != 3) {
            d = aVar;
        } else {
            float f3 = 20;
            d = vog0.d(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f3, f3, 3);
        }
        q630 m = hr80.m(rte0.d(C, d), j, aVar);
        if (iArr[islandPart.ordinal()] == 3) {
            u890Var2 = s200.n(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 10, 7);
        } else {
            float f4 = 0;
            u890Var2 = new u890(f4, f4, f4, f4);
        }
        return q630Var.g(s200.C(m, u890Var2));
    }
}

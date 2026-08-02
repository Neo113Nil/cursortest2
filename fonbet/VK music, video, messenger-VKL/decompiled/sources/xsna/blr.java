package xsna;

import android.view.View;
import com.unity3d.services.UnityAdsConstants;
import com.vk.friends.discover.Direction;
import com.vk.friends.discover.UserDiscoverState;

/* compiled from: FirstCardAnimationProvider.kt */
/* loaded from: classes13.dex */
public final class blr extends of6 {

    /* compiled from: FirstCardAnimationProvider.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Direction.values().length];
            try {
                iArr[Direction.Left.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Direction.Right.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.of6
    public final void u(View view, UserDiscoverState userDiscoverState) {
        if (view instanceof zov) {
            int i = a.$EnumSwitchMapping$0[userDiscoverState.c().ordinal()];
            if (i == 1) {
                float min = Math.min(Math.abs(userDiscoverState.d) / (userDiscoverState.b * 0.15f), 1.0f);
                zov zovVar = (zov) view;
                zovVar.getForegroundPositive().setAlpha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                zovVar.getIconPositive().setAlpha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                zovVar.getTitlePositive().setAlpha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                zovVar.getForegroundNegative().setAlpha(0.72f * min);
                zovVar.getIconNegative().setAlpha(min);
                zovVar.getTitleNegative().setAlpha(min);
                return;
            }
            if (i != 2) {
                return;
            }
            float min2 = Math.min(Math.abs(userDiscoverState.d) / (userDiscoverState.b * 0.15f), 1.0f);
            zov zovVar2 = (zov) view;
            zovVar2.getForegroundPositive().setAlpha(0.72f * min2);
            zovVar2.getIconPositive().setAlpha(min2);
            zovVar2.getTitlePositive().setAlpha(min2);
            zovVar2.getForegroundNegative().setAlpha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            zovVar2.getIconNegative().setAlpha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            zovVar2.getTitleNegative().setAlpha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        }
    }

    @Override // xsna.of6
    public final void z(View view, UserDiscoverState userDiscoverState) {
        view.setRotation(Math.min(Math.min(Math.abs(userDiscoverState.d) / ((thq0) this.a).a(userDiscoverState), 1.0f) * 10.0f * (userDiscoverState.c() == Direction.Left ? -1.0f : 1.0f), 10.0f));
    }
}

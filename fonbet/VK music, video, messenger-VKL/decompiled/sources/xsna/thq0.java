package xsna;

import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import com.vk.friends.discover.Direction;
import com.vk.friends.discover.UserDiscoverState;

/* compiled from: UserDiscoverAnimationProviderV1.kt */
/* loaded from: classes13.dex */
public final class thq0 {
    public final float a = iah0.a(12.0f);
    public final int b = 300;
    public final LinearInterpolator c = new LinearInterpolator();
    public final int d = 200;
    public final DecelerateInterpolator e = new DecelerateInterpolator();
    public final int f = 300;
    public final AccelerateInterpolator g = new AccelerateInterpolator();
    public final int h = 150;
    public final LinearInterpolator i = new LinearInterpolator();
    public final int j = 150;
    public final LinearInterpolator k = new LinearInterpolator();
    public final int l = 300;
    public final DecelerateInterpolator m = new DecelerateInterpolator();
    public final long n = 500;
    public final long o = 1000;
    public final long p = 1000;
    public final blr q = new blr(this);
    public final r0i0 r = new r0i0(this);
    public final fqo0 s = new fqo0(this);

    /* compiled from: UserDiscoverAnimationProviderV1.kt */
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

    public final float a(UserDiscoverState userDiscoverState) {
        return (userDiscoverState.b * 100.0f) / 334.0f;
    }

    public final float b(UserDiscoverState userDiscoverState) {
        float f;
        int i;
        int abs = Math.abs(userDiscoverState.d);
        int abs2 = Math.abs(userDiscoverState.e);
        if (abs < abs2) {
            f = abs2 * 2.0f;
            i = userDiscoverState.c;
        } else {
            f = abs * 2.0f;
            i = userDiscoverState.b;
        }
        return Math.min(f / i, 1.0f);
    }

    public final float c(UserDiscoverState userDiscoverState) {
        float max = Math.max(0, Math.abs(userDiscoverState.d) - userDiscoverState.b);
        float max2 = Math.max(0, Math.abs(userDiscoverState.e) - userDiscoverState.c);
        return Math.min(max < max2 ? max2 / userDiscoverState.c : max / userDiscoverState.b, 1.0f);
    }
}

package xsna;

import com.unity3d.services.UnityAdsConstants;
import com.vk.editor.timeline.api.YIndexShift;
import com.vk.editor.timeline.state.magnet.MagnetType;
import java.util.Collection;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: MagnetSearchEngine.kt */
/* loaded from: classes18.dex */
public abstract class jc00 {
    public final dck0 a;
    public MagnetType b = MagnetType.None;
    public float c = Float.MAX_VALUE;
    public float d;
    public float e;

    /* compiled from: MagnetSearchEngine.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[YIndexShift.Mode.values().length];
            try {
                iArr[YIndexShift.Mode.MIDDLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[YIndexShift.Mode.REPLACE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public jc00(dck0 dck0Var) {
        this.a = dck0Var;
    }

    public final ic00 a(gp6 gp6Var) {
        YIndexShift yIndexShift;
        int t = gp6Var.t();
        float p = gp6Var.p();
        d().getClass();
        float g = ywo0.g(1);
        float f = gip0.n;
        d().getClass();
        float g2 = (((g + f) / 2) + p) / (ywo0.g(1) + f);
        int i = g2 < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? -1 : 0;
        float abs = Math.abs(g2) - ((int) Math.abs(g2));
        if (UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT <= g2 && g2 <= 0.3f) {
            yIndexShift = new YIndexShift(t - ((int) g2), YIndexShift.Mode.REPLACE);
        } else if (abs > 0.3f && abs < 0.7f) {
            yIndexShift = new YIndexShift(t - ((int) (g2 + i)), YIndexShift.Mode.REPLACE);
        } else if (UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT > abs || abs > 0.3f) {
            yIndexShift = new YIndexShift((t - ((int) g2)) + (g2 < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 2 : -1), YIndexShift.Mode.MIDDLE);
        } else {
            yIndexShift = new YIndexShift((t - ((int) g2)) - i, YIndexShift.Mode.MIDDLE);
        }
        long c = d().r.c(gp6Var.q()) + gp6Var.H();
        int i2 = yIndexShift.a;
        if (e(i2, c, gp6Var) && yIndexShift.b == YIndexShift.Mode.REPLACE) {
            yIndexShift = new YIndexShift(i2, YIndexShift.Mode.MIDDLE);
        }
        int i3 = a.$EnumSwitchMapping$0[yIndexShift.b.ordinal()];
        if (i3 == 1) {
            return b(gp6Var, yIndexShift);
        }
        if (i3 == 2) {
            return c(gp6Var, yIndexShift);
        }
        throw new NoWhenBranchMatchedException();
    }

    public abstract ic00 b(gp6 gp6Var, YIndexShift yIndexShift);

    public abstract ic00 c(gp6 gp6Var, YIndexShift yIndexShift);

    public final ywo0 d() {
        return ((mwo0) this.a.c).d;
    }

    public final boolean e(int i, long j, gp6 gp6Var) {
        List list = (List) j5g.b0(i, d().g);
        if (list == null) {
            return false;
        }
        List<gp6> list2 = list;
        if ((list2 instanceof Collection) && list2.isEmpty()) {
            return false;
        }
        for (gp6 gp6Var2 : list2) {
            if (!epx.f(gp6Var2.m(), gp6Var.m())) {
                long duration = gp6Var2.getDuration() + gp6Var2.H();
                long duration2 = gp6Var.getDuration() + j;
                if (j < duration && duration2 > gp6Var2.H()) {
                    return true;
                }
            }
        }
        return false;
    }
}

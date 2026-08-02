package xsna;

import android.content.res.Resources;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.state.ToggleableState;
import com.unity3d.services.UnityAdsConstants;
import com.vkontakte.android.R;
import java.util.Collection;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: AndroidComposeViewAccessibilityDelegateCompat.android.kt */
/* loaded from: classes11.dex */
public final class b62 {

    /* compiled from: AndroidComposeViewAccessibilityDelegateCompat.android.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ToggleableState.values().length];
            try {
                iArr[ToggleableState.On.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ToggleableState.Off.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ToggleableState.Indeterminate.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final boolean a(igi0 igi0Var) {
        xfi0 k = igi0Var.k();
        return !k.b.b(ngi0.j);
    }

    public static final boolean b(igi0 igi0Var, Resources resources) {
        List list = (List) zfi0.a(igi0Var.d, ngi0.a);
        return !qxm0.o(igi0Var) && (igi0Var.d.d || (igi0Var.q() && ((list != null ? (String) j5g.a0(list) : null) != null || f(igi0Var) != null || e(igi0Var, resources) != null || d(igi0Var))));
    }

    public static final LayoutNode c(LayoutNode layoutNode, izs<? super LayoutNode, Boolean> izsVar) {
        for (LayoutNode I = layoutNode.I(); I != null; I = I.I()) {
            if (izsVar.invoke(I).booleanValue()) {
                return I;
            }
        }
        return null;
    }

    public static final boolean d(igi0 igi0Var) {
        ToggleableState toggleableState = (ToggleableState) zfi0.a(igi0Var.d, ngi0.K);
        xfi0 xfi0Var = igi0Var.d;
        plg0 plg0Var = (plg0) zfi0.a(xfi0Var, ngi0.z);
        boolean z = toggleableState != null;
        if (((Boolean) zfi0.a(xfi0Var, ngi0.J)) == null || (plg0Var != null && plg0Var.a == 4)) {
            return z;
        }
        return true;
    }

    public static final String e(igi0 igi0Var, Resources resources) {
        Collection collection;
        CharSequence charSequence;
        Object a2 = zfi0.a(igi0Var.d, ngi0.b);
        xfi0 xfi0Var = igi0Var.d;
        ToggleableState toggleableState = (ToggleableState) zfi0.a(xfi0Var, ngi0.K);
        plg0 plg0Var = (plg0) zfi0.a(xfi0Var, ngi0.z);
        if (toggleableState != null) {
            int i = a.$EnumSwitchMapping$0[toggleableState.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    if (a2 == null) {
                        a2 = resources.getString(R.string.indeterminate);
                    }
                } else if (plg0Var != null && plg0Var.a == 2 && a2 == null) {
                    a2 = resources.getString(R.string.state_off);
                }
            } else if (plg0Var != null && plg0Var.a == 2 && a2 == null) {
                a2 = resources.getString(R.string.state_on);
            }
        }
        Boolean bool = (Boolean) zfi0.a(xfi0Var, ngi0.J);
        if (bool != null) {
            boolean booleanValue = bool.booleanValue();
            if ((plg0Var == null || plg0Var.a != 4) && a2 == null) {
                a2 = booleanValue ? resources.getString(R.string.selected) : resources.getString(R.string.not_selected);
            }
        }
        t1e0 t1e0Var = (t1e0) zfi0.a(xfi0Var, ngi0.c);
        if (t1e0Var != null) {
            if (t1e0Var != t1e0.d) {
                if (a2 == null) {
                    bwf<Float> bwfVar = t1e0Var.b;
                    float floatValue = bwfVar.c().floatValue() - bwfVar.getStart().floatValue() == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0.0f : (t1e0Var.a - bwfVar.getStart().floatValue()) / (bwfVar.c().floatValue() - bwfVar.getStart().floatValue());
                    if (floatValue < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                        floatValue = 0.0f;
                    }
                    if (floatValue > 1.0f) {
                        floatValue = 1.0f;
                    }
                    a2 = resources.getString(R.string.template_percent, Integer.valueOf(floatValue == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : floatValue == 1.0f ? 100 : swe0.g(Math.round(floatValue * 100), 1, 99)));
                }
            } else if (a2 == null) {
                a2 = resources.getString(R.string.in_progress);
            }
        }
        sgi0<us2> sgi0Var = ngi0.G;
        if (xfi0Var.b.b(sgi0Var)) {
            xfi0 k = new igi0(igi0Var.a, true, igi0Var.c, xfi0Var).k();
            Collection collection2 = (Collection) zfi0.a(k, ngi0.a);
            a2 = ((collection2 == null || collection2.isEmpty()) && ((collection = (Collection) zfi0.a(k, ngi0.C)) == null || collection.isEmpty()) && ((charSequence = (CharSequence) zfi0.a(k, sgi0Var)) == null || charSequence.length() == 0)) ? resources.getString(R.string.state_empty) : null;
        }
        return (String) a2;
    }

    public static final us2 f(igi0 igi0Var) {
        xfi0 xfi0Var = igi0Var.d;
        sgi0<List<String>> sgi0Var = ngi0.a;
        us2 us2Var = (us2) zfi0.a(xfi0Var, ngi0.G);
        List list = (List) zfi0.a(igi0Var.d, ngi0.C);
        return us2Var == null ? list != null ? (us2) j5g.a0(list) : null : us2Var;
    }
}

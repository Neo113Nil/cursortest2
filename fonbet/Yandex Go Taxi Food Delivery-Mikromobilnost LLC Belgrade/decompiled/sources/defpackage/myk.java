package defpackage;

import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import com.yandex.div.core.view2.divs.a;
import com.yandex.div.internal.widget.DivLayoutParams;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div2.DivSize;
import com.yandex.div2.DivSizeUnit;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class myk {
    public final m6o a;

    public myk(m6o m6oVar) {
        this.a = m6oVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00c4 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x007e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void a(View view, egk egkVar, rvo rvoVar, l6o l6oVar) {
        boolean z;
        boolean z2;
        int I;
        int i;
        int I2;
        DivLayoutParams divLayoutParams;
        c(egkVar.getHeight(), "height", egkVar.getId(), view.getResources().getDisplayMetrics(), rvoVar, l6oVar);
        int p = uml.p(egkVar.getHeight(), view.getResources().getDisplayMetrics(), rvoVar, view.getLayoutParams());
        boolean z3 = true;
        boolean z4 = false;
        if (view.getLayoutParams().height == p) {
            z = false;
        } else {
            view.getLayoutParams().height = p;
            z = true;
        }
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        DivLayoutParams divLayoutParams2 = layoutParams instanceof DivLayoutParams ? (DivLayoutParams) layoutParams : null;
        if (divLayoutParams2 != null) {
            float f = f(egkVar.getHeight(), rvoVar);
            if (divLayoutParams2.getVerticalWeight() != f) {
                divLayoutParams2.setVerticalWeight(f);
                z2 = true;
                t9l e = e(egkVar.getHeight());
                I = e != null ? a.I(e, view.getResources().getDisplayMetrics(), rvoVar) : 0;
                t9l d = d(egkVar.getHeight());
                i = Integer.MAX_VALUE;
                I2 = d != null ? a.I(d, view.getResources().getDisplayMetrics(), rvoVar) : Integer.MAX_VALUE;
                if (I > I2) {
                    I = 0;
                } else {
                    i = I2;
                }
                if (view.getMinimumHeight() != I) {
                    view.setMinimumHeight(I);
                    z4 = true;
                }
                ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
                divLayoutParams = layoutParams2 instanceof DivLayoutParams ? (DivLayoutParams) layoutParams2 : null;
                if (divLayoutParams == null || divLayoutParams.getMaxHeight() == i) {
                    z3 = z4;
                } else {
                    divLayoutParams.setMaxHeight(i);
                }
                if (!z3 || z2) {
                    view.requestLayout();
                    a.g(egkVar, rvoVar, view);
                }
                return;
            }
        }
        if (!z) {
            z2 = false;
            t9l e2 = e(egkVar.getHeight());
            if (e2 != null) {
            }
            t9l d2 = d(egkVar.getHeight());
            i = Integer.MAX_VALUE;
            if (d2 != null) {
            }
            if (I > I2) {
            }
            if (view.getMinimumHeight() != I) {
            }
            ViewGroup.LayoutParams layoutParams22 = view.getLayoutParams();
            if (layoutParams22 instanceof DivLayoutParams) {
            }
            if (divLayoutParams == null) {
                divLayoutParams.setMaxHeight(i);
                if (z3) {
                }
                view.requestLayout();
                a.g(egkVar, rvoVar, view);
            }
            z3 = z4;
            if (z3) {
            }
            view.requestLayout();
            a.g(egkVar, rvoVar, view);
        }
        z2 = true;
        t9l e22 = e(egkVar.getHeight());
        if (e22 != null) {
        }
        t9l d22 = d(egkVar.getHeight());
        i = Integer.MAX_VALUE;
        if (d22 != null) {
        }
        if (I > I2) {
        }
        if (view.getMinimumHeight() != I) {
        }
        ViewGroup.LayoutParams layoutParams222 = view.getLayoutParams();
        if (layoutParams222 instanceof DivLayoutParams) {
        }
        if (divLayoutParams == null) {
        }
        z3 = z4;
        if (z3) {
        }
        view.requestLayout();
        a.g(egkVar, rvoVar, view);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00c4 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x007e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void b(View view, egk egkVar, rvo rvoVar, l6o l6oVar) {
        boolean z;
        boolean z2;
        int I;
        int i;
        int I2;
        DivLayoutParams divLayoutParams;
        c(egkVar.getWidth(), "width", egkVar.getId(), view.getResources().getDisplayMetrics(), rvoVar, l6oVar);
        int p = uml.p(egkVar.getWidth(), view.getResources().getDisplayMetrics(), rvoVar, view.getLayoutParams());
        boolean z3 = true;
        boolean z4 = false;
        if (view.getLayoutParams().width == p) {
            z = false;
        } else {
            view.getLayoutParams().width = p;
            z = true;
        }
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        DivLayoutParams divLayoutParams2 = layoutParams instanceof DivLayoutParams ? (DivLayoutParams) layoutParams : null;
        if (divLayoutParams2 != null) {
            float f = f(egkVar.getWidth(), rvoVar);
            if (divLayoutParams2.getHorizontalWeight() != f) {
                divLayoutParams2.setHorizontalWeight(f);
                z2 = true;
                t9l e = e(egkVar.getWidth());
                I = e != null ? a.I(e, view.getResources().getDisplayMetrics(), rvoVar) : 0;
                t9l d = d(egkVar.getWidth());
                i = Integer.MAX_VALUE;
                I2 = d != null ? a.I(d, view.getResources().getDisplayMetrics(), rvoVar) : Integer.MAX_VALUE;
                if (I > I2) {
                    I = 0;
                } else {
                    i = I2;
                }
                if (view.getMinimumWidth() != I) {
                    view.setMinimumWidth(I);
                    z4 = true;
                }
                ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
                divLayoutParams = layoutParams2 instanceof DivLayoutParams ? (DivLayoutParams) layoutParams2 : null;
                if (divLayoutParams == null || divLayoutParams.getMaxWidth() == i) {
                    z3 = z4;
                } else {
                    divLayoutParams.setMaxWidth(i);
                }
                if (!z3 || z2) {
                    view.requestLayout();
                    a.g(egkVar, rvoVar, view);
                }
                return;
            }
        }
        if (!z) {
            z2 = false;
            t9l e2 = e(egkVar.getWidth());
            if (e2 != null) {
            }
            t9l d2 = d(egkVar.getWidth());
            i = Integer.MAX_VALUE;
            if (d2 != null) {
            }
            if (I > I2) {
            }
            if (view.getMinimumWidth() != I) {
            }
            ViewGroup.LayoutParams layoutParams22 = view.getLayoutParams();
            if (layoutParams22 instanceof DivLayoutParams) {
            }
            if (divLayoutParams == null) {
                divLayoutParams.setMaxWidth(i);
                if (z3) {
                }
                view.requestLayout();
                a.g(egkVar, rvoVar, view);
            }
            z3 = z4;
            if (z3) {
            }
            view.requestLayout();
            a.g(egkVar, rvoVar, view);
        }
        z2 = true;
        t9l e22 = e(egkVar.getWidth());
        if (e22 != null) {
        }
        t9l d22 = d(egkVar.getWidth());
        i = Integer.MAX_VALUE;
        if (d22 != null) {
        }
        if (I > I2) {
        }
        if (view.getMinimumWidth() != I) {
        }
        ViewGroup.LayoutParams layoutParams222 = view.getLayoutParams();
        if (layoutParams222 instanceof DivLayoutParams) {
        }
        if (divLayoutParams == null) {
        }
        z3 = z4;
        if (z3) {
        }
        view.requestLayout();
        a.g(egkVar, rvoVar, view);
    }

    public static void c(DivSize divSize, String str, String str2, DisplayMetrics displayMetrics, rvo rvoVar, l6o l6oVar) {
        t9l d;
        t9l e = e(divSize);
        if (e == null || (d = d(divSize)) == null || a.I(e, displayMetrics, rvoVar) <= a.I(d, displayMetrics, rvoVar)) {
            return;
        }
        l6oVar.e(new Throwable(String.format("Element has incorrect %s constraints (min size is bigger than max size). %sminSize: %s, maxSize: %s.", Arrays.copyOf(new Object[]{str, str2 != null ? String.format("Id: '%s', ", Arrays.copyOf(new Object[]{str2}, 1)) : "", g(e, rvoVar), g(d, rvoVar)}, 4))));
    }

    public static t9l d(DivSize divSize) {
        if (divSize instanceof j9l) {
            return ((j9l) divSize).b.b;
        }
        if (divSize instanceof i9l) {
            return ((i9l) divSize).b.a;
        }
        return null;
    }

    public static t9l e(DivSize divSize) {
        if (divSize instanceof j9l) {
            return ((j9l) divSize).b.c;
        }
        if (divSize instanceof i9l) {
            return ((i9l) divSize).b.b;
        }
        return null;
    }

    public static float f(DivSize divSize, rvo rvoVar) {
        Expression expression;
        i9l i9lVar = divSize instanceof i9l ? (i9l) divSize : null;
        if (i9lVar == null || (expression = i9lVar.b.c) == null) {
            return 0.0f;
        }
        return (float) ((Number) expression.a(rvoVar)).doubleValue();
    }

    public static String g(t9l t9lVar, rvo rvoVar) {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(((Number) t9lVar.b.a(rvoVar)).longValue());
        s9l s9lVar = DivSizeUnit.Converter;
        DivSizeUnit divSizeUnit = (DivSizeUnit) t9lVar.a.a(rvoVar);
        s9lVar.getClass();
        str = divSizeUnit.value;
        sb.append(str);
        return sb.toString();
    }
}

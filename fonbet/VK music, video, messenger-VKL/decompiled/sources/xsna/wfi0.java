package xsna;

import androidx.compose.ui.semantics.SemanticsPropertiesKt$ActionPropertyKey$1;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Lambda;
import xsna.ck;
import xsna.xzs;

/* compiled from: SemanticsProperties.kt */
/* loaded from: classes11.dex */
public final class wfi0 {
    public static final sgi0<ck<gzs<Boolean>>> A;
    public static final sgi0<ck<gzs<Boolean>>> B;
    public static final sgi0<ck<izs<List<Float>, Boolean>>> C;
    public static final sgi0<ck<izs<List<ljo0>, Boolean>>> a;
    public static final sgi0<ck<gzs<Boolean>>> b;
    public static final sgi0<ck<gzs<Boolean>>> c;
    public static final sgi0<ck<wzs<Float, Float, Boolean>>> d;
    public static final sgi0<wzs<ov70, spj<? super ov70>, Object>> e;
    public static final sgi0<ck<izs<Integer, Boolean>>> f;
    public static final sgi0<ck<izs<us2, Boolean>>> g;
    public static final sgi0<ck<izs<xbr, Boolean>>> h;
    public static final sgi0<ck<izs<Float, Boolean>>> i;
    public static final sgi0<ck<yzs<Integer, Integer, Boolean, Boolean>>> j;
    public static final sgi0<ck<izs<us2, Boolean>>> k;
    public static final sgi0<ck<izs<us2, Boolean>>> l;
    public static final sgi0<ck<izs<Boolean, Boolean>>> m;
    public static final sgi0<ck<gzs<Boolean>>> n;
    public static final sgi0<ck<izs<us2, Boolean>>> o;
    public static final sgi0<ck<gzs<Boolean>>> p;
    public static final sgi0<ck<gzs<Boolean>>> q;
    public static final sgi0<ck<gzs<Boolean>>> r;
    public static final sgi0<ck<gzs<Boolean>>> s;
    public static final sgi0<ck<gzs<Boolean>>> t;
    public static final sgi0<ck<gzs<Boolean>>> u;
    public static final sgi0<ck<gzs<Boolean>>> v;
    public static final sgi0<ck<gzs<Boolean>>> w;
    public static final sgi0<List<fmk>> x;
    public static final sgi0<ck<gzs<Boolean>>> y;
    public static final sgi0<ck<gzs<Boolean>>> z;

    /* compiled from: SemanticsProperties.kt */
    public static final class a extends Lambda implements wzs<List<? extends fmk>, List<? extends fmk>, List<? extends fmk>> {
        public static final a i = new a(2);

        @Override // xsna.wzs
        public final List<? extends fmk> invoke(List<? extends fmk> list, List<? extends fmk> list2) {
            List<? extends fmk> list3 = list;
            List<? extends fmk> list4 = list2;
            if (list3 == null) {
                list3 = EmptyList.b;
            }
            return j5g.u0(list4, list3);
        }
    }

    static {
        SemanticsPropertiesKt$ActionPropertyKey$1 semanticsPropertiesKt$ActionPropertyKey$1 = new wzs<ck<xzs<? extends Boolean>>, ck<xzs<? extends Boolean>>, ck<xzs<? extends Boolean>>>() { // from class: androidx.compose.ui.semantics.SemanticsPropertiesKt$ActionPropertyKey$1
            @Override // xsna.wzs
            public final ck<xzs<? extends Boolean>> invoke(ck<xzs<? extends Boolean>> ckVar, ck<xzs<? extends Boolean>> ckVar2) {
                String str;
                xzs<? extends Boolean> xzsVar;
                ck<xzs<? extends Boolean>> ckVar3 = ckVar;
                ck<xzs<? extends Boolean>> ckVar4 = ckVar2;
                if (ckVar3 == null || (str = ckVar3.a) == null) {
                    str = ckVar4.a;
                }
                if (ckVar3 == null || (xzsVar = ckVar3.b) == null) {
                    xzsVar = ckVar4.b;
                }
                return new ck<>(str, xzsVar);
            }
        };
        a = new sgi0<>("GetTextLayoutResult", true, semanticsPropertiesKt$ActionPropertyKey$1);
        b = new sgi0<>("OnClick", true, semanticsPropertiesKt$ActionPropertyKey$1);
        c = new sgi0<>("OnLongClick", true, semanticsPropertiesKt$ActionPropertyKey$1);
        d = new sgi0<>("ScrollBy", true, semanticsPropertiesKt$ActionPropertyKey$1);
        e = new sgi0<>("ScrollByOffset");
        f = new sgi0<>("ScrollToIndex", true, semanticsPropertiesKt$ActionPropertyKey$1);
        g = new sgi0<>("OnAutofillText", true, semanticsPropertiesKt$ActionPropertyKey$1);
        h = new sgi0<>("OnFillData", true, semanticsPropertiesKt$ActionPropertyKey$1);
        i = new sgi0<>("SetProgress", true, semanticsPropertiesKt$ActionPropertyKey$1);
        j = new sgi0<>("SetSelection", true, semanticsPropertiesKt$ActionPropertyKey$1);
        k = new sgi0<>("SetText", true, semanticsPropertiesKt$ActionPropertyKey$1);
        l = new sgi0<>("SetTextSubstitution", true, semanticsPropertiesKt$ActionPropertyKey$1);
        m = new sgi0<>("ShowTextSubstitution", true, semanticsPropertiesKt$ActionPropertyKey$1);
        n = new sgi0<>("ClearTextSubstitution", true, semanticsPropertiesKt$ActionPropertyKey$1);
        o = new sgi0<>("InsertTextAtCursor", true, semanticsPropertiesKt$ActionPropertyKey$1);
        p = new sgi0<>("PerformImeAction", true, semanticsPropertiesKt$ActionPropertyKey$1);
        q = new sgi0<>("CopyText", true, semanticsPropertiesKt$ActionPropertyKey$1);
        r = new sgi0<>("CutText", true, semanticsPropertiesKt$ActionPropertyKey$1);
        s = new sgi0<>("PasteText", true, semanticsPropertiesKt$ActionPropertyKey$1);
        t = new sgi0<>("Expand", true, semanticsPropertiesKt$ActionPropertyKey$1);
        u = new sgi0<>("Collapse", true, semanticsPropertiesKt$ActionPropertyKey$1);
        v = new sgi0<>("Dismiss", true, semanticsPropertiesKt$ActionPropertyKey$1);
        w = new sgi0<>("RequestFocus", true, semanticsPropertiesKt$ActionPropertyKey$1);
        x = new sgi0<>("CustomActions", true, a.i);
        y = new sgi0<>("PageUp", true, semanticsPropertiesKt$ActionPropertyKey$1);
        z = new sgi0<>("PageLeft", true, semanticsPropertiesKt$ActionPropertyKey$1);
        A = new sgi0<>("PageDown", true, semanticsPropertiesKt$ActionPropertyKey$1);
        B = new sgi0<>("PageRight", true, semanticsPropertiesKt$ActionPropertyKey$1);
        C = new sgi0<>("GetScrollViewportLength", true, semanticsPropertiesKt$ActionPropertyKey$1);
    }
}

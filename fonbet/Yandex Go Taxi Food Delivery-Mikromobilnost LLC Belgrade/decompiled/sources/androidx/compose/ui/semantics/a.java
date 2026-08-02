package androidx.compose.ui.semantics;

import defpackage.ag;
import defpackage.cms;
import defpackage.wls;

/* loaded from: classes.dex */
public abstract class a {
    public static final g A;
    public static final g B;
    public static final g C;
    public static final g a;
    public static final g b;
    public static final g c;
    public static final g d;
    public static final g e;
    public static final g f;
    public static final g g;
    public static final g h;
    public static final g i;
    public static final g j;
    public static final g k;
    public static final g l;
    public static final g m;
    public static final g n;
    public static final g o;
    public static final g p;
    public static final g q;
    public static final g r;
    public static final g s;
    public static final g t;
    public static final g u;
    public static final g v;
    public static final g w;
    public static final g x;
    public static final g y;
    public static final g z;

    static {
        SemanticsPropertiesKt$ActionPropertyKey$1 semanticsPropertiesKt$ActionPropertyKey$1 = new wls() { // from class: androidx.compose.ui.semantics.SemanticsPropertiesKt$ActionPropertyKey$1
            @Override // defpackage.wls
            public final Object invoke(Object obj, Object obj2) {
                String b2;
                cms a2;
                ag agVar = (ag) obj;
                ag agVar2 = (ag) obj2;
                if (agVar == null || (b2 = agVar.b()) == null) {
                    b2 = agVar2.b();
                }
                if (agVar == null || (a2 = agVar.a()) == null) {
                    a2 = agVar2.a();
                }
                return new ag(b2, a2);
            }
        };
        a = new g("GetTextLayoutResult", true, semanticsPropertiesKt$ActionPropertyKey$1);
        b = new g("OnClick", true, semanticsPropertiesKt$ActionPropertyKey$1);
        c = new g("OnLongClick", true, semanticsPropertiesKt$ActionPropertyKey$1);
        d = new g("ScrollBy", true, semanticsPropertiesKt$ActionPropertyKey$1);
        e = new g("ScrollByOffset");
        f = new g("ScrollToIndex", true, semanticsPropertiesKt$ActionPropertyKey$1);
        g = new g("OnAutofillText", true, semanticsPropertiesKt$ActionPropertyKey$1);
        h = new g("OnFillData", true, semanticsPropertiesKt$ActionPropertyKey$1);
        i = new g("SetProgress", true, semanticsPropertiesKt$ActionPropertyKey$1);
        j = new g("SetSelection", true, semanticsPropertiesKt$ActionPropertyKey$1);
        k = new g("SetText", true, semanticsPropertiesKt$ActionPropertyKey$1);
        l = new g("SetTextSubstitution", true, semanticsPropertiesKt$ActionPropertyKey$1);
        m = new g("ShowTextSubstitution", true, semanticsPropertiesKt$ActionPropertyKey$1);
        n = new g("ClearTextSubstitution", true, semanticsPropertiesKt$ActionPropertyKey$1);
        o = new g("InsertTextAtCursor", true, semanticsPropertiesKt$ActionPropertyKey$1);
        p = new g("PerformImeAction", true, semanticsPropertiesKt$ActionPropertyKey$1);
        q = new g("CopyText", true, semanticsPropertiesKt$ActionPropertyKey$1);
        r = new g("CutText", true, semanticsPropertiesKt$ActionPropertyKey$1);
        s = new g("PasteText", true, semanticsPropertiesKt$ActionPropertyKey$1);
        t = new g("Expand", true, semanticsPropertiesKt$ActionPropertyKey$1);
        u = new g("Collapse", true, semanticsPropertiesKt$ActionPropertyKey$1);
        v = new g("Dismiss", true, semanticsPropertiesKt$ActionPropertyKey$1);
        w = new g("RequestFocus", true, semanticsPropertiesKt$ActionPropertyKey$1);
        x = new g("CustomActions", true, SemanticsActions$CustomActions$1.w);
        y = new g("PageUp", true, semanticsPropertiesKt$ActionPropertyKey$1);
        z = new g("PageLeft", true, semanticsPropertiesKt$ActionPropertyKey$1);
        A = new g("PageDown", true, semanticsPropertiesKt$ActionPropertyKey$1);
        B = new g("PageRight", true, semanticsPropertiesKt$ActionPropertyKey$1);
        C = new g("GetScrollViewportLength", true, semanticsPropertiesKt$ActionPropertyKey$1);
    }
}

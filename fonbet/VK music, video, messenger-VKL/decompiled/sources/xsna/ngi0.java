package xsna;

import androidx.compose.ui.state.ToggleableState;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Lambda;

/* compiled from: SemanticsProperties.kt */
/* loaded from: classes11.dex */
public final class ngi0 {
    public static final sgi0<List<String>> a = new sgi0<>("ContentDescription", true, b.i);
    public static final sgi0<String> b = new sgi0<>("StateDescription", 0);
    public static final sgi0<t1e0> c = new sgi0<>("ProgressBarRangeInfo", 0);
    public static final sgi0<String> d = new sgi0<>("PaneTitle", true, j.i);
    public static final sgi0<s3q0> e = new sgi0<>("SelectableGroup", 0);
    public static final sgi0<q4g> f = new sgi0<>("CollectionInfo", 0);
    public static final sgi0<t4g> g = new sgi0<>("CollectionItemInfo", 0);
    public static final sgi0<s3q0> h = new sgi0<>("Heading", 0);
    public static final sgi0<s3q0> i = new sgi0<>("TextEntryKey", 0);
    public static final sgi0<s3q0> j = new sgi0<>("Disabled", 0);
    public static final sgi0<clz> k = new sgi0<>("LiveRegion", 0);
    public static final sgi0<Boolean> l = new sgi0<>("Focused", 0);
    public static final sgi0<Boolean> m = new sgi0<>("IsContainer", 0);
    public static final sgi0<Boolean> n = new sgi0<>("IsTraversalGroup");
    public static final sgi0<Boolean> o = new sgi0<>("IsSensitiveData");
    public static final sgi0<s3q0> p = new sgi0<>("InvisibleToUser", f.i);
    public static final sgi0<s3q0> q = new sgi0<>("HideFromAccessibility", e.i);
    public static final sgi0<mlj> r = new sgi0<>("ContentType", c.i);
    public static final sgi0<cgj> s = new sgi0<>("ContentDataType", a.i);
    public static final sgi0<xbr> t = new sgi0<>("FillableData", d.i);
    public static final sgi0<Float> u = new sgi0<>("TraversalIndex", o.i);
    public static final sgi0<qeh0> v = new sgi0<>("HorizontalScrollAxisRange", 0);
    public static final sgi0<qeh0> w = new sgi0<>("VerticalScrollAxisRange", 0);
    public static final sgi0<s3q0> x = new sgi0<>("IsPopup", true, h.i);
    public static final sgi0<s3q0> y = new sgi0<>("IsDialog", true, g.i);
    public static final sgi0<plg0> z = new sgi0<>("Role", true, k.i);
    public static final sgi0<String> A = new sgi0<>("TestTag", false, m.i);
    public static final sgi0<s3q0> B = new sgi0<>("LinkTestMarker", false, i.i);
    public static final sgi0<List<us2>> C = new sgi0<>("Text", true, n.i);
    public static final sgi0<us2> D = new sgi0<>("TextSubstitution");
    public static final sgi0<Boolean> E = new sgi0<>("IsShowingTextSubstitution");
    public static final sgi0<us2> F = new sgi0<>("InputText", 0);
    public static final sgi0<us2> G = new sgi0<>("EditableText", 0);
    public static final sgi0<qko0> H = new sgi0<>("TextSelectionRange", 0);
    public static final sgi0<qnw> I = new sgi0<>("ImeAction", 0);
    public static final sgi0<Boolean> J = new sgi0<>("Selected", 0);
    public static final sgi0<ToggleableState> K = new sgi0<>("ToggleableState", 0);
    public static final sgi0<s3q0> L = new sgi0<>("Password", 0);
    public static final sgi0<String> M = new sgi0<>("Error", 0);
    public static final sgi0<izs<Object, Integer>> N = new sgi0<>("IndexForKey");
    public static final sgi0<Boolean> O = new sgi0<>("IsEditable");
    public static final sgi0<Integer> P = new sgi0<>("MaxTextLength");
    public static final sgi0<r5j0> Q = new sgi0<>("Shape", false, l.i);

    /* compiled from: SemanticsProperties.kt */
    public static final class a extends Lambda implements wzs<cgj, cgj, cgj> {
        public static final a i = new a(2);

        @Override // xsna.wzs
        public final cgj invoke(cgj cgjVar, cgj cgjVar2) {
            return cgjVar;
        }
    }

    /* compiled from: SemanticsProperties.kt */
    public static final class b extends Lambda implements wzs<List<? extends String>, List<? extends String>, List<? extends String>> {
        public static final b i = new b(2);

        @Override // xsna.wzs
        public final List<? extends String> invoke(List<? extends String> list, List<? extends String> list2) {
            List<? extends String> list3 = list;
            List<? extends String> list4 = list2;
            if (list3 == null) {
                return list4;
            }
            ArrayList arrayList = new ArrayList(list3);
            arrayList.addAll(list4);
            return arrayList;
        }
    }

    /* compiled from: SemanticsProperties.kt */
    public static final class c extends Lambda implements wzs<mlj, mlj, mlj> {
        public static final c i = new c(2);

        @Override // xsna.wzs
        public final mlj invoke(mlj mljVar, mlj mljVar2) {
            return mljVar;
        }
    }

    /* compiled from: SemanticsProperties.kt */
    public static final class d extends Lambda implements wzs<xbr, xbr, xbr> {
        public static final d i = new d(2);

        @Override // xsna.wzs
        public final xbr invoke(xbr xbrVar, xbr xbrVar2) {
            return xbrVar;
        }
    }

    /* compiled from: SemanticsProperties.kt */
    public static final class e extends Lambda implements wzs<s3q0, s3q0, s3q0> {
        public static final e i = new e(2);

        @Override // xsna.wzs
        public final s3q0 invoke(s3q0 s3q0Var, s3q0 s3q0Var2) {
            return s3q0Var;
        }
    }

    /* compiled from: SemanticsProperties.kt */
    public static final class f extends Lambda implements wzs<s3q0, s3q0, s3q0> {
        public static final f i = new f(2);

        @Override // xsna.wzs
        public final s3q0 invoke(s3q0 s3q0Var, s3q0 s3q0Var2) {
            return s3q0Var;
        }
    }

    /* compiled from: SemanticsProperties.kt */
    public static final class g extends Lambda implements wzs<s3q0, s3q0, s3q0> {
        public static final g i = new g(2);

        @Override // xsna.wzs
        public final s3q0 invoke(s3q0 s3q0Var, s3q0 s3q0Var2) {
            throw new IllegalStateException("merge function called on unmergeable property IsDialog. A dialog should not be a child of a clickable/focusable node.");
        }
    }

    /* compiled from: SemanticsProperties.kt */
    public static final class h extends Lambda implements wzs<s3q0, s3q0, s3q0> {
        public static final h i = new h(2);

        @Override // xsna.wzs
        public final s3q0 invoke(s3q0 s3q0Var, s3q0 s3q0Var2) {
            throw new IllegalStateException("merge function called on unmergeable property IsPopup. A popup should not be a child of a clickable/focusable node.");
        }
    }

    /* compiled from: SemanticsProperties.kt */
    public static final class i extends Lambda implements wzs<s3q0, s3q0, s3q0> {
        public static final i i = new i(2);

        @Override // xsna.wzs
        public final s3q0 invoke(s3q0 s3q0Var, s3q0 s3q0Var2) {
            return s3q0Var;
        }
    }

    /* compiled from: SemanticsProperties.kt */
    public static final class j extends Lambda implements wzs<String, String, String> {
        public static final j i = new j(2);

        @Override // xsna.wzs
        public final String invoke(String str, String str2) {
            throw new IllegalStateException("merge function called on unmergeable property PaneTitle.");
        }
    }

    /* compiled from: SemanticsProperties.kt */
    public static final class k extends Lambda implements wzs<plg0, plg0, plg0> {
        public static final k i = new k(2);

        @Override // xsna.wzs
        public final plg0 invoke(plg0 plg0Var, plg0 plg0Var2) {
            plg0 plg0Var3 = plg0Var;
            int i2 = plg0Var2.a;
            return plg0Var3;
        }
    }

    /* compiled from: SemanticsProperties.kt */
    public static final class l extends Lambda implements wzs<r5j0, r5j0, r5j0> {
        public static final l i = new l(2);

        @Override // xsna.wzs
        public final r5j0 invoke(r5j0 r5j0Var, r5j0 r5j0Var2) {
            return r5j0Var;
        }
    }

    /* compiled from: SemanticsProperties.kt */
    public static final class m extends Lambda implements wzs<String, String, String> {
        public static final m i = new m(2);

        @Override // xsna.wzs
        public final String invoke(String str, String str2) {
            return str;
        }
    }

    /* compiled from: SemanticsProperties.kt */
    public static final class n extends Lambda implements wzs<List<? extends us2>, List<? extends us2>, List<? extends us2>> {
        public static final n i = new n(2);

        @Override // xsna.wzs
        public final List<? extends us2> invoke(List<? extends us2> list, List<? extends us2> list2) {
            List<? extends us2> list3 = list;
            List<? extends us2> list4 = list2;
            if (list3 == null) {
                return list4;
            }
            ArrayList arrayList = new ArrayList(list3);
            arrayList.addAll(list4);
            return arrayList;
        }
    }

    /* compiled from: SemanticsProperties.kt */
    public static final class o extends Lambda implements wzs<Float, Float, Float> {
        public static final o i = new o(2);

        @Override // xsna.wzs
        public final Float invoke(Float f, Float f2) {
            Float f3 = f;
            f2.floatValue();
            return f3;
        }
    }
}

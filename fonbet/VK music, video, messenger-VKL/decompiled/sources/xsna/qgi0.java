package xsna;

import androidx.compose.ui.state.ToggleableState;
import java.util.Collections;
import java.util.List;
import kotlin.jvm.internal.MutablePropertyReference1Impl;

/* compiled from: SemanticsProperties.kt */
/* loaded from: classes11.dex */
public final class qgi0 {
    public static final /* synthetic */ qcy<Object>[] a = {new MutablePropertyReference1Impl(qgi0.class, "stateDescription", "getStateDescription(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Ljava/lang/String;", 1), new MutablePropertyReference1Impl(qgi0.class, "progressBarRangeInfo", "getProgressBarRangeInfo(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/semantics/ProgressBarRangeInfo;", 1), new MutablePropertyReference1Impl(qgi0.class, "paneTitle", "getPaneTitle(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Ljava/lang/String;", 1), new MutablePropertyReference1Impl(qgi0.class, "liveRegion", "getLiveRegion(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)I", 1), new MutablePropertyReference1Impl(qgi0.class, "focused", "getFocused(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Z", 1), new MutablePropertyReference1Impl(qgi0.class, "isContainer", "isContainer(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Z", 1), new MutablePropertyReference1Impl(qgi0.class, "isTraversalGroup", "isTraversalGroup(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Z", 1), new MutablePropertyReference1Impl(qgi0.class, "isSensitiveData", "isSensitiveData(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Z", 1), new MutablePropertyReference1Impl(qgi0.class, "contentType", "getContentType(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/autofill/ContentType;", 1), new MutablePropertyReference1Impl(qgi0.class, "contentDataType", "getContentDataType(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/autofill/ContentDataType;", 1), new MutablePropertyReference1Impl(qgi0.class, "fillableData", "getFillableData(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/autofill/FillableData;", 1), new MutablePropertyReference1Impl(qgi0.class, "traversalIndex", "getTraversalIndex(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)F", 1), new MutablePropertyReference1Impl(qgi0.class, "horizontalScrollAxisRange", "getHorizontalScrollAxisRange(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/semantics/ScrollAxisRange;", 1), new MutablePropertyReference1Impl(qgi0.class, "verticalScrollAxisRange", "getVerticalScrollAxisRange(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/semantics/ScrollAxisRange;", 1), new MutablePropertyReference1Impl(qgi0.class, "role", "getRole(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)I", 1), new MutablePropertyReference1Impl(qgi0.class, "testTag", "getTestTag(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Ljava/lang/String;", 1), new MutablePropertyReference1Impl(qgi0.class, "textSubstitution", "getTextSubstitution(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/text/AnnotatedString;", 1), new MutablePropertyReference1Impl(qgi0.class, "isShowingTextSubstitution", "isShowingTextSubstitution(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Z", 1), new MutablePropertyReference1Impl(qgi0.class, "inputText", "getInputText(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/text/AnnotatedString;", 1), new MutablePropertyReference1Impl(qgi0.class, "editableText", "getEditableText(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/text/AnnotatedString;", 1), new MutablePropertyReference1Impl(qgi0.class, "textSelectionRange", "getTextSelectionRange(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)J", 1), new MutablePropertyReference1Impl(qgi0.class, "textCompositionRange", "getTextCompositionRange(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/text/TextRange;", 1), new MutablePropertyReference1Impl(qgi0.class, "imeAction", "getImeAction(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)I", 1), new MutablePropertyReference1Impl(qgi0.class, "selected", "getSelected(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Z", 1), new MutablePropertyReference1Impl(qgi0.class, "collectionInfo", "getCollectionInfo(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/semantics/CollectionInfo;", 1), new MutablePropertyReference1Impl(qgi0.class, "collectionItemInfo", "getCollectionItemInfo(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/semantics/CollectionItemInfo;", 1), new MutablePropertyReference1Impl(qgi0.class, "toggleableState", "getToggleableState(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/state/ToggleableState;", 1), new MutablePropertyReference1Impl(qgi0.class, "inputTextSuggestionState", "getInputTextSuggestionState(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/semantics/InputTextSuggestionState;", 1), new MutablePropertyReference1Impl(qgi0.class, "isEditable", "isEditable(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Z", 1), new MutablePropertyReference1Impl(qgi0.class, "maxTextLength", "getMaxTextLength(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)I", 1), new MutablePropertyReference1Impl(qgi0.class, "shape", "getShape(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/graphics/Shape;", 1), new MutablePropertyReference1Impl(qgi0.class, "customActions", "getCustomActions(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Ljava/util/List;", 1)};

    static {
        sgi0<List<String>> sgi0Var = ngi0.a;
        sgi0<ck<izs<List<ljo0>, Boolean>>> sgi0Var2 = wfi0.a;
    }

    public static final void a(tgi0 tgi0Var) {
        sgi0<List<String>> sgi0Var = ngi0.a;
        tgi0Var.a(ngi0.j, s3q0.a);
    }

    public static void b(tgi0 tgi0Var, izs izsVar) {
        tgi0Var.a(wfi0.a, new ck(null, izsVar));
    }

    public static final void c(tgi0 tgi0Var) {
        sgi0<List<String>> sgi0Var = ngi0.a;
        tgi0Var.a(ngi0.q, s3q0.a);
    }

    @ozl
    public static final void d(tgi0 tgi0Var) {
        sgi0<List<String>> sgi0Var = ngi0.a;
        tgi0Var.a(ngi0.p, s3q0.a);
    }

    public static final void e(tgi0 tgi0Var, String str, gzs<Boolean> gzsVar) {
        sgi0<ck<izs<List<ljo0>, Boolean>>> sgi0Var = wfi0.a;
        tgi0Var.a(wfi0.b, new ck(str, gzsVar));
    }

    public static void f(tgi0 tgi0Var, izs izsVar) {
        tgi0Var.a(wfi0.h, new ck(null, izsVar));
    }

    public static final void g(tgi0 tgi0Var) {
        sgi0<Boolean> sgi0Var = ngi0.m;
        qcy<Object> qcyVar = a[5];
        tgi0Var.a(sgi0Var, Boolean.TRUE);
    }

    public static final void h(tgi0 tgi0Var, String str) {
        sgi0<List<String>> sgi0Var = ngi0.a;
        tgi0Var.a(ngi0.a, Collections.singletonList(str));
    }

    public static final void i(tgi0 tgi0Var, List<fmk> list) {
        sgi0<ck<izs<List<ljo0>, Boolean>>> sgi0Var = wfi0.a;
        sgi0<List<fmk>> sgi0Var2 = wfi0.x;
        qcy<Object> qcyVar = a[31];
        tgi0Var.a(sgi0Var2, list);
    }

    public static final void j(tgi0 tgi0Var, int i) {
        sgi0<clz> sgi0Var = ngi0.k;
        qcy<Object> qcyVar = a[3];
        tgi0Var.a(sgi0Var, new clz(i));
    }

    public static final void k(tgi0 tgi0Var, String str) {
        sgi0<List<String>> sgi0Var = ngi0.a;
        sgi0<String> sgi0Var2 = ngi0.d;
        qcy<Object> qcyVar = a[2];
        tgi0Var.a(sgi0Var2, str);
    }

    public static void l(tgi0 tgi0Var, izs izsVar) {
        tgi0Var.a(wfi0.i, new ck(null, izsVar));
    }

    public static final void m(tgi0 tgi0Var, t1e0 t1e0Var) {
        sgi0<List<String>> sgi0Var = ngi0.a;
        sgi0<t1e0> sgi0Var2 = ngi0.c;
        qcy<Object> qcyVar = a[1];
        tgi0Var.a(sgi0Var2, t1e0Var);
    }

    public static final void n(tgi0 tgi0Var, int i) {
        sgi0<plg0> sgi0Var = ngi0.z;
        qcy<Object> qcyVar = a[14];
        tgi0Var.a(sgi0Var, new plg0(i));
    }

    public static final void o(tgi0 tgi0Var, boolean z) {
        sgi0<List<String>> sgi0Var = ngi0.a;
        sgi0<Boolean> sgi0Var2 = ngi0.J;
        qcy<Object> qcyVar = a[23];
        tgi0Var.a(sgi0Var2, Boolean.valueOf(z));
    }

    public static final void p(tgi0 tgi0Var, r5j0 r5j0Var) {
        sgi0<List<String>> sgi0Var = ngi0.a;
        sgi0<r5j0> sgi0Var2 = ngi0.Q;
        qcy<Object> qcyVar = a[30];
        tgi0Var.a(sgi0Var2, r5j0Var);
    }

    public static final void q(tgi0 tgi0Var, String str) {
        sgi0<List<String>> sgi0Var = ngi0.a;
        sgi0<String> sgi0Var2 = ngi0.b;
        qcy<Object> qcyVar = a[0];
        tgi0Var.a(sgi0Var2, str);
    }

    public static final void r(tgi0 tgi0Var, String str) {
        sgi0<List<String>> sgi0Var = ngi0.a;
        sgi0<String> sgi0Var2 = ngi0.A;
        qcy<Object> qcyVar = a[15];
        tgi0Var.a(sgi0Var2, str);
    }

    public static final void s(tgi0 tgi0Var, us2 us2Var) {
        sgi0<List<String>> sgi0Var = ngi0.a;
        tgi0Var.a(ngi0.C, Collections.singletonList(us2Var));
    }

    public static final void t(tgi0 tgi0Var, ToggleableState toggleableState) {
        sgi0<List<String>> sgi0Var = ngi0.a;
        sgi0<ToggleableState> sgi0Var2 = ngi0.K;
        qcy<Object> qcyVar = a[26];
        tgi0Var.a(sgi0Var2, toggleableState);
    }

    public static final void u(tgi0 tgi0Var) {
        sgi0<Boolean> sgi0Var = ngi0.n;
        qcy<Object> qcyVar = a[6];
        tgi0Var.a(sgi0Var, Boolean.TRUE);
    }

    public static final void v(tgi0 tgi0Var, float f) {
        sgi0<List<String>> sgi0Var = ngi0.a;
        sgi0<Float> sgi0Var2 = ngi0.u;
        qcy<Object> qcyVar = a[11];
        tgi0Var.a(sgi0Var2, Float.valueOf(f));
    }
}

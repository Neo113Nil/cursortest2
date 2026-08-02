package androidx.compose.ui.semantics;

import androidx.compose.ui.state.ToggleableState;
import defpackage.ag;
import defpackage.awk0;
import defpackage.ehr0;
import defpackage.fwy;
import defpackage.hcc;
import defpackage.i6y;
import defpackage.icc;
import defpackage.kgx;
import defpackage.kk2;
import defpackage.mnq0;
import defpackage.sls;
import defpackage.tls;
import defpackage.wls;
import defpackage.zy11;
import java.util.Collections;
import java.util.List;
import kotlin.jvm.internal.MutablePropertyReference1Impl;

/* loaded from: classes10.dex */
public abstract class f {
    public static final /* synthetic */ kgx[] a = {new MutablePropertyReference1Impl("stateDescription", 1, "getStateDescription(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Ljava/lang/String;", f.class), new MutablePropertyReference1Impl("progressBarRangeInfo", 1, "getProgressBarRangeInfo(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/semantics/ProgressBarRangeInfo;", f.class), new MutablePropertyReference1Impl("paneTitle", 1, "getPaneTitle(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Ljava/lang/String;", f.class), new MutablePropertyReference1Impl("liveRegion", 1, "getLiveRegion(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)I", f.class), new MutablePropertyReference1Impl("focused", 1, "getFocused(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Z", f.class), new MutablePropertyReference1Impl("isContainer", 1, "isContainer(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Z", f.class), new MutablePropertyReference1Impl("isTraversalGroup", 1, "isTraversalGroup(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Z", f.class), new MutablePropertyReference1Impl("isSensitiveData", 1, "isSensitiveData(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Z", f.class), new MutablePropertyReference1Impl("contentType", 1, "getContentType(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/autofill/ContentType;", f.class), new MutablePropertyReference1Impl("contentDataType", 1, "getContentDataType(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/autofill/ContentDataType;", f.class), new MutablePropertyReference1Impl("fillableData", 1, "getFillableData(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/autofill/FillableData;", f.class), new MutablePropertyReference1Impl("traversalIndex", 1, "getTraversalIndex(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)F", f.class), new MutablePropertyReference1Impl("horizontalScrollAxisRange", 1, "getHorizontalScrollAxisRange(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/semantics/ScrollAxisRange;", f.class), new MutablePropertyReference1Impl("verticalScrollAxisRange", 1, "getVerticalScrollAxisRange(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/semantics/ScrollAxisRange;", f.class), new MutablePropertyReference1Impl("role", 1, "getRole(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)I", f.class), new MutablePropertyReference1Impl("testTag", 1, "getTestTag(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Ljava/lang/String;", f.class), new MutablePropertyReference1Impl("textSubstitution", 1, "getTextSubstitution(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/text/AnnotatedString;", f.class), new MutablePropertyReference1Impl("isShowingTextSubstitution", 1, "isShowingTextSubstitution(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Z", f.class), new MutablePropertyReference1Impl("inputText", 1, "getInputText(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/text/AnnotatedString;", f.class), new MutablePropertyReference1Impl("editableText", 1, "getEditableText(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/text/AnnotatedString;", f.class), new MutablePropertyReference1Impl("textSelectionRange", 1, "getTextSelectionRange(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)J", f.class), new MutablePropertyReference1Impl("textCompositionRange", 1, "getTextCompositionRange(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/text/TextRange;", f.class), new MutablePropertyReference1Impl("imeAction", 1, "getImeAction(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)I", f.class), new MutablePropertyReference1Impl("selected", 1, "getSelected(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Z", f.class), new MutablePropertyReference1Impl("collectionInfo", 1, "getCollectionInfo(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/semantics/CollectionInfo;", f.class), new MutablePropertyReference1Impl("collectionItemInfo", 1, "getCollectionItemInfo(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/semantics/CollectionItemInfo;", f.class), new MutablePropertyReference1Impl("toggleableState", 1, "getToggleableState(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/state/ToggleableState;", f.class), new MutablePropertyReference1Impl("inputTextSuggestionState", 1, "getInputTextSuggestionState(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/semantics/InputTextSuggestionState;", f.class), new MutablePropertyReference1Impl("isEditable", 1, "isEditable(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Z", f.class), new MutablePropertyReference1Impl("maxTextLength", 1, "getMaxTextLength(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)I", f.class), new MutablePropertyReference1Impl("shape", 1, "getShape(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/graphics/Shape;", f.class), new MutablePropertyReference1Impl("customActions", 1, "getCustomActions(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Ljava/util/List;", f.class)};

    static {
        g gVar = d.a;
        g gVar2 = a.a;
    }

    public static final void a(mnq0 mnq0Var) {
        g gVar = d.a;
        mnq0Var.a(d.j, zy11.a);
    }

    public static void b(mnq0 mnq0Var, final i6y i6yVar) {
        mnq0Var.a(a.C, new ag(null, new tls() { // from class: androidx.compose.ui.semantics.SemanticsPropertiesKt$getScrollViewportLength$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // defpackage.tls
            public final Object invoke(Object obj) {
                boolean z;
                List list = (List) obj;
                Float f = (Float) i6yVar.invoke();
                if (f == null) {
                    z = false;
                } else {
                    list.add(f);
                    z = true;
                }
                return Boolean.valueOf(z);
            }
        }));
    }

    public static void c(mnq0 mnq0Var, tls tlsVar) {
        mnq0Var.a(a.a, new ag(null, tlsVar));
    }

    public static final void d(mnq0 mnq0Var) {
        g gVar = d.a;
        mnq0Var.a(d.h, zy11.a);
    }

    public static final void e(mnq0 mnq0Var) {
        g gVar = d.a;
        mnq0Var.a(d.p, zy11.a);
    }

    public static final void f(mnq0 mnq0Var, String str, sls slsVar) {
        mnq0Var.a(a.b, new ag(str, slsVar));
    }

    public static void g(mnq0 mnq0Var, tls tlsVar) {
        mnq0Var.a(a.h, new ag(null, tlsVar));
    }

    public static final void h(mnq0 mnq0Var, String str, sls slsVar) {
        mnq0Var.a(a.c, new ag(str, slsVar));
    }

    public static void i(mnq0 mnq0Var, wls wlsVar) {
        mnq0Var.a(a.d, new ag(null, wlsVar));
    }

    public static final void j(mnq0 mnq0Var, hcc hccVar) {
        g gVar = d.a;
        g gVar2 = d.f;
        kgx kgxVar = a[24];
        mnq0Var.a(gVar2, hccVar);
    }

    public static final void k(mnq0 mnq0Var, icc iccVar) {
        g gVar = d.g;
        kgx kgxVar = a[25];
        mnq0Var.a(gVar, iccVar);
    }

    public static final void l(mnq0 mnq0Var, String str) {
        g gVar = d.a;
        mnq0Var.a(d.a, Collections.singletonList(str));
    }

    public static final void m(mnq0 mnq0Var, List list) {
        g gVar = a.a;
        g gVar2 = a.x;
        kgx kgxVar = a[31];
        gVar2.getClass();
        mnq0Var.a(gVar2, list);
    }

    public static final void n(mnq0 mnq0Var, int i) {
        g gVar = d.k;
        kgx kgxVar = a[3];
        mnq0Var.a(gVar, new fwy(i));
    }

    public static final void o(mnq0 mnq0Var, String str) {
        g gVar = d.a;
        g gVar2 = d.d;
        kgx kgxVar = a[2];
        mnq0Var.a(gVar2, str);
    }

    public static final void p(mnq0 mnq0Var, int i) {
        g gVar = d.z;
        kgx kgxVar = a[14];
        mnq0Var.a(gVar, new awk0(i));
    }

    public static final void q(mnq0 mnq0Var, boolean z) {
        g gVar = d.a;
        g gVar2 = d.J;
        kgx kgxVar = a[23];
        mnq0Var.a(gVar2, Boolean.valueOf(z));
    }

    public static final void r(mnq0 mnq0Var, ehr0 ehr0Var) {
        g gVar = d.a;
        g gVar2 = d.Q;
        kgx kgxVar = a[30];
        mnq0Var.a(gVar2, ehr0Var);
    }

    public static final void s(mnq0 mnq0Var, String str) {
        g gVar = d.a;
        g gVar2 = d.b;
        kgx kgxVar = a[0];
        mnq0Var.a(gVar2, str);
    }

    public static final void t(mnq0 mnq0Var, kk2 kk2Var) {
        g gVar = d.a;
        mnq0Var.a(d.C, Collections.singletonList(kk2Var));
    }

    public static final void u(mnq0 mnq0Var, ToggleableState toggleableState) {
        g gVar = d.a;
        g gVar2 = d.K;
        kgx kgxVar = a[26];
        mnq0Var.a(gVar2, toggleableState);
    }

    public static final void v(mnq0 mnq0Var) {
        g gVar = d.n;
        kgx kgxVar = a[6];
        mnq0Var.a(gVar, Boolean.TRUE);
    }

    public static final void w(mnq0 mnq0Var, float f) {
        g gVar = d.a;
        g gVar2 = d.u;
        kgx kgxVar = a[11];
        mnq0Var.a(gVar2, Float.valueOf(f));
    }
}

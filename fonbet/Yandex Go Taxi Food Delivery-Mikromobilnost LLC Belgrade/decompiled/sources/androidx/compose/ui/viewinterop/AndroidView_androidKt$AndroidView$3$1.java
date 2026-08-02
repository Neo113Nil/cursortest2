package androidx.compose.ui.viewinterop;

import androidx.compose.ui.node.LayoutNode;
import defpackage.tls;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\b\u001a\u00020\u0004\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u00020\u00022\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00040\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Landroid/view/View;", "T", "Landroidx/compose/ui/node/LayoutNode;", "Lkotlin/Function1;", "Lzy11;", "it", "invoke", "(Landroidx/compose/ui/node/LayoutNode;Ltls;)V", "<anonymous>"}, k = 3, mv = {2, 1, 0})
/* loaded from: classes.dex */
final class AndroidView_androidKt$AndroidView$3$1 extends Lambda implements wls {
    public static final AndroidView_androidKt$AndroidView$3$1 w = new AndroidView_androidKt$AndroidView$3$1(2);

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        b.c((LayoutNode) obj).setUpdateBlock((tls) obj2);
        return zy11.a;
    }
}

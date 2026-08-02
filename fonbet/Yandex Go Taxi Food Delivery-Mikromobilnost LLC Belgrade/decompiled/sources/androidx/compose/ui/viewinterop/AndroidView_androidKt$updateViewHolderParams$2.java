package androidx.compose.ui.viewinterop;

import androidx.compose.ui.node.LayoutNode;
import defpackage.fwi;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Landroidx/compose/ui/node/LayoutNode;", "Lfwi;", "it", "Lzy11;", "invoke", "(Landroidx/compose/ui/node/LayoutNode;Lfwi;)V", "<anonymous>"}, k = 3, mv = {2, 1, 0})
/* loaded from: classes.dex */
final class AndroidView_androidKt$updateViewHolderParams$2 extends Lambda implements wls {
    public static final AndroidView_androidKt$updateViewHolderParams$2 w = new AndroidView_androidKt$updateViewHolderParams$2(2);

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        b.c((LayoutNode) obj).setDensity((fwi) obj2);
        return zy11.a;
    }
}

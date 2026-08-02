package androidx.compose.ui.platform;

import androidx.compose.ui.node.LayoutNode;
import defpackage.cnq0;
import defpackage.tls;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "it", "Landroidx/compose/ui/node/LayoutNode;", "invoke", "(Landroidx/compose/ui/node/LayoutNode;)Ljava/lang/Boolean;"}, k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes10.dex */
final class AndroidComposeViewAccessibilityDelegateCompat_androidKt$excludeLineAndPageGranularities$ancestor$1 extends Lambda implements tls {
    public static final AndroidComposeViewAccessibilityDelegateCompat_androidKt$excludeLineAndPageGranularities$ancestor$1 w = new AndroidComposeViewAccessibilityDelegateCompat_androidKt$excludeLineAndPageGranularities$ancestor$1(1);

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0015, code lost:
    
        if (r1.a.b(androidx.compose.ui.semantics.d.G) != false) goto L10;
     */
    @Override // defpackage.tls
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj) {
        boolean z;
        cnq0 u = ((LayoutNode) obj).u();
        if (u != null) {
            z = true;
            if (u.c) {
            }
        }
        z = false;
        return Boolean.valueOf(z);
    }
}

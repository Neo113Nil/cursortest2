package xsna;

import androidx.compose.ui.node.LayoutNode;
import kotlin.jvm.internal.Lambda;

/* compiled from: AndroidComposeViewAccessibilityDelegateCompat.android.kt */
/* loaded from: classes11.dex */
public final class c62 extends Lambda implements izs<LayoutNode, Boolean> {
    public static final c62 i = new c62(1);

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0015, code lost:
    
        if (r3.b.b(xsna.ngi0.G) != false) goto L10;
     */
    @Override // xsna.izs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Boolean invoke(LayoutNode layoutNode) {
        boolean z;
        xfi0 d = layoutNode.d();
        if (d != null) {
            z = true;
            if (d.d) {
            }
        }
        z = false;
        return Boolean.valueOf(z);
    }
}

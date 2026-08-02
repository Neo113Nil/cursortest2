package xsna;

import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.compose.ui.node.LayoutNode;

/* compiled from: AndroidComposeView.android.kt */
/* loaded from: classes11.dex */
public final class q52 extends hk {
    public final /* synthetic */ p52 b;
    public final /* synthetic */ LayoutNode c;
    public final /* synthetic */ p52 d;

    public q52(p52 p52Var, LayoutNode layoutNode, p52 p52Var2) {
        this.b = p52Var;
        this.c = layoutNode;
        this.d = p52Var2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0044, code lost:
    
        if (r3.intValue() == r7.getSemanticsOwner().a().f) goto L19;
     */
    @Override // xsna.hk
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onInitializeAccessibilityNodeInfo(View view, am amVar) {
        super.onInitializeAccessibilityNodeInfo(view, amVar);
        p52 p52Var = this.b;
        y52 y52Var = p52Var.A;
        if (y52Var.l()) {
            amVar.C(false);
        }
        LayoutNode layoutNode = this.c;
        LayoutNode I = layoutNode.I();
        while (true) {
            if (I == null) {
                I = null;
                break;
            } else if (I.G.d(8)) {
                break;
            } else {
                I = I.I();
            }
        }
        Integer valueOf = I != null ? Integer.valueOf(I.c) : null;
        if (valueOf != null) {
        }
        valueOf = -1;
        int intValue = valueOf.intValue();
        amVar.b = intValue;
        AccessibilityNodeInfo accessibilityNodeInfo = amVar.a;
        p52 p52Var2 = this.d;
        accessibilityNodeInfo.setParent(p52Var2, intValue);
        int i = layoutNode.c;
        int c = y52Var.A.c(i, -1);
        if (c != -1) {
            xd2 c2 = ygi0.c(p52Var.getAndroidViewsHandler$ui(), c);
            if (c2 != null) {
                accessibilityNodeInfo.setTraversalBefore(c2);
            } else {
                accessibilityNodeInfo.setTraversalBefore(p52Var2, c);
            }
            p52.F(p52Var, i, accessibilityNodeInfo, y52Var.C);
        }
        int c3 = y52Var.B.c(i, -1);
        if (c3 != -1) {
            xd2 c4 = ygi0.c(p52Var.getAndroidViewsHandler$ui(), c3);
            if (c4 != null) {
                accessibilityNodeInfo.setTraversalAfter(c4);
            } else {
                accessibilityNodeInfo.setTraversalAfter(p52Var2, c3);
            }
            p52.F(p52Var, i, accessibilityNodeInfo, y52Var.D);
        }
    }
}

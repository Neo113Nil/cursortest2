package xsna;

import androidx.compose.ui.node.LayoutNode;
import kotlin.jvm.internal.Lambda;

/* compiled from: ActivityLauncherAnalytics.kt */
/* loaded from: classes9.dex */
public final class w90 extends Lambda implements izs {
    public static final w90 j;
    public static final w90 k;
    public final /* synthetic */ int i;

    static {
        int i = 1;
        j = new w90(i, 0);
        k = new w90(i, 1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w90(int i, int i2) {
        super(i);
        this.i = i2;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.i) {
            case 0:
                break;
            default:
                LayoutNode layoutNode = (LayoutNode) obj;
                if (layoutNode.e()) {
                    layoutNode.e0(false);
                }
                break;
        }
        return s3q0.a;
    }
}

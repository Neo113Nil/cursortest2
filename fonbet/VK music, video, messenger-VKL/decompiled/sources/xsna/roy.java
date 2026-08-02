package xsna;

import androidx.compose.ui.node.LayoutNode;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref$ObjectRef;
import xsna.q630;

/* compiled from: LayoutNode.kt */
/* loaded from: classes11.dex */
public final class roy extends Lambda implements gzs<s3q0> {
    final /* synthetic */ Ref$ObjectRef<xfi0> $config;
    final /* synthetic */ LayoutNode this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public roy(LayoutNode layoutNode, Ref$ObjectRef<xfi0> ref$ObjectRef) {
        super(0);
        this.this$0 = layoutNode;
        this.$config = ref$ObjectRef;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1, types: [xsna.q630$c] */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v4, types: [xsna.q630$c] */
    /* JADX WARN: Type inference failed for: r3v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r3v9 */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3, types: [xsna.ci50] */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6, types: [xsna.ci50] */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r5v7, types: [T, xsna.xfi0] */
    @Override // xsna.gzs
    public final s3q0 invoke() {
        u470 u470Var = this.this$0.G;
        Ref$ObjectRef<xfi0> ref$ObjectRef = this.$config;
        if ((u470Var.f.e & 8) != 0) {
            for (q630.c cVar = u470Var.e; cVar != null; cVar = cVar.f) {
                if ((cVar.d & 8) != 0) {
                    ytl ytlVar = cVar;
                    ?? r4 = 0;
                    while (ytlVar != 0) {
                        if (ytlVar instanceof fgi0) {
                            fgi0 fgi0Var = (fgi0) ytlVar;
                            if (fgi0Var.p0()) {
                                ?? xfi0Var = new xfi0();
                                ref$ObjectRef.element = xfi0Var;
                                xfi0Var.e = true;
                            }
                            if (fgi0Var.q1()) {
                                ref$ObjectRef.element.d = true;
                            }
                            fgi0Var.l1(ref$ObjectRef.element);
                        } else if ((ytlVar.d & 8) != 0 && (ytlVar instanceof ytl)) {
                            q630.c cVar2 = ytlVar.q;
                            int i = 0;
                            ytlVar = ytlVar;
                            r4 = r4;
                            while (cVar2 != null) {
                                if ((cVar2.d & 8) != 0) {
                                    i++;
                                    r4 = r4;
                                    if (i == 1) {
                                        ytlVar = cVar2;
                                    } else {
                                        if (r4 == 0) {
                                            r4 = new ci50(new q630.c[16]);
                                        }
                                        if (ytlVar != 0) {
                                            r4.b(ytlVar);
                                            ytlVar = 0;
                                        }
                                        r4.b(cVar2);
                                    }
                                }
                                cVar2 = cVar2.g;
                                ytlVar = ytlVar;
                                r4 = r4;
                            }
                            if (i == 1) {
                            }
                        }
                        ytlVar = itl.b(r4);
                    }
                }
            }
        }
        return s3q0.a;
    }
}

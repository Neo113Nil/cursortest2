package xsna;

import kotlin.jvm.internal.Lambda;

/* compiled from: BringIntoViewModifierNode.kt */
/* loaded from: classes11.dex */
public final class lc8 extends Lambda implements gzs<zhf0> {
    final /* synthetic */ gzs<zhf0> $bounds;
    final /* synthetic */ tny $layoutCoordinates;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lc8(gzs gzsVar, androidx.compose.ui.node.o oVar) {
        super(0);
        this.$bounds = gzsVar;
        this.$layoutCoordinates = oVar;
    }

    @Override // xsna.gzs
    public final zhf0 invoke() {
        zhf0 invoke;
        gzs<zhf0> gzsVar = this.$bounds;
        if (gzsVar != null && (invoke = gzsVar.invoke()) != null) {
            return invoke;
        }
        tny tnyVar = this.$layoutCoordinates;
        if (!tnyVar.e()) {
            tnyVar = null;
        }
        if (tnyVar != null) {
            return p490.e(0L, pli.w(tnyVar.a()));
        }
        return null;
    }
}

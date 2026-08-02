package xsna;

import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.bbt;

/* compiled from: GamesCatalogDetailReducer.kt */
/* loaded from: classes17.dex */
public final /* synthetic */ class abt extends FunctionReferenceImpl implements izs<hbt, bbt.b> {
    @Override // xsna.izs
    public final bbt.b invoke(hbt hbtVar) {
        hbt hbtVar2 = hbtVar;
        ((yat) this.receiver).getClass();
        boolean z = hbtVar2.e;
        List list = hbtVar2.i;
        if (list == null) {
            list = EmptyList.b;
        }
        return new bbt.b(z, list);
    }
}

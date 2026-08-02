package xsna;

import com.vk.games.presentation.catalog.model.ListNextState;
import java.util.List;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.bbt;

/* compiled from: GamesCatalogDetailReducer.kt */
/* loaded from: classes17.dex */
public final /* synthetic */ class zat extends FunctionReferenceImpl implements izs<hbt, bbt.d> {
    @Override // xsna.izs
    public final bbt.d invoke(hbt hbtVar) {
        hbt hbtVar2 = hbtVar;
        ((yat) this.receiver).getClass();
        boolean z = hbtVar2.b;
        kbt kbtVar = hbtVar2.c;
        ListNextState listNextState = hbtVar2.d;
        List<ebt> list = hbtVar2.i;
        return new bbt.d(z, kbtVar, hbtVar2.e, list != null ? list.size() : 0, listNextState);
    }
}

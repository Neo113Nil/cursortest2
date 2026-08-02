package xsna;

import java.util.Collection;
import kotlin.Pair;

/* compiled from: SessionRoomsDataProvider.kt */
/* loaded from: classes7.dex */
public final class xvi0 implements izs {
    public final /* synthetic */ boolean b;

    public xvi0(boolean z, com.vk.voip.ui.sessionrooms.dialog.model.a aVar) {
        this.b = z;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        Collection collection = (Collection) obj;
        return this.b ? com.vk.voip.ui.sessionrooms.dialog.model.a.b(collection).l(new uf20(new ase0(1, collection), 9)) : io.reactivex.rxjava3.core.x.k(new Pair(collection, jgp.b));
    }
}

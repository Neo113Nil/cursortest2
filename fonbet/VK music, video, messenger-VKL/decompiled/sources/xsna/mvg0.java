package xsna;

import androidx.room.RoomDatabase;
import kotlinx.coroutines.flow.FlowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1;
import xsna.eyx;

/* compiled from: RxRoom.kt */
/* loaded from: classes12.dex */
public final class mvg0 {
    public static final io.reactivex.rxjava3.internal.operators.completable.e a(RoomDatabase roomDatabase, izs izsVar) {
        kotlin.coroutines.d j = roomDatabase.j();
        eyx.a aVar = eyx.a.b;
        kotlin.coroutines.d minusKey = j.minusKey(aVar);
        jvg0 jvg0Var = new jvg0(roomDatabase, null, izsVar, false, true);
        if (minusKey.get(aVar) == null) {
            return new io.reactivex.rxjava3.internal.operators.completable.e(new btg0(minusKey, jvg0Var));
        }
        throw new IllegalArgumentException(("Completable context cannot contain job in it.Its lifecycle should be managed via Disposable handle. Had " + minusKey).toString());
    }

    public static final io.reactivex.rxjava3.internal.operators.maybe.c b(RoomDatabase roomDatabase, izs izsVar) {
        kotlin.coroutines.d j = roomDatabase.j();
        eyx.a aVar = eyx.a.b;
        kotlin.coroutines.d minusKey = j.minusKey(aVar);
        kvg0 kvg0Var = new kvg0(roomDatabase, null, izsVar, true, false);
        if (minusKey.get(aVar) == null) {
            return new io.reactivex.rxjava3.internal.operators.maybe.c(new k5g(minusKey, kvg0Var));
        }
        throw new IllegalArgumentException(("Maybe context cannot contain job in it.Its lifecycle should be managed via Disposable handle. Had " + minusKey).toString());
    }

    public static final io.reactivex.rxjava3.internal.operators.observable.q c(RoomDatabase roomDatabase, boolean z, String[] strArr, izs izsVar) {
        return new io.reactivex.rxjava3.internal.operators.observable.q(new vge(roomDatabase.j(), new FlowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1(qz9.d(roomDatabase, z, strArr, izsVar))));
    }

    public static final io.reactivex.rxjava3.internal.operators.single.b d(RoomDatabase roomDatabase, boolean z, izs izsVar) {
        return wvg0.a(roomDatabase.j().minusKey(eyx.a.b), new lvg0(roomDatabase, null, izsVar, true, z));
    }
}

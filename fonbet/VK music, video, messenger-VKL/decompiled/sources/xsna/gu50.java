package xsna;

import android.graphics.RectF;
import com.vk.dto.common.id.UserId;
import com.vk.dto.narratives.Narrative;
import java.util.ArrayList;
import java.util.Collection;
import kotlin.Pair;
import kotlin.collections.EmptyList;

/* compiled from: NarrativeController.kt */
/* loaded from: classes3.dex */
public interface gu50 {
    static /* synthetic */ io.reactivex.rxjava3.core.x b(gu50 gu50Var, UserId userId, int i, String str, ArrayList arrayList, RectF rectF, Integer num, Integer num2, int i2) {
        if ((i2 & 32) != 0) {
            num = null;
        }
        if ((i2 & 64) != 0) {
            num2 = null;
        }
        return gu50Var.d(userId, i, str, arrayList, rectF, num, num2);
    }

    static io.reactivex.rxjava3.core.x e(gu50 gu50Var, UserId userId, String str, ArrayList arrayList, RectF rectF, Integer num, Integer num2, int i) {
        Integer num3;
        gu50 gu50Var2;
        UserId userId2;
        String str2;
        Collection collection = arrayList;
        if ((i & 4) != 0) {
            collection = EmptyList.b;
        }
        Collection collection2 = collection;
        RectF rectF2 = (i & 8) != 0 ? null : rectF;
        if ((i & 16) != 0) {
            num = (Integer) j5g.Z(collection2);
        }
        Integer num4 = num;
        if ((i & 32) != 0) {
            num3 = null;
            userId2 = userId;
            str2 = str;
            gu50Var2 = gu50Var;
        } else {
            num3 = num2;
            gu50Var2 = gu50Var;
            userId2 = userId;
            str2 = str;
        }
        return gu50Var2.g(userId2, str2, collection2, rectF2, num4, num3);
    }

    ysg0<Pair<UserId, d5v>> a();

    String c(Narrative narrative);

    io.reactivex.rxjava3.internal.operators.single.o d(UserId userId, int i, String str, Iterable iterable, RectF rectF, Integer num, Integer num2);

    io.reactivex.rxjava3.internal.operators.completable.p f(int i, UserId userId, int i2);

    io.reactivex.rxjava3.internal.operators.single.o g(UserId userId, String str, Collection collection, RectF rectF, Integer num, Integer num2);

    io.reactivex.rxjava3.internal.operators.completable.p h(int i, UserId userId, int i2);

    io.reactivex.rxjava3.internal.operators.single.o i(int i, UserId userId);
}

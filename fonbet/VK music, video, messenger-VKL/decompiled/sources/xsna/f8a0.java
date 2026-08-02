package xsna;

import com.vk.dto.common.id.UserId;
import com.vk.dto.photo.Photo;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PhotoFlowRepository.kt */
/* loaded from: classes4.dex */
public interface f8a0 {
    static /* synthetic */ io.reactivex.rxjava3.core.q g(f8a0 f8a0Var, UserId userId, String str, Integer num, int i) {
        Boolean bool;
        UserId userId2;
        f8a0 f8a0Var2;
        Boolean bool2 = Boolean.TRUE;
        Boolean bool3 = Boolean.FALSE;
        if ((i & 4) != 0) {
            str = "0";
        }
        String str2 = str;
        if ((i & 8) != 0) {
            num = 30;
        }
        Integer num2 = num;
        if ((i & 16) != 0) {
            bool = bool2;
            f8a0Var2 = f8a0Var;
            userId2 = userId;
        } else {
            bool = bool3;
            userId2 = userId;
            f8a0Var2 = f8a0Var;
        }
        return f8a0Var2.e(userId2, bool2, bool, num2, str2);
    }

    io.reactivex.rxjava3.core.x a(UserId userId, List list);

    io.reactivex.rxjava3.internal.operators.completable.p b(Photo photo, UserId userId);

    io.reactivex.rxjava3.core.x c(ArrayList arrayList, int i, UserId userId);

    io.reactivex.rxjava3.internal.operators.observable.b1 d(ArrayList arrayList);

    io.reactivex.rxjava3.internal.operators.observable.j1 e(UserId userId, Boolean bool, Boolean bool2, Integer num, String str);

    io.reactivex.rxjava3.internal.operators.observable.b1 f(ArrayList arrayList);

    io.reactivex.rxjava3.internal.operators.completable.w h(Photo photo);

    io.reactivex.rxjava3.internal.operators.completable.w i(Photo photo);
}

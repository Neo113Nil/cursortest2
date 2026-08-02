package xsna;

import com.vk.dto.common.id.UserId;
import com.vk.superapp.api.states.VkAuthState;
import com.vk.superapp.core.api.models.VkGender;
import java.util.ArrayList;
import java.util.List;

/* compiled from: SuperappApi.kt */
/* loaded from: classes11.dex */
public interface wfn0 {

    /* compiled from: SuperappApi.kt */
    /* loaded from: classes6.dex */
    public static final class a {
        public static /* synthetic */ io.reactivex.rxjava3.core.q a(wfn0 wfn0Var, String str, String str2, int i) {
            if ((i & 2) != 0) {
                str2 = null;
            }
            return wfn0Var.s(str, str2);
        }
    }

    io.reactivex.rxjava3.internal.operators.single.y a(String str);

    io.reactivex.rxjava3.internal.operators.observable.m1 b(VkAuthState vkAuthState, String str, String str2, String str3, String str4);

    io.reactivex.rxjava3.internal.operators.observable.m1 c(String str);

    io.reactivex.rxjava3.internal.operators.observable.m1 d(String str, String str2, String str3, VkGender vkGender, String str4, String str5, String str6, String str7, boolean z, String str8, String str9, boolean z2, String str10, String str11);

    io.reactivex.rxjava3.internal.operators.observable.j1 e(String str, String str2, String str3, String str4, String str5, boolean z, boolean z2, boolean z3, String str6);

    io.reactivex.rxjava3.internal.operators.observable.i2 f(int i, boolean z);

    io.reactivex.rxjava3.internal.operators.observable.i2 g(int i);

    io.reactivex.rxjava3.internal.operators.observable.m1 h(String str, String str2);

    io.reactivex.rxjava3.internal.operators.observable.m1 i(String str, String str2, String str3, ArrayList arrayList, ArrayList arrayList2);

    io.reactivex.rxjava3.internal.operators.observable.m1 j(String str, String str2);

    io.reactivex.rxjava3.internal.operators.observable.m1 k(String str, String str2, String str3, String str4, String str5);

    io.reactivex.rxjava3.internal.operators.single.y l(Long l);

    io.reactivex.rxjava3.internal.operators.single.y m(long j);

    io.reactivex.rxjava3.internal.operators.observable.m1 n();

    io.reactivex.rxjava3.internal.operators.observable.m1 o(VkAuthState vkAuthState, String str, boolean z, String str2, boolean z2, String str3, boolean z3, boolean z4, String str4);

    io.reactivex.rxjava3.internal.operators.observable.m1 p();

    io.reactivex.rxjava3.internal.operators.observable.m1 q(int i, String str, String str2, String str3);

    io.reactivex.rxjava3.internal.operators.observable.j1 r(String str, boolean z, String str2, List list, ArrayList arrayList, String str3, ArrayList arrayList2);

    io.reactivex.rxjava3.internal.operators.observable.m1 s(String str, String str2);

    io.reactivex.rxjava3.internal.operators.observable.l2 t(List list);

    io.reactivex.rxjava3.internal.operators.observable.l2 u(String str, String str2);

    io.reactivex.rxjava3.internal.operators.observable.m1 v(UserId userId, String str, boolean z);

    io.reactivex.rxjava3.internal.operators.observable.i2 w(int i, String str, String str2, String str3, String str4, List list, String str5);

    io.reactivex.rxjava3.internal.operators.observable.m1 x(String str, boolean z);

    io.reactivex.rxjava3.internal.operators.observable.m1 y(String str, String str2, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, String str3, boolean z8);

    io.reactivex.rxjava3.internal.operators.observable.m1 z(String str, String str2);
}

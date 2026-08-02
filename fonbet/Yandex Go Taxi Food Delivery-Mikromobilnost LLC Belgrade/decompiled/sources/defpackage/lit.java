package defpackage;

import android.app.Activity;
import com.yandex.go.taxi.order.models.api.status.RequiredCardBalance;
import com.yandex.go.taxi.order.models.api.status.RequiredYangopayBalance;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002À\u0006\u0003"}, d2 = {"Llit;", "Lzxf0;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public interface lit extends zxf0, sdj {
    void Qe(o2y0 o2y0Var, boolean z);

    void S0(o2y0 o2y0Var);

    Activity getActivity();

    void lg(o2y0 o2y0Var);

    void openOrderPaymentMethods(o2y0 o2y0Var);

    default void p3(o2y0 o2y0Var, RequiredYangopayBalance requiredYangopayBalance, boolean z) {
    }

    default void ug(o2y0 o2y0Var, RequiredCardBalance requiredCardBalance, be9 be9Var) {
    }
}

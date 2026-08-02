package defpackage;

import com.yandex.go.taxi.order.custom_tips_input.mvp.CustomTipsInputModalView;
import com.yandex.messaging.domain.statuses.a;
import com.yandex.payment.divkit.bind.DKBindCardFragment;
import com.yandex.payment.divkit.bind.view.DKCardNumberInput;
import com.yandex.payment.divkit.bind.view.DKCvnInput;
import com.yandex.payment.divkit.bind.view.DKExpirationDateInput;
import com.yandex.payment.sdk.core.data.PaymentMethod;
import com.yandex.payment.sdk.ui.CardInput$State;
import com.yandex.payment.sdk.ui.view.CvnView;
import com.yandex.payment.sdk.ui.view.card.CvnInput;
import defpackage.v4j0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;
import java.util.Map;
import kotlin.Pair;
import kotlin.Triple;

/* loaded from: classes2.dex */
public final /* synthetic */ class a5f implements tls {
    public final /* synthetic */ int a;

    public /* synthetic */ a5f(int i) {
        this.a = i;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        zy11 clearInputField$lambda$0$0;
        ull0 T0;
        zy11 inputEventListener$lambda$0;
        zy11 inputEventListener$lambda$02;
        zy11 zy11Var;
        zy11 onFinish$lambda$0;
        zy11 onEmpty$lambda$0;
        zy11 eventListener$lambda$0;
        zy11 helpCallback$lambda$0;
        zy11 inputEventListener$lambda$03;
        zy11 callback$lambda$0;
        zy11 inputEventListener$lambda$04;
        int i = this.a;
        String str = null;
        zy11 zy11Var2 = zy11.a;
        switch (i) {
            case 0:
                b5f b5fVar = (b5f) obj;
                return new Pair(b5fVar.b, b5fVar.d);
            case 1:
                ((v4j0.a) obj).a = false;
                return zy11Var2;
            case 2:
                return new pbv((String) obj, (ccv) null, rev.j, (dcv) null, (vfv) null, 58);
            case 3:
                return new pbv((String) obj, (ccv) null, rev.j, (dcv) null, (vfv) null, 58);
            case 4:
                Triple triple = (Triple) obj;
                return triple.f() + ":" + triple.h();
            case 5:
                Byte b = (Byte) obj;
                b.byteValue();
                return String.format(Locale.ROOT, "%02x", Arrays.copyOf(new Object[]{b}, 1));
            case 6:
                ((wef) obj).f();
                return zy11Var2;
            case 7:
                ((wef) obj).f();
                return zy11Var2;
            case 8:
                int i2 = xff.d;
                return null;
            case 9:
                Map map = (Map) obj;
                return g8e.p((String) map.get("column"), " ", ((Boolean) map.get("isAsc")).booleanValue() ? "ASC" : "DESC");
            case 10:
                return ((a) obj).toString();
            case 11:
                return ((omf) obj).toString();
            case 12:
                clearInputField$lambda$0$0 = CustomTipsInputModalView.clearInputField$lambda$0$0(((Integer) obj).intValue());
                return clearInputField$lambda$0$0;
            case 13:
                T0 = ((oll0) obj).T0("SELECT * FROM custom_statuses");
                try {
                    int r = eja1.r(T0, "id");
                    int r2 = eja1.r(T0, "text");
                    int r3 = eja1.r(T0, "emoji");
                    int r4 = eja1.r(T0, "availability");
                    int r5 = eja1.r(T0, "notificationMode");
                    int r6 = eja1.r(T0, "icon_name");
                    ArrayList arrayList = new ArrayList();
                    while (T0.q()) {
                        String str2 = str;
                        arrayList.add(new omf(T0.getLong(r), T0.Y1(r2), T0.Y1(r3), (int) T0.getLong(r4), (int) T0.getLong(r5), T0.isNull(r6) ? str2 : T0.Y1(r6)));
                        str = str2;
                    }
                    return (omf[]) arrayList.toArray(new omf[0]);
                } catch (Throwable th) {
                    throw th;
                }
            case 14:
                oll0 oll0Var = (oll0) obj;
                T0 = oll0Var.T0("DELETE FROM custom_statuses");
                try {
                    T0.q();
                    int x = jx81.x(oll0Var);
                    T0.close();
                    return Integer.valueOf(x);
                } finally {
                    T0.close();
                }
            case 15:
                inputEventListener$lambda$0 = CvnInput.inputEventListener$lambda$0((czv) obj);
                return inputEventListener$lambda$0;
            case 16:
                return null;
            case 17:
                return 8000L;
            case 18:
                inputEventListener$lambda$02 = CvnView.inputEventListener$lambda$0((czv) obj);
                return inputEventListener$lambda$02;
            case 19:
                return zy11Var2;
            case 20:
                hpf hpfVar = hpf.b;
                return "?";
            case 21:
                zy11Var = DKBindCardFragment.setupInput$lambda$1$3((CardInput$State) obj);
                return zy11Var;
            case 22:
                onFinish$lambda$0 = DKCardNumberInput.onFinish$lambda$0(((Boolean) obj).booleanValue());
                return onFinish$lambda$0;
            case 23:
                onEmpty$lambda$0 = DKCardNumberInput.onEmpty$lambda$0(((Boolean) obj).booleanValue());
                return onEmpty$lambda$0;
            case 24:
                eventListener$lambda$0 = DKCardNumberInput.eventListener$lambda$0((czv) obj);
                return eventListener$lambda$0;
            case 25:
                helpCallback$lambda$0 = DKCvnInput.helpCallback$lambda$0(((Integer) obj).intValue());
                return helpCallback$lambda$0;
            case 26:
                inputEventListener$lambda$03 = DKCvnInput.inputEventListener$lambda$0((czv) obj);
                return inputEventListener$lambda$03;
            case 27:
                callback$lambda$0 = DKExpirationDateInput.callback$lambda$0(((Boolean) obj).booleanValue());
                return callback$lambda$0;
            case 28:
                inputEventListener$lambda$04 = DKExpirationDateInput.inputEventListener$lambda$0((czv) obj);
                return inputEventListener$lambda$04;
            default:
                return Boolean.valueOf(a8a0.f((PaymentMethod) obj));
        }
    }
}

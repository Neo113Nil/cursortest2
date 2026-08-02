package defpackage;

import android.animation.ValueAnimator;
import com.yandex.go.multimodal_route.network.models.MultimodalRoutesOrderDto;
import com.yandex.go.payments.sbp.navigation.b;
import com.yandex.go.taxi.order.models.api.TaxiOrder;
import com.ybsdk.core.transfer.utils.PhoneInputTextWatcher;
import com.ybsdk.widgets.common.g;
import java.util.ArrayList;
import java.util.List;
import ru.yandex.taxi.order.f;

/* loaded from: classes13.dex */
public final /* synthetic */ class my30 implements tls {
    public final /* synthetic */ int a;
    public final /* synthetic */ String b;

    public /* synthetic */ my30(String str, int i) {
        this.a = i;
        this.b = str;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        ull0 T0;
        g renderInputAndSelection$lambda$2;
        Long l = null;
        switch (this.a) {
            case 0:
                ((gx30) obj).b(this.b);
                return zy11.a;
            case 1:
                ((ny30) obj).a.r(new my30(this.b, r3));
                return zy11.a;
            case 2:
                ep30 ep30Var = (ep30) obj;
                ep30Var.a.r(new t130(5, ep30Var.c, this.b));
                return zy11.a;
            case 3:
                nu40 nu40Var = (nu40) obj;
                nu40Var.a.r(new t130(25, nu40Var, this.b));
                return zy11.a;
            case 4:
                return Boolean.valueOf(jl40.l(((MultimodalRoutesOrderDto) obj).getA(), this.b));
            case 5:
                ((kl80) obj).o1(this.b);
                return zy11.a;
            case 6:
                ((cg50) obj).g0(this.b);
                return zy11.a;
            case 7:
                String str = this.b;
                gg50 gg50Var = (gg50) obj;
                gg50Var.n1();
                gg50Var.a.r(new my30(str, 6));
                return zy11.a;
            case 8:
                xby.l(jst.e, "NAVIGATOR", null, (Throwable) obj, g8e.o("failed to download file by url: ", this.b), 2);
                return zy11.a;
            case 9:
                ((b) obj).n1(this.b);
                return zy11.a;
            case 10:
                ((jp70) obj).a.j0(this.b);
                return zy11.a;
            case 11:
                String str2 = this.b;
                jp70 jp70Var = (jp70) obj;
                TaxiOrder taxiOrder = jp70Var.c;
                synchronized (taxiOrder) {
                    taxiOrder.l = taxiOrder.l.B(true);
                }
                jp70Var.a.v1.put(jp70Var.b.b().a, str2);
                f fVar = jp70Var.a;
                o2y0 o2y0Var = jp70Var.b;
                fVar.W(o2y0Var, o2y0Var.b().h.b, null);
                return zy11.a;
            case 12:
                return Boolean.valueOf(jl40.l(((o2y0) obj).b().a, this.b));
            case 13:
                return Boolean.valueOf(jl40.l(((o2y0) obj).b().a, this.b));
            case 14:
                String str3 = this.b;
                mnq0 mnq0Var = (mnq0) obj;
                androidx.compose.ui.semantics.f.p(mnq0Var, 0);
                androidx.compose.ui.semantics.f.l(mnq0Var, str3);
                return zy11.a;
            case 15:
                mnq0 mnq0Var2 = (mnq0) obj;
                androidx.compose.ui.semantics.f.l(mnq0Var2, this.b);
                androidx.compose.ui.semantics.f.p(mnq0Var2, 0);
                return zy11.a;
            case 16:
                mnq0 mnq0Var3 = (mnq0) obj;
                androidx.compose.ui.semantics.f.l(mnq0Var3, this.b);
                androidx.compose.ui.semantics.f.p(mnq0Var3, 0);
                return zy11.a;
            case 17:
                androidx.compose.ui.semantics.f.l((mnq0) obj, this.b);
                return zy11.a;
            case 18:
                String str4 = this.b;
                oll0 oll0Var = (oll0) obj;
                T0 = oll0Var.T0("DELETE FROM pending_message_to_chat_request WHERE message_id = ?");
                try {
                    T0.g1(1, str4);
                    T0.q();
                    int x = jx81.x(oll0Var);
                    T0.close();
                    return Integer.valueOf(x);
                } finally {
                }
            case 19:
                String str5 = this.b;
                oll0 oll0Var2 = (oll0) obj;
                T0 = oll0Var2.T0("UPDATE pending_message_to_chat_request SET message_is_paused=0 where message_id = ?");
                try {
                    T0.g1(1, str5);
                    T0.q();
                    int x2 = jx81.x(oll0Var2);
                    T0.close();
                    return Integer.valueOf(x2);
                } finally {
                }
            case 20:
                String str6 = this.b;
                T0 = ((oll0) obj).T0("SELECT COUNT(*) FROM pending_message_to_chat_request WHERE message_chat_request_id = ?");
                try {
                    T0.g1(1, str6);
                    r3 = T0.q() ? (int) T0.getLong(0) : 0;
                    T0.close();
                    return Integer.valueOf(r3);
                } finally {
                }
            case 21:
                String str7 = this.b;
                oll0 oll0Var3 = (oll0) obj;
                T0 = oll0Var3.T0("UPDATE pending_message_to_chat_request SET message_is_paused=1 where message_id = ?");
                try {
                    T0.g1(1, str7);
                    T0.q();
                    int x3 = jx81.x(oll0Var3);
                    T0.close();
                    return Integer.valueOf(x3);
                } finally {
                }
            case 22:
                String str8 = this.b;
                oll0 oll0Var4 = (oll0) obj;
                T0 = oll0Var4.T0("DELETE FROM pending_chat_requests WHERE chat_request_id = ?");
                try {
                    T0.g1(1, str8);
                    T0.q();
                    int x4 = jx81.x(oll0Var4);
                    T0.close();
                    return Integer.valueOf(x4);
                } finally {
                }
            case 23:
                String str9 = this.b;
                T0 = ((oll0) obj).T0("SELECT order_value, prefix, key, value FROM persistent_queue WHERE prefix = ? ORDER BY order_value");
                try {
                    T0.g1(1, str9);
                    ArrayList arrayList = new ArrayList();
                    while (T0.q()) {
                        T0.getLong(0);
                        T0.Y1(1);
                        arrayList.add(new y2b0(T0.Y1(2), T0.getBlob(3)));
                    }
                    return arrayList;
                } finally {
                }
            case 24:
                String str10 = this.b;
                T0 = ((oll0) obj).T0("SELECT * FROM personal_mentions WHERE chat_id = ?");
                try {
                    T0.g1(1, str10);
                    int r = eja1.r(T0, "row_id");
                    int r2 = eja1.r(T0, "chat_id");
                    int r3 = eja1.r(T0, "message_timestamp");
                    int r4 = eja1.r(T0, "is_thread");
                    ArrayList arrayList2 = new ArrayList();
                    while (T0.q()) {
                        arrayList2.add(new l5b0(T0.getLong(r), T0.Y1(r2), T0.getLong(r3), ((int) T0.getLong(r4)) != 0));
                    }
                    return arrayList2;
                } finally {
                }
            case 25:
                renderInputAndSelection$lambda$2 = PhoneInputTextWatcher.renderInputAndSelection$lambda$2(this.b, (g) obj);
                return renderInputAndSelection$lambda$2;
            case 26:
                return dnz0.a((dnz0) obj, this.b, null, 2);
            case 27:
                String str11 = this.b;
                T0 = ((oll0) obj).T0("SELECT chats_order FROM pinned_chats WHERE chat_id = ?");
                try {
                    T0.g1(1, str11);
                    if (T0.q() && !T0.isNull(0)) {
                        l = Long.valueOf(T0.getLong(0));
                    }
                    return l;
                } finally {
                }
            case 28:
                ValueAnimator valueAnimator = (ValueAnimator) obj;
                List list = (List) g4c0.a.get(this.b);
                if (list != null) {
                    list.remove(valueAnimator);
                }
                return zy11.a;
            default:
                ValueAnimator valueAnimator2 = (ValueAnimator) obj;
                List list2 = (List) g4c0.a.get(this.b);
                if (list2 != null) {
                    list2.remove(valueAnimator2);
                }
                return zy11.a;
        }
    }
}

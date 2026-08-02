package defpackage;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.net.Uri;
import android.text.Html;
import android.text.Spanned;
import android.text.TextUtils;
import androidx.core.app.t;
import androidx.core.app.v;
import com.yandex.fintechsdk.flows.applink.payment.internal.di.paymentform.features.bdui.action.finish.FinishFlowStatus;
import com.yandex.go.taxi.order.chat.data.b;
import com.yandex.go.taxi.order.models.api.TaxiOrder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.a;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerializationException;
import ru.CryptoPro.JCP.tools.SelfTester_JCP;
import ru.yandex.taxi.activity.AndroidComponentRepository$Component;
import ru.yandex.taxi.notifications.push.model.NotificationShareData;
import ru.yandex.taxi.startup.launch.c;
import ru.yandex.taxi.vendor_api.google.push.FcmNotificationService;

/* loaded from: classes6.dex */
public final class lo70 implements v1g0 {
    public final wnt a;
    public final h3y b;
    public final h3y c;
    public final h3y d;
    public final h3y e;

    public lo70(wnt wntVar, h3y h3yVar, h3y h3yVar2, h3y h3yVar3, h3y h3yVar4) {
        this.a = wntVar;
        this.b = h3yVar;
        this.c = h3yVar2;
        this.d = h3yVar3;
        this.e = h3yVar4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0147 A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x014e  */
    /* JADX WARN: Type inference failed for: r9v12 */
    /* JADX WARN: Type inference failed for: r9v13 */
    /* JADX WARN: Type inference failed for: r9v14, types: [java.lang.Object] */
    @Override // defpackage.v1g0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean a(Map map) {
        Object obj;
        i5p i5pVar;
        String str;
        String str2;
        TaxiOrder taxiOrder;
        b6b b6bVar;
        Boolean bool;
        TaxiOrder taxiOrder2;
        wnt wntVar = this.a;
        String str3 = (String) map.get("extra");
        KSerializer serializer = i5p.Companion.serializer();
        String str4 = null;
        if (str3 != null && str3.length() != 0) {
            try {
                obj = ((xnt) wntVar).c(str3, serializer);
            } catch (SerializationException e) {
                jst.e.k(e, String.format("Failed to parse '%s' from gcm message", Arrays.copyOf(new Object[]{str3}, 1)));
            }
            i5pVar = (i5p) obj;
            if (i5pVar == null && (str = i5pVar.a) != null && str.length() != 0 && (str2 = i5pVar.c) != null && str2.length() != 0) {
                String str5 = i5pVar.b;
                List J0 = a.J0(((ysg) this.b.get()).d().a);
                if ((str5 == null || evu0.J(str5)) && J0.size() == 1) {
                    taxiOrder = (TaxiOrder) a.P(J0);
                } else {
                    Iterator it = J0.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            taxiOrder2 = 0;
                            break;
                        }
                        taxiOrder2 = it.next();
                        if (jl40.l(((TaxiOrder) taxiOrder2).a, str5)) {
                            break;
                        }
                    }
                    taxiOrder = taxiOrder2;
                }
                if (taxiOrder == null) {
                    h3y h3yVar = this.e;
                    String str6 = (String) map.get("id");
                    if (str6 != null) {
                        ((p1g0) h3yVar.get()).a(str6, null);
                        xby.l(jst.e, "PUSH_ACK:ERROR:UNKNOWN_ORDER_FOR_CHAT", null, null, "Failed to handle push with payload ".concat(a.X(iw00.x(map), null, null, null, null, 63)), 2);
                    }
                    ((c) this.d.get()).c("PushNotification.handleOrderChat");
                    return true;
                }
                String str7 = (String) map.get(FcmNotificationService.KEY_TITLE);
                String str8 = (String) map.get(FcmNotificationService.KEY_BODY);
                String str9 = (String) map.get("notification_group");
                synchronized (taxiOrder) {
                    taxiOrder.l = taxiOrder.l.K(str9);
                }
                fzx0 fzx0Var = (fzx0) this.c.get();
                if (str5 == null) {
                    str5 = "";
                }
                String p = taxiOrder.p();
                String str10 = i5pVar.c;
                String str11 = str10 != null ? str10 : "";
                fzx0Var.getClass();
                if (str7 != null && str7.length() != 0 && (str8 == null || str8.length() == 0)) {
                    str8 = str7;
                    str7 = ((avj0) fzx0Var.c).h(kyh0.app_name);
                }
                b c = fzx0Var.b.c(str5);
                if (str8 != null) {
                    com.yandex.go.taxi.order.chat.data.db.a aVar = c.e;
                    dxt0 dxt0Var = aVar.b;
                    Context context = aVar.c;
                    Uri uri = aVar.d;
                    dxt0Var.getClass();
                    Cursor query = context.getContentResolver().query(uri.buildUpon().appendQueryParameter("limit", "1").build(), new String[]{"unique_id"}, "is_read IS NOT 1 AND order_id = ? AND message_id = ?", new String[]{str5, str11}, null);
                    if (query != null) {
                        try {
                            if (query.moveToFirst()) {
                                Cursor cursor = query;
                                bool = Boolean.TRUE;
                                if (query != null) {
                                }
                                if (bool == null) {
                                    ArrayList arrayList = new ArrayList(c.t);
                                    arrayList.add(str8);
                                    b6bVar = (str7 == null || !c.u) ? null : new b6b(str7, a.J0(arrayList));
                                    c.t = arrayList;
                                    if (b6bVar != null) {
                                        q280 q280Var = fzx0Var.a;
                                        String str12 = b6bVar.a;
                                        List list = b6bVar.b;
                                        xk60 xk60Var = q280Var.c;
                                        NotificationShareData.a builder = NotificationShareData.INSTANCE.builder();
                                        builder.b = "local:taxi_order:chat:17532";
                                        builder.g = kotlin.collections.b.h(new Pair(FinishFlowStatus.ORDER_ID_FIELD_NAME, str5));
                                        builder.a = 17532;
                                        builder.d = str5;
                                        Intent intent = new Intent(q280Var.a, (Class<?>) q280Var.k.a(AndroidComponentRepository$Component.MAIN_ACTIVITY));
                                        xq70 xq70Var = (xq70) q280Var.g;
                                        e0y0 e0y0Var = new e0y0(str5, xq70Var.d(), false);
                                        ((pux0) xq70Var.a).getClass();
                                        PendingIntent c2 = q280Var.c(intent.setData(xq70.a(e0y0Var, pux0.c)).setAction("android.intent.action.VIEW").putExtra("notification_share_data_extra", builder.a()).addFlags(SelfTester_JCP.IMITA), false, null);
                                        String b = q280Var.e.b(str12, str5);
                                        if (b != null && !evu0.J(b)) {
                                            str4 = b;
                                        }
                                        List M = a.M(list);
                                        zuj0 zuj0Var = xk60Var.c;
                                        t.e eVar = new t.e();
                                        ArrayList arrayList2 = (ArrayList) M;
                                        int min = Math.min(arrayList2.size(), 5);
                                        for (int i = 0; i < min; i++) {
                                            eVar.e((CharSequence) arrayList2.get(i));
                                        }
                                        if (arrayList2.size() > 5) {
                                            eVar.f(((avj0) zuj0Var).i(kyh0.chat_notification_more_messages, Integer.valueOf(arrayList2.size() - 5)));
                                        }
                                        v vVar = new v(xk60Var.a, "chat");
                                        vVar.K.icon = xk60.n;
                                        avj0 avj0Var = (avj0) zuj0Var;
                                        vVar.z = avj0Var.a(rqg0.notification_tint_color);
                                        vVar.e = v.d(str4);
                                        CharSequence charSequence = (CharSequence) arrayList2.get(0);
                                        if (arrayList2.size() != 1) {
                                            charSequence = Html.fromHtml(avj0Var.i(xzh0.inbox_style_messages_summary, charSequence instanceof Spanned ? Html.toHtml((Spanned) charSequence) : TextUtils.htmlEncode(charSequence.toString()), Integer.valueOf(arrayList2.size() - 1)));
                                        }
                                        vVar.f = v.d(charSequence);
                                        vVar.h = c2;
                                        vVar.l = arrayList2.size();
                                        vVar.h(16, true);
                                        vVar.h(2, false);
                                        vVar.g(-1);
                                        vVar.l(eVar);
                                        vVar.x = "msg";
                                        xk60Var.m(builder, vVar, p, "chat");
                                    }
                                    fzx0Var.b.c(str5).i(str11);
                                    return true;
                                }
                            }
                        } finally {
                            query.close();
                        }
                    }
                    bool = null;
                    if (query != null) {
                    }
                    if (bool == null) {
                    }
                } else {
                    c.getClass();
                }
                b6bVar = null;
                if (b6bVar != null) {
                }
                fzx0Var.b.c(str5).i(str11);
                return true;
            }
        }
        obj = null;
        i5pVar = (i5p) obj;
        return i5pVar == null ? false : false;
    }
}

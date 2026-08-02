package com.yandex.go.taxi.order.chat.data.db;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import com.yandex.go.taxi.order.chat.api.data.model.Sender;
import com.yandex.go.taxi.order.logger.TaxiOrderLogGroup;
import defpackage.a3y0;
import defpackage.dxt0;
import defpackage.h6u0;
import defpackage.qie;
import defpackage.rie;
import defpackage.rsf;
import java.util.List;

/* loaded from: classes14.dex */
public final class a {
    public final qie a;
    public final dxt0 b;
    public final Context c;
    public final Uri d;
    public final a3y0 e = new a3y0(TaxiOrderLogGroup.ORDER_CHAT.getTag(), "DbOrderChatMessages");

    public a(Context context, qie qieVar, dxt0 dxt0Var) {
        this.a = qieVar;
        this.b = dxt0Var;
        this.c = context.getApplicationContext();
        this.d = ((rie) qieVar).a("orderchat");
    }

    public final int a(String str) {
        try {
            Cursor query = this.c.getContentResolver().query(this.d, new String[]{"unique_id"}, "sender_role = \"" + Sender.Role.DRIVER + "\" AND is_read IS NOT 1 AND order_id = ?", new String[]{str}, null);
            if (query == null) {
                return 0;
            }
            Cursor cursor = query;
            try {
                int count = cursor.getCount();
                cursor.close();
                return count;
            } finally {
            }
        } catch (Exception e) {
            this.e.b("driversUnreadMessagesCount", e, new rsf(10));
            return 0;
        }
    }

    public final List b(String str) {
        DbOrderChatMessages$query$1 dbOrderChatMessages$query$1 = new DbOrderChatMessages$query$1(1, this, a.class, "fromCursor", "fromCursor(Landroid/database/Cursor;)Lcom/yandex/go/taxi/order/chat/api/domain/model/SentMessage;", 0);
        this.b.getClass();
        return h6u0.j(this.c, this.d, "order_id = ?", new String[]{str}, "created_date DESC, unique_id DESC", dbOrderChatMessages$query$1);
    }
}

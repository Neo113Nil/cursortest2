package com.yandex.go.taxi.order.chat.data.db;

import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.net.Uri;
import defpackage.dxt0;
import defpackage.h6u0;
import defpackage.isa0;
import defpackage.qie;
import defpackage.rie;
import defpackage.zzs;
import java.util.List;

/* loaded from: classes14.dex */
public final class b {
    public final dxt0 a;
    public final Context b;
    public final Uri c;

    public b(Context context, qie qieVar, dxt0 dxt0Var) {
        this.a = dxt0Var;
        this.b = context.getApplicationContext();
        this.c = ((rie) qieVar).a("orderchat_pending");
    }

    public final void a(String str, isa0 isa0Var) {
        long j;
        long j2;
        ContentResolver contentResolver = this.b.getContentResolver();
        ContentValues contentValues = new ContentValues();
        contentValues.put("unique_id", Long.valueOf(isa0Var.a));
        contentValues.put("order_id", str);
        contentValues.put("text", isa0Var.x);
        contentValues.put("suggestion_alias", isa0Var.c);
        contentValues.put("created_date", Long.valueOf(isa0Var.b));
        zzs zzsVar = isa0Var.w;
        if (zzsVar != null) {
            j = Double.doubleToLongBits(zzsVar.a);
            j2 = Double.doubleToLongBits(zzsVar.b);
        } else {
            j = 0;
            j2 = 0;
        }
        contentValues.put("location_lat", Long.valueOf(j));
        contentValues.put("location_lon", Long.valueOf(j2));
        contentResolver.insert(this.c, contentValues);
    }

    public final List b(String str) {
        DbOrderChatPendingMessages$query$1 dbOrderChatPendingMessages$query$1 = new DbOrderChatPendingMessages$query$1(1, this, b.class, "fromCursor", "fromCursor(Landroid/database/Cursor;)Lcom/yandex/go/taxi/order/chat/api/domain/model/PendingMessage;", 0);
        this.a.getClass();
        return h6u0.j(this.b, this.c, "order_id = ?", new String[]{str}, null, dbOrderChatPendingMessages$query$1);
    }

    public final void c(isa0 isa0Var) {
        String[] strArr = {String.valueOf(isa0Var.a)};
        this.a.getClass();
        h6u0.h(this.b, this.c, "unique_id = ?", strArr);
    }
}

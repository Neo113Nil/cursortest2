package com.yandex.go.taxi.order.chat.data.db;

import android.database.Cursor;
import defpackage.isa0;
import defpackage.tls;
import defpackage.zzs;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
final /* synthetic */ class DbOrderChatPendingMessages$query$1 extends FunctionReferenceImpl implements tls {
    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        Cursor cursor = (Cursor) obj;
        ((b) this.receiver).getClass();
        long j = cursor.getLong(cursor.getColumnIndex("location_lat"));
        long j2 = cursor.getLong(cursor.getColumnIndex("location_lon"));
        return new isa0(cursor.getLong(cursor.getColumnIndex("unique_id")), cursor.getLong(cursor.getColumnIndex("created_date")), cursor.getString(cursor.getColumnIndex("suggestion_alias")), (j2 == 0 && j == 0) ? null : new zzs(Double.longBitsToDouble(j), Double.longBitsToDouble(j2), 0, null, null, 28), cursor.getString(cursor.getColumnIndex("text")));
    }
}

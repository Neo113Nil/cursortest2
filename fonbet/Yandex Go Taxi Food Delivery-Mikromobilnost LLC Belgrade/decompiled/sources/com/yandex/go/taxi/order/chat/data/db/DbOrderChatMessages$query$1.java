package com.yandex.go.taxi.order.chat.data.db;

import android.database.Cursor;
import com.yandex.go.taxi.order.chat.api.data.model.Message;
import com.yandex.go.taxi.order.chat.api.data.model.Sender;
import com.yandex.go.taxi.order.chat.api.data.model.Translation;
import com.yandex.go.taxi.order.chat.api.data.model.g;
import defpackage.drq0;
import defpackage.gtq0;
import defpackage.tls;
import defpackage.tmx;
import defpackage.xc8;
import defpackage.zzs;
import java.util.Calendar;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
final /* synthetic */ class DbOrderChatMessages$query$1 extends FunctionReferenceImpl implements tls {
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00c5, code lost:
    
        if (r1.getInt(r0) == 1) goto L29;
     */
    @Override // defpackage.tls
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj) {
        Sender.Role role;
        Message.Action action;
        Message.Action action2;
        Cursor cursor = (Cursor) obj;
        a aVar = (a) this.receiver;
        aVar.getClass();
        g gVar = Sender.Companion;
        String string = cursor.getString(cursor.getColumnIndex("sender_nick"));
        String string2 = cursor.getString(cursor.getColumnIndex("sender_role"));
        gVar.getClass();
        if (string2 == null || (role = (Sender.Role) gtq0.j(string2, ((tmx) Sender.e.getValue()).a)) == null) {
            role = Sender.Role.UNKNOWN;
        }
        Sender sender = new Sender(string, role);
        int columnIndex = cursor.getColumnIndex("location_lat");
        int columnIndex2 = cursor.getColumnIndex("location_lon");
        Translation translation = null;
        zzs zzsVar = (cursor.isNull(columnIndex) || cursor.isNull(columnIndex2)) ? null : new zzs(Double.longBitsToDouble(cursor.getLong(columnIndex)), Double.longBitsToDouble(cursor.getLong(columnIndex2)), 0, null, null, 28);
        String string3 = cursor.getString(cursor.getColumnIndex("action"));
        if (string3 == null || string3.length() == 0) {
            action = null;
        } else {
            try {
                action2 = Message.Action.valueOf(string3);
            } catch (IllegalArgumentException e) {
                aVar.e.b("fromCursor", e, new xc8(string3, 7));
                action2 = null;
            }
            action = action2;
        }
        long j = cursor.getLong(cursor.getColumnIndex("created_date"));
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(j);
        int columnIndex3 = cursor.getColumnIndex("is_read");
        boolean z = cursor.isNull(columnIndex3) ? false : true;
        boolean z2 = z;
        String string4 = cursor.getString(cursor.getColumnIndex("translation_language"));
        String string5 = cursor.getString(cursor.getColumnIndex("translation_text"));
        if (string4 != null && string4.length() != 0 && string5 != null && string5.length() != 0) {
            translation = new Translation(string4, string5);
        }
        return new drq0(cursor.getLong(cursor.getColumnIndex("unique_id")), cursor.getString(cursor.getColumnIndex("message_id")), sender, zzsVar, cursor.getString(cursor.getColumnIndex("text")), cursor.getString(cursor.getColumnIndex("language")), translation, calendar, action, z2);
    }
}

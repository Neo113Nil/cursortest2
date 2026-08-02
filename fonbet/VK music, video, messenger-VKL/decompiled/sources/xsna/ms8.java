package xsna;

import android.database.Cursor;
import android.os.Trace;
import com.vk.core.serialize.Serializer;
import com.vk.dto.common.Peer;
import java.util.ArrayList;
import kotlin.NoWhenBranchMatchedException;
import xsna.pq8;

/* compiled from: ButtonsStorageManagerImpl.kt */
/* loaded from: classes2.dex */
public final class ms8 implements ls8 {
    public final tgl0 a;

    public ms8(tgl0 tgl0Var) {
        this.a = tgl0Var;
    }

    public static String f(pq8 pq8Var) {
        if (pq8Var instanceof pq8.a) {
            StringBuilder sb = new StringBuilder("WHERE dialog_id = ");
            pq8.a aVar = (pq8.a) pq8Var;
            sb.append(aVar.b.b);
            sb.append(" AND position_in_keyboard = ");
            sb.append(pq8Var.a);
            sb.append(" AND msg_cnv_id = ");
            sb.append(aVar.c);
            sb.append(" AND carousel_item_position = ");
            sb.append(aVar.d);
            return sb.toString();
        }
        if (!(pq8Var instanceof pq8.c)) {
            if (!(pq8Var instanceof pq8.b)) {
                throw new NoWhenBranchMatchedException();
            }
            return "WHERE dialog_id = " + ((pq8.b) pq8Var).b.b + " AND position_in_keyboard = " + pq8Var.a;
        }
        StringBuilder sb2 = new StringBuilder("WHERE dialog_id = ");
        pq8.c cVar = (pq8.c) pq8Var;
        sb2.append(cVar.b.b);
        sb2.append(" AND position_in_keyboard = ");
        sb2.append(pq8Var.a);
        sb2.append(" AND msg_cnv_id = ");
        sb2.append(cVar.c);
        return sb2.toString();
    }

    public static pq8 g(Cursor cursor) {
        int A = fl3.A(cursor, "type_id");
        int A2 = fl3.A(cursor, "position_in_keyboard");
        Serializer.c<Peer> cVar = Peer.CREATOR;
        Peer b = Peer.a.b(fl3.C(cursor, "dialog_id"));
        if (A == 0) {
            return new pq8.c(fl3.A(cursor, "msg_cnv_id"), A2, b);
        }
        if (A == 1) {
            return new pq8.a(fl3.A(cursor, "msg_cnv_id"), fl3.A(cursor, "carousel_item_position"), A2, b);
        }
        if (A == 2) {
            return new pq8.b(A2, b);
        }
        throw new IllegalArgumentException("No valid type_id for ButtonPositionInfo");
    }

    @Override // xsna.ls8
    public final ArrayList a() {
        ArrayList arrayList = new ArrayList();
        Cursor d = this.a.b().d("SELECT * FROM bot_btn_in_loading", null);
        Trace.beginSection(ndp0.f("Cursor.forEach"));
        try {
            try {
                if (d.moveToFirst()) {
                    while (!d.isAfterLast()) {
                        arrayList.add(g(d));
                        d.moveToNext();
                    }
                }
                return arrayList;
            } finally {
                d.close();
            }
        } finally {
            Trace.endSection();
        }
    }

    @Override // xsna.ls8
    public final void b(String str, pq8 pq8Var) {
        this.a.b().execSQL("UPDATE bot_btn_in_loading SET event_id = ? " + f(pq8Var), new String[]{str});
    }

    @Override // xsna.ls8
    public final void c(pq8 pq8Var) {
        String b;
        int i = pq8Var.a;
        if (pq8Var instanceof pq8.a) {
            StringBuilder a = vq.a("INSERT INTO bot_btn_in_loading (position_in_keyboard, dialog_id, msg_cnv_id, carousel_item_position, type_id) VALUES (", i, ',');
            pq8.a aVar = (pq8.a) pq8Var;
            a.append(aVar.b.b);
            a.append(", ");
            a.append(aVar.c);
            a.append(", ");
            b = h5s.c(aVar.d, ", 1)", a);
        } else if (pq8Var instanceof pq8.c) {
            StringBuilder b2 = ji.b(i, "INSERT INTO bot_btn_in_loading (position_in_keyboard, dialog_id, msg_cnv_id, type_id) VALUES (", ", ");
            pq8.c cVar = (pq8.c) pq8Var;
            b2.append(cVar.b.b);
            b2.append(", ");
            b2.append(cVar.c);
            b2.append(", ");
            b2.append(cVar.a());
            b2.append(')');
            b = b2.toString();
        } else {
            if (!(pq8Var instanceof pq8.b)) {
                throw new NoWhenBranchMatchedException();
            }
            b = efz.b(((pq8.b) pq8Var).b.b, ", 2)", ji.b(i, "INSERT INTO bot_btn_in_loading (position_in_keyboard, dialog_id, type_id) VALUES (", ", "));
        }
        this.a.b().execSQL(b);
    }

    @Override // xsna.ls8
    public final pq8 d(String str) {
        Cursor d = this.a.b().d("SELECT * FROM bot_btn_in_loading WHERE event_id = ?", new String[]{str});
        try {
            return d.moveToFirst() ? g(d) : null;
        } finally {
            d.close();
        }
    }

    @Override // xsna.ls8
    public final void e(String str, pq8 pq8Var) {
        tgl0 tgl0Var = this.a;
        if (str != null) {
            tgl0Var.b().execSQL("DELETE FROM bot_btn_in_loading WHERE event_id = ?", new String[]{str});
            return;
        }
        tgl0Var.b().execSQL("DELETE FROM bot_btn_in_loading " + f(pq8Var));
    }
}

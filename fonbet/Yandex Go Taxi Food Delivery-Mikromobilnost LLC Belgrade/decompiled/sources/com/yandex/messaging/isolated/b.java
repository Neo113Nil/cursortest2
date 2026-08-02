package com.yandex.messaging.isolated;

import android.database.Cursor;
import android.database.MatrixCursor;
import com.yandex.messaging.sdk.ChatFilterParams;
import defpackage.at2;
import defpackage.iwk0;
import defpackage.k020;
import defpackage.kse;
import defpackage.mth;
import defpackage.o4b;
import defpackage.oyr;
import defpackage.q5z;
import defpackage.rol0;
import defpackage.sb7;
import defpackage.tpr;
import defpackage.udq0;
import defpackage.ueb;
import defpackage.vds0;
import defpackage.z83;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.TreeMap;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes15.dex */
public final class b extends vds0 {
    public final k020 b;
    public final sb7 c;
    public final kse d;

    public b(k020 k020Var, sb7 sb7Var, kse kseVar) {
        super(kseVar.b);
        this.b = k020Var;
        this.c = sb7Var;
        this.d = kseVar;
    }

    public static final ArrayList d(b bVar, ChatFilterParams chatFilterParams) {
        Cursor O0;
        k020 k020Var = bVar.b;
        int i = 0;
        if (chatFilterParams == null) {
            ueb c = k020Var.b.c();
            c.getClass();
            TreeMap treeMap = iwk0.B;
            return new o4b(c.a.O0(udq0.e(0, "SELECT chat_internal_id, cv.chat_id chat_id, unseen, display_name, is_pinned, mute, addressee_id, flags, pinned_chats.chats_order\n        FROM chats_view cv LEFT JOIN pinned_chats ON cv.chat_id = pinned_chats.chat_id WHERE is_hidden = 0\n        ORDER BY chats_order IS NULL, chats_order ASC, sort_time DESC\n    ")), i).w();
        }
        List<Integer> namespaces = chatFilterParams.getNamespaces();
        List<String> guids = chatFilterParams.getGuids();
        at2 at2Var = k020Var.b;
        if (namespaces.isEmpty() && guids.isEmpty()) {
            z83.i();
            O0 = new MatrixCursor(new String[0], 0);
        } else if (namespaces.isEmpty()) {
            ueb c2 = at2Var.c();
            c2.getClass();
            StringBuilder sb = new StringBuilder();
            sb.append("SELECT chat_internal_id, chats_view.chat_id chat_id, unseen, display_name, is_pinned, mute, addressee_id, flags FROM chats_view\n        WHERE is_hidden = 0 AND addressee_id IN (");
            int size = guids.size();
            q5z.b(sb, size);
            sb.append(Extension.C_BRAKE);
            sb.append("\n");
            sb.append("        ORDER BY sort_time DESC");
            String t = oyr.t(sb, "\n", Extension.TAB_CHAR);
            TreeMap treeMap2 = iwk0.B;
            iwk0 e = udq0.e(size, t);
            Iterator<String> it = guids.iterator();
            int i2 = 1;
            while (it.hasNext()) {
                e.m0(i2, it.next());
                i2++;
            }
            O0 = c2.a.O0(e);
        } else if (guids.isEmpty()) {
            ueb c3 = at2Var.c();
            c3.getClass();
            StringBuilder sb2 = new StringBuilder();
            sb2.append("SELECT chat_internal_id, chat_id, unseen, display_name, is_pinned, mute, addressee_id, flags FROM chats_view\n        WHERE is_hidden = 0 AND namespace IN (");
            int size2 = namespaces.size();
            q5z.b(sb2, size2);
            sb2.append(Extension.C_BRAKE);
            sb2.append("\n");
            sb2.append("        ORDER BY sort_time DESC");
            String t2 = oyr.t(sb2, "\n", Extension.TAB_CHAR);
            TreeMap treeMap3 = iwk0.B;
            iwk0 e2 = udq0.e(size2, t2);
            Iterator<Integer> it2 = namespaces.iterator();
            int i3 = 1;
            while (it2.hasNext()) {
                e2.b(i3, it2.next().intValue());
                i3++;
            }
            O0 = c3.a.O0(e2);
        } else {
            ueb c4 = at2Var.c();
            c4.getClass();
            StringBuilder sb3 = new StringBuilder();
            sb3.append("SELECT chat_internal_id, chat_id, unseen, display_name, is_pinned, mute, addressee_id, flags FROM chats_view\n        WHERE is_hidden = 0 AND ( namespace IN (");
            int size3 = namespaces.size();
            q5z.b(sb3, size3);
            sb3.append(") OR addressee_id IN (");
            int size4 = guids.size();
            q5z.b(sb3, size4);
            sb3.append(") )");
            sb3.append("\n");
            sb3.append("        ORDER BY sort_time DESC");
            String t3 = oyr.t(sb3, "\n", Extension.TAB_CHAR);
            TreeMap treeMap4 = iwk0.B;
            iwk0 e3 = udq0.e(size4 + size3, t3);
            Iterator<Integer> it3 = namespaces.iterator();
            int i4 = 1;
            while (it3.hasNext()) {
                e3.b(i4, it3.next().intValue());
                i4++;
            }
            int i5 = size3 + 1;
            Iterator<String> it4 = guids.iterator();
            while (it4.hasNext()) {
                e3.m0(i5, it4.next());
                i5++;
            }
            O0 = c4.a.O0(e3);
        }
        return new o4b(O0, i).w();
    }

    @Override // defpackage.vds0
    public final tpr b(Object obj) {
        return new mth(new rol0(new GetIsolatedChatListUseCase$run$1(this, (ChatFilterParams) obj, null)), 6);
    }
}

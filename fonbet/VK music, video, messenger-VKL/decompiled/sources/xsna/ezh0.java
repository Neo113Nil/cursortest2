package xsna;

import com.vk.core.serialize.Serializer;
import com.vk.dto.common.Peer;
import com.vk.im.engine.models.groups.Group;
import io.requery.android.database.sqlite.SQLiteStatement;
import java.util.ArrayList;
import java.util.Locale;

/* compiled from: SearchStorageManagerImpl.kt */
/* loaded from: classes2.dex */
public final class ezh0 implements izs<e0w, s3q0> {
    public final /* synthetic */ ArrayList b;

    public ezh0(dzh0 dzh0Var, ArrayList arrayList) {
        this.b = arrayList;
    }

    @Override // xsna.izs
    public final s3q0 invoke(e0w e0wVar) {
        e0w e0wVar2 = e0wVar;
        SQLiteStatement compileStatement = e0wVar2.compileStatement("\n            UPDATE peers_search\n            SET member_type = ?, member_id = ?, title = ?, domain = ?\n            WHERE docid = ?\n            ");
        SQLiteStatement sQLiteStatement = null;
        try {
            for (Object obj : this.b) {
                Peer.Type type = Peer.Type.GROUP;
                compileStatement.bindLong(1, type.h());
                compileStatement.bindLong(2, ((Group) obj).b);
                String str = ((Group) obj).c;
                Locale locale = Locale.ROOT;
                compileStatement.bindString(3, str.toLowerCase(locale));
                compileStatement.bindString(4, ((Group) obj).d.toLowerCase(locale));
                Serializer.c<Peer> cVar = Peer.CREATOR;
                compileStatement.bindLong(5, Peer.a.e(((Group) obj).b, type));
                if (compileStatement.executeUpdateDelete() == 0) {
                    if (sQLiteStatement == null) {
                        sQLiteStatement = e0wVar2.g("REPLACE INTO peers_search(docid,member_type,member_id,is_from_search,title,domain,hint_position) VALUES(?,?,?,?,?,?,?)");
                    }
                    sQLiteStatement.bindLong(1, Peer.a.e(((Group) obj).b, type));
                    sQLiteStatement.bindLong(2, type.h());
                    sQLiteStatement.bindLong(3, ((Group) obj).b);
                    sQLiteStatement.bindLong(4, 0L);
                    sQLiteStatement.bindString(5, ((Group) obj).c.toLowerCase(locale));
                    sQLiteStatement.bindString(6, ((Group) obj).d.toLowerCase(locale));
                    sQLiteStatement.bindLong(7, Integer.MAX_VALUE);
                    sQLiteStatement.executeInsert();
                }
            }
            return s3q0.a;
        } finally {
            compileStatement.close();
            if (sQLiteStatement != null) {
                sQLiteStatement.close();
            }
        }
    }
}

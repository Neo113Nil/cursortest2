package xsna;

import com.vk.dto.common.Peer;
import com.vk.im.engine.models.ProfilesSimpleInfo;
import com.vk.im.engine.models.dialogs.Dialog;
import io.requery.android.database.sqlite.SQLiteStatement;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Map;

/* compiled from: SearchStorageManagerImpl.kt */
/* loaded from: classes2.dex */
public final class fzh0 implements izs<e0w, s3q0> {
    public final /* synthetic */ ArrayList b;
    public final /* synthetic */ ProfilesSimpleInfo c;
    public final /* synthetic */ dzh0 d;
    public final /* synthetic */ ProfilesSimpleInfo e;
    public final /* synthetic */ ProfilesSimpleInfo f;

    public fzh0(dzh0 dzh0Var, ArrayList arrayList, ProfilesSimpleInfo profilesSimpleInfo, dzh0 dzh0Var2, ProfilesSimpleInfo profilesSimpleInfo2, ProfilesSimpleInfo profilesSimpleInfo3) {
        this.b = arrayList;
        this.c = profilesSimpleInfo;
        this.d = dzh0Var2;
        this.e = profilesSimpleInfo2;
        this.f = profilesSimpleInfo3;
    }

    /* JADX WARN: Type inference failed for: r10v4, types: [java.lang.Object, java.util.Map] */
    @Override // xsna.izs
    public final s3q0 invoke(e0w e0wVar) {
        String str;
        String str2;
        String Ra;
        e0w e0wVar2 = e0wVar;
        ProfilesSimpleInfo profilesSimpleInfo = this.f;
        ProfilesSimpleInfo profilesSimpleInfo2 = this.e;
        dzh0 dzh0Var = this.d;
        SQLiteStatement compileStatement = e0wVar2.compileStatement("\n            UPDATE peers_search\n            SET member_type = ?, member_id = ?, title = ?, domain = ?\n            WHERE docid = ?\n            ");
        SQLiteStatement sQLiteStatement = null;
        try {
            for (Object obj : this.b) {
                Dialog dialog = (Dialog) obj;
                if (!dialog.uc()) {
                    ProfilesSimpleInfo profilesSimpleInfo3 = this.c;
                    Peer Zb = dialog.Zb();
                    if (((Map) profilesSimpleInfo3.g.get(Zb.c)).get(Long.valueOf(Zb.d)) != null) {
                    }
                }
                compileStatement.bindLong(1, ((Dialog) obj).bc().h());
                compileStatement.bindLong(2, ((Dialog) obj).ac());
                String t = dzh0.t(dzh0Var, profilesSimpleInfo2, (Dialog) obj);
                Locale locale = Locale.ROOT;
                compileStatement.bindString(3, t.toLowerCase(locale));
                qtd0 Ab = profilesSimpleInfo.Ab(((Dialog) obj).Sb());
                if (Ab == null || (str = Ab.Ra()) == null) {
                    str = "";
                }
                compileStatement.bindString(4, str.toLowerCase(locale));
                compileStatement.bindLong(5, ((Dialog) obj).Sb().longValue());
                if (compileStatement.executeUpdateDelete() == 0) {
                    if (sQLiteStatement == null) {
                        sQLiteStatement = e0wVar2.g("REPLACE INTO peers_search(docid,member_type,member_id,is_from_search,title,domain,hint_position) VALUES(?,?,?,?,?,?,?)");
                    }
                    sQLiteStatement.bindLong(1, ((Dialog) obj).Sb().longValue());
                    sQLiteStatement.bindLong(2, ((Dialog) obj).bc().h());
                    sQLiteStatement.bindLong(3, ((Dialog) obj).ac());
                    sQLiteStatement.bindLong(4, 0L);
                    sQLiteStatement.bindString(5, dzh0.t(dzh0Var, profilesSimpleInfo2, (Dialog) obj).toLowerCase(locale));
                    qtd0 Ab2 = profilesSimpleInfo.Ab(((Dialog) obj).Sb());
                    if (Ab2 != null && (Ra = Ab2.Ra()) != null) {
                        str2 = Ra;
                        sQLiteStatement.bindString(6, str2.toLowerCase(locale));
                        sQLiteStatement.bindLong(7, Integer.MAX_VALUE);
                        sQLiteStatement.executeInsert();
                    }
                    str2 = "";
                    sQLiteStatement.bindString(6, str2.toLowerCase(locale));
                    sQLiteStatement.bindLong(7, Integer.MAX_VALUE);
                    sQLiteStatement.executeInsert();
                }
            }
            compileStatement.close();
            if (sQLiteStatement != null) {
                sQLiteStatement.close();
            }
            return s3q0.a;
        } catch (Throwable th) {
            compileStatement.close();
            if (sQLiteStatement != null) {
                sQLiteStatement.close();
            }
            throw th;
        }
    }
}

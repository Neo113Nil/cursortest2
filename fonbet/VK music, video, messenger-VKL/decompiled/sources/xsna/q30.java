package xsna;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import com.vk.im.engine.models.messages.Msg;
import com.vk.newsfeed.impl.data.database.entity.action.SyncStatusEntity;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class q30 implements io.reactivex.rxjava3.functions.a {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ q30(Object obj, Object obj2, Object obj3, int i) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
    }

    @Override // io.reactivex.rxjava3.functions.a
    public final void run() {
        int i = this.b;
        Object obj = this.d;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                x60 x60Var = (x60) obj;
                y60 b = ((v30) obj2).b();
                long j = x60Var.a;
                SyncStatusEntity syncStatusEntity = SyncStatusEntity.SYNCED;
                b.a(cn00.b(x60Var.c));
                SQLiteDatabase sQLiteDatabase = b.a;
                ContentValues contentValues = new ContentValues(2);
                contentValues.put("sync_status", syncStatusEntity.h());
                contentValues.put("sync_result", (byte[]) null);
                s3q0 s3q0Var = s3q0.a;
                sQLiteDatabase.update("actions_with_offline_support", contentValues, "_id = ?", new String[]{String.valueOf(j)});
                break;
            default:
                Msg msg = (Msg) this.e;
                ((jju0) obj2).n().d(((bc6) obj).a, msg.c, msg.d, null);
                break;
        }
    }
}

package xsna;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import com.vk.newsfeed.impl.data.database.entity.action.ActionWithOfflineSupportTypeEntity;
import com.vk.newsfeed.impl.data.database.entity.action.SyncStatusEntity;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.EmptyList;
import xsna.h00;

/* compiled from: ActionWithOfflineSupportDao.kt */
/* loaded from: classes.dex */
public final class y60 {
    public final SQLiteDatabase a;
    public final HashMap<ActionWithOfflineSupportTypeEntity, g00> b = new HashMap<>();

    public y60(SQLiteDatabase sQLiteDatabase, h00 h00Var) {
        this.a = sQLiteDatabase;
    }

    public final g00 a(ActionWithOfflineSupportTypeEntity actionWithOfflineSupportTypeEntity) {
        HashMap<ActionWithOfflineSupportTypeEntity, g00> hashMap = this.b;
        g00 g00Var = hashMap.get(actionWithOfflineSupportTypeEntity);
        if (g00Var == null) {
            int i = h00.a.$EnumSwitchMapping$0[actionWithOfflineSupportTypeEntity.ordinal()];
            if (i == 1) {
                g00Var = new i00();
            } else {
                if (i != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                g00Var = new j00();
            }
            hashMap.put(actionWithOfflineSupportTypeEntity, g00Var);
        }
        return g00Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.util.List<xsna.a70>] */
    /* JADX WARN: Type inference failed for: r0v6, types: [kotlin.collections.EmptyList] */
    public final List<a70> b(SyncStatusEntity syncStatusEntity) {
        ?? arrayList;
        Cursor query = this.a.query("actions_with_offline_support", null, "sync_status = ?", new String[]{syncStatusEntity.h()}, null, null, "_id ASC");
        try {
            if (query.moveToFirst()) {
                arrayList = new ArrayList(query.getCount());
                do {
                    arrayList.add(c(query));
                } while (query.moveToNext());
            } else {
                arrayList = EmptyList.b;
            }
            query.close();
            return arrayList;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                ro.e(query, th);
                throw th2;
            }
        }
    }

    public final a70 c(Cursor cursor) {
        ActionWithOfflineSupportTypeEntity c = cn00.c(fl3.E(cursor, "action_type"));
        g00 a = a(c);
        long C = fl3.C(cursor, "_id");
        Object b = a.b(cursor.getBlob(cursor.getColumnIndexOrThrow("action")));
        SyncStatusEntity d = cn00.d(fl3.E(cursor, "sync_status"));
        fl3.v(cursor, "sync_result");
        a.d(fl3.v(cursor, "last_sync_error"));
        return new a70(C, b, c, d, null, null, fl3.A(cursor, "sync_attempt_count"));
    }

    public final void d(List<a70> list, SyncStatusEntity syncStatusEntity) {
        SQLiteDatabase sQLiteDatabase = this.a;
        sQLiteDatabase.beginTransaction();
        try {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                long j = ((a70) it.next()).a;
                ContentValues contentValues = new ContentValues(1);
                contentValues.put("sync_status", syncStatusEntity.h());
                s3q0 s3q0Var = s3q0.a;
                sQLiteDatabase.update("actions_with_offline_support", contentValues, "_id = ?", new String[]{String.valueOf(j)});
            }
            s3q0 s3q0Var2 = s3q0.a;
            sQLiteDatabase.setTransactionSuccessful();
            sQLiteDatabase.endTransaction();
        } catch (Throwable th) {
            sQLiteDatabase.endTransaction();
            throw th;
        }
    }
}

package xsna;

import android.content.ContentValues;
import android.database.Cursor;
import com.vk.log.L;
import com.vk.voip.dto.type.StartCallType;
import kotlin.Pair;

/* compiled from: DatabaseKeyStorage.kt */
/* loaded from: classes11.dex */
public final class kwk implements bey {
    public final Object a;
    public final Object b;

    public /* synthetic */ kwk(Object obj, Object obj2) {
        this.a = obj;
        this.b = obj2;
    }

    @Override // xsna.bey
    public void a(String str, byte[] bArr) {
        if (bArr == null) {
            synchronized (this) {
                try {
                    ((cey) this.a).getWritableDatabase().delete("encrypted_aliases", "(encrypted_alias = ?) \nOR \n(encrypted_alias LIKE ?)", new String[]{str, fn00.b(str)});
                } finally {
                    return;
                }
            }
            return;
        }
        synchronized (this) {
            ContentValues contentValues = new ContentValues();
            contentValues.put("encrypted_alias", str);
            contentValues.put("encrypted_alias_value", c4g0.E(bArr));
            try {
                ((cey) this.a).getWritableDatabase().insertWithOnConflict("encrypted_aliases", null, contentValues, 5);
            } catch (Throwable th) {
                L.i(th);
                ((mxi0) this.b).a(pn00.k(new Pair("action", "write_encryption_db"), new Pair("stacktrace", rte0.w(th))));
            }
        }
    }

    public kwk b(StartCallType startCallType) {
        if (startCallType != null) {
            return new kwk(startCallType, startCallType);
        }
        return new kwk(null, (StartCallType) this.b);
    }

    @Override // xsna.bey
    public synchronized byte[] get(String str) {
        Cursor query;
        try {
            query = ((cey) this.a).getReadableDatabase().query("encrypted_aliases", null, "(encrypted_alias = ?) \nOR \n(encrypted_alias LIKE ?)", new String[]{str, fn00.b(str)}, null, null, null, null);
            try {
            } finally {
            }
        } finally {
            return null;
        }
        if (!query.moveToFirst()) {
            query.close();
            return null;
        }
        String string = query.getString(query.getColumnIndexOrThrow("encrypted_alias_value"));
        if (drm0.N(string)) {
            string = null;
        }
        byte[] r = string != null ? c4g0.r(string) : null;
        query.close();
        return r;
    }
}

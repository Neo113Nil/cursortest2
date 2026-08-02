package io.appmetrica.analytics.impl;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.text.TextUtils;
import androidx.credentials.provider.CredentialEntry;
import io.appmetrica.analytics.coreutils.internal.parsing.ParseUtils;
import java.io.Closeable;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import xsna.lhg;

/* loaded from: classes8.dex */
public final class Eb implements Ta, Closeable {
    public final HashMap a = new HashMap();
    public final HashMap b = new HashMap();
    public final String c = "preferences";
    public final Db d;
    public volatile boolean e;
    public final K6 f;

    public Eb(K6 k6) {
        this.f = k6;
        Locale locale = Locale.US;
        Db db = new Db(this, lhg.a(Kd.a(), "IAA-DW-"));
        this.d = db;
        db.start();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:29:0x007c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0021 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r7v10, types: [java.lang.Float] */
    /* JADX WARN: Type inference failed for: r7v4, types: [java.lang.Boolean] */
    /* JADX WARN: Type inference failed for: r7v5, types: [java.lang.Boolean] */
    /* JADX WARN: Type inference failed for: r7v8, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r7v9, types: [java.lang.Long] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void a(Eb eb) {
        SQLiteDatabase sQLiteDatabase;
        String str;
        eb.getClass();
        Cursor cursor = null;
        try {
            sQLiteDatabase = eb.f.a();
            if (sQLiteDatabase != null) {
                try {
                    Cursor query = sQLiteDatabase.query(eb.c, new String[]{"key", "value", "type"}, null, null, null, null, null);
                    while (query.moveToNext()) {
                        try {
                            String string = query.getString(query.getColumnIndexOrThrow("key"));
                            String string2 = query.getString(query.getColumnIndexOrThrow("value"));
                            int i = query.getInt(query.getColumnIndexOrThrow("type"));
                            if (!TextUtils.isEmpty(string)) {
                                if (i != 1) {
                                    if (i == 2) {
                                        str = ParseUtils.parseInt(string2);
                                    } else if (i != 3) {
                                        str = string2;
                                        if (i != 4) {
                                            if (i == 5) {
                                                str = ParseUtils.parseFloat(string2);
                                            }
                                            str = null;
                                        }
                                    } else {
                                        str = ParseUtils.parseLong(string2);
                                    }
                                    if (str == null) {
                                        eb.a.put(string, str);
                                    }
                                } else {
                                    if ("true".equals(string2)) {
                                        str = Boolean.TRUE;
                                    } else {
                                        if (CredentialEntry.FALSE_STRING.equals(string2)) {
                                            str = Boolean.FALSE;
                                        }
                                        str = null;
                                    }
                                    if (str == null) {
                                    }
                                }
                            }
                        } catch (Throwable unused) {
                        }
                    }
                    cursor = query;
                } catch (Throwable unused2) {
                }
            }
        } catch (Throwable unused3) {
            sQLiteDatabase = null;
        }
        vo.a(cursor);
        eb.f.a(sQLiteDatabase);
    }

    @Override // io.appmetrica.analytics.impl.Ta
    public final void b() {
        synchronized (this.d) {
            this.d.notifyAll();
        }
    }

    public final void c() {
        if (this.e) {
            return;
        }
        try {
            this.a.wait();
        } catch (InterruptedException unused) {
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.d.isRunning()) {
            this.d.stopRunning();
        }
    }

    @Override // io.appmetrica.analytics.impl.Ta
    public final boolean getBoolean(String str, boolean z) {
        Object b = b(str);
        return b instanceof Boolean ? ((Boolean) b).booleanValue() : z;
    }

    @Override // io.appmetrica.analytics.impl.Ta
    public final int getInt(String str, int i) {
        Object b = b(str);
        return b instanceof Integer ? ((Integer) b).intValue() : i;
    }

    @Override // io.appmetrica.analytics.impl.Ta
    public final long getLong(String str, long j) {
        Object b = b(str);
        return b instanceof Long ? ((Long) b).longValue() : j;
    }

    @Override // io.appmetrica.analytics.impl.Ta
    public final String getString(String str, String str2) {
        Object b = b(str);
        return b instanceof String ? (String) b : str2;
    }

    @Override // io.appmetrica.analytics.impl.Ta
    public final Ta remove(String str) {
        synchronized (this.a) {
            c();
            this.a.remove(str);
        }
        synchronized (this.d) {
            this.b.put(str, this);
            this.d.notifyAll();
        }
        return this;
    }

    public final Object b(String str) {
        Object obj;
        synchronized (this.a) {
            c();
            obj = this.a.get(str);
        }
        return obj;
    }

    public static void a(Eb eb, HashMap hashMap) {
        SQLiteDatabase sQLiteDatabase;
        eb.getClass();
        int size = hashMap.size();
        ContentValues[] contentValuesArr = new ContentValues[size];
        int i = 0;
        for (Map.Entry entry : hashMap.entrySet()) {
            ContentValues contentValues = new ContentValues();
            String str = (String) entry.getKey();
            Object value = entry.getValue();
            contentValues.put("key", str);
            if (value == eb) {
                contentValues.putNull("value");
            } else if (value instanceof String) {
                contentValues.put("value", (String) value);
                contentValues.put("type", (Integer) 4);
            } else if (value instanceof Long) {
                contentValues.put("value", (Long) value);
                contentValues.put("type", (Integer) 3);
            } else if (value instanceof Integer) {
                contentValues.put("value", (Integer) value);
                contentValues.put("type", (Integer) 2);
            } else if (value instanceof Boolean) {
                contentValues.put("value", String.valueOf(((Boolean) value).booleanValue()));
                contentValues.put("type", (Integer) 1);
            } else if (value instanceof Float) {
                contentValues.put("value", (Float) value);
                contentValues.put("type", (Integer) 5);
            }
            contentValuesArr[i] = contentValues;
            i++;
        }
        SQLiteDatabase sQLiteDatabase2 = null;
        try {
            sQLiteDatabase = eb.f.a();
            if (sQLiteDatabase != null) {
                try {
                    sQLiteDatabase.beginTransaction();
                    for (int i2 = 0; i2 < size; i2++) {
                        ContentValues contentValues2 = contentValuesArr[i2];
                        if (contentValues2.getAsString("value") == null) {
                            sQLiteDatabase.delete(eb.c, "key = ?", new String[]{contentValues2.getAsString("key")});
                        } else {
                            sQLiteDatabase.insertWithOnConflict(eb.c, null, contentValues2, 5);
                        }
                    }
                    sQLiteDatabase.setTransactionSuccessful();
                } catch (Throwable unused) {
                    sQLiteDatabase2 = sQLiteDatabase;
                    if (sQLiteDatabase2 != null) {
                        try {
                            sQLiteDatabase2.endTransaction();
                        } catch (Throwable unused2) {
                        }
                    }
                    sQLiteDatabase = sQLiteDatabase2;
                    eb.f.a(sQLiteDatabase);
                }
            }
            if (sQLiteDatabase != null) {
                try {
                    sQLiteDatabase.endTransaction();
                } catch (Throwable unused3) {
                }
            }
        } catch (Throwable unused4) {
        }
        eb.f.a(sQLiteDatabase);
    }

    @Override // io.appmetrica.analytics.impl.Ta
    public final synchronized Ta a(String str, String str2) {
        a(str, (Object) str2);
        return this;
    }

    @Override // io.appmetrica.analytics.impl.Ta
    public final Ta a(String str, long j) {
        a(str, Long.valueOf(j));
        return this;
    }

    @Override // io.appmetrica.analytics.impl.Ta
    public final synchronized Ta a(int i, String str) {
        a(str, Integer.valueOf(i));
        return this;
    }

    @Override // io.appmetrica.analytics.impl.Ta
    public final Ta a(String str, boolean z) {
        a(str, Boolean.valueOf(z));
        return this;
    }

    @Override // io.appmetrica.analytics.impl.Ta
    public final Ta a(String str, float f) {
        a(str, Float.valueOf(f));
        return this;
    }

    @Override // io.appmetrica.analytics.impl.Ta
    public final boolean a(String str) {
        boolean containsKey;
        synchronized (this.a) {
            c();
            containsKey = this.a.containsKey(str);
        }
        return containsKey;
    }

    @Override // io.appmetrica.analytics.impl.Ta
    public final Set a() {
        HashSet hashSet;
        synchronized (this.a) {
            hashSet = new HashSet(this.a.keySet());
        }
        return hashSet;
    }

    public final void a(String str, Object obj) {
        synchronized (this.a) {
            c();
            this.a.put(str, obj);
        }
        synchronized (this.d) {
            this.b.put(str, obj);
            this.d.notifyAll();
        }
    }
}

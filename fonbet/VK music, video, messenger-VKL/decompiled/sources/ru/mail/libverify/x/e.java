package ru.mail.libverify.x;

import android.database.Cursor;
import android.database.sqlite.SQLiteConstraintException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;
import android.os.Message;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.lang.Thread;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.TreeMap;
import ru.mail.libverify.api.VerificationApi;
import ru.mail.libverify.g0.o;
import ru.mail.libverify.p0.e;
import ru.mail.verify.core.utils.FileLog;
import ru.mail.verify.core.utils.components.MessageBus;

/* loaded from: classes9.dex */
public final class e implements ru.mail.libverify.p0.f, ru.mail.libverify.g0.f {
    private final HashSet<VerificationApi.SmsDialogChangedListener> a = new HashSet<>();

    @NonNull
    private final ru.mail.libverify.c.b b;

    @NonNull
    private final b c;

    @NonNull
    private final MessageBus d;

    @NonNull
    private final o e;
    private TreeMap<Long, c> f;
    private HashMap<String, c> g;

    @Nullable
    private SQLiteStatement h;

    @Nullable
    private SQLiteStatement i;

    @Nullable
    private SQLiteStatement j;

    @Nullable
    private SQLiteStatement k;

    @Nullable
    private SQLiteStatement l;

    @Nullable
    private SQLiteStatement m;

    @Nullable
    private SQLiteStatement n;

    public static /* synthetic */ class a {
        static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[ru.mail.libverify.p0.a.values().length];
            a = iArr;
            try {
                iArr[ru.mail.libverify.p0.a.SMS_STORAGE_QUERY_SMS_DIALOGS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[ru.mail.libverify.p0.a.SMS_STORAGE_QUERY_SMS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[ru.mail.libverify.p0.a.SMS_STORAGE_REMOVE_SMS_DIALOG_ID.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[ru.mail.libverify.p0.a.SMS_STORAGE_REMOVE_SMS_DIALOG_NAME.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[ru.mail.libverify.p0.a.SMS_STORAGE_REMOVE_SMS_ID.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                a[ru.mail.libverify.p0.a.SMS_STORAGE_REMOVE_SMS_NAME.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                a[ru.mail.libverify.p0.a.SMS_STORAGE_INSERT_SMS.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                a[ru.mail.libverify.p0.a.SMS_STORAGE_CLEAR.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                a[ru.mail.libverify.p0.a.VERIFY_API_RESET.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                a[ru.mail.libverify.p0.a.API_RESET.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                a[ru.mail.libverify.p0.a.API_SHUTDOWN.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
        }
    }

    public e(@NonNull ru.mail.libverify.c.b bVar, @NonNull Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
        this.b = bVar;
        this.d = bVar.a();
        this.e = new o("libverify_storage_worker", this, uncaughtExceptionHandler);
        this.c = new b(bVar.e().getContext());
    }

    @Override // ru.mail.libverify.g0.f
    public final void a() {
        this.d.register(Arrays.asList(ru.mail.libverify.p0.a.API_RESET, ru.mail.libverify.p0.a.API_SHUTDOWN, ru.mail.libverify.p0.a.VERIFY_API_RESET), this);
    }

    public final void b(@Nullable String str, @Nullable Long l) {
        if (str == null && l == null) {
            throw new IllegalArgumentException("Either from or dialogId must be not null");
        }
        if (str != null) {
            this.e.a().sendMessage(ru.mail.libverify.p0.e.a(ru.mail.libverify.p0.a.SMS_STORAGE_REMOVE_SMS_DIALOG_NAME, str));
        } else {
            this.e.a().sendMessage(ru.mail.libverify.p0.e.a(ru.mail.libverify.p0.a.SMS_STORAGE_REMOVE_SMS_DIALOG_ID, l));
        }
    }

    public final void h() {
        this.e.a().sendMessage(ru.mail.libverify.p0.e.a(ru.mail.libverify.p0.a.SMS_STORAGE_CLEAR, (Object) null));
    }

    @Override // ru.mail.libverify.p0.f
    public final boolean handleMessage(@NonNull Message message) {
        Throwable th;
        SQLiteDatabase writableDatabase;
        HashMap<String, c> hashMap;
        SQLiteDatabase sQLiteDatabase;
        switch (a.a[ru.mail.libverify.p0.e.a(message, "SmsStorage", e.b.NORMAL).ordinal()]) {
            case 1:
                VerificationApi.SmsDialogsListener smsDialogsListener = (VerificationApi.SmsDialogsListener) ru.mail.libverify.p0.e.a(message);
                try {
                    if (this.f == null) {
                        a((String) null, (Long) null);
                    }
                    ArrayList arrayList = new ArrayList(this.f.size());
                    arrayList.addAll(this.f.values());
                    Collections.sort(arrayList);
                    smsDialogsListener.onCompleted(arrayList);
                    this.d.a(ru.mail.libverify.p0.e.a(ru.mail.libverify.p0.a.SMS_STORAGE_SMS_DIALOGS_REQUESTED, (Object) null));
                } catch (Exception e) {
                    FileLog.e("SmsStorage", "failed to query sms dialogs", e);
                    smsDialogsListener.onError();
                }
                return true;
            case 2:
                String str = (String) ru.mail.libverify.p0.e.c(message, 0);
                Long l = (Long) ru.mail.libverify.p0.e.c(message, 1);
                Long l2 = (Long) ru.mail.libverify.p0.e.c(message, 2);
                Integer num = (Integer) ru.mail.libverify.p0.e.c(message, 3);
                VerificationApi.SmsListener smsListener = (VerificationApi.SmsListener) ru.mail.libverify.p0.e.b(message, 4);
                try {
                    c a2 = a(str, l);
                    if (a2 == null) {
                        smsListener.onError();
                    } else {
                        List<VerificationApi.SmsItem> b = b(a2, l2, num);
                        a(a2);
                        smsListener.onCompleted(b);
                    }
                } catch (Exception e2) {
                    if (str == null) {
                        str = l;
                    }
                    FileLog.e("SmsStorage", e2, "failed to query sms for dialog %s", str);
                    smsListener.onError();
                }
                return true;
            case 3:
                try {
                    c a3 = a((String) null, (Long) ru.mail.libverify.p0.e.a(message));
                    if (a3 != null) {
                        b(a3);
                    }
                } catch (Exception e3) {
                    FileLog.e("SmsStorage", e3, "failed to remove sms dialog %s", null);
                }
                return true;
            case 4:
                String str2 = (String) ru.mail.libverify.p0.e.a(message);
                try {
                    c a4 = a(str2, (Long) null);
                    if (a4 != null) {
                        b(a4);
                    }
                } catch (Exception e4) {
                    FileLog.e("SmsStorage", e4, "failed to remove sms dialog %s", str2);
                }
                return true;
            case 5:
                b((String) null, (Long) ru.mail.libverify.p0.e.b(message, 0), ((Long) ru.mail.libverify.p0.e.b(message, 1)).longValue());
                return true;
            case 6:
                b((String) ru.mail.libverify.p0.e.b(message, 0), (Long) null, ((Long) ru.mail.libverify.p0.e.b(message, 1)).longValue());
                return true;
            case 7:
                String[] strArr = (String[]) ru.mail.libverify.p0.e.a(message, 0);
                String[] strArr2 = (String[]) ru.mail.libverify.p0.e.a(message, 1);
                Long[] lArr = (Long[]) ru.mail.libverify.p0.e.a(message, 2);
                Long[] lArr2 = (Long[]) ru.mail.libverify.p0.e.a(message, 3);
                try {
                    if (strArr.length == 1) {
                        try {
                            FileLog.v("SmsStorage", "insert sms from %s text %s timestamp %d (%d)", strArr[0], strArr2[0], lArr[0], lArr2[0]);
                        } catch (Throwable th2) {
                            th = th2;
                            FileLog.e("SmsStorage", "Failed to insert sms", th);
                            return true;
                        }
                    } else {
                        FileLog.v("SmsStorage", "insert sms %d sms", Integer.valueOf(strArr.length));
                    }
                    writableDatabase = this.c.getWritableDatabase();
                    hashMap = new HashMap<>();
                    writableDatabase.beginTransaction();
                } catch (Throwable th3) {
                    th = th3;
                }
                try {
                    try {
                        a(writableDatabase, hashMap, strArr, lArr, strArr2, lArr2);
                        sQLiteDatabase = writableDatabase;
                    } catch (Throwable th4) {
                        th = th4;
                        th = th;
                        FileLog.e("SmsStorage", "Failed to insert sms", th);
                        return true;
                    }
                    try {
                        if (!hashMap.isEmpty()) {
                            for (c cVar : hashMap.values()) {
                                VerificationApi.SmsItem a5 = cVar.a(false);
                                if (a5 != null) {
                                    a(sQLiteDatabase, cVar, a5, true);
                                }
                            }
                        }
                        sQLiteDatabase.setTransactionSuccessful();
                        a(hashMap);
                        Iterator<c> it = hashMap.values().iterator();
                        while (it.hasNext()) {
                            this.d.a(ru.mail.libverify.p0.e.a(ru.mail.libverify.p0.a.SMS_STORAGE_ADDED, it.next().getFrom()));
                        }
                        if (strArr.length == 1) {
                            FileLog.v("SmsStorage", "sms from %s text %s has been inserted", strArr[0], strArr2[0]);
                        } else {
                            FileLog.v("SmsStorage", "sms inserted count %d", Integer.valueOf(strArr.length));
                        }
                        sQLiteDatabase.endTransaction();
                        return true;
                    } catch (Throwable th5) {
                        th = th5;
                        sQLiteDatabase.endTransaction();
                        throw th;
                    }
                } catch (Throwable th6) {
                    th = th6;
                    sQLiteDatabase = writableDatabase;
                }
            case 8:
                HashMap<String, c> hashMap2 = this.g;
                if (hashMap2 != null) {
                    hashMap2.clear();
                }
                TreeMap<Long, c> treeMap = this.f;
                if (treeMap != null) {
                    treeMap.clear();
                }
                this.h = null;
                this.i = null;
                this.j = null;
                this.k = null;
                this.l = null;
                this.m = null;
                this.n = null;
                this.c.close();
                if (!this.b.e().getContext().deleteDatabase("verifications.db")) {
                    FileLog.e("SmsStorage", "failed to delete database");
                }
                a((VerificationApi.SmsDialogItem) null);
                this.d.a(ru.mail.libverify.p0.e.a(ru.mail.libverify.p0.a.SMS_STORAGE_CLEARED, (Object) null));
                FileLog.d("SmsStorage", "database has been dropped successfully");
                return true;
            case 9:
            case 10:
                h();
                return true;
            case 11:
                this.e.b();
                return true;
            default:
                throw new IllegalArgumentException("StorageMsgType is not implemented");
        }
    }

    public final void a(@NonNull VerificationApi.SmsDialogsListener smsDialogsListener) {
        this.e.a().sendMessage(ru.mail.libverify.p0.e.a(ru.mail.libverify.p0.a.SMS_STORAGE_QUERY_SMS_DIALOGS, smsDialogsListener));
    }

    public final void a(@Nullable String str, @Nullable Long l, @Nullable Long l2, @Nullable Integer num, @NonNull VerificationApi.SmsListener smsListener) {
        if (str == null && l == null) {
            throw new IllegalArgumentException("Either from or dialogId must be not null");
        }
        this.e.a().sendMessage(ru.mail.libverify.p0.e.a(ru.mail.libverify.p0.a.SMS_STORAGE_QUERY_SMS, str, l, l2, num, smsListener));
    }

    public final synchronized void b(@NonNull VerificationApi.SmsDialogChangedListener smsDialogChangedListener) {
        this.a.remove(smsDialogChangedListener);
    }

    private void b(@Nullable String str, @Nullable Long l, long j) {
        c a2;
        try {
            if (l == null) {
                a2 = a(str, (Long) null);
            } else {
                a2 = a((String) null, l);
            }
            if (a2 == null) {
                return;
            }
            a(a2, j);
        } catch (Exception e) {
            FileLog.e("SmsStorage", e, "failed to remove sms from dialog %d %d", l, Long.valueOf(j));
        }
    }

    public final void a(@Nullable String str, @Nullable Long l, long j) {
        if (str == null && l == null) {
            throw new IllegalArgumentException("Either from or dialogId must be not null");
        }
        if (str != null) {
            this.e.a().sendMessage(ru.mail.libverify.p0.e.a(ru.mail.libverify.p0.a.SMS_STORAGE_REMOVE_SMS_NAME, str, Long.valueOf(j)));
        } else {
            this.e.a().sendMessage(ru.mail.libverify.p0.e.a(ru.mail.libverify.p0.a.SMS_STORAGE_REMOVE_SMS_ID, l, Long.valueOf(j)));
        }
    }

    private void b(@NonNull VerificationApi.SmsDialogItem smsDialogItem) {
        SQLiteDatabase writableDatabase = this.c.getWritableDatabase();
        try {
            writableDatabase.beginTransaction();
            if (this.l == null) {
                this.l = writableDatabase.compileStatement("DELETE FROM dialog WHERE _id = ?");
            }
            SQLiteStatement sQLiteStatement = this.l;
            c cVar = (c) smsDialogItem;
            sQLiteStatement.bindLong(1, cVar.getId());
            if (sQLiteStatement.executeUpdateDelete() == 1) {
                if (this.m == null) {
                    this.m = writableDatabase.compileStatement("DELETE FROM sms WHERE dialog_id = ?");
                }
                SQLiteStatement sQLiteStatement2 = this.m;
                sQLiteStatement2.bindLong(1, cVar.getId());
                if (sQLiteStatement2.executeUpdateDelete() >= 1) {
                    writableDatabase.setTransactionSuccessful();
                    this.f.remove(Long.valueOf(cVar.getId()));
                    this.g.remove(cVar.getFrom());
                    a(smsDialogItem);
                    this.d.a(ru.mail.libverify.p0.e.a(ru.mail.libverify.p0.a.SMS_STORAGE_SMS_DIALOG_REMOVED, cVar.getFrom()));
                    FileLog.v("SmsStorage", "dialog %s has been removed", cVar.getFrom());
                    writableDatabase.endTransaction();
                    return;
                }
                FileLog.e("SmsStorage", "Failed to remove sms for dialog " + cVar.getFrom());
                throw new SQLiteConstraintException("Failed to remove sms for dialog");
            }
            FileLog.e("SmsStorage", "Failed to remove sms dialog " + cVar.getFrom());
            throw new SQLiteConstraintException("Failed to remove sms dialog");
        } catch (Throwable th) {
            writableDatabase.endTransaction();
            throw th;
        }
    }

    public final void a(@NonNull String str, @NonNull String str2, long j, long j2) {
        this.e.a().sendMessage(ru.mail.libverify.p0.e.a(ru.mail.libverify.p0.a.SMS_STORAGE_INSERT_SMS, new String[]{str}, new String[]{str2}, new Long[]{Long.valueOf(j)}, new Long[]{Long.valueOf(j2)}));
    }

    public final synchronized void a(@NonNull VerificationApi.SmsDialogChangedListener smsDialogChangedListener) {
        this.a.add(smsDialogChangedListener);
    }

    private void a(@NonNull c cVar, long j) {
        SQLiteDatabase writableDatabase = this.c.getWritableDatabase();
        try {
            writableDatabase.beginTransaction();
            if (this.n == null) {
                this.n = writableDatabase.compileStatement("DELETE FROM sms WHERE _id = ?");
            }
            SQLiteStatement sQLiteStatement = this.n;
            sQLiteStatement.bindLong(1, j);
            if (sQLiteStatement.executeUpdateDelete() == 1) {
                FileLog.v("SmsStorage", "sms %d removed from dialog %s", Long.valueOf(j), cVar.getFrom());
                cVar.b(j);
                VerificationApi.SmsItem a2 = cVar.a(true);
                if (a2 != null) {
                    a(writableDatabase, cVar, a2, false);
                } else {
                    a(cVar.getId(), (Long) null, (Integer) 50);
                    VerificationApi.SmsItem a3 = cVar.a(true);
                    if (a3 != null) {
                        a(writableDatabase, cVar, a3, false);
                    }
                }
                writableDatabase.setTransactionSuccessful();
                a((VerificationApi.SmsDialogItem) cVar);
                this.d.a(ru.mail.libverify.p0.e.a(ru.mail.libverify.p0.a.SMS_STORAGE_SMS_REMOVED, cVar.getFrom()));
                FileLog.v("SmsStorage", "dialog %s updated after sms removal", cVar.getFrom());
                writableDatabase.endTransaction();
                return;
            }
            FileLog.e("SmsStorage", "Failed to remove sms " + j);
            throw new SQLiteConstraintException("Failed to remove sms");
        } catch (Throwable th) {
            writableDatabase.endTransaction();
            throw th;
        }
    }

    private List<VerificationApi.SmsItem> b(@NonNull c cVar, @Nullable Long l, @Nullable Integer num) {
        if (num == null) {
            a(cVar, (Long) null, (Integer) null);
            return cVar.a();
        }
        if (l == null) {
            ArrayList a2 = cVar.a(num.intValue());
            if (a2.size() != 0) {
                return a2;
            }
            a(cVar, (Long) null, num);
            return cVar.a(num.intValue());
        }
        d dVar = (d) cVar.a(l.longValue());
        if (dVar == null) {
            a(cVar, l, num);
            return cVar.a(l.longValue(), num.intValue());
        }
        List<VerificationApi.SmsItem> a3 = cVar.a(dVar, num.intValue());
        if (a3.size() != 0) {
            return a3;
        }
        a(cVar, Long.valueOf(dVar.getId()), num);
        return cVar.a(dVar.getId(), num.intValue());
    }

    private void a(@NonNull HashMap<String, c> hashMap) {
        if (hashMap.isEmpty()) {
            return;
        }
        synchronized (this) {
            try {
                for (c cVar : hashMap.values()) {
                    Iterator<VerificationApi.SmsDialogChangedListener> it = this.a.iterator();
                    while (it.hasNext()) {
                        it.next().onChanged(cVar);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private void a(@Nullable VerificationApi.SmsDialogItem smsDialogItem) {
        synchronized (this) {
            try {
                Iterator<VerificationApi.SmsDialogChangedListener> it = this.a.iterator();
                while (it.hasNext()) {
                    it.next().onChanged(smsDialogItem);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private void a(@NonNull SQLiteDatabase sQLiteDatabase, @NonNull HashMap<String, c> hashMap, @NonNull String[] strArr, @NonNull Long[] lArr, @NonNull String[] strArr2, @NonNull Long[] lArr2) {
        for (int i = 0; i < strArr.length; i++) {
            c a2 = a(strArr[i], (Long) null);
            if (a2 != null) {
                if (this.i == null) {
                    this.i = sQLiteDatabase.compileStatement("INSERT INTO sms (timestamp, server_timestamp, dialog_id, text) VALUES (?, ?, ?, ?)");
                }
                SQLiteStatement sQLiteStatement = this.i;
                sQLiteStatement.bindLong(1, lArr[i].longValue());
                sQLiteStatement.bindString(4, strArr2[i]);
                sQLiteStatement.bindLong(2, lArr2[i].longValue());
                sQLiteStatement.bindLong(3, a2.getId());
                a2.a(new d(strArr[i], strArr2[i], sQLiteStatement.executeInsert(), lArr[i].longValue(), lArr2[i].longValue()));
                hashMap.put(strArr[i], a2);
            } else {
                FileLog.e("SmsStorage", "Failed to get dialog with name " + strArr[i]);
                throw new IllegalStateException("Failed to get dialog with name");
            }
        }
        FileLog.v("SmsStorage", "%d sms inserted into %d dialogs", Integer.valueOf(strArr.length), Integer.valueOf(hashMap.size()));
    }

    private void a(@NonNull c cVar) {
        if (cVar.hasUnread()) {
            SQLiteDatabase writableDatabase = this.c.getWritableDatabase();
            try {
                writableDatabase.beginTransaction();
                if (this.k == null) {
                    this.k = writableDatabase.compileStatement("UPDATE dialog SET has_unread = 0 WHERE _id = ?");
                }
                SQLiteStatement sQLiteStatement = this.k;
                sQLiteStatement.bindLong(1, cVar.getId());
                if (sQLiteStatement.executeUpdateDelete() == 1) {
                    cVar.b(false);
                    writableDatabase.setTransactionSuccessful();
                    FileLog.v("SmsStorage", "dialog %s marked as read", cVar.getFrom());
                    a((VerificationApi.SmsDialogItem) cVar);
                    this.d.a(ru.mail.libverify.p0.e.a(ru.mail.libverify.p0.a.SMS_STORAGE_SMS_DIALOG_REQUESTED, cVar.getFrom()));
                    writableDatabase.endTransaction();
                    return;
                }
                FileLog.e("SmsStorage", "Failed to update sms dialog " + cVar.getFrom());
                throw new SQLiteConstraintException("Failed to update sms dialog");
            } catch (Throwable th) {
                writableDatabase.endTransaction();
                throw th;
            }
        }
    }

    private void a(@NonNull c cVar, @Nullable Long l, @Nullable Integer num) {
        if (cVar.b()) {
            FileLog.v("SmsStorage", "load items is not necessary for dialog %s", cVar.getFrom());
        } else if (a(cVar.getId(), l, num) == 0) {
            FileLog.v("SmsStorage", "all items for dialog %s has been already loaded", cVar.getFrom());
            cVar.c();
        }
    }

    private int a(long j, @Nullable Long l, @Nullable Integer num) {
        FileLog.v("SmsStorage", "load sms items offset %s, count %s", l, num);
        SQLiteDatabase readableDatabase = this.c.getReadableDatabase();
        int i = b.a;
        Cursor rawQuery = readableDatabase.rawQuery("SELECT * FROM sms WHERE _id < ? AND dialog_id = ? ORDER BY server_timestamp DESC LIMIT ?", new String[]{Long.toString(l == null ? Long.MAX_VALUE : l.longValue()), Long.toString(j), Integer.toString(num == null ? -1 : num.intValue())});
        try {
            if (rawQuery.moveToFirst()) {
                do {
                    long j2 = rawQuery.getLong(0);
                    long j3 = rawQuery.getLong(3);
                    long j4 = rawQuery.getLong(1);
                    long j5 = rawQuery.getLong(2);
                    String string = rawQuery.getString(4);
                    c a2 = a((String) null, Long.valueOf(j3));
                    if (a2 != null) {
                        d dVar = new d(a2.getFrom(), string, j2, j4, j5);
                        dVar.d();
                        a2.a(dVar);
                    } else {
                        Locale locale = Locale.US;
                        FileLog.e("SmsStorage", "Found a reference to not existing dialog id " + j3);
                        throw new IllegalStateException("Found a reference to not existing dialog id");
                    }
                } while (rawQuery.moveToNext());
            }
            rawQuery.close();
            return rawQuery.getCount();
        } finally {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x008b, code lost:
    
        if (r18.longValue() == r10) goto L23;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private c a(@Nullable String str, @Nullable Long l) {
        TreeMap<Long, c> treeMap = this.f;
        int i = 1;
        c cVar = null;
        if (treeMap == null) {
            FileLog.v("SmsStorage", "read dialogs from db");
            this.f = new TreeMap<>();
            this.g = new HashMap<>();
            SQLiteDatabase readableDatabase = this.c.getReadableDatabase();
            int i2 = b.a;
            Cursor rawQuery = readableDatabase.rawQuery("SELECT * FROM dialog", null);
            try {
                if (rawQuery.moveToFirst()) {
                    while (true) {
                        long j = rawQuery.getLong(0);
                        String string = rawQuery.getString(i);
                        long j2 = rawQuery.getLong(2);
                        String string2 = rawQuery.getString(3);
                        boolean z = rawQuery.getInt(4) == i ? i : 0;
                        c cVar2 = new c(string, j);
                        cVar2.a(string2);
                        cVar2.c(j2);
                        cVar2.b(z);
                        this.f.put(Long.valueOf(j), cVar2);
                        if (this.g.put(string, cVar2) == null) {
                            if (cVar == null) {
                                if (str != null) {
                                    if (!TextUtils.equals(str, string)) {
                                    }
                                    cVar = cVar2;
                                }
                                if (l != null) {
                                }
                            }
                            if (!rawQuery.moveToNext()) {
                                break;
                            }
                            i = 1;
                        } else {
                            FileLog.e("SmsStorage", "Dialog %s has been already added", string);
                            throw new IllegalStateException("Dialog has been already added");
                        }
                    }
                }
                FileLog.d("SmsStorage", "found dialogs count %d", Integer.valueOf(this.f.size()));
                rawQuery.close();
            } finally {
            }
        } else if (str != null) {
            cVar = this.g.get(str);
        } else if (l != null) {
            cVar = treeMap.get(l);
        }
        if (cVar != null || str == null) {
            return cVar;
        }
        SQLiteDatabase writableDatabase = this.c.getWritableDatabase();
        writableDatabase.beginTransaction();
        try {
            if (this.h == null) {
                this.h = writableDatabase.compileStatement("INSERT INTO dialog (name) VALUES (?)");
            }
            SQLiteStatement sQLiteStatement = this.h;
            sQLiteStatement.bindString(1, str);
            long executeInsert = sQLiteStatement.executeInsert();
            c cVar3 = new c(str, executeInsert);
            this.f.put(Long.valueOf(executeInsert), cVar3);
            if (this.g.put(str, cVar3) == null) {
                FileLog.d("SmsStorage", "added dialog from %s %s", str, cVar3);
                writableDatabase.setTransactionSuccessful();
                writableDatabase.endTransaction();
                return cVar3;
            }
            FileLog.e("SmsStorage", "Dialog %s has been already added", str);
            throw new IllegalStateException("Dialog has been already added");
        } finally {
            writableDatabase.endTransaction();
        }
    }

    private void a(@NonNull SQLiteDatabase sQLiteDatabase, @NonNull c cVar, @NonNull VerificationApi.SmsItem smsItem, boolean z) {
        if (this.j == null) {
            this.j = sQLiteDatabase.compileStatement("UPDATE dialog SET last_timestamp = ?, last_text = ?, has_unread = ? WHERE _id = ?");
        }
        SQLiteStatement sQLiteStatement = this.j;
        d dVar = (d) smsItem;
        sQLiteStatement.bindLong(1, dVar.getTimestamp());
        sQLiteStatement.bindString(2, dVar.getText());
        sQLiteStatement.bindLong(3, z ? 1L : 0L);
        sQLiteStatement.bindLong(4, cVar.getId());
        if (sQLiteStatement.executeUpdateDelete() == 1) {
            cVar.a(dVar.getText());
            cVar.c(dVar.getTimestamp());
            if (z) {
                cVar.b(true);
                FileLog.v("SmsStorage", "dialog %s marked as unread", cVar.getFrom());
            }
            FileLog.v("SmsStorage", "dialog %s updated with last sms %s", cVar.getFrom(), dVar.getText());
            return;
        }
        FileLog.e("SmsStorage", "Failed to update sms dialog " + cVar.getFrom());
        throw new SQLiteConstraintException("Failed to update sms dialog");
    }
}

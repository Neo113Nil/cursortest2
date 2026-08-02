package io.appmetrica.analytics.impl;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.DatabaseUtils;
import android.database.sqlite.SQLiteDatabase;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.appmetrica.analytics.coreutils.internal.ApiKeyUtils;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.appmetrica.analytics.coreutils.internal.WrapUtils;
import io.appmetrica.analytics.coreutils.internal.db.DBUtils;
import io.appmetrica.analytics.coreutils.internal.io.GZIPCompressor;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;
import io.appmetrica.analytics.networktasks.internal.DefaultNetworkResponseHandler;
import io.appmetrica.analytics.networktasks.internal.FullUrlFormer;
import io.appmetrica.analytics.networktasks.internal.RequestBodyEncrypter;
import io.appmetrica.analytics.networktasks.internal.RequestDataHolder;
import io.appmetrica.analytics.networktasks.internal.ResponseDataHolder;
import io.appmetrica.analytics.networktasks.internal.RetryPolicyConfig;
import io.appmetrica.analytics.networktasks.internal.SendingDataTaskHelper;
import io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.net.ssl.SSLSocketFactory;
import org.json.JSONObject;

/* loaded from: classes8.dex */
public final class Eh implements UnderlyingNetworkTask {
    public final C4927j5 a;
    public final LinkedHashMap b;
    public C5289x7 c;
    public C5241v9 d;
    public final X6 e;
    public List f;
    public int g;
    public int h;
    public int i;
    public Dh j;
    public final C4977l3 k;
    public final PublicLogger l;
    public final Ho m;
    public final InterfaceC4779db n;
    public final C4939jh o;
    public final FullUrlFormer p;
    public final Kb q;
    public final RequestDataHolder r;
    public final ResponseDataHolder s;
    public final SendingDataTaskHelper t;
    public int u;
    public boolean v;

    public Eh(@NonNull C4927j5 c4927j5, @NonNull C4939jh c4939jh, @NonNull Kb kb, @NonNull FullUrlFormer<C5224uh> fullUrlFormer, @NonNull RequestDataHolder requestDataHolder, @NonNull ResponseDataHolder responseDataHolder, @NonNull RequestBodyEncrypter requestBodyEncrypter) {
        this(c4927j5, c4939jh, kb, fullUrlFormer, requestDataHolder, responseDataHolder, c4927j5.i(), c4927j5.p(), c4927j5.u(), requestBodyEncrypter);
    }

    public final C5241v9 a(Dh dh, List list, C5224uh c5224uh) {
        C5241v9 c5241v9 = new C5241v9();
        C5035n9 c5035n9 = new C5035n9();
        c5035n9.a = WrapUtils.getOrDefaultIfEmpty(this.c.b, c5224uh.getUuid());
        c5035n9.b = WrapUtils.getOrDefaultIfEmpty(this.c.a, c5224uh.getDeviceId());
        this.g = CodedOutputByteBufferNano.computeMessageSize(4, c5035n9) + this.g;
        c5241v9.b = c5035n9;
        C5330yn C = C5342za.I.C();
        Bh bh = new Bh(this, c5241v9);
        synchronized (C) {
            C.a.a(bh);
        }
        c5241v9.a = (C5164s9[]) dh.a.toArray(new C5164s9[0]);
        c5241v9.c = a(dh.c);
        c5241v9.e = (String[]) list.toArray(new String[0]);
        Set set = c5224uh.x;
        String[] strArr = (String[]) set.toArray(new String[0]);
        c5241v9.f = new byte[strArr.length][];
        for (int i = 0; i < set.size(); i++) {
            c5241v9.f[i] = StringUtils.getUTF8Bytes(strArr[i]);
        }
        return c5241v9;
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    @NonNull
    public final String description() {
        return "ReportTask_" + ApiKeyUtils.createPartialApiKey(this.a.b.b);
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    @NonNull
    public final FullUrlFormer<?> getFullUrlFormer() {
        return this.p;
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    @NonNull
    public final RequestDataHolder getRequestDataHolder() {
        return this.r;
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    @NonNull
    public final ResponseDataHolder getResponseDataHolder() {
        return this.s;
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    @Nullable
    public final RetryPolicyConfig getRetryPolicyConfig() {
        return ((C5224uh) this.a.k.a()).getRetryPolicyConfig();
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    @Nullable
    public final SSLSocketFactory getSslSocketFactory() {
        ((Kl) C5342za.I.z()).getClass();
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0051 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0052  */
    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onCreateTask() {
        Cursor cursor;
        int optInt;
        X6 x6 = this.a.e;
        x6.getClass();
        ArrayList arrayList = new ArrayList();
        x6.a.lock();
        try {
            SQLiteDatabase readableDatabase = x6.c.getReadableDatabase();
            if (readableDatabase != null) {
                cursor = readableDatabase.rawQuery(G5.b, null);
                while (cursor.moveToNext()) {
                    try {
                        ContentValues contentValues = new ContentValues();
                        DatabaseUtils.cursorRowToContentValues(cursor, contentValues);
                        arrayList.add(contentValues);
                    } catch (Throwable unused) {
                        try {
                            arrayList = new ArrayList();
                            if (!arrayList.isEmpty()) {
                            }
                        } finally {
                            vo.a(cursor);
                            x6.a.unlock();
                        }
                    }
                }
            } else {
                cursor = null;
            }
        } catch (Throwable unused2) {
            cursor = null;
        }
        if (!arrayList.isEmpty()) {
            return false;
        }
        ContentValues contentValues2 = (ContentValues) arrayList.get(0);
        this.b.clear();
        for (Map.Entry<String, Object> entry : contentValues2.valueSet()) {
            this.b.put(entry.getKey(), entry.getValue().toString());
        }
        String asString = contentValues2.getAsString("report_request_parameters");
        if (TextUtils.isEmpty(asString)) {
            C5289x7 c5289x7 = new C5289x7();
            this.c = c5289x7;
            this.o.c = c5289x7;
        } else {
            try {
                C5289x7 c5289x72 = new C5289x7(new C5140rb(asString));
                this.c = c5289x72;
                this.o.c = c5289x72;
            } catch (Throwable unused3) {
                C5289x7 c5289x73 = new C5289x7();
                this.c = c5289x73;
                this.o.c = c5289x73;
            }
        }
        C5224uh config = this.q.getConfig();
        List list = config.w;
        if (vo.a((Collection) list)) {
            return false;
        }
        this.p.setHosts(config.q);
        if (!config.u() || vo.a((Collection) this.p.getAllHosts())) {
            this.v = true;
            return false;
        }
        this.f = null;
        Dh a = a(config);
        this.j = a;
        if (a.a.isEmpty()) {
            return false;
        }
        Ho ho = this.m;
        synchronized (ho) {
            optInt = ho.a.a().optInt("report_request_id", -1);
        }
        int i = optInt + 1;
        this.u = i;
        this.o.e = i;
        C5241v9 a2 = a(this.j, list, config);
        this.d = a2;
        this.f = this.j.b;
        this.t.prepareAndSetPostData(MessageNano.toByteArray(a2));
        return true;
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    public final void onPerformRequest() {
        this.t.onPerformRequest();
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    public final void onPostRequestComplete(boolean z) {
        String a;
        if (z) {
            a(false);
        } else if (this.s.getResponseCode() == 400) {
            a(true);
        }
        if (z) {
            for (int i = 0; i < this.j.a.size(); i++) {
                for (C5113q9 c5113q9 : ((C5164s9) this.j.a.get(i)).c) {
                    if (c5113q9 != null && (a = AbstractC4706ag.a(c5113q9)) != null) {
                        this.l.info(a, new Object[0]);
                    }
                }
            }
        }
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    public final boolean onRequestComplete() {
        return this.t.isResponseValid();
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    public final void onShouldNotExecute() {
        this.v = true;
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    public final void onSuccessfulTaskFinished() {
        this.v = true;
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    public final void onTaskAdded() {
        ((C5262w5) this.a.p).d.set(false);
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    public final void onTaskRemoved() {
        ((C5262w5) this.a.p).d.set(true);
        if (this.v) {
            ((C5262w5) this.a.p).f();
        }
    }

    public Eh(C4927j5 c4927j5, C4939jh c4939jh, Kb kb, FullUrlFormer fullUrlFormer, RequestDataHolder requestDataHolder, ResponseDataHolder responseDataHolder, X6 x6, PublicLogger publicLogger, Ho ho, RequestBodyEncrypter requestBodyEncrypter) {
        this(c4927j5, publicLogger, x6, c4939jh, ho, kb, new C4977l3(1024000, "event value in ReportTask", publicLogger), AbstractC5308y1.a(), fullUrlFormer, requestDataHolder, responseDataHolder, requestBodyEncrypter);
    }

    public Eh(C4927j5 c4927j5, PublicLogger publicLogger, X6 x6, C4939jh c4939jh, Ho ho, Kb kb, C4977l3 c4977l3, C4710ak c4710ak, FullUrlFormer fullUrlFormer, RequestDataHolder requestDataHolder, ResponseDataHolder responseDataHolder, RequestBodyEncrypter requestBodyEncrypter) {
        this.b = new LinkedHashMap();
        this.g = 0;
        this.h = 0;
        this.i = -1;
        this.v = false;
        this.t = new SendingDataTaskHelper(requestBodyEncrypter, new GZIPCompressor(), requestDataHolder, responseDataHolder, new DefaultNetworkResponseHandler());
        this.o = c4939jh;
        this.a = c4927j5;
        this.e = x6;
        this.l = publicLogger;
        this.k = c4977l3;
        this.m = ho;
        this.q = kb;
        this.n = c4710ak;
        this.r = requestDataHolder;
        this.s = responseDataHolder;
        this.p = fullUrlFormer;
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    public final void onTaskFinished() {
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    public final void onUnsuccessfulTaskFinished() {
    }

    public static C4957k9[] a(JSONObject jSONObject) {
        int length = jSONObject.length();
        if (length <= 0) {
            return null;
        }
        C4957k9[] c4957k9Arr = new C4957k9[length];
        Iterator<String> keys = jSONObject.keys();
        int i = 0;
        while (keys.hasNext()) {
            String next = keys.next();
            try {
                C4957k9 c4957k9 = new C4957k9();
                c4957k9.a = next;
                c4957k9.b = jSONObject.getString(next);
                c4957k9Arr[i] = c4957k9;
            } catch (Throwable unused) {
            }
            i++;
        }
        return c4957k9Arr;
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    public final void onRequestError(@Nullable Throwable th) {
    }

    public final void a(boolean z) {
        boolean z2;
        Ho ho = this.m;
        int i = this.u;
        synchronized (ho) {
            Io io2 = ho.a;
            io2.a(io2.a().put("report_request_id", i));
        }
        C5164s9[] c5164s9Arr = this.d.a;
        int i2 = 0;
        while (i2 < c5164s9Arr.length) {
            try {
                C5164s9 c5164s9 = c5164s9Arr[i2];
                long longValue = ((Long) this.f.get(i2)).longValue();
                EnumC4840fl enumC4840fl = (EnumC4840fl) Zf.b.get(c5164s9.b.c);
                if (enumC4840fl == null) {
                    enumC4840fl = EnumC4840fl.FOREGROUND;
                }
                z2 = z;
                try {
                    this.e.a(longValue, enumC4840fl.a, c5164s9.c.length, z2);
                    Zf.a(c5164s9);
                } catch (Throwable unused) {
                }
            } catch (Throwable unused2) {
                z2 = z;
            }
            i2++;
            z = z2;
        }
        X6 x6 = this.e;
        long a = this.a.j.a();
        x6.b.lock();
        try {
            if (I5.a.booleanValue()) {
                x6.c();
            }
            SQLiteDatabase writableDatabase = x6.c.getWritableDatabase();
            if (writableDatabase != null) {
                writableDatabase.delete("sessions", G5.c, new String[]{String.valueOf(a)});
            }
        } catch (Throwable unused3) {
        }
        x6.b.unlock();
    }

    /* JADX WARN: Removed duplicated region for block: B:62:0x00e6 A[LOOP:1: B:60:0x00e0->B:62:0x00e6, LOOP_END] */
    @NonNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Dh a(@NonNull C5224uh c5224uh) {
        Iterator it;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        JSONObject jSONObject = new JSONObject();
        ArrayList arrayList3 = new ArrayList();
        Cursor cursor = null;
        try {
            Cursor a = a();
            if (a != null) {
                JSONObject jSONObject2 = jSONObject;
                C4897i0 c4897i0 = null;
                while (a.moveToNext() && this.h < 100) {
                    try {
                        ContentValues contentValues = new ContentValues();
                        DBUtils.cursorRowToContentValues(a, contentValues);
                        E7 model = new F7(null, 1, null).toModel(contentValues);
                        Long l = model.a;
                        if (l != null) {
                            D7 d7 = model.d;
                            C5216u9 a2 = Zf.a(d7.a, d7.b, d7.c);
                            String locale = c5224uh.getLocale();
                            EnumC4840fl enumC4840fl = model.b;
                            C5138r9 c5138r9 = new C5138r9();
                            c5138r9.a = a2;
                            c5138r9.b = locale;
                            if (enumC4840fl != null) {
                                Integer num = (Integer) Zf.a.get(enumC4840fl);
                                c5138r9.c = num != null ? num.intValue() : 0;
                            }
                            int computeUInt64Size = this.g + CodedOutputByteBufferNano.computeUInt64Size(1, Long.MAX_VALUE);
                            this.g = computeUInt64Size;
                            int computeMessageSize = computeUInt64Size + CodedOutputByteBufferNano.computeMessageSize(2, c5138r9);
                            this.g = computeMessageSize;
                            if (computeMessageSize >= 250880) {
                                break;
                            }
                            Ch a3 = a(l.longValue(), c5138r9, c5224uh, arrayList3, arrayList.size());
                            if (a3 == null) {
                                continue;
                            } else {
                                if (c4897i0 == null) {
                                    c4897i0 = a3.b;
                                } else if (!c4897i0.equals(a3.b)) {
                                    break;
                                }
                                arrayList2.add(l);
                                arrayList.add(a3.a);
                                if (!TextUtils.isEmpty(a3.b.a)) {
                                    try {
                                        jSONObject2 = new JSONObject(a3.b.a);
                                    } catch (Throwable unused) {
                                    }
                                }
                                if (a3.c) {
                                    break;
                                }
                            }
                        }
                    } catch (Throwable th) {
                        th = th;
                        cursor = a;
                        jSONObject = jSONObject2;
                        try {
                            arrayList3.add(th);
                            it = arrayList3.iterator();
                            while (it.hasNext()) {
                            }
                            return new Dh(arrayList, arrayList2, jSONObject);
                        } finally {
                            vo.a(cursor);
                        }
                    }
                }
                jSONObject = jSONObject2;
            }
            vo.a(a);
        } catch (Throwable th2) {
            th = th2;
        }
        it = arrayList3.iterator();
        while (it.hasNext()) {
            this.n.reportError("protobuf_serialization_error", (Throwable) it.next());
        }
        return new Dh(arrayList, arrayList2, jSONObject);
    }

    public static C4897i0 a(ContentValues contentValues) {
        C5111q7 model = new C5136r7(null, 1, null).toModel(contentValues);
        return new C4897i0((String) WrapUtils.getOrDefault(model.g.g, ""), ((Long) WrapUtils.getOrDefault(model.g.h, 0L)).longValue());
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x006c A[Catch: all -> 0x009c, TryCatch #4 {all -> 0x009c, blocks: (B:12:0x0025, B:13:0x002b, B:15:0x0032, B:17:0x0038, B:29:0x006c, B:31:0x0072, B:71:0x0094, B:34:0x00a9, B:36:0x00b8, B:41:0x00c4, B:42:0x00c3, B:43:0x00be, B:44:0x00ca, B:47:0x00dc, B:58:0x00e3, B:75:0x00a1, B:57:0x00eb, B:82:0x0065, B:51:0x00f5, B:53:0x00fb), top: B:11:0x0025 }] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00eb A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Ch a(long j, C5138r9 c5138r9, C5224uh c5224uh, ArrayList arrayList, int i) {
        Cursor cursor;
        boolean z;
        Ch ch;
        C5113q9 c5113q9;
        int i2;
        C4957k9[] a;
        Z8 z8;
        C4854g9 c4854g9;
        C5164s9 c5164s9 = new C5164s9();
        c5164s9.a = j;
        c5164s9.b = c5138r9;
        EnumC4840fl enumC4840fl = (EnumC4840fl) Zf.b.get(c5138r9.c);
        if (enumC4840fl == null) {
            enumC4840fl = EnumC4840fl.FOREGROUND;
        }
        try {
            cursor = a(j, enumC4840fl);
            if (cursor != null) {
                try {
                    ArrayList arrayList2 = new ArrayList();
                    C4897i0 c4897i0 = null;
                    while (true) {
                        z = false;
                        if (!cursor.moveToNext() || this.h >= 100) {
                            break;
                        }
                        ContentValues contentValues = new ContentValues();
                        DBUtils.cursorRowToContentValues(cursor, contentValues);
                        try {
                            z8 = new Z8(contentValues);
                            EnumC5037nb enumC5037nb = z8.h;
                            if (enumC5037nb != null) {
                                c4854g9 = (C4854g9) Zf.d.get(enumC5037nb);
                            } else {
                                Map map = Zf.a;
                                c4854g9 = null;
                            }
                            if (c4854g9 == null) {
                                c4854g9 = C4854g9.i;
                            }
                        } catch (Throwable th) {
                            th = th;
                        }
                        try {
                            c5113q9 = c4854g9.a(z8, c5224uh);
                        } catch (Throwable th2) {
                            th = th2;
                            arrayList.add(th);
                            c5113q9 = null;
                            if (c5113q9 == null) {
                            }
                            arrayList2.add(c5113q9);
                            this.h++;
                        }
                        if (c5113q9 == null) {
                            C4897i0 a2 = a(contentValues);
                            if (c4897i0 == null) {
                                if (this.i < 0) {
                                    try {
                                        a = a(new JSONObject(a2.a));
                                    } catch (Throwable unused) {
                                    }
                                    if (a != null) {
                                        i2 = 0;
                                        for (C4957k9 c4957k9 : a) {
                                            i2 += CodedOutputByteBufferNano.computeMessageSize(7, c4957k9);
                                        }
                                        this.i = i2;
                                        this.g += i2;
                                    }
                                    i2 = 0;
                                    this.i = i2;
                                    this.g += i2;
                                }
                                c4897i0 = a2;
                            } else if (!c4897i0.equals(a2)) {
                                z = true;
                                break;
                            }
                            C4977l3 c4977l3 = this.k;
                            byte[] bArr = c5113q9.e;
                            c4977l3.getClass();
                            byte[] a3 = c4977l3.a(bArr);
                            byte[] bArr2 = c5113q9.e;
                            if (bArr2 != a3) {
                                c5113q9.i = ((bArr2 == null ? 0 : bArr2.length) - (a3 == null ? 0 : a3.length)) + c5113q9.i;
                                c5113q9.e = a3;
                            }
                            this.g += CodedOutputByteBufferNano.computeMessageSize(3, c5113q9);
                            if (arrayList2.isEmpty() && i == 0) {
                                if (this.g >= 1048576) {
                                    break;
                                }
                            } else if (this.g >= 250880) {
                                break;
                            }
                        }
                        arrayList2.add(c5113q9);
                        this.h++;
                    }
                    if (arrayList2.size() > 0) {
                        c5164s9.c = (C5113q9[]) arrayList2.toArray(new C5113q9[arrayList2.size()]);
                        ch = new Ch(c5164s9, c4897i0, z);
                        return ch;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    try {
                        arrayList.add(th);
                        vo.a(cursor);
                        return null;
                    } finally {
                        vo.a(cursor);
                    }
                }
            }
            ch = null;
            return ch;
        } catch (Throwable th4) {
            th = th4;
            cursor = null;
        }
    }

    public final Cursor a() {
        Cursor cursor;
        SQLiteDatabase readableDatabase;
        X6 x6 = this.e;
        LinkedHashMap linkedHashMap = this.b;
        x6.a.lock();
        try {
            readableDatabase = x6.c.getReadableDatabase();
        } catch (Throwable unused) {
        }
        if (readableDatabase != null) {
            cursor = readableDatabase.query("sessions", null, X6.a(linkedHashMap), X6.a(new String[]{Long.toString(0L)}, linkedHashMap), null, null, "id ASC", null);
            x6.a.unlock();
            return cursor;
        }
        cursor = null;
        x6.a.unlock();
        return cursor;
    }

    public final Cursor a(long j, EnumC4840fl enumC4840fl) {
        Cursor cursor;
        SQLiteDatabase readableDatabase;
        X6 x6 = this.e;
        x6.a.lock();
        try {
            readableDatabase = x6.c.getReadableDatabase();
        } catch (Throwable unused) {
        }
        if (readableDatabase != null) {
            cursor = readableDatabase.query("events", null, "session_id = ? AND session_type = ?", new String[]{Long.toString(j), Integer.toString(enumC4840fl.a)}, null, null, "number_in_session ASC", null);
            x6.a.unlock();
            return cursor;
        }
        cursor = null;
        x6.a.unlock();
        return cursor;
    }
}

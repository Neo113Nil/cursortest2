package defpackage;

import android.app.ActivityManager;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.Base64;
import android.view.View;
import androidx.work.DirectExecutor;
import com.google.android.datatransport.runtime.firebase.transport.LogEventDropped$Reason;
import com.google.android.datatransport.runtime.scheduling.persistence.b;
import com.google.android.gms.tasks.Task;
import com.yandex.passport.internal.ui.authsdk.AuthSdkActivity;
import com.yandex.plus.ui.core.theme.PlusTheme;
import com.yandex.pulse.LibraryParams;
import com.yandex.pulse.PulseService;
import com.yandex.pulse.histogram.ComponentHistograms;
import io.appmetrica.analytics.coreapi.internal.backport.FunctionWithThrowable;
import io.appmetrica.analytics.screenshot.impl.C1107l;
import io.appmetrica.analytics.screenshot.impl.J;
import io.appmetrica.analytics.screenshot.impl.M;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import ru.yandex.taxi.perf.screen.a;

/* loaded from: classes.dex */
public final /* synthetic */ class i3f implements pke, ri2, bx60, FunctionWithThrowable, el7, m1x0, sll0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object w;

    public /* synthetic */ i3f(int i, Object obj, Object obj2, Object obj3) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.w = obj3;
    }

    public int a() {
        x3m x3mVar = (x3m) this.b;
        return ((qes0) x3mVar.c.getValue()).a((Context) this.c, (PlusTheme) ((n4u0) this.w).getValue());
    }

    /* JADX WARN: Finally extract failed */
    @Override // io.appmetrica.analytics.coreapi.internal.backport.FunctionWithThrowable
    /* renamed from: apply */
    public Object mo489apply(Object obj) {
        long insert;
        b bVar;
        int i = this.a;
        int i2 = 0;
        int i3 = 1;
        Object obj2 = this.w;
        Object obj3 = this.c;
        Object obj4 = this.b;
        switch (i) {
            case 5:
                return J.a((M) obj4, (J) obj3, (C1107l) obj2, (ActivityManager) obj);
            case 8:
                b bVar2 = (b) obj4;
                rfo rfoVar = (rfo) obj3;
                v111 v111Var = (v111) obj2;
                SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
                long simpleQueryForLong = bVar2.a().compileStatement("PRAGMA page_size").simpleQueryForLong() * bVar2.a().compileStatement("PRAGMA page_count").simpleQueryForLong();
                j64 j64Var = bVar2.w;
                if (simpleQueryForLong >= j64Var.a) {
                    bVar2.k(1L, LogEventDropped$Reason.CACHE_FULL, rfoVar.k());
                    return -1L;
                }
                Long c = b.c(sQLiteDatabase, v111Var);
                if (c != null) {
                    insert = c.longValue();
                } else {
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("backend_name", v111Var.b());
                    contentValues.put("priority", Integer.valueOf(i3f0.a(v111Var.d())));
                    contentValues.put("next_request_ms", (Integer) 0);
                    if (v111Var.c() != null) {
                        contentValues.put("extras", Base64.encodeToString(v111Var.c(), 0));
                    }
                    insert = sQLiteDatabase.insert("transport_contexts", null, contentValues);
                }
                int i4 = j64Var.e;
                byte[] bArr = rfoVar.d().b;
                boolean z = bArr.length <= i4;
                ContentValues contentValues2 = new ContentValues();
                contentValues2.put("context_id", Long.valueOf(insert));
                contentValues2.put("transport_name", rfoVar.k());
                contentValues2.put("timestamp_ms", Long.valueOf(rfoVar.e()));
                contentValues2.put("uptime_ms", Long.valueOf(rfoVar.l()));
                contentValues2.put("payload_encoding", rfoVar.d().a.a);
                contentValues2.put(AuthSdkActivity.RESPONSE_TYPE_CODE, rfoVar.c());
                contentValues2.put("num_attempts", (Integer) 0);
                contentValues2.put("inline", Boolean.valueOf(z));
                contentValues2.put("payload", z ? bArr : new byte[0]);
                contentValues2.put("product_id", rfoVar.i());
                contentValues2.put("pseudonymous_id", rfoVar.j());
                contentValues2.put("experiment_ids_clear_blob", rfoVar.f());
                contentValues2.put("experiment_ids_encrypted_blob", rfoVar.g());
                long insert2 = sQLiteDatabase.insert("events", null, contentValues2);
                if (!z) {
                    int ceil = (int) Math.ceil(bArr.length / i4);
                    for (int i5 = 1; i5 <= ceil; i5++) {
                        byte[] copyOfRange = Arrays.copyOfRange(bArr, (i5 - 1) * i4, Math.min(i5 * i4, bArr.length));
                        ContentValues contentValues3 = new ContentValues();
                        contentValues3.put("event_id", Long.valueOf(insert2));
                        contentValues3.put("sequence_num", Integer.valueOf(i5));
                        contentValues3.put("bytes", copyOfRange);
                        sQLiteDatabase.insert("event_payloads", null, contentValues3);
                    }
                }
                for (Map.Entry entry : Collections.unmodifiableMap(rfoVar.b()).entrySet()) {
                    ContentValues contentValues4 = new ContentValues();
                    contentValues4.put("event_id", Long.valueOf(insert2));
                    contentValues4.put("name", (String) entry.getKey());
                    contentValues4.put("value", (String) entry.getValue());
                    sQLiteDatabase.insert("event_metadata", null, contentValues4);
                }
                return Long.valueOf(insert2);
            default:
                b bVar3 = (b) obj4;
                ArrayList arrayList = (ArrayList) obj3;
                v111 v111Var2 = (v111) obj2;
                Cursor cursor = (Cursor) obj;
                while (cursor.moveToNext()) {
                    long j = cursor.getLong(i2);
                    int i6 = cursor.getInt(7) != 0 ? i3 : i2;
                    h64 h64Var = new h64();
                    h64Var.f = new HashMap();
                    String string = cursor.getString(i3);
                    if (string == null) {
                        ny61.t("Null transportName");
                        return null;
                    }
                    h64Var.a = string;
                    h64Var.d = Long.valueOf(cursor.getLong(2));
                    h64Var.e = Long.valueOf(cursor.getLong(3));
                    if (i6 != 0) {
                        String string2 = cursor.getString(4);
                        h64Var.c = new qyn(string2 == null ? b.y : new pzn(string2), cursor.getBlob(5));
                        bVar = bVar3;
                    } else {
                        String string3 = cursor.getString(4);
                        pzn pznVar = string3 == null ? b.y : new pzn(string3);
                        Cursor query = bVar3.a().query("event_payloads", new String[]{"bytes"}, "event_id = ?", new String[]{String.valueOf(j)}, null, null, "sequence_num");
                        try {
                            Cursor cursor2 = query;
                            ArrayList arrayList2 = new ArrayList();
                            int i7 = i2;
                            while (cursor2.moveToNext()) {
                                byte[] blob = cursor2.getBlob(i2);
                                arrayList2.add(blob);
                                i7 += blob.length;
                            }
                            byte[] bArr2 = new byte[i7];
                            int i8 = i2;
                            int i9 = i8;
                            while (i8 < arrayList2.size()) {
                                byte[] bArr3 = (byte[]) arrayList2.get(i8);
                                b bVar4 = bVar3;
                                int i10 = i8;
                                System.arraycopy(bArr3, 0, bArr2, i9, bArr3.length);
                                i9 += bArr3.length;
                                i8 = i10 + 1;
                                bVar3 = bVar4;
                            }
                            bVar = bVar3;
                            query.close();
                            h64Var.c = new qyn(pznVar, bArr2);
                        } catch (Throwable th) {
                            query.close();
                            throw th;
                        }
                    }
                    if (!cursor.isNull(6)) {
                        h64Var.b = Integer.valueOf(cursor.getInt(6));
                    }
                    if (!cursor.isNull(8)) {
                        h64Var.g = Integer.valueOf(cursor.getInt(8));
                    }
                    if (!cursor.isNull(9)) {
                        h64Var.h = cursor.getString(9);
                    }
                    if (!cursor.isNull(10)) {
                        h64Var.i = cursor.getBlob(10);
                    }
                    if (!cursor.isNull(11)) {
                        h64Var.j = cursor.getBlob(11);
                    }
                    arrayList.add(new s74(j, v111Var2, h64Var.c()));
                    bVar3 = bVar;
                    i2 = 0;
                    i3 = 1;
                }
                return null;
        }
    }

    public void b(xes xesVar) {
        List list = (List) this.b;
        zes zesVar = (zes) this.c;
        a aVar = (a) this.w;
        if (list.contains(xesVar.c())) {
            if (xesVar instanceof ves) {
                cfs cfsVar = (cfs) zesVar;
                cfsVar.c.post(new afs(cfsVar, 0));
            } else if (xesVar instanceof wes) {
                ((cfs) zesVar).b(new kn2(11, aVar, xesVar));
            } else if (!(xesVar instanceof ues)) {
                w511.b();
            } else {
                ((cfs) zesVar).b(new dsg(24));
            }
        }
    }

    @Override // defpackage.pke
    public Object h(Task task) {
        atx0 atx0Var = (atx0) this.b;
        AtomicBoolean atomicBoolean = (AtomicBoolean) this.c;
        x18 x18Var = (x18) this.w;
        if (task.o()) {
            atx0Var.c(task.k());
        } else if (task.j() != null) {
            atx0Var.b(task.j());
        } else if (atomicBoolean.getAndSet(true)) {
            x18Var.a();
        }
        return udq0.p(null);
    }

    @Override // defpackage.el7
    public Object j(androidx.concurrent.futures.b bVar) {
        Executor executor = (Executor) this.b;
        String str = (String) this.c;
        sls slsVar = (sls) this.w;
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        bVar.a(new ssu(4, atomicBoolean), DirectExecutor.INSTANCE);
        executor.execute(new r94(atomicBoolean, bVar, slsVar));
        return str;
    }

    @Override // defpackage.bx60
    public n751 onApplyWindowInsets(View view, n751 n751Var) {
        return (n751) ((sfs) this.b).invoke(view, n751Var, (u1w) this.c, (u1w) this.w);
    }

    @Override // defpackage.ri2
    public jb7 provide() {
        ArrayList arrayList = (ArrayList) this.b;
        seu seuVar = (seu) this.c;
        qeu qeuVar = (qeu) this.w;
        return new jb7(3, new njd((List) arrayList), new ikr(qeuVar), seuVar);
    }

    @Override // defpackage.m1x0
    public ComponentHistograms run() {
        ComponentHistograms m342registerLib$lambda1;
        m342registerLib$lambda1 = PulseService.m342registerLib$lambda1((PulseService) this.b, (String) this.c, (LibraryParams) this.w);
        return m342registerLib$lambda1;
    }
}

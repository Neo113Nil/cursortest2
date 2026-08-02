package xsna;

import android.app.Activity;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.os.SystemClock;
import com.vk.log.L;
import com.vk.translate.impl.models.LanguageModel;
import com.vk.translate.impl.models.SupportedTranslateLanguage;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;

/* compiled from: DefaultRendererCapabilitiesList.java */
/* loaded from: classes12.dex */
public final class pll implements vyf0, hno, z1y0, m901 {
    public Object b;

    public /* synthetic */ pll(Object obj) {
        this.b = obj;
    }

    @Override // xsna.hno
    public gn60 a() {
        return new ubc0((a2o) this.b);
    }

    @Override // xsna.hno
    public gn60 b() {
        return new blk();
    }

    @Override // xsna.vyf0
    public androidx.media3.exoplayer.k[] c() {
        androidx.media3.exoplayer.j[] jVarArr = (androidx.media3.exoplayer.j[]) this.b;
        androidx.media3.exoplayer.k[] kVarArr = new androidx.media3.exoplayer.k[jVarArr.length];
        for (int i = 0; i < jVarArr.length; i++) {
            kVarArr[i] = jVarArr[i].getCapabilities();
        }
        return kVarArr;
    }

    @Override // xsna.hno
    public gn60 d() {
        return new edi(18);
    }

    @Override // xsna.m901
    public void e(String str, int i, Throwable th, byte[] bArr, Map map) {
        ayz0 ayz0Var;
        long longValue;
        qj01 qj01Var = (qj01) this.b;
        qj01Var.d().k();
        qj01Var.b();
        if (bArr == null) {
            try {
                bArr = new byte[0];
            } catch (Throwable th2) {
                qj01Var.u = false;
                qj01Var.B();
                throw th2;
            }
        }
        ArrayList arrayList = qj01Var.y;
        exc0.i(arrayList);
        qj01Var.y = null;
        if (i != 200) {
            if (i == 204) {
                i = 204;
            }
            qj01Var.e().q.c("Network upload failed. Will retry later. code, error", Integer.valueOf(i), th);
            u901 u901Var = qj01Var.j.k;
            ((jcl) qj01Var.f()).getClass();
            u901Var.b(System.currentTimeMillis());
            if (i != 503 || i == 429) {
                u901 u901Var2 = qj01Var.j.i;
                ((jcl) qj01Var.f()).getClass();
                u901Var2.b(System.currentTimeMillis());
            }
            ayz0 ayz0Var2 = qj01Var.d;
            qj01.I(ayz0Var2);
            ayz0Var2.Q(arrayList);
            qj01Var.D();
            qj01Var.u = false;
            qj01Var.B();
        }
        if (th == null) {
            try {
                u901 u901Var3 = qj01Var.j.j;
                ((jcl) qj01Var.f()).getClass();
                u901Var3.b(System.currentTimeMillis());
                qj01Var.j.k.b(0L);
                qj01Var.D();
                qj01Var.e().q.c("Successful upload. Got network response. code, size", Integer.valueOf(i), Integer.valueOf(bArr.length));
                ayz0 ayz0Var3 = qj01Var.d;
                qj01.I(ayz0Var3);
                ayz0Var3.O();
                try {
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        Long l = (Long) it.next();
                        try {
                            ayz0Var = qj01Var.d;
                            qj01.I(ayz0Var);
                            longValue = l.longValue();
                            ayz0Var.k();
                            ayz0Var.l();
                            try {
                            } catch (SQLiteException e) {
                                k901 k901Var = ((mb01) ayz0Var.b).j;
                                mb01.k(k901Var);
                                k901Var.i.b(e, "Failed to delete a bundle in a queue table");
                                throw e;
                            }
                        } catch (SQLiteException e2) {
                            ArrayList arrayList2 = qj01Var.z;
                            if (arrayList2 == null || !arrayList2.contains(l)) {
                                throw e2;
                            }
                        }
                        if (ayz0Var.C().delete("queue", "rowid=?", new String[]{String.valueOf(longValue)}) != 1) {
                            throw new SQLiteException("Deleted fewer rows from queue than expected");
                        }
                    }
                    ayz0 ayz0Var4 = qj01Var.d;
                    qj01.I(ayz0Var4);
                    ayz0Var4.p();
                    ayz0 ayz0Var5 = qj01Var.d;
                    qj01.I(ayz0Var5);
                    ayz0Var5.P();
                    qj01Var.z = null;
                    p901 p901Var = qj01Var.c;
                    qj01.I(p901Var);
                    if (p901Var.o() && qj01Var.F()) {
                        qj01Var.u();
                    } else {
                        qj01Var.A = -1L;
                        qj01Var.D();
                    }
                    qj01Var.p = 0L;
                } catch (Throwable th3) {
                    ayz0 ayz0Var6 = qj01Var.d;
                    qj01.I(ayz0Var6);
                    ayz0Var6.P();
                    throw th3;
                }
            } catch (SQLiteException e3) {
                qj01Var.e().i.b(e3, "Database error while trying to delete uploaded bundles");
                ((jcl) qj01Var.f()).getClass();
                qj01Var.p = SystemClock.elapsedRealtime();
                qj01Var.e().q.b(Long.valueOf(qj01Var.p), "Disable upload, time");
            }
            qj01Var.u = false;
            qj01Var.B();
        }
        qj01Var.e().q.c("Network upload failed. Will retry later. code, error", Integer.valueOf(i), th);
        u901 u901Var4 = qj01Var.j.k;
        ((jcl) qj01Var.f()).getClass();
        u901Var4.b(System.currentTimeMillis());
        if (i != 503) {
        }
        u901 u901Var22 = qj01Var.j.i;
        ((jcl) qj01Var.f()).getClass();
        u901Var22.b(System.currentTimeMillis());
        ayz0 ayz0Var22 = qj01Var.d;
        qj01.I(ayz0Var22);
        ayz0Var22.Q(arrayList);
        qj01Var.D();
        qj01Var.u = false;
        qj01Var.B();
    }

    public LanguageModel h(SupportedTranslateLanguage supportedTranslateLanguage) {
        return new LanguageModel(supportedTranslateLanguage, cqm0.b(supportedTranslateLanguage.g().getDisplayName(((ofy0) this.b).i())));
    }

    @Override // xsna.z1y0
    public void i() {
        xgy xgyVar = ((e2g0) this.b).e;
        if (xgyVar != null) {
            xgyVar.k();
        }
    }

    public xki0 j() {
        bbu bbuVar = (bbu) this.b;
        xki0 xki0Var = xki0.c;
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) bbuVar.a;
        sQLiteDatabase.beginTransaction();
        try {
            sQLiteDatabase.execSQL("UPDATE sequence SET next_value = next_value % 2147483647 + 1;");
            Cursor query = ((SQLiteDatabase) bbuVar.a).query(SignalingProtocol.KEY_SEQUENCE, null, null, null, null, null, null, "1");
            try {
                xki0 xki0Var2 = !query.moveToFirst() ? xki0Var : new xki0(query.getString(query.getColumnIndexOrThrow("id")), query.getInt(query.getColumnIndexOrThrow("next_value")));
                query.close();
                sQLiteDatabase.setTransactionSuccessful();
                return xki0Var2;
            } finally {
            }
        } catch (Exception e) {
            L.j(e, "SeqBasedAnalytics:SequenceDao", "Error reading sequence number.");
            ((ta3) bbuVar.b).invoke(e);
            return xki0Var;
        } finally {
            sQLiteDatabase.endTransaction();
        }
    }

    public Activity k() {
        return gnj.b(((ggu0) this.b).b);
    }

    @Override // xsna.vyf0
    public void release() {
        for (androidx.media3.exoplayer.j jVar : (androidx.media3.exoplayer.j[]) this.b) {
            jVar.release();
        }
    }

    @Override // xsna.vyf0
    public int size() {
        return ((androidx.media3.exoplayer.j[]) this.b).length;
    }

    public pll(qj01 qj01Var, String str) {
        this.b = qj01Var;
    }

    @Override // xsna.z1y0
    public void f() {
    }

    @Override // xsna.z1y0
    public void g() {
    }
}

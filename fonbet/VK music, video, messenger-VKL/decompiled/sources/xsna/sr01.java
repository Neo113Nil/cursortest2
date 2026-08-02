package xsna;

import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.text.TextUtils;
import android.util.Pair;
import com.google.android.gms.internal.measurement.zzfs;
import com.google.android.gms.internal.measurement.zzft;
import com.google.android.gms.internal.measurement.zzfx;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-measurement@@21.2.0 */
/* loaded from: classes13.dex */
public final class sr01 {
    public zzft a;
    public Long b;
    public long c;
    public final /* synthetic */ fuz0 d;

    public /* synthetic */ sr01(fuz0 fuz0Var) {
        this.d = fuz0Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:68:0x00fd, code lost:
    
        if (r13 == null) goto L37;
     */
    /* JADX WARN: Not initialized variable reg: 13, insn: 0x00e7: MOVE (r11 I:??[OBJECT, ARRAY]) = (r13 I:??[OBJECT, ARRAY]) (LINE:232), block:B:77:0x00e7 */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01c3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final zzft a(zzft zzftVar, String str) {
        long j;
        Cursor cursor;
        Cursor cursor2;
        Pair pair;
        Object obj;
        String zzh = zzftVar.zzh();
        List zzi = zzftVar.zzi();
        fuz0 fuz0Var = this.d;
        mb01 mb01Var = (mb01) fuz0Var.b;
        qj01 qj01Var = fuz0Var.e;
        qj01Var.P();
        Long l = (Long) sj01.p(zzftVar, "_eid");
        if (l != null) {
            if (zzh.equals("_ep")) {
                qj01Var.P();
                String str2 = (String) sj01.p(zzftVar, "_en");
                Cursor cursor3 = null;
                if (TextUtils.isEmpty(str2)) {
                    k901 k901Var = mb01Var.j;
                    mb01.k(k901Var);
                    k901Var.j.b(l, "Extra parameter without an event name. eventId");
                    return null;
                }
                if (this.a == null || this.b == null || l.longValue() != this.b.longValue()) {
                    ayz0 ayz0Var = qj01Var.d;
                    qj01.I(ayz0Var);
                    mb01 mb01Var2 = (mb01) ayz0Var.b;
                    ayz0Var.k();
                    ayz0Var.l();
                    try {
                        try {
                            cursor = ayz0Var.C().rawQuery("select main_event, children_to_process from main_event_params where app_id=? and event_id=?", new String[]{str, l.toString()});
                            try {
                                if (cursor.moveToFirst()) {
                                    j = 0;
                                    try {
                                        try {
                                            pair = Pair.create((zzft) ((zzfs) sj01.D(zzft.zze(), cursor.getBlob(0))).zzaC(), Long.valueOf(cursor.getLong(1)));
                                            cursor.close();
                                        } catch (SQLiteException e) {
                                            e = e;
                                            k901 k901Var2 = mb01Var2.j;
                                            mb01.k(k901Var2);
                                            k901Var2.i.b(e, "Error selecting main event");
                                        }
                                    } catch (IOException e2) {
                                        k901 k901Var3 = mb01Var2.j;
                                        mb01.k(k901Var3);
                                        k901Var3.i.d("Failed to merge main event. appId, eventId", k901.r(str), l, e2);
                                        cursor.close();
                                        pair = null;
                                        if (pair != null) {
                                        }
                                        k901 k901Var4 = mb01Var.j;
                                        mb01.k(k901Var4);
                                        k901Var4.j.c("Extra parameter without existing main event. eventName, eventId", str2, l);
                                        return null;
                                    }
                                } else {
                                    k901 k901Var5 = mb01Var2.j;
                                    mb01.k(k901Var5);
                                    k901Var5.q.a("Main event not found");
                                    cursor.close();
                                    pair = null;
                                    j = 0;
                                }
                            } catch (SQLiteException e3) {
                                e = e3;
                                j = 0;
                            }
                        } catch (Throwable th) {
                            th = th;
                            cursor3 = cursor2;
                            if (cursor3 != null) {
                                cursor3.close();
                            }
                            throw th;
                        }
                    } catch (SQLiteException e4) {
                        e = e4;
                        j = 0;
                        cursor = null;
                    } catch (Throwable th2) {
                        th = th2;
                        if (cursor3 != null) {
                        }
                        throw th;
                    }
                    if (pair != null || (obj = pair.first) == null) {
                        k901 k901Var42 = mb01Var.j;
                        mb01.k(k901Var42);
                        k901Var42.j.c("Extra parameter without existing main event. eventName, eventId", str2, l);
                        return null;
                    }
                    this.a = (zzft) obj;
                    this.c = ((Long) pair.second).longValue();
                    qj01Var.P();
                    this.b = (Long) sj01.p(this.a, "_eid");
                } else {
                    j = 0;
                }
                long j2 = this.c - 1;
                this.c = j2;
                if (j2 <= j) {
                    ayz0 ayz0Var2 = qj01Var.d;
                    qj01.I(ayz0Var2);
                    mb01 mb01Var3 = (mb01) ayz0Var2.b;
                    ayz0Var2.k();
                    k901 k901Var6 = mb01Var3.j;
                    mb01.k(k901Var6);
                    k901Var6.q.b(str, "Clearing complex main event info. appId");
                    try {
                        ayz0Var2.C().execSQL("delete from main_event_params where app_id=?", new String[]{str});
                    } catch (SQLiteException e5) {
                        k901 k901Var7 = mb01Var3.j;
                        mb01.k(k901Var7);
                        k901Var7.i.b(e5, "Error clearing complex main event");
                    }
                } else {
                    ayz0 ayz0Var3 = qj01Var.d;
                    qj01.I(ayz0Var3);
                    ayz0Var3.s(str, l, this.c, this.a);
                }
                ArrayList arrayList = new ArrayList();
                for (zzfx zzfxVar : this.a.zzi()) {
                    qj01Var.P();
                    if (sj01.o(zzftVar, zzfxVar.zzg()) == null) {
                        arrayList.add(zzfxVar);
                    }
                }
                if (arrayList.isEmpty()) {
                    k901 k901Var8 = mb01Var.j;
                    mb01.k(k901Var8);
                    k901Var8.j.b(str2, "No unique parameters in main event. eventName");
                } else {
                    arrayList.addAll(zzi);
                    zzi = arrayList;
                }
                zzh = str2;
            } else {
                this.b = l;
                this.a = zzftVar;
                qj01Var.P();
                Object p = sj01.p(zzftVar, "_epc");
                long longValue = ((Long) (p != null ? p : 0L)).longValue();
                this.c = longValue;
                if (longValue <= 0) {
                    k901 k901Var9 = mb01Var.j;
                    mb01.k(k901Var9);
                    k901Var9.j.b(zzh, "Complex event with zero extra param count. eventName");
                } else {
                    ayz0 ayz0Var4 = qj01Var.d;
                    qj01.I(ayz0Var4);
                    ayz0Var4.s(str, l, this.c, zzftVar);
                }
            }
        }
        zzfs zzfsVar = (zzfs) zzftVar.zzby();
        zzfsVar.zzi(zzh);
        zzfsVar.zzg();
        zzfsVar.zzd(zzi);
        return (zzft) zzfsVar.zzaC();
    }
}

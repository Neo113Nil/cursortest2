package defpackage;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Trace;
import com.google.android.datatransport.Priority;
import com.google.android.datatransport.runtime.firebase.transport.LogEventDropped$Reason;
import com.google.android.datatransport.runtime.scheduling.persistence.b;
import com.google.android.gms.tasks.Task;
import com.google.firebase.FirebaseCommonRegistrar;
import com.yandex.passport.internal.features.a;
import com.yandex.passport.internal.flags.g;
import com.yandex.pulse.ApplicationParams;
import com.yandex.pulse.PulseService;
import com.yandex.pulse.histogram.ComponentHistograms;
import com.yandex.pulse.mvi.tracker.ResponsivenessTracker;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import ru.CryptoPro.JCP.tools.HexString;

/* loaded from: classes9.dex */
public final /* synthetic */ class e89 implements e1d, j6x, thw0, moh, m1x0, pke, sll0, lrt0, v0x0, vbi0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ e89(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // defpackage.sll0
    public Object apply(Object obj) {
        b bVar = (b) this.b;
        v111 v111Var = (v111) this.c;
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
        j64 j64Var = bVar.w;
        ArrayList e = bVar.e(sQLiteDatabase, v111Var, j64Var.b);
        for (Priority priority : Priority.values()) {
            if (priority != v111Var.d()) {
                int size = j64Var.b - e.size();
                if (size <= 0) {
                    break;
                }
                e.addAll(bVar.e(sQLiteDatabase, v111Var.e(priority), size));
            }
        }
        HashMap hashMap = new HashMap();
        StringBuilder sb = new StringBuilder("event_id IN (");
        for (int i = 0; i < e.size(); i++) {
            sb.append(((u0b0) e.get(i)).b());
            if (i < e.size() - 1) {
                sb.append(HexString.CHAR_COMMA);
            }
        }
        sb.append(')');
        Cursor query = sQLiteDatabase.query("event_metadata", new String[]{"event_id", "name", "value"}, sb.toString(), null, null, null, null);
        try {
            Cursor cursor = query;
            while (cursor.moveToNext()) {
                long j = cursor.getLong(0);
                Set set = (Set) hashMap.get(Long.valueOf(j));
                if (set == null) {
                    set = new HashSet();
                    hashMap.put(Long.valueOf(j), set);
                }
                set.add(new tll0(cursor.getString(1), cursor.getString(2)));
            }
            query.close();
            ListIterator listIterator = e.listIterator();
            while (listIterator.hasNext()) {
                u0b0 u0b0Var = (u0b0) listIterator.next();
                if (hashMap.containsKey(Long.valueOf(u0b0Var.b()))) {
                    h64 m = u0b0Var.a().m();
                    for (tll0 tll0Var : (Set) hashMap.get(Long.valueOf(u0b0Var.b()))) {
                        m.a(tll0Var.a, tll0Var.b);
                    }
                    listIterator.set(new s74(u0b0Var.b(), u0b0Var.c(), m.c()));
                }
            }
            return e;
        } catch (Throwable th) {
            query.close();
            throw th;
        }
    }

    @Override // defpackage.lrt0
    public boolean e() {
        prt0 prt0Var = (prt0) this.b;
        h270 h270Var = (h270) this.c;
        boolean booleanValue = ((Boolean) prt0Var.e.invoke()).booleanValue();
        if (!booleanValue) {
            h270Var.a(new ort0(prt0Var, 0));
        }
        return booleanValue;
    }

    @Override // defpackage.v0x0
    public Object execute() {
        int i = this.a;
        Object obj = this.c;
        wd21 wd21Var = (wd21) this.b;
        switch (i) {
            case 13:
                Iterable iterable = (Iterable) obj;
                b bVar = (b) wd21Var.c;
                bVar.getClass();
                if (iterable.iterator().hasNext()) {
                    bVar.a().compileStatement("DELETE FROM events WHERE _id in ".concat(b.o(iterable))).execute();
                    break;
                }
                break;
            default:
                Iterator it = ((HashMap) obj).entrySet().iterator();
                while (it.hasNext()) {
                    ((b) wd21Var.i).k(((Integer) r2.getValue()).intValue(), LogEventDropped$Reason.INVALID_PAYLOD, (String) ((Map.Entry) it.next()).getKey());
                }
                break;
        }
        return null;
    }

    @Override // defpackage.moh
    public void f(zvf0 zvf0Var) {
        moh mohVar = (moh) this.b;
        moh mohVar2 = (moh) this.c;
        mohVar.f(zvf0Var);
        mohVar2.f(zvf0Var);
    }

    @Override // defpackage.thw0
    public Object get() {
        ev20 ev20Var = (ev20) this.b;
        fv20 fv20Var = (fv20) this.c;
        av20 av20Var = new av20(ev20Var);
        fv20Var.getClass();
        return new ResponsivenessTracker(av20Var);
    }

    @Override // defpackage.vbi0
    public Object getValue(Object obj, kgx kgxVar) {
        a aVar = (a) this.b;
        return Boolean.valueOf(aVar.a() && ((Boolean) aVar.a.b((g) this.c)).booleanValue());
    }

    @Override // defpackage.pke
    public Object h(Task task) {
        tig0 tig0Var = (tig0) this.b;
        String str = (String) this.c;
        synchronized (tig0Var) {
            ((w53) tig0Var.b).remove(str);
        }
        return task;
    }

    @Override // defpackage.e1d
    public Object k(yuf0 yuf0Var) {
        int i = this.a;
        Object obj = this.c;
        String str = (String) this.b;
        switch (i) {
            case 1:
                j0d j0dVar = (j0d) obj;
                try {
                    Trace.beginSection(str);
                    return j0dVar.f.k(yuf0Var);
                } finally {
                    Trace.endSection();
                }
            default:
                Context context = (Context) yuf0Var.a(Context.class);
                int i2 = ((yhl) obj).a;
                String str2 = "";
                switch (i2) {
                    case 20:
                        ApplicationInfo applicationInfo = context.getApplicationInfo();
                        if (applicationInfo != null) {
                            str2 = String.valueOf(applicationInfo.targetSdkVersion);
                            break;
                        }
                        break;
                    case 21:
                        ApplicationInfo applicationInfo2 = context.getApplicationInfo();
                        if (applicationInfo2 != null) {
                            str2 = String.valueOf(applicationInfo2.minSdkVersion);
                            break;
                        }
                        break;
                    case 22:
                        if (!context.getPackageManager().hasSystemFeature("android.hardware.type.television")) {
                            if (!context.getPackageManager().hasSystemFeature("android.hardware.type.watch")) {
                                if (!context.getPackageManager().hasSystemFeature("android.hardware.type.automotive")) {
                                    if (context.getPackageManager().hasSystemFeature("android.hardware.type.embedded")) {
                                        str2 = "embedded";
                                        break;
                                    }
                                } else {
                                    str2 = "auto";
                                    break;
                                }
                            } else {
                                str2 = "watch";
                                break;
                            }
                        } else {
                            str2 = "tv";
                            break;
                        }
                        break;
                    default:
                        String installerPackageName = context.getPackageManager().getInstallerPackageName(context.getPackageName());
                        if (installerPackageName != null) {
                            str2 = FirebaseCommonRegistrar.a(installerPackageName);
                            break;
                        }
                        break;
                }
                return new d74(str, str2);
        }
    }

    @Override // defpackage.m1x0
    public ComponentHistograms run() {
        ComponentHistograms m341registerApp$lambda0;
        m341registerApp$lambda0 = PulseService.m341registerApp$lambda0((PulseService) this.b, (ApplicationParams) this.c);
        return m341registerApp$lambda0;
    }

    @Override // defpackage.j6x
    public void x() {
        k6x k6xVar = (k6x) this.b;
        k6xVar.c.remove((i6x) this.c);
    }
}

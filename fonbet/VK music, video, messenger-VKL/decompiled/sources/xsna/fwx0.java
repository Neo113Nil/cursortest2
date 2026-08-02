package xsna;

import android.content.Context;
import androidx.room.RoomDatabase;
import androidx.work.impl.WorkDatabase;
import com.vk.dto.common.id.UserId;
import com.vkontakte.android.R;

/* compiled from: WorkManagerImplExt.kt */
/* loaded from: classes.dex */
public final class fwx0 {
    public static bpn0 a;

    public static final dwx0 a(Context context, androidx.work.a aVar) {
        RoomDatabase.a a2;
        hwx0 hwx0Var = new hwx0(aVar.c);
        Context applicationContext = context.getApplicationContext();
        i7o0 i7o0Var = aVar.d;
        if (context.getResources().getBoolean(R.bool.workmanager_test_configuration)) {
            a2 = new RoomDatabase.a(applicationContext, null, WorkDatabase.class);
            a2.i = true;
        } else {
            a2 = androidx.room.i.a(applicationContext, "androidx.work.workdb", WorkDatabase.class);
            a2.h = new lx1(applicationContext);
        }
        a2.f = hwx0Var.a;
        a2.d.add(new rhc(i7o0Var));
        a2.a(sm20.c);
        a2.a(new z8g0(applicationContext, 2, 3));
        a2.a(tm20.c);
        a2.a(um20.c);
        a2.a(new z8g0(applicationContext, 5, 6));
        a2.a(vm20.c);
        a2.a(wm20.c);
        a2.a(xm20.c);
        a2.a(new iwx0(applicationContext));
        a2.a(new z8g0(applicationContext, 10, 11));
        a2.a(om20.c);
        a2.a(pm20.c);
        a2.a(qm20.c);
        a2.a(rm20.c);
        a2.a(new z8g0(applicationContext, 21, 22));
        a2.c();
        WorkDatabase workDatabase = (WorkDatabase) a2.b();
        uhp0 uhp0Var = new uhp0(context.getApplicationContext(), hwx0Var);
        ohd0 ohd0Var = new ohd0(context.getApplicationContext(), aVar, hwx0Var, workDatabase);
        return new dwx0(context.getApplicationContext(), aVar, hwx0Var, workDatabase, ewx0.b.invoke(context, aVar, hwx0Var, workDatabase, uhp0Var, ohd0Var), ohd0Var, uhp0Var);
    }

    public static UserId b(String str) {
        return new UserId(Long.parseLong(str));
    }

    public static final zcp c() {
        bpn0 bpn0Var = a;
        if (bpn0Var == null) {
            bpn0Var = null;
        }
        return (zcp) bpn0Var.getValue();
    }
}

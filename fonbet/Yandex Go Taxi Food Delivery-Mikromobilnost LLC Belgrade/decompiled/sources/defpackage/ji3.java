package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Looper;
import com.yandex.go.taxi.order.provider.w;
import com.yandex.go.taxi.order.repositories.c;
import com.yandex.messaging.internal.prefs.ThreadRestrictPreferences;
import com.yandex.messenger.websdk.api.WebMessenger;
import java.io.File;
import java.util.Locale;
import ru.yandex.taxi.messenger.MessengerWebSdkParamsSupplier$MessengerType;

/* loaded from: classes.dex */
public final class ji3 implements v7p {
    public final /* synthetic */ int a;
    public final n3w b;
    public final xvf0 c;

    public /* synthetic */ ji3(int i, n3w n3wVar, xvf0 xvf0Var, Object obj) {
        this.a = i;
        this.c = xvf0Var;
        this.b = n3wVar;
    }

    @Override // defpackage.yvf0
    public final Object get() {
        boolean z;
        int i = this.a;
        boolean z2 = true;
        int i2 = 0;
        n3w n3wVar = this.b;
        xvf0 xvf0Var = this.c;
        switch (i) {
            case 0:
                return new ii3((w030) xvf0Var.get(), (fi3) n3wVar.a, i2);
            case 1:
                return new dr7(i2, (vt7) n3wVar.a, (w030) xvf0Var.get());
            case 2:
                return vy91.e((txm) n3wVar.a, (w030) xvf0Var.get());
            case 3:
                return mz91.b((p1n) n3wVar.a, (w030) xvf0Var.get());
            case 4:
                return ((z720) n3wVar.a).a((WebMessenger) i5m.a(xvf0Var).get(), MessengerWebSdkParamsSupplier$MessengerType.Taxi);
            case 5:
                return new n170((p170) xvf0Var.get(), (b1f) n3wVar.a);
            case 6:
                return cro.a((Context) xvf0Var.get(), new File((File) n3wVar.a, "ExperimentsDatabase"));
            case 7:
                return new zc((w030) xvf0Var.get(), (t3g0) n3wVar.a, 11);
            case 8:
                w wVar = new w((n8l0) n3wVar.a);
                wVar.c((c) xvf0Var.get());
                return wVar;
            case 9:
                return new cjm0(25, (wcr0) xvf0Var.get(), (icr0) n3wVar.a);
            case 10:
                Context context = (Context) xvf0Var.get();
                String str = (String) n3wVar.a;
                Locale locale = Locale.US;
                SharedPreferences sharedPreferences = context.getSharedPreferences("messenger_ui_" + str, 0);
                SharedPreferences sharedPreferences2 = context.getSharedPreferences("messenger", 0);
                SharedPreferences.Editor edit = sharedPreferences.edit();
                SharedPreferences.Editor edit2 = sharedPreferences2.edit();
                boolean a = rpr0.a(edit2, edit, sharedPreferences2, "guid") | rpr0.a(edit2, edit, sharedPreferences2, "yambtoken");
                if (sharedPreferences2.contains("passport_user_env")) {
                    edit.putInt("passport_user_env", sharedPreferences2.getInt("passport_user_env", 0));
                    edit2.remove("passport_user_env");
                    z = true;
                } else {
                    z = false;
                }
                boolean z3 = a | z;
                if (sharedPreferences2.contains("passport_user_uid")) {
                    edit.putLong("passport_user_uid", sharedPreferences2.getLong("passport_user_uid", 0L));
                    edit2.remove("passport_user_uid");
                } else {
                    z2 = false;
                }
                if (z3 | z2) {
                    edit.apply();
                    edit2.apply();
                }
                return new ThreadRestrictPreferences(Looper.getMainLooper(), sharedPreferences);
            case 11:
                return new dr7((w030) xvf0Var.get(), (ozr0) n3wVar.a, 9);
            case 12:
                return wfz.q((v9g) xvf0Var.get(), (q4s0) n3wVar.a);
            case 13:
                return new xdw0((vdw0) xvf0Var.get(), (pdw0) n3wVar.a);
            case 14:
                lfw0 lfw0Var = (lfw0) xvf0Var.get();
                int i3 = vgw0.a[((f8v0) n3wVar.a).e.ordinal()];
                if (i3 == 1) {
                    return new egw0(lfw0Var.a, lfw0Var.b, lfw0Var.c, lfw0Var.d, lfw0Var.e, lfw0Var.f, lfw0Var.g, lfw0Var.h);
                }
                if (i3 == 2) {
                    return new yfw0(lfw0Var.a, lfw0Var.b, lfw0Var.c, lfw0Var.d, lfw0Var.e, lfw0Var.f, lfw0Var.g, lfw0Var.h);
                }
                w511.b();
                return null;
            default:
                return new ft41((zis) xvf0Var.get(), (zm41) n3wVar.a);
        }
    }

    public /* synthetic */ ji3(n3w n3wVar, xvf0 xvf0Var, int i) {
        this.a = i;
        this.b = n3wVar;
        this.c = xvf0Var;
    }

    public /* synthetic */ ji3(xvf0 xvf0Var, n3w n3wVar, int i) {
        this.a = i;
        this.c = xvf0Var;
        this.b = n3wVar;
    }
}

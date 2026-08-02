package defpackage;

import android.content.Context;
import com.squareup.moshi.Moshi;
import com.yandex.messaging.InitialOrganizationStrategy;
import com.yandex.messaging.profile.d;
import com.ybsdk.api.e;
import com.ybsdk.rconfig.b;
import com.ybsdk.screens.divbottomsheet.DivBottomSheetApi;
import java.io.File;

/* loaded from: classes8.dex */
public final class fpp0 implements v7p {
    public final /* synthetic */ int a;
    public final xvf0 b;

    public /* synthetic */ fpp0(xvf0 xvf0Var, int i) {
        this.a = i;
        this.b = xvf0Var;
    }

    @Override // defpackage.yvf0
    public final Object get() {
        int i = this.a;
        xvf0 xvf0Var = this.b;
        switch (i) {
            case 0:
                return new yop0((a1b0) xvf0Var.get());
            case 1:
                return new zop0((b) xvf0Var.get());
            case 2:
                e eVar = (e) xvf0Var.get();
                nvd nvdVar = new nvd();
                nvdVar.e(new iop0(eVar));
                return nvdVar;
            case 3:
                return new pxn((Context) xvf0Var.get());
            case 4:
                return new uop0((hh51) xvf0Var.get());
            case 5:
                return (tvv) xvf0Var.get();
            case 6:
                InitialOrganizationStrategy initialOrganizationStrategy = ((lqo) xvf0Var.get()).a(tz10.j) ? InitialOrganizationStrategy.FirstAvailable : InitialOrganizationStrategy.Zero;
                q5z.i(initialOrganizationStrategy);
                return initialOrganizationStrategy;
            case 7:
                ((rz10) xvf0Var.get()).a.getClass();
                return new p220();
            case 8:
                ((rz10) xvf0Var.get()).a.getClass();
                return new q220();
            case 9:
                return new wop0((hh51) xvf0Var.get());
            case 10:
                return (uz10) xvf0Var.get();
            case 11:
                return new w530((Context) xvf0Var.get());
            case 12:
                return new File(((Context) xvf0Var.get()).getDataDir(), "shared_prefs");
            case 13:
                return (d) xvf0Var.get();
            case 14:
                return new ouf0((Moshi) xvf0Var.get());
            case 15:
                return new bpp0((b) xvf0Var.get());
            case 16:
                return new cpp0((b) xvf0Var.get());
            case 17:
                return new vop0((Context) xvf0Var.get());
            case 18:
                return new owk0((Context) xvf0Var.get());
            case 19:
                return (nvd) xvf0Var.get();
            case 20:
                return new com.yandex.messaging.data.e(((Context) xvf0Var.get()).getSharedPreferences("messenger", 0));
            case 21:
                return ((Context) xvf0Var.get()).getSharedPreferences("messenger", 0);
            case 22:
                return ((Context) xvf0Var.get()).getSharedPreferences("telemost-app", 0);
            case 23:
                dj51 dj51Var = (dj51) ((hh51) xvf0Var.get()).k.invoke();
                q5z.i(dj51Var);
                return dj51Var;
            case 24:
                return new xop0((hh51) xvf0Var.get());
            case 25:
                return (DivBottomSheetApi) ((t0k0) xvf0Var.get()).b(DivBottomSheetApi.class);
            case 26:
                return (iyf0) xvf0Var.get();
            case 27:
                di51 di51Var = ((hh51) xvf0Var.get()).b;
                q5z.i(di51Var);
                return di51Var;
            case 28:
                gh51 gh51Var = ((hh51) xvf0Var.get()).i;
                q5z.i(gh51Var);
                return gh51Var;
            default:
                return new o370((v7j0) xvf0Var.get());
        }
    }

    public /* synthetic */ fpp0(epp0 epp0Var, xvf0 xvf0Var, int i) {
        this.a = i;
        this.b = xvf0Var;
    }
}

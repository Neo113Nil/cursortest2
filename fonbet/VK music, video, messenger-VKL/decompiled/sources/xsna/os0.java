package xsna;

import android.content.SharedPreferences;
import android.hardware.SensorManager;
import com.vk.core.preference.Preference;
import com.vk.di.component.app.AppContextDiComponent;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class os0 implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ os0(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        switch (this.b) {
            case 0:
                qs0 qs0Var = (qs0) this.c;
                bpn0 bpn0Var = qs0Var.c;
                int i = ((SharedPreferences) bpn0Var.getValue()).getInt("address_book_prefs", 0);
                if (i != 2) {
                    qs0Var.a.deleteSharedPreferences(lhg.a(i, "address_book_prefs_"));
                    ((SharedPreferences) bpn0Var.getValue()).edit().putInt("address_book_prefs", 2).apply();
                }
                return Preference.f("address_book_prefs_2");
            case 1:
                return ((k1q) this.c).a().compileStatement("SELECT event_name FROM events WHERE event_name=? AND user_id=? AND app_hash=?");
            case 2:
                return go9.b("Change credentials. Difference: ", (String) this.c);
            case 3:
                return ((SensorManager) ((h9e0) this.c).c.getValue()).getDefaultSensor(8);
            case 4:
                bhl0 bhl0Var = (bhl0) this.c;
                f0w a = bhl0Var.c.a(bhl0Var.d, e2l.a, bhl0Var.e);
                a.o(bhl0Var.j);
                return a;
            default:
                return new AppContextDiComponent.a(((jau0) this.c).b);
        }
    }
}

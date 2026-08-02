package xsna;

import android.content.SharedPreferences;
import com.vk.metrics.performance.power.PowerConsumptionChecker;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class iy6 implements wzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ iy6(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        switch (this.b) {
            case 0:
                ky6 ky6Var = (ky6) this.c;
                SharedPreferences sharedPreferences = (SharedPreferences) obj;
                SharedPreferences sharedPreferences2 = (SharedPreferences) obj2;
                ArrayList arrayList = new ArrayList();
                LinkedHashSet<SharedPreferences.OnSharedPreferenceChangeListener> linkedHashSet = ky6Var.i;
                for (SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener : linkedHashSet) {
                    sharedPreferences2.registerOnSharedPreferenceChangeListener(onSharedPreferenceChangeListener);
                    sharedPreferences.unregisterOnSharedPreferenceChangeListener(onSharedPreferenceChangeListener);
                    if (onSharedPreferenceChangeListener != null) {
                        arrayList.add(onSharedPreferenceChangeListener);
                    }
                }
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    linkedHashSet.remove((SharedPreferences.OnSharedPreferenceChangeListener) it.next());
                }
                break;
            default:
                PowerConsumptionChecker powerConsumptionChecker = (PowerConsumptionChecker) this.c;
                int intValue = ((Integer) obj).intValue();
                boolean booleanValue = ((Boolean) obj2).booleanValue();
                PowerConsumptionChecker.a aVar = powerConsumptionChecker.e;
                aVar.c = intValue;
                aVar.d = booleanValue;
                break;
        }
        return s3q0.a;
    }
}

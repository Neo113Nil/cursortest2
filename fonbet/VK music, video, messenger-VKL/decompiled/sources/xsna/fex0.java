package xsna;

import android.content.Context;
import androidx.activity.ComponentActivity;
import com.vk.core.apps.BuildInfo;
import com.vk.device.store.AppStore;
import com.vk.toggle.data.InAppUpdatesConfig;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes11.dex */
public final /* synthetic */ class fex0 implements izs {
    public final /* synthetic */ InAppUpdatesConfig b;
    public final /* synthetic */ Context c;
    public final /* synthetic */ ro d;

    public /* synthetic */ fex0(InAppUpdatesConfig inAppUpdatesConfig, Context context, ro roVar) {
        this.b = inAppUpdatesConfig;
        this.c = context;
        this.d = roVar;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        InAppUpdatesConfig inAppUpdatesConfig = this.b;
        InAppUpdatesConfig.StoreUpdater storeUpdater = inAppUpdatesConfig.c;
        ComponentActivity componentActivity = (ComponentActivity) obj;
        boolean z = BuildInfo.b() && storeUpdater == InAppUpdatesConfig.StoreUpdater.RUSTORE;
        boolean z2 = inAppUpdatesConfig.a;
        InAppUpdatesConfig.StoreUpdater storeUpdater2 = inAppUpdatesConfig.d;
        boolean z3 = z2 && pmr0.a(this.c) && (BuildInfo.j() || ((z || storeUpdater == InAppUpdatesConfig.StoreUpdater.ANY) && storeUpdater2 == InAppUpdatesConfig.StoreUpdater.GMS));
        boolean h = BuildInfo.h();
        ro roVar = this.d;
        return e43.l(new e3u(componentActivity, z3, h, roVar), new lsg0(componentActivity, inAppUpdatesConfig.b && dy2.i(AppStore.RUSTORE.j()) && (BuildInfo.b() || (((BuildInfo.j() && storeUpdater == InAppUpdatesConfig.StoreUpdater.GMS) || storeUpdater == InAppUpdatesConfig.StoreUpdater.ANY) && storeUpdater2 == InAppUpdatesConfig.StoreUpdater.RUSTORE)), BuildInfo.h(), roVar));
    }
}

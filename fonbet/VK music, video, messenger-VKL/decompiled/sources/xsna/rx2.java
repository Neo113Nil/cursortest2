package xsna;

import android.content.SharedPreferences;
import android.os.Trace;
import androidx.lifecycle.e0;
import com.vk.core.preference.Preference;
import com.vk.ecomm.storefrontservices.api.StorefrontServicesComponent;
import com.vk.games.di.GamesCatalogComponentImpl;
import com.vk.im.sync.api.di.ImSynchronizationHelpersComponent;
import com.vk.navigation.NavigationDelegateActivity;
import com.vkontakte.android.R;
import com.vkontakte.android.VKApplication;
import com.vkontakte.android.task.di.components.NewsFeedBridgeComponentImpl;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class rx2 implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ rx2(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.gzs
    public final Object invoke() {
        int i = this.b;
        Object obj = this.c;
        switch (i) {
            case 0:
                return ((dc3) obj).getDeviceId();
            case 1:
                SharedPreferences h = Preference.h(((h7i) obj).a, 0, "compat_http_request_executor_prefs");
                if (h.getInt("version", 0) < 1) {
                    h.edit().clear().putInt("version", 1).apply();
                }
                return h;
            case 2:
                return new gbn((hbn) obj);
            case 3:
                GamesCatalogComponentImpl gamesCatalogComponentImpl = (GamesCatalogComponentImpl) obj;
                ewy ewyVar = gamesCatalogComponentImpl.j;
                qcy<Object>[] qcyVarArr = GamesCatalogComponentImpl.s;
                qcy<Object> qcyVar = qcyVarArr[9];
                bat batVar = (bat) ewyVar.c();
                ewy ewyVar2 = gamesCatalogComponentImpl.l;
                qcy<Object> qcyVar2 = qcyVarArr[11];
                bct bctVar = (bct) ewyVar2.c();
                ewy ewyVar3 = gamesCatalogComponentImpl.k;
                qcy<Object> qcyVar3 = qcyVarArr[10];
                dat datVar = (dat) ewyVar3.c();
                ewy ewyVar4 = gamesCatalogComponentImpl.m;
                qcy<Object> qcyVar4 = qcyVarArr[12];
                wet wetVar = (wet) ewyVar4.c();
                ewy ewyVar5 = gamesCatalogComponentImpl.o;
                qcy<Object> qcyVar5 = qcyVarArr[14];
                fdt fdtVar = (fdt) ewyVar5.c();
                ewy ewyVar6 = gamesCatalogComponentImpl.n;
                qcy<Object> qcyVar6 = qcyVarArr[13];
                return new het(batVar, bctVar, datVar, wetVar, fdtVar, (l8t) ewyVar6.c());
            case 4:
                return Integer.valueOf(((NavigationDelegateActivity) obj).getResources().getDimensionPixelSize(R.dimen.music_modern_small_player_height));
            case 5:
                return ((StorefrontServicesComponent) ((NewsFeedBridgeComponentImpl) obj).c.getValue()).a();
            case 6:
                androidx.lifecycle.e0 a = e0.b.a((xyt0) obj, new androidx.lifecycle.z(), 4);
                return (s1h0) a.a.a("androidx.lifecycle.internal.SavedStateHandlesVM", fpf0.a(s1h0.class));
            case 7:
                bhl0 bhl0Var = (bhl0) obj;
                Trace.beginSection(ndp0.f("lazy StorageManager.channelsStorage"));
                try {
                    gkb gkbVar = new gkb(bhl0Var.B());
                    bhl0Var.z(gkbVar);
                    return gkbVar;
                } finally {
                    Trace.endSection();
                }
            default:
                VKApplication.a aVar = VKApplication.c;
                ((ph20) ((bpn0) obj).getValue()).a();
                ((ImSynchronizationHelpersComponent) m7m.e().a(fpf0.a(ImSynchronizationHelpersComponent.class))).x3().init();
                return s3q0.a;
        }
    }
}

package defpackage;

import android.app.Application;
import android.app.usage.StorageStatsManager;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.storage.StorageManager;
import android.util.Log;
import android.view.KeyEvent;
import android.view.MotionEvent;
import com.yandex.go.platform.sdk.models.PlatformEnvironment;
import com.yandex.go.platform.sdk.models.a;
import com.yandex.passport.sloth.ui.dependencies.m;
import com.yandex.taxi.go_platform.delegates.c;
import defpackage.oax;
import defpackage.zy11;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.IllegalFormatException;
import java.util.UUID;
import kotlin.Pair;
import ru.yandex.taxi.activity.MainActivity;
import ru.yandex.taxi.fragment.MapFragment;
import ru.yandex.taxi.fragment.common.b;
import ru.yandex.taxi.go_platform.GoPlatformActivity;
import ru.yandex.taxi.perf.PerformanceAnalytics$Type;

/* loaded from: classes5.dex */
public final class kqt implements o300 {
    public final h2t a;
    public final rrt0 b;
    public final fva0 c;
    public lb7 w;

    public kqt(h2t h2tVar, rrt0 rrt0Var, fva0 fva0Var) {
        this.a = h2tVar;
        this.b = rrt0Var;
        this.c = fva0Var;
    }

    @Override // defpackage.o300
    public final void a(MainActivity mainActivity) {
        y5e.d0 = new WeakReference(mainActivity);
        kst0.a(mainActivity);
    }

    @Override // defpackage.o300
    public final void b() {
    }

    @Override // defpackage.o300
    public final void c() {
    }

    @Override // defpackage.zyq
    public final b createDefaultFileChooserHandler() {
        return null;
    }

    @Override // defpackage.q15
    public final zbs createFragmentComponent() {
        throw new IllegalStateException("Can't create FragmentComponent for GoPlatform");
    }

    @Override // defpackage.ui00
    public final ti00 createMapFragmentComponent(MapFragment mapFragment, xm00 xm00Var) {
        throw new IllegalStateException("Can't create MapFragmentComponent for GoPlatform");
    }

    @Override // defpackage.o300
    public final void d() {
    }

    @Override // defpackage.o300
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return false;
    }

    @Override // defpackage.o300
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return false;
    }

    @Override // defpackage.o300
    public final void e(MainActivity mainActivity) {
        this.b.a(mainActivity);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0105 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // defpackage.o300
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void f(MainActivity mainActivity, long j, Bundle bundle) {
        StorageStatsManager storageStatsManager;
        cju0 cju0Var;
        mainActivity.getWindow().setBackgroundDrawable(new ColorDrawable(mainActivity.getColor(xqg0.almost_white)));
        this.w = new lb7(mainActivity);
        PerformanceAnalytics$Type performanceAnalytics$Type = PerformanceAnalytics$Type.Loading;
        fva0 fva0Var = this.c;
        fva0Var.e("MainActivity.OnCreate", performanceAnalytics$Type, j);
        Intent intent = mainActivity.getIntent();
        Uri data = intent != null ? intent.getData() : null;
        m mVar = (m) this.a.a;
        final oax oaxVar = (oax) mVar.i;
        oaxVar.getClass();
        tls tlsVar = new tls() { // from class: com.yandex.taxi.go_platform.internal.a
            @Override // defpackage.tls
            public final Object invoke(Object obj) {
                ((com.yandex.go.platform.sdk.models.a) obj).a(new String[0], new JsExtensionsProvider$provideExtensions$1$1(oax.this, null));
                return zy11.a;
            }
        };
        a aVar = new a();
        tlsVar.invoke(aVar);
        Application application = (Application) mVar.a;
        rs2 rs2Var = (rs2) mVar.c;
        uqt uqtVar = ((tqt) mVar.h).a;
        String str = (String) uqtVar.w.getValue(uqtVar, uqt.x[1]);
        ((pux0) ((o3h) mVar.j)).getClass();
        boj0 boj0Var = new boj0(application, rs2Var, str, pux0.b);
        com.yandex.go.platform.di.b bVar = com.yandex.go.platform.sdk.a.a;
        PlatformEnvironment platformEnvironment = PlatformEnvironment.PRODUCTION;
        ((tt2) mVar.b).getClass();
        sjh sjhVar = uyj.a;
        ike a = bvf0.a(o400.a);
        ivc0 ivc0Var = new ivc0();
        zch zchVar = (zch) mVar.d;
        mb20 mb20Var = (mb20) mVar.e;
        oa1 oa1Var = (oa1) mVar.f;
        c cVar = (c) mVar.g;
        long currentTimeMillis = System.currentTimeMillis();
        com.yandex.go.platform.di.b bVar2 = new com.yandex.go.platform.di.b(application, a, boj0Var, platformEnvironment, zchVar, mb20Var, oa1Var, cVar, aVar, ivc0Var);
        com.yandex.go.platform.sdk.a.a = bVar2;
        i32 i32Var = bVar2.p;
        if (i32Var != null) {
            i32Var.c.a = Long.valueOf(currentTimeMillis);
            if (((StorageManager) application.getApplicationContext().getSystemService("storage")) != null && (storageStatsManager = (StorageStatsManager) application.getApplicationContext().getSystemService("storagestats")) != null) {
                try {
                    UUID uuid = StorageManager.UUID_DEFAULT;
                    cju0Var = new cju0(storageStatsManager.getTotalBytes(uuid) / 1.073741824E9d, storageStatsManager.getFreeBytes(uuid) / 1.073741824E9d);
                } catch (IOException e) {
                    Log.e("AppUtils", "Failed to get storage device info", e);
                }
                if (cju0Var != null) {
                    try {
                        i32Var.a("application_startup", kotlin.collections.b.i(new Pair("total_space", String.format("%.2f", Arrays.copyOf(new Object[]{Double.valueOf(cju0Var.a)}, 1))), new Pair("free_space", String.format("%.2f", Arrays.copyOf(new Object[]{Double.valueOf(cju0Var.b)}, 1)))));
                    } catch (IllegalFormatException e2) {
                        ((mb20) i32Var.a).a("AnalyticsDelegate", "Wrong storage device info format", e2);
                    }
                }
            }
            cju0Var = null;
            if (cju0Var != null) {
            }
        }
        Intent intent2 = new Intent(mainActivity, (Class<?>) GoPlatformActivity.class);
        if (data != null) {
            intent2.setData(data);
        }
        mainActivity.startActivity(intent2);
        mainActivity.finish();
        fva0.b(fva0Var, "MainActivity.OnCreate", PerformanceAnalytics$Type.Loading, null, 4);
    }

    @Override // defpackage.o300
    public final void g(MotionEvent motionEvent) {
    }

    @Override // defpackage.xmr0
    public final ttd getSharedComposeContext() {
        lb7 lb7Var = this.w;
        if (lb7Var != null) {
            return (androidx.compose.runtime.c) lb7Var.c;
        }
        return null;
    }

    @Override // defpackage.o300
    public final void h(long j) {
    }

    @Override // defpackage.alj
    public final void handleNewIntent(Intent intent) {
    }

    @Override // defpackage.o300
    public final void i(MainActivity mainActivity, int i, int i2, Intent intent) {
    }

    @Override // defpackage.o300
    public final Context j(Context context) {
        ko21 ko21Var = y5e.e0;
        if (ko21Var == null) {
            ko21Var = null;
        }
        return u5z.a(context, ko21Var.a().a);
    }

    @Override // defpackage.o300
    public final void k(long j) {
    }

    @Override // defpackage.o300
    public final void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
    }

    @Override // defpackage.fl40
    public final el40 sharedMultiClickHandler() {
        return new dl40(0);
    }
}

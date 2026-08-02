package xsna;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.util.SparseArray;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.core.app.NotificationCompat;
import com.unity3d.services.UnityAdsConstants;
import com.vk.ads.di.NewsfeedOptionalAdsComponent;
import com.vk.ads.yandex.api.di.YandexAdFeatureComponent;
import com.vk.bridges.di.BridgeComponent;
import com.vk.cachecontrol.api.CacheComponent;
import com.vk.clips.interests.api.di.ClipsInterestsComponent;
import com.vk.clips.uploader.api.ClipsUploadSdkUploaderComponent;
import com.vk.core.apps.BuildInfo;
import com.vk.core.preference.Preference;
import com.vk.dto.common.id.UserId;
import com.vk.im.engine.di.ImExperimentsComponent;
import com.vk.im.engine.lifecycle.di.ImEngineLifecycleComponent;
import com.vk.im.engine.models.EngineInvalidateSource;
import com.vk.instantjobs.InstantJob;
import com.vk.log.L;
import com.vk.mediastore.storage.ClipsVideoStorage;
import com.vk.ml.MLFeatures;
import com.vk.music.player.service.MusicPlayerAction;
import com.vk.pushes.PushComponent;
import com.vk.superapp.catalog.api.di.AppsCatalogComponent;
import com.vk.toggle.features.ClipsFeatures;
import com.vk.toggle.features.SaFeatures;
import com.vkontakte.android.NetworkStateReceiver;
import com.vkontakte.android.R;
import com.yandex.mobile.ads.nativeads.NativeAdLoader;
import com.yandex.mobile.ads.nativeads.NativeBulkAdLoader;
import io.reactivex.rxjava3.internal.functions.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.Lazy;
import kotlin.LazyThreadSafetyMode;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import me.leolin.shortcutbadger.ShortcutBadgeException;
import receivers.TimeSyncRequestedReceiver;
import ru.mail.libverify.api.VerificationFactory;
import xsna.ui80;
import xsna.z6x;

/* compiled from: DraftFeatureDelegate.kt */
/* loaded from: classes4.dex */
public final class xe8 implements fxb0, rd3, gxp {
    public final Object b;

    public /* synthetic */ xe8(Object obj) {
        this.b = obj;
    }

    @Override // xsna.rd3
    public Object a(ggh0 ggh0Var, Float f, Float f2, izs izsVar, l9k0 l9k0Var) {
        Object a = r9k0.a(ggh0Var, f.floatValue(), s1v.a(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f2.floatValue(), 28), (l7l) this.b, izsVar, l9k0Var);
        return a == CoroutineSingletons.COROUTINE_SUSPENDED ? a : (eq2) a;
    }

    @Override // xsna.fxb0
    public long b(l9x l9xVar, long j, LayoutDirection layoutDirection, long j2) {
        long j3 = ((h9x) ((gzs) this.b).invoke()).a;
        return (k9q0.c(l9xVar.a + ((int) (j3 >> 32)), (int) (j2 >> 32), (int) (j >> 32), layoutDirection == LayoutDirection.Ltr) << 32) | (k9q0.c(l9xVar.b + ((int) (j3 & 4294967295L)), (int) (j2 & 4294967295L), (int) (j & 4294967295L), true) & 4294967295L);
    }

    @Override // xsna.gxp
    public by2 c(Throwable th) {
        return (by2) this.b;
    }

    public void e(String str, String str2, final boolean z) {
        L.p("[CleanStoragesDelegate] >> clean session");
        Context context = e43.a;
        Context context2 = context != null ? context : null;
        k7m k7mVar = (k7m) m7m.f(new phc());
        ClipsInterestsComponent clipsInterestsComponent = (ClipsInterestsComponent) k7mVar.a(fpf0.a(ClipsInterestsComponent.class));
        PushComponent pushComponent = (PushComponent) k7mVar.a(fpf0.a(PushComponent.class));
        SaFeatures saFeatures = SaFeatures.SA_CLEAR_CACHE_ON_SWITCH_ACCOUNT;
        saFeatures.getClass();
        if (com.vk.toggle.b.A.a(saFeatures)) {
            wgn0.a();
        }
        obu0.c(context2);
        r1w N = ((ImEngineLifecycleComponent) k7mVar.a(fpf0.a(ImEngineLifecycleComponent.class))).N();
        boolean i = ((ImExperimentsComponent) k7mVar.a(fpf0.a(ImExperimentsComponent.class))).getExperiments().i();
        boolean z2 = !z;
        N.c(z2);
        if (i) {
            a1w a1wVar = q1w.b;
            if (a1wVar == null) {
                a1wVar = null;
            }
            a1wVar.v(z2);
        }
        if (!z) {
            N.a(null, EngineInvalidateSource.LOGOUT);
        }
        v9v0.b.E();
        int i2 = 0;
        if (c4g0.h != null) {
            synchronized (c4g0.g) {
                try {
                    if (c4g0.h != null) {
                        xxv xxvVar = c4g0.h;
                        if (xxvVar.a) {
                            xxvVar.d.e();
                            xxvVar.e.dispose();
                            xxvVar.a = false;
                            xxvVar.c = null;
                            xxvVar.b.unregisterReceiver(xxvVar.h);
                        }
                        c4g0.h = null;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        rgl rglVar = z6x.a.a;
        if (rglVar == null) {
            rglVar = null;
        }
        ((y6x) rglVar.c()).c(new izs() { // from class: xsna.mhc
            @Override // xsna.izs
            public final Object invoke(Object obj) {
                return Boolean.valueOf(!z || ((InstantJob) obj).x());
            }
        });
        ((vre0) ((Lazy) this.b).getValue()).b();
        j6i.a().c();
        m0r0.a();
        synchronized (g620.D) {
            g620.b = 0;
            g620.f = 0;
            g620.g = 0;
            g620.h = 0;
            g620.i = 0;
            g620.j = 0;
            g620.k = 0;
            g620.l = 0;
            g620.m = 0;
            g620.n = 0;
            g620.o = 0;
            g620.p = 0;
            g620.q = 0;
            g620.r = 0;
            g620.s = 0;
            g620.t = 0;
            g620.v = 0;
            g620.w = 0;
            g620.x = 0;
            g620.z = 0;
        }
        g620.j();
        ClipsVideoStorage.a();
        clipsInterestsComponent.Re().c();
        fxc0.B().s().b(z2);
        fxc0.B().E().clear();
        tib tibVar = ox40.a;
        if (ox40.b().isActive()) {
            tib tibVar2 = ox40.a;
            Context context3 = e43.a;
            if (context3 == null) {
                context3 = null;
            }
            tibVar2.getClass();
            ox40.c(tibVar2.a(context3, MusicPlayerAction.ACTION_LOGOUT, null), false);
        }
        com.vk.movika.sdk.base.model.b bVar = new com.vk.movika.sdk.base.model.b(pushComponent, 16);
        r55 r55Var = r55.a;
        Context context4 = e43.a;
        if (context4 == null) {
            context4 = null;
        }
        nhc nhcVar = new nhc(z, pushComponent, str, f35.a(context4), str2, bVar);
        ca70 ca70Var = ca70.a;
        sv1.C();
        ca70.f(context2).cancelAll();
        x870 x870Var = x870.a;
        int i3 = 3;
        if (gz80.a(26)) {
            List<String> list = z870.a;
            Context context5 = e43.a;
            if (context5 == null) {
                context5 = null;
            }
            ca70.f(context5).deleteNotificationChannel("default_ver2");
            int i4 = com.vk.pushes.a.b;
            Preference.C("notifications_channels_update_pref", "notifications_channels_last_time_update_time");
            Context context6 = e43.a;
            if (context6 == null) {
                context6 = null;
            }
            io.reactivex.rxjava3.internal.operators.observable.m1 a = new jj70(b6m.b(context6)).a(str, str2);
            u00 u00Var = new u00(nhcVar, i3);
            a.l lVar = io.reactivex.rxjava3.internal.functions.a.d;
            int i5 = 7;
            a.E(lVar, lVar, io.reactivex.rxjava3.internal.functions.a.c, u00Var).subscribe(new cx00(new quz(9), i5), new q440(new kdw(i5), 8));
            z4g.d().Q();
        }
        xal c = vwv.c();
        lza0 lza0Var = jw5.c;
        c.E(lza0Var);
        vwv.c().a(lza0Var);
        ((AppsCatalogComponent) k7mVar.mo408a(fpf0.a(AppsCatalogComponent.class))).We();
        com.vk.clips.upload.vk.impl.uploader.c.a.getClass();
        L.e("ClipsController", "clear clips upload cache");
        com.vk.clips.upload.vk.impl.uploader.c.c.clear();
        SparseArray<xdd> sparseArray = com.vk.clips.upload.vk.impl.uploader.c.d;
        int size = sparseArray.size();
        for (int i6 = 0; i6 < size; i6++) {
            xdd valueAt = sparseArray.valueAt(i6);
            com.vk.clips.upload.vk.impl.uploader.c.a.getClass();
            com.vk.clips.upload.vk.impl.uploader.c.a(valueAt, "clips_clear_uploads");
        }
        sparseArray.clear();
        com.vk.clips.upload.vk.impl.uploader.c.f.e();
        pgn pgnVar = com.vk.clips.upload.vk.impl.uploader.c.g;
        qcy<Object> qcyVar = com.vk.clips.upload.vk.impl.uploader.c.b[0];
        pgnVar.b(null);
        asu0.a.getClass();
        asu0.n().submit(new tdf(i2));
        ClipsFeatures clipsFeatures = ClipsFeatures.CLIPS_NEW_UPLOADER;
        clipsFeatures.getClass();
        if (com.vk.toggle.b.A.a(clipsFeatures)) {
            ((ClipsUploadSdkUploaderComponent) k7mVar.a(fpf0.a(ClipsUploadSdkUploaderComponent.class))).Zb().clear();
        }
        SparseArray<brc> sparseArray2 = jrd.b;
        int size2 = sparseArray2.size();
        for (int i7 = 0; i7 < size2; i7++) {
            sparseArray2.valueAt(i7).cancel();
        }
        sparseArray2.clear();
        jrd.c.clear();
        w1n.b.D();
        try {
            VerificationFactory.setLocationUsage(context2, txz.b());
            try {
                VerificationFactory.softSignOut(context2);
            } catch (Throwable unused) {
            }
        } catch (Exception e) {
            L.i(e);
        }
        try {
            vgj0.a(0, context2);
        } catch (ShortcutBadgeException unused2) {
        }
        com.vk.metrics.eventtracking.b.a.g();
        UserId c2 = ((BridgeComponent) k7mVar.a(fpf0.a(BridgeComponent.class))).s().c();
        if (z) {
            com.vk.toggle.b.A.f(String.valueOf(c2.b));
        } else {
            com.vk.toggle.b.y();
        }
        NetworkStateReceiver a2 = NetworkStateReceiver.a();
        a2.c = 0;
        a2.b = false;
        NetworkStateReceiver.h.dispose();
        ro roVar = qni0.r;
        if (roVar != null) {
            roVar.k("stopAutoSync()");
        }
        AlarmManager alarmManager = (AlarmManager) context2.getSystemService(NotificationCompat.CATEGORY_ALARM);
        qni0.a.getClass();
        alarmManager.cancel(PendingIntent.getBroadcast(context2, 0, new Intent(context2, (Class<?>) TimeSyncRequestedReceiver.class), 33554432));
        qni0.s = false;
        ce60.g.set(null);
        yk60 yk60Var = yk60.a;
        yk60.n.set(false);
        yk60.l.set(false);
        io.reactivex.rxjava3.disposables.c andSet = yk60.g.getAndSet(null);
        if (andSet != null) {
            andSet.dispose();
        }
        yk60.c();
        hd60.a().clear();
        ce60.f.clear();
        ce60.h.clear();
        ce60.o.set(true);
        ik60.x.compareAndSet(false, true);
        jk60.x.compareAndSet(false, true);
        hl60 hl60Var = hl60.a;
        hl60.g.clear();
        if (((Boolean) hl60.c.getValue()).booleanValue()) {
            hl60.i.clear();
        }
        NewsfeedOptionalAdsComponent newsfeedOptionalAdsComponent = (NewsfeedOptionalAdsComponent) ((k7m) m7m.f(ce60.b)).mo408a(fpf0.a(NewsfeedOptionalAdsComponent.class));
        newsfeedOptionalAdsComponent.la();
        newsfeedOptionalAdsComponent.Sc();
        e5y0 a3 = ((YandexAdFeatureComponent) k7mVar.a(fpf0.a(YandexAdFeatureComponent.class))).e5().a();
        if (a3 != null) {
            ArrayList arrayList = a3.e;
            ArrayList arrayList2 = a3.d;
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                ((NativeAdLoader) it.next()).cancelLoading();
            }
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                ((NativeBulkAdLoader) it2.next()).cancelLoading();
            }
            arrayList2.clear();
            arrayList.clear();
            a3.g.clear();
            a3.f.clear();
        }
        b68 b68Var = b68.b;
        synchronized (b68.class) {
            b68 b68Var2 = b68.b;
            b68.b();
            h58 e2 = b68.e();
            e2.getClass();
            Preference.C("NavigationUtils", "synced_is_enabled");
            Preference.C("NavigationUtils", "cached_is_enabled");
            Preference.C("NavigationUtils", "cached_source");
            e2.e = null;
            e2.c.e();
            e2.f = 0;
        }
        t6g0 t6g0Var = t6g0.b;
        t6g0.d().v(c2.b, z);
        sq9 sq9Var = f620.e;
        if (sq9Var != null) {
            sq9Var.cancel();
        }
        f620.e = null;
        io.reactivex.rxjava3.disposables.c cVar = f620.c;
        if (cVar != null) {
            cVar.dispose();
        }
        fre0 fre0Var = fre0.b;
        if (!BuildInfo.t() && !BuildInfo.g()) {
            synchronized (fre0Var) {
                fre0.b();
                s3q0 s3q0Var = s3q0.a;
            }
        }
        if (!z) {
            com.vk.ml.b bVar2 = MLFeatures.a;
            MLFeatures.a(false);
            xkg.c.b = false;
        }
        asu0.a.getClass();
        asu0.u().schedule(new ii4(3, str, str2), 100L, TimeUnit.MILLISECONDS);
        gyp0 gyp0Var = ui80.c;
        if (gyp0Var != null) {
            gyp0Var.refreshToken();
        }
        ui80.b bVar3 = ui80.d;
        if (bVar3 != null) {
            bVar3.c.set(true);
        }
        nb3.c.e();
        ce60.e = false;
        fw8 ic = ((CacheComponent) ((k7m) m7m.f(new ohc())).a(fpf0.a(CacheComponent.class))).ic();
        if (z) {
            ic.d();
        } else {
            ic.b();
        }
        L.p("[CleanStoragesDelegate] << clean session");
    }

    public xe8(int i) {
        switch (i) {
            case 2:
                this.b = new dqu();
                break;
            case 3:
            case 4:
            default:
                Context context = e43.a;
                this.b = context == null ? null : context;
                break;
            case 5:
                this.b = msy.a(LazyThreadSafetyMode.NONE, new d4(25));
                break;
            case 6:
                this.b = new by2(R.string.vk_catalog_network_error_description, 14, null);
                break;
        }
    }
}

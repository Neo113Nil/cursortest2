package xsna;

import android.app.Activity;
import android.app.Application;
import android.appwidget.AppWidgetManager;
import android.appwidget.AppWidgetProviderInfo;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import androidx.fragment.app.FragmentActivity;
import com.ironsource.Ya;
import com.unity3d.mediation.rewarded.LevelPlayReward;
import com.vk.instantjobs.InstantJob;
import com.vk.log.L;
import com.vk.photos.ui.editalbum.domain.g;
import com.vk.photos.ui.editalbum.presentation.CreateAlbumFragment;
import com.vk.profile.user.impl.ui.adapter.UserProfileAdapterItem;
import com.vkontakte.android.ShortcutManagerWrapper;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.FunctionReferenceImpl;
import ru.mail.libverify.api.VerificationApi;
import ru.mail.libverify.controls.VerificationController;
import ru.mail.libverify.j.c;
import ru.ok.android.externcalls.sdk.watch_together.internal.listener.WatchTogetherListenerManagerImpl;
import ru.ok.android.externcalls.sdk.watch_together.listener.WatchTogetherListener;
import ru.ok.android.webrtc.protocol.RtcCommandConfig;
import ru.ok.android.webrtc.protocol.impl.commands.RtcCommandExecutorImpl;
import xsna.u6x;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class i6k implements Runnable {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ i6k(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    /* JADX WARN: Type inference failed for: r0v40, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v21, types: [java.lang.Object, kotlin.jvm.internal.FunctionReferenceImpl, xsna.izs] */
    /* JADX WARN: Type inference failed for: r3v16, types: [java.lang.Object, kotlin.Lazy] */
    @Override // java.lang.Runnable
    public final void run() {
        u6x.b bVar;
        u6x.b bVar2;
        u6x.c cVar;
        String str;
        ActivityInfo activityInfo;
        Runnable dhsVar = null;
        int i = 1;
        int i2 = 0;
        switch (this.b) {
            case 0:
                g.k kVar = (g.k) this.c;
                CreateAlbumFragment createAlbumFragment = (CreateAlbumFragment) this.d;
                int i3 = CreateAlbumFragment.Z;
                c63 c63Var = c63.a;
                Activity b = c63.b();
                FragmentActivity fragmentActivity = b instanceof FragmentActivity ? (FragmentActivity) b : null;
                if (fragmentActivity != null) {
                    j7k0 j7k0Var = kVar.a;
                    new j7k0(j7k0Var.a, j7k0Var.b, j7k0Var.c, j7k0Var.d, new j6k(kVar, createAlbumFragment, fragmentActivity, i2), j7k0Var.f).a(fragmentActivity, new l6k(1, createAlbumFragment, CreateAlbumFragment.class, "sendAction", "sendAction(Lcom/vk/mvi/core/data/MviAction;)V", 0)).c();
                    return;
                }
                return;
            case 1:
                u6x u6xVar = (u6x) this.c;
                w6x w6xVar = (w6x) this.d;
                try {
                    synchronized (u6xVar) {
                        bVar = u6xVar.f.get(w6xVar);
                    }
                    if (bVar != null) {
                        bVar.b.await();
                    }
                    synchronized (u6xVar) {
                        bVar2 = u6xVar.f.get(w6xVar);
                    }
                    if (bVar2 == null || (cVar = bVar2.a) == u6x.c.SUCCESS) {
                        return;
                    }
                    InstantJob instantJob = w6xVar.e;
                    Throwable th = bVar2.d;
                    String str2 = bVar2.e;
                    boolean z = bVar2.f;
                    if (cVar != u6x.c.REJECTED) {
                        u6xVar.c.c("unexpected executeState in state '" + bVar2 + "' for job: '" + instantJob + '\'');
                        u6xVar.j(w6xVar, InstantJob.a.c.a);
                        return;
                    }
                    if (z) {
                        u6xVar.h("job successfully interrupted '" + w6xVar.e + '\'');
                        u6xVar.j(w6xVar, InstantJob.a.d.a);
                        return;
                    }
                    if (th != null) {
                        dhsVar = new r0a(u6xVar, w6xVar, th, 4);
                    } else if (str2 != null) {
                        dhsVar = new dhs(u6xVar, w6xVar, str2, i);
                    }
                    if (dhsVar != null) {
                        try {
                            dhsVar.run();
                            u6xVar.j(w6xVar, th != null ? InstantJob.a.c.a : InstantJob.a.C1188a.a);
                            return;
                        } catch (InterruptedException unused) {
                            return;
                        } catch (Throwable unused2) {
                            u6xVar.j(w6xVar, InstantJob.a.c.a);
                            return;
                        }
                    }
                    u6xVar.c.c("unable to detect reject type: inconsistent state '" + bVar2 + "' for job '" + instantJob + '\'');
                    u6xVar.j(w6xVar, InstantJob.a.b.a);
                    return;
                } catch (Throwable th2) {
                    u6xVar.c.d("unexpected error during await of execute complete", th2);
                    u6xVar.j(w6xVar, InstantJob.a.c.a);
                    return;
                }
            case 2:
                v7r0 v7r0Var = (v7r0) this.c;
                Application application = (Application) this.d;
                bny.a.getClass();
                eny enyVar = (eny) bny.h.getValue();
                enyVar.getClass();
                ResolveInfo resolveActivity = application.getPackageManager().resolveActivity((Intent) enyVar.a.getValue(), 65536);
                if (resolveActivity == null || (activityInfo = resolveActivity.activityInfo) == null || (str = activityInfo.packageName) == null) {
                    str = "unknown";
                }
                Boolean valueOf = Boolean.valueOf(ShortcutManagerWrapper.g(application));
                ((bpx0) bny.g.getValue()).getClass();
                AppWidgetManager appWidgetManager = AppWidgetManager.getInstance(application);
                List<AppWidgetProviderInfo> installedProviders = appWidgetManager.getInstalledProviders();
                ArrayList arrayList = new ArrayList();
                for (Object obj : installedProviders) {
                    if (epx.f(((AppWidgetProviderInfo) obj).provider.getPackageName(), application.getPackageName())) {
                        arrayList.add(obj);
                    }
                }
                ArrayList arrayList2 = new ArrayList();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    g5g.y(rl3.s0(appWidgetManager.getAppWidgetIds(((AppWidgetProviderInfo) it.next()).provider)), arrayList2);
                }
                v7r0Var.invoke(str, valueOf, Boolean.valueOf(!arrayList2.isEmpty()));
                return;
            case 3:
                p600 p600Var = (p600) this.c;
                ?? r1 = (FunctionReferenceImpl) this.d;
                if (p600Var.b.add(r1)) {
                    r1.invoke(p600Var.c.getValue(p600Var, p600.e[0]));
                    return;
                }
                return;
            case 4:
                ((RtcCommandExecutorImpl) this.c).a((RtcCommandConfig) this.d);
                return;
            case 5:
                mtq0 mtq0Var = (mtq0) this.c;
                UserProfileAdapterItem.m mVar = (UserProfileAdapterItem.m) this.d;
                mtq0.q6(mtq0Var.z, (String) mtq0Var.u.getValue(), mVar.d);
                mtq0.q6(mtq0Var.A, (String) mtq0Var.v.getValue(), mVar.e);
                return;
            case 6:
                ((VerificationController) this.c).lambda$subscribeSmsNotificationListener$11((VerificationApi.SmsCodeNotificationListener) this.d);
                return;
            case 7:
                xlv0 xlv0Var = (xlv0) this.c;
                pur purVar = (pur) this.d;
                CopyOnWriteArrayList<pur> copyOnWriteArrayList = xlv0Var.l;
                AtomicBoolean atomicBoolean = xlv0Var.f;
                try {
                    if (atomicBoolean.compareAndSet(false, true)) {
                        try {
                            xlv0Var.c();
                            Iterator<pur> it2 = copyOnWriteArrayList.iterator();
                            while (it2.hasNext()) {
                                it2.next().c(purVar);
                            }
                        } catch (InterruptedException unused3) {
                            Thread.currentThread().interrupt();
                            Iterator<pur> it3 = copyOnWriteArrayList.iterator();
                            while (it3.hasNext()) {
                                it3.next().c(purVar);
                            }
                        } catch (Exception e) {
                            L.f("VkStatImpl", "Error flushing events", e);
                            Iterator<tlv0> it4 = xlv0Var.k.iterator();
                            while (it4.hasNext()) {
                                it4.next().a();
                            }
                            Iterator<pur> it5 = copyOnWriteArrayList.iterator();
                            while (it5.hasNext()) {
                                it5.next().c(purVar);
                            }
                        }
                        atomicBoolean.set(false);
                        return;
                    }
                    return;
                } catch (Throwable th3) {
                    Iterator<pur> it6 = copyOnWriteArrayList.iterator();
                    while (it6.hasNext()) {
                        it6.next().c(purVar);
                    }
                    atomicBoolean.set(false);
                    throw th3;
                }
            case 8:
                WatchTogetherListenerManagerImpl.sendActualState$lambda$0((WatchTogetherListenerManagerImpl) this.c, (WatchTogetherListener) this.d);
                return;
            case 9:
                Ya.a((Ya) this.c, (LevelPlayReward) this.d);
                return;
            default:
                c.b.a((ru.mail.libverify.j.c) this.c, (List) this.d);
                return;
        }
    }

    public /* synthetic */ i6k(Application application, com.vkontakte.android.a aVar, v7r0 v7r0Var) {
        this.b = 2;
        this.c = v7r0Var;
        this.d = application;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ i6k(p600 p600Var, izs izsVar) {
        this.b = 3;
        this.c = p600Var;
        this.d = (FunctionReferenceImpl) izsVar;
    }
}

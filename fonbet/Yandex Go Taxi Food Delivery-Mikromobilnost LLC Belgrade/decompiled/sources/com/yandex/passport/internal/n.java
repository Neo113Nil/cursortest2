package com.yandex.passport.internal;

import android.app.ActivityManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.os.Process;
import com.lightside.visum.layouts.LinearLayoutBuilder;
import com.yandex.passport.internal.core.announcing.PackageRemovedReceiver;
import com.yandex.passport.internal.social.GoogleNativeSocialAuthActivity;
import com.yandex.passport.internal.ui.authsdk.BaseState;
import com.yandex.passport.internal.ui.base.BaseBottomSheetDialogFragment;
import com.yandex.passport.internal.ui.browser.SocialBrowserActivity;
import com.yandex.passport.internal.ui.domik.base.BaseDomikFragment;
import com.yandex.passport.internal.ui.social.SocialBindingFragment;
import com.yandex.passport.internal.ui.social.SocialFragment;
import com.yandex.passport.internal.widget.TemporaryErrorView;
import defpackage.cvu0;
import io.appmetrica.analytics.push.impl.H;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.EmptyList;

/* loaded from: classes2.dex */
public final /* synthetic */ class n implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ n(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        List<ActivityManager.RunningAppProcessInfo> list;
        Object obj;
        int i = this.a;
        int i2 = 0;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                Context context = (Context) obj2;
                ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
                if (activityManager == null || (list = activityManager.getRunningAppProcesses()) == null) {
                    list = EmptyList.a;
                }
                Iterator<T> it = list.iterator();
                while (true) {
                    if (it.hasNext()) {
                        obj = it.next();
                        if (cvu0.t(((ActivityManager.RunningAppProcessInfo) obj).processName, context.getPackageName() + ":passport", true)) {
                        }
                    } else {
                        obj = null;
                    }
                }
                ActivityManager.RunningAppProcessInfo runningAppProcessInfo = (ActivityManager.RunningAppProcessInfo) obj;
                int i3 = runningAppProcessInfo != null ? runningAppProcessInfo.pid : 0;
                if (i3 > 0) {
                    Process.killProcess(i3);
                }
                System.exit(0);
                throw new RuntimeException("System.exit returned normally, while it was supposed to halt JVM.");
            case 1:
                throw ((IllegalStateException) obj2);
            case 2:
                PackageRemovedReceiver.lambda$onReceive$0((BroadcastReceiver.PendingResult) obj2);
                return;
            case 3:
                ((GoogleNativeSocialAuthActivity) obj2).startAuthorization();
                return;
            case 4:
                com.yandex.passport.internal.ui.authsdk.l lVar = (com.yandex.passport.internal.ui.authsdk.l) obj2;
                while (true) {
                    lVar.A.m(new com.yandex.passport.internal.ui.authsdk.k(lVar.F.getModernAccount(), i2));
                    BaseState next = lVar.F.next(lVar);
                    if (next == null) {
                        return;
                    } else {
                        lVar.F = next;
                    }
                }
            case 5:
                BaseBottomSheetDialogFragment.onViewCreated$lambda$0((BaseBottomSheetDialogFragment) obj2);
                return;
            case 6:
                ((LinearLayoutBuilder) obj2).setVisibility(0);
                return;
            case 7:
                ((SocialBrowserActivity) obj2).lambda$new$0();
                return;
            case 8:
                ((BaseDomikFragment) obj2).lambda$showFieldError$1();
                return;
            case 9:
                SocialBindingFragment.onCancel$lambda$1((SocialBindingFragment) obj2);
                return;
            case 10:
                SocialFragment.onCancel$lambda$4((SocialFragment) obj2);
                return;
            case 11:
                ((TemporaryErrorView) obj2).hide();
                return;
            default:
                H.a((H) obj2);
                return;
        }
    }
}

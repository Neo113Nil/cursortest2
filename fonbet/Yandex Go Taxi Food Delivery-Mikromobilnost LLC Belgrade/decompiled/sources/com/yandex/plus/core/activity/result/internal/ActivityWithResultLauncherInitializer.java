package com.yandex.plus.core.activity.result.internal;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import androidx.activity.ComponentActivity;
import defpackage.kid0;
import defpackage.ls31;
import defpackage.qoi0;
import defpackage.sls;
import defpackage.xwv;
import defpackage.y8f;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlinx.coroutines.flow.r0;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/plus/core/activity/result/internal/ActivityWithResultLauncherInitializer;", "Lxwv;", "Lcom/yandex/plus/core/activity/result/internal/c;", "<init>", "()V", "plus-core-activity-result-helper_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class ActivityWithResultLauncherInitializer implements xwv {
    @Override // defpackage.xwv
    public final Object create(Context context) {
        final c cVar = c.d;
        Application application = (Application) context.getApplicationContext();
        cVar.a = application;
        application.registerActivityLifecycleCallbacks(new Application.ActivityLifecycleCallbacks() { // from class: com.yandex.plus.core.activity.result.internal.ActivityWithResultLauncherImpl$attachApplication$1
            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityCreated(Activity activity, Bundle savedInstanceState) {
                if (activity instanceof ComponentActivity) {
                    final ComponentActivity componentActivity = (ComponentActivity) activity;
                    ActivityWithResultLauncherImpl$attachApplication$1$onActivityCreated$$inlined$viewModels$default$1 activityWithResultLauncherImpl$attachApplication$1$onActivityCreated$$inlined$viewModels$default$1 = new ActivityWithResultLauncherImpl$attachApplication$1$onActivityCreated$$inlined$viewModels$default$1(componentActivity);
                    d dVar = (d) new ls31(new ActivityWithResultLauncherImpl$attachApplication$1$onActivityCreated$$inlined$viewModels$default$2(componentActivity).$this_viewModels.getViewModelStore(), activityWithResultLauncherImpl$attachApplication$1$onActivityCreated$$inlined$viewModels$default$1.$this_viewModels.getDefaultViewModelProviderFactory(), (y8f) new sls() { // from class: com.yandex.plus.core.activity.result.internal.ActivityWithResultLauncherImpl$attachApplication$1$onActivityCreated$$inlined$viewModels$default$3
                        final /* synthetic */ sls $extrasProducer = null;

                        {
                            super(0);
                        }

                        @Override // defpackage.sls
                        public final Object invoke() {
                            y8f y8fVar;
                            sls slsVar = this.$extrasProducer;
                            return (slsVar == null || (y8fVar = (y8f) slsVar.invoke()) == null) ? ComponentActivity.this.getDefaultViewModelCreationExtras() : y8fVar;
                        }
                    }.invoke()).a(qoi0.a(d.class));
                    c.this.b.add(dVar);
                    ActivityWithResultLauncherImpl$attachApplication$1$onActivityCreated$1 activityWithResultLauncherImpl$attachApplication$1$onActivityCreated$1 = new ActivityWithResultLauncherImpl$attachApplication$1$onActivityCreated$1(1, c.this.b, List.class, "remove", "remove(Ljava/lang/Object;)Z", 8);
                    dVar.x = componentActivity.registerForActivityResult(dVar.A, dVar.B);
                    dVar.y = activityWithResultLauncherImpl$attachApplication$1$onActivityCreated$1;
                    componentActivity.getLifecycle().a(new kid0(dVar));
                }
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityDestroyed(Activity activity) {
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityPaused(Activity activity) {
                Object value;
                r0 r0Var = c.this.c;
                do {
                    value = r0Var.getValue();
                } while (!r0Var.k(value, kotlin.collections.a.j0((List) value, activity)));
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityResumed(Activity activity) {
                Object value;
                r0 r0Var = c.this.c;
                do {
                    value = r0Var.getValue();
                } while (!r0Var.k(value, kotlin.collections.a.o0((List) value, activity)));
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivitySaveInstanceState(Activity activity, Bundle outState) {
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityStarted(Activity activity) {
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityStopped(Activity activity) {
            }
        });
        return cVar;
    }

    @Override // defpackage.xwv
    public final List dependencies() {
        return EmptyList.a;
    }
}

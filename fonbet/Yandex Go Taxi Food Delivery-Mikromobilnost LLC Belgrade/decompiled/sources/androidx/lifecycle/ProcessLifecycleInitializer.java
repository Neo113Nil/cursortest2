package androidx.lifecycle;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import androidx.lifecycle.Lifecycle;
import defpackage.am2;
import defpackage.ny61;
import defpackage.vdy;
import defpackage.xwv;
import java.util.HashSet;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptyList;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/ProcessLifecycleInitializer;", "Lxwv;", "Lpey;", "<init>", "()V", "lifecycle-process"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ProcessLifecycleInitializer implements xwv {
    @Override // defpackage.xwv
    public final Object create(Context context) {
        if (!((HashSet) am2.j(context).b).contains(ProcessLifecycleInitializer.class)) {
            ny61.r("ProcessLifecycleInitializer cannot be initialized lazily.\n               Please ensure that you have:\n               <meta-data\n                   android:name='androidx.lifecycle.ProcessLifecycleInitializer'\n                   android:value='androidx.startup' />\n               under InitializationProvider in your AndroidManifest.xml");
            return null;
        }
        if (!vdy.a.getAndSet(true)) {
            ((Application) context.getApplicationContext()).registerActivityLifecycleCallbacks(new EmptyActivityLifecycleCallbacks() { // from class: androidx.lifecycle.LifecycleDispatcher$DispatcherActivityCallback
                @Override // androidx.lifecycle.EmptyActivityLifecycleCallbacks, android.app.Application.ActivityLifecycleCallbacks
                public void onActivityCreated(Activity activity, Bundle savedInstanceState) {
                    ReportFragment.Companion.getClass();
                    c0.b(activity);
                }
            });
        }
        final y yVar = y.A;
        yVar.getClass();
        yVar.x = new Handler();
        yVar.y.g(Lifecycle.Event.ON_CREATE);
        ((Application) context.getApplicationContext()).registerActivityLifecycleCallbacks(new EmptyActivityLifecycleCallbacks() { // from class: androidx.lifecycle.ProcessLifecycleOwner$attach$1
            @Override // androidx.lifecycle.EmptyActivityLifecycleCallbacks, android.app.Application.ActivityLifecycleCallbacks
            public void onActivityCreated(Activity activity, Bundle savedInstanceState) {
            }

            @Override // androidx.lifecycle.EmptyActivityLifecycleCallbacks, android.app.Application.ActivityLifecycleCallbacks
            public void onActivityPaused(Activity activity) {
                y yVar2 = y.this;
                int i = yVar2.b - 1;
                yVar2.b = i;
                if (i == 0) {
                    yVar2.x.postDelayed(yVar2.z, 700L);
                }
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityPreCreated(Activity activity, Bundle savedInstanceState) {
                final y yVar2 = y.this;
                activity.registerActivityLifecycleCallbacks(new EmptyActivityLifecycleCallbacks() { // from class: androidx.lifecycle.ProcessLifecycleOwner$attach$1$onActivityPreCreated$1
                    @Override // android.app.Application.ActivityLifecycleCallbacks
                    public void onActivityPostResumed(Activity activity2) {
                        y yVar3 = y.this;
                        int i = yVar3.b + 1;
                        yVar3.b = i;
                        if (i == 1) {
                            if (!yVar3.c) {
                                yVar3.x.removeCallbacks(yVar3.z);
                            } else {
                                yVar3.y.g(Lifecycle.Event.ON_RESUME);
                                yVar3.c = false;
                            }
                        }
                    }

                    @Override // android.app.Application.ActivityLifecycleCallbacks
                    public void onActivityPostStarted(Activity activity2) {
                        y yVar3 = y.this;
                        int i = yVar3.a + 1;
                        yVar3.a = i;
                        if (i == 1 && yVar3.w) {
                            yVar3.y.g(Lifecycle.Event.ON_START);
                            yVar3.w = false;
                        }
                    }
                });
            }

            @Override // androidx.lifecycle.EmptyActivityLifecycleCallbacks, android.app.Application.ActivityLifecycleCallbacks
            public void onActivityStopped(Activity activity) {
                y yVar2 = y.this;
                int i = yVar2.a - 1;
                yVar2.a = i;
                if (i == 0 && yVar2.c) {
                    yVar2.y.g(Lifecycle.Event.ON_STOP);
                    yVar2.w = true;
                }
            }
        });
        return yVar;
    }

    @Override // defpackage.xwv
    public final List dependencies() {
        return EmptyList.a;
    }
}

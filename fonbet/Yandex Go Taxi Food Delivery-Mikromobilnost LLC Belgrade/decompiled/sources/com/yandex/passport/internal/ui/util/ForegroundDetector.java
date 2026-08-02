package com.yandex.passport.internal.ui.util;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import com.yandex.passport.internal.util.p;
import defpackage.bvf0;
import defpackage.ffx;
import defpackage.hnr0;
import defpackage.i3y;
import defpackage.jl40;
import defpackage.lz40;
import defpackage.mse;
import defpackage.n4u0;
import defpackage.o400;
import defpackage.ph41;
import defpackage.pz40;
import defpackage.sjh;
import defpackage.sls;
import defpackage.tje;
import defpackage.tse;
import defpackage.uyj;
import defpackage.ycc;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\b\u0001\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\r\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\r\u0010\fJ\u0017\u0010\u000e\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000e\u0010\fJ\u0017\u0010\u000f\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000f\u0010\fJ\u0017\u0010\u0010\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0010\u0010\fR\u001b\u0010\u0016\u001a\u00020\u00118BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R'\u0010\u001c\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00180\u00178BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0019\u0010\u0013\u001a\u0004\b\u001a\u0010\u001bR#\u0010!\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u001d8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001e\u0010\u0013\u001a\u0004\b\u001f\u0010 R#\u0010&\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\"8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b#\u0010\u0013\u001a\u0004\b$\u0010%R!\u0010+\u001a\b\u0012\u0004\u0012\u00020\b0'8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b(\u0010\u0013\u001a\u0004\b)\u0010*R!\u00100\u001a\b\u0012\u0004\u0012\u00020\b0,8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b-\u0010\u0013\u001a\u0004\b.\u0010/R\u0016\u00103\u001a\u0004\u0018\u00010\b8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b1\u00102¨\u00064"}, d2 = {"Lcom/yandex/passport/internal/ui/util/ForegroundDetector;", "Lcom/yandex/passport/internal/ui/util/EmptyActivityLifecycleCallbacks;", "Landroid/content/Context;", "context", "Lmse;", "exceptionHandler", "<init>", "(Landroid/content/Context;Lmse;)V", "Landroid/app/Activity;", "activity", "Lzy11;", "onActivityAppeared", "(Landroid/app/Activity;)V", "onActivityResumed", "onActivityPostResumed", "onActivityPaused", "onActivityDestroyed", "Ltse;", "scope$delegate", "Li3y;", "getScope", "()Ltse;", "scope", "", "Ljava/lang/ref/WeakReference;", "foregroundActivities$delegate", "getForegroundActivities", "()Ljava/util/List;", "foregroundActivities", "Lpz40;", "foregroundActivityMutableFlow$delegate", "getForegroundActivityMutableFlow", "()Lpz40;", "foregroundActivityMutableFlow", "Ln4u0;", "foregroundActivityFlow$delegate", "getForegroundActivityFlow", "()Ln4u0;", "foregroundActivityFlow", "Llz40;", "destroyedActivityMutableFlow$delegate", "getDestroyedActivityMutableFlow", "()Llz40;", "destroyedActivityMutableFlow", "Lhnr0;", "destroyedActivityFlow$delegate", "getDestroyedActivityFlow", "()Lhnr0;", "destroyedActivityFlow", "getForegroundActivity", "()Landroid/app/Activity;", "foregroundActivity", "passport_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class ForegroundDetector extends EmptyActivityLifecycleCallbacks {
    public static final int $stable = 8;

    /* renamed from: destroyedActivityFlow$delegate, reason: from kotlin metadata */
    private final i3y destroyedActivityFlow;

    /* renamed from: destroyedActivityMutableFlow$delegate, reason: from kotlin metadata */
    private final i3y destroyedActivityMutableFlow;

    /* renamed from: foregroundActivities$delegate, reason: from kotlin metadata */
    private final i3y foregroundActivities;

    /* renamed from: foregroundActivityFlow$delegate, reason: from kotlin metadata */
    private final i3y foregroundActivityFlow;

    /* renamed from: foregroundActivityMutableFlow$delegate, reason: from kotlin metadata */
    private final i3y foregroundActivityMutableFlow;

    /* renamed from: scope$delegate, reason: from kotlin metadata */
    private final i3y scope;

    public ForegroundDetector(Context context, mse mseVar) {
        ((Application) context.getApplicationContext()).registerActivityLifecycleCallbacks(this);
        this.scope = kotlin.a.a(new com.yandex.passport.internal.d(9, mseVar));
        this.foregroundActivities = kotlin.a.a(new com.yandex.passport.common.network.a(10));
        final int i = 0;
        this.foregroundActivityMutableFlow = kotlin.a.a(new sls(this) { // from class: com.yandex.passport.internal.ui.util.h
            public final /* synthetic */ ForegroundDetector b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                pz40 foregroundActivityMutableFlow_delegate$lambda$3;
                n4u0 foregroundActivityFlow_delegate$lambda$4;
                hnr0 destroyedActivityFlow_delegate$lambda$6;
                int i2 = i;
                ForegroundDetector foregroundDetector = this.b;
                switch (i2) {
                    case 0:
                        foregroundActivityMutableFlow_delegate$lambda$3 = ForegroundDetector.foregroundActivityMutableFlow_delegate$lambda$3(foregroundDetector);
                        return foregroundActivityMutableFlow_delegate$lambda$3;
                    case 1:
                        foregroundActivityFlow_delegate$lambda$4 = ForegroundDetector.foregroundActivityFlow_delegate$lambda$4(foregroundDetector);
                        return foregroundActivityFlow_delegate$lambda$4;
                    default:
                        destroyedActivityFlow_delegate$lambda$6 = ForegroundDetector.destroyedActivityFlow_delegate$lambda$6(foregroundDetector);
                        return destroyedActivityFlow_delegate$lambda$6;
                }
            }
        });
        final int i2 = 1;
        this.foregroundActivityFlow = kotlin.a.a(new sls(this) { // from class: com.yandex.passport.internal.ui.util.h
            public final /* synthetic */ ForegroundDetector b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                pz40 foregroundActivityMutableFlow_delegate$lambda$3;
                n4u0 foregroundActivityFlow_delegate$lambda$4;
                hnr0 destroyedActivityFlow_delegate$lambda$6;
                int i22 = i2;
                ForegroundDetector foregroundDetector = this.b;
                switch (i22) {
                    case 0:
                        foregroundActivityMutableFlow_delegate$lambda$3 = ForegroundDetector.foregroundActivityMutableFlow_delegate$lambda$3(foregroundDetector);
                        return foregroundActivityMutableFlow_delegate$lambda$3;
                    case 1:
                        foregroundActivityFlow_delegate$lambda$4 = ForegroundDetector.foregroundActivityFlow_delegate$lambda$4(foregroundDetector);
                        return foregroundActivityFlow_delegate$lambda$4;
                    default:
                        destroyedActivityFlow_delegate$lambda$6 = ForegroundDetector.destroyedActivityFlow_delegate$lambda$6(foregroundDetector);
                        return destroyedActivityFlow_delegate$lambda$6;
                }
            }
        });
        this.destroyedActivityMutableFlow = kotlin.a.a(new com.yandex.passport.common.network.a(11));
        final int i3 = 2;
        this.destroyedActivityFlow = kotlin.a.a(new sls(this) { // from class: com.yandex.passport.internal.ui.util.h
            public final /* synthetic */ ForegroundDetector b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                pz40 foregroundActivityMutableFlow_delegate$lambda$3;
                n4u0 foregroundActivityFlow_delegate$lambda$4;
                hnr0 destroyedActivityFlow_delegate$lambda$6;
                int i22 = i3;
                ForegroundDetector foregroundDetector = this.b;
                switch (i22) {
                    case 0:
                        foregroundActivityMutableFlow_delegate$lambda$3 = ForegroundDetector.foregroundActivityMutableFlow_delegate$lambda$3(foregroundDetector);
                        return foregroundActivityMutableFlow_delegate$lambda$3;
                    case 1:
                        foregroundActivityFlow_delegate$lambda$4 = ForegroundDetector.foregroundActivityFlow_delegate$lambda$4(foregroundDetector);
                        return foregroundActivityFlow_delegate$lambda$4;
                    default:
                        destroyedActivityFlow_delegate$lambda$6 = ForegroundDetector.destroyedActivityFlow_delegate$lambda$6(foregroundDetector);
                        return destroyedActivityFlow_delegate$lambda$6;
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final hnr0 destroyedActivityFlow_delegate$lambda$6(ForegroundDetector foregroundDetector) {
        return kotlinx.coroutines.flow.e.c(foregroundDetector.getDestroyedActivityMutableFlow());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final lz40 destroyedActivityMutableFlow_delegate$lambda$5() {
        return ffx.c(0, 0, null, 7);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List foregroundActivities_delegate$lambda$1() {
        return new ArrayList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final n4u0 foregroundActivityFlow_delegate$lambda$4(ForegroundDetector foregroundDetector) {
        return kotlinx.coroutines.flow.e.d(foregroundDetector.getForegroundActivityMutableFlow());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final pz40 foregroundActivityMutableFlow_delegate$lambda$3(ForegroundDetector foregroundDetector) {
        return bvf0.c(foregroundDetector.getForegroundActivity());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final lz40 getDestroyedActivityMutableFlow() {
        return (lz40) this.destroyedActivityMutableFlow.getValue();
    }

    private final List<WeakReference<Activity>> getForegroundActivities() {
        return (List) this.foregroundActivities.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Activity getForegroundActivity() {
        WeakReference<Activity> weakReference;
        List<WeakReference<Activity>> foregroundActivities = getForegroundActivities();
        ListIterator<WeakReference<Activity>> listIterator = foregroundActivities.listIterator(foregroundActivities.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                weakReference = null;
                break;
            }
            weakReference = listIterator.previous();
            if (weakReference.get() != null) {
                break;
            }
        }
        WeakReference<Activity> weakReference2 = weakReference;
        if (weakReference2 != null) {
            return weakReference2.get();
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final pz40 getForegroundActivityMutableFlow() {
        return (pz40) this.foregroundActivityMutableFlow.getValue();
    }

    private final tse getScope() {
        return (tse) this.scope.getValue();
    }

    private final void onActivityAppeared(Activity activity) {
        getForegroundActivities().add(new WeakReference<>(activity));
        tje.N(getScope(), null, null, new ForegroundDetector$onActivityAppeared$1(this, null), 3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean onActivityPaused$lambda$7(Activity activity, WeakReference weakReference) {
        Activity activity2 = (Activity) weakReference.get();
        return activity2 == null || activity2.equals(activity);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final tse scope_delegate$lambda$0(mse mseVar) {
        sjh sjhVar = uyj.a;
        return bvf0.a(o400.a.x.plus(jl40.a()).plus(p.o("ForegroundDetector")).plus(mseVar));
    }

    public final hnr0 getDestroyedActivityFlow() {
        return (hnr0) this.destroyedActivityFlow.getValue();
    }

    public final n4u0 getForegroundActivityFlow() {
        return (n4u0) this.foregroundActivityFlow.getValue();
    }

    @Override // com.yandex.passport.internal.ui.util.EmptyActivityLifecycleCallbacks, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
        tje.N(getScope(), null, null, new ForegroundDetector$onActivityDestroyed$1(this, activity, null), 3);
    }

    @Override // com.yandex.passport.internal.ui.util.EmptyActivityLifecycleCallbacks, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        ycc.w(getForegroundActivities(), new ph41(7, activity), true);
        tje.N(getScope(), null, null, new ForegroundDetector$onActivityPaused$2(this, null), 3);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPostResumed(Activity activity) {
        onActivityAppeared(activity);
    }

    @Override // com.yandex.passport.internal.ui.util.EmptyActivityLifecycleCallbacks, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
    }
}

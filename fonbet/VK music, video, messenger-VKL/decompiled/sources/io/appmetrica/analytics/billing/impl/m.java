package io.appmetrica.analytics.billing.impl;

import android.content.Context;
import io.appmetrica.analytics.billinginterface.internal.BillingType;
import io.appmetrica.analytics.billinginterface.internal.config.BillingConfig;
import io.appmetrica.analytics.billinginterface.internal.monitor.BillingMonitor;
import io.appmetrica.analytics.billinginterface.internal.monitor.DummyBillingMonitor;
import io.appmetrica.analytics.billingv6.internal.BillingLibraryMonitor;
import io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor;
import io.appmetrica.analytics.coreapi.internal.servicecomponents.ServiceModuleReporterComponentContext;
import io.appmetrica.analytics.coreapi.internal.servicecomponents.ServiceModuleReporterComponentLifecycleListener;
import io.appmetrica.analytics.coreapi.internal.servicecomponents.applicationstate.ApplicationState;
import io.appmetrica.analytics.coreapi.internal.servicecomponents.applicationstate.ApplicationStateObserver;
import io.appmetrica.analytics.coreutils.internal.reflection.ReflectionUtils;
import io.appmetrica.analytics.modulesapi.internal.service.ServiceContext;
import java.lang.reflect.Field;
import java.util.concurrent.Executor;
import xsna.brm0;
import xsna.drm0;

/* loaded from: classes8.dex */
public final class m implements ServiceModuleReporterComponentLifecycleListener {
    public final ServiceContext a;
    public B b;
    public BillingMonitor c;

    public m(ServiceContext serviceContext, B b) {
        this.a = serviceContext;
        this.b = b;
    }

    public final void a(B b) {
        BillingConfig billingConfig;
        BillingMonitor billingMonitor = this.c;
        if (billingMonitor != null) {
            if (b != null) {
                A a = b.b;
                billingConfig = new BillingConfig(a.a, a.b);
            } else {
                billingConfig = null;
            }
            billingMonitor.onBillingConfigChanged(billingConfig);
        }
        this.b = b;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0121 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:34:? A[RETURN, SYNTHETIC] */
    @Override // io.appmetrica.analytics.coreapi.internal.servicecomponents.ServiceModuleReporterComponentLifecycleListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onMainReporterCreated(ServiceModuleReporterComponentContext serviceModuleReporterComponentContext) {
        String str;
        BillingMonitor billingLibraryMonitor;
        BillingMonitor billingMonitor;
        Field field;
        if (!serviceModuleReporterComponentContext.getConfig().isRevenueAutoTrackingEnabled()) {
            return;
        }
        Context context = this.a.getContext();
        IHandlerExecutor defaultExecutor = this.a.getExecutorProvider().getDefaultExecutor();
        Executor uiExecutor = this.a.getExecutorProvider().getUiExecutor();
        try {
            Class<?> findClass = ReflectionUtils.findClass("com.android.billingclient.BuildConfig");
            str = (String) ((findClass == null || (field = findClass.getField("VERSION_NAME")) == null) ? null : field.get(null));
        } catch (Throwable unused) {
            str = null;
        }
        BillingType billingType = (str == null || drm0.N(str)) ? BillingType.NONE : brm0.B(str, "2.", false) ? BillingType.NONE : brm0.B(str, "3.", false) ? BillingType.NONE : brm0.B(str, "4.", false) ? BillingType.NONE : brm0.B(str, "5.", false) ? BillingType.LIBRARY_V6 : brm0.B(str, "6.", false) ? BillingType.LIBRARY_V6 : brm0.B(str, "7.", false) ? BillingType.LIBRARY_V6 : brm0.B(str, "8.", false) ? BillingType.LIBRARY_V8 : BillingType.LIBRARY_V8;
        k kVar = new k(this.a.getServiceStorageProvider().createBinaryStateStorageFactory("auto_inapp_collecting_info_data", new e(), new C4681b(null, 1, null)).create(this.a.getContext()));
        j jVar = new j(serviceModuleReporterComponentContext.getReporter(), this.a.getExecutorProvider().getReportRunnableExecutor(), null, 4, null);
        int i = l.a[billingType.ordinal()];
        if (i == 1) {
            billingLibraryMonitor = new BillingLibraryMonitor(context, defaultExecutor, uiExecutor, kVar, jVar, null, null, 96, null);
        } else {
            if (i != 2) {
                billingMonitor = new DummyBillingMonitor();
                this.c = billingMonitor;
                a(this.b);
                if (this.a.getApplicationStateProvider().registerStickyObserver(new ApplicationStateObserver() { // from class: xsna.g5z0
                    @Override // io.appmetrica.analytics.coreapi.internal.servicecomponents.applicationstate.ApplicationStateObserver
                    public final void onApplicationStateChanged(ApplicationState applicationState) {
                        io.appmetrica.analytics.billing.impl.m.a(io.appmetrica.analytics.billing.impl.m.this, applicationState);
                    }
                }) != ApplicationState.VISIBLE) {
                    try {
                        BillingMonitor billingMonitor2 = this.c;
                        if (billingMonitor2 != null) {
                            billingMonitor2.onSessionResumed();
                            return;
                        }
                        return;
                    } catch (Throwable unused2) {
                        return;
                    }
                }
                return;
            }
            billingLibraryMonitor = new io.appmetrica.analytics.billingv8.internal.BillingLibraryMonitor(context, defaultExecutor, uiExecutor, kVar, jVar, null, null, 96, null);
        }
        billingMonitor = billingLibraryMonitor;
        this.c = billingMonitor;
        a(this.b);
        if (this.a.getApplicationStateProvider().registerStickyObserver(new ApplicationStateObserver() { // from class: xsna.g5z0
            @Override // io.appmetrica.analytics.coreapi.internal.servicecomponents.applicationstate.ApplicationStateObserver
            public final void onApplicationStateChanged(ApplicationState applicationState) {
                io.appmetrica.analytics.billing.impl.m.a(io.appmetrica.analytics.billing.impl.m.this, applicationState);
            }
        }) != ApplicationState.VISIBLE) {
        }
    }

    public static final void a(m mVar, ApplicationState applicationState) {
        mVar.getClass();
        if (applicationState == ApplicationState.VISIBLE) {
            try {
                BillingMonitor billingMonitor = mVar.c;
                if (billingMonitor != null) {
                    billingMonitor.onSessionResumed();
                }
            } catch (Throwable unused) {
            }
        }
    }
}

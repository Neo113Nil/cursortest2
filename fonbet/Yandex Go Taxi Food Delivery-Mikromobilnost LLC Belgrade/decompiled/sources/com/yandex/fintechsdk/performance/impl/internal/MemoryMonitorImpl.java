package com.yandex.fintechsdk.performance.impl.internal;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Configuration;
import defpackage.ni10;
import defpackage.oi10;
import defpackage.vi10;
import defpackage.wi10;
import defpackage.xi10;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B#\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\f2\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0019\u0010\u0010R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001aR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001bR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u001cR\u0016\u0010\u001e\u001a\u00020\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0016\u0010\u0016\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010 ¨\u0006!"}, d2 = {"Lcom/yandex/fintechsdk/performance/impl/internal/MemoryMonitorImpl;", "Landroid/content/ComponentCallbacks2;", "Landroid/content/Context;", "context", "Lni10;", "memoryCallback", "Lwi10;", "memorySnapshotProvider", "<init>", "(Landroid/content/Context;Lni10;Lwi10;)V", "Landroid/content/res/Configuration;", "newConfig", "Lzy11;", "onConfigurationChanged", "(Landroid/content/res/Configuration;)V", "onLowMemory", "()V", "", "level", "onTrimMemory", "(I)V", "", "scenario", "start", "(Ljava/lang/String;)V", "stop", "Landroid/content/Context;", "Lni10;", "Lwi10;", "", "isRegistered", "Z", "Ljava/lang/String;", "impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class MemoryMonitorImpl implements ComponentCallbacks2 {
    private final Context context;
    private boolean isRegistered;
    private final ni10 memoryCallback;
    private final wi10 memorySnapshotProvider;
    private String scenario = "";

    public MemoryMonitorImpl(Context context, ni10 ni10Var, wi10 wi10Var) {
        this.context = context;
        this.memoryCallback = ni10Var;
        this.memorySnapshotProvider = wi10Var;
    }

    @Override // android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration newConfig) {
    }

    @Override // android.content.ComponentCallbacks
    public void onLowMemory() {
        try {
            vi10 a = ((xi10) this.memorySnapshotProvider).a();
            ((oi10) this.memoryCallback).a(15, this.scenario, a);
        } catch (Exception unused) {
        }
    }

    @Override // android.content.ComponentCallbacks2
    public void onTrimMemory(int level) {
        try {
            vi10 a = ((xi10) this.memorySnapshotProvider).a();
            ((oi10) this.memoryCallback).a(level, this.scenario, a);
        } catch (Exception unused) {
        }
    }

    public void start(String scenario) {
        if (this.isRegistered) {
            return;
        }
        this.scenario = scenario;
        this.context.registerComponentCallbacks(this);
        this.isRegistered = true;
    }

    public void stop() {
        if (this.isRegistered) {
            this.context.unregisterComponentCallbacks(this);
            this.isRegistered = false;
        }
    }
}

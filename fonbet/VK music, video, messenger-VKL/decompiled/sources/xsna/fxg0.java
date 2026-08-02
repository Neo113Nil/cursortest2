package xsna;

import com.vk.superapp.browser_events.di.BrowserEventsComponent;
import kotlin.Result;

/* compiled from: SDKDependencyGraphHelper.kt */
/* loaded from: classes11.dex */
public final class fxg0 implements gzs<c8m<BrowserEventsComponent, pwj0>> {
    public final /* synthetic */ com.vk.superapp.browser_events.di.a b;

    public fxg0(i7m i7mVar, com.vk.superapp.browser_events.di.a aVar) {
        this.b = aVar;
    }

    @Override // xsna.gzs
    public final c8m<BrowserEventsComponent, pwj0> invoke() {
        Object failure;
        try {
            failure = new BrowserEventsComponent.b();
        } catch (Throwable th) {
            failure = new Result.Failure(th);
        }
        if (failure instanceof Result.Failure) {
            failure = this.b;
        }
        return (c8m) failure;
    }
}

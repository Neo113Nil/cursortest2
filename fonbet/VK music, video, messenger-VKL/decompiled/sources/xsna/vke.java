package xsna;

import android.app.Activity;
import com.ironsource.Ya;
import com.vk.clips.sdk.shared.feed.recycler.adapter.ClipFeedAdapter;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import org.chromium.base.Callback;
import org.chromium.base.supplier.ObservableSupplierImpl;
import xsna.ub9;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes17.dex */
public final /* synthetic */ class vke implements Runnable {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ vke(Object obj, Object obj2, Object obj3, int i) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.b) {
            case 0:
                ((ClipFeedAdapter) this.c).J0((List) this.d, (b8e) this.e);
                break;
            case 1:
                AtomicBoolean atomicBoolean = (AtomicBoolean) this.c;
                ub9.a aVar = (ub9.a) this.d;
                gzs gzsVar = (gzs) this.e;
                if (!atomicBoolean.get()) {
                    try {
                        aVar.b(gzsVar.invoke());
                        break;
                    } catch (Throwable th) {
                        aVar.d(th);
                        return;
                    }
                }
                break;
            case 2:
                ((ObservableSupplierImpl) this.c).lambda$addObserver$0(this.d, (Callback) this.e);
                break;
            default:
                Ya.a((Activity) this.c, (Ya) this.d, (String) this.e);
                break;
        }
    }
}

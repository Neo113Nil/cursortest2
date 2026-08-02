package xsna;

import android.content.Context;
import com.vk.core.fragments.FragmentImpl;
import com.vk.ecomm.cart.impl.checkout.feature.state.FieldKey;
import kotlin.LazyThreadSafetyMode;

/* compiled from: CheckoutInnerRouter.kt */
/* loaded from: classes18.dex */
public final class q5c {
    public final FragmentImpl a;
    public final nz b;
    public final r4c c;
    public FieldKey d;
    public final Object e = msy.a(LazyThreadSafetyMode.NONE, new h9(this, 16));

    public q5c(FragmentImpl fragmentImpl, nz nzVar, r4c r4cVar) {
        this.a = fragmentImpl;
        this.b = nzVar;
        this.c = r4cVar;
        fragmentImpl.getLifecycle().addObserver(new p5c(this));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final Context a() {
        return (Context) this.e.getValue();
    }
}

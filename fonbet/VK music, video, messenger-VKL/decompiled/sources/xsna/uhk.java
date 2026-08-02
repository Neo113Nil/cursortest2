package xsna;

import com.vk.rlottie.RLottieDrawable;
import com.vk.toggle.b;
import java.util.concurrent.Callable;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class uhk implements Callable {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ uhk(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.b) {
            case 0:
                return (RLottieDrawable) this.c;
            case 1:
                return ((jq40) this.c).G().c(o25.a().c());
            default:
                return new b.c(0, ((d0r0) this.c).a.v().b);
        }
    }
}

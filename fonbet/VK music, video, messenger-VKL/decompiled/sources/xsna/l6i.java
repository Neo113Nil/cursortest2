package xsna;

import com.vk.companion.core.CompanionAppImpl;
import kotlin.jvm.internal.Lambda;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class l6i implements Runnable {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ l6i(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [kotlin.jvm.internal.Lambda, xsna.gzs] */
    @Override // java.lang.Runnable
    public final void run() {
        switch (this.b) {
            case 0:
                ((CompanionAppImpl) this.c).a();
                break;
            case 1:
                ((Lambda) this.c).invoke();
                break;
            default:
                ((com.my.tracker.obfuscated.a) this.c).d();
                break;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ l6i(gzs gzsVar) {
        this.b = 1;
        this.c = (Lambda) gzsVar;
    }
}

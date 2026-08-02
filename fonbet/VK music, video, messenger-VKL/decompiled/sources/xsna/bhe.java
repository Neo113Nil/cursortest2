package xsna;

import com.vk.dto.hints.HintId;
import java.util.concurrent.Callable;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class bhe implements Callable {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ bhe(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.b) {
            case 0:
                return ((fhe) this.c).b;
            default:
                return Boolean.valueOf(((ss60) this.c).a.t().b().a(HintId.INFO_BUBBLE_DISABLE_TOP_NEWS.getId()));
        }
    }
}

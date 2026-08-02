package xsna;

import android.os.SystemClock;
import com.vk.stickers.roulette.roulett_view.RouletteView;
import com.vk.toggle.debug.BaseDebugTogglesFragment;
import java.util.concurrent.Callable;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class lc6 implements Callable {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ lc6(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        int i = this.b;
        Object obj = this.c;
        switch (i) {
            case 0:
                int i2 = BaseDebugTogglesFragment.X;
                ((BaseDebugTogglesFragment) obj).eo().a.x();
                return s3q0.a;
            case 1:
                ((tal) obj).c = Long.valueOf(SystemClock.elapsedRealtime());
                return s3q0.a;
            case 2:
                return ((qh4) ((jq40) obj).e.getValue()).E(o25.a().c());
            default:
                int i3 = RouletteView.k;
                return Boolean.valueOf(mcr0.n((String) obj));
        }
    }
}

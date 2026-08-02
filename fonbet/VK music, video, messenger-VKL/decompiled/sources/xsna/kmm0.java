package xsna;

import android.text.TextUtils;
import android.view.WindowManager;
import java.util.concurrent.Callable;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class kmm0 implements Callable {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ kmm0(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.b) {
            case 0:
                String str = (String) this.c;
                return Boolean.valueOf(TextUtils.isEmpty(str) && mcr0.n(str));
            default:
                return yads.ut2.a((WindowManager) this.c);
        }
    }
}

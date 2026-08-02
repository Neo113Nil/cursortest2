package xsna;

import android.os.Handler;
import android.view.View;
import com.vk.rlottie.RLottieDrawable;
import java.lang.ref.WeakReference;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class k5p implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ View c;

    public /* synthetic */ k5p(View view, int i) {
        this.b = i;
        this.c = view;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        int i = this.b;
        View view = this.c;
        switch (i) {
            case 0:
                view.performClick();
                ((etv0) obj).b(false);
                return s3q0.a;
            default:
                WeakReference weakReference = (WeakReference) obj;
                Handler handler = RLottieDrawable.r;
                return Boolean.valueOf(weakReference.get() == view || weakReference.get() == null);
        }
    }
}

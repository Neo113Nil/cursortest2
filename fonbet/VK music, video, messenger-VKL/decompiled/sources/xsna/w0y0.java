package xsna;

import com.vk.core.view.ProgressView;
import com.vkontakte.android.R;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes7.dex */
public final /* synthetic */ class w0y0 implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ w0y0(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        switch (this.b) {
            case 0:
                return (ProgressView) ((y0y0) this.c).a.findViewById(R.id.cancelable_progress);
            default:
                ((jl4) this.c).invoke();
                return Boolean.TRUE;
        }
    }
}

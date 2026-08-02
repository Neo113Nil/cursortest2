package xsna;

import com.vk.newsfeed.common.presentation.newsfeed.ListLoadingState;
import xsna.nrw0;
import xsna.qr60;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class p9p0 implements io.reactivex.rxjava3.functions.f {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ p9p0(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // io.reactivex.rxjava3.functions.f
    public final void accept(Object obj) {
        switch (this.b) {
            case 0:
                ((o9p0) this.c).invoke(obj);
                break;
            case 1:
                ((hcf0) this.c).invoke(obj);
                break;
            case 2:
                ((isq0) this.c).e(new awq0(new qr60.a.e(ListLoadingState.ERROR)));
                com.vk.metrics.eventtracking.b.a.a((Throwable) obj);
                break;
            case 3:
                ((mvl0) this.c).invoke(obj);
                break;
            default:
                ((nrw0.b) this.c).invoke(obj);
                break;
        }
    }
}

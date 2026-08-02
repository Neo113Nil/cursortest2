package xsna;

import android.view.View;
import ru.ok.android.webrtc.features.CallFeature;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class ukt0 implements io.reactivex.rxjava3.functions.e {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ ukt0(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    @Override // io.reactivex.rxjava3.functions.e
    public final void cancel() {
        switch (this.b) {
            case 0:
                View view = (View) this.c;
                view.getViewTreeObserver().removeOnScrollChangedListener((tkt0) this.d);
                break;
            default:
                ((tlp) this.c).c(CallFeature.MOVIE_SHARE, (q6x0) this.d);
                break;
        }
    }
}

package xsna;

import android.view.View;
import android.widget.FrameLayout;
import com.vk.web.view.marker.di.WebViewMarkerComponent;
import com.vkontakte.android.R;
import com.vkontakte.android.fragments.WebViewFragment;
import xsna.r070;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class mz60 implements io.reactivex.rxjava3.functions.f {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ mz60(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    @Override // io.reactivex.rxjava3.functions.f
    public final void accept(Object obj) {
        int i = this.b;
        Object obj2 = this.d;
        Object obj3 = this.c;
        switch (i) {
            case 0:
                oz60 oz60Var = (oz60) obj3;
                r070.j jVar = (r070.j) obj2;
                xwj0 xwj0Var = (xwj0) obj;
                if (!(xwj0Var instanceof wvz)) {
                    if (xwj0Var instanceof bwf0) {
                        oz60Var.t(((bwf0) xwj0Var).a, ((r070.j.b) jVar).b);
                        break;
                    }
                } else {
                    oz60Var.s(((wvz) xwj0Var).a, ((r070.j.b) jVar).b);
                    break;
                }
                break;
            default:
                int i2 = WebViewFragment.O0;
                ((FrameLayout) ((View) obj2).findViewById(R.id.marker_placeholder)).addView(((WebViewMarkerComponent) ((qg90) obj).b).Z().a(((WebViewFragment) obj3).requireContext(), ""));
                break;
        }
    }
}

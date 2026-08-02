package xsna;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.folders.impl.configure.g;
import com.vk.im.ui.fragments.SharedChatsFragment;
import com.vungle.ads.NativeAd;
import java.lang.ref.WeakReference;
import xsna.as30;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class gmp implements View.OnClickListener {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ gmp(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.b;
        Object obj = this.c;
        switch (i) {
            case 0:
                hmp hmpVar = (hmp) obj;
                if (!jjc.b()) {
                    hmpVar.K.m0();
                    break;
                }
                break;
            case 1:
                ((gzs) obj).invoke();
                break;
            case 2:
                ((com.vk.folders.impl.configure.h) obj).a.onNext(g.c.b);
                break;
            case 3:
                elm0 elm0Var = ((quv) obj).x;
                if (elm0Var != null) {
                    elm0Var.finish();
                    break;
                }
                break;
            case 4:
                ((as30.a) obj).a();
                break;
            case 5:
                ((w930) obj).l.t();
                break;
            case 6:
                NativeAd.b((NativeAd) obj, view);
                break;
            case 7:
                ((i3g0) obj).f();
                break;
            case 8:
                int i2 = SharedChatsFragment.V;
                ((SharedChatsFragment) obj).Mf(0, null);
                break;
            case 9:
                RecyclerView recyclerView = (RecyclerView) ((WeakReference) obj).get();
                if (recyclerView != null) {
                    recyclerView.scrollToPosition(0);
                    break;
                }
                break;
            default:
                yads.t1.b((yads.t1) obj, view);
                break;
        }
    }
}

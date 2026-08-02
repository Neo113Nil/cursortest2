package xsna;

import android.media.metrics.NetworkEvent;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;
import com.ironsource.EnumC4650y5;
import com.unity3d.ironsourceads.internal.services.InlineStoreActivity;
import com.unity3d.services.UnityAdsConstants;
import com.vk.clips.sdk.stats.pixels.models.AdStatPixel;
import com.vk.search.fragment.DiscoverSearchFragment;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.function.Consumer;
import org.chromium.base.task.AsyncTask;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes17.dex */
public final /* synthetic */ class si0 implements Runnable {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ si0(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.b) {
            case 0:
                ((ti0) this.c).c.onNext(Collections.singletonList((AdStatPixel) this.d));
                break;
            case 1:
                ((AsyncTask) this.c).lambda$postResult$2(this.d);
                break;
            case 2:
                DiscoverSearchFragment discoverSearchFragment = (DiscoverSearchFragment) this.c;
                discoverSearchFragment.getLifecycle().addObserver((com.vk.search.fragment.a) this.d);
                break;
            case 3:
                ArrayList arrayList = (ArrayList) this.c;
                jxq jxqVar = (jxq) this.d;
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    oc30 oc30Var = (oc30) it.next();
                    nbf0 nbf0Var = jxqVar.h;
                    ArrayList arrayList2 = jxqVar.r;
                    nbf0Var.getClass();
                    RecyclerView.e0 e0Var = oc30Var.a;
                    View view = e0Var.itemView;
                    int i = oc30Var.d - oc30Var.b;
                    int i2 = oc30Var.e - oc30Var.c;
                    if (i != 0) {
                        view.animate().translationX(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                    }
                    if (i2 != 0) {
                        view.animate().translationY(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                    }
                    ViewPropertyAnimator animate = view.animate();
                    arrayList2.add(e0Var);
                    animate.setDuration(jxqVar.l()).setListener(new ahl(jxqVar, e0Var, i, view, i2, animate, arrayList2)).start();
                }
                arrayList.clear();
                jxqVar.o.remove(arrayList);
                break;
            case 4:
                InlineStoreActivity.a((Map) this.c, (EnumC4650y5) this.d);
                break;
            case 5:
                ((Consumer) this.c).accept((jkh0) this.d);
                break;
            case 6:
                ps10 ps10Var = (ps10) this.c;
                ps10Var.e.reportNetworkEvent((NetworkEvent) this.d);
                break;
            default:
                yads.w12.a((yads.w12) this.c, (yads.l4) this.d);
                break;
        }
    }
}

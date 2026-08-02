package xsna;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.util.Property;
import android.view.View;
import android.view.Window;
import androidx.media3.exoplayer.audio.b;
import androidx.recyclerview.widget.RecyclerView;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.view.components.text.VkText;
import com.vk.feed.core.models.news.NewsEntry;
import io.appmetrica.analytics.impl.C5039nd;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.ikv0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes12.dex */
public final /* synthetic */ class ew4 implements Runnable {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ ew4(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.b;
        Object obj = this.d;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                androidx.media3.exoplayer.audio.b bVar = ((b.a) obj2).b;
                String str = y2r0.a;
                bVar.w((qzf) obj);
                break;
            case 1:
                we9 we9Var = (we9) obj2;
                vfq0 vfq0Var = (vfq0) obj;
                vfq0Var.toString();
                we9Var.toString();
                we9Var.b.c(vfq0Var.e() + vfq0Var.hashCode());
                we9Var.y();
                break;
            case 2:
                ArrayList arrayList = (ArrayList) obj2;
                wka wkaVar = (wka) obj;
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    hla hlaVar = (hla) it.next();
                    wkaVar.t.add(hlaVar);
                    long j = wkaVar.c;
                    fla flaVar = hlaVar.p;
                    VkText vkText = flaVar.b;
                    Property property = View.ALPHA;
                    ObjectAnimator ofFloat = ObjectAnimator.ofFloat(vkText, (Property<VkText, Float>) property, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f);
                    ofFloat.setDuration(j);
                    ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(vkText, (Property<VkText, Float>) View.SCALE_X, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f);
                    ofFloat2.setDuration(j);
                    ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(vkText, (Property<VkText, Float>) View.SCALE_Y, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f);
                    ofFloat3.setDuration(j);
                    ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(flaVar.c, (Property<VkText, Float>) property, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f);
                    ofFloat4.setDuration(j);
                    AnimatorSet animatorSet = new AnimatorSet();
                    animatorSet.playTogether(ofFloat, ofFloat2, ofFloat3, ofFloat4);
                    animatorSet.setInterpolator(wka.B);
                    animatorSet.addListener(new xka(hlaVar, wkaVar));
                    animatorSet.start();
                }
                arrayList.clear();
                wkaVar.q.remove(arrayList);
                break;
            case 3:
                NewsEntry newsEntry = (NewsEntry) obj;
                Iterator<T> it2 = ((com.vk.ads.core.a) obj2).a.iterator();
                while (it2.hasNext()) {
                    ((kuc0) it2.next()).a(newsEntry);
                }
                break;
            case 4:
                RecyclerView.e0 e0Var = (RecyclerView.e0) obj;
                Iterator<zjf0<ol60>> it3 = ((ci60) obj2).c.iterator();
                while (it3.hasNext()) {
                    it3.next().e(e0Var);
                }
                break;
            case 5:
                ((ikv0.a) obj2).p((Window) obj);
                break;
            case 6:
                C5039nd.a((C5039nd) obj2, (List) obj);
                break;
            default:
                yads.ve.a((yads.ve) obj2, (yads.bg) obj);
                break;
        }
    }
}

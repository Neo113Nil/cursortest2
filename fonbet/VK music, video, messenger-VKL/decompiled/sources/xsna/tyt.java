package xsna;

import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.vk.dto.common.data.VKList;
import com.vk.dto.stories.model.GifItem;
import com.vk.toggle.features.ContentFeatures;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.collections.EmptyList;

/* compiled from: GifInteractorImpl.kt */
/* loaded from: classes2.dex */
public final class tyt implements syt {
    public final xyt a;

    public tyt(xyt xytVar) {
        this.a = xytVar;
    }

    @Override // xsna.syt
    public final io.reactivex.rxjava3.core.a a() {
        return new io.reactivex.rxjava3.internal.operators.completable.m(new vyt(this.a, 0));
    }

    @Override // xsna.syt
    public final io.reactivex.rxjava3.core.q<List<GifItem>> b() {
        final xyt xytVar = this.a;
        return new io.reactivex.rxjava3.internal.operators.observable.s0(new Callable() { // from class: xsna.wyt
            @Override // java.util.concurrent.Callable
            public final Object call() {
                List<j9f0> all = ((k9f0) xyt.this.a).getAll();
                ArrayList arrayList = new ArrayList(c5g.u(all, 10));
                for (j9f0 j9f0Var : all) {
                    arrayList.add(new GifItem(j9f0Var.a, j9f0Var.b, j9f0Var.c));
                }
                return arrayList;
            }
        });
    }

    @Override // xsna.syt
    public final io.reactivex.rxjava3.core.a c(GifItem gifItem) {
        return new io.reactivex.rxjava3.internal.operators.completable.m(new f8f(1, this.a, gifItem));
    }

    @Override // xsna.syt
    public final io.reactivex.rxjava3.core.q e(int i, String str, String str2) {
        ContentFeatures contentFeatures = ContentFeatures.STORY_GIF;
        contentFeatures.getClass();
        if (!com.vk.toggle.b.A.a(contentFeatures)) {
            return io.reactivex.rxjava3.core.q.T(new VKList(EmptyList.b));
        }
        xyt xytVar = this.a;
        avl0 avl0Var = (avl0) xytVar.b;
        Integer valueOf = Integer.valueOf(i);
        avl0Var.getClass();
        tfx tfxVar = new tfx("stories.searchGif", new jh(26), new qq(24));
        if (str != null) {
            tfx.o(tfxVar, CampaignEx.JSON_KEY_AD_Q, str, 0, 0, 12);
        }
        if (str2 != null) {
            tfx.o(tfxVar, "start_from", str2, 0, 0, 12);
        }
        tfxVar.f(valueOf.intValue(), 8, 50, "count");
        return rsg0.T(yfb.x(tfxVar)).U(new y7(new o1g((nul0) xytVar.c, 4), 23));
    }
}

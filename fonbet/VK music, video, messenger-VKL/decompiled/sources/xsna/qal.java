package xsna;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.dto.common.data.ApiApplication;
import com.vk.dto.discover.carousel.apps.AppCarousel;
import com.vk.dto.discover.carousel.apps.AppCarouselItem;
import com.vk.feed.core.models.news.NewsEntry;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.collections.builders.ListBuilder;
import xsna.bwy;
import xsna.ee3;

/* compiled from: DefaultAppsCarouselHolder.kt */
/* loaded from: classes4.dex */
public final class qal extends vu9<AppCarousel> {
    public static final bpn0 L = new bpn0(new com.vk.movika.sdk.base.model.props.d(18));
    public final Object J;
    public final nbf0 K;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qal(ViewGroup viewGroup, h170 h170Var, Lazy lazy) {
        super(viewGroup, R.layout.discover_carousel_holder, new ee3(h170Var));
        viewGroup.getContext();
        this.J = lazy;
        RecyclerView.Adapter<?> adapter = this.C;
        ee3 ee3Var = adapter instanceof ee3 ? (ee3) adapter : null;
        if (ee3Var != null) {
            ee3Var.d = new t1e(this, 12);
            ee3Var.e = new wqf(this, 10);
        }
        nbf0 nbf0Var = new nbf0();
        this.K = nbf0Var;
        this.F.setItemAnimator(new jxq(nbf0Var));
    }

    public static void T6(ApiApplication apiApplication) {
        if (apiApplication == null) {
            return;
        }
        int i = (int) apiApplication.b.b;
        String str = apiApplication.B;
        ufx ufxVar = new ufx("apps.addAppToFeedBlackList", new lr(4), new pn(3));
        ufx.k(ufxVar, "app_id", i, 0, 12);
        if (str != null) {
            ufx.n(ufxVar, "track_code", str, 0, 12);
        }
        yfb.x(ufxVar).p();
    }

    @Override // xsna.qi6
    public final void E6(NewsEntry newsEntry) {
        ee3 ee3Var;
        AppCarousel appCarousel = (AppCarousel) newsEntry;
        R6(appCarousel);
        boolean z = appCarousel.e;
        RecyclerView.Adapter<?> adapter = this.C;
        if (z && (!epx.f(appCarousel.f, bwy.b.a) || appCarousel.o.isEmpty())) {
            ee3Var = adapter instanceof ee3 ? (ee3) adapter : null;
            if (ee3Var != null) {
                ee3Var.submitList((List) L.getValue());
                return;
            }
            return;
        }
        ee3Var = adapter instanceof ee3 ? (ee3) adapter : null;
        if (ee3Var != null) {
            ListBuilder e = e43.e();
            List<AppCarouselItem> list = appCarousel.o;
            ArrayList arrayList = new ArrayList(c5g.u(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(new ee3.b.a((AppCarouselItem) it.next()));
            }
            e.addAll(arrayList);
            e.add(ee3.b.C2798b.a);
            ee3Var.submitList(e.g());
        }
    }
}

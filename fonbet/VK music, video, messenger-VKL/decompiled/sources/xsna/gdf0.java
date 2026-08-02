package xsna;

import android.content.Context;
import com.vk.dto.discover.carousel.apps.AppCarousel;
import com.vk.dto.discover.carousel.apps.AppCarouselItem;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.builders.ListBuilder;
import xsna.bwy;
import xsna.gp20;

/* compiled from: RecommendedGamesCarouselTransformer.kt */
/* loaded from: classes4.dex */
public final class gdf0 implements gn60<AppCarousel, wm60> {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [kotlin.collections.builders.ListBuilder] */
    /* JADX WARN: Type inference failed for: r2v10, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v7, types: [java.util.AbstractList] */
    public final List a(AppCarousel appCarousel) {
        ?? g;
        if (!appCarousel.e || (epx.f(appCarousel.f, bwy.b.a) && !appCarousel.o.isEmpty())) {
            ListBuilder e = e43.e();
            try {
                List<AppCarouselItem> list = appCarousel.o;
                ArrayList arrayList = new ArrayList(c5g.u(list, 10));
                for (AppCarouselItem appCarouselItem : list) {
                    Context context = e43.a;
                    if (context == null) {
                        context = null;
                    }
                    arrayList.add(new gp20.a(appCarouselItem, rq20.a(context, appCarouselItem)));
                }
                e.addAll(arrayList);
            } catch (Throwable th) {
                com.vk.metrics.eventtracking.b.a.a(th);
            }
            e.add(gp20.b.a);
            g = e.g();
        } else {
            k9x k9xVar = new k9x(1, 10, 1);
            g = new ArrayList(c5g.u(k9xVar, 10));
            j9x it = k9xVar.iterator();
            while (it.d) {
                it.nextInt();
                g.add(gp20.c.a);
            }
        }
        return Collections.singletonList(new vq20(g, appCarousel));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.gn60
    public final /* bridge */ /* synthetic */ List x(Pair pair, bp5 bp5Var) {
        return a((AppCarousel) pair);
    }
}

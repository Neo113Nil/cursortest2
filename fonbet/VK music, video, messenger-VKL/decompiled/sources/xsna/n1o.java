package xsna;

import android.view.ViewGroup;
import com.unity3d.services.UnityAdsConstants;
import com.vk.donut.price.model.template.DonutPriceTemplate;
import com.vk.dto.common.Image;
import com.vk.feed.core.models.news.NewsEntry;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.LazyThreadSafetyMode;
import xsna.l1o;
import xsna.o1o;

/* compiled from: DonutPostHorizontalGalleryHolder.kt */
/* loaded from: classes4.dex */
public final class n1o extends rp6<zzn, NewsEntry> {
    public final l1o E;
    public u1c0 F;
    public final Object G;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public n1o(ViewGroup viewGroup) {
        super(r1, viewGroup);
        l1o l1oVar = new l1o(viewGroup.getContext());
        l1oVar.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        l1o l1oVar2 = (l1o) this.itemView;
        this.E = l1oVar2;
        this.G = msy.a(LazyThreadSafetyMode.NONE, new lg(12));
        l1oVar2.setOnItemClick(new m1o(this, 0));
        l1oVar2.setOnPageChanged(new j6e(this, 20));
    }

    @Override // xsna.rp6
    public final void R6(zzn zznVar) {
        o1o.a aVar;
        float f;
        zzn zznVar2 = zznVar;
        ArrayList arrayList = zznVar2.h;
        ArrayList arrayList2 = new ArrayList(c5g.u(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (true) {
            String str = null;
            if (!it.hasNext()) {
                break;
            }
            Image image = (Image) it.next();
            fxj0 o = ixj0.o(image.b);
            if (o != null) {
                str = o.getUrl();
            }
            arrayList2.add(new l1o.a(str, new uxb(image, 3)));
        }
        l1o l1oVar = this.E;
        l1oVar.setImageUrls(arrayList2);
        l1oVar.setPlaceholderDescription(zznVar2.i);
        CharSequence charSequence = zznVar2.j;
        if (charSequence != null) {
            DonutPriceTemplate donutPriceTemplate = zznVar2.k;
            if (donutPriceTemplate != null) {
                charSequence = y1o.b(donutPriceTemplate, this.itemView.getContext());
            }
            aVar = new o1o.a(charSequence, new dy0(11, this, zznVar2));
        } else {
            aVar = null;
        }
        l1oVar.setPlaceholderButton(aVar);
        Float f2 = zznVar2.m;
        if (f2 != null) {
            Float f3 = f2.floatValue() != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? f2 : null;
            if (f3 != null) {
                f = f3.floatValue();
                if (f > 1.8f) {
                    f = 1.8f;
                }
                l1oVar.setRatio(f);
            }
        }
        f = 1.0f;
        l1oVar.setRatio(f);
    }

    @Override // xsna.rp6, xsna.qi6
    public final void a6(u1c0 u1c0Var) {
        this.F = u1c0Var;
        if (u1c0Var.f == -1) {
            u1c0Var.f = 0;
        }
        this.E.setCurrentPage(u1c0Var.f);
        super.a6(u1c0Var);
    }
}

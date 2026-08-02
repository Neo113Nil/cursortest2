package xsna;

import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.unity3d.services.UnityAdsConstants;
import com.vk.clips.design.view.component.ads.ClipMarketCardView;
import com.vk.clips.sdk.models.SdkImages;
import com.vk.core.ui.image.VKImageController;
import com.vk.core.view.components.text.VkText;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* compiled from: MarketAdsAdapter.kt */
/* loaded from: classes17.dex */
public final class to00 extends RecyclerView.Adapter<oo00> {
    public final bcr0<ImageView> c;
    public final q7d d;
    public final dg1 e;
    public final ArrayList f;
    public boolean g;

    /* JADX WARN: Multi-variable type inference failed */
    public to00(bcr0<? extends ImageView> bcr0Var, q7d q7dVar, dg1 dg1Var) {
        this.c = bcr0Var;
        this.d = q7dVar;
        this.e = dg1Var;
        setHasStableIds(true);
        this.f = new ArrayList();
        this.g = true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return this.f.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final long getItemId(int i) {
        Long n = arm0.n(((cle) this.f.get(i)).a);
        if (n != null) {
            return n.longValue();
        }
        return -1L;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(oo00 oo00Var, int i) {
        String str;
        String str2;
        boolean z;
        oo00 oo00Var2 = oo00Var;
        cle cleVar = (cle) this.f.get(i);
        boolean z2 = this.g;
        String str3 = cleVar.e;
        oo00Var2.n = cleVar;
        ClipMarketCardView clipMarketCardView = (ClipMarketCardView) oo00Var2.itemView;
        clipMarketCardView.setImageSize(this.d.a);
        String str4 = cleVar.b;
        boolean z3 = true;
        if (str4 == null || str4.length() == 0) {
            str = cleVar.f;
            str2 = null;
            z = true;
        } else {
            str2 = cleVar.c;
            str = str3;
            str3 = str4;
            z = false;
        }
        VkText vkText = clipMarketCardView.v;
        if (str3 != null && str3.length() != 0) {
            z3 = false;
        }
        clipMarketCardView.w.setVisibility(z3 ? 8 : 0);
        vkText.setVisibility(z3 ? 8 : 0);
        vkText.setText(str3);
        vkText.setHorizontalFadingEdgeEnabled(z);
        clipMarketCardView.setOldPrice(str2);
        VkText vkText2 = clipMarketCardView.x;
        vkText2.setText(str);
        if (myc0.f(str)) {
            vkText2.setVisibility(0);
        } else if (z2) {
            vkText2.setVisibility(4);
        } else {
            f4m.j(vkText2);
        }
        clipMarketCardView.setBadgeText(cleVar.d);
        clipMarketCardView.setButtonText(cleVar.k);
        clipMarketCardView.setViewControllerFactory(oo00Var2.l);
        SdkImages sdkImages = cleVar.g;
        String a = sdkImages != null ? sdkImages.a(clipMarketCardView.getImageSize().h()) : null;
        VKImageController<? extends ImageView> vKImageController = clipMarketCardView.z;
        if (vKImageController != null) {
            vKImageController.f(a, new VKImageController.b(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, new VKImageController.c(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, iah0.b(2.0f), iah0.b(2.0f)), false, 0, null, null, null, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0, null, null, null, 65533));
        }
        clipMarketCardView.setOnCardClickAction(new t9b(9, oo00Var2, cleVar));
        clipMarketCardView.setOnButtonClickAction(new mp3(17, oo00Var2, cleVar));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final oo00 onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new oo00(this.c, this.e, this.d.a, viewGroup);
    }

    public final void setItems(List<cle> list) {
        ArrayList arrayList = this.f;
        arrayList.clear();
        arrayList.addAll(list);
        List<cle> list2 = list;
        boolean z = false;
        if (!(list2 instanceof Collection) || !list2.isEmpty()) {
            for (cle cleVar : list2) {
                String str = cleVar.b;
                if (((str == null || str.length() == 0) && myc0.f(cleVar.f)) || (myc0.f(cleVar.b) && myc0.f(cleVar.e))) {
                    z = true;
                    break;
                }
            }
        }
        this.g = z;
        notifyDataSetChanged();
    }
}

package sg.bigo.ads.n;

import android.graphics.Rect;
import android.view.View;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.List;
import sg.bigo.ads.R;
import sg.bigo.ads.api.NativeAd;

/* loaded from: classes9.dex */
public final class i extends d {
    public i(@NonNull sg.bigo.ads.p.a aVar, @NonNull List<NativeAd> list, @NonNull sg.bigo.ads.o.b bVar) {
        super(aVar, list, bVar);
        this.f = true;
    }

    @Override // sg.bigo.ads.n.d
    @Nullable
    public final List<View> a(@NonNull a aVar) {
        int size = this.b.size();
        if (size == 0) {
            return new ArrayList();
        }
        if (size == 1) {
            View a = sg.bigo.ads.common.utils.a.a(this.d, R.layout.bigo_ad_layout_interstitial_icon_item_cta_des_style2, this.a, false);
            c();
            this.a.setOrientation(0);
            ArrayList arrayList = new ArrayList();
            arrayList.add(a);
            a(12, 0, 12, 12);
            this.a.addView(a, new LinearLayout.LayoutParams(-1, sg.bigo.ads.common.utils.f.a(this.d, 60)));
            return arrayList;
        }
        if (size == 2) {
            View a2 = sg.bigo.ads.common.utils.a.a(this.d, R.layout.bigo_ad_layout_interstitial_icon_item_cta_des_style2, this.a, false);
            View a3 = sg.bigo.ads.common.utils.a.a(this.d, R.layout.bigo_ad_layout_interstitial_icon_item_cta_des_style2, this.a, false);
            this.a.setOrientation(1);
            ArrayList arrayList2 = new ArrayList();
            int a4 = sg.bigo.ads.common.utils.f.a(this.d, 60);
            LinearLayout linearLayout = new LinearLayout(this.d);
            linearLayout.setOrientation(0);
            a(linearLayout);
            b(linearLayout);
            this.a.addView(linearLayout, new LinearLayout.LayoutParams(-1, -2));
            linearLayout.addView(a2, new LinearLayout.LayoutParams(-1, a4));
            arrayList2.add(linearLayout);
            LinearLayout linearLayout2 = new LinearLayout(this.d);
            linearLayout2.setOrientation(0);
            a(linearLayout2);
            b(linearLayout2);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
            layoutParams.topMargin = sg.bigo.ads.common.utils.f.a(this.d, 8);
            this.a.addView(linearLayout2, layoutParams);
            linearLayout2.addView(a3, new LinearLayout.LayoutParams(-1, a4));
            arrayList2.add(linearLayout2);
            return arrayList2;
        }
        View a5 = sg.bigo.ads.common.utils.a.a(this.d, R.layout.bigo_ad_layout_interstitial_icon_item_cta_des_style2, this.a, false);
        View a6 = sg.bigo.ads.common.utils.a.a(this.d, R.layout.bigo_ad_layout_interstitial_icon_item_cta_des_style2, this.a, false);
        View a7 = sg.bigo.ads.common.utils.a.a(this.d, R.layout.bigo_ad_layout_interstitial_icon_item_cta_des_style2, this.a, false);
        this.a.setOrientation(1);
        ArrayList arrayList3 = new ArrayList();
        int a8 = sg.bigo.ads.common.utils.f.a(this.d, 60);
        LinearLayout linearLayout3 = new LinearLayout(this.d);
        linearLayout3.setOrientation(0);
        a(linearLayout3);
        b(linearLayout3);
        this.a.addView(linearLayout3, new LinearLayout.LayoutParams(-1, -2));
        linearLayout3.addView(a5, new LinearLayout.LayoutParams(-1, a8));
        arrayList3.add(linearLayout3);
        LinearLayout linearLayout4 = new LinearLayout(this.d);
        linearLayout4.setOrientation(0);
        a(linearLayout4);
        b(linearLayout4);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams2.topMargin = sg.bigo.ads.common.utils.f.a(this.d, 8);
        layoutParams2.bottomMargin = sg.bigo.ads.common.utils.f.a(this.d, 8);
        this.a.addView(linearLayout4, layoutParams2);
        linearLayout4.addView(a6, new LinearLayout.LayoutParams(-1, a8));
        arrayList3.add(linearLayout4);
        LinearLayout linearLayout5 = new LinearLayout(this.d);
        linearLayout5.setOrientation(0);
        a(linearLayout5);
        b(linearLayout5);
        this.a.addView(linearLayout5, new LinearLayout.LayoutParams(-1, -2));
        linearLayout5.addView(a7, new LinearLayout.LayoutParams(-1, a8));
        arrayList3.add(linearLayout5);
        return arrayList3;
    }

    @Override // sg.bigo.ads.n.d
    public final b a() {
        float a = sg.bigo.ads.common.utils.f.a(this.d, 8);
        return new b(a, a, a, a, new Rect(0, sg.bigo.ads.common.utils.f.a(this.d, 10), 0, 0), this.h, null, this.g);
    }
}

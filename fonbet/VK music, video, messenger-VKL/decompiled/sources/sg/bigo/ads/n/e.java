package sg.bigo.ads.n;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.Space;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.List;
import sg.bigo.ads.R;
import sg.bigo.ads.api.NativeAd;
import xsna.s3j0;

/* loaded from: classes9.dex */
public class e extends d {
    public e(@NonNull sg.bigo.ads.p.a aVar, @NonNull List<NativeAd> list, @NonNull sg.bigo.ads.o.b bVar) {
        super(aVar, list, bVar);
    }

    @Override // sg.bigo.ads.n.d
    @Nullable
    public List<View> a(@NonNull a aVar) {
        c();
        this.a.setOrientation(0);
        int size = this.b.size();
        if (size == 0) {
            return new ArrayList();
        }
        if (size == 1) {
            this.f = true;
            View a = sg.bigo.ads.common.utils.a.a(this.d, R.layout.bigo_ad_layout_interstitial_icon_item_cta_des_style1, this.a, false);
            ArrayList arrayList = new ArrayList();
            arrayList.add(a);
            a(16, 10, 16, 14);
            this.a.addView(a, new LinearLayout.LayoutParams(-1, sg.bigo.ads.common.utils.f.a(this.d, 60)));
            return arrayList;
        }
        if (size == 2) {
            View a2 = sg.bigo.ads.common.utils.a.a(this.d, R.layout.bigo_ad_layout_interstitial_icon_item_cta_style1, this.a, false);
            View a3 = sg.bigo.ads.common.utils.a.a(this.d, R.layout.bigo_ad_layout_interstitial_icon_item_cta_style1, this.a, false);
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(a2);
            arrayList2.add(a3);
            a(16, 12, 16, 12);
            int a4 = sg.bigo.ads.common.utils.f.a(this.d, 60);
            this.a.addView(a2, new LinearLayout.LayoutParams(0, a4, 1.0f));
            this.a.addView(new Space(this.d), new LinearLayout.LayoutParams(sg.bigo.ads.common.utils.f.a(this.d, 15), a4));
            this.a.addView(a3, new LinearLayout.LayoutParams(0, a4, 1.0f));
            return arrayList2;
        }
        if (size == 3) {
            View a5 = sg.bigo.ads.common.utils.a.a(this.d, R.layout.bigo_ad_layout_interstitial_icon_item_style, this.a, false);
            View a6 = sg.bigo.ads.common.utils.a.a(this.d, R.layout.bigo_ad_layout_interstitial_icon_item_style, this.a, false);
            View a7 = sg.bigo.ads.common.utils.a.a(this.d, R.layout.bigo_ad_layout_interstitial_icon_item_style, this.a, false);
            ArrayList arrayList3 = new ArrayList();
            arrayList3.add(a5);
            arrayList3.add(a6);
            arrayList3.add(a7);
            a(0, 12, 0, 8);
            int a8 = sg.bigo.ads.common.utils.f.a(this.d, 72);
            s3j0.c(0, 60, 1.0f, this.a, new Space(this.d));
            this.a.addView(a5, new LinearLayout.LayoutParams(a8, -2));
            s3j0.c(0, 60, 1.0f, this.a, new Space(this.d));
            this.a.addView(a6, new LinearLayout.LayoutParams(a8, -2));
            s3j0.c(0, 60, 1.0f, this.a, new Space(this.d));
            this.a.addView(a7, new LinearLayout.LayoutParams(a8, -2));
            s3j0.c(0, 60, 1.0f, this.a, new Space(this.d));
            return arrayList3;
        }
        View a9 = sg.bigo.ads.common.utils.a.a(this.d, R.layout.bigo_ad_layout_interstitial_icon_item_style, this.a, false);
        View a10 = sg.bigo.ads.common.utils.a.a(this.d, R.layout.bigo_ad_layout_interstitial_icon_item_style, this.a, false);
        View a11 = sg.bigo.ads.common.utils.a.a(this.d, R.layout.bigo_ad_layout_interstitial_icon_item_style, this.a, false);
        View a12 = sg.bigo.ads.common.utils.a.a(this.d, R.layout.bigo_ad_layout_interstitial_icon_item_style, this.a, false);
        ArrayList arrayList4 = new ArrayList();
        arrayList4.add(a9);
        arrayList4.add(a10);
        arrayList4.add(a11);
        arrayList4.add(a12);
        a(0, 12, 0, 8);
        int a13 = sg.bigo.ads.common.utils.f.a(this.d, 72);
        s3j0.c(0, 60, 1.0f, this.a, new Space(this.d));
        this.a.addView(a9, new LinearLayout.LayoutParams(a13, -2));
        s3j0.c(0, 60, 1.0f, this.a, new Space(this.d));
        this.a.addView(a10, new LinearLayout.LayoutParams(a13, -2));
        s3j0.c(0, 60, 1.0f, this.a, new Space(this.d));
        this.a.addView(a11, new LinearLayout.LayoutParams(a13, -2));
        s3j0.c(0, 60, 1.0f, this.a, new Space(this.d));
        this.a.addView(a12, new LinearLayout.LayoutParams(a13, -2));
        s3j0.c(0, 60, 1.0f, this.a, new Space(this.d));
        return arrayList4;
    }

    @Override // sg.bigo.ads.n.d
    public final b a() {
        return new b(sg.bigo.ads.common.utils.f.a(this.d, 8), this.h, this.g);
    }
}

package sg.bigo.ads.n;

import android.graphics.Rect;
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
public final class j extends d {
    public final int i;

    @NonNull
    private final b j;

    public j(@NonNull sg.bigo.ads.p.a aVar, @NonNull List<NativeAd> list, @NonNull sg.bigo.ads.o.b bVar) {
        super(aVar, list, bVar);
        this.i = sg.bigo.ads.common.utils.f.a(this.d, 72);
        this.j = new b(sg.bigo.ads.common.utils.f.a(this.d, 8), this.h, this.g);
    }

    private List<View> a(@NonNull View view, @NonNull View view2, @NonNull View view3, @NonNull View view4, @NonNull View view5, @Nullable View view6) {
        c();
        this.a.setOrientation(1);
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        arrayList.add(view2);
        arrayList.add(view3);
        arrayList.add(view4);
        arrayList.add(view5);
        a(0, 0, 0, 16);
        LinearLayout linearLayout = new LinearLayout(this.d);
        linearLayout.setOrientation(0);
        this.a.addView(linearLayout, new LinearLayout.LayoutParams(-1, -2));
        linearLayout.addView(new Space(this.d), new LinearLayout.LayoutParams(0, 60, 1.0f));
        linearLayout.addView(view, new LinearLayout.LayoutParams(this.i, -2));
        linearLayout.addView(new Space(this.d), new LinearLayout.LayoutParams(0, 60, 1.0f));
        linearLayout.addView(view2, new LinearLayout.LayoutParams(this.i, -2));
        linearLayout.addView(new Space(this.d), new LinearLayout.LayoutParams(0, 60, 1.0f));
        linearLayout.addView(view3, new LinearLayout.LayoutParams(this.i, -2));
        linearLayout.addView(new Space(this.d), new LinearLayout.LayoutParams(0, 60, 1.0f));
        LinearLayout linearLayout2 = new LinearLayout(this.d);
        linearLayout2.setOrientation(0);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.topMargin = sg.bigo.ads.common.utils.f.a(this.d, 12);
        this.a.addView(linearLayout2, layoutParams);
        linearLayout2.addView(new Space(this.d), new LinearLayout.LayoutParams(0, 60, 1.0f));
        linearLayout2.addView(view4, new LinearLayout.LayoutParams(this.i, -2));
        linearLayout2.addView(new Space(this.d), new LinearLayout.LayoutParams(0, 60, 1.0f));
        linearLayout2.addView(view5, new LinearLayout.LayoutParams(this.i, -2));
        linearLayout2.addView(new Space(this.d), new LinearLayout.LayoutParams(0, 60, 1.0f));
        if (view6 != null) {
            arrayList.add(view6);
            linearLayout2.addView(view6, new LinearLayout.LayoutParams(this.i, -2));
        } else {
            linearLayout2.addView(new Space(this.d), new LinearLayout.LayoutParams(this.i, -2));
        }
        linearLayout2.addView(new Space(this.d), new LinearLayout.LayoutParams(0, 60, 1.0f));
        return arrayList;
    }

    @Override // sg.bigo.ads.n.d
    @Nullable
    public final List<View> a(@NonNull a aVar) {
        int size = this.b.size();
        if (size == 0) {
            return new ArrayList();
        }
        if (size == 1) {
            this.f = true;
            View a = sg.bigo.ads.common.utils.a.a(this.d, R.layout.bigo_ad_layout_interstitial_icon_item_cta_des_style1, this.a, false);
            a(this.j);
            this.a.setOrientation(0);
            ArrayList arrayList = new ArrayList();
            arrayList.add(a);
            a(20, 16, 20, 16);
            this.a.addView(a, new LinearLayout.LayoutParams(-1, sg.bigo.ads.common.utils.f.a(this.d, 60)));
            return arrayList;
        }
        if (size == 2) {
            this.f = true;
            View a2 = sg.bigo.ads.common.utils.a.a(this.d, R.layout.bigo_ad_layout_interstitial_icon_item_cta_des_style1, this.a, false);
            View a3 = sg.bigo.ads.common.utils.a.a(this.d, R.layout.bigo_ad_layout_interstitial_icon_item_cta_des_style1, this.a, false);
            a(this.j);
            this.a.setOrientation(1);
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(a2);
            arrayList2.add(a3);
            a(20, 16, 20, 16);
            int a4 = sg.bigo.ads.common.utils.f.a(this.d, 60);
            this.a.addView(a2, new LinearLayout.LayoutParams(-1, a4));
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, a4);
            layoutParams.topMargin = sg.bigo.ads.common.utils.f.a(this.d, 20);
            this.a.addView(a3, layoutParams);
            return arrayList2;
        }
        if (size == 3) {
            View a5 = sg.bigo.ads.common.utils.a.a(this.d, R.layout.bigo_ad_layout_interstitial_icon_item_style, this.a, false);
            View a6 = sg.bigo.ads.common.utils.a.a(this.d, R.layout.bigo_ad_layout_interstitial_icon_item_style, this.a, false);
            View a7 = sg.bigo.ads.common.utils.a.a(this.d, R.layout.bigo_ad_layout_interstitial_icon_item_style, this.a, false);
            c();
            this.a.setOrientation(0);
            ArrayList arrayList3 = new ArrayList();
            arrayList3.add(a5);
            arrayList3.add(a6);
            arrayList3.add(a7);
            a(0, 0, 0, 16);
            s3j0.c(0, 60, 1.0f, this.a, new Space(this.d));
            this.a.addView(a5, new LinearLayout.LayoutParams(this.i, -2));
            s3j0.c(0, 60, 1.0f, this.a, new Space(this.d));
            this.a.addView(a6, new LinearLayout.LayoutParams(this.i, -2));
            s3j0.c(0, 60, 1.0f, this.a, new Space(this.d));
            this.a.addView(a7, new LinearLayout.LayoutParams(this.i, -2));
            s3j0.c(0, 60, 1.0f, this.a, new Space(this.d));
            return arrayList3;
        }
        if (size != 4) {
            return size != 5 ? a(sg.bigo.ads.common.utils.a.a(this.d, R.layout.bigo_ad_layout_interstitial_icon_item_style, this.a, false), sg.bigo.ads.common.utils.a.a(this.d, R.layout.bigo_ad_layout_interstitial_icon_item_style, this.a, false), sg.bigo.ads.common.utils.a.a(this.d, R.layout.bigo_ad_layout_interstitial_icon_item_style, this.a, false), sg.bigo.ads.common.utils.a.a(this.d, R.layout.bigo_ad_layout_interstitial_icon_item_style, this.a, false), sg.bigo.ads.common.utils.a.a(this.d, R.layout.bigo_ad_layout_interstitial_icon_item_style, this.a, false), sg.bigo.ads.common.utils.a.a(this.d, R.layout.bigo_ad_layout_interstitial_icon_item_style, this.a, false)) : a(sg.bigo.ads.common.utils.a.a(this.d, R.layout.bigo_ad_layout_interstitial_icon_item_style, this.a, false), sg.bigo.ads.common.utils.a.a(this.d, R.layout.bigo_ad_layout_interstitial_icon_item_style, this.a, false), sg.bigo.ads.common.utils.a.a(this.d, R.layout.bigo_ad_layout_interstitial_icon_item_style, this.a, false), sg.bigo.ads.common.utils.a.a(this.d, R.layout.bigo_ad_layout_interstitial_icon_item_style, this.a, false), sg.bigo.ads.common.utils.a.a(this.d, R.layout.bigo_ad_layout_interstitial_icon_item_style, this.a, false), null);
        }
        View a8 = sg.bigo.ads.common.utils.a.a(this.d, R.layout.bigo_ad_layout_interstitial_icon_item_style, this.a, false);
        View a9 = sg.bigo.ads.common.utils.a.a(this.d, R.layout.bigo_ad_layout_interstitial_icon_item_style, this.a, false);
        View a10 = sg.bigo.ads.common.utils.a.a(this.d, R.layout.bigo_ad_layout_interstitial_icon_item_style, this.a, false);
        View a11 = sg.bigo.ads.common.utils.a.a(this.d, R.layout.bigo_ad_layout_interstitial_icon_item_style, this.a, false);
        c();
        this.a.setOrientation(1);
        this.a.setGravity(1);
        ArrayList arrayList4 = new ArrayList();
        arrayList4.add(a8);
        arrayList4.add(a9);
        arrayList4.add(a10);
        arrayList4.add(a11);
        arrayList4.add(a11);
        a(0, 0, 0, 16);
        LinearLayout linearLayout = new LinearLayout(this.d);
        linearLayout.setOrientation(0);
        this.a.addView(linearLayout, new LinearLayout.LayoutParams(-1, -2));
        linearLayout.addView(new Space(this.d), new LinearLayout.LayoutParams(0, 60, 1.0f));
        linearLayout.addView(a8, new LinearLayout.LayoutParams(this.i, -2));
        linearLayout.addView(new Space(this.d), new LinearLayout.LayoutParams(0, 60, 1.0f));
        linearLayout.addView(a9, new LinearLayout.LayoutParams(this.i, -2));
        linearLayout.addView(new Space(this.d), new LinearLayout.LayoutParams(0, 60, 1.0f));
        LinearLayout linearLayout2 = new LinearLayout(this.d);
        linearLayout2.setOrientation(0);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams2.topMargin = sg.bigo.ads.common.utils.f.a(this.d, 12);
        this.a.addView(linearLayout2, layoutParams2);
        linearLayout2.addView(new Space(this.d), new LinearLayout.LayoutParams(0, 60, 1.0f));
        linearLayout2.addView(a10, new LinearLayout.LayoutParams(this.i, -1));
        linearLayout2.addView(new Space(this.d), new LinearLayout.LayoutParams(0, 60, 1.0f));
        linearLayout2.addView(a11, new LinearLayout.LayoutParams(this.i, -2));
        linearLayout2.addView(new Space(this.d), new LinearLayout.LayoutParams(0, 60, 1.0f));
        return arrayList4;
    }

    @Override // sg.bigo.ads.n.d
    public final b a() {
        float a = sg.bigo.ads.common.utils.f.a(this.d, 8);
        return new b(a, a, a, a, new Rect(0, sg.bigo.ads.common.utils.f.a(this.d, 12), 0, 0), this.h, null, this.g);
    }
}

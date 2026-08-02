package sg.bigo.ads.n;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import sg.bigo.ads.R;
import sg.bigo.ads.api.AdOptionsView;
import sg.bigo.ads.api.MediaView;
import sg.bigo.ads.api.NativeAd;
import sg.bigo.ads.common.utils.l;
import sg.bigo.ads.common.view.RoundedFrameLayout;
import sg.bigo.ads.o.b;

/* loaded from: classes9.dex */
public abstract class d {

    @NonNull
    protected final sg.bigo.ads.p.a a;

    @NonNull
    protected final List<NativeAd> b;

    @NonNull
    protected final sg.bigo.ads.o.b c;

    @NonNull
    protected final Context d;
    protected final b.a g;
    protected final float h;
    private final float i;
    protected boolean f = false;

    @NonNull
    protected final b e = a();

    public d(@NonNull sg.bigo.ads.p.a aVar, @NonNull List<NativeAd> list, @NonNull sg.bigo.ads.o.b bVar) {
        this.a = aVar;
        this.b = list;
        this.c = bVar;
        this.d = aVar.getContext();
        this.g = bVar.c();
        this.h = sg.bigo.ads.common.utils.f.a(r2, 1);
        this.i = sg.bigo.ads.common.utils.f.a(r2, 4);
    }

    @Nullable
    public abstract List<View> a(@NonNull a aVar);

    public abstract b a();

    public final void a(int i, int i2, int i3, int i4) {
        this.a.setPadding(sg.bigo.ads.common.utils.f.a(this.d, i), sg.bigo.ads.common.utils.f.a(this.d, i2), sg.bigo.ads.common.utils.f.a(this.d, i3), sg.bigo.ads.common.utils.f.a(this.d, i4));
    }

    public final int b() {
        return this.b.size();
    }

    public final void c() {
        a(this.a, (b) null);
    }

    public final void a(@NonNull View view) {
        a(view, (b) null);
    }

    public final void b(@NonNull View view) {
        view.setPadding(sg.bigo.ads.common.utils.f.a(this.d, 12), sg.bigo.ads.common.utils.f.a(this.d, 0), sg.bigo.ads.common.utils.f.a(this.d, 12), sg.bigo.ads.common.utils.f.a(this.d, 12));
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void a(@NonNull View view, @Nullable b bVar) {
        if (bVar == null) {
            bVar = this.e;
        }
        if (bVar == null || view == 0) {
            return;
        }
        Drawable a = bVar.a();
        if (a != null) {
            view.setBackground(a);
            view.setPadding(0, 0, 0, 0);
        } else if (view instanceof sg.bigo.ads.cb.c) {
            ((sg.bigo.ads.cb.c) view).setBlurStyle(bVar);
        }
    }

    public void a(TextView textView) {
    }

    public final void a(@NonNull a aVar, boolean z) {
        this.a.removeAllViews();
        List<View> a = a(aVar);
        if (l.a((Collection) a)) {
            return;
        }
        for (int i = 0; i < a.size() && i < this.b.size(); i++) {
            View view = a.get(i);
            NativeAd nativeAd = this.b.get(i);
            if (view != null && nativeAd != null) {
                ArrayList arrayList = new ArrayList();
                RoundedFrameLayout roundedFrameLayout = (RoundedFrameLayout) view.findViewById(R.id.inter_icon_ads_icon_item_layout);
                if (roundedFrameLayout != null) {
                    roundedFrameLayout.setStrokeWidth(this.h);
                    roundedFrameLayout.setStrokeColor(this.g.j);
                }
                ImageView imageView = (ImageView) view.findViewById(R.id.inter_icon_ads_item_icon);
                if (imageView != null) {
                    imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
                    imageView.setTag(1);
                    arrayList.add(imageView);
                    imageView.setBackgroundColor(this.g.i);
                    imageView.setImageDrawable(sg.bigo.ads.common.utils.a.a(imageView.getContext(), R.drawable.bigo_ad_icon_default));
                }
                TextView textView = (TextView) view.findViewById(R.id.inter_icon_ads_item_title);
                if (textView != null) {
                    if (z) {
                        textView.setTextColor(this.g.d);
                    }
                    textView.setText(nativeAd.getTitle());
                    textView.setTag(2);
                    arrayList.add(textView);
                }
                TextView textView2 = (TextView) view.findViewById(R.id.inter_icon_ads_item_sponsored);
                if (textView2 != null) {
                    if (z) {
                        textView2.setTextColor(this.g.d);
                    }
                    textView2.setText(nativeAd.getSponsored());
                    textView2.setTag(3);
                    a(textView2);
                    arrayList.add(textView2);
                }
                TextView textView3 = (TextView) view.findViewById(R.id.inter_icon_ads_item_desc);
                if (textView3 != null) {
                    if (z) {
                        textView3.setTextColor(this.g.d);
                    }
                    textView3.setText(nativeAd.getDescription());
                    textView3.setTag(6);
                    arrayList.add(textView3);
                }
                Button button = (Button) view.findViewById(R.id.inter_icon_ads_item_btn_cta);
                if (button != null) {
                    button.setText(nativeAd.getCallToAction());
                    button.setTag(7);
                    arrayList.add(button);
                    float f = this.i;
                    b.a aVar2 = this.g;
                    button.setBackground(sg.bigo.ads.common.utils.e.a(f, f, f, f, aVar2.k, aVar2.l, this.h));
                }
                ViewGroup viewGroup = a.size() == 1 ? this.a : (ViewGroup) view;
                if (nativeAd instanceof sg.bigo.ads.y.b) {
                    sg.bigo.ads.y.b bVar = (sg.bigo.ads.y.b) nativeAd;
                    bVar.H = this.c.l();
                    if (this.f) {
                        sg.bigo.ads.y.a.a(viewGroup, viewGroup, 1, bVar, this.c.l());
                    }
                }
                nativeAd.registerViewForInteraction(viewGroup, (MediaView) null, imageView, (AdOptionsView) null, arrayList);
            }
        }
    }

    public final void a(@Nullable b bVar) {
        a(this.a, bVar);
    }
}

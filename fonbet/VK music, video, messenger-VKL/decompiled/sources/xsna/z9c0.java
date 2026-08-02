package xsna;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.viewpager.widget.PagerAdapter;
import com.vk.dto.common.id.UserId;
import com.vk.newsfeed.api.posting.dto.PosterBackground;
import com.vk.typography.FontFamily;
import com.vkontakte.android.R;
import com.vkontakte.android.data.b;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* compiled from: PosterBackgroundPagerAdapter.kt */
/* loaded from: classes4.dex */
public final class z9c0 extends PagerAdapter implements View.OnClickListener {
    public final ArrayList b = new ArrayList();
    public UserId c = UserId.d;
    public String d = "";
    public WeakReference<TextView> e = new WeakReference<>(null);

    @Override // androidx.viewpager.widget.PagerAdapter
    public final void destroyItem(ViewGroup viewGroup, int i, Object obj) {
        viewGroup.removeView((View) obj);
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final int getCount() {
        return this.b.size() * 100;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final int getItemPosition(Object obj) {
        View view = obj instanceof View ? (View) obj : null;
        Object tag = view != null ? view.getTag() : null;
        PosterBackground posterBackground = tag instanceof PosterBackground ? (PosterBackground) tag : null;
        return (posterBackground == null || !posterBackground.zb()) ? -1 : -2;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final Object instantiateItem(ViewGroup viewGroup, int i) {
        bac0 bac0Var = new bac0(viewGroup.getContext());
        ArrayList arrayList = this.b;
        PosterBackground posterBackground = (PosterBackground) j5g.b0(i % arrayList.size(), arrayList);
        pac0 pac0Var = bac0Var.c;
        pac0 pac0Var2 = bac0Var.b;
        if (posterBackground != null && !posterBackground.zb()) {
            pac0Var2.q = true;
            pac0Var2.e.setAlpha(0);
            pac0Var.q = true;
            pac0Var.e.setAlpha(0);
        }
        PosterBackground posterBackground2 = (PosterBackground) j5g.b0(i % arrayList.size(), arrayList);
        if (posterBackground2 != null) {
            bac0Var.setBackgroundColor(posterBackground2.e);
            pac0Var2.c(posterBackground2.g, false);
            pac0Var.c(posterBackground2.h, false);
        }
        TextView textView = new TextView(viewGroup.getContext());
        int a = iah0.a(8);
        int a2 = iah0.a(2);
        int a3 = iah0.a(4);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setMaxWidth(iah0.f().widthPixels / 2);
        textView.setPadding(a, a2, a, a3);
        textView.setBackgroundResource(R.drawable.bg_poster_author);
        textView.setSingleLine();
        textView.setTextColor(-1);
        com.vk.typography.b.k(textView, FontFamily.MEDIUM, Float.valueOf(13.0f), 4);
        bwt0.p0(textView, false);
        textView.setOnClickListener(this);
        PosterBackground posterBackground3 = (PosterBackground) j5g.b0(i % arrayList.size(), arrayList);
        if (posterBackground3 != null && posterBackground3.zb()) {
            WeakReference<TextView> weakReference = new WeakReference<>(textView);
            this.e = weakReference;
            String str = this.d;
            TextView textView2 = weakReference.get();
            if (textView2 != null) {
                bwt0.p0(textView2, str.length() > 0);
            }
            TextView textView3 = this.e.get();
            if (textView3 != null) {
                textView3.setText(str);
            }
            this.d = str;
        }
        FrameLayout frameLayout = new FrameLayout(viewGroup.getContext());
        frameLayout.addView(bac0Var, new ViewGroup.LayoutParams(-1, -1));
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        int a4 = iah0.a(12);
        layoutParams.bottomMargin = a4;
        layoutParams.setMarginEnd(a4);
        layoutParams.gravity = 8388693;
        s3q0 s3q0Var = s3q0.a;
        frameLayout.addView(textView, layoutParams);
        frameLayout.setTag(posterBackground);
        viewGroup.addView(frameLayout, new ViewGroup.LayoutParams(-1, -1));
        return frameLayout;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final boolean isViewFromObject(View view, Object obj) {
        return view == obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (fkq0.c(this.c)) {
            if (com.vk.newsfeed.impl.posting.a.e == null) {
                com.vk.newsfeed.impl.posting.a.e = new com.vk.newsfeed.impl.posting.a();
            }
            com.vk.newsfeed.impl.posting.a.e.getClass();
            new b.d("poster_create_author_click").e();
            if (view != null) {
                gd60.Z0(hd60.a(), view.getContext(), this.c, null, null, 12);
            }
        }
    }
}

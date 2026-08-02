package xsna;

import android.graphics.drawable.GradientDrawable;
import android.text.TextPaint;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.tool.view.FlowLayout;
import com.vk.dto.newsfeed.entries.Post;
import com.vk.dto.newsfeed.entries.discover.TextDiscoverGridItem;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.am;

/* compiled from: TextDiscoverGridItemHolder.kt */
/* loaded from: classes4.dex */
public final class xdo0 extends uc6<TextDiscoverGridItem> {
    public final m2c0 I;
    public final ViewGroup J;
    public final View K;
    public final ImageView L;
    public final TextView M;
    public final FlowLayout N;
    public final q1o0 O;
    public final ArrayList<RecyclerView.e0> P;
    public final s1o0 Q;
    public final int R;

    public xdo0(ViewGroup viewGroup, m2c0 m2c0Var) {
        super(tf3.b(viewGroup, R.layout.news_text_discover_grid_item, viewGroup, false), viewGroup);
        ViewGroup viewGroup2 = (ViewGroup) this.itemView.findViewById(R.id.news_text_discover_grid_item_container);
        this.J = viewGroup2;
        View findViewById = this.itemView.findViewById(R.id.news_text_discover_grid_item_fade);
        this.K = findViewById;
        this.L = (ImageView) this.itemView.findViewById(R.id.news_text_discover_grid_item_icon);
        this.M = (TextView) this.itemView.findViewById(R.id.news_text_discover_grid_item_text);
        FlowLayout flowLayout = (FlowLayout) this.itemView.findViewById(R.id.news_text_discover_grid_item_tags);
        this.N = flowLayout;
        this.O = new q1o0(0);
        this.P = new ArrayList<>(1);
        this.Q = new s1o0();
        this.R = R.string.accessibility_discover_media_photo;
        viewGroup2.setOnClickListener(this);
        viewGroup2.setOnLongClickListener(this);
        iut0.o(viewGroup2, am.a.e, this.itemView.getContext().getString(R.string.accessibility_discover_media_go), null);
        iut0.o(viewGroup2, am.a.f, this.itemView.getContext().getString(R.string.accessibility_discover_media_open_menu), null);
        flowLayout.setRowsStartFromBottom(true);
        int Y = dhr0.Y(R.attr.vk_ui_background, this.itemView.getContext());
        findViewById.setBackground(new GradientDrawable(GradientDrawable.Orientation.BOTTOM_TOP, new int[]{Y, l8g.f(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, Y)}));
        this.I = m2c0Var;
    }

    /* JADX WARN: Type inference failed for: r10v0, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r9v4, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.uc6
    public final void U6(TextDiscoverGridItem textDiscoverGridItem) {
        ArrayList arrayList;
        TextDiscoverGridItem textDiscoverGridItem2 = textDiscoverGridItem;
        final String str = textDiscoverGridItem2.j;
        Post R = di60.R(textDiscoverGridItem2.c);
        boolean z = false;
        final TextView textView = this.M;
        ImageView imageView = this.L;
        if (R == null || !R.mc()) {
            if (R != null) {
                textView.setText(str);
            }
            bwt0.p0(imageView, false);
        } else {
            final int a = iah0.a(32);
            if (str != null) {
                textView.post(new Runnable() { // from class: xsna.wdo0
                    @Override // java.lang.Runnable
                    public final void run() {
                        TextView textView2 = textView;
                        int width = textView2.getWidth() - a;
                        List<String> c0 = drm0.c0(str, new String[]{" "}, 0, 6);
                        StringBuilder sb = new StringBuilder();
                        TextPaint paint = textView2.getPaint();
                        int i = 0;
                        float f = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                        for (String str2 : c0) {
                            float measureText = paint.measureText(str2 + ' ');
                            int i2 = 2;
                            if (i < 2) {
                                float f2 = width;
                                if (measureText > f2) {
                                    while (true) {
                                        if (str2.length() <= 0) {
                                            break;
                                        }
                                        if (i >= i2) {
                                            sb.append(str2);
                                            break;
                                        }
                                        int breakText = paint.breakText(str2, true, f2 - f, null);
                                        if (breakText != 0) {
                                            if (paint.measureText(str2.substring(0, breakText)) + f > f2) {
                                                sb.append("\n");
                                                i++;
                                            }
                                            sb.append(str2.substring(0, breakText));
                                            sb.append("\n");
                                            str2 = str2.substring(breakText);
                                            i++;
                                            f = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                                            i2 = 2;
                                        }
                                    }
                                } else {
                                    if (f + measureText > f2) {
                                        sb.append("\n");
                                        i++;
                                        f = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                                    }
                                    sb.append(str2);
                                    sb.append(" ");
                                    f += measureText;
                                }
                            } else {
                                sb.append(str2);
                                sb.append(" ");
                            }
                        }
                        textView2.setText(drm0.p0(sb.toString()).toString());
                    }
                });
            }
            imageView.setImageResource(R.drawable.vk_icon_pin_outline_shadow_28);
            bwt0.p0(imageView, true);
        }
        List<String> list = textDiscoverGridItem2.h;
        if (list != null) {
            List<String> list2 = list;
            arrayList = new ArrayList(c5g.u(list2, 10));
            Iterator<T> it = list2.iterator();
            while (it.hasNext()) {
                arrayList.add(new ean((String) it.next(), null, 2));
            }
        } else {
            arrayList = null;
        }
        s1o0 s1o0Var = this.Q;
        s1o0Var.getClass();
        FlowLayout flowLayout = this.N;
        if (flowLayout.getChildCount() > 0) {
            flowLayout.removeAllViews();
        }
        ArrayList<RecyclerView.e0> arrayList2 = this.P;
        int size = arrayList2.size();
        m2c0 m2c0Var = this.I;
        if (size > 0) {
            Iterator<RecyclerView.e0> it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                ((rru) m2c0Var.b.getValue()).putRecycledView(it2.next());
            }
            arrayList2.clear();
        }
        if (arrayList != null) {
            q1o0 q1o0Var = this.O;
            ArrayList<ean> arrayList3 = q1o0Var.c;
            arrayList3.clear();
            if (!arrayList.isEmpty()) {
                arrayList3.addAll(arrayList);
            }
            int size2 = arrayList.size();
            for (int i = 0; i < size2; i++) {
                RecyclerView.e0 recycledView = ((rru) m2c0Var.b.getValue()).getRecycledView(q1o0Var.getItemViewType(i));
                if (recycledView == null) {
                    recycledView = q1o0Var.createViewHolder(flowLayout, q1o0Var.getItemViewType(i));
                }
                arrayList2.add(recycledView);
                ViewGroup.LayoutParams layoutParams = recycledView.itemView.getLayoutParams();
                FlowLayout.a aVar = layoutParams instanceof FlowLayout.a ? (FlowLayout.a) layoutParams : null;
                if (aVar == null) {
                    int i2 = s1o0Var.a;
                    aVar = new FlowLayout.a(i2, i2);
                }
                recycledView.itemView.setLayoutParams(aVar);
                flowLayout.addView(recycledView.itemView);
                if (recycledView instanceof k0o0) {
                    q1o0Var.bindViewHolder(recycledView, i);
                }
            }
            if (!arrayList.isEmpty()) {
                z = true;
            }
        }
        bwt0.p0(flowLayout, z);
        TextDiscoverGridItem textDiscoverGridItem3 = (TextDiscoverGridItem) this.D;
        this.J.setContentDescription(textDiscoverGridItem3 != null ? R6(textDiscoverGridItem3, Integer.valueOf(this.R)) : null);
    }
}

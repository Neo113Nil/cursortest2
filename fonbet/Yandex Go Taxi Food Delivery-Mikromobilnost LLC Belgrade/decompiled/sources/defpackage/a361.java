package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.ybsdk.widgets.common.shimmer.ShimmerFrameLayout;

/* loaded from: classes2.dex */
public final class a361 implements zo31 {
    public final ShimmerFrameLayout a;
    public final ImageView b;
    public final ImageView c;
    public final TextView d;
    public final TextView e;

    public a361(ShimmerFrameLayout shimmerFrameLayout, ImageView imageView, ImageView imageView2, TextView textView, TextView textView2) {
        this.a = shimmerFrameLayout;
        this.b = imageView;
        this.c = imageView2;
        this.d = textView;
        this.e = textView2;
    }

    public static a361 o(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View inflate = layoutInflater.inflate(umh0.ybsdk_item_transfer_list_content, viewGroup, false);
        int i = mah0.endIcon;
        ImageView imageView = (ImageView) cma1.O(i, inflate);
        if (imageView != null) {
            i = mah0.startIcon;
            ImageView imageView2 = (ImageView) cma1.O(i, inflate);
            if (imageView2 != null) {
                i = mah0.subtitle;
                TextView textView = (TextView) cma1.O(i, inflate);
                if (textView != null) {
                    i = mah0.title;
                    TextView textView2 = (TextView) cma1.O(i, inflate);
                    if (textView2 != null) {
                        return new a361((ShimmerFrameLayout) inflate, imageView, imageView2, textView, textView2);
                    }
                }
            }
        }
        ny61.t("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
        return null;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}

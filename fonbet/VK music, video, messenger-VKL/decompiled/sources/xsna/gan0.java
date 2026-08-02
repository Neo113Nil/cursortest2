package xsna;

import android.graphics.Matrix;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.vk.core.view.shimmer.ShimmerFrameLayout;
import com.vkontakte.android.R;

/* compiled from: SuperAppMiniWidgetsStubHolder.kt */
/* loaded from: classes6.dex */
public final class gan0 extends ucn0<han0> {
    public final ShimmerFrameLayout p;

    public gan0(View view) {
        super(view, null);
        ShimmerFrameLayout shimmerFrameLayout = (ShimmerFrameLayout) view.findViewById(R.id.shimmer_layout);
        this.p = shimmerFrameLayout;
        shimmerFrameLayout.b(bmf0.a(0, 30, this.itemView.getContext()));
        ViewGroup viewGroup = (ViewGroup) view.findViewById(R.id.stub_item_container);
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            Drawable a = m33.a(R.drawable.vk_superapp_content_tint_circle_46, childAt.getContext());
            ImageView imageView = (ImageView) childAt.findViewById(R.id.top_icon_stub);
            if (imageView != null) {
                imageView.setScaleType(ImageView.ScaleType.MATRIX);
                Matrix matrix = new Matrix();
                matrix.setTranslate(iah0.b(2.0f), -iah0.b(8.0f));
                imageView.setImageMatrix(matrix);
                imageView.setImageDrawable(a);
            }
            ImageView imageView2 = (ImageView) childAt.findViewById(R.id.bottom_icon_stub);
            if (imageView2 != null) {
                imageView2.setScaleType(ImageView.ScaleType.MATRIX);
                Matrix matrix2 = new Matrix();
                matrix2.setTranslate(iah0.b(2.0f), iah0.b(2.0f));
                imageView2.setImageMatrix(matrix2);
                imageView2.setImageDrawable(a);
            }
            childAt.setOutlineProvider(new t0w0(6, iah0.b(20.0f), false, false));
            childAt.setClipToOutline(true);
        }
    }

    @Override // xsna.hf6
    public final void W5(zif0 zif0Var) {
        ShimmerFrameLayout shimmerFrameLayout = this.p;
        if (!shimmerFrameLayout.isLaidOut() || shimmerFrameLayout.isLayoutRequested()) {
            shimmerFrameLayout.addOnLayoutChangeListener(new amf0(shimmerFrameLayout));
        } else {
            shimmerFrameLayout.a();
        }
    }
}

package sg.bigo.ads.k;

import android.view.ViewGroup;
import androidx.annotation.NonNull;
import sg.bigo.ads.R;
import sg.bigo.ads.common.view.RealtimeBlurLinearLayout;

/* loaded from: classes9.dex */
public class c extends b {
    public c(@NonNull sg.bigo.ads.y.b bVar) {
        super(bVar);
    }

    @Override // sg.bigo.ads.k.b
    public final void F() {
        super.F();
        RealtimeBlurLinearLayout realtimeBlurLinearLayout = ((b) this).z;
        if (realtimeBlurLinearLayout != null) {
            ViewGroup.LayoutParams layoutParams = realtimeBlurLinearLayout.getLayoutParams();
            if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin += -sg.bigo.ads.common.utils.f.a(((b) this).z.getContext(), 60);
                ((b) this).z.requestLayout();
            }
        }
    }

    @Override // sg.bigo.ads.k.b
    public int z() {
        return R.id.inter_component_20;
    }
}

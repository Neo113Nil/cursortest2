package defpackage;

import android.content.res.TypedArray;
import com.yandex.plus.home.feature.webviews.internal.container.ModalContentViewContainer;

/* loaded from: classes.dex */
public class jtr0 extends itr0 {
    public jtr0() {
        this.a.p = false;
    }

    @Override // defpackage.itr0
    public final itr0 b(TypedArray typedArray) {
        super.b(typedArray);
        boolean hasValue = typedArray.hasValue(u2i0.ShimmerFrameLayout_shimmer_base_color);
        ktr0 ktr0Var = this.a;
        if (hasValue) {
            ktr0Var.e = (typedArray.getColor(u2i0.ShimmerFrameLayout_shimmer_base_color, ktr0Var.e) & 16777215) | (ktr0Var.e & ModalContentViewContainer.BASE_SHADOW_COLOR);
        }
        if (typedArray.hasValue(u2i0.ShimmerFrameLayout_shimmer_highlight_color)) {
            ktr0Var.d = typedArray.getColor(u2i0.ShimmerFrameLayout_shimmer_highlight_color, ktr0Var.d);
        }
        return this;
    }

    @Override // defpackage.itr0
    public final itr0 c() {
        return this;
    }
}

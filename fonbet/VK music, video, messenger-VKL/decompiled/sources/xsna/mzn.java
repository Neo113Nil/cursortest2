package xsna;

import android.content.Context;
import com.vk.donut.video.model.presentation.video.DonutVideoUiModel;

/* compiled from: DonutDescriptionChipProviderImpl.kt */
/* loaded from: classes7.dex */
public final class mzn implements lzn {
    public final zyn b;
    public final ujm0 c;

    public mzn(zyn zynVar, ujm0 ujm0Var) {
        this.b = zynVar;
        this.c = ujm0Var;
    }

    @Override // xsna.lzn
    public final CharSequence a(DonutVideoUiModel donutVideoUiModel, Context context) {
        azn a;
        if (donutVideoUiModel == null || (a = k5o.a(donutVideoUiModel)) == null) {
            return null;
        }
        return this.b.a(a, context, new pi0(this, 20));
    }
}

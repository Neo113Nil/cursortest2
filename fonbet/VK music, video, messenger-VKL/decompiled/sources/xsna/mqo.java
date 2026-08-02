package xsna;

import com.vk.core.dynamic_loader.DynamicException;
import com.vk.core.dynamic_loader.b;
import com.vk.masks.dynamic.DynamicMasksUseCase;
import com.vkontakte.android.R;

/* compiled from: DynamicMasksViewDelegate.kt */
/* loaded from: classes3.dex */
public final class mqo extends vdl<DynamicMasksUseCase> {
    @Override // xsna.vdl
    public final String j(Throwable th) {
        return th instanceof DynamicException.GooglePlay ? this.a.getString(R.string.mask_feature_store_error) : super.j(th);
    }

    @Override // xsna.vdl
    public final CharSequence k(b.AbstractC0762b abstractC0762b) {
        if (abstractC0762b instanceof b.AbstractC0762b.g) {
            return this.a.getString(R.string.mask_installing);
        }
        return null;
    }

    @Override // xsna.vdl
    public final CharSequence l(DynamicMasksUseCase dynamicMasksUseCase) {
        return this.a.getString(R.string.hint_dynamic_mask_desc);
    }

    @Override // xsna.vdl
    public final CharSequence m(DynamicMasksUseCase dynamicMasksUseCase) {
        return this.a.getString(R.string.hint_dynamic_mask_title);
    }
}

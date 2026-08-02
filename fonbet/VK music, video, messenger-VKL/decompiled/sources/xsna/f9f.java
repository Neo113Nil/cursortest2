package xsna;

import android.content.ContextWrapper;
import android.view.View;

/* compiled from: ClipsTemplatesGalleryPickerPreviewFactoryImpl.kt */
/* loaded from: classes5.dex */
public final class f9f implements w4t {
    @Override // xsna.w4t
    public final View a(ContextWrapper contextWrapper, gzs gzsVar, gzs gzsVar2, boolean z, wzs wzsVar) {
        com.vk.preview.presentation.view.a aVar = new com.vk.preview.presentation.view.a(contextWrapper);
        aVar.setOnAction(gzsVar);
        return aVar;
    }
}

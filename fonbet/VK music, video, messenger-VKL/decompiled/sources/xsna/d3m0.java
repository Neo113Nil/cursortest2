package xsna;

import android.content.ContextWrapper;
import android.view.View;
import com.vk.preview.presentation.view.StoryGalleryPickerPreviewViewNew;

/* compiled from: StoryGalleryPickerPreviewFactoryImpl.kt */
/* loaded from: classes5.dex */
public final class d3m0 implements w4t {
    @Override // xsna.w4t
    public final View a(ContextWrapper contextWrapper, gzs gzsVar, gzs gzsVar2, boolean z, wzs wzsVar) {
        StoryGalleryPickerPreviewViewNew storyGalleryPickerPreviewViewNew = new StoryGalleryPickerPreviewViewNew(contextWrapper, z);
        storyGalleryPickerPreviewViewNew.setOnAction(gzsVar);
        storyGalleryPickerPreviewViewNew.setOnOpenPhotoEditor(gzsVar2);
        storyGalleryPickerPreviewViewNew.setShowSnackbar(wzsVar);
        return storyGalleryPickerPreviewViewNew;
    }
}

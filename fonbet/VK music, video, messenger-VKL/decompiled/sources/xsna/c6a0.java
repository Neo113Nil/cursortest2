package xsna;

import com.vk.gallerypicker.configuration.GalleryPickerSourceConfiguration;

/* compiled from: PhotoEditorAnalyticsEntryPointProvider.kt */
/* loaded from: classes15.dex */
public final class c6a0 {
    public final boolean a;
    public final GalleryPickerSourceConfiguration b;

    public c6a0(boolean z, GalleryPickerSourceConfiguration galleryPickerSourceConfiguration) {
        this.a = z;
        this.b = galleryPickerSourceConfiguration;
    }

    public final String a() {
        if (this.a) {
            return "avatar";
        }
        GalleryPickerSourceConfiguration.EntryPoint entryPoint = this.b.d;
        if (entryPoint == GalleryPickerSourceConfiguration.EntryPoint.PHOTO_FLOW) {
            return "photo_flow";
        }
        if (entryPoint == GalleryPickerSourceConfiguration.EntryPoint.ALBUM) {
            return "album_upload";
        }
        if (entryPoint == GalleryPickerSourceConfiguration.EntryPoint.IM) {
            return "messenger";
        }
        if (entryPoint == GalleryPickerSourceConfiguration.EntryPoint.STORY) {
            return "story_publish";
        }
        return null;
    }
}

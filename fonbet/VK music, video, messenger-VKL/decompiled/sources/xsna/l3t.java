package xsna;

import android.os.Bundle;
import com.vk.attachpicker.fragment.gallery.GalleryFragmentImpl;
import com.vk.gallerypicker.configuration.GalleryPickerSourceConfiguration;
import com.vungle.ads.internal.protos.Sdk;

/* compiled from: GalleryFactoryImpl.kt */
/* loaded from: classes15.dex */
public final class l3t implements k3t {
    @Override // xsna.k3t
    public final GalleryFragmentImpl a(boolean z, boolean z2, boolean z3, long j, Integer num, Integer num2, GalleryPickerSourceConfiguration galleryPickerSourceConfiguration) {
        GalleryFragmentImpl galleryFragmentImpl = new GalleryFragmentImpl();
        Bundle bundle = new Bundle();
        if (z3) {
            bundle.putInt("media_type", Sdk.SDKError.Reason.INVALID_WATERFALL_PLACEMENT_ID_VALUE);
        } else {
            bundle.putInt("media_type", 111);
        }
        bundle.putBoolean("attach_limit_hint", z2);
        bundle.putBoolean("enable_story_attachment", z);
        bundle.putInt("story_view_type", 0);
        bundle.putLong("peer_id", j);
        if (num != null) {
            bundle.putInt("attach_counter_button_color", num.intValue());
        }
        bundle.putInt("initial_padding", num2.intValue());
        bundle.putParcelable("gallery_picker_source_configuration", galleryPickerSourceConfiguration);
        galleryFragmentImpl.setArguments(bundle);
        return galleryFragmentImpl;
    }
}

package xsna;

import com.vk.clips.download.api.di.ClipsDownloadComponent;
import com.vk.core.view.components.cell.VkCell;
import com.vk.core.view.components.formitem.VkTextArea;
import com.vk.libvideo.seek.di.VideoSeekComponentImpl;
import com.vk.newsfeed.impl.fragments.video.tree.VideoCommentsTreeInPlayerFragment;
import com.vk.newsfeed.posting.mediapicker.photovk.VkPhotoPickerFragment;
import com.vk.toggle.features.SmbAdFeatures;
import com.vk.toggle.features.VideoFeatures;
import com.vkontakte.android.R;
import java.lang.annotation.Annotation;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class rcs0 implements gzs {
    public final /* synthetic */ int b;

    public /* synthetic */ rcs0(int i) {
        this.b = i;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        switch (this.b) {
            case 0:
                String[] strArr = VideoCommentsTreeInPlayerFragment.c0;
                SmbAdFeatures smbAdFeatures = SmbAdFeatures.FEATURE_SMB_DISCLAIMER_REPOSITION;
                smbAdFeatures.getClass();
                return Boolean.valueOf(com.vk.toggle.b.A.a(smbAdFeatures));
            case 1:
                return Boolean.valueOf(com.vk.toggle.b.A.a(VideoFeatures.VIDEO_NEW_API_RECOMM_METHOD));
            case 2:
                return (ClipsDownloadComponent) ((k7m) m7m.f(lhs0.c)).a(fpf0.a(ClipsDownloadComponent.class));
            case 3:
                return new a390();
            case 4:
                qcy<Object>[] qcyVarArr = VideoSeekComponentImpl.b;
                return new aft0();
            case 5:
                return Boolean.valueOf(fxc0.B().J().N1());
            case 6:
                return new tub0(fpf0.a(VkCell.f.class), new Annotation[0]);
            case 7:
                int i = VkPhotoPickerFragment.r0;
                return new yvw(null);
            default:
                int i2 = VkTextArea.r;
                return new int[]{R.attr.formItemStateActive};
        }
    }
}

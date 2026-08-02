package xsna;

import com.vk.dto.common.id.UserId;
import com.vk.photos.root.photoflow.tags.presentation.PhotoTagsFragment;

/* compiled from: PhotoTagsFragmentBuilder.kt */
/* loaded from: classes4.dex */
public final class lca0 extends oz50 {
    public lca0(UserId userId, int i, int i2) {
        super(PhotoTagsFragment.class, null, null);
        this.j.putParcelable("uid", userId);
        this.j.putInt("PHOTO_TAGS_COUNT", i);
        this.j.putInt("RECOGNITION_TAGS_COUNT", i2);
    }
}

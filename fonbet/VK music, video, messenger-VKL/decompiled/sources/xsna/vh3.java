package xsna;

import com.vk.dto.common.id.UserId;
import com.vk.photos.root.archive.presentation.ArchiveFragment;

/* compiled from: ArchiveFragmentBuilder.kt */
/* loaded from: classes4.dex */
public final class vh3 extends oz50 {
    public vh3() {
        super(ArchiveFragment.class, null, null);
    }

    public void y(boolean z) {
        this.j.putBoolean("FROM_PHOTO_FLOW", z);
    }

    public void z(UserId userId) {
        this.j.putParcelable("uid", userId);
    }
}

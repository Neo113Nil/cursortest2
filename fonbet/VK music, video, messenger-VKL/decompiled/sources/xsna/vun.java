package xsna;

import com.vk.documents.ui.fragments.DocumentsViewFragment;
import com.vk.dto.common.id.UserId;

/* compiled from: DocumentsFragmentBuilder.java */
/* loaded from: classes18.dex */
public final class vun extends oz50 {
    public vun() {
        super(DocumentsViewFragment.class, null, null);
    }

    public final void y(UserId userId) {
        if (userId.b != 0) {
            this.j.putParcelable("owner_id", userId);
        }
    }
}

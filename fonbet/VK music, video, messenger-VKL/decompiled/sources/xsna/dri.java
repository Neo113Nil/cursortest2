package xsna;

import androidx.compose.ui.platform.ComposeView;
import com.vk.profile.user.impl.ui.adapter.UserProfileAdapterItem;

/* compiled from: ComposeUserProfileViewHolder.kt */
/* loaded from: classes5.dex */
public abstract class dri<T extends UserProfileAdapterItem> extends aq6<T> {
    public dri(ComposeView composeView) {
        super(composeView);
        composeView.setContent(new jai(-699407252, new o4e(this, 4), true));
    }

    public abstract void q6(int i, androidx.compose.runtime.a aVar);
}

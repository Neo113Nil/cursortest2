package xsna;

import androidx.recyclerview.widget.m;
import com.vk.profile.user.impl.ui.adapter.UserProfileAdapterItem;

/* compiled from: UserProfileWithTabsView.kt */
/* loaded from: classes5.dex */
public final class cyq0 extends m.e<UserProfileAdapterItem> {
    @Override // androidx.recyclerview.widget.m.e
    public final boolean areContentsTheSame(UserProfileAdapterItem userProfileAdapterItem, UserProfileAdapterItem userProfileAdapterItem2) {
        return userProfileAdapterItem.equals(userProfileAdapterItem2);
    }

    @Override // androidx.recyclerview.widget.m.e
    public final boolean areItemsTheSame(UserProfileAdapterItem userProfileAdapterItem, UserProfileAdapterItem userProfileAdapterItem2) {
        return userProfileAdapterItem.a == userProfileAdapterItem2.a;
    }
}

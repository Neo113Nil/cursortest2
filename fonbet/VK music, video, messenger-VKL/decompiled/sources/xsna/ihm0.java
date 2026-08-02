package xsna;

import androidx.fragment.app.Fragment;
import com.vk.dto.stories.model.StoryEntry;

/* compiled from: StoryStatisticsTabFragment.kt */
/* loaded from: classes6.dex */
public interface ihm0 {
    void K8(StoryEntry storyEntry);

    default boolean f3() {
        return false;
    }

    void ha(int i);

    /* JADX WARN: Multi-variable type inference failed */
    default ahm0 ti() {
        Fragment fragment = this instanceof Fragment ? (Fragment) this : null;
        z1h0 parentFragment = fragment != null ? fragment.getParentFragment() : null;
        if (parentFragment instanceof ahm0) {
            return (ahm0) parentFragment;
        }
        return null;
    }

    default void jj() {
    }
}

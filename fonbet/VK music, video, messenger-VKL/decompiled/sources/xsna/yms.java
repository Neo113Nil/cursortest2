package xsna;

import androidx.fragment.app.FragmentActivity;
import com.vk.friends.impl.cleanup.presentation.fragment.FriendsCleanupFragment;
import com.vk.story.viewer.api.di.StoryViewerComponent;
import java.util.HashSet;
import kotlin.jvm.internal.PropertyReference0Impl;

/* compiled from: FriendsCleanupFragment.kt */
/* loaded from: classes15.dex */
public final /* synthetic */ class yms extends PropertyReference0Impl {
    public final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ yms(int i, Object obj, Class cls, String str, String str2, int i2) {
        super(obj, cls, str, str2, i);
        this.b = i2;
    }

    @Override // kotlin.jvm.internal.PropertyReference0Impl, xsna.rcy
    public final Object get() {
        boolean z;
        switch (this.b) {
            case 0:
                FriendsCleanupFragment friendsCleanupFragment = (FriendsCleanupFragment) this.receiver;
                int i = FriendsCleanupFragment.W;
                FragmentActivity activity = friendsCleanupFragment.getActivity();
                if (activity != null) {
                    HashSet hashSet = iah0.a;
                    z = fnj.d(activity);
                } else {
                    z = false;
                }
                return Boolean.valueOf(z);
            default:
                return ((StoryViewerComponent) this.receiver).tb();
        }
    }
}

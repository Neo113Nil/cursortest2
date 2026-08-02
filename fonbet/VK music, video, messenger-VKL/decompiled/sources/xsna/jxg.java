package xsna;

import com.vk.profile.community.impl.ui.profile.state.CommunityProfileState;
import com.vk.profile.core.content.ContentTab;
import com.vk.profile.core.tabs.state.CommunityProfileContentItem;
import com.vkontakte.android.api.ExtendedCommunityProfile;

/* compiled from: CommunityContentFeatureDelegate.kt */
/* loaded from: classes5.dex */
public interface jxg<T extends CommunityProfileContentItem> {
    void b(ContentTab contentTab, ExtendedCommunityProfile extendedCommunityProfile);

    void d(T t, ExtendedCommunityProfile extendedCommunityProfile);

    void f(T t, ExtendedCommunityProfile extendedCommunityProfile);

    void g(T t, ExtendedCommunityProfile extendedCommunityProfile);

    void i(T t, ExtendedCommunityProfile extendedCommunityProfile);

    void k(T t, ExtendedCommunityProfile extendedCommunityProfile);

    void onPause();

    default void onDestroy() {
    }

    default void c(CommunityProfileState communityProfileState) {
    }

    default void a(T t, ExtendedCommunityProfile extendedCommunityProfile) {
    }

    default void e(T t, ExtendedCommunityProfile extendedCommunityProfile) {
    }

    default void h(T t, ExtendedCommunityProfile extendedCommunityProfile) {
    }

    default void j(T t, ExtendedCommunityProfile extendedCommunityProfile) {
    }
}

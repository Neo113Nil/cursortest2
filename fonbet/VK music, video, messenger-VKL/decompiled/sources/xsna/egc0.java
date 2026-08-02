package xsna;

import android.view.ViewGroup;
import com.vk.newsfeed.api.posting.PostingCreationEntryPoint;
import com.vk.newsfeed.api.posting.community.PostingCountersModel;
import com.vkontakte.android.api.ExtendedUserProfile;

/* compiled from: PostingItemContracts.kt */
/* loaded from: classes3.dex */
public interface egc0 extends cc6, kgc0 {
    void A6(PostingCreationEntryPoint postingCreationEntryPoint);

    void F3();

    void G5(PostingCreationEntryPoint postingCreationEntryPoint);

    void H4(boolean z);

    void M2(String str);

    void R2(iug iugVar);

    void S3(boolean z);

    ViewGroup V3();

    boolean Y2();

    void Y5(boolean z);

    void d3();

    void h7(boolean z);

    void m(String str);

    void n7(int i);

    void o7(int i);

    void onStart();

    boolean q4();

    void s7(boolean z);

    <T extends ExtendedUserProfile> void u6(T t);

    default void N2() {
    }

    default void i3(PostingCountersModel postingCountersModel) {
    }
}

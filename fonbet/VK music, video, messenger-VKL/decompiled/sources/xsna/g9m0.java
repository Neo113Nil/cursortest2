package xsna;

import android.content.Context;
import com.vk.api.base.VkPaginationList;
import com.vk.camera.editor.stories.api.base.privacy.StoryPrivacyType;
import com.vk.dto.common.id.UserId;
import com.vk.dto.group.Group;
import java.util.List;

/* compiled from: StoryPrivacyController.kt */
/* loaded from: classes16.dex */
public interface g9m0 {
    VkPaginationList<Group> a();

    io.reactivex.rxjava3.disposables.c b(Context context);

    StoryPrivacyType c();

    boolean d();

    void e();

    void f(kam0 kam0Var);

    void g();

    void h(StoryPrivacyType storyPrivacyType, StoryPrivacyType storyPrivacyType2, List<UserId> list, List<UserId> list2, List<UserId> list3, boolean z, boolean z2);

    String i();

    q9m0 j();

    List<UserId> k();

    boolean l();

    void m(String str);

    void n(gzs<s3q0> gzsVar);

    StoryPrivacyType o();

    void p(boolean z, boolean z2, Context context, izs<? super Boolean, s3q0> izsVar);
}

package xsna;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import com.vk.api.base.VkPaginationList;
import com.vk.dto.common.Attachment;
import com.vk.dto.user.UserProfile;
import java.util.List;

/* compiled from: MentionSelectViewController.kt */
/* loaded from: classes18.dex */
public interface g420 {
    void a(int i);

    void c();

    View d(ViewGroup viewGroup, Bundle bundle);

    k420 e();

    void f();

    void g(VkPaginationList<UserProfile> vkPaginationList);

    void h(b420 b420Var);

    void hide();

    void i(int i);

    void j(String str);

    void k(List<? extends Attachment> list);

    void n(float f);

    void onDestroyView();
}

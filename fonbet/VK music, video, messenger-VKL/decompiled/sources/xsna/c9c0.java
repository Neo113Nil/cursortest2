package xsna;

import com.vk.api.comments.CommentsOrder;
import com.vk.dto.common.data.LikeInfo;
import com.vk.dto.newsfeed.entries.Post;
import java.util.List;
import xsna.yrn;

/* compiled from: PostViewContract.kt */
/* loaded from: classes3.dex */
public interface c9c0 extends cc6, bd70<Object>, yrn.a {
    void D1(List<LikeInfo> list);

    void H3();

    void J4(Post post);

    void P3();

    void T5();

    void W3(int i);

    void a1();

    void e7();

    void f1(int i);

    void j1();

    void k1(int i, int i2);

    void m4(CommentsOrder commentsOrder);

    CharSequence o6(CharSequence charSequence);

    boolean p2();

    void q6();

    void u3(q1c0 q1c0Var);

    default void e4(String str) {
    }
}

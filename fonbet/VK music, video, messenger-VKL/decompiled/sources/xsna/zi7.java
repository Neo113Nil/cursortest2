package xsna;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.tabs.TabLayout;
import com.google.gson.Gson;
import com.vk.catalog2.common.ui.mvp.holder.container.VkTabLayoutVh;
import com.vk.comments.core.BoardComment;
import com.vk.dto.common.id.UserId;
import com.vk.topics.impl.fragments.BoardTopicViewFragment;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class zi7 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;

    public /* synthetic */ zi7(Object obj, int i, int i2) {
        this.b = i2;
        this.d = obj;
        this.c = i;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        int i = this.b;
        Object obj2 = null;
        int i2 = 0;
        int i3 = this.c;
        Object obj3 = this.d;
        switch (i) {
            case 0:
                BoardTopicViewFragment boardTopicViewFragment = (BoardTopicViewFragment) obj3;
                BoardComment boardComment = (BoardComment) obj;
                Iterator it = ((List) boardTopicViewFragment.o0.d.stream().map(new wi7(new ol(4), i2)).collect(Collectors.toList())).iterator();
                while (true) {
                    if (it.hasNext()) {
                        Object next = it.next();
                        if (((BoardComment) next).b == i3) {
                            obj2 = next;
                        }
                    }
                }
                BoardComment boardComment2 = (BoardComment) obj2;
                if (boardComment2 != null) {
                    boardTopicViewFragment.oo(i3, boardComment2, boardComment.c, boardComment.f);
                }
                boardTopicViewFragment.vo();
                boardTopicViewFragment.B0 = false;
                return s3q0.a;
            case 1:
                UserId userId = (UserId) obj3;
                qyg0 V0 = ((hyg0) obj).V0("SELECT * FROM story_statistics_info WHERE owner_id = ? AND story_id = ? LIMIT 1");
                try {
                    bpn0 bpn0Var = bfm0.a;
                    V0.bindLong(1, userId.b);
                    V0.bindLong(2, i3);
                    int k = egi.k(V0, "owner_id");
                    int k2 = egi.k(V0, "story_id");
                    int k3 = egi.k(V0, "storyStatisticsInfo");
                    if (V0.step()) {
                        UserId userId2 = new UserId(V0.getLong(k));
                        int i4 = (int) V0.getLong(k2);
                        efm0 efm0Var = (efm0) ((Gson) bfm0.a.getValue()).fromJson(V0.l2(k3), efm0.class);
                        if (efm0Var == null) {
                            throw new IllegalStateException("Expected NON-NULL 'com.vk.story.viewer.stat.`data`.cache.info.model.StoryStatisticsInfoDbModel', but it was NULL.");
                        }
                        obj2 = new ffm0(userId2, i4, efm0Var);
                    }
                    V0.close();
                    return obj2;
                } catch (Throwable th) {
                    V0.close();
                    throw th;
                }
            case 2:
                ConstraintLayout.b bVar = (ConstraintLayout.b) obj;
                bVar.k = wbp0.a((kmz) obj3);
                bVar.t = 0;
                bVar.v = 0;
                bVar.setMargins(i3, 0, i3, cn70.b(20));
                return s3q0.a;
            default:
                VkTabLayoutVh vkTabLayoutVh = (VkTabLayoutVh) obj3;
                TabLayout.g gVar = (TabLayout.g) obj;
                View invoke = vkTabLayoutVh.d.invoke(Integer.valueOf(gVar.e), Integer.valueOf(i3), gVar);
                vkTabLayoutVh.n.add(invoke);
                return invoke;
        }
    }
}

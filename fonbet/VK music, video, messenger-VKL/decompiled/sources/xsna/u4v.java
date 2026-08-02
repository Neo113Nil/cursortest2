package xsna;

import android.graphics.RectF;
import com.vk.core.view.components.paging.list.VkRecyclerPaginatedView;
import com.vk.dto.narratives.HighlightCover;
import com.vk.dto.stories.model.StoryEntry;

/* compiled from: HighlightEditContract.kt */
/* loaded from: classes3.dex */
public interface u4v extends gm6 {
    HighlightCover H6();

    void I5(int i, int i2);

    void L0(HighlightCover highlightCover);

    void O6(RectF rectF, String str);

    void R4(int i, RectF rectF);

    void o4(String str);

    void s0(StoryEntry storyEntry, boolean z);

    void t5(VkRecyclerPaginatedView vkRecyclerPaginatedView);
}

package xsna;

import com.vk.core.fragments.FragmentImpl;
import com.vk.dto.common.id.UserId;
import com.vk.dto.stories.entities.StoryCameraMode;
import com.vk.dto.stories.entities.StoryCameraTarget;
import com.vk.storycamera.builder.StoryCameraParams;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.collections.EmptyList;

/* compiled from: StoryTemplateNavigator.kt */
/* loaded from: classes6.dex */
public final class gjm0 {
    public final FragmentImpl a;
    public final StoryCameraParams b;

    public gjm0(FragmentImpl fragmentImpl, StoryCameraParams storyCameraParams) {
        this.a = fragmentImpl;
        this.b = storyCameraParams;
    }

    public final StoryCameraParams a() {
        StoryCameraParams storyCameraParams = this.b;
        if (storyCameraParams != null) {
            return storyCameraParams;
        }
        StoryCameraMode storyCameraMode = StoryCameraMode.STORY;
        ArrayList q = xa4.q();
        EmptyList emptyList = EmptyList.b;
        UserId userId = UserId.d;
        StoryCameraTarget storyCameraTarget = StoryCameraTarget.UNDEFINED;
        ArrayList arrayList = new ArrayList();
        Iterator it = q.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            emptyList.getClass();
            arrayList.add(next);
        }
        return new StoryCameraParams("", "new_story_avatar", storyCameraMode, arrayList, null, userId, null, null, null, null, false, false, null, storyCameraTarget, null, 0L, null, null, null, null, null, null, null, null, false, false, false, null, false, false, null, null, null, null, null, null, null, null, null, null, false, true, true, true, true, true, true, false, null, null, null, Boolean.valueOf(!fkq0.b(userId)), null, null, null, null, null, null, null, null, false, false, null, null, null, null, false, null, null, null, null, true, true, true, true, true, null, emptyList, false, null, null);
    }

    public final void b(int i, int i2) {
        if (i2 == -1 && i == 19470) {
            z1h0 parentFragment = this.a.getParentFragment();
            e6m0 e6m0Var = parentFragment instanceof e6m0 ? (e6m0) parentFragment : null;
            if (e6m0Var != null) {
                e6m0Var.onFinish();
            }
        }
    }
}

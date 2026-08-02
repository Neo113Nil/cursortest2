package xsna;

import com.vk.dto.stories.model.StoriesContainer;
import com.vk.dto.stories.model.StoryEntry;
import com.vk.profile.questions.impl.QuestionsListFragment;
import com.vkontakte.android.api.ExtendedCommunityProfile;
import java.util.ArrayList;
import java.util.List;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes5.dex */
public final /* synthetic */ class rzd0 implements bd70 {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ rzd0(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // xsna.bd70
    public final void x0(int i, int i2, Object obj) {
        ExtendedCommunityProfile g;
        ArrayList<StoriesContainer> arrayList;
        int i3 = this.b;
        Object obj2 = this.c;
        switch (i3) {
            case 0:
                vzd0 vzd0Var = (vzd0) obj2;
                List list = (List) obj;
                if (list != null && (g = vzd0Var.a.g()) != null && (arrayList = g.v1) != null) {
                    int size = arrayList.size();
                    for (int i4 = 0; i4 < size; i4++) {
                        StoriesContainer storiesContainer = arrayList.get(i4);
                        if (storiesContainer.Eb()) {
                            int size2 = storiesContainer.g.size();
                            for (int i5 = 0; i5 < size2; i5++) {
                                StoryEntry storyEntry = storiesContainer.g.get(i5);
                                if (list.contains(storyEntry)) {
                                    storyEntry.h = true;
                                    vzd0Var.b.a(arrayList);
                                    break;
                                }
                            }
                        }
                    }
                    break;
                }
                break;
            default:
                int intValue = ((Integer) obj).intValue();
                int i6 = QuestionsListFragment.f0;
                kqe0 kqe0Var = (kqe0) ((QuestionsListFragment) obj2).S;
                if (kqe0Var != null) {
                    kqe0Var.l5(intValue);
                    break;
                }
                break;
        }
    }
}

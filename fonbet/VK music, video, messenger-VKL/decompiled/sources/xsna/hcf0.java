package xsna;

import android.graphics.drawable.Drawable;
import com.vk.core.ui.image.VKImageController;
import com.vk.dto.common.id.UserId;
import com.vk.dto.stories.model.StoryEntry;
import com.vk.dto.stories.model.StoryViewAction;
import com.vkontakte.android.data.FriendsUtils;
import com.vkontakte.android.data.b;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class hcf0 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ hcf0(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                icf0 icf0Var = (icf0) this.c;
                lgb lgbVar = (lgb) this.d;
                fcf0 fcf0Var = icf0Var.m;
                if (fcf0Var == null) {
                    fcf0Var = null;
                }
                if (fcf0Var.c) {
                    lgbVar.i();
                } else {
                    lgbVar.k();
                }
                break;
            case 1:
                sul0 sul0Var = (sul0) this.c;
                List<? extends StoryEntry> list = (List) this.d;
                if (((Boolean) obj).booleanValue()) {
                    sul0Var.c.f(list);
                    List<? extends StoryEntry> list2 = list;
                    if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                        Iterator<T> it = list2.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                if (((StoryEntry) it.next()).R != null) {
                                    ((jfm0) sul0Var.e.getValue()).n(list);
                                }
                            }
                        }
                    }
                    sul0Var.b.e(100, list);
                }
                break;
            case 2:
                com.vk.story.viewer.impl.presentation.stories.b bVar = (com.vk.story.viewer.impl.presentation.stories.b) this.c;
                StoryViewAction storyViewAction = (StoryViewAction) this.d;
                b.d dVar = (b.d) obj;
                qo6 currentStoryView = bVar.getCurrentStoryView();
                boolean z = false;
                boolean z2 = currentStoryView != null && fsk.z(currentStoryView.getStoriesContainer());
                if (currentStoryView != null && currentStoryView.getCurrentStory() == null) {
                    z = true;
                }
                if (z2 && z) {
                    zwl0.a(dVar, storyViewAction);
                }
                break;
            case 3:
                izs izsVar = (izs) this.c;
                UserId userId = (UserId) this.d;
                if (izsVar != null) {
                    izsVar.invoke(userId);
                }
                FriendsUtils.d(0, userId);
                break;
            default:
                ((VKImageController) this.c).a((Drawable) obj, (VKImageController.b) this.d);
                break;
        }
        return s3q0.a;
    }
}

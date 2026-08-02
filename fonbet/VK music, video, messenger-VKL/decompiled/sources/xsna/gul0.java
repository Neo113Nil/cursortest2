package xsna;

import com.vk.dto.common.id.UserId;
import com.vk.dto.stories.model.StoriesContainer;
import com.vk.dto.stories.model.StoryEntryExtended;
import java.util.ArrayList;

/* compiled from: StoriesRearranger.kt */
/* loaded from: classes11.dex */
public interface gul0 {

    /* compiled from: StoriesRearranger.kt */
    /* loaded from: classes6.dex */
    public static final class a {
        public static final /* synthetic */ a a = new a();
        private static final gul0 STUB = new C2958a();

        /* compiled from: StoriesRearranger.kt */
        /* renamed from: xsna.gul0$a$a, reason: collision with other inner class name */
        public static final class C2958a implements gul0 {
            @Override // xsna.gul0
            public final ArrayList<StoriesContainer> a(ArrayList<StoriesContainer> arrayList, StoryEntryExtended storyEntryExtended, boolean z, boolean z2) {
                return new ArrayList<>();
            }

            @Override // xsna.gul0
            public final ArrayList b(UserId userId, ArrayList arrayList) {
                return new ArrayList();
            }
        }

        public final gul0 getSTUB() {
            return STUB;
        }
    }

    ArrayList<StoriesContainer> a(ArrayList<StoriesContainer> arrayList, StoryEntryExtended storyEntryExtended, boolean z, boolean z2);

    ArrayList b(UserId userId, ArrayList arrayList);
}

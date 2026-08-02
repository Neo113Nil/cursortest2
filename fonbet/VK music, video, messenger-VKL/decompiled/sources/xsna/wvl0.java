package xsna;

import com.vk.dto.stories.model.StoriesContainer;
import com.vk.lists.ListDataSet;
import java.util.ArrayList;
import java.util.List;

/* compiled from: StoriesUtil.kt */
/* loaded from: classes6.dex */
public interface wvl0 {
    public static final a a = a.a;

    int a(StoriesContainer storiesContainer, int i);

    ArrayList<StoriesContainer> b(List<? extends StoriesContainer> list);

    ArrayList<StoriesContainer> c(List<? extends StoriesContainer> list);

    StoriesContainer e(String str, List list);

    ArrayList f(StoriesContainer storiesContainer, ListDataSet.ArrayListImpl arrayListImpl);

    /* compiled from: StoriesUtil.kt */
    public static final class a {
        public static final /* synthetic */ a a = new a();
        private static final wvl0 STUB = new C3960a();

        public final wvl0 getSTUB() {
            return STUB;
        }

        /* compiled from: StoriesUtil.kt */
        /* renamed from: xsna.wvl0$a$a, reason: collision with other inner class name */
        public static final class C3960a implements wvl0 {
            @Override // xsna.wvl0
            public final int a(StoriesContainer storiesContainer, int i) {
                return 0;
            }

            @Override // xsna.wvl0
            public final ArrayList<StoriesContainer> b(List<? extends StoriesContainer> list) {
                return new ArrayList<>();
            }

            @Override // xsna.wvl0
            public final ArrayList<StoriesContainer> c(List<? extends StoriesContainer> list) {
                return new ArrayList<>();
            }

            @Override // xsna.wvl0
            public final StoriesContainer e(String str, List list) {
                return null;
            }

            @Override // xsna.wvl0
            public final ArrayList f(StoriesContainer storiesContainer, ListDataSet.ArrayListImpl arrayListImpl) {
                return new ArrayList();
            }

            @Override // xsna.wvl0
            public final void d() {
            }
        }
    }

    default void d() {
    }
}

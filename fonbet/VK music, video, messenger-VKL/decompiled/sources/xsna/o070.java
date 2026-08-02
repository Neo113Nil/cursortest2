package xsna;

import com.vk.dto.stories.model.GetStoriesResponse;
import com.vk.dto.stories.model.StoriesContainer;
import com.vk.dto.stories.model.StubAddStoriesContainer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;

/* compiled from: NewsfeedStoriesUiDto.kt */
/* loaded from: classes4.dex */
public final class o070 extends ol60 {
    public final ArrayList<StoriesContainer> h;
    public final k070 i;

    public o070(ArrayList<StoriesContainer> arrayList, k070 k070Var) {
        super(1101, 0, 0, 6, null);
        this.h = arrayList;
        this.i = k070Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!o070.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        GetStoriesResponse getStoriesResponse = this.i.a;
        GetStoriesResponse getStoriesResponse2 = ((o070) obj).i.a;
        if (Objects.equals(getStoriesResponse != null ? Integer.valueOf(getStoriesResponse.b) : null, getStoriesResponse2 != null ? Integer.valueOf(getStoriesResponse2.b) : null)) {
            if (Objects.equals(getStoriesResponse != null ? getStoriesResponse.d : null, getStoriesResponse2 != null ? getStoriesResponse2.d : null)) {
                if (Objects.equals(getStoriesResponse != null ? getStoriesResponse.e : null, getStoriesResponse2 != null ? getStoriesResponse2.e : null)) {
                    if (Objects.equals(getStoriesResponse != null ? getStoriesResponse.f : null, getStoriesResponse2 != null ? getStoriesResponse2.f : null)) {
                        ArrayList<StoriesContainer> arrayList = getStoriesResponse != null ? getStoriesResponse.c : null;
                        ArrayList<StoriesContainer> arrayList2 = getStoriesResponse2 != null ? getStoriesResponse2.c : null;
                        if (arrayList == null && arrayList2 == null) {
                            return true;
                        }
                        if (arrayList != null && arrayList2 != null) {
                            if (!arrayList2.isEmpty() || !arrayList.isEmpty()) {
                                if (!arrayList2.isEmpty() && !arrayList.isEmpty() && arrayList2.size() == arrayList.size()) {
                                    int size = arrayList.size();
                                    for (int i = 0; i < size; i++) {
                                        StoriesContainer storiesContainer = arrayList.get(i);
                                        StoriesContainer storiesContainer2 = arrayList2.get(i);
                                        if (((storiesContainer instanceof StubAddStoriesContainer) && (storiesContainer2 instanceof StubAddStoriesContainer)) || epx.f(storiesContainer, storiesContainer2)) {
                                        }
                                    }
                                }
                            }
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        GetStoriesResponse getStoriesResponse = this.i.a;
        if (getStoriesResponse == null) {
            return 0;
        }
        int hash = Objects.hash(getStoriesResponse.e, getStoriesResponse.f, Integer.valueOf(getStoriesResponse.b), getStoriesResponse.d);
        ArrayList<StoriesContainer> arrayList = getStoriesResponse.c;
        if (arrayList != null) {
            Iterator<StoriesContainer> it = arrayList.iterator();
            while (it.hasNext()) {
                StoriesContainer next = it.next();
                if (!(next instanceof StubAddStoriesContainer)) {
                    hash = (hash * 31) + next.hashCode();
                }
            }
        }
        return hash;
    }
}

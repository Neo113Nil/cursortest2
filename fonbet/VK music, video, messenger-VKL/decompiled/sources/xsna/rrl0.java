package xsna;

import com.vk.dto.stories.model.StoriesContainer;

/* compiled from: StoriesContainerItem.kt */
/* loaded from: classes6.dex */
public final class rrl0 implements hfz {
    public final StoriesContainer b;

    public rrl0(StoriesContainer storiesContainer) {
        this.b = storiesContainer;
    }

    @Override // xsna.hfz
    public final Number getItemId() {
        return Integer.valueOf((int) this.b.Ab().b);
    }
}

package xsna;

import android.view.ViewGroup;
import com.vk.dto.stories.model.StoriesContainer;
import com.vkontakte.android.R;

/* compiled from: AddStoryHolder.kt */
/* loaded from: classes6.dex */
public final class sn0 extends vif0<StoriesContainer> {
    public static final /* synthetic */ int o = 0;
    public final String n;

    public sn0(String str, int i, ViewGroup viewGroup) {
        super(viewGroup, i, 0);
        this.n = str;
        bwt0.i0(this.itemView.findViewById(R.id.story_new_item_click_handler), new ec(this, 2));
    }

    @Override // xsna.vif0
    public final /* bridge */ /* synthetic */ void i6(StoriesContainer storiesContainer) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e0
    public final String toString() {
        return "AddStoryHolder " + super.toString();
    }
}

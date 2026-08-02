package xsna;

import android.content.Context;
import com.vk.dto.common.id.UserId;
import com.vk.dto.stories.model.StoriesContainer;
import com.vkontakte.android.R;

/* compiled from: StoriesContainerPopupActionsBuilder.kt */
/* loaded from: classes6.dex */
public final class srl0 {
    public final Context a;
    public final xsl0 b;
    public final or1 c;
    public boolean d;
    public StoriesContainer e;

    public srl0(Context context, xsl0 xsl0Var) {
        this.a = context;
        this.b = xsl0Var;
        this.c = new or1(context);
    }

    public final androidx.appcompat.app.d a() {
        StoriesContainer storiesContainer = this.e;
        or1 or1Var = this.c;
        if (storiesContainer != null) {
            UserId Ab = storiesContainer.Ab();
            or1Var.a(fkq0.d(storiesContainer.Ab()) ? R.string.open_profile : R.string.open_community, new zs6(6, this, storiesContainer));
            if (this.d) {
                or1Var.a(R.string.hide_from_stories, new qny(this, Ab, storiesContainer, 3));
            }
        }
        return or1Var.d();
    }
}

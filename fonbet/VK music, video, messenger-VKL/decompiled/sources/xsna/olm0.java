package xsna;

import android.view.View;
import com.vk.dto.common.id.UserId;
import com.vk.dto.stories.model.StoriesContainer;
import xsna.o0r0;

/* compiled from: StoryViewContainer.java */
/* loaded from: classes6.dex */
public final class olm0 implements View.OnClickListener {
    public final /* synthetic */ StoriesContainer b;
    public final /* synthetic */ com.vk.story.viewer.impl.presentation.stories.b c;

    public olm0(com.vk.story.viewer.impl.presentation.stories.b bVar, StoriesContainer storiesContainer) {
        this.c = bVar;
        this.b = storiesContainer;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        UserId Ab = this.b.Ab();
        if (Ab.b != 0) {
            xwk.e().m(this.c.getContext(), Ab, new o0r0.a(true, null, null, null, null, null, null, false, false, false, false, null, null, null, 65534));
        }
    }
}

package xsna;

import com.vk.core.serialize.Serializer;
import com.vk.dto.newsfeed.entries.Post;
import com.vk.dto.stories.model.StoryEntry;
import com.vk.dto.stories.model.StoryOwner;
import com.vk.log.L;
import com.vk.log.LoggerOutputTarget;
import com.vk.newsfeed.presentation.model.actions.NewsfeedExternalAction;
import com.vkontakte.android.R;
import xsna.yo60;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class hr60 implements io.reactivex.rxjava3.functions.a {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Serializer.StreamParcelableAdapter d;

    public /* synthetic */ hr60(int i, Serializer.StreamParcelableAdapter streamParcelableAdapter, Object obj) {
        this.b = i;
        this.c = obj;
        this.d = streamParcelableAdapter;
    }

    @Override // io.reactivex.rxjava3.functions.a
    public final void run() {
        switch (this.b) {
            case 0:
                kr60 kr60Var = (kr60) this.c;
                kr60Var.c(new yo60.h(new NewsfeedExternalAction.c.b((Post) this.d)));
                kr60Var.c(new yo60.g.c(R.string.post_added_to_archive));
                break;
            default:
                smm0 smm0Var = (smm0) this.c;
                StoryEntry storyEntry = (StoryEntry) this.d;
                L l = L.a;
                l.getClass();
                if (!L.m(LoggerOutputTarget.NONE)) {
                    L.LogType logType = L.LogType.d;
                    StringBuilder sb = new StringBuilder("success preload video=");
                    sb.append(storyEntry.Kb());
                    sb.append(" | owner=");
                    StoryOwner storyOwner = storyEntry.l0;
                    sb.append(storyOwner != null ? storyOwner.Db() : null);
                    L.u(l, logType, new Object[]{sb.toString()});
                }
                vrl0 vrl0Var = smm0Var.b.get();
                if (vrl0Var != null) {
                    vrl0Var.h(smm0Var.a.b(), storyEntry, false, Boolean.FALSE);
                    break;
                }
                break;
        }
    }
}

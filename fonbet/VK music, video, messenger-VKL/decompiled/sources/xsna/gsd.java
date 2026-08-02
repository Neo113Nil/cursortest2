package xsna;

import android.content.DialogInterface;
import com.vk.camera.clips.core.drafts.ClipsDraftPersistentStore;
import com.vk.profile.user.impl.UserProfileDialogs;
import com.vk.profile.user.impl.ui.UserProfileAction;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.stories.analytics.StoryPublishEvent;
import xsna.am9;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class gsd implements DialogInterface.OnClickListener {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ gsd(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        switch (this.b) {
            case 0:
                ((lsd) this.c).getClass();
                ClipsDraftPersistentStore clipsDraftPersistentStore = ClipsDraftPersistentStore.b;
                ve0 ve0Var = new ve0(13);
                clipsDraftPersistentStore.getClass();
                ClipsDraftPersistentStore.o(ve0Var);
                nf9 nf9Var = nf9.b;
                am9.a aVar = new am9.a();
                aVar.j = com.vk.stat.scheme.t0.a(MobileOfficialAppsCoreNavStat$EventScreen.STORY_CAMERA_CLIPS);
                nf9.b(nf9Var, StoryPublishEvent.DELETE_DRAFT, aVar, null, null, true, null, 108).e();
                break;
            default:
                ((UserProfileDialogs) this.c).a.a(UserProfileAction.s.g.a.b);
                break;
        }
    }
}

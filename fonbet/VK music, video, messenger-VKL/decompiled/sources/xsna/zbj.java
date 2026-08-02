package xsna;

import com.vk.contacts.ContactSyncState;
import com.vk.dto.stories.model.StoryEntry;
import com.vk.im.engine.models.attaches.AttachStory;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class zbj implements izs {
    public final /* synthetic */ int b;

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                com.vk.contacts.c cVar = com.vk.contacts.c.b;
                if (!com.vk.contacts.c.b()) {
                    com.vk.contacts.c.i(ContactSyncState.NOT_PERMITTED);
                }
                break;
            default:
                AttachStory attachStory = new AttachStory((StoryEntry) obj, 0, null, null, null, null, null, null, 0L, 510, null);
                a1w a1wVar = i2w.c;
                if (a1wVar == null) {
                    a1wVar = null;
                }
                a1wVar.D(i2w.a, new ppx(attachStory));
                break;
        }
        return s3q0.a;
    }
}

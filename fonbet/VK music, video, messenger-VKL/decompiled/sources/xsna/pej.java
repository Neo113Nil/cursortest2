package xsna;

import com.vk.dto.stories.model.StoryEntry;
import com.vk.httpexecutor.api.NetworkClient;
import com.vk.im.engine.models.attaches.AttachStory;
import xsna.oxc0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class pej implements izs {
    public final /* synthetic */ int b;

    public /* synthetic */ pej(int i) {
        this.b = i;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                oxc0.a aVar = (oxc0.a) obj;
                qej qejVar = new qej(0);
                aVar.getClass();
                qejVar.invoke(aVar);
                break;
            case 1:
                StoryEntry storyEntry = (StoryEntry) obj;
                i2w i2wVar = i2w.a;
                AttachStory attachStory = new AttachStory(storyEntry, 0, null, null, null, null, null, null, 0L, 510, null);
                a1w a1wVar = i2w.c;
                if (a1wVar == null) {
                    a1wVar = null;
                }
                a1wVar.D(i2wVar, new z0g0(attachStory));
                break;
            case 2:
                if (((NetworkClient.ClientType) obj) == NetworkClient.ClientType.CLIENT_IMAGE_LOADER) {
                    break;
                }
                break;
            default:
                vx2.d.getClass();
                break;
        }
        return s3q0.a;
    }

    public /* synthetic */ pej(rsg0 rsg0Var) {
        this.b = 3;
    }
}

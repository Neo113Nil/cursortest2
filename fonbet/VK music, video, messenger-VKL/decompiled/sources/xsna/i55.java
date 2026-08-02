package xsna;

import android.os.Parcelable;
import com.vk.auth.api.models.AuthResult;
import com.vk.auth.main.VkAuthMetaInfo;
import com.vk.dto.common.id.UserId;
import com.vk.dto.stories.model.StoryEntry;
import com.vk.superapp.api.analytics.RegistrationStatParamsFactory;
import java.util.Collections;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes15.dex */
public final /* synthetic */ class i55 implements io.reactivex.rxjava3.functions.a {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Parcelable d;
    public final /* synthetic */ Object e;

    public /* synthetic */ i55(int i, Parcelable parcelable, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = parcelable;
        this.e = obj2;
    }

    @Override // io.reactivex.rxjava3.functions.a
    public final void run() {
        switch (this.b) {
            case 0:
                VkAuthMetaInfo vkAuthMetaInfo = (VkAuthMetaInfo) this.c;
                AuthResult authResult = (AuthResult) this.d;
                new p15(vkAuthMetaInfo, authResult, true, RegistrationStatParamsFactory.b).c((UserId) this.e, authResult.d);
                break;
            default:
                ctl0 ctl0Var = (ctl0) this.c;
                StoryEntry storyEntry = (StoryEntry) this.d;
                ctl0Var.d.e(Collections.singletonList(storyEntry), new dnh0(2, storyEntry, (Integer) this.e));
                break;
        }
    }
}

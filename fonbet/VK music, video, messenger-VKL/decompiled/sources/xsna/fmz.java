package xsna;

import android.content.Context;
import android.os.Parcelable;
import com.vk.dto.common.id.UserId;
import com.vk.dto.stories.model.StoryEntry;
import com.vkontakte.android.R;
import com.vungle.ads.internal.protos.Sdk;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class fmz implements io.reactivex.rxjava3.functions.a {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Parcelable d;

    public /* synthetic */ fmz(Object obj, Parcelable parcelable, int i) {
        this.b = i;
        this.c = obj;
        this.d = parcelable;
    }

    @Override // io.reactivex.rxjava3.functions.a
    public final void run() {
        switch (this.b) {
            case 0:
                gmz gmzVar = (gmz) this.c;
                UserId userId = (UserId) this.d;
                elm0 elm0Var = gmzVar.b;
                if (elm0Var != null) {
                    elm0Var.q(gmzVar.getStoriesContainer());
                }
                int i = fkq0.d(userId) ? R.string.user_has_been_hidden_from_stories : R.string.community_has_been_hidden_from_stories;
                Context context = gmzVar.getContext();
                cmf0.d(context, gmzVar.getWindow(), context.getString(i), false, (56 & 16) != 0 ? iah0.a(88) : 0, (56 & 32) != 0);
                break;
            default:
                ((ctl0) this.c).b.e(Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE, (StoryEntry) this.d);
                break;
        }
    }
}

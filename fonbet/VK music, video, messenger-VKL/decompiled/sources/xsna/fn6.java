package xsna;

import android.os.Parcelable;
import com.vk.dto.common.id.UserId;
import com.vk.dto.group.Group;
import com.vk.dto.newsfeed.entries.Post;
import com.vk.newsfeed.api.posting.PostingCreationEntryPoint;
import com.vk.sharing.im_engine_impl.BaseSharingExternalActivity;
import java.util.List;
import xsna.yo60;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes5.dex */
public final /* synthetic */ class fn6 implements io.reactivex.rxjava3.functions.f {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Parcelable d;
    public final /* synthetic */ Object e;

    public /* synthetic */ fn6(int i, Parcelable parcelable, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = parcelable;
        this.e = obj2;
    }

    @Override // io.reactivex.rxjava3.functions.f
    public final void accept(Object obj) {
        switch (this.b) {
            case 0:
                BaseSharingExternalActivity.h hVar = (BaseSharingExternalActivity.h) this.c;
                UserId userId = (UserId) this.d;
                String str = (String) this.e;
                List list = (List) obj;
                BaseSharingExternalActivity baseSharingExternalActivity = BaseSharingExternalActivity.this;
                if (!myc0.f(str)) {
                    str = hVar.e;
                }
                BaseSharingExternalActivity.d2(baseSharingExternalActivity, userId, str, list);
                break;
            default:
                ((br60) this.c).c(new yo60.f.s.d((Post) this.d, (Group) obj, (PostingCreationEntryPoint) this.e));
                break;
        }
    }
}

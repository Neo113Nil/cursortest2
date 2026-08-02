package xsna;

import com.vk.dto.common.data.VKList;
import com.vk.dto.photo.Photo;
import com.vkontakte.android.api.ExtendedUserProfile;
import kotlin.collections.builders.ListBuilder;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes5.dex */
public final /* synthetic */ class leh implements io.reactivex.rxjava3.functions.n {
    public final /* synthetic */ neh b;
    public final /* synthetic */ int c;
    public final /* synthetic */ ExtendedUserProfile d;

    public /* synthetic */ leh(neh nehVar, int i, ExtendedUserProfile extendedUserProfile) {
        this.b = nehVar;
        this.c = i;
        this.d = extendedUserProfile;
    }

    @Override // io.reactivex.rxjava3.functions.n
    public final Object get() {
        neh nehVar = this.b;
        VKList<Photo> vKList = nehVar.d;
        if (vKList == null) {
            return io.reactivex.rxjava3.core.q.H(new IllegalStateException("Avatar album is not loaded"));
        }
        ListBuilder c = neh.c(vKList);
        boolean z = vKList.size() >= vKList.i();
        int h = e43.h(c);
        int i = this.c;
        if (h >= i || z) {
            return io.reactivex.rxjava3.core.q.T(vKList);
        }
        ExtendedUserProfile extendedUserProfile = this.d;
        return nehVar.b(extendedUserProfile, false).L(new y7(new xva(nehVar, extendedUserProfile, i, 1), 9), false);
    }
}

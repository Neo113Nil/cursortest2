package xsna;

import com.vk.dto.common.data.VKList;
import com.vkontakte.android.api.ExtendedUserProfile;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes5.dex */
public final /* synthetic */ class jeh implements izs {
    public final /* synthetic */ neh b;
    public final /* synthetic */ int c;
    public final /* synthetic */ ExtendedUserProfile d;

    public /* synthetic */ jeh(neh nehVar, int i, ExtendedUserProfile extendedUserProfile) {
        this.b = nehVar;
        this.c = i;
        this.d = extendedUserProfile;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        VKList vKList = (VKList) obj;
        int h = e43.h(neh.c(vKList));
        int i = this.c;
        return (h >= i || vKList.size() >= vKList.i()) ? io.reactivex.rxjava3.core.q.T(vKList) : new io.reactivex.rxjava3.internal.operators.observable.t(new leh(this.b, i, this.d));
    }
}

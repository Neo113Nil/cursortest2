package xsna;

import com.vk.im.engine.models.ProfilesSimpleInfo;

/* compiled from: ExtendedResponse.kt */
/* loaded from: classes2.dex */
public abstract class dcq<T> {
    public final T a;

    /* JADX WARN: Multi-variable type inference failed */
    public dcq(dux0 dux0Var) {
        this.a = dux0Var;
    }

    public static /* synthetic */ Object b(dcq dcqVar, w2w w2wVar, ProfilesSimpleInfo profilesSimpleInfo, int i) {
        if ((i & 2) != 0) {
            profilesSimpleInfo = new ProfilesSimpleInfo();
        }
        return dcqVar.a(w2wVar, profilesSimpleInfo, new d9j(dcqVar, 6));
    }

    public abstract Object a(w2w w2wVar, ProfilesSimpleInfo profilesSimpleInfo, d9j d9jVar);
}

package xsna;

import com.vk.dto.common.data.VkAppsList;
import com.vk.superapp.miniapp.MenuApiApplicationsCache;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class etb implements io.reactivex.rxjava3.functions.f {
    public final /* synthetic */ int b;

    @Override // io.reactivex.rxjava3.functions.f
    public final void accept(Object obj) {
        switch (this.b) {
            case 0:
                s3q0 s3q0Var = s3q0.a;
                break;
            case 1:
                MenuApiApplicationsCache.h.onNext((VkAppsList) obj);
                break;
            default:
                s3q0 s3q0Var2 = s3q0.a;
                break;
        }
    }
}

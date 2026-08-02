package xsna;

import com.vk.superapp.vkhealth.permissions.api.type.PermissionsResult;
import com.vkontakte.android.R;
import java.util.List;

/* compiled from: PodcastEpisodeFragment.kt */
/* loaded from: classes3.dex */
public final class xgb0 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ xgb0(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        int i = this.b;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                t6g0 t6g0Var = t6g0.b;
                t6g0.b().a();
                ((com.vk.movika.sdk.base.ui.r0) obj2).invoke();
                cvk.u(R.string.group_subscribed, false);
                return s3q0.a;
            case 1:
                ((List) obj2).get(((Number) obj).intValue());
                return null;
            default:
                ((gzg0) obj2).resumeWith((PermissionsResult) obj);
                return s3q0.a;
        }
    }
}

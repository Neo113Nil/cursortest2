package xsna;

import android.location.Location;
import com.vk.core.fragments.FragmentImpl;
import com.vk.webapp.community_picker.AppsCommunityPickerFragment;
import com.vungle.ads.internal.protos.Sdk;
import java.util.List;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class d720 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ List c;

    public /* synthetic */ d720(List list, int i) {
        this.b = i;
        this.c = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.izs
    public final Object invoke(Object obj) {
        int i = this.b;
        List list = this.c;
        switch (i) {
            case 0:
                k720 k720Var = k720.a;
                return k720.I((Location) ((it80) obj).a, list);
            default:
                AppsCommunityPickerFragment.b bVar = new AppsCommunityPickerFragment.b(AppsCommunityPickerFragment.class, null, null);
                bVar.j.putParcelableArrayList("groups", p4g.q(list));
                bVar.g(Sdk.SDKError.Reason.INVALID_REQUEST_BUILDER_ERROR_VALUE, (FragmentImpl) obj);
                return s3q0.a;
        }
    }
}

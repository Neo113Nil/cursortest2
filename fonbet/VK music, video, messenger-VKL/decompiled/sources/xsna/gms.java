package xsna;

import android.app.Activity;
import com.vk.catalog2.common.ui.mvp.friend.FriendsCatalogFragment;
import com.vk.catalog2.common.ui.mvp.holder.friends.FriendsCatalogRootVh;
import com.vk.search.params.api.VkPeopleSearchParams;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class gms implements gzs {
    public final /* synthetic */ FriendsCatalogRootVh b;
    public final /* synthetic */ xsh0 c;
    public final /* synthetic */ Activity d;
    public final /* synthetic */ FriendsCatalogFragment e;

    public /* synthetic */ gms(FriendsCatalogRootVh friendsCatalogRootVh, xsh0 xsh0Var, Activity activity, FriendsCatalogFragment friendsCatalogFragment) {
        this.b = friendsCatalogRootVh;
        this.c = xsh0Var;
        this.d = activity;
        this.e = friendsCatalogFragment;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.gzs
    public final Object invoke() {
        FriendsCatalogRootVh friendsCatalogRootVh = this.b;
        ?? r1 = friendsCatalogRootVh.p;
        VkPeopleSearchParams vkPeopleSearchParams = friendsCatalogRootVh.v;
        boolean booleanValue = ((Boolean) r1.getValue()).booleanValue();
        Activity activity = this.d;
        FriendsCatalogFragment friendsCatalogFragment = this.e;
        if (booleanValue) {
            this.c.a(activity.getBaseContext(), friendsCatalogFragment.getChildFragmentManager(), vkPeopleSearchParams);
        } else {
            ams.a().c(activity, friendsCatalogFragment.getChildFragmentManager(), vkPeopleSearchParams);
        }
        return s3q0.a;
    }
}

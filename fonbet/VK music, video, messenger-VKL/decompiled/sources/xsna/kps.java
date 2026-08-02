package xsna;

import com.vk.dto.common.data.VKFromList;
import com.vk.friends.recommendations.impl.presentation.FriendsImportFragment;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class kps implements izs {
    public final /* synthetic */ com.vk.lists.c b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ FriendsImportFragment d;

    public /* synthetic */ kps(com.vk.lists.c cVar, boolean z, FriendsImportFragment friendsImportFragment) {
        this.b = cVar;
        this.c = z;
        this.d = friendsImportFragment;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        VKFromList vKFromList = (VKFromList) obj;
        int i = FriendsImportFragment.a0;
        String i2 = vKFromList.i();
        com.vk.lists.c cVar = this.b;
        cVar.s(i2);
        String i3 = vKFromList.i();
        cVar.r((i3 == null || i3.length() == 0 || vKFromList.isEmpty()) ? false : true);
        boolean z = this.c;
        FriendsImportFragment friendsImportFragment = this.d;
        if (z) {
            friendsImportFragment.jo().setItems(vKFromList);
        } else {
            friendsImportFragment.jo().n0(vKFromList);
        }
        return s3q0.a;
    }
}

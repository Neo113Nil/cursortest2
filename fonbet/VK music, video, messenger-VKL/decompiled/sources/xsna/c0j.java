package xsna;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import com.vk.dto.common.id.UserId;
import com.vk.ecomm.configureitemlist.ConfigureItemListFragment;
import java.util.ArrayList;

/* compiled from: ConfigureItemListRouterImpl.kt */
/* loaded from: classes18.dex */
public final class c0j implements b0j {
    @Override // xsna.b0j
    public final Intent a(Context context, ArrayList arrayList, UserId userId) {
        ConfigureItemListFragment.a aVar = new ConfigureItemListFragment.a(ConfigureItemListFragment.class, null, null);
        ArrayList<? extends Parcelable> q = p4g.q(arrayList);
        Bundle bundle = aVar.j;
        bundle.putParcelableArrayList("extra_item_list", q);
        bundle.putParcelable("key_current_group_id", userId);
        return aVar.n(context);
    }
}

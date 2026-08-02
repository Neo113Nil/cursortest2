package xsna;

import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import androidx.fragment.app.FragmentManager;
import com.vk.antispam.SpamAction;
import com.vk.antispam.SpammerModel;
import java.util.List;
import kotlin.collections.EmptyList;
import xsna.vv2;

/* compiled from: AntispamRouterImpl.kt */
/* loaded from: classes14.dex */
public final class dw2 implements cw2 {
    @Override // xsna.cw2
    public final tv2 a(Bundle bundle) {
        int i = vv2.j1;
        List parcelableArrayList = Build.VERSION.SDK_INT >= 33 ? bundle.getParcelableArrayList("selected_actions", SpamAction.class) : bundle.getParcelableArrayList("selected_actions");
        if (parcelableArrayList == null) {
            parcelableArrayList = EmptyList.b;
        }
        return new tv2(parcelableArrayList);
    }

    @Override // xsna.cw2
    public final void b(FragmentManager fragmentManager, Context context, SpammerModel spammerModel) {
        new vv2.a(context, spammerModel).H0(fragmentManager, "AntispamBottomSheetTag");
    }
}

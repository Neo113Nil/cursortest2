package xsna;

import com.vk.core.view.components.group.header.VkGroupHeader;
import com.vk.voip.ui.calls.presentation.feature.handler.VoipCallServiceBannerHandler;
import com.vk.voip.ui.calls.presentation.model.list.FriendItem;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.tlo0;
import xsna.vhw0;
import xsna.yiw0;

/* compiled from: VoipCallServiceReducer.kt */
/* loaded from: classes7.dex */
public final /* synthetic */ class siw0 extends FunctionReferenceImpl implements izs<yiw0.d, List<Object>> {
    @Override // xsna.izs
    public final List<Object> invoke(yiw0.d dVar) {
        hfz hfzVar;
        yiw0.d dVar2 = dVar;
        ((viw0) this.receiver).getClass();
        ArrayList arrayList = new ArrayList();
        VoipCallServiceBannerHandler.a aVar = dVar2.b;
        List<FriendItem> list = dVar2.c;
        String str = null;
        if (aVar instanceof VoipCallServiceBannerHandler.a.C2038a) {
            hfzVar = vhw0.a.b;
        } else if (aVar instanceof VoipCallServiceBannerHandler.a.c) {
            hfzVar = a8j.b;
        } else {
            if (!(aVar instanceof VoipCallServiceBannerHandler.a.b)) {
                throw new NoWhenBranchMatchedException();
            }
            hfzVar = null;
        }
        if (hfzVar != null) {
            arrayList.add(hfzVar);
        }
        int i = !epx.f(aVar, VoipCallServiceBannerHandler.a.c.a) ? R.string.voip_vkapp_services_primary_header_friends : R.string.voip_vkapp_services_primary_header_all;
        arrayList.add(list.isEmpty() ? new jku(tq.h(tlo0.Companion, i), VkGroupHeader.Size.Medium) : new now0(tq.h(tlo0.Companion, i), new tlo0.f(R.string.voip_history_friends_header_important)));
        g5g.y(list, arrayList);
        for (FriendItem friendItem : dVar2.d) {
            String upperCase = String.valueOf(erm0.x0(friendItem.c)).toUpperCase(Locale.ROOT);
            if (!upperCase.equals(str)) {
                arrayList.add(new jku(oq.d(tlo0.Companion, upperCase), VkGroupHeader.Size.Small));
                str = upperCase;
            }
            arrayList.add(friendItem);
        }
        return arrayList;
    }
}

package xsna;

import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.stat.scheme.SchemeStat$EventItem;
import com.vk.stat.scheme.SchemeStat$TypeChannelItem;
import java.util.Collections;
import java.util.List;
import kotlin.collections.EmptyList;
import xsna.hzp0;
import xsna.wyv;

/* compiled from: ImChannelUiViewTracker.kt */
/* loaded from: classes2.dex */
public final class vyv extends d680<wyv.a> {
    public final /* synthetic */ MobileOfficialAppsCoreNavStat$EventScreen b;

    public vyv(MobileOfficialAppsCoreNavStat$EventScreen mobileOfficialAppsCoreNavStat$EventScreen) {
        this.b = mobileOfficialAppsCoreNavStat$EventScreen;
    }

    @Override // xsna.d680
    public final List j(wyv.a aVar) {
        wyv.a aVar2 = aVar;
        String str = aVar2.a;
        if (str == null) {
            return EmptyList.b;
        }
        SchemeStat$EventItem schemeStat$EventItem = new SchemeStat$EventItem(SchemeStat$EventItem.Type.CHANNEL, null, null, null, str, null, 46, null);
        int i = aVar2.b;
        return Collections.singletonList(new hzp0.e(schemeStat$EventItem, this.b, new SchemeStat$TypeChannelItem(aVar2.c), i));
    }
}

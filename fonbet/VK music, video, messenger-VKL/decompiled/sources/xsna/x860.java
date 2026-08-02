package xsna;

import android.content.Context;
import com.vk.core.ui.tracking.UiTracker;
import com.vk.stat.scheme.MobileOfficialAppsStoriesStat$TypeStoryPublishItem;

/* compiled from: NewStoryPickerHandler.kt */
/* loaded from: classes7.dex */
public final class x860 implements fhd0, lao0 {
    @Override // xsna.g9l
    public final void a(fgx fgxVar) {
        Context context = fgxVar.e;
        String a = fgxVar.a("section");
        if (a == null) {
            a = "";
        }
        if (a.equals("templates")) {
            spl0 a2 = b6m.a();
            UiTracker uiTracker = UiTracker.a;
            a2.o(context, UiTracker.c(), MobileOfficialAppsStoriesStat$TypeStoryPublishItem.CreationEntryPoint.LINK);
        } else {
            spl0 a3 = b6m.a();
            UiTracker uiTracker2 = UiTracker.a;
            a3.m(context, UiTracker.c(), MobileOfficialAppsStoriesStat$TypeStoryPublishItem.CreationEntryPoint.LINK);
        }
        blk.P(fgxVar).onSuccess();
    }
}

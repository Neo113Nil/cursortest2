package xsna;

import com.vk.core.ui.tracking.UiTracker;
import com.vk.im.engine.models.dialogs.FolderType;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.stat.scheme.MobileOfficialAppsImStat$TypeImCounterSettingsClick;
import com.vk.stat.scheme.SchemeStat$EventItem;
import com.vk.stat.scheme.SchemeStat$TypeClick;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class jg70 implements io.reactivex.rxjava3.functions.a {
    public final /* synthetic */ int b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Object d;

    public /* synthetic */ jg70(Object obj, boolean z, int i) {
        this.b = i;
        this.d = obj;
        this.c = z;
    }

    @Override // io.reactivex.rxjava3.functions.a
    public final void run() {
        MobileOfficialAppsImStat$TypeImCounterSettingsClick.Label label;
        int i = this.b;
        boolean z = this.c;
        Object obj = this.d;
        switch (i) {
            case 0:
                FolderType folderType = (FolderType) obj;
                MobileOfficialAppsImStat$TypeImCounterSettingsClick.Event event = z ? MobileOfficialAppsImStat$TypeImCounterSettingsClick.Event.COUNTER_ENABLED : MobileOfficialAppsImStat$TypeImCounterSettingsClick.Event.COUNTER_DISABLED;
                int i2 = txj.$EnumSwitchMapping$0[folderType.ordinal()];
                if (i2 == 1) {
                    label = MobileOfficialAppsImStat$TypeImCounterSettingsClick.Label.CHANNEL_COUNTER_MANUAL;
                } else {
                    if (i2 != 2) {
                        throw new IllegalArgumentException("Unsupported folder item type : " + folderType + " for event tracking");
                    }
                    label = MobileOfficialAppsImStat$TypeImCounterSettingsClick.Label.COMMUNITIES_COUNTER_MANUAL;
                }
                SchemeStat$TypeClick b = SchemeStat$TypeClick.a.b(new SchemeStat$EventItem(SchemeStat$EventItem.Type.CLICK_ITEM, null, null, null, null, null, 62, null), new MobileOfficialAppsImStat$TypeImCounterSettingsClick(event, label, null, 4, null), 2);
                UiTracker uiTracker = UiTracker.a;
                MobileOfficialAppsCoreNavStat$EventScreen c = UiTracker.c();
                uzp0 uzp0Var = UiTracker.h;
                uzp0Var.getClass();
                new bjc(c, b, uzp0Var.a).q();
                return;
            default:
                com.vk.lists.c cVar = ((com.vk.lists.e) obj).d;
                cVar.u(z);
                cVar.c();
                com.vk.lists.c.a(cVar);
                return;
        }
    }
}

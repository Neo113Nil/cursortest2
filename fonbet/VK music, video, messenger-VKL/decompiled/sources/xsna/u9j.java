package xsna;

import com.vk.contacts.ContactSyncState;
import com.vk.core.ui.tracking.UiTracker;
import com.vk.stat.scheme.MobileOfficialAppsCallsStat$TypeVoipSyncContactsModalAction;
import com.vk.stat.scheme.SchemeStat$TypeAction;

/* compiled from: ContactSyncColdStartModalStatReporter.kt */
/* loaded from: classes17.dex */
public final class u9j {

    /* compiled from: ContactSyncColdStartModalStatReporter.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ContactSyncState.values().length];
            try {
                iArr[ContactSyncState.PERMITTED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ContactSyncState.SYNCING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ContactSyncState.DONE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static void a(MobileOfficialAppsCallsStat$TypeVoipSyncContactsModalAction mobileOfficialAppsCallsStat$TypeVoipSyncContactsModalAction) {
        UiTracker uiTracker = UiTracker.a;
        new iid0(UiTracker.c(), SchemeStat$TypeAction.a.b(null, null, mobileOfficialAppsCallsStat$TypeVoipSyncContactsModalAction, 3)).q();
    }
}

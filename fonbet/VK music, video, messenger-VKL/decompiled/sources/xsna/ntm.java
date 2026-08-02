package xsna;

import com.huawei.hms.framework.common.BundleUtil;
import com.vk.core.ui.tracking.UiTracker;
import com.vk.im.engine.models.dialogs.DialogsFilter;
import com.vk.im.engine.models.reporters.DialogsFilterChangeSource;
import com.vk.metrics.eventtracking.Event;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.stat.scheme.SchemeStat$EventItem;
import com.vk.stat.scheme.SchemeStat$TypeClick;
import com.vk.stat.scheme.SchemeStat$TypeImItem;
import java.util.Locale;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;

/* compiled from: DialogsListReporterImpl.kt */
/* loaded from: classes5.dex */
public final class ntm implements ktm {
    public static final ntm a = new ntm();

    /* compiled from: DialogsListReporterImpl.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[DialogsFilter.values().length];
            try {
                iArr[DialogsFilter.MAIN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[DialogsFilter.UNREAD.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[DialogsFilter.CHATS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[DialogsFilterChangeSource.values().length];
            try {
                iArr2[DialogsFilterChangeSource.SELECTOR.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[DialogsFilterChangeSource.BOTTOM_NAVIGATION.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[DialogsFilterChangeSource.LIST_EMPTY.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[DialogsFilterChangeSource.LIST_WITH_ITEMS.ordinal()] = 4;
            } catch (NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public static void c(Map map) {
        com.vk.metrics.eventtracking.b bVar = com.vk.metrics.eventtracking.b.a;
        el3 el3Var = Event.b;
        Event.a aVar = new Event.a();
        aVar.g("IM.DIALOGS.FILTER_CHANGE");
        aVar.d(map);
        aVar.j(e43.l("FirebaseTracker", "LoggingTracker"));
        bVar.k(aVar.e());
        Event.a aVar2 = new Event.a();
        aVar2.g(brm0.y("IM.DIALOGS.FILTER_CHANGE", ".", BundleUtil.UNDERLINE_TAG).toLowerCase(Locale.ROOT));
        aVar2.d(map);
        com.vk.movika.sdk.base.model.n.c(aVar2, e43.l("StatlogTracker", "LoggingTracker"), bVar);
    }

    @Override // xsna.ktm
    public final void a(DialogsFilter dialogsFilter, DialogsFilter dialogsFilter2, DialogsFilterChangeSource dialogsFilterChangeSource) {
        String str;
        SchemeStat$TypeImItem.Subtype subtype;
        int[] iArr = a.$EnumSwitchMapping$0;
        int i = iArr[dialogsFilter2.ordinal()];
        String str2 = i != 1 ? i != 2 ? i != 3 ? "unknown" : "chats" : "unread" : "all";
        int i2 = a.$EnumSwitchMapping$1[dialogsFilterChangeSource.ordinal()];
        if (i2 == 1) {
            str = "selector";
        } else if (i2 == 2) {
            str = "bottom_navigation";
        } else if (i2 == 3) {
            str = "list_unread_empty";
        } else {
            if (i2 != 4) {
                throw new NoWhenBranchMatchedException();
            }
            str = "list_unread_with_items";
        }
        SchemeStat$EventItem schemeStat$EventItem = new SchemeStat$EventItem(SchemeStat$EventItem.Type.CLICK_ITEM, null, null, null, null, null, 62, null);
        int i3 = iArr[dialogsFilter2.ordinal()];
        if (i3 != 1) {
            if (i3 == 2) {
                subtype = SchemeStat$TypeImItem.Subtype.FILTER_UNREAD;
            }
            if (dialogsFilterChangeSource != DialogsFilterChangeSource.SELECTOR || dialogsFilterChangeSource == DialogsFilterChangeSource.BOTTOM_NAVIGATION) {
                c(pn00.k(new Pair("filter", str2), new Pair("entry_point", str)));
            } else {
                if (dialogsFilter == DialogsFilter.UNREAD && dialogsFilter2 == DialogsFilter.MAIN) {
                    c(pn00.k(new Pair("filter", str2), new Pair("entry_point", str)));
                    return;
                }
                return;
            }
        }
        subtype = SchemeStat$TypeImItem.Subtype.FILTER_ALL;
        SchemeStat$TypeClick b = SchemeStat$TypeClick.a.b(schemeStat$EventItem, new SchemeStat$TypeImItem(subtype), 2);
        UiTracker uiTracker = UiTracker.a;
        MobileOfficialAppsCoreNavStat$EventScreen c = UiTracker.c();
        uzp0 uzp0Var = UiTracker.h;
        uzp0Var.getClass();
        new bjc(c, b, uzp0Var.a).q();
        if (dialogsFilterChangeSource != DialogsFilterChangeSource.SELECTOR) {
        }
        c(pn00.k(new Pair("filter", str2), new Pair("entry_point", str)));
    }

    @Override // xsna.ktm
    public final void b(long j, String str) {
        el3 el3Var = Event.b;
        Event.a b = h5s.b("messages_open_conversation");
        b.b("peer_id", Long.valueOf(j));
        b.c("entry_point", str);
        b.j(e43.l("StatlogTracker", "LoggingTracker"));
        b.h();
        com.vk.metrics.eventtracking.b.a.k(b.e());
    }
}

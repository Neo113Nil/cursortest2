package xsna;

import com.vk.core.ui.tracking.UiTracker;
import com.vk.stat.scheme.CommonVideoStat$TypeScreenMode;
import com.vk.stat.scheme.CommonVideoStat$TypeVideoCardEvent;
import com.vk.stat.scheme.SchemeStat$EventItem;
import java.util.Collections;
import java.util.List;
import xsna.hzp0;

/* compiled from: ClipsViewedTimeChecker.kt */
/* loaded from: classes17.dex */
public final class ynf extends d680<lde> {
    @Override // xsna.d680
    public final List j(lde ldeVar) {
        lde ldeVar2 = ldeVar;
        SchemeStat$EventItem schemeStat$EventItem = new SchemeStat$EventItem(SchemeStat$EventItem.Type.CATALOG_ITEM, null, null, null, ldeVar2.b, null, 46, null);
        int i = ldeVar2.a;
        CommonVideoStat$TypeVideoCardEvent commonVideoStat$TypeVideoCardEvent = new CommonVideoStat$TypeVideoCardEvent(CommonVideoStat$TypeVideoCardEvent.EventType.SHOW, CommonVideoStat$TypeScreenMode.PREVIEW);
        UiTracker uiTracker = UiTracker.a;
        return Collections.singletonList(new hzp0.o0(schemeStat$EventItem, i, UiTracker.c(), commonVideoStat$TypeVideoCardEvent));
    }
}

package xsna;

import com.vk.catalog2.common.dto.ui.actions.UIBlockActionFilter;
import com.vk.core.ui.tracking.UiTracker;
import com.vk.stat.scheme.SchemeStat$EventItem;
import com.vk.stat.scheme.SchemeStat$TypeClick;

/* compiled from: ProfileFilterAnalytics.kt */
/* loaded from: classes6.dex */
public final class nwd0 implements fcr {
    @Override // xsna.fcr
    public final void a(UIBlockActionFilter uIBlockActionFilter) {
        UiTracker uiTracker = UiTracker.a;
        new bjc(UiTracker.c(), SchemeStat$TypeClick.a.b(new SchemeStat$EventItem(SchemeStat$EventItem.Type.VIDEO_FILTER_BLOCK, null, null, null, uIBlockActionFilter.z.b, null, 46, null), new com.vk.stat.scheme.m0(), 2)).q();
    }
}

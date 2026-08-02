package xsna;

import com.vk.catalog2.common.dto.api.hint.CatalogHintType;
import com.vk.catalog2.common.dto.api.ui.UIBlockHint;
import com.vk.core.ui.tracking.UiTracker;
import com.vk.stat.scheme.CommonAudioStat$TypeAudioDomainEventItem;
import com.vk.stat.scheme.CommonStat$TypeCommonEventItem;
import com.vk.stat.scheme.SchemeStat$EventItem;
import xsna.hzp0;

/* compiled from: MusicHintViewHandler.kt */
/* loaded from: classes16.dex */
public final class kl40 implements c7a {
    public gzs<String> a = a.b;

    /* compiled from: MusicHintViewHandler.kt */
    public static final class a implements gzs {
        public static final a b = new a();

        @Override // xsna.gzs
        public final /* bridge */ /* synthetic */ Object invoke() {
            return null;
        }
    }

    @Override // xsna.c7a
    public final void a(UIBlockHint uIBlockHint) {
        CommonAudioStat$TypeAudioDomainEventItem commonAudioStat$TypeAudioDomainEventItem;
        if (uIBlockHint.B == CatalogHintType.COACHMARK) {
            CommonStat$TypeCommonEventItem commonStat$TypeCommonEventItem = new CommonStat$TypeCommonEventItem(null, null, null, this.a.invoke(), 7, null);
            commonAudioStat$TypeAudioDomainEventItem = new CommonAudioStat$TypeAudioDomainEventItem(qni0.a(), commonStat$TypeCommonEventItem, null, null, null, uIBlockHint.y, null, null, null, 476, null);
        } else {
            commonAudioStat$TypeAudioDomainEventItem = null;
        }
        if (commonAudioStat$TypeAudioDomainEventItem == null) {
            return;
        }
        UiTracker uiTracker = UiTracker.a;
        new hzp0.d0(new SchemeStat$EventItem(SchemeStat$EventItem.Type.CATALOG_ITEM, null, null, null, null, null, 62, null), UiTracker.c(), commonAudioStat$TypeAudioDomainEventItem).a();
    }

    @Override // xsna.c7a
    public final void b(gzs<String> gzsVar) {
        this.a = gzsVar;
    }
}

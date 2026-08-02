package xsna;

import com.vk.core.ui.tracking.UiTracker;
import com.vk.stat.scheme.CommonAudioStat$TypeAudioUiNavigationItem;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;

/* compiled from: MusicNavigationPayloadBuilderImpl.kt */
/* loaded from: classes.dex */
public final class cp40 implements bp40 {
    public String a;
    public MobileOfficialAppsCoreNavStat$EventScreen b;
    public CommonAudioStat$TypeAudioUiNavigationItem.EventType c;

    @Override // xsna.bp40
    public final void t(String str, CommonAudioStat$TypeAudioUiNavigationItem.EventType eventType) {
        this.a = str;
        UiTracker uiTracker = UiTracker.a;
        this.b = UiTracker.c();
        this.c = eventType;
    }
}

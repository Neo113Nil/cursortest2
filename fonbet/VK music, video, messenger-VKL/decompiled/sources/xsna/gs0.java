package xsna;

import com.vk.newsfeed.posting.additional_settings.domain.model.AdditionalSettingsState;
import kotlin.jvm.internal.PropertyReference1Impl;

/* compiled from: AdditionalSettingsReducer.kt */
/* loaded from: classes4.dex */
public final /* synthetic */ class gs0 extends PropertyReference1Impl {
    public static final gs0 b = new gs0(AdditionalSettingsState.Data.class, "shouldShowNotificationsButton", "getShouldShowNotificationsButton()Z", 0);

    @Override // kotlin.jvm.internal.PropertyReference1Impl, xsna.scy
    public final Object get(Object obj) {
        return Boolean.valueOf(((AdditionalSettingsState.Data) obj).f);
    }
}

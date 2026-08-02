package xsna;

import com.vk.newsfeed.posting.additional_settings.domain.model.AdditionalSettingsState;
import kotlin.jvm.internal.PropertyReference1Impl;

/* compiled from: AdditionalSettingsReducer.kt */
/* loaded from: classes4.dex */
public final /* synthetic */ class zr0 extends PropertyReference1Impl {
    public static final zr0 b = new zr0(AdditionalSettingsState.Data.class, "isCommunity", "isCommunity()Z", 0);

    @Override // kotlin.jvm.internal.PropertyReference1Impl, xsna.scy
    public final Object get(Object obj) {
        return Boolean.valueOf(((AdditionalSettingsState.Data) obj).h);
    }
}

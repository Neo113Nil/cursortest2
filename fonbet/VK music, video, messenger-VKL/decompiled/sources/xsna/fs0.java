package xsna;

import com.vk.newsfeed.posting.additional_settings.domain.model.AdditionalSettingsState;
import kotlin.jvm.internal.PropertyReference1Impl;

/* compiled from: AdditionalSettingsReducer.kt */
/* loaded from: classes4.dex */
public final /* synthetic */ class fs0 extends PropertyReference1Impl {
    public static final fs0 b = new fs0(AdditionalSettingsState.Data.class, "isCommentChangeAvailable", "isCommentChangeAvailable()Z", 0);

    @Override // kotlin.jvm.internal.PropertyReference1Impl, xsna.scy
    public final Object get(Object obj) {
        return Boolean.valueOf(((AdditionalSettingsState.Data) obj).e);
    }
}

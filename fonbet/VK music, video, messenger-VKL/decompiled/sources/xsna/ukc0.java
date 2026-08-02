package xsna;

import com.vk.newsfeed.posting.additional_settings.data.AdditionalSettingsConfiguration;
import com.vk.newsfeed.posting.impl.domain.model.PostingState;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: PostingReducer.kt */
/* loaded from: classes4.dex */
public final /* synthetic */ class ukc0 extends FunctionReferenceImpl implements izs<PostingState.Editing, Boolean> {
    @Override // xsna.izs
    public final Boolean invoke(PostingState.Editing editing) {
        ((vpc0) this.receiver).getClass();
        AdditionalSettingsConfiguration additionalSettingsConfiguration = editing.i.q;
        Boolean valueOf = additionalSettingsConfiguration != null ? Boolean.valueOf(additionalSettingsConfiguration.c) : null;
        return Boolean.valueOf(valueOf != null ? valueOf.booleanValue() : false);
    }
}

package xsna;

import android.content.Context;
import com.vk.clips.models.SdkClipOrdData;
import com.vk.dto.stories.entities.OrdData;

/* compiled from: ClipsEditSdkOrdHandlerVk.kt */
/* loaded from: classes16.dex */
public final class kvd implements jvd {
    public final nne a;
    public final boolean b;

    public kvd(nne nneVar, boolean z) {
        this.a = nneVar;
        this.b = z;
    }

    @Override // xsna.jvd
    public final void a(Context context, SdkClipOrdData sdkClipOrdData, com.vk.im.ui.fragments.b bVar) {
        k00 k00Var = new k00(bVar, 27);
        nne nneVar = this.a;
        nneVar.d(k00Var);
        nneVar.c(context, sdkClipOrdData != null ? new OrdData(sdkClipOrdData.b, sdkClipOrdData.c, sdkClipOrdData.d) : null);
    }

    @Override // xsna.jvd
    public final boolean isEnabled() {
        return this.b;
    }
}

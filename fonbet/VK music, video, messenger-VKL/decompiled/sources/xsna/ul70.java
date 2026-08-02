package xsna;

import com.vk.clips.external.nps.api.condition.ExternalNpsCondition;
import com.vk.clips.sdk.shared.api.nps.api.condition.SdkExternalNpsCondition;

/* compiled from: NpsControllerImpl.kt */
/* loaded from: classes17.dex */
public final class ul70 implements sl70 {
    public volatile boolean a;
    public volatile boolean b;
    public volatile boolean c;

    @Override // xsna.tl70
    public final boolean a() {
        return !this.a;
    }

    @Override // xsna.tl70
    public final void b(SdkExternalNpsCondition sdkExternalNpsCondition) {
        ExternalNpsCondition a = afq.a(sdkExternalNpsCondition);
        this.a = true;
        if (a == ExternalNpsCondition.CLIP_DOWNLOADED) {
            this.b = true;
        }
    }

    @Override // xsna.tl70
    public final void c() {
        this.c = true;
    }

    @Override // xsna.tl70
    public final boolean d(SdkExternalNpsCondition sdkExternalNpsCondition) {
        return afq.a(sdkExternalNpsCondition) == ExternalNpsCondition.CLIP_DOWNLOADED ? !this.b : (this.a || this.c) ? false : true;
    }
}

package xsna;

import com.vk.video.ui.smartcrop.api.router.SmartCropArguments;

/* compiled from: SmartCropFragmentInternalComponent.kt */
/* loaded from: classes7.dex */
public final class j4k0 extends uaj0 {
    public final SmartCropArguments a;

    public j4k0(SmartCropArguments smartCropArguments) {
        this.a = smartCropArguments;
    }

    @Override // xsna.pwj0
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof j4k0) && epx.f(this.a, ((j4k0) obj).a);
    }

    @Override // xsna.pwj0
    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "SmartCropFragmentScopeKey(arguments=" + this.a + ')';
    }
}

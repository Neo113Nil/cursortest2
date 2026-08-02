package xsna;

import com.vk.video.ui.upload.api.router.PublishArguments;

/* compiled from: PublishFragmentInternalComponent.kt */
/* loaded from: classes7.dex */
public final class cce0 extends uaj0 {
    public final PublishArguments a;

    public cce0(PublishArguments publishArguments) {
        this.a = publishArguments;
    }

    @Override // xsna.pwj0
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof cce0) && epx.f(this.a, ((cce0) obj).a);
    }

    @Override // xsna.pwj0
    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "PublishFragmentScopeKey(arguments=" + this.a + ')';
    }
}

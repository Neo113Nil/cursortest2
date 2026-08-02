package xsna;

import com.vk.video.ui.upload.api.router.AttachedClipsArguments;

/* compiled from: AttachedClipsFragmentInternalComponent.kt */
/* loaded from: classes7.dex */
public final class c54 extends uaj0 {
    public final AttachedClipsArguments a;

    public c54(AttachedClipsArguments attachedClipsArguments) {
        this.a = attachedClipsArguments;
    }

    @Override // xsna.pwj0
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c54) && epx.f(this.a, ((c54) obj).a);
    }

    @Override // xsna.pwj0
    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "AttachedClipsFragmentScopeKey(arguments=" + this.a + ')';
    }
}

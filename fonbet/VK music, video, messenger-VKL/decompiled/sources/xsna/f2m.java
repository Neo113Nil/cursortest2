package xsna;

import com.vk.video.ui.upload.impl.publish.presentation.description.fragment.DescriptionArguments;

/* compiled from: DescriptionModalInternalComponent.kt */
/* loaded from: classes7.dex */
public final class f2m extends uaj0 {
    public final DescriptionArguments a;

    public f2m(DescriptionArguments descriptionArguments) {
        this.a = descriptionArguments;
    }

    @Override // xsna.pwj0
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f2m) && epx.f(this.a, ((f2m) obj).a);
    }

    @Override // xsna.pwj0
    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "DescriptionModalScopeKey(arguments=" + this.a + ')';
    }
}

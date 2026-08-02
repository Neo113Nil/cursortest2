package xsna;

import com.vk.video.ui.upload.impl.publish.presentation.author.fragment.AuthorArguments;

/* compiled from: AuthorModalInternalComponent.kt */
/* loaded from: classes7.dex */
public final class dc5 extends uaj0 {
    public final AuthorArguments a;

    public dc5(AuthorArguments authorArguments) {
        this.a = authorArguments;
    }

    @Override // xsna.pwj0
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dc5) && epx.f(this.a, ((dc5) obj).a);
    }

    @Override // xsna.pwj0
    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "AuthorModalScopeKey(arguments=" + this.a + ')';
    }
}

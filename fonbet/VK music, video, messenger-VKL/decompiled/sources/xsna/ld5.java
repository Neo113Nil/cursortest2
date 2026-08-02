package xsna;

import com.vk.video.ui.upload.impl.publish.presentation.publish.compose.author.AuthorType;
import xsna.tlo0;

/* compiled from: AuthorViewState.kt */
/* loaded from: classes7.dex */
public final class ld5 {
    public final String a;
    public final tlo0.h b;
    public final AuthorType c;

    public ld5(String str, tlo0.h hVar, AuthorType authorType) {
        this.a = str;
        this.b = hVar;
        this.c = authorType;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ld5)) {
            return false;
        }
        ld5 ld5Var = (ld5) obj;
        return this.a.equals(ld5Var.a) && this.b.equals(ld5Var.b) && this.c == ld5Var.c;
    }

    public final int hashCode() {
        return this.c.hashCode() + u11.c(this.a.hashCode() * 31, 31, this.b.a);
    }

    public final String toString() {
        return "AuthorViewState(avatarUrl=" + this.a + ", name=" + this.b + ", authorType=" + this.c + ')';
    }
}

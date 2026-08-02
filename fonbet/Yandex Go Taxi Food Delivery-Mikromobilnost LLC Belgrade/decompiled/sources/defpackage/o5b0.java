package defpackage;

import com.yandex.messaging.internal.avatar.AvatarPlaceholderDrawable;

/* loaded from: classes15.dex */
public final class o5b0 {
    public final long a;
    public final String b;
    public final AvatarPlaceholderDrawable c;
    public final boolean d;

    public o5b0(long j, String str, AvatarPlaceholderDrawable avatarPlaceholderDrawable, boolean z) {
        this.a = j;
        this.b = str;
        this.c = avatarPlaceholderDrawable;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        o5b0 o5b0Var = obj instanceof o5b0 ? (o5b0) obj : null;
        return o5b0Var != null && this.a == o5b0Var.a;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }
}

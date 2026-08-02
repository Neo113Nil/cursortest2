package xsna;

/* compiled from: UserMetadata.kt */
/* loaded from: classes6.dex */
public final class blq0 {
    public final long a;

    public blq0(long j) {
        this.a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof blq0) && this.a == ((blq0) obj).a;
    }

    public final int hashCode() {
        return Long.hashCode(this.a) * 28629151;
    }

    public final String toString() {
        return efz.b(this.a, ", userAge=null, userSex=null, userRegistrationDate=null, userPlatform=null, userCountryIso2=null)", new StringBuilder("UserMetadata(userId="));
    }
}

package xsna;

import com.vk.im.engine.models.credentials.UserCredentials;

/* compiled from: DynamicCredentialsProvider.kt */
/* loaded from: classes11.dex */
public final class fpo {
    public volatile UserCredentials a;

    public fpo(UserCredentials userCredentials) {
        this.a = userCredentials;
    }

    public final UserCredentials a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (fpo.class.equals(obj != null ? obj.getClass() : null)) {
            return epx.f(this.a, ((fpo) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        UserCredentials userCredentials = this.a;
        if (userCredentials != null) {
            return userCredentials.hashCode();
        }
        return 0;
    }
}

package defpackage;

import android.media.session.MediaSessionManager;
import android.text.TextUtils;

/* loaded from: classes10.dex */
public final class hf10 {
    public final if10 a;

    public hf10(MediaSessionManager.RemoteUserInfo remoteUserInfo) {
        String packageName = remoteUserInfo.getPackageName();
        if (packageName == null) {
            ny61.t("package shouldn't be null");
            throw null;
        }
        if (TextUtils.isEmpty(packageName)) {
            ny61.g("packageName should be nonempty");
            throw null;
        }
        this.a = new if10(remoteUserInfo.getPackageName(), remoteUserInfo.getPid(), remoteUserInfo.getUid());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hf10)) {
            return false;
        }
        return this.a.equals(((hf10) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public hf10(String str, int i, int i2) {
        if (str != null) {
            if (!TextUtils.isEmpty(str)) {
                if10 if10Var = new if10(str, i, i2);
                new MediaSessionManager.RemoteUserInfo(str, i, i2);
                this.a = if10Var;
                return;
            }
            ny61.g("packageName should be nonempty");
            throw null;
        }
        ny61.t("package shouldn't be null");
        throw null;
    }
}

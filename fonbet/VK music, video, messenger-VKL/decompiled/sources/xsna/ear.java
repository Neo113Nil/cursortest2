package xsna;

import java.io.File;
import one.video.calls.sdk.internal.api.request.UploadType;

/* compiled from: FileSendEvent.kt */
/* loaded from: classes8.dex */
public final class ear {
    public final File a;
    public final UploadType b;

    public ear(File file, UploadType uploadType) {
        this.a = file;
        this.b = uploadType;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ear)) {
            return false;
        }
        ear earVar = (ear) obj;
        return epx.f(this.a, earVar.a) && this.b == earVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "FileSendEvent(file=" + this.a + ", type=" + this.b + ", removeAfterUpload=true)";
    }
}

package xsna;

import com.vk.clips.sdk.shared.api.deps.video.SdkClipVideoFile;

/* compiled from: ShopsMoreState.kt */
/* loaded from: classes17.dex */
public final class mfj0 {
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final SdkClipVideoFile d;

    public mfj0(boolean z, boolean z2, boolean z3, SdkClipVideoFile sdkClipVideoFile) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = sdkClipVideoFile;
    }

    public static mfj0 a(mfj0 mfj0Var, boolean z, boolean z2, SdkClipVideoFile sdkClipVideoFile, int i) {
        if ((i & 1) != 0) {
            z = mfj0Var.a;
        }
        boolean z3 = (i & 2) != 0 ? mfj0Var.b : true;
        if ((i & 4) != 0) {
            z2 = mfj0Var.c;
        }
        if ((i & 8) != 0) {
            sdkClipVideoFile = mfj0Var.d;
        }
        mfj0Var.getClass();
        return new mfj0(z, z3, z2, sdkClipVideoFile);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mfj0)) {
            return false;
        }
        mfj0 mfj0Var = (mfj0) obj;
        return this.a == mfj0Var.a && this.b == mfj0Var.b && this.c == mfj0Var.c && epx.f(this.d, mfj0Var.d);
    }

    public final int hashCode() {
        int b = qoy.b(qoy.b(Boolean.hashCode(this.a) * 31, 31, this.b), 31, this.c);
        SdkClipVideoFile sdkClipVideoFile = this.d;
        return b + (sdkClipVideoFile == null ? 0 : sdkClipVideoFile.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ShopsMoreState(shopsMoreWasShown=");
        sb.append(this.a);
        sb.append(", hasBeenAnimated=");
        sb.append(this.b);
        sb.append(", preloadWasTriggered=");
        sb.append(this.c);
        sb.append(", similarClipVideoFile=");
        return cq.d(sb, this.d, ')');
    }
}

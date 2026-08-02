package xsna;

import android.net.Uri;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* compiled from: ResumableUploadByteRequest.java */
/* loaded from: classes13.dex */
public final class deg0 extends ceg0 {
    public final Uri m;
    public final byte[] n;
    public final int o;

    public deg0(@NonNull nhl0 nhl0Var, @NonNull vhr vhrVar, @NonNull Uri uri, @Nullable byte[] bArr, long j, int i, boolean z) {
        super(nhl0Var, vhrVar);
        if (j < 0) {
            this.a = new IllegalArgumentException("offset cannot be negative");
        }
        this.o = i;
        this.m = uri;
        this.n = i <= 0 ? null : bArr;
        m("X-Goog-Upload-Protocol", "resumable");
        if (z && i > 0) {
            m("X-Goog-Upload-Command", "upload, finalize");
        } else if (z) {
            m("X-Goog-Upload-Command", "finalize");
        } else {
            m("X-Goog-Upload-Command", "upload");
        }
        m("X-Goog-Upload-Offset", Long.toString(j));
    }

    @Override // xsna.a560
    @Nullable
    public final byte[] d() {
        return this.n;
    }

    @Override // xsna.a560
    public final int e() {
        int i = this.o;
        if (i > 0) {
            return i;
        }
        return 0;
    }

    @Override // xsna.a560
    @NonNull
    public final Uri i() {
        return this.m;
    }
}

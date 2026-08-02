package xsna;

import android.net.Uri;
import androidx.annotation.NonNull;

/* compiled from: ResumableUploadQueryRequest.java */
/* loaded from: classes13.dex */
public final class heg0 extends ceg0 {
    public final Uri m;

    public heg0(@NonNull nhl0 nhl0Var, @NonNull vhr vhrVar, @NonNull Uri uri) {
        super(nhl0Var, vhrVar);
        this.m = uri;
        m("X-Goog-Upload-Protocol", "resumable");
        m("X-Goog-Upload-Command", "query");
    }

    @Override // xsna.a560
    @NonNull
    public final Uri i() {
        return this.m;
    }
}

package defpackage;

import android.net.Uri;
import com.yandex.messaging.core.net.entities.ResolvedYaDiskFile;

/* loaded from: classes15.dex */
public final class hk51 extends eoc {
    public final hzq e;
    public final String f;
    public final String g;

    public hk51(String str, String str2, Uri uri, ResolvedYaDiskFile resolvedYaDiskFile, boolean z, hzq hzqVar) {
        super(uri, str, str2, z);
        this.e = hzqVar;
        this.f = resolvedYaDiskFile.getUploadUrl();
        this.g = resolvedYaDiskFile.getUploadId();
    }

    @Override // defpackage.g2r
    public final Object c(jdj jdjVar) {
        return jdjVar.d(this);
    }
}

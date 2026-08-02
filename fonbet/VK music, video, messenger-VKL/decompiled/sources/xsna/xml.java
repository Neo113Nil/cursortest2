package xsna;

import java.io.InputStream;

/* compiled from: DefaultStreamResponseConverter.kt */
/* loaded from: classes15.dex */
public final class xml implements cpm0 {
    @Override // xsna.cpm0
    public final boolean a(String str) {
        return drm0.D(str, "application/json", true) || drm0.D(str, "text/javascript", true);
    }

    @Override // xsna.cpm0
    public final InputStream b(okhttp3.v vVar) {
        return vVar.byteStream();
    }
}

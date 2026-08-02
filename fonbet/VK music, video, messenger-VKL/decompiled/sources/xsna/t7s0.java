package xsna;

import android.net.Uri;

/* compiled from: VideoCacheKeyProvider.kt */
/* loaded from: classes3.dex */
public final class t7s0 implements yw8 {
    @Override // xsna.yw8
    public final String b(Uri uri) {
        String queryParameter;
        return (uri.isOpaque() || (queryParameter = uri.getQueryParameter("c_uniq_tag")) == null) ? String.valueOf(uri.hashCode()) : queryParameter;
    }

    @Override // xsna.xw8
    public final String k(evk evkVar) {
        String str = evkVar.i;
        return str == null ? b(evkVar.a) : str;
    }
}

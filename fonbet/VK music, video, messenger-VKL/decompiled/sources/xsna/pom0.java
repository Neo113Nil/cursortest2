package xsna;

import android.content.res.AssetManager;
import androidx.annotation.NonNull;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: StreamAssetPathFetcher.java */
/* loaded from: classes12.dex */
public final class pom0 extends ax3<InputStream> {
    @Override // xsna.buk
    @NonNull
    public final Class<InputStream> b() {
        return InputStream.class;
    }

    @Override // xsna.ax3
    public final void c(InputStream inputStream) throws IOException {
        inputStream.close();
    }

    @Override // xsna.ax3
    public final InputStream f(AssetManager assetManager, String str) throws IOException {
        return assetManager.open(str);
    }
}

package xsna;

import android.content.res.AssetFileDescriptor;
import android.content.res.AssetManager;
import androidx.annotation.NonNull;
import java.io.IOException;

/* compiled from: FileDescriptorAssetPathFetcher.java */
/* loaded from: classes12.dex */
public final class j8r extends ax3<AssetFileDescriptor> {
    @Override // xsna.buk
    @NonNull
    public final Class<AssetFileDescriptor> b() {
        return AssetFileDescriptor.class;
    }

    @Override // xsna.ax3
    public final void c(AssetFileDescriptor assetFileDescriptor) throws IOException {
        assetFileDescriptor.close();
    }

    @Override // xsna.ax3
    public final AssetFileDescriptor f(AssetManager assetManager, String str) throws IOException {
        return assetManager.openFd(str);
    }
}

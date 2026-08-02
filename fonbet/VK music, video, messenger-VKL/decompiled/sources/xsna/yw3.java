package xsna;

import android.content.ContentResolver;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import androidx.annotation.NonNull;
import java.io.FileNotFoundException;
import java.io.IOException;

/* compiled from: AssetFileDescriptorLocalUriFetcher.java */
/* loaded from: classes12.dex */
public final class yw3 extends cwz<AssetFileDescriptor> {
    @Override // xsna.buk
    @NonNull
    public final Class<AssetFileDescriptor> b() {
        return AssetFileDescriptor.class;
    }

    @Override // xsna.cwz
    public final void c(AssetFileDescriptor assetFileDescriptor) throws IOException {
        assetFileDescriptor.close();
    }

    @Override // xsna.cwz
    public final Object f(ContentResolver contentResolver, Uri uri) throws FileNotFoundException {
        AssetFileDescriptor openAssetFileDescriptor = contentResolver.openAssetFileDescriptor(uri, "r");
        if (openAssetFileDescriptor != null) {
            return openAssetFileDescriptor;
        }
        throw new FileNotFoundException(i6n0.a(uri, "FileDescriptor is null for: "));
    }
}

package xsna;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import java.io.File;

/* compiled from: FilesProviderImpl.kt */
/* loaded from: classes16.dex */
public final class pbr implements e9e {
    @Override // xsna.e9e
    public final File a(Context context, Uri uri) {
        return com.vk.core.files.a.i(context, uri);
    }

    @Override // xsna.e9e
    public final File b(Bitmap bitmap) {
        com.vk.stories.b.a.getClass();
        return com.vk.stories.b.f(bitmap, com.vk.core.files.a.s());
    }
}

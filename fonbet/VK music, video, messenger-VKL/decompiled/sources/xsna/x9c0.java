package xsna;

import android.content.Context;
import android.net.Uri;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import com.vk.media.MediaUtils;

/* compiled from: PostWithVideoToClipHelperImpl.kt */
/* loaded from: classes17.dex */
public final class x9c0 implements w9c0 {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.w9c0
    public final boolean a(Uri uri) {
        String path = uri.getPath();
        MediaUtils.f fVar = null;
        if (oeq0.e(uri)) {
            Context context = e43.a;
            fVar = MediaUtils.a.c(context != null ? context : null, uri, false);
        } else if (path != null) {
            fVar = MediaUtils.a.d(path);
        }
        if (fVar != null) {
            int i = ynd.c;
            long j = fVar.f;
            Object[] objArr = 1000 <= j && j <= ((long) i);
            String str = fVar.g;
            Object[] objArr2 = str != null && str.equalsIgnoreCase(MimeTypes.VIDEO_MP4);
            Object[] objArr3 = fVar.a <= fVar.b;
            if (objArr != false && objArr2 != false && objArr3 != false) {
                return true;
            }
        }
        return false;
    }
}

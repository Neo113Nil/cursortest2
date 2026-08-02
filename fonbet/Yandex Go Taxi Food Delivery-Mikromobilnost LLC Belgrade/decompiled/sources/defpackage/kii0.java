package defpackage;

import android.media.MediaMuxer;
import android.net.Uri;
import androidx.camera.video.g;
import java.io.File;

/* loaded from: classes10.dex */
public final /* synthetic */ class kii0 {
    public final /* synthetic */ r0r a;

    public /* synthetic */ kii0(r0r r0rVar) {
        this.a = r0rVar;
    }

    public final MediaMuxer a(int i, k9b k9bVar) {
        Uri uri = Uri.EMPTY;
        r0r r0rVar = this.a;
        if (!(r0rVar instanceof r0r)) {
            ny61.f("Invalid output options type: ".concat(r0rVar.getClass().getSimpleName()));
            return null;
        }
        File file = r0rVar.b.c;
        File parentFile = file.getParentFile();
        if (!(parentFile == null ? false : parentFile.exists() ? parentFile.isDirectory() : parentFile.mkdirs())) {
            file.getAbsolutePath();
            sgb1.g(5, "Recorder");
        }
        MediaMuxer mediaMuxer = new MediaMuxer(file.getAbsolutePath(), i);
        ((g) k9bVar.b).L = Uri.fromFile(file);
        return mediaMuxer;
    }
}

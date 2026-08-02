package xsna;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import java.io.File;
import java.io.IOException;
import java.net.SocketTimeoutException;
import java.util.Optional;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class guv implements Callable {
    public final /* synthetic */ int b;
    public final /* synthetic */ String c;

    public /* synthetic */ guv(String str, int i) {
        this.b = i;
        this.c = str;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        File file;
        switch (this.b) {
            case 0:
                String str = this.c;
                Bitmap decodeFile = BitmapFactory.decodeFile(str);
                if (decodeFile != null) {
                    return new cyl0(1080, 1920).b(decodeFile).i();
                }
                throw new IOException(go9.b("ideas: can't decode background from ", str));
            default:
                try {
                    file = ((wel) y970.e.getValue()).a(r0, Uri.parse(this.c).toString());
                } catch (ExecutionException e) {
                    if (!(e.getCause() instanceof SocketTimeoutException)) {
                        throw e;
                    }
                    file = null;
                }
                return Optional.ofNullable(file);
        }
    }
}

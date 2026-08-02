package xsna;

import android.content.Context;
import android.net.Uri;
import android.os.AsyncTask;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.cast.framework.media.ImageHints;

/* compiled from: com.google.android.gms:play-services-cast-framework@@22.3.1 */
/* loaded from: classes12.dex */
public final class i201 {
    public final Context a;
    public final ImageHints b;

    @Nullable
    public Uri c;

    @Nullable
    public f701 d;

    @Nullable
    public ttz0 e;

    public i201(Context context) {
        this(context, new ImageHints(-1, 0, 0));
    }

    public final void a(@Nullable Uri uri) {
        int i;
        if (uri == null) {
            c();
            return;
        }
        if (uri.equals(this.c)) {
            return;
        }
        c();
        this.c = uri;
        ImageHints imageHints = this.b;
        int i2 = imageHints.c;
        Context context = this.a;
        if (i2 == 0 || (i = imageHints.d) == 0) {
            this.d = new f701(context, 0, 0, this);
        } else {
            this.d = new f701(context, i2, i, this);
        }
        f701 f701Var = this.d;
        exc0.i(f701Var);
        Uri uri2 = this.c;
        exc0.i(uri2);
        f701Var.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, uri2);
    }

    public final void b() {
        c();
        this.e = null;
    }

    public final void c() {
        f701 f701Var = this.d;
        if (f701Var != null) {
            f701Var.cancel(true);
            this.d = null;
        }
        this.c = null;
    }

    public i201(Context context, @NonNull ImageHints imageHints) {
        this.a = context;
        this.b = imageHints;
        c();
    }
}

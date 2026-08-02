package xsna;

import android.net.Uri;
import com.vk.log.L;
import java.io.File;
import java.util.List;
import java.util.concurrent.Callable;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class jh40 implements Callable {
    public final /* synthetic */ int b = 1;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ jh40(vh40 vh40Var, List list) {
        this.c = vh40Var;
        this.d = list;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        boolean z;
        switch (this.b) {
            case 0:
                return ((vh40) this.c).b.s((List) this.d);
            default:
                String str = (String) this.c;
                String str2 = (String) this.d;
                Uri uri = null;
                try {
                    File file = new File(zys0.a(str), str2 + ".jpg");
                    try {
                        z = file.exists();
                    } catch (SecurityException unused) {
                        z = false;
                    }
                    if (z) {
                        uri = com.vk.core.files.a.N(file);
                    }
                } catch (Exception e) {
                    L.i(e);
                }
                if (uri != null) {
                    return uri;
                }
                throw new IllegalStateException("Video offline image not found!");
        }
    }

    public /* synthetic */ jh40(azs0 azs0Var, String str, String str2) {
        this.c = str;
        this.d = str2;
    }
}

package xsna;

import android.content.Context;
import java.lang.ref.WeakReference;

/* compiled from: VoipMiniAppRouter.kt */
/* loaded from: classes7.dex */
public interface xsw0 {

    /* compiled from: VoipMiniAppRouter.kt */
    public static final class a {
        public final WeakReference<Context> a;
        public final String c;
        public final int b = 51688145;
        public final Integer d = 1;

        public a(WeakReference weakReference, String str) {
            this.a = weakReference;
            this.c = str;
        }
    }

    /* compiled from: VoipMiniAppRouter.kt */
    public static final class b {
        public final WeakReference<Context> a;
        public final String b;
        public final Integer c = 1;

        public b(WeakReference weakReference, String str) {
            this.a = weakReference;
            this.b = str;
        }
    }

    io.reactivex.rxjava3.core.x<oz50> a(a aVar);

    io.reactivex.rxjava3.core.x<oz50> b(b bVar);
}

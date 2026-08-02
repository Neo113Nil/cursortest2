package yads;

import android.content.Context;
import com.yandex.div.core.images.DivImageDownloadCallback;
import com.yandex.div.core.images.DivImageLoader;
import com.yandex.div.core.images.LoadReference;
import kotlin.jvm.internal.Ref$ObjectRef;

/* loaded from: classes10.dex */
public final class oh0 implements DivImageLoader {
    public final h13 a;
    public final ni1 b = new ni1();

    public oh0(Context context) {
        this.a = x92.d.a(context).b();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void b(Ref$ObjectRef ref$ObjectRef) {
        l41 l41Var = (l41) ref$ObjectRef.element;
        if (l41Var != null) {
            l41Var.a();
        }
    }

    public final LoadReference a(final String str, final DivImageDownloadCallback divImageDownloadCallback) {
        final Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        this.b.a(new Runnable() { // from class: xsna.c8z0
            @Override // java.lang.Runnable
            public final void run() {
                yads.oh0.a(Ref$ObjectRef.this, this, str, divImageDownloadCallback);
            }
        });
        return new LoadReference() { // from class: xsna.d8z0
            @Override // com.yandex.div.core.images.LoadReference
            public final void cancel() {
                yads.oh0.a(yads.oh0.this, ref$ObjectRef);
            }
        };
    }

    @Override // com.yandex.div.core.images.DivImageLoader
    public final LoadReference loadImage(String str, DivImageDownloadCallback divImageDownloadCallback) {
        return a(str, divImageDownloadCallback);
    }

    @Override // com.yandex.div.core.images.DivImageLoader
    public final LoadReference loadImageBytes(String str, DivImageDownloadCallback divImageDownloadCallback) {
        return a(str, divImageDownloadCallback);
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [T, yads.l41] */
    public static final void a(Ref$ObjectRef ref$ObjectRef, oh0 oh0Var, String str, DivImageDownloadCallback divImageDownloadCallback) {
        ref$ObjectRef.element = oh0Var.a.a(str, new nh0(str, divImageDownloadCallback), 0, 0);
    }

    public static final void a(oh0 oh0Var, Ref$ObjectRef ref$ObjectRef) {
        oh0Var.b.a(new xsna.tw3(ref$ObjectRef, 27));
    }
}

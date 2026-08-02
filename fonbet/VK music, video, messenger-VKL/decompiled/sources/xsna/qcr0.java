package xsna;

import android.net.Uri;
import android.util.Log;
import com.facebook.imagepipeline.request.ImageRequestBuilder;
import com.vk.log.L;
import java.lang.reflect.Field;

/* compiled from: VKImageLoader.java */
/* loaded from: classes2.dex */
public final class qcr0 implements io.reactivex.rxjava3.core.s<pvf> {
    public final /* synthetic */ Uri b;

    public qcr0(Uri uri) {
        this.b = uri;
    }

    @Override // io.reactivex.rxjava3.core.s
    public final void subscribe(io.reactivex.rxjava3.core.r<pvf> rVar) throws Exception {
        rhs.b().a(ImageRequestBuilder.h(this.b).a(), this, null, null, null).d(new a(rVar), ac9.b);
    }

    /* compiled from: VKImageLoader.java */
    public class a implements vvk<uvf<svf>> {
        public final /* synthetic */ io.reactivex.rxjava3.core.r a;

        public a(io.reactivex.rxjava3.core.r rVar) {
            this.a = rVar;
        }

        @Override // xsna.vvk
        public final void a() {
            this.a.onComplete();
        }

        @Override // xsna.vvk
        public final void c(zuk<uvf<svf>> zukVar) {
            this.a.onError(new IllegalStateException("Fail fetch image by " + qcr0.this.b));
        }

        @Override // xsna.vvk
        public final void d(zuk<uvf<svf>> zukVar) {
            io.reactivex.rxjava3.core.r rVar = this.a;
            try {
                svf r = zukVar.getResult().r();
                if (r instanceof pvf) {
                    rVar.onNext((pvf) r);
                    rVar.onComplete();
                } else {
                    L.l("Unexpected type image from fresco " + r);
                    throw new IllegalStateException();
                }
            } catch (Throwable th) {
                rVar.onError(th);
                Field field = mcr0.a;
                Log.e("mcr0", "can't fetch closable image", th);
            }
        }

        @Override // xsna.vvk
        public final void b(zuk<uvf<svf>> zukVar) {
        }
    }
}

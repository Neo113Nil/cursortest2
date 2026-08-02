package xsna;

import android.content.ContentResolver;
import android.graphics.Bitmap;
import android.media.ThumbnailUtils;
import android.net.Uri;
import android.os.CancellationSignal;
import android.util.Size;
import com.facebook.common.internal.ImmutableMap;
import com.facebook.imagepipeline.request.ImageRequest;
import java.io.File;
import java.util.Map;
import java.util.concurrent.Executor;

/* compiled from: LocalThumbnailBitmapSdk29Producer.java */
/* loaded from: classes12.dex */
public final class xvz implements thd0<uvf<svf>> {
    public final Executor a;
    public final ContentResolver b;

    /* compiled from: LocalThumbnailBitmapSdk29Producer.java */
    public class a extends zuk0<uvf<svf>> {
        public final /* synthetic */ yhd0 g;
        public final /* synthetic */ uhd0 h;
        public final /* synthetic */ ImageRequest i;
        public final /* synthetic */ CancellationSignal j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(l7j l7jVar, yhd0 yhd0Var, uhd0 uhd0Var, yhd0 yhd0Var2, uhd0 uhd0Var2, ImageRequest imageRequest, CancellationSignal cancellationSignal) {
            super(l7jVar, yhd0Var, uhd0Var, "LocalThumbnailBitmapSdk29Producer");
            this.g = yhd0Var2;
            this.h = uhd0Var2;
            this.i = imageRequest;
            this.j = cancellationSignal;
        }

        @Override // xsna.zuk0
        public final void b(Object obj) {
            uvf.q((uvf) obj);
        }

        @Override // xsna.zuk0
        public final Map c(uvf<svf> uvfVar) {
            return ImmutableMap.a("createdThumbnail", String.valueOf(uvfVar != null));
        }

        @Override // xsna.zuk0
        public final Object d() throws Exception {
            String str;
            ContentResolver contentResolver = xvz.this.b;
            ImageRequest imageRequest = this.i;
            x9g0 x9g0Var = imageRequest.h;
            int i = x9g0Var != null ? x9g0Var.a : 2048;
            Uri uri = imageRequest.b;
            Size size = new Size(i, x9g0Var != null ? x9g0Var.b : 2048);
            try {
                str = meq0.a(contentResolver, uri);
            } catch (IllegalArgumentException unused) {
                str = null;
            }
            CancellationSignal cancellationSignal = this.j;
            Bitmap createVideoThumbnail = str != null ? k020.b(k020.a(str)) ? ThumbnailUtils.createVideoThumbnail(new File(str), size, cancellationSignal) : ThumbnailUtils.createImageThumbnail(new File(str), size, cancellationSignal) : null;
            if (createVideoThumbnail == null) {
                createVideoThumbnail = contentResolver.loadThumbnail(uri, size, cancellationSignal);
            }
            if (createVideoThumbnail == null) {
                return null;
            }
            lcl i2 = xvf.i2(createVideoThumbnail, wwf0.s(), gpw.d);
            kuu kuuVar = this.h;
            kuuVar.h("thumbnail", "image_format");
            i2.b(kuuVar.getExtras());
            return uvf.v(i2);
        }

        @Override // xsna.zuk0
        public final void e() {
            super.e();
            this.j.cancel();
        }

        @Override // xsna.zuk0
        public final void f(Exception exc) {
            super.f(exc);
            yhd0 yhd0Var = this.g;
            uhd0 uhd0Var = this.h;
            yhd0Var.e(uhd0Var, "LocalThumbnailBitmapSdk29Producer", false);
            uhd0Var.s("local", "thumbnail_bitmap");
        }

        @Override // xsna.zuk0
        public final void g(uvf<svf> uvfVar) {
            uvf<svf> uvfVar2 = uvfVar;
            super.g(uvfVar2);
            boolean z = uvfVar2 != null;
            yhd0 yhd0Var = this.g;
            uhd0 uhd0Var = this.h;
            yhd0Var.e(uhd0Var, "LocalThumbnailBitmapSdk29Producer", z);
            uhd0Var.s("local", "thumbnail_bitmap");
        }
    }

    /* compiled from: LocalThumbnailBitmapSdk29Producer.java */
    public class b extends uk6 {
        public final /* synthetic */ a a;

        public b(a aVar) {
            this.a = aVar;
        }

        @Override // xsna.vhd0
        public final void c() {
            this.a.a();
        }
    }

    public xvz(Executor executor, ContentResolver contentResolver) {
        this.a = executor;
        this.b = contentResolver;
    }

    @Override // xsna.thd0
    public final void b(l7j<uvf<svf>> l7jVar, uhd0 uhd0Var) {
        yhd0 q = uhd0Var.q();
        ImageRequest r = uhd0Var.r();
        uhd0Var.s("local", "thumbnail_bitmap");
        a aVar = new a(l7jVar, q, uhd0Var, q, uhd0Var, r, new CancellationSignal());
        uhd0Var.p(new b(aVar));
        this.a.execute(aVar);
    }
}

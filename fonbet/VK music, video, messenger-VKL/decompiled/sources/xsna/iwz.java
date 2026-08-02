package xsna;

import android.content.ContentResolver;
import android.graphics.Bitmap;
import android.media.MediaMetadataRetriever;
import android.media.ThumbnailUtils;
import android.os.ParcelFileDescriptor;
import com.facebook.common.internal.ImmutableMap;
import com.facebook.imagepipeline.request.ImageRequest;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Map;
import java.util.concurrent.Executor;

/* compiled from: LocalVideoThumbnailProducer.java */
/* loaded from: classes12.dex */
public class iwz implements thd0<uvf<svf>> {
    public final Executor a;
    public final ContentResolver b;

    /* compiled from: LocalVideoThumbnailProducer.java */
    public class a extends zuk0<uvf<svf>> {
        public final /* synthetic */ yhd0 g;
        public final /* synthetic */ uhd0 h;
        public final /* synthetic */ ImageRequest i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(l7j l7jVar, yhd0 yhd0Var, uhd0 uhd0Var, yhd0 yhd0Var2, uhd0 uhd0Var2, ImageRequest imageRequest) {
            super(l7jVar, yhd0Var, uhd0Var, "VideoThumbnailProducer");
            this.g = yhd0Var2;
            this.h = uhd0Var2;
            this.i = imageRequest;
        }

        @Override // xsna.zuk0
        public final void b(Object obj) {
            uvf.q((uvf) obj);
        }

        @Override // xsna.zuk0
        public final Map c(uvf<svf> uvfVar) {
            return ImmutableMap.a("createdThumbnail", String.valueOf(uvfVar != null));
        }

        /* JADX WARN: Removed duplicated region for block: B:47:0x006a  */
        /* JADX WARN: Removed duplicated region for block: B:49:? A[RETURN, SYNTHETIC] */
        @Override // xsna.zuk0
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object d() throws Exception {
            String str;
            Bitmap bitmap;
            MediaMetadataRetriever mediaMetadataRetriever;
            Bitmap bitmap2;
            int i;
            ContentResolver contentResolver = iwz.this.b;
            ImageRequest imageRequest = this.i;
            MediaMetadataRetriever mediaMetadataRetriever2 = null;
            try {
                str = meq0.a(contentResolver, imageRequest.b);
            } catch (IllegalArgumentException unused) {
                str = null;
            }
            if (str != null) {
                x9g0 x9g0Var = imageRequest.h;
                if ((x9g0Var != null ? x9g0Var.a : 2048) <= 96) {
                    if ((x9g0Var != null ? x9g0Var.b : 2048) <= 96) {
                        i = 3;
                        bitmap = ThumbnailUtils.createVideoThumbnail(str, i);
                    }
                }
                i = 1;
                bitmap = ThumbnailUtils.createVideoThumbnail(str, i);
            } else {
                bitmap = null;
            }
            if (bitmap == null) {
                try {
                    ParcelFileDescriptor openFileDescriptor = contentResolver.openFileDescriptor(imageRequest.b, "r");
                    openFileDescriptor.getClass();
                    mediaMetadataRetriever = new MediaMetadataRetriever();
                    try {
                        mediaMetadataRetriever.setDataSource(openFileDescriptor.getFileDescriptor());
                        bitmap2 = mediaMetadataRetriever.getFrameAtTime(-1L);
                        try {
                            mediaMetadataRetriever.release();
                        } catch (IOException unused2) {
                        }
                    } catch (FileNotFoundException unused3) {
                        if (mediaMetadataRetriever != null) {
                            try {
                                mediaMetadataRetriever.release();
                            } catch (IOException unused4) {
                            }
                        }
                        bitmap2 = null;
                        bitmap = bitmap2;
                        if (bitmap != null) {
                        }
                    } catch (Throwable th) {
                        th = th;
                        mediaMetadataRetriever2 = mediaMetadataRetriever;
                        if (mediaMetadataRetriever2 != null) {
                            try {
                                mediaMetadataRetriever2.release();
                            } catch (IOException unused5) {
                            }
                        }
                        throw th;
                    }
                } catch (FileNotFoundException unused6) {
                    mediaMetadataRetriever = null;
                } catch (Throwable th2) {
                    th = th2;
                }
                bitmap = bitmap2;
            }
            if (bitmap != null) {
                return null;
            }
            lcl i2 = xvf.i2(bitmap, wwf0.s(), gpw.d);
            kuu kuuVar = this.h;
            kuuVar.h("thumbnail", "image_format");
            i2.b(kuuVar.getExtras());
            return uvf.v(i2);
        }

        @Override // xsna.zuk0
        public final void f(Exception exc) {
            super.f(exc);
            yhd0 yhd0Var = this.g;
            uhd0 uhd0Var = this.h;
            yhd0Var.e(uhd0Var, "VideoThumbnailProducer", false);
            uhd0Var.s("local", "video");
        }

        @Override // xsna.zuk0
        public final void g(uvf<svf> uvfVar) {
            uvf<svf> uvfVar2 = uvfVar;
            super.g(uvfVar2);
            boolean z = uvfVar2 != null;
            yhd0 yhd0Var = this.g;
            uhd0 uhd0Var = this.h;
            yhd0Var.e(uhd0Var, "VideoThumbnailProducer", z);
            uhd0Var.s("local", "video");
        }
    }

    /* compiled from: LocalVideoThumbnailProducer.java */
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

    public iwz(Executor executor, ContentResolver contentResolver) {
        this.a = executor;
        this.b = contentResolver;
    }

    @Override // xsna.thd0
    public void b(l7j<uvf<svf>> l7jVar, uhd0 uhd0Var) {
        yhd0 q = uhd0Var.q();
        ImageRequest r = uhd0Var.r();
        uhd0Var.s("local", "video");
        a aVar = new a(l7jVar, q, uhd0Var, q, uhd0Var, r);
        uhd0Var.p(new b(aVar));
        this.a.execute(aVar);
    }
}

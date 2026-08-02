package xsna;

import android.content.Context;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.ImageDecoder;
import android.media.MediaMetadataRetriever;
import android.media.ThumbnailUtils;
import android.net.Uri;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import android.provider.DocumentsContract;
import android.provider.MediaStore;
import android.util.Size;
import com.facebook.imagepipeline.request.ImageRequest;
import com.ironsource.X3;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.io.File;
import java.io.FileNotFoundException;

/* compiled from: VkLocalVideoThumbnailProducer.kt */
/* loaded from: classes2.dex */
public final class r2v0 extends zuk0<uvf<svf>> {
    public final /* synthetic */ yhd0 g;
    public final /* synthetic */ uhd0 h;
    public final /* synthetic */ s2v0 i;
    public final /* synthetic */ ImageRequest j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r2v0(l7j<uvf<svf>> l7jVar, yhd0 yhd0Var, uhd0 uhd0Var, s2v0 s2v0Var, ImageRequest imageRequest) {
        super(l7jVar, yhd0Var, uhd0Var, "VideoThumbnailProducer");
        this.g = yhd0Var;
        this.h = uhd0Var;
        this.i = s2v0Var;
        this.j = imageRequest;
    }

    @Override // xsna.zuk0
    public final void b(Object obj) {
        uvf.q((uvf) obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0166 A[Catch: all -> 0x016b, TryCatch #3 {all -> 0x016b, blocks: (B:75:0x015d, B:77:0x0166, B:78:0x016e, B:80:0x0174, B:81:0x017a), top: B:74:0x015d, outer: #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0174 A[Catch: all -> 0x016b, TryCatch #3 {all -> 0x016b, blocks: (B:75:0x015d, B:77:0x0166, B:78:0x016e, B:80:0x0174, B:81:0x017a), top: B:74:0x015d, outer: #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0179  */
    @Override // xsna.zuk0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d() {
        String str;
        Bitmap bitmap;
        MediaMetadataRetriever mediaMetadataRetriever;
        Bitmap createVideoThumbnail;
        Uri uri;
        String str2;
        String[] strArr;
        Uri uri2;
        ImageDecoder.Source createSource;
        int i = Build.VERSION.SDK_INT;
        ImageRequest imageRequest = this.j;
        if (i >= 31) {
            Context context = e43.a;
            if (context == null) {
                context = null;
            }
            Uri uri3 = imageRequest.b;
            x9g0 x9g0Var = imageRequest.h;
            Size size = new Size(x9g0Var != null ? x9g0Var.a : 2048, x9g0Var != null ? x9g0Var.b : 2048);
            mediaMetadataRetriever = new MediaMetadataRetriever();
            try {
                MediaMetadataRetriever mediaMetadataRetriever2 = mediaMetadataRetriever;
                mediaMetadataRetriever2.setDataSource(context, uri3);
                byte[] embeddedPicture = mediaMetadataRetriever2.getEmbeddedPicture();
                if (embeddedPicture != null) {
                    createSource = ImageDecoder.createSource(embeddedPicture);
                    bitmap = ImageDecoder.decodeBitmap(createSource);
                    yfb.d(mediaMetadataRetriever, null);
                } else {
                    String extractMetadata = mediaMetadataRetriever2.extractMetadata(9);
                    bitmap = mediaMetadataRetriever2.getScaledFrameAtTime(((extractMetadata != null ? Long.parseLong(extractMetadata) : 0L) * 1000) / 2, 2, size.getWidth(), size.getHeight());
                    yfb.d(mediaMetadataRetriever, null);
                }
            } catch (Throwable th) {
                try {
                    throw th;
                } finally {
                }
            }
        } else {
            s2v0 s2v0Var = this.i;
            int i2 = 1;
            try {
                try {
                    if (imageRequest != null && (uri = imageRequest.b) != null) {
                        if (X3.i.b.equals(meq0.b(uri))) {
                            File k = imageRequest.k();
                            if (k != null) {
                                str = k.getPath();
                            }
                        } else if (HandleInvocationsFromAdViewer.KEY_PRIVACY_UPDATE_CONTENT.equals(meq0.b(uri))) {
                            if ("com.android.providers.media.documents".equals(uri.getAuthority())) {
                                String documentId = DocumentsContract.getDocumentId(uri);
                                str2 = "_id=?";
                                uri2 = MediaStore.Video.Media.EXTERNAL_CONTENT_URI;
                                strArr = new String[]{drm0.c0(documentId, new String[]{StringUtils.PROCESS_POSTFIX_DELIMITER}, 0, 6).get(1)};
                            } else {
                                str2 = null;
                                strArr = null;
                                uri2 = uri;
                            }
                            Cursor query = s2v0Var.d.query(uri2, new String[]{"_data"}, str2, strArr, null);
                            if (query != null) {
                                try {
                                    if (query.moveToFirst()) {
                                        str = query.getString(query.getColumnIndexOrThrow("_data"));
                                        query.close();
                                    }
                                } catch (Throwable th2) {
                                    try {
                                        throw th2;
                                    } catch (Throwable th3) {
                                        ro.e(query, th2);
                                        throw th3;
                                    }
                                }
                            }
                            s3q0 s3q0Var = s3q0.a;
                            ro.e(query, null);
                        }
                        if (str != null) {
                            x9g0 x9g0Var2 = imageRequest.h;
                            if ((x9g0Var2 != null ? x9g0Var2.a : 2048) <= 400) {
                                if ((x9g0Var2 != null ? x9g0Var2.b : 2048) <= 400) {
                                    if ((x9g0Var2 != null ? x9g0Var2.a : 2048) <= 100) {
                                        if ((x9g0Var2 != null ? x9g0Var2.b : 2048) <= 100) {
                                            i2 = 3;
                                        }
                                    }
                                    createVideoThumbnail = ThumbnailUtils.createVideoThumbnail(str, i2);
                                    if (createVideoThumbnail != null) {
                                        bitmap = createVideoThumbnail;
                                    }
                                }
                            }
                            i2 = 2;
                            createVideoThumbnail = ThumbnailUtils.createVideoThumbnail(str, i2);
                            if (createVideoThumbnail != null) {
                            }
                        }
                        ParcelFileDescriptor openFileDescriptor = s2v0Var.d.openFileDescriptor(imageRequest.b, "r");
                        mediaMetadataRetriever = new MediaMetadataRetriever();
                        MediaMetadataRetriever mediaMetadataRetriever3 = mediaMetadataRetriever;
                        String extractMetadata2 = mediaMetadataRetriever3.extractMetadata(9);
                        long parseLong = ((extractMetadata2 != null ? Long.parseLong(extractMetadata2) : 0L) * 1000) / 2;
                        mediaMetadataRetriever3.setDataSource(openFileDescriptor == null ? openFileDescriptor.getFileDescriptor() : null);
                        bitmap = mediaMetadataRetriever3.getFrameAtTime(parseLong);
                        yfb.d(mediaMetadataRetriever, null);
                    }
                    MediaMetadataRetriever mediaMetadataRetriever32 = mediaMetadataRetriever;
                    String extractMetadata22 = mediaMetadataRetriever32.extractMetadata(9);
                    long parseLong2 = ((extractMetadata22 != null ? Long.parseLong(extractMetadata22) : 0L) * 1000) / 2;
                    mediaMetadataRetriever32.setDataSource(openFileDescriptor == null ? openFileDescriptor.getFileDescriptor() : null);
                    bitmap = mediaMetadataRetriever32.getFrameAtTime(parseLong2);
                    yfb.d(mediaMetadataRetriever, null);
                } finally {
                }
                ParcelFileDescriptor openFileDescriptor2 = s2v0Var.d.openFileDescriptor(imageRequest.b, "r");
                mediaMetadataRetriever = new MediaMetadataRetriever();
            } catch (FileNotFoundException unused) {
                bitmap = null;
            }
            str = null;
            if (str != null) {
            }
        }
        if (bitmap == null) {
            return null;
        }
        lcl i22 = xvf.i2(bitmap, wwf0.s(), gpw.d);
        kuu kuuVar = this.h;
        kuuVar.h("thumbnail", "image_format");
        i22.b(kuuVar.getExtras());
        return uvf.v(i22);
    }

    @Override // xsna.zuk0
    public final void f(Exception exc) {
        super.f(exc);
        yhd0 yhd0Var = this.g;
        uhd0 uhd0Var = this.h;
        yhd0Var.e(uhd0Var, "VideoThumbnailProducer", false);
        uhd0Var.t("local");
    }

    @Override // xsna.zuk0
    public final void g(uvf<svf> uvfVar) {
        uvf<svf> uvfVar2 = uvfVar;
        super.g(uvfVar2);
        boolean z = uvfVar2 != null;
        yhd0 yhd0Var = this.g;
        uhd0 uhd0Var = this.h;
        yhd0Var.e(uhd0Var, "VideoThumbnailProducer", z);
        uhd0Var.t("local");
    }
}

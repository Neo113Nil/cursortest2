package xsna;

import android.content.ContentResolver;
import android.database.Cursor;
import android.graphics.Rect;
import android.media.ExifInterface;
import android.net.Uri;
import android.provider.MediaStore;
import com.facebook.imagepipeline.request.ImageRequest;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.Executor;

/* compiled from: LocalContentUriThumbnailFetchProducer.java */
/* loaded from: classes12.dex */
public final class huz extends luz implements uso0<rip> {
    public static final String[] d = {"_id", "_data"};
    public static final String[] e = {"_data"};
    public static final Rect f = new Rect(0, 0, 512, 384);
    public static final Rect g = new Rect(0, 0, 96, 96);
    public final ContentResolver c;

    public huz(Executor executor, b320 b320Var, ContentResolver contentResolver) {
        super(executor, b320Var);
        this.c = contentResolver;
    }

    @Override // xsna.uso0
    public final boolean a(x9g0 x9g0Var) {
        Rect rect = f;
        return m4s.w(rect.width(), rect.height(), x9g0Var);
    }

    @Override // xsna.luz
    public final rip d(ImageRequest imageRequest) throws IOException {
        x9g0 x9g0Var;
        Cursor query;
        rip f2;
        int b;
        Uri uri = imageRequest.b;
        Uri uri2 = meq0.a;
        String uri3 = uri.toString();
        if ((!uri3.startsWith(MediaStore.Images.Media.EXTERNAL_CONTENT_URI.toString()) && !uri3.startsWith(MediaStore.Images.Media.INTERNAL_CONTENT_URI.toString())) || (x9g0Var = imageRequest.h) == null || (query = this.c.query(uri, d, null, null, null)) == null) {
            return null;
        }
        try {
            if (!query.moveToFirst() || (f2 = f(x9g0Var, query.getLong(query.getColumnIndex("_id")))) == null) {
                query.close();
                return null;
            }
            int columnIndex = query.getColumnIndex("_data");
            if (columnIndex >= 0) {
                String string = query.getString(columnIndex);
                if (string != null) {
                    try {
                        b = wp80.b(new ExifInterface(string).getAttributeInt("Orientation", 1));
                    } catch (IOException e2) {
                        if (ahq.a.a(6)) {
                            bhq.c(6, huz.class.getSimpleName(), "Unable to retrieve thumbnail rotation for ".concat(string), e2);
                        }
                    }
                    f2.d = b;
                }
                b = 0;
                f2.d = b;
            }
            query.close();
            return f2;
        } catch (Throwable th) {
            query.close();
            throw th;
        }
    }

    @Override // xsna.luz
    public final String e() {
        return "LocalContentUriThumbnailFetchProducer";
    }

    public final rip f(x9g0 x9g0Var, long j) throws IOException {
        int i;
        Cursor queryMiniThumbnail;
        int columnIndex;
        Rect rect = g;
        if (m4s.w(rect.width(), rect.height(), x9g0Var)) {
            i = 3;
        } else {
            Rect rect2 = f;
            i = m4s.w(rect2.width(), rect2.height(), x9g0Var) ? 1 : 0;
        }
        if (i == 0 || (queryMiniThumbnail = MediaStore.Images.Thumbnails.queryMiniThumbnail(this.c, j, i, e)) == null) {
            return null;
        }
        try {
            if (queryMiniThumbnail.moveToFirst() && (columnIndex = queryMiniThumbnail.getColumnIndex("_data")) >= 0) {
                String string = queryMiniThumbnail.getString(columnIndex);
                string.getClass();
                if (new File(string).exists()) {
                    return c(new FileInputStream(string), (int) new File(string).length());
                }
            }
            return null;
        } finally {
            queryMiniThumbnail.close();
        }
    }
}

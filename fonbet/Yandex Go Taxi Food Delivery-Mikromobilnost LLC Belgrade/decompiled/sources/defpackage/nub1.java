package defpackage;

import android.content.ContentUris;
import android.content.Context;
import android.database.Cursor;
import android.media.MediaMetadataRetriever;
import android.net.Uri;
import android.os.Build;
import android.provider.MediaStore;
import androidx.exifinterface.media.a;
import com.fluttercandies.photo_manager.core.utils.b;
import java.io.File;
import java.io.InputStream;
import ru.yandex.common.clid.ClidProvider;

/* loaded from: classes11.dex */
public abstract class nub1 {
    public static au2 a;

    public static final int a(Cursor cursor, String str) {
        return cursor.getInt(cursor.getColumnIndex(str));
    }

    public static final long b(Cursor cursor, String str) {
        return cursor.getLong(cursor.getColumnIndex(str));
    }

    public static final String c(Cursor cursor, String str) {
        String string;
        int columnIndex = cursor.getColumnIndex(str);
        return (columnIndex == -1 || (string = cursor.getString(columnIndex)) == null) ? "" : string;
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x017f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static d93 d(Context context, int i, Cursor cursor, boolean z) {
        Uri withAppendedId;
        int i2;
        String str;
        int i3 = 1;
        boolean z2 = (i & 2) != 0 ? true : z;
        boolean z3 = (i & 4) != 0;
        long b = b(cursor, ClidProvider._ID);
        String c = c(cursor, "_data");
        if (z2 && !evu0.J(c) && !new File(c).exists()) {
            if (!z3) {
                return null;
            }
            StringBuilder k = x4e.k("Asset (", b, ") does not exists at its path (", c);
            k.append(").");
            throw new RuntimeException(k.toString());
        }
        b.a.getClass();
        long b2 = b(cursor, "datetaken") / 1000;
        if (b2 == 0) {
            b2 = b(cursor, "date_added");
        }
        long j = b2;
        int a2 = a(cursor, "media_type");
        String c2 = c(cursor, "mime_type");
        long b3 = a2 != 1 ? b(cursor, "duration") : 0L;
        int a3 = a(cursor, "width");
        int a4 = a(cursor, "height");
        String c3 = c(cursor, "_display_name");
        long b4 = b(cursor, "date_modified");
        int a5 = a(cursor, "orientation");
        boolean z4 = Build.VERSION.SDK_INT >= 30 && a(cursor, "is_favorite") == 1;
        String c4 = c(cursor, "relative_path");
        if (a3 == 0 || a4 == 0) {
            if (a2 == 1) {
                try {
                    if (!evu0.y(c2, "svg", false)) {
                        int i4 = a2 != 1 ? a2 != 2 ? a2 != 3 ? 0 : 2 : 3 : 1;
                        if (i4 == 1) {
                            withAppendedId = ContentUris.withAppendedId(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, b);
                        } else if (i4 == 2) {
                            withAppendedId = ContentUris.withAppendedId(MediaStore.Video.Media.EXTERNAL_CONTENT_URI, b);
                        } else {
                            if (i4 != 3) {
                                throw new RuntimeException("Unexpected asset type " + i4);
                            }
                            withAppendedId = ContentUris.withAppendedId(MediaStore.Audio.Media.EXTERNAL_CONTENT_URI, b);
                        }
                        InputStream openInputStream = context.getContentResolver().openInputStream(withAppendedId);
                        if (openInputStream != null) {
                            try {
                                a aVar = new a(openInputStream);
                                String c5 = aVar.c("ImageWidth");
                                if (c5 != null) {
                                    a3 = Integer.parseInt(c5);
                                }
                                String c6 = aVar.c("ImageLength");
                                if (c6 != null) {
                                    a4 = Integer.parseInt(c6);
                                }
                                openInputStream.close();
                            } catch (Throwable th) {
                                int i5 = a3;
                                try {
                                    throw th;
                                } catch (Throwable th2) {
                                    try {
                                        ooc.g(openInputStream, th);
                                        throw th2;
                                    } catch (Throwable th3) {
                                        th = th3;
                                        a3 = i5;
                                        wfz.h(th);
                                        int i6 = a4;
                                        int i7 = a5;
                                        int i8 = a3;
                                        if (a2 != 1) {
                                        }
                                        i2 = i3;
                                        str = c2;
                                        return new d93(b, c, b3, j, i8, i6, i2, c3, b4, i7, z4, c4, str);
                                    }
                                }
                            }
                        }
                    }
                } catch (Throwable th4) {
                    th = th4;
                }
            }
            if (a2 == 3) {
                MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
                mediaMetadataRetriever.setDataSource(c);
                String extractMetadata = mediaMetadataRetriever.extractMetadata(18);
                a3 = extractMetadata != null ? Integer.parseInt(extractMetadata) : 0;
                String extractMetadata2 = mediaMetadataRetriever.extractMetadata(19);
                a4 = extractMetadata2 != null ? Integer.parseInt(extractMetadata2) : 0;
                String extractMetadata3 = mediaMetadataRetriever.extractMetadata(24);
                if (extractMetadata3 != null) {
                    a5 = Integer.parseInt(extractMetadata3);
                }
                mediaMetadataRetriever.close();
            }
        }
        int i62 = a4;
        int i72 = a5;
        int i82 = a3;
        if (a2 != 1) {
            i3 = 3;
            if (a2 != 2) {
                str = c2;
                i2 = a2 != 3 ? 0 : 2;
                return new d93(b, c, b3, j, i82, i62, i2, c3, b4, i72, z4, c4, str);
            }
        }
        i2 = i3;
        str = c2;
        return new d93(b, c, b3, j, i82, i62, i2, c3, b4, i72, z4, c4, str);
    }

    public static final gz50 e(d5j0 d5j0Var) {
        fz50 fz50Var;
        fz50 fz50Var2;
        m5j0 m5j0Var;
        rq50 rq50Var;
        wg10 b;
        Uri parse = Uri.parse(d5j0Var.a.i);
        xu50 e = mub1.e(d5j0Var.c);
        String str = d5j0Var.b;
        if (str.equals("GET")) {
            fz50Var2 = fz50.b;
        } else {
            if (!str.equals("POST")) {
                fz50Var = new fz50(str);
                m5j0Var = d5j0Var.d;
                if (m5j0Var != null || (b = m5j0Var.b()) == null) {
                    rq50Var = rq50.d;
                } else {
                    String str2 = b.a;
                    rq50Var = str2.equals("application/json") ? rq50.b : str2.equals("application/octet-stream") ? rq50.c : new rq50(str2);
                }
                return new gz50(parse, e, fz50Var, rq50Var, d5j0Var.d);
            }
            fz50Var2 = fz50.c;
        }
        fz50Var = fz50Var2;
        m5j0Var = d5j0Var.d;
        if (m5j0Var != null) {
        }
        rq50Var = rq50.d;
        return new gz50(parse, e, fz50Var, rq50Var, d5j0Var.d);
    }

    public static final d5j0 f(gz50 gz50Var) {
        t4j0 t4j0Var = new t4j0();
        t4j0Var.h(gz50Var.a.toString());
        xu50 xu50Var = gz50Var.b;
        keu keuVar = new keu();
        mub1.a(keuVar, xu50Var);
        t4j0Var.c = keuVar.d().d();
        t4j0Var.e(gz50Var.c.a, (m5j0) gz50Var.e);
        return new d5j0(t4j0Var);
    }
}

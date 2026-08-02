package xsna;

import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.graphics.BitmapFactory;
import android.media.MediaMetadataRetriever;
import android.net.Uri;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.credentials.exceptions.publickeycredential.DomExceptionUtils;
import androidx.fragment.app.FragmentActivity;
import com.vk.log.L;
import com.vkontakte.android.R;
import io.jsonwebtoken.JwtParser;
import java.io.File;

/* compiled from: IntentUtils.java */
/* loaded from: classes17.dex */
public final class tax {
    public static boolean a(Context context, Intent intent) {
        return !context.getPackageManager().queryIntentActivities(intent, 0).isEmpty();
    }

    public static String b(FragmentActivity fragmentActivity, Uri uri, String str, String[] strArr) {
        Throwable th;
        Cursor cursor = null;
        try {
            Cursor query = fragmentActivity.getContentResolver().query(uri, new String[]{"_data"}, str, strArr, null);
            if (query != null) {
                try {
                    if (query.moveToFirst()) {
                        String string = query.getString(query.getColumnIndexOrThrow("_data"));
                        L.e(String.format("Converted %s to %s", uri, string));
                        query.close();
                        return string;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    cursor = query;
                    if (cursor == null) {
                        throw th;
                    }
                    cursor.close();
                    throw th;
                }
            }
            if (query != null) {
                query.close();
            }
            return null;
        } catch (Throwable th3) {
            th = th3;
        }
    }

    @Nullable
    public static String c(File file) {
        try {
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inJustDecodeBounds = true;
            BitmapFactory.decodeFile(file.getAbsolutePath(), options);
            if (options.outWidth == -1 || options.outHeight == -1) {
                return null;
            }
            return options.outMimeType;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x002f, code lost:
    
        if (r3 == null) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0039 A[Catch: all -> 0x003d, TryCatch #2 {all -> 0x003d, blocks: (B:3:0x0001, B:13:0x0023, B:14:0x0032, B:23:0x0039, B:24:0x003c), top: B:2:0x0001 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static String d(File file) {
        MediaMetadataRetriever mediaMetadataRetriever;
        try {
            String absolutePath = file.getAbsolutePath();
            if (absolutePath != null) {
                long j = 0;
                try {
                    mediaMetadataRetriever = new MediaMetadataRetriever();
                    try {
                        try {
                            mediaMetadataRetriever.setDataSource(absolutePath);
                            String extractMetadata = mediaMetadataRetriever.extractMetadata(9);
                            if (extractMetadata != null) {
                                j = Long.parseLong(extractMetadata);
                            }
                        } catch (Exception e) {
                            e = e;
                            e.toString();
                        }
                    } catch (Throwable th) {
                        th = th;
                        if (mediaMetadataRetriever != null) {
                            mediaMetadataRetriever.release();
                        }
                        throw th;
                    }
                } catch (Exception e2) {
                    e = e2;
                    mediaMetadataRetriever = null;
                } catch (Throwable th2) {
                    th = th2;
                    mediaMetadataRetriever = null;
                    if (mediaMetadataRetriever != null) {
                    }
                    throw th;
                }
                mediaMetadataRetriever.release();
                return Long.toString(j);
            }
        } catch (Throwable unused) {
        }
        return null;
    }

    public static File e(File file, String str) {
        String substring = str.substring(str.lastIndexOf(DomExceptionUtils.SEPARATOR) + 1);
        String parent = file.getParent();
        String name = file.getName();
        File file2 = new File(parent, name.substring(0, name.lastIndexOf(".")) + JwtParser.SEPARATOR_CHAR + substring);
        return file.renameTo(file2) ? file2 : file;
    }

    public static void f(@NonNull Context context, @NonNull String str) {
        Intent intent = new Intent("android.intent.action.SEND");
        intent.setType("text/plain");
        intent.setFlags(268435456);
        intent.putExtra("android.intent.extra.TEXT", str);
        context.startActivity(Intent.createChooser(intent, context.getString(R.string.share)));
    }
}

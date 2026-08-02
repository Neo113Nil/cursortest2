package defpackage;

import android.app.Activity;
import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.os.Handler;
import android.os.Looper;
import android.provider.MediaStore;
import androidx.core.app.b;
import com.yandex.div.state.db.StateEntry;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.stream.Stream;
import org.apache.commons.imaging.ImageFormats;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.CryptoPro.JCP.tools.SelfTester_JCP;

/* loaded from: classes7.dex */
public class nrs implements tsr, ca20, r30, ozc0 {
    public static final Uri x = MediaStore.Images.Media.EXTERNAL_CONTENT_URI;
    public static final Uri y = MediaStore.Video.Media.EXTERNAL_CONTENT_URI;
    public static final boolean z;
    public ea20 a;
    public ssr b;
    public Activity c;
    public lz w;

    static {
        z = Build.VERSION.SDK_INT <= 29;
    }

    public static void a(Exception exc, ba20 ba20Var) {
        String str = ((exc instanceof SecurityException) || exc.toString().contains("Permission denied")) ? "ACCESS_DENIED" : exc instanceof FileNotFoundException ? "NOT_SUPPORTED_FORMAT" : ((exc instanceof IOException) && exc.toString().contains("No space left on device")) ? "NOT_ENOUGH_SPACE" : "UNEXPECTED";
        String th = exc.toString();
        StackTraceElement[] stackTrace = exc.getStackTrace();
        StringBuilder sb = new StringBuilder();
        for (StackTraceElement stackTraceElement : stackTrace) {
            sb.append(stackTraceElement.toString());
            sb.append("\n");
        }
        new Handler(Looper.getMainLooper()).post(new l9(ba20Var, str, th, sb, 14));
    }

    public final boolean b(boolean z2) {
        int i = Build.VERSION.SDK_INT;
        if (i > 29) {
            return true;
        }
        return (i == 29 && !z2) || qke.h(this.b.a, "android.permission.WRITE_EXTERNAL_STORAGE") == 0;
    }

    public final void c(String str, String str2, boolean z2) {
        File file = new File(str);
        String name = file.getName();
        int lastIndexOf = name.lastIndexOf(46);
        if (lastIndexOf == -1) {
            throw new FileNotFoundException("Extension not found.");
        }
        FileInputStream fileInputStream = new FileInputStream(file);
        try {
            e(fileInputStream, z2, name.substring(0, lastIndexOf), name.substring(lastIndexOf), str2);
            fileInputStream.close();
        } finally {
        }
    }

    public final void d(String str, String str2, byte[] bArr) {
        ImageFormats imageFormats;
        r501 r501Var = new r501(9);
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
        try {
            int read = byteArrayInputStream.read();
            int read2 = byteArrayInputStream.read();
            if (read < 0 || read2 < 0) {
                throw new IllegalArgumentException("Couldn't read magic numbers to guess format.");
            }
            int[] iArr = {read & 255, read2 & 255};
            if (bj91.i(bj91.a, iArr)) {
                imageFormats = ImageFormats.GIF;
            } else if (bj91.i(bj91.b, iArr)) {
                imageFormats = ImageFormats.PNG;
            } else if (bj91.i(bj91.c, iArr)) {
                imageFormats = ImageFormats.JPEG;
            } else if (bj91.i(bj91.d, iArr)) {
                imageFormats = ImageFormats.BMP;
            } else if (bj91.i(bj91.e, iArr)) {
                imageFormats = ImageFormats.TIFF;
            } else if (bj91.i(bj91.f, iArr)) {
                imageFormats = ImageFormats.TIFF;
            } else if (bj91.i(bj91.h, iArr)) {
                imageFormats = ImageFormats.PSD;
            } else if (bj91.i(bj91.g, iArr)) {
                imageFormats = ImageFormats.PAM;
            } else if (bj91.i(bj91.i, iArr)) {
                imageFormats = ImageFormats.PBM;
            } else if (bj91.i(bj91.j, iArr)) {
                imageFormats = ImageFormats.PBM;
            } else if (bj91.i(bj91.k, iArr)) {
                imageFormats = ImageFormats.PGM;
            } else if (bj91.i(bj91.l, iArr)) {
                imageFormats = ImageFormats.PGM;
            } else if (bj91.i(bj91.m, iArr)) {
                imageFormats = ImageFormats.PPM;
            } else if (bj91.i(bj91.n, iArr)) {
                imageFormats = ImageFormats.PPM;
            } else if (bj91.i(bj91.o, iArr)) {
                int read3 = byteArrayInputStream.read();
                int read4 = byteArrayInputStream.read();
                if (read3 < 0 || read4 < 0) {
                    throw new IllegalArgumentException("Couldn't read magic numbers to guess format.");
                }
                if (bj91.i(bj91.p, new int[]{read3 & 255, read4 & 255})) {
                    imageFormats = ImageFormats.JBIG2;
                }
                imageFormats = (ImageFormats) Stream.of((Object[]) ImageFormats.values()).filter(new sdc(8, r501Var)).findFirst().orElse(ImageFormats.UNKNOWN);
            } else if (bj91.i(bj91.q, iArr)) {
                imageFormats = ImageFormats.ICNS;
            } else if (bj91.i(bj91.r, iArr)) {
                imageFormats = ImageFormats.DCX;
            } else {
                if (bj91.i(bj91.s, iArr)) {
                    imageFormats = ImageFormats.RGBE;
                }
                imageFormats = (ImageFormats) Stream.of((Object[]) ImageFormats.values()).filter(new sdc(8, r501Var)).findFirst().orElse(ImageFormats.UNKNOWN);
            }
            byteArrayInputStream.close();
            String str3 = Extension.DOT_CHAR + imageFormats.a().toLowerCase();
            byteArrayInputStream = new ByteArrayInputStream(bArr);
            try {
                e(byteArrayInputStream, true, str2, str3, str);
                byteArrayInputStream.close();
            } finally {
            }
        } finally {
        }
    }

    public final void e(InputStream inputStream, boolean z2, String str, String str2, String str3) {
        String h;
        ContentResolver contentResolver = this.b.a.getContentResolver();
        ContentValues contentValues = new ContentValues();
        String str4 = (z2 || str3 != null) ? Environment.DIRECTORY_PICTURES : Environment.DIRECTORY_MOVIES;
        if (z) {
            File externalStoragePublicDirectory = Environment.getExternalStoragePublicDirectory(str4);
            if (str3 == null) {
                str3 = "";
            }
            File file = new File(externalStoragePublicDirectory, str3);
            if (!file.exists()) {
                file.mkdirs();
            }
            StringBuilder sb = new StringBuilder();
            sb.append(file.getPath());
            String t = oyr.t(sb, File.separator, str);
            int i = 0;
            while (true) {
                h = x4e.h(qv10.t(t), i == 0 ? "" : Integer.valueOf(i), str2);
                if (!new File(h).exists()) {
                    break;
                } else {
                    i++;
                }
            }
            contentValues.put("_data", h);
        } else {
            StringBuilder t2 = qv10.t(str4);
            t2.append(str3 != null ? oyr.t(new StringBuilder(), File.separator, str3) : "");
            contentValues.put("relative_path", t2.toString());
        }
        contentValues.put("_display_name", str + str2);
        int i2 = 0;
        while (true) {
            try {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str);
                sb2.append(i2 > 0 ? Integer.valueOf(i2) : "");
                sb2.append(str2);
                contentValues.put("_display_name", sb2.toString());
                OutputStream openOutputStream = contentResolver.openOutputStream(contentResolver.insert(z2 ? x : y, contentValues));
                try {
                    byte[] bArr = new byte[8192];
                    while (true) {
                        int read = inputStream.read(bArr);
                        if (read == -1) {
                            break;
                        } else {
                            openOutputStream.write(bArr, 0, read);
                        }
                    }
                    if (openOutputStream != null) {
                        openOutputStream.close();
                        return;
                    }
                    return;
                } catch (Throwable th) {
                    if (openOutputStream != null) {
                        try {
                            openOutputStream.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                    }
                    throw th;
                }
            } catch (IllegalStateException e) {
                if (!e.getMessage().contains("Failed to build unique file")) {
                    throw e;
                }
                i2++;
            }
        }
    }

    @Override // defpackage.r30
    public final void onAttachedToActivity(l40 l40Var) {
        this.c = (Activity) ((wrr) l40Var).b;
        ((wrr) l40Var).b(this);
    }

    @Override // defpackage.tsr
    public final void onAttachedToEngine(ssr ssrVar) {
        ea20 ea20Var = new ea20(ssrVar.c, "gal");
        this.a = ea20Var;
        ea20Var.b(this);
        this.b = ssrVar;
    }

    @Override // defpackage.r30
    public final void onDetachedFromActivity() {
        this.c = null;
    }

    @Override // defpackage.r30
    public final void onDetachedFromActivityForConfigChanges() {
        this.c = null;
    }

    @Override // defpackage.tsr
    public final void onDetachedFromEngine(ssr ssrVar) {
        this.a.b(null);
        this.b = null;
    }

    @Override // defpackage.ca20
    public final void onMethodCall(final x920 x920Var, da20 da20Var) {
        final int i;
        final int i2;
        String str = x920Var.a;
        str.getClass();
        i = 1;
        i2 = 0;
        switch (str) {
            case "hasAccess":
                ((ba20) da20Var).success(Boolean.valueOf(b(((Boolean) x920Var.a("toAlbum")).booleanValue())));
                break;
            case "open":
                Intent intent = new Intent();
                intent.setAction("android.intent.action.VIEW");
                intent.setData(x);
                intent.setFlags(SelfTester_JCP.IMITA);
                this.b.a.startActivity(intent);
                new Handler(Looper.getMainLooper()).post(new mrs((ba20) da20Var, 0));
                break;
            case "requestAccess":
                if (!b(((Boolean) x920Var.a("toAlbum")).booleanValue())) {
                    this.w = new lz((Object) this, da20Var, (Object) x920Var, false, 16);
                    b.J(this.c, new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"}, 1317298);
                    break;
                } else {
                    ((ba20) da20Var).success(Boolean.TRUE);
                    break;
                }
            case "putImage":
            case "putVideo":
                final ba20 ba20Var = (ba20) da20Var;
                new Thread(new Runnable(this) { // from class: lrs
                    public final /* synthetic */ nrs b;

                    {
                        this.b = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        int i3 = i2;
                        ba20 ba20Var2 = ba20Var;
                        x920 x920Var2 = x920Var;
                        nrs nrsVar = this.b;
                        switch (i3) {
                            case 0:
                                Uri uri = nrs.x;
                                try {
                                    nrsVar.c((String) x920Var2.a(StateEntry.COLUMN_PATH), (String) x920Var2.a("album"), x920Var2.a.contains("Image"));
                                    new Handler(Looper.getMainLooper()).post(new mrs(ba20Var2, 2));
                                    break;
                                } catch (Exception e) {
                                    nrs.a(e, ba20Var2);
                                    return;
                                }
                            default:
                                Uri uri2 = nrs.x;
                                try {
                                    nrsVar.d((String) x920Var2.a("album"), (String) x920Var2.a("name"), (byte[]) x920Var2.a("bytes"));
                                    new Handler(Looper.getMainLooper()).post(new mrs(ba20Var2, 1));
                                    break;
                                } catch (Exception e2) {
                                    nrs.a(e2, ba20Var2);
                                }
                        }
                    }
                }).start();
                break;
            case "putImageBytes":
                final ba20 ba20Var2 = (ba20) da20Var;
                new Thread(new Runnable(this) { // from class: lrs
                    public final /* synthetic */ nrs b;

                    {
                        this.b = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        int i3 = i;
                        ba20 ba20Var22 = ba20Var2;
                        x920 x920Var2 = x920Var;
                        nrs nrsVar = this.b;
                        switch (i3) {
                            case 0:
                                Uri uri = nrs.x;
                                try {
                                    nrsVar.c((String) x920Var2.a(StateEntry.COLUMN_PATH), (String) x920Var2.a("album"), x920Var2.a.contains("Image"));
                                    new Handler(Looper.getMainLooper()).post(new mrs(ba20Var22, 2));
                                    break;
                                } catch (Exception e) {
                                    nrs.a(e, ba20Var22);
                                    return;
                                }
                            default:
                                Uri uri2 = nrs.x;
                                try {
                                    nrsVar.d((String) x920Var2.a("album"), (String) x920Var2.a("name"), (byte[]) x920Var2.a("bytes"));
                                    new Handler(Looper.getMainLooper()).post(new mrs(ba20Var22, 1));
                                    break;
                                } catch (Exception e2) {
                                    nrs.a(e2, ba20Var22);
                                }
                        }
                    }
                }).start();
                break;
            default:
                ((ba20) da20Var).notImplemented();
                break;
        }
    }

    @Override // defpackage.r30
    public final void onReattachedToActivityForConfigChanges(l40 l40Var) {
        this.c = (Activity) ((wrr) l40Var).b;
        ((wrr) l40Var).b(this);
    }

    @Override // defpackage.ozc0
    public final boolean onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        if (i != 1317298 || iArr.length == 0) {
            return false;
        }
        new Handler(Looper.getMainLooper()).post(this.w);
        this.w = null;
        return true;
    }
}

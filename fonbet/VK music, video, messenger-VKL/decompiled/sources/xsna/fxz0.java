package xsna;

import android.content.Context;
import android.content.Intent;
import android.content.res.AssetFileDescriptor;
import android.util.Log;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.nio.channels.OverlappingFileLockException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* compiled from: com.google.android.play:feature-delivery@@2.1.0 */
/* loaded from: classes13.dex */
public final class fxz0 implements Runnable {
    public final /* synthetic */ List b;
    public final /* synthetic */ la01 c;
    public final /* synthetic */ lxz0 d;

    public fxz0(lxz0 lxz0Var, List list, la01 la01Var) {
        this.d = lxz0Var;
        this.b = list;
        this.c = la01Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:85:0x00cc, code lost:
    
        if (r12.exists() == false) goto L33;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x01e1 A[Catch: Exception -> 0x01dc, TRY_LEAVE, TryCatch #7 {Exception -> 0x01dc, blocks: (B:15:0x005a, B:21:0x01e1, B:132:0x01de, B:138:0x01d8, B:18:0x0069, B:32:0x0075, B:33:0x0079, B:36:0x0081, B:59:0x0130, B:95:0x0146, B:94:0x0143, B:99:0x0147, B:101:0x0157, B:103:0x015d, B:106:0x0163, B:107:0x0177, B:109:0x017b, B:112:0x01c9, B:115:0x01a4, B:118:0x01ae, B:122:0x01b6, B:125:0x01bd, B:127:0x01c3, B:134:0x01d3), top: B:14:0x005a, inners: #5, #8 }] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x01f4  */
    /* JADX WARN: Removed duplicated region for block: B:30:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0130 A[Catch: all -> 0x006e, Exception -> 0x0139, TRY_ENTER, TRY_LEAVE, TryCatch #10 {Exception -> 0x0139, blocks: (B:32:0x0075, B:33:0x0079, B:36:0x0081, B:59:0x0130, B:95:0x0146, B:94:0x0143), top: B:31:0x0075, outer: #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0133 A[SYNTHETIC] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        int i;
        Integer valueOf;
        FileLock fileLock;
        int i2;
        File[] listFiles;
        String str;
        String str2 = ".apk";
        List<Intent> list = this.b;
        la01 la01Var = this.c;
        lxz0 lxz0Var = this.d;
        Context context = lxz0Var.a;
        byz0 byz0Var = lxz0Var.c;
        try {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                String stringExtra = ((Intent) it.next()).getStringExtra("split_id");
                t801 t801Var = byz0Var.a;
                t801Var.getClass();
                File file = new File(t801Var.g(), "verified-splits");
                t801.e(file);
                if (!t801.d(file, String.valueOf(stringExtra).concat(".apk")).exists()) {
                    t801 t801Var2 = lxz0Var.b;
                    try {
                        t801Var2.getClass();
                        i = -13;
                        try {
                            FileChannel channel = new RandomAccessFile(new File(t801Var2.g(), "lock.tmp"), "rw").getChannel();
                            valueOf = null;
                            try {
                                try {
                                    fileLock = channel.tryLock();
                                } catch (Throwable th) {
                                    if (channel == null) {
                                        throw th;
                                    }
                                    try {
                                        channel.close();
                                        throw th;
                                    } catch (Throwable th2) {
                                        Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th2);
                                        throw th;
                                    }
                                }
                            } catch (OverlappingFileLockException unused) {
                                fileLock = null;
                            }
                            if (fileLock != null) {
                                try {
                                    for (Intent intent : list) {
                                        String stringExtra2 = intent.getStringExtra("split_id");
                                        AssetFileDescriptor openAssetFileDescriptor = context.getContentResolver().openAssetFileDescriptor(intent.getData(), "r");
                                        try {
                                            File file2 = new File(t801Var2.g(), "unverified-splits");
                                            t801.e(file2);
                                            File d = t801.d(file2, String.valueOf(stringExtra2).concat(str2));
                                            if (d.exists()) {
                                                if (d.length() != openAssetFileDescriptor.getLength()) {
                                                    File file3 = new File(t801Var2.g(), "verified-splits");
                                                    t801.e(file3);
                                                    if (!t801.d(file3, String.valueOf(stringExtra2).concat(str2)).exists()) {
                                                        BufferedInputStream bufferedInputStream = new BufferedInputStream(openAssetFileDescriptor.createInputStream());
                                                        try {
                                                            FileOutputStream fileOutputStream = new FileOutputStream(d);
                                                            try {
                                                                byte[] bArr = new byte[4096];
                                                                str = str2;
                                                                while (true) {
                                                                    int read = bufferedInputStream.read(bArr);
                                                                    if (read <= 0) {
                                                                        break;
                                                                    } else {
                                                                        fileOutputStream.write(bArr, 0, read);
                                                                    }
                                                                }
                                                                fileOutputStream.close();
                                                                bufferedInputStream.close();
                                                                if (openAssetFileDescriptor == null) {
                                                                    openAssetFileDescriptor.close();
                                                                }
                                                                str2 = str;
                                                            } catch (Throwable th3) {
                                                                try {
                                                                    fileOutputStream.close();
                                                                    throw th3;
                                                                } catch (Throwable th4) {
                                                                    Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th3, th4);
                                                                    throw th3;
                                                                }
                                                            }
                                                        } finally {
                                                        }
                                                    }
                                                    str = str2;
                                                    if (openAssetFileDescriptor == null) {
                                                    }
                                                    str2 = str;
                                                }
                                            }
                                        } catch (Throwable th5) {
                                            if (openAssetFileDescriptor == null) {
                                                throw th5;
                                            }
                                            try {
                                                openAssetFileDescriptor.close();
                                                throw th5;
                                            } catch (Throwable th6) {
                                                Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th5, th6);
                                                throw th5;
                                            }
                                        }
                                    }
                                    try {
                                        File file4 = new File(t801Var2.g(), "unverified-splits");
                                        t801.e(file4);
                                        listFiles = file4.listFiles();
                                        try {
                                        } catch (Exception e) {
                                            Log.e("SplitCompat", "Error verifying splits.", e);
                                        }
                                    } catch (IOException e2) {
                                        Log.e("SplitCompat", "Cannot access directory for unverified splits.", e2);
                                    }
                                } catch (Exception e3) {
                                    Log.e("SplitCompat", "Error copying splits.", e3);
                                }
                                if (byz0Var.b(listFiles)) {
                                    if (byz0Var.a(listFiles)) {
                                        try {
                                            File file5 = new File(t801Var2.g(), "unverified-splits");
                                            t801.e(file5);
                                            File[] listFiles2 = file5.listFiles();
                                            Arrays.sort(listFiles2);
                                            int length = listFiles2.length;
                                            while (true) {
                                                length--;
                                                if (length < 0) {
                                                    break;
                                                }
                                                File file6 = listFiles2[length];
                                                file6.setWritable(false, true);
                                                file6.setWritable(false, false);
                                                File file7 = listFiles2[length];
                                                File file8 = new File(t801Var2.g(), "verified-splits");
                                                t801.e(file8);
                                                file7.renameTo(t801.d(file8, file7.getName()));
                                            }
                                            i2 = 0;
                                        } catch (IOException e4) {
                                            Log.e("SplitCompat", "Cannot write verified split.", e4);
                                            i2 = -13;
                                            valueOf = Integer.valueOf(i2);
                                            fileLock.release();
                                            if (channel != null) {
                                            }
                                            if (valueOf == null) {
                                            }
                                        }
                                        valueOf = Integer.valueOf(i2);
                                        fileLock.release();
                                    }
                                }
                                Log.e("SplitCompat", "Split verification failed.");
                                i2 = -11;
                                valueOf = Integer.valueOf(i2);
                                fileLock.release();
                            }
                            if (channel != null) {
                                channel.close();
                            }
                        } catch (Exception e5) {
                            e = e5;
                            Log.e("SplitCompat", "Error locking files.", e);
                            valueOf = Integer.valueOf(i);
                            if (valueOf == null) {
                            }
                        }
                    } catch (Exception e6) {
                        e = e6;
                        i = -13;
                    }
                    if (valueOf == null) {
                        return;
                    }
                    if (valueOf.intValue() == 0) {
                        la01Var.zzc();
                        return;
                    } else {
                        la01Var.a(valueOf.intValue());
                        return;
                    }
                }
            }
            try {
                Context applicationContext = context.getApplicationContext();
                if (applicationContext != null) {
                    context = applicationContext;
                }
                if (klk0.d(context, true)) {
                    la01Var.zza();
                } else {
                    Log.e("SplitCompat", "Emulating splits failed.");
                    la01Var.a(-12);
                }
            } catch (Exception e7) {
                Log.e("SplitCompat", "Error emulating splits.", e7);
                la01Var.a(-12);
            }
        } catch (Exception e8) {
            Log.e("SplitCompat", "Error checking verified files.", e8);
            la01Var.a(-11);
        }
    }
}

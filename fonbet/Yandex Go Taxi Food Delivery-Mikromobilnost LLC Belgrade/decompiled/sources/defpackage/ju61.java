package defpackage;

import android.app.job.JobParameters;
import android.content.Context;
import android.content.Intent;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import com.android.billingclient.api.e;
import com.google.android.gms.cloudmessaging.CloudMessage;
import com.google.android.gms.cloudmessaging.d;
import com.google.android.gms.common.api.internal.b;
import com.google.android.gms.iid.zze;
import com.google.android.gms.measurement.internal.g;
import com.google.android.gms.measurement.internal.zzaf;
import com.google.android.gms.measurement.internal.zzah;
import com.google.android.gms.measurement.internal.zzbg;
import com.google.android.gms.measurement.internal.zzgb;
import com.google.android.gms.measurement.internal.zzjd;
import com.google.android.gms.measurement.internal.zzr;
import com.google.android.gms.tasks.zzw;
import com.monetization.ads.nativeads.CustomizableMediaView;
import java.io.BufferedInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.nio.channels.OverlappingFileLockException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CountDownLatch;

/* loaded from: classes11.dex */
public final class ju61 implements Runnable {
    public final /* synthetic */ int a;
    public final Object b;
    public final Object c;
    public Object w;

    public ju61(InputStream inputStream, ByteArrayOutputStream byteArrayOutputStream) {
        this.a = 0;
        this.w = null;
        this.b = inputStream;
        this.c = byteArrayOutputStream;
    }

    /* JADX WARN: Code restructure failed: missing block: B:159:0x02b3, code lost:
    
        if (r12.exists() == false) goto L98;
     */
    /* JADX WARN: Removed duplicated region for block: B:102:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0319 A[Catch: all -> 0x0250, Exception -> 0x0322, TRY_ENTER, TRY_LEAVE, TryCatch #17 {Exception -> 0x0322, blocks: (B:104:0x0257, B:105:0x0260, B:108:0x0268, B:132:0x0319, B:169:0x032f, B:168:0x032c, B:172:0x0330), top: B:103:0x0257, outer: #11 }] */
    /* JADX WARN: Removed duplicated region for block: B:135:0x031c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:94:0x03d5 A[Catch: Exception -> 0x03cf, TRY_LEAVE, TryCatch #1 {Exception -> 0x03cf, blocks: (B:88:0x023d, B:94:0x03d5, B:208:0x03d1, B:214:0x03cb, B:210:0x03c6, B:90:0x024b, B:104:0x0257, B:105:0x0260, B:108:0x0268, B:132:0x0319, B:169:0x032f, B:168:0x032c, B:172:0x0330, B:174:0x0335, B:177:0x0345, B:179:0x034b, B:182:0x0351, B:183:0x0365, B:185:0x0369, B:188:0x0390, B:189:0x03bc, B:192:0x0397, B:195:0x03a1, B:199:0x03a9, B:201:0x03b0, B:203:0x03b6), top: B:87:0x023d, inners: #5, #11 }] */
    /* JADX WARN: Removed duplicated region for block: B:96:0x03e8  */
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
        File[] listFiles2;
        int length;
        String str;
        zzw b;
        int i3 = this.a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i3) {
            case 0:
                break;
            case 1:
                ((vd71) obj2).e((CustomizableMediaView) obj, (d171) this.w);
                return;
            case 2:
                String str2 = ".apk";
                List<Intent> list = (List) obj2;
                f691 f691Var = (f691) this.w;
                Context context = f691Var.a;
                ofa0 ofa0Var = f691Var.c;
                br91 br91Var = (br91) obj;
                try {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        String stringExtra = ((Intent) it.next()).getStringExtra("split_id");
                        ndi0 ndi0Var = (ndi0) ofa0Var.a;
                        ndi0Var.getClass();
                        File file = new File(ndi0Var.l(), "verified-splits");
                        ndi0.j(file);
                        if (!ndi0.i(file, String.valueOf(stringExtra).concat(".apk")).exists()) {
                            ndi0 ndi0Var2 = f691Var.b;
                            try {
                                ndi0Var2.getClass();
                                i = -13;
                                try {
                                    FileChannel channel = new RandomAccessFile(new File(ndi0Var2.l(), "lock.tmp"), "rw").getChannel();
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
                                            Log.i("SplitCompat", "Copying splits.");
                                            for (Intent intent : list) {
                                                String stringExtra2 = intent.getStringExtra("split_id");
                                                AssetFileDescriptor openAssetFileDescriptor = context.getContentResolver().openAssetFileDescriptor(intent.getData(), "r");
                                                try {
                                                    File file2 = new File(ndi0Var2.l(), "unverified-splits");
                                                    ndi0.j(file2);
                                                    File i4 = ndi0.i(file2, String.valueOf(stringExtra2).concat(str2));
                                                    if (i4.exists()) {
                                                        if (i4.length() != openAssetFileDescriptor.getLength()) {
                                                            File file3 = new File(ndi0Var2.l(), "verified-splits");
                                                            ndi0.j(file3);
                                                            if (!ndi0.i(file3, String.valueOf(stringExtra2).concat(str2)).exists()) {
                                                                BufferedInputStream bufferedInputStream = new BufferedInputStream(openAssetFileDescriptor.createInputStream());
                                                                try {
                                                                    FileOutputStream fileOutputStream = new FileOutputStream(i4);
                                                                    try {
                                                                        byte[] bArr = new byte[4096];
                                                                        while (true) {
                                                                            int read = bufferedInputStream.read(bArr);
                                                                            if (read > 0) {
                                                                                String str3 = str2;
                                                                                fileOutputStream.write(bArr, 0, read);
                                                                                str2 = str3;
                                                                            } else {
                                                                                str = str2;
                                                                                fileOutputStream.close();
                                                                                bufferedInputStream.close();
                                                                                if (openAssetFileDescriptor == null) {
                                                                                    openAssetFileDescriptor.close();
                                                                                }
                                                                                str2 = str;
                                                                            }
                                                                        }
                                                                    } catch (Throwable th3) {
                                                                        try {
                                                                            fileOutputStream.close();
                                                                            throw th3;
                                                                        } catch (Throwable th4) {
                                                                            Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th3, th4);
                                                                            throw th3;
                                                                        }
                                                                    }
                                                                } catch (Throwable th5) {
                                                                    try {
                                                                        bufferedInputStream.close();
                                                                        throw th5;
                                                                    } catch (Throwable th6) {
                                                                        Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th5, th6);
                                                                        throw th5;
                                                                    }
                                                                }
                                                            }
                                                            str = str2;
                                                            if (openAssetFileDescriptor == null) {
                                                            }
                                                            str2 = str;
                                                        }
                                                    }
                                                    break;
                                                } finally {
                                                }
                                            }
                                            Log.i("SplitCompat", "Splits copied.");
                                            try {
                                                File file4 = new File(ndi0Var2.l(), "unverified-splits");
                                                ndi0.j(file4);
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
                                        if (ofa0Var.G(listFiles)) {
                                            if (ofa0Var.E(listFiles)) {
                                                try {
                                                    File file5 = new File(ndi0Var2.l(), "unverified-splits");
                                                    ndi0.j(file5);
                                                    listFiles2 = file5.listFiles();
                                                    Arrays.sort(listFiles2);
                                                    length = listFiles2.length;
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
                                                while (true) {
                                                    length--;
                                                    if (length >= 0) {
                                                        File file6 = listFiles2[length];
                                                        file6.setWritable(false, true);
                                                        file6.setWritable(false, false);
                                                        File file7 = listFiles2[length];
                                                        File file8 = new File(ndi0Var2.l(), "verified-splits");
                                                        ndi0.j(file8);
                                                        file7.renameTo(ndi0.i(file8, file7.getName()));
                                                    } else {
                                                        Log.i("SplitCompat", "Splits verified.");
                                                        i2 = 0;
                                                        valueOf = Integer.valueOf(i2);
                                                        fileLock.release();
                                                    }
                                                }
                                            }
                                        }
                                        Log.e("SplitCompat", "Split verification failed.");
                                        i2 = -11;
                                        valueOf = Integer.valueOf(i2);
                                        fileLock.release();
                                    } else {
                                        valueOf = null;
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
                                br91Var.zzc();
                                return;
                            } else {
                                br91Var.zzb(valueOf.intValue());
                                return;
                            }
                        }
                    }
                    try {
                        Context applicationContext = context.getApplicationContext();
                        if (applicationContext != null) {
                            context = applicationContext;
                        }
                        if (kst0.d(context, true)) {
                            Log.i("SplitCompat", "Splits installed.");
                            br91Var.mo479zza();
                            return;
                        } else {
                            Log.e("SplitCompat", "Emulating splits failed.");
                            br91Var.zzb(-12);
                            return;
                        }
                    } catch (Exception e7) {
                        Log.e("SplitCompat", "Error emulating splits.", e7);
                        br91Var.zzb(-12);
                        return;
                    }
                } catch (Exception e8) {
                    Log.e("SplitCompat", "Error checking verified files.", e8);
                    br91Var.zzb(-11);
                    return;
                }
            case 3:
                b bVar = (b) obj2;
                lc91 lc91Var = (lc91) this.w;
                if (lc91Var.b > 0) {
                    Bundle bundle = lc91Var.c;
                    bVar.onCreate(bundle != null ? bundle.getBundle((String) obj) : null);
                }
                if (lc91Var.b >= 2) {
                    bVar.onStart();
                }
                if (lc91Var.b >= 3) {
                    bVar.onResume();
                }
                if (lc91Var.b >= 4) {
                    bVar.onStop();
                }
                if (lc91Var.b >= 5) {
                    bVar.onDestroy();
                    return;
                }
                return;
            case 4:
                ((e) obj2).G((v5c0) obj, (u7f0) this.w);
                return;
            case 5:
                ((e) obj2).F((mf1) obj, (fs5) this.w);
                return;
            case 6:
                ((e) obj2).E((mf1) obj, (fs5) this.w);
                return;
            case 7:
                zze zzeVar = (zze) this.w;
                zzeVar.handleIntent((Intent) obj2);
                zzeVar.zzf((Intent) obj);
                return;
            case 8:
                CloudMessage cloudMessage = (CloudMessage) obj;
                if (TextUtils.isEmpty(cloudMessage.getMessageId())) {
                    b = udq0.p(null);
                } else {
                    Bundle bundle2 = new Bundle();
                    bundle2.putString("google.message_id", cloudMessage.getMessageId());
                    Integer zza = cloudMessage.zza();
                    if (zza != null) {
                        bundle2.putInt("google.product_id", zza.intValue());
                    }
                    bundle2.putBoolean("supports_message_handled", true);
                    b = d.a((Context) obj2).b(2, bundle2);
                }
                b.c(zkj.x, new i971(27, (CountDownLatch) this.w));
                return;
            case 9:
                zzjd zzjdVar = (zzjd) this.w;
                zzjdVar.zzL().w();
                zzah zzahVar = (zzah) obj2;
                zzr zzrVar = (zzr) obj;
                if (zzahVar.zzc.zza() == null) {
                    zzjdVar.zzL().U(zzahVar, zzrVar);
                    return;
                } else {
                    zzjdVar.zzL().T(zzahVar, zzrVar);
                    return;
                }
            case 10:
                zzjd zzjdVar2 = (zzjd) this.w;
                zzjdVar2.zzL().w();
                zzjdVar2.zzL().c((zzbg) obj2, (String) obj);
                return;
            case 11:
                ((zzjd) obj2).zzJ((zzr) obj, (zzaf) this.w);
                return;
            case 12:
                g9p g9pVar = (g9p) obj2;
                ArrayList arrayList = (ArrayList) this.w;
                ArrayList arrayList2 = new ArrayList();
                ArrayList arrayList3 = new ArrayList();
                Iterator it2 = ((ArrayList) obj).iterator();
                while (it2.hasNext()) {
                    File file9 = (File) it2.next();
                    String d = ssa1.d(file9);
                    Uri fromFile = Uri.fromFile(file9);
                    Intent intent2 = new Intent("android.intent.action.VIEW");
                    intent2.setDataAndType(fromFile, g9pVar.b.getContentResolver().getType(fromFile));
                    intent2.addFlags(1);
                    intent2.putExtra("module_name", d.split("\\.config\\.", 2)[0]);
                    intent2.putExtra("split_id", d);
                    arrayList2.add(intent2);
                    arrayList3.add(ssa1.d(file9).split("\\.config\\.", 2)[0]);
                }
                mvt0 mvt0Var = (mvt0) g9pVar.k.get();
                if (mvt0Var == null) {
                    return;
                }
                g9pVar.h.execute(new pg91(g9pVar, mvt0Var.i(), arrayList2, arrayList3, arrayList));
                return;
            case 13:
                j5b1 j5b1Var = (j5b1) obj2;
                zzr zzrVar2 = (zzr) obj;
                zzaf zzafVar = (zzaf) this.w;
                g gVar = (g) j5b1Var.b;
                zzgb zzgbVar = j5b1Var.x;
                if (zzgbVar == null) {
                    y1a1 y1a1Var = gVar.y;
                    g.g(y1a1Var);
                    y1a1Var.z.a("[sgtm] Discarding data. Failed to update batch upload status.");
                    return;
                }
                try {
                    zzgbVar.zzC(zzrVar2, zzafVar);
                    j5b1Var.Tg();
                    return;
                } catch (RemoteException e9) {
                    y1a1 y1a1Var2 = gVar.y;
                    g.g(y1a1Var2);
                    y1a1Var2.z.c("[sgtm] Failed to update batch upload status, rowId, exception", Long.valueOf(zzafVar.zza), e9);
                    return;
                }
            default:
                JobParameters jobParameters = (JobParameters) this.w;
                ((y1a1) obj).H.a("AppMeasurementJobService processed last upload request.");
                ((a6b1) ((t6b1) obj2).a).zzb(jobParameters, false);
                return;
        }
        while (true) {
            try {
                int read2 = ((InputStream) obj2).read();
                if (read2 <= 0) {
                    return;
                } else {
                    ((OutputStream) obj).write(read2);
                }
            } catch (IOException e10) {
                this.w = e10;
                return;
            }
        }
    }

    public /* synthetic */ ju61(int i, Object obj, Object obj2, Object obj3) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.w = obj3;
    }

    public /* synthetic */ ju61(Object obj, Object obj2, Object obj3, boolean z, int i) {
        this.a = i;
        this.w = obj;
        this.b = obj2;
        this.c = obj3;
    }
}

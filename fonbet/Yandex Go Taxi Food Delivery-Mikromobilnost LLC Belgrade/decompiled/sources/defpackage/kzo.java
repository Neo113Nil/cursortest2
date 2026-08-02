package defpackage;

import android.app.Activity;
import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.graphics.Point;
import android.graphics.Rect;
import android.hardware.camera2.CameraManager;
import android.media.AudioFormat;
import android.media.Image;
import android.media.Spatializer;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.PersistableBundle;
import android.os.RemoteException;
import android.os.SystemClock;
import android.os.Trace;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import androidx.compose.ui.layout.t;
import coil.disk.a;
import com.bumptech.glide.Glide;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamite.DynamiteModule$LoadingException;
import com.google.android.gms.internal.identity.e;
import com.google.android.gms.internal.mlkit_vision_text_common.l;
import com.google.android.gms.internal.mlkit_vision_text_common.zzbk;
import com.google.android.gms.internal.mlkit_vision_text_common.zzd;
import com.google.android.gms.internal.mlkit_vision_text_common.zzf;
import com.google.android.gms.internal.mlkit_vision_text_common.zzh;
import com.google.android.gms.internal.mlkit_vision_text_common.zzj;
import com.google.android.gms.internal.mlkit_vision_text_common.zzl;
import com.google.android.gms.internal.mlkit_vision_text_common.zzp;
import com.google.android.gms.internal.play_billing.zzco;
import com.google.mlkit.common.MlKitException;
import com.yandex.messaging.core.net.entities.SetPushTokenData;
import io.appmetrica.analytics.rtm.internal.Constants;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.security.InvalidKeyException;
import java.security.KeyManagementException;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.function.Predicate;
import kotlin.Pair;
import org.altbeacon.beacon.b;
import org.altbeacon.beacon.service.ScanJob;
import org.altbeacon.beacon.service.ScanState;
import ru.CryptoPro.JCP.Random.RandomInterface;
import ru.CryptoPro.JCP.tools.Array;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import yads.jg0;
import yads.xz;

/* loaded from: classes10.dex */
public final class kzo implements bit, d5p, ho3, wp61, pui0, ek91, uxa1 {
    public static volatile kzo A;
    public static final m501 y = new m501(23);
    public static final Object z = new Object();
    public final /* synthetic */ int a;
    public boolean b;
    public Object c;
    public Object w;
    public Object x;

    public kzo(ns7 ns7Var, Context context) {
        this.a = 0;
        this.c = ns7Var;
        if (Build.VERSION.SDK_INT >= 31) {
            CameraManager cameraManager = (CameraManager) context.getSystemService(CameraManager.class);
            bc bcVar = new bc();
            bcVar.a = cameraManager;
            bcVar.b = new Object();
            bcVar.c = new LinkedHashMap();
            bcVar.w = new LinkedHashMap();
            bcVar.x = new LinkedHashMap();
            this.x = bcVar;
        } else {
            this.x = null;
        }
        this.b = ns7Var.b() == 1;
        this.w = new xen(7, this);
    }

    public static void d(byte[] bArr, int i, byte[] bArr2, int i2, byte[] bArr3, int i3, int i4) {
        for (int i5 = 0; i5 < i4; i5++) {
            bArr3[i3 + i5] = (byte) (bArr[i + i5] ^ bArr2[i2 + i5]);
        }
    }

    public static kzo s() {
        kzo kzoVar;
        kzo kzoVar2 = A;
        if (kzoVar2 != null) {
            return kzoVar2;
        }
        synchronized (z) {
            try {
                kzoVar = A;
                if (kzoVar == null) {
                    kzoVar = new kzo(1);
                    kzoVar.c = 0L;
                    kzoVar.w = new ArrayList();
                    kzoVar.b = true;
                    A = kzoVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return kzoVar;
    }

    @Override // defpackage.d5p
    public void A() {
        SparseArray sparseArray = (SparseArray) this.x;
        ((d5p) this.c).A();
        if (this.b) {
            for (int i = 0; i < sparseArray.size(); i++) {
                ((v2v0) sparseArray.valueAt(i)).j = true;
            }
        }
    }

    @Override // defpackage.d5p
    public g001 B(int i, int i2) {
        SparseArray sparseArray = (SparseArray) this.x;
        d5p d5pVar = (d5p) this.c;
        if (i2 != 3) {
            this.b = true;
            return d5pVar.B(i, i2);
        }
        v2v0 v2v0Var = (v2v0) sparseArray.get(i);
        if (v2v0Var != null) {
            return v2v0Var;
        }
        v2v0 v2v0Var2 = new v2v0(d5pVar.B(i, i2), (o2v0) this.w);
        sparseArray.put(i, v2v0Var2);
        return v2v0Var2;
    }

    public String C() {
        return ((nvo) this.c).a;
    }

    @Override // defpackage.go3
    public void D(Object obj) {
        o0x0 o0x0Var = (o0x0) this.x;
        String str = ((SetPushTokenData) obj).logoutToken;
        c5g0 c5g0Var = (c5g0) this.c;
        boolean z2 = this.b;
        z83.g(null, o0x0Var.w.getLooper(), Looper.myLooper());
        z83.c(null, o0x0Var.J);
        o0x0Var.B.reportEvent("push_token_sending_success");
        o0x0Var.F = null;
        o0x0Var.c.edit().putString("logout_token", str).putString("push_token", c5g0Var.a).putString("push_token_type", c5g0Var.b.getValue()).putString("push_token_uuid", o0x0Var.b).apply();
        if (z2 != o0x0Var.L) {
            o0x0Var.f();
        }
    }

    public String E() {
        ((nvo) this.c).getClass();
        return null;
    }

    public ArrayList F() {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll((ArrayList) this.x);
        return arrayList;
    }

    public zzco G() {
        return (zzco) this.w;
    }

    public boolean H() {
        nvo nvoVar = (nvo) this.c;
        nvoVar.getClass();
        return nvoVar.b != 0 || ((zzco) this.w).stream().anyMatch(new Predicate() { // from class: pd91
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return false;
            }
        }) || this.b;
    }

    /* JADX WARN: Code restructure failed: missing block: B:58:0x02c5, code lost:
    
        if (defpackage.hza1.f(r1) == false) goto L64;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r17v1 */
    @Override // defpackage.uxa1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public njy0 a(xzv xzvVar) {
        Bitmap h;
        int i;
        String str;
        if (((zzh) this.x) == null) {
            zzb();
        }
        if (((zzh) this.x) == null) {
            throw new MlKitException("Waiting for the text recognition module to be downloaded. Please wait.", 14);
        }
        int i2 = xzvVar.g;
        boolean z2 = true;
        int i3 = 0;
        if (i2 == -1) {
            h = xzvVar.a;
            i = qnc.a(xzvVar.f);
        } else {
            if (i2 == -1) {
                Bitmap bitmap = xzvVar.a;
                cvw.l(bitmap);
                h = i4b1.h(bitmap, xzvVar.f, xzvVar.d, xzvVar.e);
            } else if (i2 == 17) {
                ByteBuffer byteBuffer = xzvVar.b;
                cvw.l(byteBuffer);
                h = i4b1.c(byteBuffer, xzvVar.d, xzvVar.e, xzvVar.f);
            } else if (i2 == 35) {
                Image.Plane[] a = xzvVar.a();
                cvw.l(a);
                h = i4b1.c(i4b1.f(a, xzvVar.d, xzvVar.e), xzvVar.d, xzvVar.e, xzvVar.f);
            } else {
                if (i2 != 842094169) {
                    throw new MlKitException("Unsupported image format", 13);
                }
                ByteBuffer byteBuffer2 = xzvVar.b;
                cvw.l(byteBuffer2);
                int i4 = xzvVar.d;
                int i5 = xzvVar.e;
                int i6 = xzvVar.f;
                byte[] i7 = i4b1.i(i4, i5, i4b1.g(byteBuffer2, true).array());
                Bitmap decodeByteArray = BitmapFactory.decodeByteArray(i7, 0, i7.length);
                h = i4b1.h(decodeByteArray, i6, decodeByteArray.getWidth(), decodeByteArray.getHeight());
            }
            i = 0;
        }
        IObjectWrapper wrap = ObjectWrapper.wrap(h);
        zzd zzdVar = new zzd(xzvVar.d, xzvVar.e, 0, 0L, i);
        try {
            zzh zzhVar = (zzh) this.x;
            cvw.l(zzhVar);
            zzl[] zze = zzhVar.zze(wrap, zzdVar);
            Matrix matrix = xzvVar.h;
            er91 er91Var = ema1.a;
            SparseArray sparseArray = new SparseArray();
            for (zzl zzlVar : zze) {
                SparseArray sparseArray2 = (SparseArray) sparseArray.get(zzlVar.zzj);
                if (sparseArray2 == null) {
                    sparseArray2 = new SparseArray();
                    sparseArray.append(zzlVar.zzj, sparseArray2);
                }
                sparseArray2.append(zzlVar.zzk, zzlVar);
            }
            j991 j991Var = new j991();
            int i8 = 0;
            while (i8 < sparseArray.size()) {
                SparseArray sparseArray3 = (SparseArray) sparseArray.valueAt(i8);
                j991 j991Var2 = new j991();
                for (int i9 = i3; i9 < sparseArray3.size(); i9++) {
                    j991Var2.a((zzl) sparseArray3.valueAt(i9));
                }
                j991Var2.c = z2;
                zzbk i10 = zzbk.i(j991Var2.b, j991Var2.a);
                AbstractList a2 = l.a(i10, new h891(matrix, z2 ? 1 : 0));
                zzf zzfVar = ((zzl) i10.get(i3)).zzb;
                o991 listIterator = i10.listIterator(i3);
                int i11 = Integer.MIN_VALUE;
                int i12 = Integer.MAX_VALUE;
                int i13 = Integer.MAX_VALUE;
                int i14 = Integer.MIN_VALUE;
                while (listIterator.hasNext()) {
                    zzf zzfVar2 = ((zzl) listIterator.next()).zzb;
                    int i15 = -zzfVar.zza;
                    int i16 = i3;
                    int i17 = -zzfVar.zzb;
                    ?? r17 = z2;
                    double sin = Math.sin(Math.toRadians(zzfVar.zze));
                    SparseArray sparseArray4 = sparseArray;
                    int i18 = i8;
                    double cos = Math.cos(Math.toRadians(zzfVar.zze));
                    Point[] pointArr = new Point[4];
                    Point point = new Point(zzfVar2.zza, zzfVar2.zzb);
                    pointArr[i16] = point;
                    point.offset(i15, i17);
                    Point point2 = pointArr[i16];
                    int i19 = point2.x;
                    o991 o991Var = listIterator;
                    double d = point2.y;
                    int i20 = (int) ((i19 * cos) + (d * sin));
                    point2.x = i20;
                    int i21 = (int) (((-i19) * sin) + (d * cos));
                    point2.y = i21;
                    pointArr[r17] = new Point(zzfVar2.zzc + i20, i21);
                    pointArr[2] = new Point(zzfVar2.zzc + i20, zzfVar2.zzd + i21);
                    pointArr[3] = new Point(i20, i21 + zzfVar2.zzd);
                    for (int i22 = i16; i22 < 4; i22++) {
                        Point point3 = pointArr[i22];
                        i12 = Math.min(i12, point3.x);
                        i11 = Math.max(i11, point3.x);
                        i13 = Math.min(i13, point3.y);
                        i14 = Math.max(i14, point3.y);
                    }
                    listIterator = o991Var;
                    i3 = i16;
                    z2 = r17;
                    sparseArray = sparseArray4;
                    i8 = i18;
                }
                SparseArray sparseArray5 = sparseArray;
                int i23 = i8;
                boolean z3 = z2;
                int i24 = i3;
                int i25 = zzfVar.zza;
                int i26 = zzfVar.zzb;
                double sin2 = Math.sin(Math.toRadians(zzfVar.zze));
                double cos2 = Math.cos(Math.toRadians(zzfVar.zze));
                Point[] pointArr2 = {new Point(i12, i13), new Point(i11, i13), new Point(i11, i14), new Point(i12, i14)};
                int i27 = i24;
                while (i27 < 4) {
                    Point point4 = pointArr2[i27];
                    double d2 = point4.x;
                    double d3 = point4.y;
                    point4.x = (int) ((d2 * cos2) - (d3 * sin2));
                    point4.y = (int) ((d2 * sin2) + (d3 * cos2));
                    point4.offset(i25, i26);
                    i27++;
                    sin2 = sin2;
                }
                List asList = Arrays.asList(pointArr2);
                String d4 = wya1.d(l.a(a2, new usb1() { // from class: eaa1
                    @Override // defpackage.usb1
                    public final Object d(Object obj) {
                        return ((gjy0) obj).m();
                    }
                }));
                Rect d5 = una1.d(asList);
                HashMap hashMap = new HashMap();
                Iterator it = a2.iterator();
                while (it.hasNext()) {
                    String str2 = (String) ((gjy0) it.next()).w;
                    hashMap.put(str2, Integer.valueOf((hashMap.containsKey(str2) ? ((Integer) hashMap.get(str2)).intValue() : i24) + 1));
                }
                Set entrySet = hashMap.entrySet();
                if (!entrySet.isEmpty()) {
                    str = (String) ((Map.Entry) Collections.max(entrySet, ema1.a)).getKey();
                }
                str = "und";
                j991Var.a(new kjy0(d4, d5, asList, str, matrix, a2));
                i8 = i23 + 1;
                i3 = i24;
                z2 = z3;
                sparseArray = sparseArray5;
            }
            j991Var.c = z2 ? 1 : 0;
            zzbk i28 = zzbk.i(j991Var.b, j991Var.a);
            wya1.d(l.a(i28, new usb1() { // from class: zw91
                @Override // defpackage.usb1
                public final Object d(Object obj) {
                    return ((kjy0) obj).m();
                }
            }));
            return new njy0(i28);
        } catch (RemoteException e) {
            throw new MlKitException(13, e, "Failed to run legacy text recognizer.");
        }
    }

    @Override // defpackage.pui0
    public void accept(Object obj, Object obj2) {
        luy luyVar;
        boolean z2;
        e eVar = (e) obj;
        atx0 atx0Var = (atx0) obj2;
        synchronized (this) {
            luyVar = ((ouy) this.w).c;
            z2 = this.b;
            ((ouy) this.w).a();
        }
        if (luyVar == null) {
            atx0Var.a(Boolean.FALSE);
        } else {
            ((g991) this.c).b(eVar, luyVar, z2, atx0Var);
        }
    }

    public void b() {
        if (this.b) {
            ((xc71) this.w).b();
            ((Handler) this.x).removeCallbacksAndMessages(null);
            this.b = false;
        }
    }

    @Override // defpackage.ho3
    /* renamed from: c */
    public boolean mo103c(int i) {
        o0x0 o0x0Var = (o0x0) this.x;
        c5g0 c5g0Var = (c5g0) this.c;
        String str = (String) this.w;
        o0x0Var.e("server_error");
        o0x0Var.w.postAtTime(new hpo0(7, o0x0Var, c5g0Var, str), o0x0.M, o0x0Var.K.a() + SystemClock.uptimeMillis());
        return false;
    }

    @Override // defpackage.ek91
    public synchronized void e(ouy ouyVar) {
        ouy ouyVar2 = (ouy) this.w;
        if (ouyVar2 != ouyVar) {
            ouyVar2.a();
            this.w = ouyVar;
        }
    }

    public synchronized void f(byte[] bArr, byte[] bArr2, byte[] bArr3, RandomInterface randomInterface, boolean z2) {
        try {
            ((wu61) this.x).C();
            if (!this.b) {
                throw new InvalidKeyException("This key material can not be used for encryption");
            }
            if (!z2) {
                ((wu61) this.x).o.a(bArr.length);
            }
            dq61.b(bArr, (byte[]) this.c, (byte[]) this.w, bArr2, bArr3);
            ((wu61) this.x).A(randomInterface);
        } catch (Throwable th) {
            ((wu61) this.x).A(randomInterface);
            throw th;
        }
    }

    public boolean g(ws71 ws71Var, qd81 qd81Var) {
        boolean canBeSpatialized;
        String str = qd81Var.E;
        int i = qd81Var.R;
        if ("audio/eac3-joc".equals(str) && i == 16) {
            i = 12;
        }
        AudioFormat.Builder channelMask = new AudioFormat.Builder().setEncoding(2).setChannelMask(rf71.a(i));
        int i2 = qd81Var.S;
        if (i2 != -1) {
            channelMask.setSampleRate(i2);
        }
        Spatializer spatializer = (Spatializer) this.c;
        if (ws71Var.y == null) {
            ws71Var.y = new se3(ws71Var);
        }
        canBeSpatialized = spatializer.canBeSpatialized(ws71Var.y.a, channelMask.build());
        return canBeSpatialized;
    }

    @Override // defpackage.bit
    public Object get() {
        if (this.b) {
            ny61.r("Recursive Registry initialization! In your AppGlideModule and LibraryGlideModules, Make sure you're using the provided Registry rather calling glide.getRegistry()!");
            return null;
        }
        Trace.beginSection(ffx.f0("Glide registry"));
        this.b = true;
        try {
            return rri0.a((Glide) this.c, (List) this.w, (yt2) this.x);
        } finally {
            this.b = false;
            Trace.endSection();
        }
    }

    public void h() {
        switch (this.a) {
            case 4:
                cyj.a((cyj) this.x, this, false);
                break;
            default:
                o(false);
                break;
        }
    }

    public void i(Context context, b bVar) {
        ScanState n = ScanState.n(context);
        n.a(bVar);
        x(context, n, this.b && n.c().booleanValue());
    }

    public void j(kzo kzoVar, RandomInterface randomInterface, byte[] bArr) {
        byte[] bArr2;
        wu61 a = ((wu61) kzoVar.x).a(randomInterface);
        this.x = a;
        gu61 gu61Var = a.o;
        gu61Var.e = 16777216L;
        gu61Var.d = ((wu61) kzoVar.x).o.d;
        byte[] copy = Array.copy((byte[]) kzoVar.c);
        byte[] copy2 = Array.copy((byte[]) kzoVar.w);
        byte[] copy3 = Array.copy((byte[]) this.w);
        byte[] bArr3 = new byte[16];
        for (int i = 0; i <= 9; i++) {
            if (i != 0) {
                int i2 = i * 16;
                int i3 = 0;
                while (true) {
                    bArr2 = dq61.a;
                    if (i3 >= 16) {
                        break;
                    }
                    int i4 = i3 + i2;
                    copy[i4] = bArr2[copy[i4] & 255];
                    i3++;
                }
                dq61.a(i2, copy, bArr, bArr3);
                for (int i5 = 0; i5 < 16; i5++) {
                    int i6 = i5 + i2;
                    copy2[i6] = bArr2[copy2[i6] & 255];
                }
                dq61.a(i2, copy2, bArr, bArr3);
            }
            int i7 = i * 16;
            int i8 = (9 - i) * 16;
            d(copy, i7, copy3, i7, (byte[]) this.c, i8, 16);
            byte[] bArr4 = copy3;
            d(copy2, i7, bArr4, i7, (byte[]) this.w, i8, 16);
            copy3 = bArr4;
        }
    }

    public void k(wu61 wu61Var, RandomInterface randomInterface, byte[] bArr) {
        byte[] bArr2 = (byte[]) this.c;
        try {
            wu61 a = wu61Var.a(randomInterface);
            this.x = a;
            gu61 gu61Var = a.o;
            gu61Var.e = 16777216L;
            gu61Var.d = wu61Var.o.d;
            d((byte[]) this.w, 0, wu61Var.z().toByteArray(), 0, (byte[]) this.c, 0, 32);
            byte[] E = wu61Var.E();
            byte[] bArr3 = (byte[]) this.w;
            d(E, 0, bArr3, 0, bArr3, 0, 32);
            byte[] bArr4 = new byte[16];
            byte[] bArr5 = new byte[16];
            for (int i = 0; i < 4; i++) {
                int i2 = i * 2;
                int i3 = (i2 + 2) * 16;
                int i4 = (i2 + 3) * 16;
                int i5 = i * 32;
                Array.copy(bArr2, i5, bArr2, i3, 32);
                int i6 = 0;
                while (i6 < 8) {
                    Arrays.fill(bArr4, (byte) 0);
                    Array.copy(bArr2, i4, bArr4, 0, 16);
                    Array.copy(bArr2, i3, bArr2, i4, 16);
                    byte[] bArr6 = dq61.c[(i * 8) + i6];
                    byte[] bArr7 = (byte[]) this.c;
                    int i7 = i3;
                    d(bArr6, 0, bArr7, i7, bArr7, i7, 16);
                    byte[] bArr8 = (byte[]) this.w;
                    byte[] bArr9 = (byte[]) this.c;
                    d(bArr8, ((i6 % 2) * 16) + i5, bArr9, i7, bArr9, i7, 16);
                    i3 = i7;
                    dq61.a(i3, bArr2, bArr, bArr5);
                    byte[] bArr10 = (byte[]) this.c;
                    d(bArr10, i3, bArr4, 0, bArr10, i3, 16);
                    i6++;
                    i4 = i4;
                    i5 = i5;
                }
                byte[] bArr11 = (byte[]) this.c;
                int i8 = i3;
                d(bArr11, i3, (byte[]) this.w, i8, bArr11, i3, 32);
                byte[] bArr12 = (byte[]) this.w;
                d(bArr12, i5, bArr12, i8, bArr12, i8, 32);
            }
        } catch (KeyManagementException e) {
            dy31.s(e);
        }
    }

    @Override // defpackage.wp61
    public hm61 l(int i, int i2) {
        b281 b281Var = (b281) this.w;
        Context context = (Context) this.x;
        int size = View.MeasureSpec.getSize(i);
        int mode = View.MeasureSpec.getMode(i);
        int size2 = View.MeasureSpec.getSize(i2);
        int mode2 = View.MeasureSpec.getMode(i);
        if (mode != 0) {
            am81 am81Var = sj71.a;
            int i3 = context.getResources().getDisplayMetrics().widthPixels;
            b281Var.getClass();
            int a = b281.a(context, 420.0f);
            int i4 = context.getResources().getConfiguration().orientation;
            if (((pm71) this.c).a(context) != jg0.b || i4 != 1) {
                i3 = (int) Math.min(i3, a);
            }
            i = View.MeasureSpec.makeMeasureSpec((int) Math.min(i3, size), 1073741824);
        }
        if (mode2 != 0) {
            boolean z2 = this.b;
            int f = sj71.f(context);
            b281Var.getClass();
            int a2 = b281.a(context, 350.0f);
            if (!z2) {
                f = (int) Math.min(f, a2);
            }
            i2 = View.MeasureSpec.makeMeasureSpec((int) Math.min(f, size2), 1073741824);
        }
        hm61 hm61Var = new hm61();
        hm61Var.b = i2;
        hm61Var.a = i;
        return hm61Var;
    }

    public synchronized void m(byte[] bArr, byte[] bArr2, byte[] bArr3, RandomInterface randomInterface) {
        try {
            ((wu61) this.x).C();
            if (this.b) {
                throw new InvalidKeyException("This key material can not be used for decryption");
            }
            ((wu61) this.x).o.a(bArr.length);
            dq61.c(bArr, (byte[]) this.c, (byte[]) this.w, bArr2, bArr3);
        } finally {
            ((wu61) this.x).A(randomInterface);
        }
    }

    public void n(Context context) {
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        jobScheduler.cancel(ScanJob.getImmediateScanJobId(context));
        jobScheduler.cancel(ScanJob.getPeriodicScanJobId(context));
        this.b = true;
    }

    public void o(boolean z2) {
        a aVar = (a) this.x;
        synchronized (aVar) {
            try {
                if (this.b) {
                    throw new IllegalStateException("editor is closed");
                }
                if (jl40.l(((sxj) this.c).g, this)) {
                    a.a(aVar, this, z2);
                }
                this.b = true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void p() {
        sxj sxjVar = (sxj) this.c;
        if (jl40.l(sxjVar.g, this)) {
            sxjVar.f = true;
        }
    }

    public oq90 q(int i) {
        oq90 oq90Var;
        a aVar = (a) this.x;
        synchronized (aVar) {
            if (this.b) {
                throw new IllegalStateException("editor is closed");
            }
            ((boolean[]) this.w)[i] = true;
            Object obj = ((sxj) this.c).d.get(i);
            tga1.a(aVar.I, (oq90) obj);
            oq90Var = (oq90) obj;
        }
        return oq90Var;
    }

    public sxj r() {
        return (sxj) this.c;
    }

    public boolean[] t() {
        return (boolean[]) this.w;
    }

    public void u(String str, HashMap hashMap) {
        if (this.b) {
            return;
        }
        ((m2v) this.c).z(kotlin.collections.b.h(new Pair("type", str), new Pair(Constants.KEY_DATA, hashMap)), null);
    }

    public OutputStream v() {
        FileOutputStream fileOutputStream;
        kxj kxjVar;
        cyj cyjVar = (cyj) this.x;
        if (cyjVar.z <= 0) {
            ny61.e(((cyj) this.x).z, "Expected index 0 to be greater than 0 and less than the maximum value count of ");
            return null;
        }
        synchronized (cyjVar) {
            try {
                qxj qxjVar = (qxj) this.c;
                if (qxjVar.d != this) {
                    throw new IllegalStateException();
                }
                if (!qxjVar.c) {
                    ((boolean[]) this.w)[0] = true;
                }
                File b = qxjVar.b(0);
                try {
                    fileOutputStream = new FileOutputStream(b);
                } catch (FileNotFoundException unused) {
                    ((cyj) this.x).a.mkdirs();
                    try {
                        fileOutputStream = new FileOutputStream(b);
                    } catch (FileNotFoundException unused2) {
                        return cyj.H;
                    }
                }
                kxjVar = new kxj(this, fileOutputStream);
            } catch (Throwable th) {
                throw th;
            }
        }
        return kxjVar;
    }

    @Override // defpackage.d5p
    public void w(f7q0 f7q0Var) {
        ((d5p) this.c).w(f7q0Var);
    }

    public void x(Context context, ScanState scanState, boolean z2) {
        long elapsedRealtime;
        if (((ni5) this.x) == null) {
            this.x = ni5.a();
        }
        ((ni5) this.x).getClass();
        long l = scanState.l() - scanState.m();
        if (z2) {
            elapsedRealtime = 0;
        } else {
            elapsedRealtime = l > 0 ? SystemClock.elapsedRealtime() % scanState.l() : 0L;
            if (elapsedRealtime < 50) {
                elapsedRealtime = 50;
            }
        }
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        if (scanState.k().size() + scanState.a.e().size() <= 0) {
            jobScheduler.cancel(ScanJob.getImmediateScanJobId(context));
            jobScheduler.cancel(ScanJob.getPeriodicScanJobId(context));
            new mlm0(context).e();
            return;
        }
        if (!z2 && scanState.c().booleanValue()) {
            jobScheduler.cancel(ScanJob.getImmediateScanJobId(context));
        } else if (elapsedRealtime < scanState.l() - 50 && jobScheduler.schedule(new JobInfo.Builder(ScanJob.getImmediateScanJobId(context), new ComponentName(context, (Class<?>) ScanJob.class)).setPersisted(true).setExtras(new PersistableBundle()).setMinimumLatency(elapsedRealtime).setOverrideDeadline(elapsedRealtime).build()) >= 0 && this.b) {
            this.b = false;
        }
        JobInfo.Builder extras = new JobInfo.Builder(ScanJob.getPeriodicScanJobId(context), new ComponentName(context, (Class<?>) ScanJob.class)).setPersisted(true).setExtras(new PersistableBundle());
        extras.setPeriodic(scanState.l(), 0L).build();
        JobInfo build = extras.build();
        Objects.toString(build);
        jobScheduler.schedule(build);
    }

    public int y() {
        return ((nvo) this.c).b;
    }

    public ns5 z() {
        if (((zzco) this.w).isEmpty()) {
            return fe91.j;
        }
        ks5 ks5Var = (ks5) ((zzco) this.w).get(0);
        for (int i = 1; i < ((zzco) this.w).size(); i++) {
            ks5 ks5Var2 = (ks5) ((zzco) this.w).get(i);
            if (!ks5Var2.a.d.equals(ks5Var.a.d) && !ks5Var2.a.d.equals("play_pass_subs")) {
                return fe91.a(5, "All products should have same ProductType.");
            }
        }
        t7f0 t7f0Var = ks5Var.a;
        t7f0 t7f0Var2 = ks5Var.a;
        String d = t7f0Var.d();
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        zzco zzcoVar = (zzco) this.w;
        int size = zzcoVar.size();
        for (int i2 = 0; i2 < size; i2++) {
            ks5 ks5Var3 = (ks5) zzcoVar.get(i2);
            t7f0 t7f0Var3 = ks5Var3.a;
            t7f0 t7f0Var4 = ks5Var3.a;
            t7f0Var3.d.getClass();
            if (hashSet.contains(t7f0Var4.c)) {
                return fe91.a(5, "ProductId can not be duplicated. Invalid product id: " + t7f0Var4.c + Extension.DOT_CHAR);
            }
            hashSet.add(t7f0Var4.c);
            if (!t7f0Var2.d.equals("play_pass_subs") && !t7f0Var4.d.equals("play_pass_subs") && !d.equals(t7f0Var4.d())) {
                return fe91.a(5, "All products must have the same package name.");
            }
        }
        Iterator it = hashSet2.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            if (hashSet.contains(str)) {
                return fe91.a(5, "OldProductId must not be one of the products to be purchased. Invalid old product id: " + str + Extension.DOT_CHAR);
            }
        }
        q7f0 a = t7f0Var2.a();
        return (a == null || a.e == null) ? fe91.j : fe91.a(5, "Both autoPayDetails and autoPayBalanceThreshold is required for constructing ProductDetailsParams for autopay.");
    }

    @Override // defpackage.ek91
    public synchronized ouy zza() {
        return (ouy) this.w;
    }

    @Override // defpackage.uxa1
    public void zzb() {
        Context context = (Context) this.c;
        if (((zzh) this.x) != null) {
            return;
        }
        try {
            zzh zzd = zzj.zza(gan.c(context, gan.b, "com.google.android.gms.vision.dynamite").b("com.google.android.gms.vision.text.ChimeraNativeTextRecognizerCreator")).zzd(ObjectWrapper.wrap(context), (zzp) this.w);
            this.x = zzd;
            if (zzd != null || this.b) {
                return;
            }
            bg70.b(context, "ocr");
            this.b = true;
        } catch (RemoteException e) {
            throw new MlKitException(13, e, "Failed to create legacy text recognizer.");
        } catch (DynamiteModule$LoadingException e2) {
            throw new MlKitException(13, e2, "Failed to load deprecated vision dynamite module.");
        }
    }

    @Override // defpackage.ek91
    public void zzc() {
        luy luyVar;
        switch (this.a) {
            case 22:
                synchronized (this) {
                    this.b = false;
                    luyVar = ((ouy) this.w).c;
                }
                if (luyVar != null) {
                    ((k991) this.x).c(luyVar, 2441);
                    return;
                }
                return;
            default:
                zzh zzhVar = (zzh) this.x;
                if (zzhVar != null) {
                    try {
                        zzhVar.zzd();
                    } catch (RemoteException e) {
                        Log.e("LegacyTextDelegate", "Failed to release legacy text recognizer.", e);
                    }
                    this.x = null;
                    return;
                }
                return;
        }
    }

    public kzo(kzo kzoVar, RandomInterface randomInterface) {
        this.a = 17;
        this.c = null;
        this.w = null;
        this.x = null;
        this.c = Array.copy((byte[]) kzoVar.c);
        this.w = Array.copy((byte[]) kzoVar.w);
        this.b = kzoVar.b;
        this.x = ((wu61) kzoVar.x).a(randomInterface);
    }

    public kzo(kzo kzoVar, RandomInterface randomInterface, byte[] bArr) {
        this.a = 17;
        this.x = null;
        this.c = new byte[160];
        byte[] bArr2 = new byte[160];
        this.w = bArr2;
        this.b = false;
        randomInterface.makeRandom(bArr2, 0, 160);
        try {
            j(kzoVar, randomInterface, bArr);
        } catch (InvalidKeyException e) {
            throw new KeyManagementException(e);
        }
    }

    public kzo(wu61 wu61Var, RandomInterface randomInterface, byte[] bArr) {
        this.a = 17;
        this.c = null;
        this.w = null;
        this.x = null;
        if (wu61Var == null) {
            throw new KeyManagementException("No key material");
        }
        this.c = new byte[160];
        byte[] bArr2 = new byte[160];
        this.w = bArr2;
        randomInterface.makeRandom(bArr2, 0, 160);
        this.b = true;
        try {
            k(wu61Var, randomInterface, bArr);
        } catch (InvalidKeyException e) {
            throw new KeyManagementException(e);
        }
    }

    public /* synthetic */ kzo(Object obj, Object obj2, Object obj3, boolean z2, int i) {
        this.a = i;
        this.c = obj;
        this.w = obj2;
        this.x = obj3;
        this.b = z2;
    }

    public kzo(k991 k991Var, ouy ouyVar, g991 g991Var) {
        this.a = 22;
        this.x = k991Var;
        this.b = true;
        this.w = ouyVar;
        this.c = g991Var;
    }

    public kzo(rr41 rr41Var, no6 no6Var) {
        this.a = 18;
        Handler handler = new Handler(Looper.getMainLooper());
        this.c = rr41Var;
        this.w = no6Var;
        this.x = handler;
    }

    public kzo(Activity activity, int i) {
        this.a = 20;
        boolean z2 = (i & 2) == 0;
        pm71 pm71Var = new pm71();
        b281 b281Var = new b281();
        this.b = z2;
        this.c = pm71Var;
        this.w = b281Var;
        this.x = activity.getApplicationContext();
    }

    public kzo(Context context) {
        this.a = 23;
        this.w = new zzp(null);
        this.c = context;
    }

    public kzo(Context context, v981 v981Var, ji41 ji41Var, xz xzVar, d881 d881Var, String str) {
        this.a = 21;
        v981Var.getClass();
        ge71 b = wfa1.b(context, new m771(((n291) v981Var).a));
        hlx0 hlx0Var = new hlx0(ji41Var, xzVar, str);
        this.c = d881Var;
        this.w = b;
        this.x = hlx0Var;
        this.b = true;
    }

    public kzo(Spatializer spatializer) {
        int immersiveAudioLevel;
        this.a = 16;
        this.c = spatializer;
        immersiveAudioLevel = spatializer.getImmersiveAudioLevel();
        this.b = immersiveAudioLevel != 0;
    }

    public kzo(bc71 bc71Var, xc71 xc71Var) {
        this.a = 19;
        Handler handler = new Handler(Looper.getMainLooper());
        this.c = bc71Var;
        this.w = xc71Var;
        this.x = handler;
    }

    public kzo(boolean z2, com.yandex.go.vault.di.a aVar, com.yandex.go.vault.di.b bVar, sls slsVar) {
        this.a = 15;
        this.b = z2;
        this.c = aVar;
        this.w = bVar;
        this.x = slsVar;
    }

    public kzo(tt5 tt5Var, String str) {
        this.a = 7;
        Object obj = null;
        this.c = new m2v(tt5Var, str, new vzt0(), obj);
        this.w = new m2v(tt5Var, str.concat("_image"), new vzt0(), obj);
        this.x = bvf0.b();
    }

    public kzo(sln0 sln0Var) {
        this.a = 12;
        this.c = sln0Var;
        this.w = bvf0.c(null);
        this.b = true;
        this.x = bvf0.c(new uln0(0));
    }

    public kzo(flex.engine.a aVar, t9b0 t9b0Var) {
        this.a = 8;
        this.c = aVar;
        this.w = t9b0Var;
        this.x = new n9c0(this);
    }

    public kzo(d5p d5pVar, o2v0 o2v0Var) {
        this.a = 13;
        this.c = d5pVar;
        this.w = o2v0Var;
        this.x = new SparseArray();
    }

    public /* synthetic */ kzo(int i) {
        this.a = i;
    }

    public kzo(Glide glide, List list, yt2 yt2Var) {
        this.a = 11;
        this.c = glide;
        this.w = list;
        this.x = yt2Var;
    }

    public kzo(o0x0 o0x0Var, c5g0 c5g0Var, String str, boolean z2) {
        this.a = 14;
        this.x = o0x0Var;
        this.c = c5g0Var;
        this.w = str;
        this.b = z2;
    }

    public kzo(p5y p5yVar, t tVar, eoe0 eoe0Var) {
        this.a = 9;
        this.c = p5yVar;
        this.w = tVar;
        this.x = eoe0Var;
        this.b = true;
    }

    public kzo(a aVar, sxj sxjVar) {
        this.a = 5;
        this.x = aVar;
        this.c = sxjVar;
        this.w = new boolean[2];
    }

    public kzo(cyj cyjVar, qxj qxjVar) {
        this.a = 4;
        this.x = cyjVar;
        this.c = qxjVar;
        this.w = qxjVar.c ? null : new boolean[cyjVar.z];
    }
}

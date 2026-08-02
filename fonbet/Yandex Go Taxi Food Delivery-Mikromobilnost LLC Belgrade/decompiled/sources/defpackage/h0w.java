package defpackage;

import android.content.Context;
import android.graphics.ImageDecoder;
import android.graphics.drawable.AnimatedImageDrawable;
import android.graphics.drawable.Drawable;
import android.hardware.camera2.CaptureResult;
import android.os.Handler;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import androidx.room.RoomDatabase;
import androidx.room.b;
import androidx.room.i;
import com.bumptech.glide.load.resource.DefaultOnHeaderDecodedListener;
import com.google.zxing.NotFoundException;
import com.yandex.fintechsdk.core.navigation.impl.api.router.a;
import com.yandex.fintechsdk.features.bdui.api.exception.RestoreStateException;
import com.yandex.go.places.impl.data.entities.network.organizations.BaseOrganizationsResponse$OrganizationsResponse;
import com.yandex.go.places.impl.data.entities.network.organizations.BaseOrganizationsResponse$OrganizationsResponseV2;
import com.yandex.go.places.impl.data.mappers.organizations.f;
import com.yandex.go.places.impl.data.mappers.organizations.g;
import com.yandex.go.rida.bids.router.d;
import com.yandex.mapkit.geometry.Point;
import com.yandex.mapkit.geometry.Polyline;
import java.io.IOException;
import java.lang.reflect.Array;
import java.nio.channels.FileChannel;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.LazyThreadSafetyMode;
import kotlin.Pair;
import kotlin.Result;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.logistics.sdk.photocomments.api.PhotocommentsSource;
import ru.yandex.taxi.object.DriveState;

/* loaded from: classes10.dex */
public class h0w implements g0w, al7, ut31, ggi0, zd3, xbi0, pll0, i8j0, lh5, qq70 {
    public static final Object w = new Object();
    public final /* synthetic */ int a;
    public Object b;
    public Object c;

    public h0w(Context context) {
        mp71 mp71Var;
        this.a = 1;
        rr41 rr41Var = new rr41(context, 7);
        mp71 mp71Var2 = mp71.e;
        if (mp71Var2 == null) {
            synchronized (mp71.d) {
                mp71Var = mp71.e;
                if (mp71Var == null) {
                    mp71Var = new mp71();
                    mp71.e = mp71Var;
                }
            }
            mp71Var2 = mp71Var;
        }
        Executor a = mp71Var2.a();
        this.b = rr41Var;
        this.c = a;
    }

    public static cf2 i(ImageDecoder.Source source, int i, int i2, mg70 mg70Var) {
        Drawable decodeDrawable = ImageDecoder.decodeDrawable(source, new DefaultOnHeaderDecodedListener(i, i2, mg70Var));
        if (decodeDrawable instanceof AnimatedImageDrawable) {
            return new cf2(0, (AnimatedImageDrawable) decodeDrawable);
        }
        w511.h(decodeDrawable, "Received unexpected drawable type for animated image, failing: ");
        return null;
    }

    @Override // defpackage.lh5
    public void a() {
        ((a) this.c).a();
    }

    @Override // defpackage.ut31
    public View b(String str) {
        hd1 hd1Var;
        synchronized (((w53) this.c)) {
            Object obj = ((w53) this.c).get(str);
            if (obj == null) {
                throw new NoSuchElementException("Factory is not registered");
            }
            hd1Var = (hd1) obj;
        }
        eq31 eq31Var = hd1Var.c;
        ArrayBlockingQueue arrayBlockingQueue = hd1Var.d;
        View view = (View) arrayBlockingQueue.poll();
        if (view == null) {
            zq31 zq31Var = hd1Var.b;
            try {
                eq31Var.a(hd1Var);
                View view2 = (View) arrayBlockingQueue.poll(16L, TimeUnit.MILLISECONDS);
                view = view2 == null ? zq31Var.a() : view2;
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
                view = zq31Var.a();
            }
        }
        eq31Var.a.a.offer(new aq31(hd1Var, arrayBlockingQueue.size()));
        return view;
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x00b4 A[Catch: all -> 0x00b5, TRY_ENTER, TryCatch #1 {all -> 0x00b5, blocks: (B:49:0x00b4, B:50:0x00b7, B:51:0x00cf), top: B:47:0x00b2 }] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00b7 A[Catch: all -> 0x00b5, TryCatch #1 {all -> 0x00b5, blocks: (B:49:0x00b4, B:50:0x00b7, B:51:0x00cf), top: B:47:0x00b2 }] */
    @Override // defpackage.pll0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public oll0 c(String str) {
        FileChannel fileChannel;
        FileChannel fileChannel2;
        i iVar = (i) this.c;
        if (!str.equals(":memory:")) {
            str = iVar.c.a.getDatabasePath(str).getAbsolutePath();
        }
        boolean z = true;
        fko fkoVar = new fko(str, (iVar.a || iVar.b || str.equals(":memory:")) ? false : true);
        ReentrantLock reentrantLock = fkoVar.a;
        reentrantLock.lock();
        zrm zrmVar = fkoVar.b;
        if (zrmVar != null) {
            try {
                zrmVar.b();
            } catch (Throwable th) {
                th = th;
                z = false;
                try {
                    if (!z) {
                    }
                } finally {
                    reentrantLock.unlock();
                }
            }
        }
        try {
            try {
                if (iVar.b) {
                    throw new IllegalStateException("Recursive database initialization detected. Did you try to use the database instance during initialization? Maybe in one of the callbacks?");
                }
                oll0 c = ((pll0) this.b).c(str);
                if (iVar.a) {
                    b.b(c);
                    if (iVar.d().g == RoomDatabase.JournalMode.WRITE_AHEAD_LOGGING) {
                        vez0.s(c, "PRAGMA synchronous = NORMAL");
                    } else {
                        vez0.s(c, "PRAGMA synchronous = FULL");
                    }
                    iVar.e().j(c);
                } else {
                    try {
                        iVar.b = true;
                        b.a(iVar, c);
                        iVar.b = false;
                    } catch (Throwable th2) {
                        iVar.b = false;
                        throw th2;
                    }
                }
                if (zrmVar != null && (fileChannel2 = (FileChannel) zrmVar.c) != null) {
                    try {
                        fileChannel2.close();
                        zrmVar.c = null;
                    } finally {
                    }
                }
                return c;
            } catch (Throwable th3) {
                th = th3;
                if (!z) {
                    throw th;
                }
                throw new IllegalStateException("Unable to open database '" + str + "'. Was a proper path / name used in Room's database builder?", th);
            }
        } catch (Throwable th4) {
            if (zrmVar != null && (fileChannel = (FileChannel) zrmVar.c) != null) {
                try {
                    fileChannel.close();
                    zrmVar.c = null;
                } finally {
                }
            }
            throw th4;
        }
    }

    @Override // defpackage.ut31
    public void d(String str, zq31 zq31Var, int i) {
        synchronized (((w53) this.c)) {
            if (((w53) this.c).containsKey(str)) {
                z83.j("Factory is already registered");
            } else {
                ((w53) this.c).put(str, new hd1(str, zq31Var, (eq31) this.b, i));
            }
        }
    }

    @Override // defpackage.qq70
    public void e(DriveState driveState) {
        ((np5) this.c).c.p();
        ((d) ((xq5) this.b)).a.r(new ar5(0));
    }

    @Override // defpackage.ggi0
    public void f(fi6 fi6Var, List list) {
        int a = ((cr00) this.c).a();
        nz2 nz2Var = (nz2) this.b;
        zzs zzsVar = nz2Var.a.a.t;
        if (zzsVar != null) {
            Polyline polyline = ru.yandex.taxi.map.utils.a.b;
            fi6Var.c(new Point(zzsVar.a, zzsVar.b));
        }
        if (fi6Var.i()) {
            nz2.c(fi6Var, a);
            return;
        }
        nz2Var.d(fi6Var);
        nz2Var.e(fi6Var, false);
        nz2.c(fi6Var, a);
    }

    @Override // defpackage.qq70
    public void g(DriveState driveState) {
        ((d) ((xq5) this.b)).a();
    }

    @Override // defpackage.vbi0
    public Object getValue(Object obj, kgx kgxVar) {
        return ((AtomicReference) this.c).get();
    }

    public void h(r5s r5sVar, int i, int i2, int i3, PhotocommentsSource photocommentsSource) {
        p370 p370Var = (p370) this.c;
        c0k0 c0k0Var = r5sVar.a;
        j6s b = ((p6s) p370Var.w).b();
        List n = b == null ? null : p370Var.n(c0k0Var, b);
        int size = n != null ? n.size() : 0;
        ru.yandex.taxi.logistics.sdk.photocomments.domain.a aVar = (ru.yandex.taxi.logistics.sdk.photocomments.domain.a) this.b;
        if (size >= i3) {
            aVar.i();
            return;
        }
        int i4 = ij0.a[photocommentsSource.ordinal()];
        if (i4 == 1) {
            aVar.f(r5sVar, i, i2);
            return;
        }
        if (i4 == 2) {
            aVar.g(r5sVar, i, i2);
        } else if (i4 == 3) {
            aVar.h(r5sVar, i, i2);
        } else {
            w511.b();
        }
    }

    public void j(kyg kygVar) {
        synchronized (kygVar) {
        }
        Handler handler = (Handler) this.b;
        if (handler != null) {
            handler.post(new qg3(this, kygVar, 1));
        }
    }

    public vz5 k() {
        int[] iArr;
        if (((vz5) this.c) == null) {
            m2v m2vVar = (m2v) this.b;
            vz5 vz5Var = (vz5) m2vVar.w;
            if (vz5Var == null) {
                lhc0 lhc0Var = (lhc0) m2vVar.a;
                int i = lhc0Var.b;
                int i2 = lhc0Var.c;
                int i3 = 0;
                boolean z = true;
                if (i < 40 || i2 < 40) {
                    vz5 vz5Var2 = new vz5(i, i2);
                    if (((byte[]) m2vVar.b).length < i) {
                        m2vVar.b = new byte[i];
                    }
                    int i4 = 0;
                    while (true) {
                        iArr = (int[]) m2vVar.c;
                        if (i4 >= 32) {
                            break;
                        }
                        iArr[i4] = 0;
                        i4++;
                    }
                    for (int i5 = 1; i5 < 5; i5++) {
                        byte[] b = lhc0Var.b((i2 * i5) / 5, (byte[]) m2vVar.b);
                        int i6 = (i * 4) / 5;
                        for (int i7 = i / 5; i7 < i6; i7++) {
                            int i8 = (b[i7] & 255) >> 3;
                            iArr[i8] = iArr[i8] + 1;
                        }
                    }
                    int length = iArr.length;
                    int i9 = 0;
                    int i10 = 0;
                    int i11 = 0;
                    for (int i12 = 0; i12 < length; i12++) {
                        int i13 = iArr[i12];
                        if (i13 > i9) {
                            i11 = i12;
                            i9 = i13;
                        }
                        if (i13 > i10) {
                            i10 = i13;
                        }
                    }
                    int i14 = 0;
                    int i15 = 0;
                    for (int i16 = 0; i16 < length; i16++) {
                        int i17 = i16 - i11;
                        int i18 = iArr[i16] * i17 * i17;
                        if (i18 > i15) {
                            i14 = i16;
                            i15 = i18;
                        }
                    }
                    if (i11 <= i14) {
                        int i19 = i11;
                        i11 = i14;
                        i14 = i19;
                    }
                    if (i11 - i14 <= length / 16) {
                        throw NotFoundException.a();
                    }
                    int i20 = i11 - 1;
                    int i21 = -1;
                    int i22 = i20;
                    while (i20 > i14) {
                        int i23 = i20 - i14;
                        int i24 = (i10 - iArr[i20]) * (i11 - i20) * i23 * i23;
                        if (i24 > i21) {
                            i22 = i20;
                            i21 = i24;
                        }
                        i20--;
                    }
                    int i25 = i22 << 3;
                    byte[] a = lhc0Var.a();
                    for (int i26 = 0; i26 < i2; i26++) {
                        int i27 = i26 * i;
                        for (int i28 = 0; i28 < i; i28++) {
                            if ((a[i27 + i28] & 255) < i25) {
                                vz5Var2.c(i28, i26);
                            }
                        }
                    }
                    m2vVar.w = vz5Var2;
                } else {
                    byte[] a2 = lhc0Var.a();
                    int i29 = i >> 3;
                    if ((i & 7) != 0) {
                        i29++;
                    }
                    int i30 = i2 >> 3;
                    if ((i2 & 7) != 0) {
                        i30++;
                    }
                    int i31 = i2 - 8;
                    int i32 = i - 8;
                    int i33 = 2;
                    int[][] iArr2 = (int[][]) Array.newInstance((Class<?>) Integer.TYPE, i30, i29);
                    int i34 = 0;
                    while (true) {
                        int i35 = 8;
                        if (i34 >= i30) {
                            break;
                        }
                        int i36 = i3;
                        int i37 = i34 << 3;
                        if (i37 > i31) {
                            i37 = i31;
                        }
                        boolean z2 = z;
                        int i38 = i36;
                        while (i38 < i29) {
                            int i39 = i33;
                            int i40 = i38 << 3;
                            if (i40 > i32) {
                                i40 = i32;
                            }
                            int i41 = (i37 * i) + i40;
                            int i42 = i36;
                            int i43 = i42;
                            int i44 = i43;
                            int i45 = 255;
                            while (i42 < i35) {
                                byte[] bArr = a2;
                                int i46 = i37;
                                int i47 = i36;
                                int i48 = i44;
                                int i49 = i45;
                                while (i47 < i35) {
                                    int i50 = i47;
                                    int i51 = bArr[i41 + i47] & 255;
                                    i43 += i51;
                                    if (i51 < i49) {
                                        i49 = i51;
                                    }
                                    if (i51 > i48) {
                                        i48 = i51;
                                    }
                                    i47 = i50 + 1;
                                    i35 = 8;
                                }
                                if (i48 - i49 > 24) {
                                    while (true) {
                                        i42++;
                                        i41 += i;
                                        if (i42 < 8) {
                                            int i52 = i36;
                                            for (int i53 = 8; i52 < i53; i53 = 8) {
                                                i43 += bArr[i41 + i52] & 255;
                                                i52++;
                                                i49 = i49;
                                            }
                                        }
                                    }
                                }
                                i42++;
                                i41 += i;
                                i45 = i49;
                                a2 = bArr;
                                i37 = i46;
                                i35 = 8;
                                i44 = i48;
                            }
                            byte[] bArr2 = a2;
                            int i54 = i37;
                            int i55 = i43 >> 6;
                            int i56 = i45;
                            if (i44 - i56 <= 24) {
                                i55 = i56 / 2;
                                if (i34 > 0 && i38 > 0) {
                                    int[] iArr3 = iArr2[i34 - 1];
                                    int i57 = i38 - 1;
                                    int i58 = (((iArr2[i34][i57] * 2) + iArr3[i38]) + iArr3[i57]) / 4;
                                    if (i56 < i58) {
                                        i55 = i58;
                                    }
                                }
                            }
                            iArr2[i34][i38] = i55;
                            i38++;
                            i33 = i39;
                            a2 = bArr2;
                            i37 = i54;
                            i35 = 8;
                        }
                        i34++;
                        i3 = i36;
                        z = z2;
                    }
                    byte[] bArr3 = a2;
                    int i59 = i3;
                    int i60 = i33;
                    vz5 vz5Var3 = new vz5(i, i2);
                    int i61 = i59;
                    while (i61 < i30) {
                        int i62 = i61 << 3;
                        if (i62 > i31) {
                            i62 = i31;
                        }
                        int min = i61 < i60 ? 2 : Math.min(i61, i30 - 3);
                        int i63 = i59;
                        while (i63 < i29) {
                            int i64 = i63 << 3;
                            if (i64 > i32) {
                                i64 = i32;
                            }
                            int min2 = i63 < 2 ? 2 : Math.min(i63, i29 - 3);
                            int i65 = i61;
                            int i66 = -2;
                            int i67 = i59;
                            for (int i68 = 2; i66 <= i68; i68 = 2) {
                                int[] iArr4 = iArr2[min + i66];
                                i67 = iArr4[min2 - 2] + iArr4[min2 - 1] + iArr4[min2] + iArr4[min2 + 1] + iArr4[min2 + 2] + i67;
                                i66++;
                            }
                            int i69 = i67 / 25;
                            int i70 = (i62 * i) + i64;
                            int i71 = i29;
                            int i72 = i59;
                            while (true) {
                                if (i72 < 8) {
                                    int i73 = i62;
                                    int i74 = i59;
                                    for (int i75 = 8; i74 < i75; i75 = 8) {
                                        int i76 = i74;
                                        if ((bArr3[i70 + i74] & 255) <= i69) {
                                            vz5Var3.c(i64 + i76, i73 + i72);
                                        }
                                        i74 = i76 + 1;
                                    }
                                    i72++;
                                    i70 += i;
                                    i62 = i73;
                                }
                            }
                            i63++;
                            i61 = i65;
                            i29 = i71;
                        }
                        i60 = 2;
                        i61++;
                    }
                    m2vVar.w = vz5Var3;
                }
                vz5Var = (vz5) m2vVar.w;
            }
            this.c = vz5Var;
        }
        return (vz5) this.c;
    }

    public InputMethodManager l() {
        return (InputMethodManager) ((i3y) this.c).getValue();
    }

    @Override // defpackage.pll0
    public boolean m() {
        return ((pll0) this.b).m();
    }

    public Object n(l65 l65Var, SuspendLambda suspendLambda) {
        if (l65Var instanceof BaseOrganizationsResponse$OrganizationsResponse) {
            return ((f) this.b).a((BaseOrganizationsResponse$OrganizationsResponse) l65Var, suspendLambda);
        }
        if (l65Var instanceof BaseOrganizationsResponse$OrganizationsResponseV2) {
            return ((g) this.c).a((BaseOrganizationsResponse$OrganizationsResponseV2) l65Var, suspendLambda);
        }
        w511.b();
        return null;
    }

    @Override // defpackage.i8j0
    public void onCaptureCompleted(j8j0 j8j0Var, ap7 ap7Var) {
        o3 o3Var = (o3) this.b;
        c06 c06Var = (c06) ap7Var;
        c06Var.getTimestamp();
        o3Var.c = new md6(10, (q6x0) this.c, (CaptureResult) c06Var.b);
        o3Var.c();
    }

    @Override // defpackage.i8j0
    public void onCaptureFailed(j8j0 j8j0Var, xo7 xo7Var) {
        ((o3) this.b).g();
    }

    @Override // defpackage.lh5
    public void onError(Throwable th) {
        if (th instanceof RestoreStateException) {
            ((com.yandex.fintechsdk.core.analytics.impl.internal.a) ((z22) this.b)).a(cxj0.c);
            mua1.f((a) this.c, "splash", new gbr(499, null, null, "bdui"), 2);
        }
    }

    @Override // defpackage.al7
    public void onFailure(yf7 yf7Var, IOException iOException) {
        ((j18) this.b).resumeWith(new Result.Failure(iOException));
    }

    @Override // defpackage.al7
    public void onResponse(yf7 yf7Var, kvj0 kvj0Var) {
        j18 j18Var = (j18) this.b;
        try {
            try {
                Object invoke = ((tls) this.c).invoke(kvj0Var);
                kvj0Var.close();
                j18Var.resumeWith(new Pair(Integer.valueOf(kvj0Var.w), invoke));
            } finally {
            }
        } catch (Exception e) {
            j18Var.resumeWith(new Result.Failure(e));
        }
    }

    @Override // defpackage.xbi0
    public void setValue(Object obj, kgx kgxVar, Object obj2) {
        Object andSet = ((AtomicReference) this.c).getAndSet(obj2);
        if (andSet != null) {
            ((wls) this.b).invoke(obj, andSet);
        }
    }

    public String toString() {
        switch (this.a) {
            case 29:
                try {
                    return k().toString();
                } catch (NotFoundException unused) {
                    return "";
                }
            default:
                return super.toString();
        }
    }

    public /* synthetic */ h0w(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    public h0w(eq31 eq31Var) {
        this.a = 7;
        this.b = eq31Var;
        this.c = new w53();
    }

    public h0w(m2v m2vVar) {
        this.a = 29;
        this.b = m2vVar;
    }

    public h0w(wls wlsVar) {
        this.a = 16;
        this.b = wlsVar;
        this.c = new AtomicReference();
    }

    public h0w(View view) {
        this.a = 0;
        this.b = view;
        this.c = kotlin.a.b(LazyThreadSafetyMode.NONE, new tzt(17, this));
    }

    public h0w(i iVar, pll0 pll0Var) {
        this.a = 23;
        this.c = iVar;
        this.b = pll0Var;
    }

    public h0w(Handler handler, xg3 xg3Var) {
        this.a = 15;
        if (xg3Var != null) {
            handler.getClass();
        } else {
            handler = null;
        }
        this.b = handler;
        this.c = xg3Var;
    }

    public h0w(yh2 yh2Var) {
        this.a = 11;
        this.c = yh2Var;
    }

    public h0w(o3 o3Var, int i, q6x0 q6x0Var) {
        this.a = 24;
        this.b = o3Var;
        this.c = q6x0Var;
    }
}

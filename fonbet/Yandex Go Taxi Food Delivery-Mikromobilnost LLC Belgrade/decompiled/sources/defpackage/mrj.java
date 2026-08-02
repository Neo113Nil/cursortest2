package defpackage;

import android.app.KeyguardManager;
import android.content.Context;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.hardware.biometrics.BiometricManager;
import android.hardware.biometrics.BiometricPrompt;
import android.hardware.fingerprint.FingerprintManager;
import android.media.AudioDeviceInfo;
import android.media.AudioManager;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.util.Rational;
import android.widget.ImageView;
import com.yandex.messaging.auth.passport.b;
import com.yandex.messaging.core.net.entities.PersonalUserData;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import kotlinx.coroutines.flow.e;
import ru.yandex.taxi.logistics.sdk.delivery_screen_smart_camera.impl.OpeningSource;
import ru.yandex.taxi.summary.solid.interactor.BottomNotificationDataInteractor$notificationFlow$$inlined$wrapFlow$1;
import ru.yandex.taxi.summary.solid.interactor.BottomNotificationDataInteractor$notificationFlow$$inlined$wrapFlow$2;
import ru.yandex.taxi.summary.solid.interactor.a;
import ru.yandex.taxi.summary.solid.interactor.p;

/* loaded from: classes5.dex */
public final class mrj implements xs21, izn, zeo {
    public final /* synthetic */ int a;
    public Object b;
    public Object c;
    public Object w;

    public mrj(File file) {
        this.a = 16;
        this.b = file;
        this.c = new File(file.getPath() + ".new");
        this.w = new File(file.getPath() + ".bak");
    }

    public static r9x0 I(r9x0 r9x0Var, ldc ldcVar) {
        if (r9x0Var instanceof c9x0) {
            c9x0 c9x0Var = (c9x0) r9x0Var;
            return new c9x0(c9x0Var.a, c9x0Var.b, c9x0Var.c, c9x0Var.d, c9x0Var.e, c9x0Var.f, OpeningSource.SLIME, ldcVar);
        }
        if (!(r9x0Var instanceof y8x0)) {
            return r9x0Var;
        }
        ArrayList arrayList = ((y8x0) r9x0Var).a;
        ArrayList arrayList2 = new ArrayList(tcc.n(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(I((r9x0) it.next(), ldcVar));
        }
        return new y8x0(arrayList2);
    }

    public static void u(File file, File file2) {
        if (file2.isDirectory() && !file2.delete()) {
            Log.e("AtomicFile", "Failed to delete file which is a directory " + file2);
        }
        if (file.renameTo(file2)) {
            return;
        }
        Log.e("AtomicFile", "Failed to rename " + file + " to " + file2);
    }

    public void A() {
        ImageView imageView = (ImageView) this.w;
        imageView.setVisibility(0);
        ((ImageView) this.b).setVisibility(8);
        ((ImageView) this.c).setVisibility(8);
        Drawable drawable = imageView.getDrawable();
        AnimatedVectorDrawable animatedVectorDrawable = drawable instanceof AnimatedVectorDrawable ? (AnimatedVectorDrawable) drawable : null;
        if (animatedVectorDrawable != null) {
            animatedVectorDrawable.start();
        }
    }

    public void B(nf1 nf1Var) {
        this.b = nf1Var;
    }

    public void C(bh1 bh1Var) {
        this.b = bh1Var;
    }

    public void D(bi1 bi1Var) {
        this.b = bi1Var;
    }

    public void E() {
        i();
        ((ImageView) this.b).setVisibility(0);
        ((ImageView) this.c).setVisibility(8);
        ((ImageView) this.w).setVisibility(8);
    }

    public void F(int i) {
        if (i < 10 || 16 < i) {
            throw new GeneralSecurityException(oyr.i(i, "Invalid tag size for AesCmacParameters: "));
        }
        this.c = Integer.valueOf(i);
    }

    public void G(mf1 mf1Var) {
        this.w = mf1Var;
    }

    public FileOutputStream H() {
        File file = (File) this.c;
        File file2 = (File) this.w;
        if (file2.exists()) {
            u(file2, (File) this.b);
        }
        try {
            return new FileOutputStream(file);
        } catch (FileNotFoundException unused) {
            if (!file.getParentFile().mkdirs()) {
                w511.h(file, "Failed to create directory for ");
                return null;
            }
            try {
                return new FileOutputStream(file);
            } catch (FileNotFoundException e) {
                throw new IOException("Failed to create new file " + file, e);
            }
        }
    }

    public ff1 a() {
        va90 va90Var;
        u77 a;
        nf1 nf1Var = (nf1) this.b;
        if (nf1Var == null || (va90Var = (va90) this.c) == null) {
            kbs.v("Cannot build without parameters and/or key material");
            return null;
        }
        if (nf1Var.a != ((u77) va90Var.a).a.length) {
            kbs.v("Key size mismatch");
            return null;
        }
        mf1 mf1Var = nf1Var.c;
        mf1 mf1Var2 = mf1.y;
        if (mf1Var != mf1Var2 && ((Integer) this.w) == null) {
            kbs.v("Cannot create key without ID requirement with parameters with ID requirement");
            return null;
        }
        if (mf1Var == mf1Var2 && ((Integer) this.w) != null) {
            kbs.v("Cannot create key with ID requirement with parameters without ID requirement");
            return null;
        }
        if (mf1Var == mf1Var2) {
            a = u77.a(new byte[0]);
        } else if (mf1Var == mf1.x || mf1Var == mf1.w) {
            a = u77.a(ByteBuffer.allocate(5).put((byte) 0).putInt(((Integer) this.w).intValue()).array());
        } else {
            if (mf1Var != mf1.c) {
                yci0.t(((nf1) this.b).c, "Unknown AesCmacParametersParameters.Variant: ");
                return null;
            }
            a = u77.a(ByteBuffer.allocate(5).put((byte) 1).putInt(((Integer) this.w).intValue()).array());
        }
        return new ff1((nf1) this.b, a);
    }

    public nf1 b() {
        Integer num = (Integer) this.b;
        if (num == null) {
            kbs.v("key size not set");
            return null;
        }
        if (((Integer) this.c) != null) {
            return new nf1(num.intValue(), ((Integer) this.c).intValue(), (mf1) this.w);
        }
        kbs.v("tag size not set");
        return null;
    }

    public xg1 c() {
        va90 va90Var;
        bh1 bh1Var = (bh1) this.b;
        if (bh1Var == null || (va90Var = (va90) this.c) == null) {
            kbs.v("Cannot build without parameters and/or key material");
            return null;
        }
        if (bh1Var.a != ((u77) va90Var.a).a.length) {
            kbs.v("Key size mismatch");
            return null;
        }
        mf1 mf1Var = bh1Var.d;
        mf1 mf1Var2 = mf1.B;
        if (mf1Var != mf1Var2 && ((Integer) this.w) == null) {
            kbs.v("Cannot create key without ID requirement with parameters with ID requirement");
            return null;
        }
        if (mf1Var == mf1Var2 && ((Integer) this.w) != null) {
            kbs.v("Cannot create key with ID requirement with parameters without ID requirement");
            return null;
        }
        if (mf1Var == mf1Var2) {
            u77.a(new byte[0]);
        } else if (mf1Var == mf1.A) {
            u77.a(ByteBuffer.allocate(5).put((byte) 0).putInt(((Integer) this.w).intValue()).array());
        } else {
            if (mf1Var != mf1.z) {
                yci0.t(((bh1) this.b).d, "Unknown AesEaxParameters.Variant: ");
                return null;
            }
            u77.a(ByteBuffer.allocate(5).put((byte) 1).putInt(((Integer) this.w).intValue()).array());
        }
        return new xg1();
    }

    @Override // defpackage.xs21
    public void close() {
        z83.g(null, ((Handler) this.b).getLooper(), Looper.myLooper());
        this.w = null;
    }

    public xh1 d() {
        va90 va90Var;
        bi1 bi1Var = (bi1) this.b;
        if (bi1Var == null || (va90Var = (va90) this.c) == null) {
            kbs.v("Cannot build without parameters and/or key material");
            return null;
        }
        if (bi1Var.a != ((u77) va90Var.a).a.length) {
            kbs.v("Key size mismatch");
            return null;
        }
        ag1 ag1Var = bi1Var.b;
        ag1 ag1Var2 = ag1.j;
        if (ag1Var != ag1Var2 && ((Integer) this.w) == null) {
            kbs.v("Cannot create key without ID requirement with parameters with ID requirement");
            return null;
        }
        if (ag1Var == ag1Var2 && ((Integer) this.w) != null) {
            kbs.v("Cannot create key with ID requirement with parameters without ID requirement");
            return null;
        }
        if (ag1Var == ag1Var2) {
            u77.a(new byte[0]);
        } else if (ag1Var == ag1.i) {
            u77.a(ByteBuffer.allocate(5).put((byte) 0).putInt(((Integer) this.w).intValue()).array());
        } else {
            if (ag1Var != ag1.h) {
                yci0.t(((bi1) this.b).b, "Unknown AesGcmSivParameters.Variant: ");
                return null;
            }
            u77.a(ByteBuffer.allocate(5).put((byte) 1).putInt(((Integer) this.w).intValue()).array());
        }
        return new xh1();
    }

    @Override // defpackage.xs21
    public e1k e(cl21 cl21Var) {
        d9g d9gVar = (d9g) cl21Var;
        Handler c = d9gVar.b.c();
        yi3 yi3Var = (yi3) d9gVar.e.get();
        qp90 n = d9gVar.c.n();
        Uri uri = (Uri) this.c;
        x08 x08Var = wfz.z;
        z83.g(null, c.getLooper(), Looper.myLooper());
        z83.g(null, yi3Var.c, Looper.myLooper());
        wl3 wl3Var = yi3Var.B;
        if (wl3Var == null) {
            t();
        } else {
            b bVar = n.b;
            if (bVar == null) {
                n.b("acceptAuthInTrack");
            } else {
                x08Var = new ap90(bVar, null, n.c, new p370(19, wl3Var, uri, this));
            }
        }
        return new cn2(x08Var, 0);
    }

    public k74 f() {
        String str = ((i94) this.b) == null ? " videoSpec" : "";
        if (((n34) this.c) == null) {
            str = str.concat(" audioSpec");
        }
        if (((Integer) this.w) == null) {
            str = str.concat(" outputFormat");
        }
        if (str.isEmpty()) {
            return new k74((i94) this.b, (n34) this.c, ((Integer) this.w).intValue());
        }
        ny61.r("Missing required properties:".concat(str));
        return null;
    }

    public int g(int i) {
        BiometricPrompt.CryptoObject g;
        BiometricManager biometricManager = (BiometricManager) this.c;
        int i2 = Build.VERSION.SDK_INT;
        int i3 = 1;
        if (i2 >= 30) {
            if (biometricManager != null) {
                return xx5.a(biometricManager, i);
            }
            Log.e("BiometricManager", "Failure in canAuthenticate(). BiometricManager was null.");
            return 1;
        }
        Context context = ((abe) this.b).a;
        if (!p1b1.e(i)) {
            return -2;
        }
        if (i == 0 || ykx.a(context) == null) {
            return 12;
        }
        int i4 = 0;
        if (p1b1.d(i)) {
            KeyguardManager a = ykx.a(context);
            return a == null ? false : ykx.b(a) ? 0 : 11;
        }
        if (i2 != 29) {
            return h();
        }
        if ((i & 255) == 255) {
            if (biometricManager != null) {
                return wx5.a(biometricManager);
            }
            Log.e("BiometricManager", "Failure in canAuthenticate(). BiometricManager was null.");
            return 1;
        }
        Method c = wx5.c();
        if (c != null && (g = iub1.g(iub1.f())) != null) {
            try {
                Object invoke = c.invoke(biometricManager, g);
                if (invoke instanceof Integer) {
                    return ((Integer) invoke).intValue();
                }
            } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException unused) {
            }
        }
        if (biometricManager == null) {
            Log.e("BiometricManager", "Failure in canAuthenticate(). BiometricManager was null.");
        } else {
            i3 = wx5.a(biometricManager);
        }
        String str = Build.MODEL;
        if (Build.VERSION.SDK_INT < 30) {
            int i5 = cng0.assume_strong_biometrics_models;
            if (str != null) {
                for (String str2 : context.getResources().getStringArray(i5)) {
                    if (str.equals(str2)) {
                        return i3;
                    }
                }
            }
        }
        if (i3 != 0) {
            return i3;
        }
        KeyguardManager a2 = ykx.a(context);
        if (!(a2 == null ? false : ykx.b(a2))) {
            i4 = this.h();
        } else if (this.h() != 0) {
            i4 = -1;
        }
        return i4;
    }

    public int h() {
        j9r j9rVar = (j9r) this.w;
        if (j9rVar == null) {
            Log.e("BiometricManager", "Failure in canAuthenticate(). FingerprintManager was null.");
            return 1;
        }
        Context context = j9rVar.a;
        FingerprintManager b = h9r.b(context);
        if (b == null || !h9r.d(b)) {
            return 12;
        }
        FingerprintManager b2 = h9r.b(context);
        return (b2 == null || !h9r.c(b2)) ? 11 : 0;
    }

    public void i() {
        Drawable drawable = ((ImageView) this.w).getDrawable();
        AnimatedVectorDrawable animatedVectorDrawable = drawable instanceof AnimatedVectorDrawable ? (AnimatedVectorDrawable) drawable : null;
        if (animatedVectorDrawable != null) {
            animatedVectorDrawable.stop();
        }
    }

    public void j() {
        ((Handler) this.b).post(new rg3(this, ((wi60) this.w).b(), 2));
    }

    public void l(FileOutputStream fileOutputStream) {
        File file = (File) this.c;
        if (fileOutputStream == null) {
            return;
        }
        try {
            fileOutputStream.getFD().sync();
        } catch (IOException unused) {
            Log.e("AtomicFile", "Failed to sync file output stream");
        }
        try {
            fileOutputStream.close();
        } catch (IOException e) {
            Log.e("AtomicFile", "Failed to close file output stream", e);
        }
        if (file.delete()) {
            return;
        }
        Log.e("AtomicFile", "Failed to delete new file " + file);
    }

    public void m(FileOutputStream fileOutputStream) {
        try {
            fileOutputStream.getFD().sync();
        } catch (IOException unused) {
            Log.e("AtomicFile", "Failed to sync file output stream");
        }
        try {
            fileOutputStream.close();
        } catch (IOException e) {
            Log.e("AtomicFile", "Failed to close file output stream", e);
        }
        u((File) this.c, (File) this.b);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:25:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x014a  */
    /* JADX WARN: Type inference failed for: r5v10, types: [java.lang.Object, mzn] */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public mzn n(int i) {
        lzn lznVar;
        f64 f64Var;
        int i2;
        f64 f64Var2;
        ?? e;
        q6c0 q6c0Var = (q6c0) this.b;
        HashMap hashMap = (HashMap) this.w;
        if (hashMap.containsKey(Integer.valueOf(i))) {
            return (mzn) hashMap.get(Integer.valueOf(i));
        }
        if (!q6c0Var.s(i)) {
            return null;
        }
        mzn L = q6c0Var.L(i);
        if (L == null) {
            e = 0;
        } else {
            ArrayList arrayList = new ArrayList(L.d());
            Iterator it = L.d().iterator();
            while (true) {
                if (!it.hasNext()) {
                    lznVar = null;
                    break;
                }
                lznVar = (lzn) it.next();
                if (lznVar.f() == 0) {
                    break;
                }
            }
            if (lznVar == null) {
                f64Var2 = null;
                f64Var = null;
            } else {
                int d = lznVar.d();
                String h = lznVar.h();
                int i3 = lznVar.i();
                if (1 != lznVar.f()) {
                    d = 5;
                    h = "video/hevc";
                    i3 = 2;
                }
                int i4 = d;
                String str = h;
                int i5 = i3;
                int b = lznVar.b();
                int a = lznVar.a();
                if (10 == a) {
                    i2 = b;
                    f64Var = null;
                } else {
                    int doubleValue = (int) (b * new Rational(10, a).doubleValue());
                    if (sgb1.g(3, "BackupHdrProfileEncoderProfilesProvider")) {
                        f64Var = null;
                        String.format("Base Bitrate(%dbps) * Bit Depth Ratio (%d / %d) = %d", Integer.valueOf(b), 10, Integer.valueOf(a), Integer.valueOf(doubleValue));
                        sgb1.g(3, "BackupHdrProfileEncoderProfilesProvider");
                    } else {
                        f64Var = null;
                    }
                    i2 = doubleValue;
                }
                f64Var2 = new f64(i4, str, i2, lznVar.e(), lznVar.k(), lznVar.g(), i5, 10, lznVar.c(), 1);
            }
            sl31 sl31Var = (sl31) this.c;
            if (f64Var2 != null) {
                String str2 = f64Var2.b;
                sl31Var.getClass();
                rl31 a2 = sl31.a(str2);
                if (a2 != null && a2.M1(f64Var2.e, f64Var2.f)) {
                    int i6 = f64Var2.c;
                    int intValue = ((Integer) a2.Q2().clamp(Integer.valueOf(i6))).intValue();
                    if (intValue != i6) {
                        f64Var2 = new f64(f64Var2.a, f64Var2.b, intValue, f64Var2.d, f64Var2.e, f64Var2.f, f64Var2.g, f64Var2.h, f64Var2.i, f64Var2.j);
                    }
                    if (f64Var2 != null) {
                        arrayList.add(f64Var2);
                    }
                    e = !arrayList.isEmpty() ? f64Var : kzn.e(L.c(), L.a(), L.b(), arrayList);
                }
            }
            f64Var2 = f64Var;
            if (f64Var2 != null) {
            }
            if (!arrayList.isEmpty()) {
            }
        }
        hashMap.put(Integer.valueOf(i), e);
        return e;
    }

    @Override // defpackage.izn
    public mzn o(int i) {
        return n(i);
    }

    @Override // defpackage.zeo
    public void onCancel(Object obj) {
        AudioManager audioManager = (AudioManager) this.b;
        BluetoothAudioReceiverConnectionCallback bluetoothAudioReceiverConnectionCallback = (BluetoothAudioReceiverConnectionCallback) this.w;
        if (bluetoothAudioReceiverConnectionCallback == null) {
            bluetoothAudioReceiverConnectionCallback = null;
        }
        audioManager.unregisterAudioDeviceCallback(bluetoothAudioReceiverConnectionCallback);
    }

    @Override // defpackage.zeo
    public void onListen(Object obj, xeo xeoVar) {
        AudioManager audioManager = (AudioManager) this.b;
        this.c = new ymu(29, (yeo) xeoVar, audioManager);
        ymu ymuVar = (ymu) this.c;
        if (ymuVar == null) {
            ymuVar = null;
        }
        this.w = new BluetoothAudioReceiverConnectionCallback(ymuVar);
        ymu ymuVar2 = (ymu) this.c;
        if (ymuVar2 == null) {
            ymuVar2 = null;
        }
        AudioDeviceInfo[] devices = ((AudioManager) ymuVar2.c).getDevices(2);
        int i = 0;
        while (i < devices.length) {
            int i2 = i + 1;
            try {
                AudioDeviceInfo audioDeviceInfo = devices[i];
                if (ymuVar2.n(audioDeviceInfo.getType())) {
                    ymuVar2.x("add", audioDeviceInfo);
                }
                i = i2;
            } catch (ArrayIndexOutOfBoundsException e) {
                w511.i(e.getMessage());
                return;
            }
        }
        BluetoothAudioReceiverConnectionCallback bluetoothAudioReceiverConnectionCallback = (BluetoothAudioReceiverConnectionCallback) this.w;
        if (bluetoothAudioReceiverConnectionCallback == null) {
            bluetoothAudioReceiverConnectionCallback = null;
        }
        audioManager.registerAudioDeviceCallback(bluetoothAudioReceiverConnectionCallback, null);
    }

    public hzt p(piy piyVar) {
        ArrayList<izt> arrayList = piyVar.a;
        ArrayList arrayList2 = new ArrayList(tcc.n(arrayList, 10));
        for (izt iztVar : arrayList) {
            arrayList2.add(new jzt(((yfa) this.c).f(iztVar.a), iztVar.b));
        }
        return new hzt(Math.toRadians(piyVar.b), arrayList2);
    }

    public lvi0 q(String str, String str2) {
        String a = ((l7x0) this.b).a(str);
        ldc f = ((yfa) this.c).f(str2);
        return new lvi0(a, null, null, null, f != null ? new zez0(f.a) : null, 46);
    }

    public tpr r(mth mthVar, tls tlsVar, gqs gqsVar) {
        return e.t(new mth(new a((tpr[]) Arrays.copyOf(new tpr[]{e.X(mthVar, new BottomNotificationDataInteractor$notificationFlow$$inlined$wrapFlow$1(null, tlsVar, (com.yandex.go.taxi.summary.shared.requirement.e) this.b)), e.X(mthVar, new BottomNotificationDataInteractor$notificationFlow$$inlined$wrapFlow$2(null, tlsVar, (llx0) this.w)), ((p) this.c).c(gqsVar, tlsVar)}, 3)), 6));
    }

    @Override // defpackage.izn
    public boolean s(int i) {
        return ((q6c0) this.b).s(i) && n(i) != null;
    }

    public void t() {
        ((Handler) this.b).post(new jg(22, this));
    }

    public void v(PersonalUserData personalUserData) {
        ((Handler) this.b).post(new mh3(1, this, personalUserData));
    }

    public void w(va90 va90Var) {
        this.c = va90Var;
    }

    public void x(Integer num) {
        switch (this.a) {
            case 8:
                this.w = num;
                break;
            case 9:
            default:
                this.w = num;
                break;
            case 10:
                this.w = num;
                break;
        }
    }

    public void y(va90 va90Var) {
        switch (this.a) {
            case 10:
                this.c = va90Var;
                break;
            default:
                this.c = va90Var;
                break;
        }
    }

    public void z(int i) {
        if (i != 16 && i != 32) {
            throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 128-bit and 256-bit AES keys are supported", Integer.valueOf(i * 8)));
        }
        this.b = Integer.valueOf(i);
    }

    public /* synthetic */ mrj(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    public /* synthetic */ mrj(int i, Object obj, Object obj2, Object obj3) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.w = obj3;
    }

    public /* synthetic */ mrj(int i, boolean z) {
        this.a = i;
    }

    public mrj(cwh cwhVar, zuj0 zuj0Var, hgf hgfVar) {
        this.a = 7;
        this.c = cwhVar;
        this.b = zuj0Var;
        this.w = hgfVar;
    }

    public mrj(Uri uri, at20 at20Var) {
        this.a = 14;
        this.b = new Handler();
        this.c = uri;
        this.w = at20Var;
    }

    public /* synthetic */ mrj(int i) {
        this.a = i;
        this.b = null;
        this.c = null;
        this.w = null;
    }

    public mrj() {
        this.a = 9;
        this.b = null;
        this.c = null;
        this.w = mf1.y;
    }

    public mrj(q6c0 q6c0Var) {
        this.a = 22;
        this.w = new HashMap();
        this.b = q6c0Var;
        this.c = tl31.w;
    }

    public mrj(oy5 oy5Var) {
        this.a = 19;
        this.w = oy5Var;
    }

    public mrj(abe abeVar) {
        this.a = 26;
        this.b = abeVar;
        Context context = abeVar.a;
        this.c = wx5.b(context);
        this.w = Build.VERSION.SDK_INT <= 29 ? new j9r(context) : null;
    }
}

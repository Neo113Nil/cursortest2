package defpackage;

import android.content.Context;
import android.media.Image;
import android.os.RemoteException;
import android.os.SystemClock;
import android.util.Log;
import android.util.Pair;
import android.view.Surface;
import com.google.android.gms.common.b;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamite.DynamiteModule$LoadingException;
import com.google.android.gms.internal.mlkit_vision_face.n;
import com.google.android.gms.internal.mlkit_vision_face.zzf;
import com.google.android.gms.internal.mlkit_vision_face.zzh;
import com.google.android.gms.internal.mlkit_vision_face.zzj;
import com.google.android.gms.internal.mlkit_vision_face.zzks;
import com.google.android.gms.internal.mlkit_vision_face.zzkt;
import com.google.android.gms.internal.mlkit_vision_face.zzl;
import com.google.android.gms.internal.mlkit_vision_face.zzm;
import com.google.android.gms.internal.mlkit_vision_face.zzp;
import com.google.mlkit.common.MlKitException;
import com.yandex.go.address.models.Address;
import com.yandex.go.taxi.tariffs.internal.repository.k;
import defpackage.zfu0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.collections.a;

/* loaded from: classes11.dex */
public final class mdl0 implements ddl0, pdv, g891 {
    public int a;
    public boolean b;
    public final Object c;
    public final Object w;
    public final Object x;
    public Object y;
    public Object z;

    public mdl0(int i, cwb cwbVar, wiq0 wiq0Var, bdl0 bdl0Var, aah aahVar, boolean z) {
        this.a = i;
        this.c = cwbVar;
        this.w = wiq0Var;
        this.x = bdl0Var;
        this.y = aahVar;
        this.b = z;
        ArrayList arrayList = new ArrayList(agu0.a(i, ((dwb) cwbVar).a(), aahVar, z));
        this.z = arrayList;
        this.z = new ArrayList(e(arrayList));
    }

    @Override // defpackage.g891
    public Pair a(xzv xzvVar) {
        ArrayList arrayList;
        if (((zzj) this.y) == null && ((zzj) this.z) == null) {
            zzd();
        }
        zzj zzjVar = (zzj) this.y;
        if (zzjVar == null && ((zzj) this.z) == null) {
            throw new MlKitException("Waiting for the face detection module to be downloaded. Please wait.", 14);
        }
        ArrayList arrayList2 = null;
        if (zzjVar != null) {
            arrayList = f(zzjVar, xzvVar);
            ((r7p) this.w).getClass();
            j3a1.e(arrayList);
        } else {
            arrayList = null;
        }
        zzj zzjVar2 = (zzj) this.z;
        if (zzjVar2 != null) {
            arrayList2 = f(zzjVar2, xzvVar);
            j3a1.e(arrayList2);
        }
        return new Pair(arrayList, arrayList2);
    }

    @Override // defpackage.pdv
    public jdv acquireLatestImage() {
        e8v e8vVar;
        synchronized (this.c) {
            jdv acquireLatestImage = ((pdv) this.w).acquireLatestImage();
            if (acquireLatestImage != null) {
                this.a++;
                e8vVar = new e8v(acquireLatestImage);
                e8vVar.a((d8v) this.z);
            } else {
                e8vVar = null;
            }
        }
        return e8vVar;
    }

    public void b(int i, int i2) {
        int[] iArr = {i, i2};
        for (int i3 = 0; i3 < 2; i3++) {
            int i4 = iArr[i3];
            if (i4 < 0 || i4 >= ((ArrayList) this.z).size()) {
                return;
            }
        }
        ArrayList arrayList = new ArrayList((ArrayList) this.z);
        if (i < i2) {
            while (i < i2) {
                int i5 = i + 1;
                Collections.swap((ArrayList) this.z, i, i5);
                i = i5;
            }
        } else {
            int i6 = i2 + 1;
            if (i6 <= i) {
                while (true) {
                    Collections.swap((ArrayList) this.z, i, i - 1);
                    if (i == i6) {
                        break;
                    } else {
                        i--;
                    }
                }
            }
        }
        ((bdl0) this.x).onStopsUpdated(new ecl0(arrayList, (ArrayList) this.z), true);
    }

    public void c(int i) {
        zfu0 zfu0Var;
        int i2 = new int[]{i}[0];
        if (i2 >= 0 && i2 < ((ArrayList) this.z).size()) {
            ArrayList arrayList = new ArrayList((ArrayList) this.z);
            ((ArrayList) this.z).remove(i);
            if (!((ArrayList) this.z).isEmpty() && ((ArrayList) this.z).size() < this.a && ((zfu0Var = (zfu0) a.b0((ArrayList) this.z)) == null || !zfu0Var.c())) {
                ArrayList arrayList2 = (ArrayList) this.z;
                arrayList2.add(new zfu0.a());
                arrayList2.size();
            }
            ((bdl0) this.x).onStopsUpdated(new ecl0(arrayList, (ArrayList) this.z), false);
        }
        this.z = new ArrayList(e((ArrayList) this.z));
    }

    @Override // defpackage.pdv
    public void close() {
        synchronized (this.c) {
            try {
                Surface surface = (Surface) this.x;
                if (surface != null) {
                    surface.release();
                }
                ((pdv) this.w).close();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void d() {
        synchronized (this.c) {
            try {
                this.b = true;
                ((pdv) this.w).x();
                if (this.a == 0) {
                    close();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public ArrayList e(ArrayList arrayList) {
        String K;
        String f;
        pex0 m = ((k) ((wiq0) this.w)).m();
        boolean z = false;
        if (m != null && m.B0.a && ((dwb) ((cwb) this.c)).e()) {
            z = true;
        }
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            zfu0 zfu0Var = (zfu0) it.next();
            if (zfu0Var.d()) {
                arrayList2.add(new zfu0.b());
            } else if (zfu0Var.c()) {
                arrayList2.add(new zfu0.a());
            } else if (zfu0Var.e()) {
                arrayList2.add(new cgu0(zfu0Var.b(), zfu0Var.f()));
            } else {
                Address b = zfu0Var.b();
                if (z) {
                    K = q5z.x(b);
                    f = q5z.K(b);
                    if (K.equals(f)) {
                        f = zfu0Var.f();
                    }
                } else {
                    K = q5z.K(b);
                    f = zfu0Var.f();
                }
                arrayList2.add(new bgu0(zfu0Var.b(), zfu0Var.f(), K, f));
            }
        }
        return arrayList2;
    }

    public ArrayList f(zzj zzjVar, xzv xzvVar) {
        zzf[] zze;
        try {
            zzp zzpVar = new zzp(xzvVar.d, xzvVar.e, 0, SystemClock.elapsedRealtime(), qnc.a(xzvVar.f));
            if (xzvVar.g != 35 || this.a < 201500000) {
                zze = zzjVar.zze(ObjectWrapper.wrap(i4b1.a(xzvVar)), zzpVar);
            } else {
                Image.Plane[] a = xzvVar.a();
                cvw.l(a);
                zze = zzjVar.zzf(ObjectWrapper.wrap(a[0].getBuffer()), ObjectWrapper.wrap(a[1].getBuffer()), ObjectWrapper.wrap(a[2].getBuffer()), a[0].getPixelStride(), a[1].getPixelStride(), a[2].getPixelStride(), a[0].getRowStride(), a[1].getRowStride(), a[2].getRowStride(), zzpVar);
            }
            ArrayList arrayList = new ArrayList();
            for (zzf zzfVar : zze) {
                arrayList.add(new i7p(zzfVar, xzvVar.h));
            }
            return arrayList;
        } catch (RemoteException e) {
            throw new MlKitException(13, e, "Failed to detect with legacy face detector");
        }
    }

    @Override // defpackage.pdv
    public int getHeight() {
        int height;
        synchronized (this.c) {
            height = ((pdv) this.w).getHeight();
        }
        return height;
    }

    @Override // defpackage.pdv
    public Surface getSurface() {
        Surface surface;
        synchronized (this.c) {
            surface = ((pdv) this.w).getSurface();
        }
        return surface;
    }

    @Override // defpackage.pdv
    public int getWidth() {
        int width;
        synchronized (this.c) {
            width = ((pdv) this.w).getWidth();
        }
        return width;
    }

    @Override // defpackage.pdv
    public int h() {
        int h;
        synchronized (this.c) {
            h = ((pdv) this.w).h();
        }
        return h;
    }

    @Override // defpackage.pdv
    public int l() {
        int l;
        synchronized (this.c) {
            l = ((pdv) this.w).l();
        }
        return l;
    }

    @Override // defpackage.pdv
    public void u(odv odvVar, Executor executor) {
        synchronized (this.c) {
            ((pdv) this.w).u(new r3k0(5, this, odvVar), executor);
        }
    }

    @Override // defpackage.pdv
    public jdv w() {
        e8v e8vVar;
        synchronized (this.c) {
            jdv w = ((pdv) this.w).w();
            if (w != null) {
                this.a++;
                e8vVar = new e8v(w);
                e8vVar.a((d8v) this.z);
            } else {
                e8vVar = null;
            }
        }
        return e8vVar;
    }

    @Override // defpackage.pdv
    public void x() {
        synchronized (this.c) {
            ((pdv) this.w).x();
        }
    }

    @Override // defpackage.g891
    public void zzb() {
        zzj zzjVar = (zzj) this.y;
        if (zzjVar != null) {
            try {
                zzjVar.zzd();
            } catch (RemoteException e) {
                Log.e("LegacyFaceDelegate", "Failed to release legacy face detector.", e);
            }
            this.y = null;
        }
        zzj zzjVar2 = (zzj) this.z;
        if (zzjVar2 != null) {
            try {
                zzjVar2.zzd();
            } catch (RemoteException e2) {
                Log.e("LegacyFaceDelegate", "Failed to release legacy face detector.", e2);
            }
            this.z = null;
        }
    }

    @Override // defpackage.g891
    public boolean zzd() {
        Context context = (Context) this.c;
        r7p r7pVar = (r7p) this.w;
        boolean z = false;
        if (((zzj) this.y) != null || ((zzj) this.z) != null) {
            return false;
        }
        try {
            zzm zza = zzl.zza(gan.c(context, gan.b, "com.google.android.gms.vision.dynamite").b("com.google.android.gms.vision.face.ChimeraNativeFaceDetectorCreator"));
            IObjectWrapper wrap = ObjectWrapper.wrap(context);
            if (r7pVar.a == 2) {
                if (((zzj) this.z) == null) {
                    this.z = zza.zzd(wrap, new zzh(2, 2, 0, true, false, 0.1f));
                }
            } else if (((zzj) this.y) == null) {
                this.y = zza.zzd(wrap, new zzh(0, 0, 0, false, false, 0.1f));
            }
            if (((zzj) this.y) == null && ((zzj) this.z) == null && !this.b) {
                bg70.b(context, "barcode");
                this.b = true;
            }
            n nVar = (n) this.x;
            zzks zzksVar = zzks.NO_ERROR;
            AtomicReference atomicReference = aga1.a;
            nVar.b(new wvb1(z, zzksVar), zzkt.ON_DEVICE_FACE_LOAD);
            return false;
        } catch (RemoteException e) {
            throw new MlKitException(13, e, "Failed to create legacy face detector.");
        } catch (DynamiteModule$LoadingException e2) {
            throw new MlKitException(13, e2, "Failed to load deprecated vision dynamite module.");
        }
    }

    public mdl0(Context context, r7p r7pVar, n nVar) {
        this.c = context;
        this.w = r7pVar;
        b.b.getClass();
        this.a = b.a(context);
        this.x = nVar;
    }

    public mdl0(pdv pdvVar) {
        this.c = new Object();
        this.a = 0;
        this.b = false;
        this.z = new d8v(1, this);
        this.w = pdvVar;
        this.x = pdvVar.getSurface();
    }
}

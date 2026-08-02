package defpackage;

import android.content.Context;
import android.media.AudioManager;
import android.media.Spatializer;
import android.os.Handler;
import android.text.TextUtils;
import android.util.Pair;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.RandomAccess;
import org.webrtc.MediaStreamTrack;
import yads.af0;
import yads.px;
import yads.rn0;
import yads.t31;
import yads.wk2;

/* loaded from: classes7.dex */
public final class ba71 extends x671 {
    public static final f371 i = new px(new uw21(10));
    public static final f371 j = new px(new uw21(11));
    public final Object c;
    public final zr81 d;
    public final boolean e;
    public final zu81 f;
    public final kzo g;
    public ws71 h;

    public ba71(Context context) {
        Spatializer spatializer;
        kzo kzoVar;
        zr81 zr81Var = new zr81();
        int i2 = zu81.k0;
        zu81 zu81Var = new zu81(new hs81(context));
        this.c = new Object();
        if (context != null) {
            context.getApplicationContext();
        }
        this.d = zr81Var;
        this.f = zu81Var;
        this.h = ws71.z;
        boolean z = context != null && rf71.y(context);
        this.e = z;
        if (!z && context != null && rf71.a >= 32) {
            AudioManager audioManager = (AudioManager) context.getSystemService(MediaStreamTrack.AUDIO_TRACK_KIND);
            if (audioManager == null) {
                kzoVar = null;
            } else {
                spatializer = audioManager.getSpatializer();
                kzoVar = new kzo(spatializer);
            }
            this.g = kzoVar;
        }
        if (zu81Var.e0 && context == null) {
            nba1.e();
        }
    }

    public static int c(qd81 qd81Var, String str, boolean z) {
        if (!TextUtils.isEmpty(str) && str.equals(qd81Var.c)) {
            return 4;
        }
        String e = e(str);
        String e2 = e(qd81Var.c);
        if (e2 == null || e == null) {
            return (z && e2 == null) ? 1 : 0;
        }
        if (e2.startsWith(e) || e.startsWith(e2)) {
            return 3;
        }
        int i2 = rf71.a;
        return e2.split("-", 2)[0].equals(e.split("-", 2)[0]) ? 2 : 0;
    }

    public static Pair d(int i2, zp1 zp1Var, int[][][] iArr, m071 m071Var, Comparator comparator) {
        int i3;
        RandomAccess randomAccess;
        zp1 zp1Var2 = zp1Var;
        ArrayList arrayList = new ArrayList();
        int i4 = zp1Var2.a;
        int i5 = 0;
        while (i5 < i4) {
            if (i2 == ((int[]) zp1Var2.b)[i5]) {
                wx71 wx71Var = ((wx71[]) zp1Var2.c)[i5];
                for (int i6 = 0; i6 < wx71Var.a; i6++) {
                    tu71 a = wx71Var.a(i6);
                    int i7 = a.a;
                    wk2 a2 = m071Var.a(i5, a, iArr[i5][i6]);
                    boolean[] zArr = new boolean[i7];
                    int i8 = 0;
                    while (i8 < i7) {
                        t371 t371Var = (t371) a2.get(i8);
                        int a3 = t371Var.a();
                        if (zArr[i8] || a3 == 0) {
                            i3 = i4;
                        } else {
                            if (a3 == 1) {
                                randomAccess = t31.n(t371Var);
                            } else {
                                ArrayList arrayList2 = new ArrayList();
                                arrayList2.add(t371Var);
                                int i9 = i8 + 1;
                                while (i9 < i7) {
                                    t371 t371Var2 = (t371) a2.get(i9);
                                    int i10 = i4;
                                    if (t371Var2.a() == 2 && t371Var.b(t371Var2)) {
                                        arrayList2.add(t371Var2);
                                        zArr[i9] = true;
                                    }
                                    i9++;
                                    i4 = i10;
                                }
                                randomAccess = arrayList2;
                            }
                            i3 = i4;
                            arrayList.add(randomAccess);
                        }
                        i8++;
                        i4 = i3;
                    }
                }
            }
            i5++;
            zp1Var2 = zp1Var;
            i4 = i4;
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        List list = (List) Collections.max(arrayList, comparator);
        int[] iArr2 = new int[list.size()];
        for (int i11 = 0; i11 < list.size(); i11++) {
            iArr2[i11] = ((t371) list.get(i11)).c;
        }
        t371 t371Var3 = (t371) list.get(0);
        return Pair.create(new wg71(t371Var3.b, iArr2), Integer.valueOf(t371Var3.a));
    }

    public static String e(String str) {
        if (TextUtils.isEmpty(str) || TextUtils.equals(str, "und")) {
            return null;
        }
        return str;
    }

    public static void f(wx71 wx71Var, zu81 zu81Var, HashMap hashMap) {
        for (int i2 = 0; i2 < wx71Var.a; i2++) {
        }
    }

    public static boolean g(int i2, boolean z) {
        int i3 = i2 & 7;
        if (i3 != 4) {
            return z && i3 == 3;
        }
        return true;
    }

    @Override // defpackage.kr81
    public final void b() {
        kzo kzoVar;
        af0 af0Var;
        synchronized (this.c) {
            try {
                if (rf71.a >= 32 && (kzoVar = this.g) != null && (af0Var = (af0) kzoVar.x) != null && ((Handler) kzoVar.w) != null) {
                    ((Spatializer) kzoVar.c).removeOnSpatializerStateChangedListener(af0Var);
                    ((Handler) kzoVar.w).removeCallbacksAndMessages(null);
                    kzoVar.w = null;
                    kzoVar.x = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.a = null;
        this.b = null;
    }

    public final void h() {
        boolean z;
        rn0 rn0Var;
        kzo kzoVar;
        synchronized (this.c) {
            try {
                z = this.f.e0 && !this.e && rf71.a >= 32 && (kzoVar = this.g) != null && kzoVar.b;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (!z || (rn0Var = this.a) == null) {
            return;
        }
        rn0Var.i.a.sendEmptyMessage(10);
    }
}

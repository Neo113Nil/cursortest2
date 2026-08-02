package defpackage;

import android.content.Context;
import android.os.Build;
import java.util.ArrayList;

/* loaded from: classes8.dex */
public final class l0b0 implements k0b0 {
    public final Context a;

    public l0b0(Context context) {
        this.a = context;
    }

    @Override // defpackage.k0b0
    public final boolean a() {
        return sb2.i(this.a, "android.permission.ACCESS_COARSE_LOCATION") == 0;
    }

    @Override // defpackage.k0b0
    public final boolean b() {
        return g() && a();
    }

    @Override // defpackage.k0b0
    public final boolean c() {
        return sb2.i(this.a, "android.permission.CAMERA") == 0;
    }

    @Override // defpackage.k0b0
    public final ArrayList d(int[] iArr) {
        ArrayList arrayList = new ArrayList(iArr.length);
        for (int i : iArr) {
            arrayList.add(Boolean.valueOf(i == 0));
        }
        return arrayList;
    }

    @Override // defpackage.k0b0
    public final boolean e() {
        return b() && sb2.i(this.a, "android.permission.ACCESS_BACKGROUND_LOCATION") == 0;
    }

    @Override // defpackage.k0b0
    public final boolean f() {
        return !jx81.f() || sb2.i(this.a, "android.permission.POST_NOTIFICATIONS") == 0;
    }

    @Override // defpackage.k0b0
    public final boolean g() {
        return sb2.i(this.a, "android.permission.ACCESS_FINE_LOCATION") == 0;
    }

    @Override // defpackage.k0b0
    public final boolean h() {
        return !jx81.e() || sb2.i(this.a, "android.permission.BLUETOOTH_SCAN") == 0;
    }

    public final boolean i() {
        return Build.VERSION.SDK_INT < 34 || sb2.i(this.a, "android.permission.FOREGROUND_SERVICE_LOCATION") == 0;
    }
}

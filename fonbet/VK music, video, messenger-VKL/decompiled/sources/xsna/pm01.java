package xsna;

import android.content.Context;
import android.graphics.Bitmap;
import androidx.annotation.Nullable;
import com.vk.sharing.api.dto.GroupPickerInfo;
import com.vk.sharing.core.picker.PickingImpl;
import com.vk.writebar.WriteBar;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-cast-framework@@22.3.1 */
/* loaded from: classes12.dex */
public final class pm01 implements ttz0, i3g0, fjz0, com.google.android.gms.internal.measurement.zzr {
    public final Object b;

    public /* synthetic */ pm01(Object obj) {
        this.b = obj;
    }

    @Override // xsna.fjz0
    public void a() {
        h8z0.e(((xey0) this.b).a, "webviewShown", 2, null);
        gu8.c(null, "WebViewReachability: webview shown");
    }

    @Override // xsna.fjz0
    public void b() {
        h8z0.e(((xey0) this.b).a, "webviewClosed", 2, null);
        gu8.c(null, "WebViewReachability: webview closed");
    }

    @Override // xsna.fjz0
    public void c() {
        h8z0.e(((xey0) this.b).a, "pageLoadFailed", 2, null);
        gu8.c(null, "WebViewReachability: page load error");
    }

    @Override // xsna.fjz0
    public void d() {
        h8z0.e(((xey0) this.b).a, "pageLoaded", 2, null);
        gu8.c(null, "WebViewReachability: page loaded");
    }

    @Override // xsna.i3g0
    public void e() {
        ((m3g0) this.b).u0();
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.i3g0
    public void f() {
        m3g0 m3g0Var = (m3g0) this.b;
        b3g0 b3g0Var = m3g0Var.b;
        Context context = m3g0Var.c.getContext();
        if (context == null) {
            return;
        }
        PickingImpl.a a = ((bja0) m3g0Var.e.getValue()).a(context);
        GroupPickerInfo groupPickerInfo = a.b;
        groupPickerInfo.k = 1;
        groupPickerInfo.h = fkq0.e(b3g0Var.p());
        groupPickerInfo.g = m3g0Var.k;
        if (b3g0Var.f0()) {
            a.b.b = true;
        }
        if (b3g0Var.i0()) {
            groupPickerInfo.c = true;
        }
        b3g0Var.r1(a);
    }

    @Override // xsna.ttz0
    public void zza(@Nullable Bitmap bitmap) {
        ((hp01) this.b).c(3, bitmap);
    }

    @Override // com.google.android.gms.internal.measurement.zzr
    public void zza(int i, String str, List list, boolean z, boolean z2) {
        i901 i901Var;
        fb01 fb01Var = (fb01) this.b;
        int i2 = i - 1;
        if (i2 == 0) {
            k901 k901Var = ((mb01) fb01Var.b).j;
            mb01.k(k901Var);
            i901Var = k901Var.p;
        } else if (i2 != 1) {
            if (i2 == 3) {
                k901 k901Var2 = ((mb01) fb01Var.b).j;
                mb01.k(k901Var2);
                i901Var = k901Var2.q;
            } else if (i2 != 4) {
                k901 k901Var3 = ((mb01) fb01Var.b).j;
                mb01.k(k901Var3);
                i901Var = k901Var3.o;
            } else if (z) {
                k901 k901Var4 = ((mb01) fb01Var.b).j;
                mb01.k(k901Var4);
                i901Var = k901Var4.m;
            } else if (z2) {
                k901 k901Var5 = ((mb01) fb01Var.b).j;
                mb01.k(k901Var5);
                i901Var = k901Var5.l;
            } else {
                k901 k901Var6 = ((mb01) fb01Var.b).j;
                mb01.k(k901Var6);
                i901Var = k901Var6.n;
            }
        } else if (z) {
            k901 k901Var7 = ((mb01) fb01Var.b).j;
            mb01.k(k901Var7);
            i901Var = k901Var7.j;
        } else if (z2) {
            k901 k901Var8 = ((mb01) fb01Var.b).j;
            mb01.k(k901Var8);
            i901Var = k901Var8.i;
        } else {
            k901 k901Var9 = ((mb01) fb01Var.b).j;
            mb01.k(k901Var9);
            i901Var = k901Var9.k;
        }
        int size = list.size();
        if (size == 1) {
            i901Var.b(list.get(0), str);
            return;
        }
        if (size == 2) {
            i901Var.c(str, list.get(0), list.get(1));
        } else if (size != 3) {
            i901Var.a(str);
        } else {
            i901Var.d(str, list.get(0), list.get(1), list.get(2));
        }
    }

    @Override // xsna.i3g0
    public void a(int i) {
        WriteBar writeBar = ((m3g0) this.b).c.e;
        if (writeBar != null) {
            writeBar.getState().g = i;
            writeBar.p0();
        }
    }
}

package defpackage;

import android.graphics.Bitmap;
import android.os.Looper;
import java.util.ArrayList;
import java.util.HashMap;

/* loaded from: classes7.dex */
public final class gr71 {
    public Bitmap a;
    public final ku71 b;
    public final String c;
    public final /* synthetic */ z4m0 d;

    public gr71(z4m0 z4m0Var, Bitmap bitmap, String str, ku71 ku71Var) {
        this.d = z4m0Var;
        this.a = bitmap;
        this.c = str;
        this.b = ku71Var;
    }

    public final void a() {
        z4m0 z4m0Var = this.d;
        HashMap hashMap = (HashMap) z4m0Var.x;
        HashMap hashMap2 = (HashMap) z4m0Var.w;
        if (Looper.myLooper() != Looper.getMainLooper()) {
            ny61.r("Must be invoked from the main thread.");
            return;
        }
        if (this.b == null) {
            return;
        }
        String str = this.c;
        lo71 lo71Var = (lo71) hashMap2.get(str);
        if (lo71Var != null) {
            ArrayList arrayList = lo71Var.d;
            arrayList.remove(this);
            if (arrayList.size() == 0) {
                lo71Var.a.cancel();
                hashMap2.remove(str);
                return;
            }
            return;
        }
        lo71 lo71Var2 = (lo71) hashMap.get(str);
        if (lo71Var2 != null) {
            ArrayList arrayList2 = lo71Var2.d;
            arrayList2.remove(this);
            if (arrayList2.size() == 0) {
                lo71Var2.a.cancel();
            }
            if (arrayList2.size() == 0) {
                hashMap.remove(str);
            }
        }
    }
}

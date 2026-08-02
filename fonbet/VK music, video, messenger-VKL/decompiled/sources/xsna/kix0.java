package xsna;

import android.content.Context;
import com.vk.common.links.LaunchContext;
import com.vk.permission.PermissionHelper;
import java.util.ArrayList;
import xsna.dw20;

/* compiled from: WebViewBottomSheetWrapper.kt */
/* loaded from: classes2.dex */
public final class kix0 {
    public final Context a;
    public final String b;
    public final String c;
    public final a d = new a();
    public final bpn0 e = new bpn0(new fem0(this, 19));

    /* compiled from: WebViewBottomSheetWrapper.kt */
    public static final class a implements f98 {
        public a() {
        }

        @Override // xsna.f98
        public final void c(ArrayList arrayList, zx90 zx90Var, gwg gwgVar) {
            PermissionHelper.l(PermissionHelper.a, kix0.this.a, (String[]) arrayList.toArray(new String[0]), new m0t0(zx90Var, 8), new hfv0(gwgVar, 9), 4);
        }

        @Override // xsna.f98
        public final boolean d(String str) {
            if (!naz.A(str)) {
                return false;
            }
            maz.c(xwk.d().e(), kix0.this.a, str, LaunchContext.A, null, null, 24);
            return true;
        }

        @Override // xsna.f98
        public final void e(String str) {
            xwk.d().getBrowser().f(kix0.this.a, null, LaunchContext.A, str);
        }
    }

    public kix0(Context context, String str, String str2) {
        this.a = context;
        this.b = str;
        this.c = str2;
    }

    public final void a() {
        ejx0 ejx0Var = (ejx0) this.e.getValue();
        ejx0Var.f = ((dw20.b) ejx0Var.h.getValue()).I0(fpf0.a(ejx0.class).h());
    }
}

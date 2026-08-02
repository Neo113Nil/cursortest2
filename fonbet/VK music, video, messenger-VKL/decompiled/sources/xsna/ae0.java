package xsna;

import android.content.Context;
import android.util.TypedValue;
import java.util.ArrayList;

/* compiled from: AdChoicesBottomSheetRedesign.kt */
/* loaded from: classes14.dex */
public final class ae0 {
    public final a a;

    /* compiled from: AdChoicesBottomSheetRedesign.kt */
    public static final class a {
        public final Context a;
        public final ArrayList b;
        public final z0n c;
        public final com.vk.movika.sdk.base.observable.p d;
        public final defpackage.g e;

        public a(Context context, ArrayList arrayList, z0n z0nVar, com.vk.movika.sdk.base.observable.p pVar, defpackage.g gVar) {
            this.a = context;
            this.b = arrayList;
            this.c = z0nVar;
            this.d = pVar;
            this.e = gVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return epx.f(this.a, aVar.a) && this.b.equals(aVar.b) && epx.f(this.c, aVar.c) && this.d.equals(aVar.d) && this.e.equals(aVar.e);
        }

        public final int hashCode() {
            int a = qr.a(this.b, this.a.hashCode() * 31, 31);
            z0n z0nVar = this.c;
            return this.e.hashCode() + ((this.d.hashCode() + ((a + (z0nVar == null ? 0 : z0nVar.hashCode())) * 31)) * 31);
        }

        public final String toString() {
            return "AdChoicesBottomSheetParams(context=" + this.a + ", adChoices=" + this.b + ", disclaimerInfo=" + this.c + ", onAdChoiceClick=" + this.d + ", onDismiss=" + this.e + ')';
        }
    }

    public ae0(a aVar) {
        this.a = aVar;
    }

    public final void a(gzs<s3q0> gzsVar, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a M = aVar.M(650283663);
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(650283663, i, -1, "com.vk.ads.impl.adchoice.AdChoicesBottomSheetRedesign.Content (AdChoicesBottomSheetRedesign.kt:56)");
        }
        TypedValue typedValue = krv0.a;
        Boolean i2 = krv0.i(this.a.a);
        int i3 = 0;
        b(i2 != null ? i2.booleanValue() : false, kai.c(-1429308440, new wd0(i3, gzsVar, this), M), M, 48);
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new xd0(this, gzsVar, i, i3);
        }
    }

    public final void b(boolean z, jai jaiVar, androidx.compose.runtime.a aVar, int i) {
        int i2;
        androidx.compose.runtime.a M = aVar.M(-991671990);
        if ((i & 6) == 0) {
            i2 = (M.l(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.y(jaiVar) ? 32 : 16;
        }
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-991671990, i2, -1, "com.vk.ads.impl.adchoice.AdChoicesBottomSheetRedesign.VkThemeRedesign (AdChoicesBottomSheetRedesign.kt:82)");
            }
            M.K(-2114854610);
            rrv0.e(z, null, null, null, null, null, jaiVar, M, (i2 & 14) | ((i2 << 15) & 3670016), 62);
            M.j();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new yd0(i, 0, this, jaiVar, z);
        }
    }
}

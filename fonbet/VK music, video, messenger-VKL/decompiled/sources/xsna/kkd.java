package xsna;

import android.app.Activity;
import java.util.List;
import xsna.dh6;

/* compiled from: ClipsBottomSheetRedesign.kt */
/* loaded from: classes17.dex */
public final class kkd implements bkd {
    public final a a;

    /* compiled from: ClipsBottomSheetRedesign.kt */
    public static final class a {
        public final Activity a;
        public final List<yu20> b;
        public final r80 c;
        public final dh6.a d;

        public a(Activity activity, List list, r80 r80Var, gkd gkdVar) {
            this.a = activity;
            this.b = list;
            this.c = r80Var;
            this.d = gkdVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a.equals(aVar.a) && epx.f(this.b, aVar.b) && this.c.equals(aVar.c) && epx.f(this.d, aVar.d);
        }

        public final int hashCode() {
            int hashCode = (this.c.hashCode() + fw3.a(this.a.hashCode() * 31, 31, this.b)) * 31;
            dh6.a aVar = this.d;
            return hashCode + (aVar == null ? 0 : aVar.hashCode());
        }

        public final String toString() {
            return "ClipsBottomSheetParams(activity=" + this.a + ", actions=" + this.b + ", actionCallback=" + this.c + ", tracker=" + this.d + ')';
        }
    }

    public kkd(a aVar) {
        this.a = aVar;
    }

    public final void a(gzs<s3q0> gzsVar, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a M = aVar.M(-670680670);
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(-670680670, i, -1, "com.vk.clips.viewer.impl.feed.view.bottomsheet.redesign.ClipsBottomSheetRedesign.Content (ClipsBottomSheetRedesign.kt:49)");
        }
        b(6, M, kai.c(-68279896, new l6(4, gzsVar, this), M));
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new onb(this, gzsVar, i, 1);
        }
    }

    public final void b(int i, androidx.compose.runtime.a aVar, jai jaiVar) {
        jai jaiVar2;
        androidx.compose.runtime.a M = aVar.M(-1911196061);
        if (M.t(i & 1, (i & 3) != 2)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1911196061, i, -1, "com.vk.clips.viewer.impl.feed.view.bottomsheet.redesign.ClipsBottomSheetRedesign.VkThemeRedesign (ClipsBottomSheetRedesign.kt:71)");
            }
            M.K(1939832398);
            jaiVar2 = jaiVar;
            rrv0.d(null, null, null, null, jaiVar2, M, 24576, 15);
            M.j();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            jaiVar2 = jaiVar;
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new jkd(this, jaiVar2, i, 0);
        }
    }

    @Override // xsna.bkd
    public final void dismiss() {
    }
}

package xsna;

import androidx.fragment.app.FragmentActivity;

/* compiled from: VideoProfileMoreBottomSheetRedesign.kt */
/* loaded from: classes6.dex */
public final class m8t0 {
    public final a a;
    public final wh50<Boolean> b = androidx.compose.runtime.k.b(Boolean.FALSE);

    /* compiled from: VideoProfileMoreBottomSheetRedesign.kt */
    public static final class a {
        public final FragmentActivity a;
        public final defpackage.e b;
        public final defpackage.f c;
        public final z4f d;
        public final boolean e;

        public a(FragmentActivity fragmentActivity, defpackage.e eVar, defpackage.f fVar, z4f z4fVar, boolean z) {
            this.a = fragmentActivity;
            this.b = eVar;
            this.c = fVar;
            this.d = z4fVar;
            this.e = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a.equals(aVar.a) && this.b.equals(aVar.b) && this.c.equals(aVar.c) && this.d.equals(aVar.d) && this.e == aVar.e;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.e) + ((this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31)) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("VideoProfileMoreBottomSheetParams(activity=");
            sb.append(this.a);
            sb.append(", onShareClicked=");
            sb.append(this.b);
            sb.append(", onReportClicked=");
            sb.append(this.c);
            sb.append(", onDismiss=");
            sb.append(this.d);
            sb.append(", isSearchEnabled=");
            return defpackage.q0.a(sb, this.e, ')');
        }
    }

    public m8t0(a aVar) {
        this.a = aVar;
    }

    public final void a(gzs<s3q0> gzsVar, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a M = aVar.M(1280926438);
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(1280926438, i, -1, "com.vk.video.profile.presentation.menu.VideoProfileMoreBottomSheetRedesign.Content (VideoProfileMoreBottomSheetRedesign.kt:56)");
        }
        b(6, M, kai.c(1868533408, new iq8(11, gzsVar, this), M));
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new rv7(this, gzsVar, i, 13);
        }
    }

    public final void b(int i, androidx.compose.runtime.a aVar, jai jaiVar) {
        jai jaiVar2;
        androidx.compose.runtime.a M = aVar.M(-1278806331);
        if (M.t(i & 1, (i & 3) != 2)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1278806331, i, -1, "com.vk.video.profile.presentation.menu.VideoProfileMoreBottomSheetRedesign.VkThemeRedesign (VideoProfileMoreBottomSheetRedesign.kt:91)");
            }
            M.K(-559248724);
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
            s.d = new xs8(this, jaiVar2, i, 10);
        }
    }
}

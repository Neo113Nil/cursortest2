package xsna;

import com.vk.video.ui.upload.impl.attachedclips.presentation.feature.entity.ClipAlreadyAttachedDialogState;
import java.util.ArrayList;

/* compiled from: ScreenViewState.kt */
/* loaded from: classes7.dex */
public interface idh0 extends lm50 {

    /* compiled from: ScreenViewState.kt */
    public static final class a implements idh0 {
        public final ArrayList b;
        public final boolean c;
        public final int d;
        public final boolean e;
        public final ClipAlreadyAttachedDialogState f;
        public final boolean g;
        public final boolean h;
        public final boolean i;
        public final e9k0 j;

        public a(ArrayList arrayList, boolean z, int i, boolean z2, ClipAlreadyAttachedDialogState clipAlreadyAttachedDialogState, boolean z3, boolean z4, boolean z5, e9k0 e9k0Var) {
            this.b = arrayList;
            this.c = z;
            this.d = i;
            this.e = z2;
            this.f = clipAlreadyAttachedDialogState;
            this.g = z3;
            this.h = z4;
            this.i = z5;
            this.j = e9k0Var;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.b.equals(aVar.b) && this.c == aVar.c && this.d == aVar.d && this.e == aVar.e && epx.f(this.f, aVar.f) && this.g == aVar.g && this.h == aVar.h && this.i == aVar.i && epx.f(this.j, aVar.j);
        }

        public final int hashCode() {
            int b = qoy.b(shy.a(this.d, qoy.b(this.b.hashCode() * 31, 31, this.c), 31), 31, this.e);
            ClipAlreadyAttachedDialogState clipAlreadyAttachedDialogState = this.f;
            int b2 = qoy.b(qoy.b(qoy.b((b + (clipAlreadyAttachedDialogState == null ? 0 : clipAlreadyAttachedDialogState.b.hashCode())) * 31, 31, this.g), 31, this.h), 31, this.i);
            e9k0 e9k0Var = this.j;
            return b2 + (e9k0Var != null ? e9k0Var.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Loaded(clips=");
            kr.d(this.b, sb, ", isClipsPaginationFinished=");
            sb.append(this.c);
            sb.append(", selectedClipsCount=");
            sb.append(this.d);
            sb.append(", isButtonAttachEnabled=");
            sb.append(this.e);
            sb.append(", clipAlreadyAttachedDialogState=");
            sb.append(this.f);
            sb.append(", isClipHasCoauthorsDialogVisible=");
            sb.append(this.g);
            sb.append(", isExitConfirmDialogVisible=");
            sb.append(this.h);
            sb.append(", isSpinnerVisible=");
            sb.append(this.i);
            sb.append(", snackbar=");
            sb.append(this.j);
            sb.append(')');
            return sb.toString();
        }
    }

    /* compiled from: ScreenViewState.kt */
    public static final class b implements idh0 {
        public static final b b = new b();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return -1124997935;
        }

        public final String toString() {
            return "Loading";
        }
    }
}

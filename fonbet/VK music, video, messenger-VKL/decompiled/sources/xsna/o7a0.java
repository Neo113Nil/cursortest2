package xsna;

import androidx.recyclerview.widget.m;
import com.vk.dto.photo.Photo;

/* compiled from: PhotoFlowAdapter.kt */
/* loaded from: classes4.dex */
public final class o7a0 {
    public static final a a = new a();

    /* compiled from: PhotoFlowAdapter.kt */
    public static final class a extends m.e<y7a0> {
        @Override // androidx.recyclerview.widget.m.e
        public final boolean areContentsTheSame(y7a0 y7a0Var, y7a0 y7a0Var2) {
            y7a0 y7a0Var3 = y7a0Var;
            y7a0 y7a0Var4 = y7a0Var2;
            return epx.f(y7a0Var3.b, y7a0Var4.b) && y7a0Var3.c == y7a0Var4.c && y7a0Var3.a.d == y7a0Var4.a.d && y7a0Var3.d == y7a0Var4.d;
        }

        @Override // androidx.recyclerview.widget.m.e
        public final boolean areItemsTheSame(y7a0 y7a0Var, y7a0 y7a0Var2) {
            Photo photo = y7a0Var.a;
            int i = photo.c;
            Photo photo2 = y7a0Var2.a;
            return i == photo2.c && epx.f(photo.e, photo2.e);
        }

        @Override // androidx.recyclerview.widget.m.e
        public final Object getChangePayload(y7a0 y7a0Var, y7a0 y7a0Var2) {
            return y7a0Var.d != y7a0Var2.d ? jdg0.a : new Object();
        }
    }
}

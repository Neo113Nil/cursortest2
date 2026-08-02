package xsna;

import androidx.recyclerview.widget.m;
import com.vk.dto.photo.PhotoAlbum;
import xsna.q8a0;

/* compiled from: PhotoFlowSettingsAdapter.kt */
/* loaded from: classes4.dex */
public final class k8a0 {
    public static final a a = new a();

    /* compiled from: PhotoFlowSettingsAdapter.kt */
    public static final class a extends m.e<q8a0> {
        @Override // androidx.recyclerview.widget.m.e
        public final boolean areContentsTheSame(q8a0 q8a0Var, q8a0 q8a0Var2) {
            q8a0 q8a0Var3 = q8a0Var;
            q8a0 q8a0Var4 = q8a0Var2;
            if (!(q8a0Var3 instanceof q8a0.a) || !(q8a0Var4 instanceof q8a0.a)) {
                return false;
            }
            q8a0.a aVar = (q8a0.a) q8a0Var3;
            q8a0.a aVar2 = (q8a0.a) q8a0Var4;
            if (aVar.b() != aVar2.b()) {
                return false;
            }
            PhotoAlbum a = aVar.a();
            PhotoAlbum a2 = aVar2.a();
            return epx.f(a.k, a2.k) && a.f == a2.f && epx.f(a.g, a2.g);
        }

        @Override // androidx.recyclerview.widget.m.e
        public final boolean areItemsTheSame(q8a0 q8a0Var, q8a0 q8a0Var2) {
            q8a0 q8a0Var3 = q8a0Var;
            q8a0 q8a0Var4 = q8a0Var2;
            if ((q8a0Var3 instanceof q8a0.b.c) && (q8a0Var4 instanceof q8a0.b.c)) {
                return true;
            }
            if ((q8a0Var3 instanceof q8a0.b.C3554b) && (q8a0Var4 instanceof q8a0.b.C3554b)) {
                return true;
            }
            if ((q8a0Var3 instanceof q8a0.b.a) && (q8a0Var4 instanceof q8a0.b.a)) {
                return true;
            }
            if (!(q8a0Var3 instanceof q8a0.a) || !(q8a0Var4 instanceof q8a0.a)) {
                return false;
            }
            PhotoAlbum a = ((q8a0.a) q8a0Var3).a();
            PhotoAlbum a2 = ((q8a0.a) q8a0Var4).a();
            return a.b == a2.b && epx.f(a.c, a2.c);
        }

        @Override // androidx.recyclerview.widget.m.e
        public final Object getChangePayload(q8a0 q8a0Var, q8a0 q8a0Var2) {
            q8a0 q8a0Var3 = q8a0Var;
            q8a0 q8a0Var4 = q8a0Var2;
            if ((q8a0Var3 instanceof q8a0.a) && (q8a0Var4 instanceof q8a0.a)) {
                q8a0.a aVar = (q8a0.a) q8a0Var3;
                q8a0.a aVar2 = (q8a0.a) q8a0Var4;
                if (aVar.a().m != aVar2.a().m) {
                    return zq70.d;
                }
                if (aVar.b() != aVar2.b()) {
                    return q7o.b;
                }
            }
            return s3q0.a;
        }
    }
}

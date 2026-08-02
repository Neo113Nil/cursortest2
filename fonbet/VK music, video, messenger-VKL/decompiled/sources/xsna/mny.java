package xsna;

import android.graphics.Bitmap;
import com.vk.media.MediaUtils;
import java.util.List;
import kotlin.Triple;

/* compiled from: LayersProvider.kt */
/* loaded from: classes3.dex */
public interface mny {
    public static final a a = a.a;

    /* compiled from: LayersProvider.kt */
    public static final class a {
        public static final /* synthetic */ a a = new a();
        public static final int b = iah0.v() / 4;
    }

    static /* synthetic */ Triple d(mny mnyVar, tam0 tam0Var, boolean z, MediaUtils.d dVar, boolean z2, boolean z3, int i) {
        if ((i & 8) != 0) {
            z2 = false;
        }
        if ((i & 16) != 0) {
            z3 = false;
        }
        return mnyVar.a(tam0Var, z, dVar, z2, z3);
    }

    Triple<List<uq10>, MediaUtils.d, Float> a(tam0 tam0Var, boolean z, MediaUtils.d dVar, boolean z2, boolean z3);

    yo9 b(tam0 tam0Var, MediaUtils.d dVar);

    int c();

    Bitmap e(tam0 tam0Var, Bitmap bitmap, StringBuilder sb);

    Bitmap f(tam0 tam0Var, float f, StringBuilder sb);

    Triple<List<uq10>, MediaUtils.d, Float> g(tam0 tam0Var, MediaUtils.d dVar, boolean z);
}

package xsna;

import android.content.Context;
import com.facebook.imagepipeline.core.DownsampleMode;

/* compiled from: ImagePipelineExperiments.kt */
/* loaded from: classes.dex */
public final class vkw {
    public final int a;
    public final boolean b;
    public final c c;
    public final cin0 d;
    public final jw5 e;

    /* compiled from: ImagePipelineExperiments.kt */
    public static final class a {
        public int a;
        public boolean b;
        public rdv0 c;
        public cin0 d;
        public jw5 e;
    }

    /* compiled from: ImagePipelineExperiments.kt */
    /* loaded from: classes12.dex */
    public static final class b implements c {
        @Override // xsna.vkw.c
        public final xhd0 a(Context context, ut8 ut8Var, niw niwVar, z3e0 z3e0Var, DownsampleMode downsampleMode, boolean z, r3q r3qVar, b320 b320Var, r8x r8xVar, r8x r8xVar2, yhn0 yhn0Var, ecl eclVar, hta0 hta0Var, int i, vvf vvfVar) {
            return new xhd0(context, ut8Var, niwVar, z3e0Var, downsampleMode, z, r3qVar, b320Var, r8xVar, r8xVar2, yhn0Var, eclVar, hta0Var, i, vvfVar);
        }
    }

    /* compiled from: ImagePipelineExperiments.kt */
    public interface c {
        xhd0 a(Context context, ut8 ut8Var, niw niwVar, z3e0 z3e0Var, DownsampleMode downsampleMode, boolean z, r3q r3qVar, b320 b320Var, r8x r8xVar, r8x r8xVar2, yhn0 yhn0Var, ecl eclVar, hta0 hta0Var, int i, vvf vvfVar);
    }

    public vkw(a aVar) {
        aVar.getClass();
        this.a = aVar.a;
        this.b = aVar.b;
        c cVar = aVar.c;
        this.c = cVar == null ? new b() : cVar;
        this.d = aVar.d;
        this.e = aVar.e;
    }
}

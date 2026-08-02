package xsna;

import android.content.Context;
import com.vk.dto.common.VideoFile;
import xsna.hq80;
import xsna.t270;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class a0t0 implements izs {
    public final /* synthetic */ c0t0 b;
    public final /* synthetic */ ths0 c;
    public final /* synthetic */ hq80.a d;
    public final /* synthetic */ z2d0 e;
    public final /* synthetic */ Context f;
    public final /* synthetic */ boolean g;

    public /* synthetic */ a0t0(c0t0 c0t0Var, ths0 ths0Var, hq80.a aVar, z2d0 z2d0Var, Context context, boolean z) {
        this.b = c0t0Var;
        this.c = ths0Var;
        this.d = aVar;
        this.e = z2d0Var;
        this.f = context;
        this.g = z;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        ths0 ths0Var = this.c;
        VideoFile videoFile = ths0Var.a;
        if (((Boolean) obj).booleanValue()) {
            hq80.a aVar = this.d;
            gzs<s3q0> gzsVar = aVar.d;
            c0t0 c0t0Var = this.b;
            c0t0Var.O(videoFile, gzsVar);
            c0t0Var.g.c(Long.valueOf(videoFile.o0()), Long.valueOf(videoFile.I0().b), videoFile.r(), ths0Var.b, aVar.a);
            this.e.invoke();
        } else {
            new t270.a(this.f, this.g).I0("no_memory");
        }
        return s3q0.a;
    }
}

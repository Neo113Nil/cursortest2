package xsna;

import com.vk.core.compose.component.defaults.PictureRadius;
import java.util.List;

/* compiled from: VkResizablePicture.kt */
/* loaded from: classes17.dex */
public final class fgv0 implements wzs<ztm0, o6j, dp10> {
    public final /* synthetic */ efj b;
    public final /* synthetic */ List c;
    public final /* synthetic */ PictureRadius d;
    public final /* synthetic */ jai e;

    public fgv0(efj efjVar, List list, PictureRadius pictureRadius, jai jaiVar) {
        this.b = efjVar;
        this.c = list;
        this.d = pictureRadius;
        this.e = jaiVar;
    }

    @Override // xsna.wzs
    public final dp10 invoke(ztm0 ztm0Var, o6j o6jVar) {
        ztm0 ztm0Var2 = ztm0Var;
        long j = o6jVar.a;
        int k = o6j.k(j);
        int i = o6j.i(j);
        if (i != Integer.MAX_VALUE) {
            k = i;
        }
        float j1 = ztm0Var2.j1(k);
        int j2 = o6j.j(j);
        int h = o6j.h(j);
        if (h != Integer.MAX_VALUE) {
            j2 = h;
        }
        float j12 = ztm0Var2.j1(j2);
        tra0 N = ztm0Var2.t1(s3q0.a, new jai(-1790324248, new dgv0(j1, j12, this.b, this.c, this.d, this.e), true)).get(0).N(j);
        return ztm0Var2.Q(N.b, N.c, jgp.b, new egv0(N));
    }
}

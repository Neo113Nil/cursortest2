package xsna;

import com.vk.clips.viewer.impl.adapters.VideoFileAdapter;
import com.vk.dto.common.VideoFile;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import xsna.nlh0;
import xsna.olh0;
import xsna.v1t0;
import xsna.yks0;

/* compiled from: VideoFileControllerAdapter.kt */
/* loaded from: classes17.dex */
public final class bgx implements yks0.a {
    public final nlh0.a b;

    public bgx(nlh0.a aVar) {
        this.b = aVar;
    }

    @Override // xsna.yks0.a
    public final void He(List list, VideoFile videoFile) {
        Object gVar;
        VideoFileAdapter B = k15.B(videoFile);
        List<v1t0> list2 = list;
        ArrayList arrayList = new ArrayList(c5g.u(list2, 10));
        for (v1t0 v1t0Var : list2) {
            if (v1t0Var instanceof v1t0.a) {
                gVar = new olh0.a(((v1t0.a) v1t0Var).a);
            } else if (v1t0Var instanceof v1t0.b) {
                gVar = new olh0.b(((v1t0.b) v1t0Var).a);
            } else if (v1t0Var instanceof v1t0.c) {
                gVar = new olh0.c(((v1t0.c) v1t0Var).a);
            } else if (v1t0Var instanceof v1t0.d) {
                gVar = new olh0.d(((v1t0.d) v1t0Var).a);
            } else if (v1t0Var instanceof v1t0.e) {
                gVar = new olh0.e(((v1t0.e) v1t0Var).a);
            } else if (v1t0Var instanceof v1t0.f) {
                gVar = new olh0.f(((v1t0.f) v1t0Var).a);
            } else {
                if (!(v1t0Var instanceof v1t0.g)) {
                    throw new NoWhenBranchMatchedException();
                }
                gVar = new olh0.g(((v1t0.g) v1t0Var).a);
            }
            arrayList.add(gVar);
        }
        this.b.A1(B, arrayList);
    }

    @Override // xsna.yks0.a
    public final void L9(VideoFile videoFile, boolean z) {
        k15.B(videoFile);
        this.b.L2(z);
    }

    public final boolean equals(Object obj) {
        boolean z = obj instanceof bgx;
        nlh0.a aVar = this.b;
        return z ? epx.f(aVar, ((bgx) obj).b) : epx.f(aVar, obj);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    @Override // xsna.yks0.a
    public final void dismiss() {
    }

    @Override // xsna.yks0.a
    public final void uf(boolean z) {
    }

    @Override // xsna.yks0.a
    public final void vk(boolean z) {
    }
}

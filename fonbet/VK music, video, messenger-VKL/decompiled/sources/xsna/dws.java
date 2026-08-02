package xsna;

import com.vk.dto.common.VideoFile;
import kotlin.collections.EmptyList;
import xsna.b6l0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes15.dex */
public final /* synthetic */ class dws implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Object d;

    public /* synthetic */ dws(Object obj, boolean z, int i) {
        this.b = i;
        this.d = obj;
        this.c = z;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        int i = this.b;
        boolean z = this.c;
        Object obj2 = this.d;
        switch (i) {
            case 0:
                fws fwsVar = (fws) obj2;
                gws gwsVar = fwsVar.a;
                gwsVar.d = (b6l0.a) obj;
                gwsVar.c = EmptyList.b;
                io.reactivex.rxjava3.subjects.f<s3q0> fVar = fwsVar.n;
                s3q0 s3q0Var = s3q0.a;
                fVar.onNext(s3q0Var);
                if (!z) {
                    fwsVar.a();
                    break;
                }
                break;
            case 1:
                VideoFile videoFile = (VideoFile) obj2;
                videoFile.p5(Boolean.valueOf(z));
                wjs0.a(new fyr0(videoFile));
                break;
            default:
                oz50 oz50Var = (oz50) obj;
                m820 m820Var = m820.b;
                m820.e((ww50) obj2, oz50Var.j().b, oz50Var.j().c, z);
                break;
        }
        return s3q0.a;
    }
}

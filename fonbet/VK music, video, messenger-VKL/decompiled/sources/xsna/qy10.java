package xsna;

import androidx.media3.exoplayer.source.j;
import java.io.IOException;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes12.dex */
public final /* synthetic */ class qy10 implements j7j {
    public final /* synthetic */ j.a b;
    public final /* synthetic */ bpz c;
    public final /* synthetic */ pr10 d;
    public final /* synthetic */ IOException e;
    public final /* synthetic */ boolean f;

    public /* synthetic */ qy10(j.a aVar, bpz bpzVar, pr10 pr10Var, IOException iOException, boolean z) {
        this.b = aVar;
        this.c = bpzVar;
        this.d = pr10Var;
        this.e = iOException;
        this.f = z;
    }

    @Override // xsna.j7j
    public final void accept(Object obj) {
        androidx.media3.exoplayer.source.j jVar = (androidx.media3.exoplayer.source.j) obj;
        j.a aVar = this.b;
        jVar.A(aVar.a, aVar.b, this.c, this.d, this.e, this.f);
    }
}

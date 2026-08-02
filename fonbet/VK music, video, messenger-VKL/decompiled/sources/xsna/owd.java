package xsna;

import com.vk.clips.editor.aspectratio.impl.FormatAspectRatio;
import java.util.Collections;
import kotlin.collections.EmptyList;
import xsna.luc;
import xsna.wzd;
import xsna.x8d;

/* compiled from: ClipsEditorAspectRatioDelegateImpl.kt */
/* loaded from: classes16.dex */
public final class owd implements nwd, x8d.a {
    public final x8d a;
    public final rzd b;
    public rwd c;

    public owd(c9d c9dVar, rzd rzdVar) {
        this.a = c9dVar;
        this.b = rzdVar;
    }

    @Override // xsna.x8d.a
    public final void c(long j) {
        rwd rwdVar = this.c;
        if (rwdVar == null) {
            rwdVar = null;
        }
        rwdVar.c().a(j / this.b.getState().e(), false);
    }

    @Override // xsna.nwd
    public final void k() {
        rzd rzdVar = this.b;
        pwd pwdVar = rzdVar.getState().g;
        rzdVar.c(com.vk.clips.editor.state.model.a.c(rzdVar.getState(), null, null, null, null, null, pwdVar, 63), Collections.singletonList(new wzd.a(true, (luc) luc.a.a)));
    }

    @Override // xsna.nwd
    public final void l(float f) {
        long e = this.b.getState().e();
        this.a.seekTo(Math.min((long) (e * f), e));
    }

    @Override // xsna.nwd
    public final void m() {
        x8d x8dVar = this.a;
        x8dVar.d(true);
        c(x8dVar.n());
        x8dVar.k(this);
    }

    @Override // xsna.nwd
    public final void n() {
        x8d x8dVar = this.a;
        x8dVar.b(true);
        x8dVar.d(true);
    }

    @Override // xsna.nwd
    public final void onClosed() {
        this.a.h(this);
    }

    @Override // xsna.nwd
    public final void p() {
        this.a.b(false);
    }

    @Override // xsna.nwd
    public final float q() {
        return this.b.getState().g.b;
    }

    @Override // xsna.nwd
    public final void r(rwd rwdVar) {
        this.c = rwdVar;
    }

    @Override // xsna.nwd
    public final void s(FormatAspectRatio formatAspectRatio) {
        this.a.d(true);
        FormatAspectRatio formatAspectRatio2 = FormatAspectRatio.ORIGINAL;
        rzd rzdVar = this.b;
        rzdVar.c(com.vk.clips.editor.state.model.a.c(rzdVar.getState(), null, null, null, null, null, formatAspectRatio == formatAspectRatio2 ? new pwd(rzdVar.getState().g.a, rzdVar.getState().g.a) : new pwd(rzdVar.getState().g.a, formatAspectRatio.getWidth() / formatAspectRatio.getHeight()), 63), EmptyList.b);
    }
}

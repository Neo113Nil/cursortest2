package one.video.controls.view.seekbar;

import one.video.controls.view.seekbar.CompositeSeekBarView;
import one.video.controls.view.seekbar.OneVideoSeekBarView;
import xsna.jn80;
import xsna.wn80;

/* compiled from: Binder.kt */
/* loaded from: classes8.dex */
public final class a implements CompositeSeekBarView.a {
    public final /* synthetic */ OneVideoSeekBarView.b a;
    public final /* synthetic */ OneVideoSeekBarView.b b;
    public final /* synthetic */ b c;

    public a(OneVideoSeekBarView.b bVar, b bVar2) {
        this.b = bVar;
        this.c = bVar2;
        this.a = bVar;
    }

    @Override // one.video.controls.view.seekbar.CompositeSeekBarView.a
    public final void b() {
        this.a.b();
    }

    @Override // one.video.controls.view.seekbar.CompositeSeekBarView.a
    public final void c(long j, boolean z) {
        this.b.c(j, z);
        b bVar = this.c;
        jn80 jn80Var = bVar.e;
        if (jn80Var != null) {
            CompositeSeekBarView compositeSeekBarView = jn80Var.d;
            int i = wn80.a;
            jn80Var.c.b((int) ((j - compositeSeekBarView.getMax()) / 1000));
            boolean z2 = wn80.d ? bVar.g : j == ((long) compositeSeekBarView.getMax());
            jn80Var.b.setActivated(z2);
            compositeSeekBarView.setActivated(z2);
        }
    }

    @Override // one.video.controls.view.seekbar.CompositeSeekBarView.a
    public final void d() {
        this.a.d();
    }
}

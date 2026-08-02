package xsna;

import android.view.View;

/* compiled from: View.kt */
/* loaded from: classes16.dex */
public final class d9d implements View.OnLayoutChangeListener {
    public final /* synthetic */ c9d b;
    public final /* synthetic */ com.vk.clips.editor.state.model.a c;

    public d9d(c9d c9dVar, com.vk.clips.editor.state.model.a aVar) {
        this.b = c9dVar;
        this.c = aVar;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        view.removeOnLayoutChangeListener(this);
        c9d c9dVar = this.b;
        c9d.a(c9dVar, this.c, Long.valueOf(c9dVar.n()), !this.b.k, this.b.c.getWidth(), this.b.c.getHeight());
    }
}

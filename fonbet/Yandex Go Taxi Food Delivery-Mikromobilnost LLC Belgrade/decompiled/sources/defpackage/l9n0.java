package defpackage;

import android.graphics.drawable.Drawable;
import ru.yandex.taxi.scooters.presentation.ontheway.completion.photo.camera_ui.photo_result.b;

/* loaded from: classes6.dex */
public final class l9n0 implements pib0 {
    public final /* synthetic */ b a;

    public l9n0(b bVar) {
        this.a = bVar;
    }

    @Override // defpackage.pib0
    public final void A8() {
        b bVar = this.a;
        bVar.j().f.setEnabled(false);
        bVar.j().c.setEnabled(false);
        bVar.j().c.startProgress();
    }

    @Override // defpackage.pib0
    public final void B() {
        b bVar = this.a;
        bVar.j().e.setVisibility(8);
        bVar.j().d.setVisibility(0);
    }

    @Override // defpackage.pib0
    public final void N(Drawable drawable) {
        b bVar = this.a;
        bVar.j().g.setImageDrawable(drawable);
        cma1.b(1.0f, bVar.j().g);
    }

    @Override // defpackage.pib0
    public final void W7() {
        b bVar = this.a;
        bVar.j().f.setEnabled(true);
        bVar.j().c.setEnabled(true);
        bVar.j().c.finishProgress();
    }
}

package defpackage;

import android.view.View;
import ru.yandex.taxi.settings.main.j;

/* loaded from: classes6.dex */
public final class m350 implements acm {
    public final /* synthetic */ j a;

    public m350(j jVar) {
        this.a = jVar;
    }

    @Override // defpackage.acm
    public final void a(View view) {
        j jVar = this.a;
        ((i700) jVar.k.getValue()).ah();
        jVar.a.removeDrawerListener(this);
    }

    @Override // defpackage.acm
    public final void b(View view) {
    }

    @Override // defpackage.acm
    public final void c(float f, View view) {
    }
}

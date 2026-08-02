package defpackage;

import android.view.View;
import androidx.drawerlayout.widget.DrawerLayout;
import ru.yandex.taxi.settings.main.j;
import ru.yandex.taxi.viewholder.b;

/* loaded from: classes10.dex */
public final class n350 extends DrawerLayout.a {
    public final rms a = new rms(5);
    public final /* synthetic */ b b;
    public final /* synthetic */ j c;

    public n350(b bVar, j jVar) {
        this.b = bVar;
        this.c = jVar;
    }

    @Override // androidx.drawerlayout.widget.DrawerLayout.a, defpackage.acm
    public final void a(View view) {
        this.b.a(this.a);
        j jVar = this.c;
        if (jVar.n) {
            jVar.e.i("menu", false);
        }
        jVar.n = true;
    }

    @Override // androidx.drawerlayout.widget.DrawerLayout.a, defpackage.acm
    public final void b(View view) {
        j jVar = this.c;
        jVar.a.setDrawerLockMode(1);
        ((i700) jVar.k.getValue()).Zg();
        this.b.f(this.a);
        if (jVar.n) {
            jVar.e.d("menu");
        }
        jVar.n = true;
    }

    @Override // androidx.drawerlayout.widget.DrawerLayout.a, defpackage.acm
    public final void c(float f, View view) {
        j jVar = this.c;
        jVar.l = f;
        if (f == 1.0f) {
            jVar.a.setDrawerLockMode(0);
            jVar.m = false;
        }
    }
}

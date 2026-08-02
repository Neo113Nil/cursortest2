package defpackage;

import ru.yandex.taxi.design.ListItemComponent;
import ru.yandex.taxi.theme.ThemeType;

/* loaded from: classes6.dex */
public abstract class l1c extends lys {
    public final u1c S;
    public k1c T;

    public l1c(ListItemComponent listItemComponent, tls tlsVar) {
        super(listItemComponent);
        this.S = new u1c(listItemComponent, tlsVar);
    }

    @Override // defpackage.wys
    public final void Y() {
        super.Y();
        this.T = null;
    }

    @Override // defpackage.xwy0, defpackage.nwy0
    public final void applyTheme(ThemeType themeType) {
        super.applyTheme(themeType);
        k1c k1cVar = this.T;
        if (k1cVar != null) {
            this.T = k1cVar;
            c0(k1cVar);
            d0(k1cVar);
            e0(k1cVar);
        }
    }

    @Override // defpackage.wys
    public final void c(Object obj) {
        k1c k1cVar = (k1c) obj;
        this.T = k1cVar;
        c0(k1cVar);
        d0(k1cVar);
        e0(k1cVar);
    }

    public abstract void c0(k1c k1cVar);

    public void d0(k1c k1cVar) {
    }

    public void e0(k1c k1cVar) {
        boolean isChecked = k1cVar.isChecked();
        u1c u1cVar = this.S;
        if (isChecked) {
            u1cVar.a(k1cVar, k1cVar.c());
        } else {
            u1cVar.b(null);
        }
    }
}

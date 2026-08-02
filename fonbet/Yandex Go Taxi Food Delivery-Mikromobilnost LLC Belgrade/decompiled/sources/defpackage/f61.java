package defpackage;

import ru.yandex.taxi.search.presenter.f;

/* loaded from: classes12.dex */
public final class f61 extends f {
    @Override // ru.yandex.taxi.search.presenter.e
    public final void Lg(String str) {
        super.Lg(str);
        if (str == null || str.length() == 0) {
            ((j61) Dg()).a9();
        }
    }

    @Override // ru.yandex.taxi.search.presenter.f
    public final void eh(j61 j61Var) {
        super.eh(j61Var);
        String filter = j61Var.getFilter();
        if (filter == null || evu0.J(filter)) {
            j61Var.a9();
            return;
        }
        j61Var.Rb(filter);
        showProgress();
        Sg(this.x.b(filter));
    }
}

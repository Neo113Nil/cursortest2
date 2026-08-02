package com.yandex.go.payments.shared.prefetch;

import android.content.Context;
import android.view.View;
import com.yandex.go.payments.shared.y;
import defpackage.il;
import defpackage.jg;
import defpackage.tje;
import defpackage.vl;
import defpackage.wl;
import defpackage.xl;
import ru.yandex.taxi.transition.AttachableViewHolder;
import ru.yandex.taxi.transition.b;
import ru.yandex.taxi.widget.ModalView;

/* loaded from: classes13.dex */
public final class a extends b implements vl {
    public final xl c;
    public final AccountPrefetchView w;

    public a(Context context, xl xlVar) {
        this.c = xlVar;
        this.w = new AccountPrefetchView(context, new jg(3, xlVar));
    }

    @Override // ru.yandex.taxi.transition.AttachableViewHolder
    public final void B0() {
        xl xlVar = this.c;
        xlVar.Bg(this);
        wl wlVar = xlVar.x;
        il ilVar = wlVar.a;
        if (ilVar.a == null) {
            tje.N(xlVar.Jg(), null, null, new AccountPrefetchPresenter$loadAccountDetails$1(xlVar, null), 3);
        } else {
            wlVar.a.a = ilVar.b();
            ((y) wlVar.b.a).d();
        }
    }

    @Override // ru.yandex.taxi.transition.b, ru.yandex.taxi.transition.AttachableViewHolder
    public final void M1(AttachableViewHolder.b bVar) {
        super.M1(bVar);
        this.c.Cg();
    }

    @Override // ru.yandex.taxi.transition.b
    /* renamed from: N3 */
    public final ModalView h() {
        return this.w;
    }

    @Override // ru.yandex.taxi.transition.b, ru.yandex.taxi.transition.AttachableViewHolder
    public final View h() {
        return this.w;
    }

    @Override // ru.yandex.taxi.transition.b, ru.yandex.taxi.transition.AttachableViewHolder
    public final void requestFocus() {
        this.w.requestFocus();
    }
}

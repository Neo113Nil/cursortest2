package defpackage;

import android.content.Context;
import android.view.View;
import com.yandex.go.payments.shared.accountexistsdialog.AccountExistsDialogView;
import java.util.WeakHashMap;
import ru.yandex.taxi.design.ButtonComponent;
import ru.yandex.taxi.design.ListItemComponent;
import ru.yandex.taxi.design.ListTextComponent;
import ru.yandex.taxi.transition.AttachableViewHolder;
import ru.yandex.taxi.transition.b;
import ru.yandex.taxi.widget.ModalView;

/* loaded from: classes13.dex */
public final class fl extends b {
    public final ButtonComponent A;
    public final dl c;
    public final AccountExistsDialogView w;
    public final ListItemComponent x;
    public final ListTextComponent y;
    public final ButtonComponent z;

    public fl(Context context, dl dlVar) {
        this.c = dlVar;
        AccountExistsDialogView accountExistsDialogView = new AccountExistsDialogView(context, new jg(2, this));
        this.w = accountExistsDialogView;
        int i = e6h0.account_exists_dialog_header;
        WeakHashMap weakHashMap = androidx.core.view.b.a;
        this.x = (ListItemComponent) ((View) rp31.d(accountExistsDialogView, i));
        this.y = (ListTextComponent) ((View) rp31.d(accountExistsDialogView, e6h0.account_exists_dialog_explanation));
        this.z = (ButtonComponent) ((View) rp31.d(accountExistsDialogView, e6h0.account_exists_dialog_leave_account_button));
        this.A = (ButtonComponent) ((View) rp31.d(accountExistsDialogView, e6h0.account_exists_dialog_active_button));
    }

    @Override // ru.yandex.taxi.transition.AttachableViewHolder
    public final void B0() {
        el elVar = new el(this);
        dl dlVar = this.c;
        dlVar.Bg(elVar);
        elVar.bf(dlVar.Lg());
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

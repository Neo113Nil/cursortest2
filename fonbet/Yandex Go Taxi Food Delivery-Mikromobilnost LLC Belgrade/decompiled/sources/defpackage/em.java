package defpackage;

import android.content.Context;
import android.view.View;
import com.yandex.go.payments.shared.data.model.Account;
import com.yandex.go.payments.shared.wizard.accountpreview.AccountPreviewView;
import java.util.HashMap;
import java.util.WeakHashMap;
import ru.yandex.taxi.design.ButtonComponent;
import ru.yandex.taxi.design.ListItemComponent;
import ru.yandex.taxi.design.ListTitleComponent;
import ru.yandex.taxi.transition.AttachableViewHolder;
import ru.yandex.taxi.transition.b;
import ru.yandex.taxi.widget.ModalView;

/* loaded from: classes13.dex */
public final class em extends b implements am {
    public final ButtonComponent A;
    public final View B;
    public final View C;
    public final cm c;
    public final g1a0 w;
    public final AccountPreviewView x;
    public final ListTitleComponent y;
    public final ListItemComponent z;

    public em(p1b p1bVar, Context context) {
        bm bmVar = (bm) p1bVar.a;
        c0g c0gVar = (c0g) ((i6r) p1bVar.b);
        d0g d0gVar = c0gVar.A.a;
        d0gVar.getClass();
        zl zlVar = new zl();
        zzf zzfVar = d0gVar.a;
        zzfVar.d1();
        vnr0 V2 = c0gVar.V2();
        q5z.h(V2);
        this.c = new cm(bmVar, zlVar, V2);
        this.w = c0gVar.E2();
        cm cmVar = this.c;
        AccountPreviewView accountPreviewView = new AccountPreviewView(context, new jg(4, cmVar == null ? null : cmVar));
        this.x = accountPreviewView;
        int i = e6h0.shared_account_preview_name;
        WeakHashMap weakHashMap = androidx.core.view.b.a;
        this.y = (ListTitleComponent) ((View) rp31.d(accountPreviewView, i));
        ListItemComponent listItemComponent = (ListItemComponent) ((View) rp31.d(accountPreviewView, e6h0.shared_payment_account_preview_members));
        this.z = listItemComponent;
        this.A = (ButtonComponent) ((View) rp31.d(accountPreviewView, e6h0.shared_payment_account_preview_select_card));
        this.B = (View) rp31.d(accountPreviewView, e6h0.shared_payment_account_preview_loader);
        this.C = (View) rp31.d(accountPreviewView, e6h0.shared_payment_account_preview_container);
        listItemComponent.setDebounceClickListener(new dm(this, 0));
    }

    @Override // defpackage.am
    public final void A7(fm fmVar) {
        String str = fmVar.a;
        ListTitleComponent listTitleComponent = this.y;
        listTitleComponent.setTitle(str);
        listTitleComponent.setLeadImage(fmVar.c.a(this.x.getContext()));
        this.B.setVisibility(8);
        this.C.setVisibility(0);
        this.z.setTrailCompanionText(fmVar.b);
        this.A.setDebounceClickListener(new dm(this, 1));
    }

    @Override // ru.yandex.taxi.transition.AttachableViewHolder
    public final void B0() {
        cm cmVar = this.c;
        if (cmVar == null) {
            cmVar = null;
        }
        cmVar.Bg(this);
        bm bmVar = cmVar.w;
        Account b = bmVar.a.b();
        vnr0 vnr0Var = cmVar.y;
        String str = b.a;
        y9p y9pVar = vnr0Var.l;
        String k = vnr0Var.k(str);
        HashMap n = tse0.n(y9pVar);
        if (k != null) {
            n.put("type_group", k);
        }
        if (str != null) {
            n.put("group_id", str);
        }
        y9pVar.a.a("FamilyAccount.Card.Shown", n, 1, new HashMap());
        il ilVar = bmVar.a;
        ilVar.a = b;
        zl zlVar = cmVar.x;
        Account b2 = ilVar.b();
        zlVar.getClass();
        ((am) cmVar.Dg()).A7(new fm(b2.b(), b2.g, oe91.e(b2.c())));
        g1a0 g1a0Var = this.w;
        (g1a0Var != null ? g1a0Var : null).a();
    }

    @Override // ru.yandex.taxi.transition.b, ru.yandex.taxi.transition.AttachableViewHolder
    public final void M1(AttachableViewHolder.b bVar) {
        super.M1(bVar);
        cm cmVar = this.c;
        if (cmVar == null) {
            cmVar = null;
        }
        cmVar.Cg();
        g1a0 g1a0Var = this.w;
        (g1a0Var != null ? g1a0Var : null).d();
    }

    @Override // ru.yandex.taxi.transition.b
    /* renamed from: N3 */
    public final ModalView h() {
        return this.x;
    }

    @Override // ru.yandex.taxi.transition.b, ru.yandex.taxi.transition.AttachableViewHolder
    public final View h() {
        return this.x;
    }

    @Override // ru.yandex.taxi.transition.b, ru.yandex.taxi.transition.AttachableViewHolder
    public final void requestFocus() {
        this.x.requestFocus();
    }
}

package xsna;

import android.content.Context;
import android.net.Uri;
import com.vk.stat.sak.scheme.SchemeStatSak$TypeVkPayCheckoutItem;
import com.vk.superapp.vkpay.checkout.api.dto.response.VkCheckoutResponse;
import com.vk.superapp.vkpay.checkout.core.ui.views.VkCardForm;
import com.vk.superapp.vkpay.checkout.data.model.AddCardMethod;
import com.vk.superapp.vkpay.checkout.feature.confirmation.newcard.model.Card;
import com.vk.superapp.vkpay.checkout.feature.confirmation.newcard.model.Number;
import com.vk.superapp.vkpay.checkout.feature.success.Status;
import com.vk.superapp.vkpay.checkout.feature.success.states.ButtonAction;
import com.vk.superapp.vkpay.checkout.feature.success.states.ErrorState;
import com.vk.superapp.vkpay.checkout.feature.success.states.StatusActionStyle;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Iterator;
import xsna.bbv0;
import xsna.kku0;

/* compiled from: BindNewCardPresenter.kt */
/* loaded from: classes6.dex */
public final class h37 extends qr90<AddCardMethod, kku0> implements f37 {
    public final g37 i;
    public final a8c j;
    public final kku0 k;
    public final shn0 l;
    public final io.reactivex.rxjava3.disposables.b m;
    public VkCardForm.b n;
    public boolean o;
    public final k660 p;

    /* compiled from: BindNewCardPresenter.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[VkCheckoutResponse.VkCheckoutResponseStatus.values().length];
            try {
                iArr[VkCheckoutResponse.VkCheckoutResponseStatus.ERR_SYSTEM.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public h37(g37 g37Var, kku0 kku0Var, AddCardMethod addCardMethod) {
        super(g37Var, addCardMethod, r0, kku0Var);
        a8c a8cVar = sdi.f;
        bbv0.g.getClass();
        shn0 shn0Var = bbv0.a.f().e;
        this.i = g37Var;
        this.j = a8cVar;
        this.k = kku0Var;
        this.l = shn0Var;
        this.m = new io.reactivex.rxjava3.disposables.b();
        VkCardForm.b.C1919b c1919b = VkCardForm.b.C1919b.a;
        this.n = c1919b;
        this.o = true;
        this.p = new k660(c1919b, true);
    }

    @Override // xsna.or90
    public final void S1() {
        if (this.o) {
            if (this.n instanceof VkCardForm.b.C1919b) {
                this.n = new VkCardForm.b.c(rl3.y0(new VkCardForm.CardField[]{VkCardForm.CardField.EXPIRE_DATE, VkCardForm.CardField.NUMBER, VkCardForm.CardField.CVC}));
            }
            VkCardForm.b bVar = this.n;
            this.p.b = bVar;
            if (!(bVar instanceof VkCardForm.b.a)) {
                if (bVar instanceof VkCardForm.b.c) {
                    j(this.h);
                    return;
                }
                return;
            }
            Card card = ((VkCardForm.b.a) bVar).a;
            g37 g37Var = this.i;
            ((VkCardForm) g37Var.requireView().findViewById(R.id.vkpay_method_card_replenish_cardform)).clearFocus();
            shn0 shn0Var = this.l;
            shn0Var.a.b(new com.vk.superapp.vkpay.checkout.data.model.Card(card.k().d(), 13));
            shn0Var.a(SchemeStatSak$TypeVkPayCheckoutItem.EventType.NEW_CARD_ACCEPT);
            g37Var.vn();
            Number d = card.d();
            jwu0 jwu0Var = new jwu0(card.h().d(), card.g().toString(), d.d(), true);
            a8c a8cVar = this.j;
            this.m.b(new io.reactivex.rxjava3.internal.operators.single.h(a8c.e(a8c.d(a8cVar.a.h(jwu0Var))), new b00(new e1(a8cVar, 21), 9)).subscribe(new cz(new i37(1, this, h37.class, "handlePayByNewCardResponse", "handlePayByNewCardResponse(Lcom/vk/superapp/vkpay/checkout/api/dto/domain/PayOperation;)V", 0, 0), 7), new io1(new j37(1, this, h37.class, "handlePayByNewCardFailed", "handlePayByNewCardFailed(Ljava/lang/Throwable;)V", 0, 0), 6)));
        }
    }

    @Override // xsna.f37
    public final void b(VkCardForm.b bVar) {
        this.n = bVar;
    }

    @Override // xsna.qr90
    public final hfz[] c() {
        this.j.getClass();
        return new hfz[]{new wu80(a8c.a().e.c, a8c.b())};
    }

    @Override // xsna.qr90
    public final hfz[] e() {
        return new hfz[]{this.p, new qj(this.o), k4j.b};
    }

    @Override // xsna.qr90
    public final void f(ArrayList arrayList) {
        arrayList.add(e43.h(arrayList), i());
    }

    @Override // xsna.qr90
    public final boolean h() {
        return this.o;
    }

    public final void k() {
        Context mo2getContext = this.i.mo2getContext();
        if (mo2getContext == null) {
            return;
        }
        xu0 xu0Var = new xu0(4);
        kku0.a.a(this.k, new Status(new ErrorState(mo2getContext.getString(R.string.vk_pay_checkout_something_wrong), mo2getContext.getString(R.string.vk_pay_checkout_something_wrong_hint)), new ButtonAction(StatusActionStyle.PRIMARY, mo2getContext.getString(R.string.vk_pay_checkout_failed_try_again), xu0Var)));
    }

    @Override // xsna.fm6
    public final void onDestroyView() {
        this.m.e();
    }

    @Override // xsna.f37
    public final void x() {
        Context mo2getContext = this.i.mo2getContext();
        if (mo2getContext == null) {
            return;
        }
        rex0 rex0Var = e370.j;
        if (rex0Var == null) {
            rex0Var = null;
        }
        rex0Var.b(mo2getContext, Uri.parse("https://money.mail.ru/img/cards_conditions_20210407.pdf"));
    }

    @Override // xsna.f37
    public final void z(boolean z) {
        int i;
        this.o = z;
        ArrayList arrayList = this.h;
        Iterator it = arrayList.iterator();
        int i2 = 0;
        int i3 = 0;
        while (true) {
            i = -1;
            if (!it.hasNext()) {
                i3 = -1;
                break;
            } else if (((hfz) it.next()) instanceof qj) {
                break;
            } else {
                i3++;
            }
        }
        arrayList.set(i3, new qj(z));
        ArrayList arrayList2 = this.h;
        Iterator it2 = arrayList2.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            if (((hfz) it2.next()) instanceof ckl) {
                i = i2;
                break;
            }
            i2++;
        }
        arrayList2.set(i, i());
        j(this.h);
    }

    @Override // xsna.qr90, xsna.or90
    public final void x0() {
    }
}

package xsna;

import android.content.Context;
import android.view.LayoutInflater;
import androidx.fragment.app.FragmentManager;
import com.vk.superapp.vkpay.checkout.core.ui.views.VkCardForm;
import com.vk.superapp.vkpay.checkout.data.model.AddCardMethod;
import com.vk.superapp.vkpay.checkout.data.model.Card;
import com.vk.superapp.vkpay.checkout.data.model.PayMethodData;
import com.vk.superapp.vkpay.checkout.data.model.VkPay;
import com.vk.superapp.vkpay.checkout.feature.confirmation.vkpay.JustWallet;
import com.vk.superapp.vkpay.checkout.feature.confirmation.vkpay.NewCard;
import com.vk.superapp.vkpay.checkout.feature.confirmation.vkpay.WalletPayMethod;
import com.vk.superapp.vkpay.checkout.feature.confirmation.vkpay.WithCard;
import com.vkontakte.android.R;
import io.reactivex.rxjava3.internal.functions.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.av20;
import xsna.bbv0;
import xsna.dw20;
import xsna.sr90;

/* compiled from: VkPayConfirmationPresenter.kt */
/* loaded from: classes6.dex */
public final class qbv0 extends qr90<VkPay, kku0> implements mbv0 {
    public final nbv0 i;
    public final a8c j;
    public final kku0 k;
    public final ArrayList l;
    public final io.reactivex.rxjava3.disposables.b m;
    public WalletPayMethod n;
    public Card o;
    public boolean p;
    public k660 q;
    public VkCardForm.b r;

    /* compiled from: VkPayConfirmationPresenter.kt */
    public static final /* synthetic */ class a extends FunctionReferenceImpl implements izs<Throwable, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(Throwable th) {
            ((bbv0.a) this.receiver).getClass();
            bbv0.a.c(th);
            return s3q0.a;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public qbv0(nbv0 nbv0Var, VkPay vkPay, kku0 kku0Var) {
        super(nbv0Var, vkPay, r0, kku0Var);
        a8c a8cVar = sdi.f;
        this.i = nbv0Var;
        this.j = a8cVar;
        this.k = kku0Var;
        this.l = new ArrayList();
        this.m = new io.reactivex.rxjava3.disposables.b();
        this.n = JustWallet.b;
        this.r = new VkCardForm.b.c(rl3.y0(new VkCardForm.CardField[]{VkCardForm.CardField.NUMBER, VkCardForm.CardField.EXPIRE_DATE, VkCardForm.CardField.CVC}));
    }

    public static s3q0 k(qbv0 qbv0Var) {
        Card card;
        super.d();
        if (qbv0Var.m() && !qbv0Var.p) {
            ArrayList arrayList = qbv0Var.l;
            if (!arrayList.isEmpty() && (card = (Card) j5g.b0(0, g5g.E(arrayList, Card.class))) != null) {
                sr90<? extends PayMethodData> a2 = sr90.a.a(card);
                if (a2 instanceof ht9) {
                    qbv0Var.o = card;
                    qbv0Var.n(a2);
                    qbv0Var.p = false;
                } else {
                    IllegalStateException illegalStateException = new IllegalStateException(vr.b(ht9.class, "autoSelectedCard is not an instance of "));
                    bbv0.g.getClass();
                    bbv0.a.c(illegalStateException);
                }
            }
        }
        if (qbv0Var.m()) {
            nsa nsaVar = new nsa(qbv0Var.e, false, 4);
            ArrayList arrayList2 = qbv0Var.h;
            arrayList2.set(1, nsaVar);
            qbv0Var.j(arrayList2);
        }
        return s3q0.a;
    }

    @Override // xsna.mbv0
    public final void D0(Card card) {
        this.n = new WithCard(card.getId(), l());
        this.o = card;
        n((ht9) sr90.a.a(card));
        Iterator it = this.h.iterator();
        while (it.hasNext()) {
            if (((hfz) it.next()) instanceof k660) {
                it.remove();
            }
        }
        j(this.h);
        this.q = null;
        this.p = false;
    }

    @Override // xsna.or90
    public final void S1() {
        if (this.p) {
            VkCardForm.b bVar = this.r;
            k660 k660Var = this.q;
            if (k660Var != null) {
                k660Var.b = bVar;
            }
            j(this.h);
            if (!(bVar instanceof VkCardForm.b.a)) {
                return;
            } else {
                this.n = new NewCard(((VkCardForm.b.a) bVar).a, l());
            }
        } else {
            Card card = this.o;
            if (card != null) {
                this.n = new WithCard(card.getId(), l());
            }
        }
        this.k.e(this.n);
    }

    @Override // xsna.mbv0
    public final void V2() {
        ArrayList arrayList = new ArrayList(this.l);
        arrayList.add(AddCardMethod.c);
        List O0 = j5g.O0(arrayList);
        nbv0 nbv0Var = this.i;
        if (nbv0Var.p != null) {
            FragmentManager supportFragmentManager = nbv0Var.kn().getSupportFragmentManager();
            dw20 dw20Var = nbv0Var.p;
            if (dw20Var != null) {
                dw20Var.Wn(supportFragmentManager, null);
                return;
            }
            return;
        }
        Context requireContext = nbv0Var.requireContext();
        dw20.b bVar = new dw20.b(requireContext, null);
        cbq.a(bVar);
        gpu0 gpu0Var = new gpu0(requireContext);
        gpu0Var.j = new f6c();
        dw20.b bVar2 = (dw20.b) bVar.l0(gpu0Var);
        av20.a aVar = new av20.a();
        aVar.d(R.layout.vk_pay_checkout_item_pay_method, LayoutInflater.from(nbv0Var.mo2getContext()));
        aVar.d = new obv0(nbv0Var);
        aVar.e = new pbv0(nbv0Var);
        av20 b = aVar.b();
        b.setItems(O0);
        s3q0 s3q0Var = s3q0.a;
        nbv0Var.p = ((dw20.b) dw20.a.k(bVar2, b, 4)).c(new cpo(false, 0, 7)).w0(nbv0Var.requireContext().getString(R.string.vk_pay_checkout_vkpay_method_card_to_replenish)).I0(null);
    }

    @Override // xsna.mbv0
    public final void b(VkCardForm.b bVar) {
        if (bVar instanceof VkCardForm.b.a) {
            this.n = new NewCard(((VkCardForm.b.a) bVar).a, l());
        }
        this.r = bVar;
    }

    /* JADX WARN: Type inference failed for: r1v9, types: [io.reactivex.rxjava3.subjects.g$b, java.util.concurrent.atomic.AtomicReference] */
    @Override // xsna.qr90, xsna.fm6
    public final void d() {
        io.reactivex.rxjava3.subjects.g<List<PayMethodData>> gVar;
        a8c a8cVar = this.j;
        io.reactivex.rxjava3.subjects.g<List<PayMethodData>> gVar2 = a8cVar.c;
        if (gVar2 == null || gVar2.b.size() == 0) {
            a8cVar.c(false).subscribe(new y7c(new od3(7), 0), new pm1(new z7c(1, bbv0.g, bbv0.a.class, "logError", "logError$vkpay_checkout_release(Ljava/lang/Throwable;)V", 0), 7));
            gVar = a8cVar.c;
        } else {
            gVar = a8cVar.c;
        }
        io.reactivex.rxjava3.internal.operators.observable.j1 U = gVar.U(new nit(new av70(26), 25));
        xvr0 xvr0Var = new xvr0(new z7t0(this, 4), 4);
        a.l lVar = io.reactivex.rxjava3.internal.functions.a.d;
        a.k kVar = io.reactivex.rxjava3.internal.functions.a.c;
        this.m.b(U.E(xvr0Var, lVar, kVar, kVar).subscribe(new vom0(new ptl0(this, 18), 6), new t6m0(new a(1, bbv0.g, bbv0.a.class, "logError", "logError$vkpay_checkout_release(Ljava/lang/Throwable;)V", 0), 9)));
    }

    @Override // xsna.qr90
    public final hfz[] e() {
        ArrayList arrayList = new ArrayList();
        if (m()) {
            int l = l();
            this.j.getClass();
            arrayList.add(new ew1(l, a8c.b().d));
            arrayList.add(!this.l.isEmpty() ? new s1g0(sr90.a.a(AddCardMethod.c)) : u1g0.b);
        }
        return (hfz[]) arrayList.toArray(new hfz[0]);
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0049, code lost:
    
        if (r0 == null) goto L8;
     */
    @Override // xsna.qr90
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final hfz i() {
        String str;
        if (!m()) {
            return super.i();
        }
        Context mo2getContext = this.i.mo2getContext();
        if (mo2getContext != null) {
            this.j.getClass();
            int i = a8c.b().b;
            str = mo2getContext.getString(R.string.vk_pay_checkout_vkpay_method_card_replenish_and_pay, sua.i(i, ',') + (char) 8201 + a8c.b().d.h());
        }
        str = "";
        return new ckl(str, true);
    }

    public final int l() {
        a8c a8cVar = this.j;
        a8cVar.getClass();
        int i = a8c.b().b;
        PayMethodData payMethodData = a8cVar.b;
        VkPay vkPay = payMethodData instanceof VkPay ? (VkPay) payMethodData : null;
        if (vkPay != null) {
            return i - vkPay.i();
        }
        IllegalStateException illegalStateException = new IllegalStateException("Pay method should be only VkPay to support payments using additional card");
        bbv0.g.getClass();
        bbv0.a.c(illegalStateException);
        return 0;
    }

    public final boolean m() {
        T t = this.e.b;
        VkPay vkPay = t instanceof VkPay ? (VkPay) t : null;
        if (vkPay == null) {
            throw new IllegalArgumentException("Cannot pass not VkPay method here");
        }
        int i = vkPay.i();
        this.j.getClass();
        return i < a8c.b().b;
    }

    public final void n(sr90<? extends PayMethodData> sr90Var) {
        Iterator it = this.h.iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            } else if (((hfz) it.next()) instanceof s1g0) {
                break;
            } else {
                i++;
            }
        }
        this.h.set(i, new s1g0(sr90Var));
        j(this.h);
    }

    @Override // xsna.fm6
    public final void onDestroyView() {
        this.m.e();
    }

    @Override // xsna.mbv0
    public final void p3() {
        ArrayList arrayList = new ArrayList(i7o0.a(this.h));
        arrayList.add(e43.h(arrayList), new k660(0));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            if (((hfz) it.next()) instanceof u1g0) {
                it.remove();
            }
        }
        j(arrayList);
    }

    @Override // xsna.mbv0
    public final void r1() {
        this.p = true;
        n(sr90.a.a(AddCardMethod.c));
        if (this.q != null) {
            return;
        }
        Iterator it = this.h.iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            } else if (((hfz) it.next()).getClass() == s1g0.class) {
                break;
            } else {
                i++;
            }
        }
        k660 k660Var = new k660(0);
        this.h.add(i + 1, k660Var);
        j(this.h);
        this.q = k660Var;
    }
}

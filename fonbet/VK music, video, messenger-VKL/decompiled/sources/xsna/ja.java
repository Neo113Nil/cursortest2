package xsna;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import com.vk.dto.common.id.UserId;
import com.vk.dto.money.MoneyCard;
import com.vk.dto.money.MoneyGetCardsResult;
import com.vk.dto.money.MoneyReceiverInfo;
import com.vk.dto.money.MoneyTransfer;
import com.vk.log.L;
import com.vk.money.createtransfer.AbsCreateTransferFragment;
import com.vk.money.createtransfer.input.TransferInputField;
import com.vkontakte.android.R;
import io.reactivex.rxjava3.internal.functions.a;
import kotlin.collections.EmptyList;
import xsna.scg0;

/* compiled from: AbsCreateTransferPresenter.kt */
/* loaded from: classes3.dex */
public abstract class ja implements oak {
    public final AbsCreateTransferFragment a;
    public final Bundle b;
    public final String c;
    public final io.reactivex.rxjava3.disposables.b d = new io.reactivex.rxjava3.disposables.b();
    public final MoneyReceiverInfo e;
    public MoneyGetCardsResult f;
    public final UserId g;
    public int h;
    public String i;
    public final String j;
    public final nl k;
    public scg0 l;
    public final String m;
    public boolean n;

    public ja(AbsCreateTransferFragment absCreateTransferFragment, Bundle bundle) {
        this.a = absCreateTransferFragment;
        this.b = bundle;
        EmptyList emptyList = EmptyList.b;
        this.f = new MoneyGetCardsResult(emptyList, MoneyCard.f);
        UserId userId = UserId.d;
        this.g = userId;
        this.i = "";
        this.j = "";
        new a370();
        nl nlVar = new nl();
        nlVar.b = emptyList;
        this.k = nlVar;
        this.l = new scg0.f();
        this.m = "";
        if (bundle.containsKey("moneyInfo")) {
            this.e = (MoneyReceiverInfo) bundle.getParcelable("moneyInfo");
            if (TextUtils.isEmpty(this.m)) {
                MoneyReceiverInfo moneyReceiverInfo = this.e;
                String str = (moneyReceiverInfo == null ? null : moneyReceiverInfo).d;
                String str2 = str != null ? str : "";
                this.j = MoneyTransfer.o(str2);
                this.m = str2;
            }
            if (TextUtils.isEmpty(this.m)) {
                String str3 = o25.a().i().t;
                this.j = MoneyTransfer.o(str3);
                this.m = str3;
            }
        }
        absCreateTransferFragment.to(R.layout.appkit_loader_fragment);
        UserId userId2 = (UserId) bundle.getParcelable("to_id");
        this.g = userId2 != null ? userId2 : userId;
        this.c = bundle.getString("ref");
    }

    public static String D(int i) {
        Context context = e43.a;
        if (context == null) {
            context = null;
        }
        return context.getString(i);
    }

    public static int G(String str) {
        try {
            return Integer.parseInt(brm0.y(str, " ", ""));
        } catch (Exception unused) {
            L.l("Failed to parse amount string ".concat(str));
            return 0;
        }
    }

    public static void M(ja jaVar) {
        jaVar.L(jaVar.E().c(jaVar.h));
    }

    public abstract r730 A(int i, UserId userId, String str, String str2);

    public abstract String B(int i);

    public final String C(int i) {
        if (i == 0) {
            return D(R.string.money_transfer_send_request);
        }
        return D(R.string.money_transfer_request) + ' ' + i + ' ' + this.j;
    }

    public abstract njp0 E();

    public boolean F() {
        return this.h >= E().e() && this.h <= E().a() && this.e != null;
    }

    public abstract void H(Context context);

    public final void I(Context context) {
        io.reactivex.rxjava3.core.q m = hg1.m(rsg0.y0(A(this.h, this.g, this.i, this.m), null, null, 3), context, 0L, false, 62);
        int i = 0;
        io.reactivex.rxjava3.internal.operators.observable.z zVar = new io.reactivex.rxjava3.internal.operators.observable.z(new io.reactivex.rxjava3.internal.operators.observable.z(m, new da(new r6(this, 1), i)), new ea(new t6(this, 1), i));
        fa faVar = new fa(this, 0);
        a.l lVar = io.reactivex.rxjava3.internal.functions.a.d;
        int i2 = 0;
        this.d.b(zVar.E(lVar, lVar, io.reactivex.rxjava3.internal.functions.a.c, faVar).subscribe(new ga(new com.vk.movika.sdk.base.logic.interactor.d(this, 1), i2), new ia(new ha(this, i2), 0)));
    }

    public abstract boolean J();

    public void K(int i) {
        this.a.yo(String.valueOf(i));
    }

    public void L(scg0 scg0Var) {
        this.l = scg0Var;
        TransferInputField transferInputField = this.a.p0;
        if (transferInputField != null) {
            transferInputField.setRestriction(scg0Var);
        }
    }

    public final void N() {
        boolean F = F();
        AbsCreateTransferFragment absCreateTransferFragment = this.a;
        if (!F) {
            absCreateTransferFragment.vo();
            return;
        }
        TextView textView = absCreateTransferFragment.l0;
        if (textView == null) {
            textView = null;
        }
        textView.setEnabled(true);
    }

    @Override // xsna.oak
    public final void a(String str) {
        this.i = str;
    }

    @Override // xsna.oak
    public void b(String str) {
        int G = G(str);
        this.h = G;
        this.a.zo(B(G));
        N();
        M(this);
    }

    @Override // xsna.oak
    public void c(int i) {
        M(this);
    }

    @Override // xsna.oak
    public void d() {
        Bundle bundle = this.b;
        String string = bundle.getString("amount");
        if (string == null) {
            string = "0";
        }
        String string2 = bundle.getString("comment");
        if (string2 == null) {
            string2 = "";
        }
        this.i = string2;
        b(string);
        AbsCreateTransferFragment absCreateTransferFragment = this.a;
        absCreateTransferFragment.yo(string);
        TransferInputField transferInputField = absCreateTransferFragment.p0;
        if (transferInputField != null) {
            transferInputField.setComment(string2);
        }
        M(this);
        if (bundle.getBoolean("hide_toolbar", false)) {
            Toolbar toolbar = absCreateTransferFragment.Q;
            if (toolbar != null) {
                f4m.j(toolbar);
            }
        } else {
            Toolbar toolbar2 = absCreateTransferFragment.Q;
            if (toolbar2 != null) {
                toolbar2.setVisibility(0);
            }
        }
        n();
    }

    @Override // xsna.oak
    public void e() {
        scg0 scg0Var = this.l;
        boolean z = scg0Var instanceof scg0.d;
        AbsCreateTransferFragment absCreateTransferFragment = this.a;
        if (z) {
            int i = ((scg0.d) scg0Var).a;
            K(i);
            absCreateTransferFragment.zo(B(i));
        } else if (scg0Var instanceof scg0.c) {
            int i2 = ((scg0.c) scg0Var).a;
            K(i2);
            absCreateTransferFragment.zo(B(i2));
        }
        M(this);
    }

    @Override // xsna.oak
    public final void k() {
        d();
    }

    @Override // xsna.oak
    public final void l() {
        this.n = false;
    }

    @Override // xsna.oak
    public final io.reactivex.rxjava3.disposables.b o() {
        return this.d;
    }

    @Override // xsna.oak
    public final void x(Context context) {
        if (this.n) {
            return;
        }
        if (J()) {
            TransferInputField transferInputField = this.a.p0;
            cvk.w(transferInputField != null ? transferInputField.getRestrictionText() : null, false);
        } else {
            this.n = true;
            H(context);
        }
    }
}

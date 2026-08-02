package xsna;

import android.text.method.LinkMovementMethod;
import android.view.ViewGroup;
import android.widget.CheckBox;
import com.vkontakte.android.R;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: AcceptTermsCardViewHolder.kt */
/* loaded from: classes6.dex */
public final class sj extends vfz<qj> {
    public final a l;
    public final CheckBox m;
    public final rj n;

    /* compiled from: AcceptTermsCardViewHolder.kt */
    public interface a {
        void x();

        void z(boolean z);
    }

    /* compiled from: AcceptTermsCardViewHolder.kt */
    public static final /* synthetic */ class b extends FunctionReferenceImpl implements gzs<s3q0> {
        @Override // xsna.gzs
        public final s3q0 invoke() {
            ((a) this.receiver).x();
            return s3q0.a;
        }
    }

    public sj(ViewGroup viewGroup, a aVar) {
        super(R.layout.vk_pay_checkout_accept_terms_card_item, viewGroup);
        this.l = aVar;
        CheckBox checkBox = (CheckBox) this.itemView.findViewById(R.id.vk_pay_checkout_accept_terms_checkbox);
        checkBox.setText(xa4.l(R.string.vk_pay_checkout_bind_card_terms, checkBox.getContext(), new b(0, aVar, a.class, "onTermsClick", "onTermsClick()V", 0)));
        checkBox.setMovementMethod(LinkMovementMethod.getInstance());
        this.m = checkBox;
        this.n = new rj(this, 0);
    }

    @Override // xsna.vfz
    public final void W5(qj qjVar) {
        CheckBox checkBox = this.m;
        checkBox.setOnCheckedChangeListener(null);
        checkBox.setChecked(qjVar.b);
        checkBox.setOnCheckedChangeListener(this.n);
    }
}

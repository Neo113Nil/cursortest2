package defpackage;

import android.text.SpannableStringBuilder;
import android.text.SpannedString;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.x0;
import androidx.recyclerview.widget.y;

/* loaded from: classes2.dex */
public final class c7f0 extends y {
    public c7f0() {
        super(a7f0.a);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(x0 x0Var, int i) {
        b7f0 b7f0Var = (b7f0) x0Var;
        CharSequence charSequence = (CharSequence) getItem(i);
        TextView textView = (TextView) b7f0Var.N.a(b7f0.O[0]);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append(charSequence);
        if (bb1.y(b7f0Var.a)) {
            spannableStringBuilder.insert(charSequence.length(), (CharSequence) " •");
        } else {
            spannableStringBuilder.insert(0, (CharSequence) "• ");
        }
        textView.setText(new SpannedString(spannableStringBuilder));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final x0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new b7f0(LayoutInflater.from(viewGroup.getContext()).inflate(imh0.pay_sdk_item_product_benefit, viewGroup, false));
    }
}

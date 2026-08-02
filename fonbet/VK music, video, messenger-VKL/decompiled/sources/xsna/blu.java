package xsna;

import android.text.SpannableStringBuilder;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.Nullable;
import com.vk.core.utils.VerifyInfoHelper;
import com.vk.dto.common.VerifyInfo;
import com.vk.dto.group.Group;
import com.vk.imageloader.view.VKImageView;
import com.vkontakte.android.R;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.NumberFormat;
import java.util.Locale;

/* compiled from: GroupHolder.java */
/* loaded from: classes7.dex */
public final class blu extends vif0<Group> implements View.OnClickListener {
    public static final DecimalFormat u;
    public final TextView n;
    public final TextView o;

    @Nullable
    public final TextView p;
    public final VKImageView q;
    public final View r;

    @Nullable
    public xcd s;
    public ed4 t;

    /* compiled from: GroupHolder.java */
    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            ed4 ed4Var;
            blu bluVar = blu.this;
            Object obj = bluVar.m;
            if (obj == null || (ed4Var = bluVar.t) == null) {
                return;
            }
            ed4Var.invoke(view, (Group) obj);
        }
    }

    static {
        DecimalFormat decimalFormat = (DecimalFormat) NumberFormat.getInstance(Locale.US);
        u = decimalFormat;
        DecimalFormatSymbols decimalFormatSymbols = decimalFormat.getDecimalFormatSymbols();
        decimalFormatSymbols.setGroupingSeparator(' ');
        decimalFormat.setDecimalFormatSymbols(decimalFormatSymbols);
    }

    public blu(ViewGroup viewGroup, int i) {
        super(viewGroup, i, 0);
        this.n = (TextView) this.itemView.findViewById(R.id.title);
        this.o = (TextView) this.itemView.findViewById(R.id.subtitle);
        this.p = (TextView) this.itemView.findViewById(R.id.info);
        this.q = (VKImageView) this.itemView.findViewById(R.id.photo);
        View findViewById = this.itemView.findViewById(R.id.options);
        this.r = findViewById;
        this.itemView.setOnClickListener(this);
        if (findViewById != null) {
            findViewById.setOnClickListener(new a());
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        xcd xcdVar = this.s;
        if (xcdVar != null) {
            xcdVar.invoke((Group) this.m);
        }
    }

    @Override // xsna.vif0
    /* renamed from: q6, reason: merged with bridge method [inline-methods] */
    public final void i6(Group group) {
        CharSequence charSequence;
        String str = group.A;
        VerifyInfo verifyInfo = group.y;
        if (str == null) {
            int i = group.v;
            group.A = a6(R.plurals.groups_followers, i, u.format(i));
        }
        this.q.load(group.e);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(group.z);
        if (group.G) {
            ylw ylwVar = new ylw(R.drawable.vk_icon_badge_vk_pay_14);
            ylwVar.f = iah0.a(2.0f);
            ylwVar.g = iah0.a(8.0f);
            ylwVar.h = R.attr.vk_ui_icon_secondary;
            spannableStringBuilder.append((CharSequence) ylwVar.b(this.itemView.getContext()));
        }
        this.o.setText(spannableStringBuilder);
        TextView textView = this.p;
        if (textView != null) {
            textView.setText(group.A);
        }
        if (verifyInfo.Cb()) {
            SpannableStringBuilder spannableStringBuilder2 = (SpannableStringBuilder) group.b;
            charSequence = spannableStringBuilder2;
            if (spannableStringBuilder2 == null) {
                ucp ucpVar = ucp.a;
                SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder(ucp.i(group.d));
                spannableStringBuilder3.append((char) 160);
                spannableStringBuilder3.append((char) 160);
                spannableStringBuilder3.setSpan(new dqa(VerifyInfoHelper.h(VerifyInfoHelper.a, verifyInfo, this.itemView.getContext(), null, 28)), spannableStringBuilder3.length() - 1, spannableStringBuilder3.length(), 0);
                group.b = spannableStringBuilder3;
                charSequence = spannableStringBuilder3;
            }
        } else {
            CharSequence charSequence2 = group.b;
            charSequence = charSequence2;
            if (charSequence2 == null) {
                ucp ucpVar2 = ucp.a;
                CharSequence i2 = ucp.i(group.d);
                group.b = i2;
                charSequence = i2;
            }
        }
        this.n.setText(charSequence);
        View view = this.r;
        if (view != null) {
            if (this.t != null) {
                view.setVisibility(0);
            } else {
                view.setVisibility(8);
            }
        }
    }
}

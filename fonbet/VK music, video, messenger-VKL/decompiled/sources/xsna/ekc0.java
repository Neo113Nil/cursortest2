package xsna;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.vk.core.view.FutureDateTimePickerView;
import com.vkontakte.android.R;
import java.util.Calendar;
import java.util.Date;
import xsna.h7u0;

/* compiled from: PostingPostponeDelegateImpl.kt */
@ozl
/* loaded from: classes17.dex */
public final class ekc0 implements ckc0 {
    public final Context a;
    public final int b;
    public izs<? super Date, s3q0> c;
    public Date d;

    public ekc0(Context context, int i) {
        this.a = context;
        this.b = i;
    }

    @Override // xsna.ckc0
    public final void a(izs<? super Date, s3q0> izsVar) {
        this.c = izsVar;
    }

    @Override // xsna.ckc0
    @SuppressLint({"InflateParams"})
    public final void b(Date date, Date date2, Date date3) {
        Context context = this.a;
        mhy.b(context);
        if (date == null) {
            Calendar d = pvo0.d();
            d.add(10, 4);
            d.set(13, 0);
            date = d.getTime();
        }
        this.d = date;
        View inflate = LayoutInflater.from(context).inflate(R.layout.vk_alert_postpone_dialog, (ViewGroup) null, false);
        FutureDateTimePickerView futureDateTimePickerView = (FutureDateTimePickerView) inflate.findViewById(R.id.future_date_time_picker);
        futureDateTimePickerView.setTextResources(R.string.invalid_date);
        baf0 baf0Var = new baf0(m33.a(R.drawable.vk_icon_dropdown_24, context), e3m.f(R.attr.vk_ui_icon_secondary, context));
        futureDateTimePickerView.setDateEndDrawable(baf0Var);
        futureDateTimePickerView.setTimeEndDrawable(baf0Var);
        float f = 16;
        futureDateTimePickerView.setDateEndDrawablePadding(iah0.a(f));
        futureDateTimePickerView.setTimeEndDrawablePadding(iah0.a(f));
        float f2 = 10;
        int a = iah0.a(f2);
        TextView textView = futureDateTimePickerView.c;
        textView.setPadding(textView.getPaddingLeft(), textView.getPaddingTop(), a, textView.getPaddingBottom());
        int a2 = iah0.a(f2);
        TextView textView2 = futureDateTimePickerView.d;
        textView2.setPadding(textView2.getPaddingLeft(), textView2.getPaddingTop(), a2, textView2.getPaddingBottom());
        if (date2 != null) {
            futureDateTimePickerView.setMinValidDate(date2);
        }
        if (date3 != null) {
            futureDateTimePickerView.setMaxValidDate(date3);
        }
        Date date4 = this.d;
        if (date4 != null) {
            futureDateTimePickerView.setDate(date4);
        }
        h7u0.a aVar = new h7u0.a(context);
        aVar.g0(this.b);
        aVar.c0(R.string.postpone_dialog_positive_button, new dkc0(0, this, futureDateTimePickerView));
        aVar.W(R.string.cancel, null);
        aVar.f = inflate;
        aVar.m();
    }
}

package xsna;

import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatEditText;

/* compiled from: LeadFormContactsHolder.kt */
/* loaded from: classes4.dex */
public final class oyy implements View.OnClickListener {
    public final /* synthetic */ TextView b;
    public final /* synthetic */ izs<AppCompatEditText, s3q0> c;
    public final /* synthetic */ AppCompatEditText d;

    /* JADX WARN: Multi-variable type inference failed */
    public oyy(TextView textView, izs<? super AppCompatEditText, s3q0> izsVar, AppCompatEditText appCompatEditText) {
        this.b = textView;
        this.c = izsVar;
        this.d = appCompatEditText;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.b.setVisibility(8);
        this.c.invoke(this.d);
    }
}

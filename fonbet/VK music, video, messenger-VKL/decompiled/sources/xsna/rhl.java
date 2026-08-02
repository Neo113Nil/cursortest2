package xsna;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.vkontakte.android.R;

/* compiled from: DefaultListErrorView.java */
@Deprecated
/* loaded from: classes3.dex */
public class rhl extends ee {
    public long d;
    public TextView e;
    public TextView f;

    public rhl(Context context) {
        super(context);
        this.d = 0L;
        c(context);
    }

    @Override // xsna.ee
    public final void b() {
        this.f.setVisibility(0);
        this.e.setText(R.string.liblists_err_text);
    }

    public final void c(Context context) {
        addView((ViewGroup) LayoutInflater.from(context).inflate(getLayoutResId(), (ViewGroup) null), new FrameLayout.LayoutParams(-1, (int) getResources().getDimension(R.dimen.footer_height)));
        this.e = (TextView) findViewById(R.id.error_text);
        TextView textView = (TextView) findViewById(R.id.error_button);
        this.f = textView;
        textView.setOnClickListener(new qhl(this));
    }

    public int getLayoutResId() {
        return R.layout.vk_view_default_list_error_view;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
    }

    @Override // xsna.ee
    public void setActionTitle(int i) {
        this.f.setText(i);
    }

    public void setErrorButtonColor(int i) {
        this.f.setTextColor(i);
    }

    public void setErrorTextColor(int i) {
        this.e.setTextColor(i);
    }

    @Override // xsna.ee
    public void setMessage(CharSequence charSequence) {
        this.e.setText(charSequence);
    }

    @Override // xsna.ee
    public void setRetryBtnVisible(boolean z) {
        this.f.setVisibility(z ? 0 : 8);
    }
}

package xsna;

import android.content.Context;
import android.content.res.TypedArray;
import android.view.LayoutInflater;
import android.widget.Checkable;
import android.widget.CompoundButton;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.vk.core.view.components.R$styleable;
import com.vk.core.view.components.check.VkCheckCircle;
import com.vkontakte.android.R;
import xsna.rju0;

/* compiled from: VkCheckCircleItem.kt */
/* loaded from: classes17.dex */
public final class rju0 extends ConstraintLayout implements Checkable {
    public final VkCheckCircle t;
    public final TextView u;
    public final TextView v;

    /* compiled from: VkCheckCircleItem.kt */
    public interface a {
        void b(boolean z);
    }

    public rju0(Context context) {
        super(context, null, 0);
        LayoutInflater.from(context).inflate(R.layout.ds_internal_check_circle_item, this);
        this.t = (VkCheckCircle) findViewById(R.id.check_circle);
        this.u = (TextView) findViewById(R.id.title);
        this.v = (TextView) findViewById(R.id.subtitle);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(null, R$styleable.h, 0, 0);
        String string = obtainStyledAttributes.getString(1);
        String string2 = obtainStyledAttributes.getString(0);
        setTitle(string != null ? oq.d(tlo0.Companion, string) : null);
        setSubtitle(string2 != null ? oq.d(tlo0.Companion, string2) : null);
        setFocusable(true);
        setScreenReaderFocusable(true);
        setOnClickListener(new ra6(this, 9));
        obtainStyledAttributes.recycle();
    }

    @Override // android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        return "android.widget.CheckBox";
    }

    public final String getSubtitle() {
        return this.v.getText().toString();
    }

    public final String getTitle() {
        return this.u.getText().toString();
    }

    @Override // android.widget.Checkable
    public final boolean isChecked() {
        return this.t.isChecked();
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z) {
        this.t.setChecked(z);
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        super.setEnabled(z);
        this.t.setEnabled(z);
        this.u.setAlpha(z ? 1.0f : 0.64f);
        this.v.setAlpha(z ? 1.0f : 0.64f);
    }

    public final void setListener(final a aVar) {
        this.t.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener(this) { // from class: xsna.qju0
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                rju0.a aVar2 = rju0.a.this;
                if (aVar2 != null) {
                    aVar2.b(z);
                }
            }
        });
    }

    public final void setSubtitle(tlo0 tlo0Var) {
        CharSequence a2 = tlo0Var != null ? tlo0Var.a(getContext()) : null;
        TextView textView = this.v;
        textView.setText(a2);
        f4m.E(textView, !(a2 == null || a2.length() == 0));
    }

    public final void setTitle(tlo0 tlo0Var) {
        this.u.setText(tlo0Var != null ? tlo0Var.a(getContext()) : null);
    }

    @Override // android.widget.Checkable
    public final void toggle() {
        this.t.toggle();
    }
}

package xsna;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.vkontakte.android.R;

/* compiled from: OnboardingButtonsView.kt */
/* loaded from: classes18.dex */
public final class fd80 extends LinearLayout {
    public final TextView b;
    public final TextView c;

    public fd80(Context context) {
        super(context, null, 0);
        LayoutInflater.from(context).inflate(R.layout.onboarding_buttons, (ViewGroup) this, true);
        this.b = (TextView) findViewById(R.id.primary_button);
        this.c = (TextView) findViewById(R.id.secondary_button);
    }

    public final void a(int i, gzs<s3q0> gzsVar) {
        TextView textView = this.b;
        textView.setVisibility(0);
        textView.setText(i);
        textView.setOnClickListener(new ed80(0, gzsVar));
    }
}

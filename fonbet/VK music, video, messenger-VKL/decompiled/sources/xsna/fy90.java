package xsna;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.vkontakte.android.R;

/* compiled from: PermissionStubView.kt */
/* loaded from: classes4.dex */
public final class fy90 extends FrameLayout {
    public final TextView b;
    public final TextView c;
    public final TextView d;

    public fy90(Context context) {
        super(context);
        LayoutInflater.from(getContext()).inflate(R.layout.vk_layout_permission_stub, (ViewGroup) this, true);
        this.b = (TextView) findViewById(R.id.tv_message);
        this.c = (TextView) findViewById(R.id.tv_grant_permissions);
        this.d = (TextView) findViewById(R.id.tv_other_permission);
    }

    public final void setGrantAccessAction(gzs<s3q0> gzsVar) {
        TextView textView = this.c;
        if (textView != null) {
            textView.setOnClickListener(new q01(gzsVar, 9));
        }
    }

    public final void setGrantAccessTextResId(int i) {
        TextView textView = this.c;
        if (textView != null) {
            textView.setText(i);
        }
    }

    public final void setMessageTextResId(int i) {
        TextView textView = this.b;
        if (textView != null) {
            textView.setText(i);
        }
    }

    public final void setOpenOtherAction(gzs<s3q0> gzsVar) {
        TextView textView = this.d;
        if (textView != null) {
            textView.setOnClickListener(new tj40(1, gzsVar));
        }
    }

    public final void setOpenOtherButtonVisibility(boolean z) {
        TextView textView = this.d;
        if (textView != null) {
            awt0.v(textView, z);
        }
    }

    public final void setOtherButtonTextResId(int i) {
        TextView textView = this.d;
        if (textView != null) {
            textView.setText(i);
        }
    }
}

package xsna;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.vkontakte.android.R;

/* compiled from: ClosedProfilePopupView.kt */
/* loaded from: classes18.dex */
public final class dwf extends FrameLayout {
    public final View b;
    public final View c;

    public dwf(Context context) {
        super(context, null, 0);
        LayoutInflater.from(context).inflate(R.layout.closed_profile_popup, (ViewGroup) this, true);
        this.b = findViewById(R.id.dismiss_button);
        this.c = findViewById(R.id.open_profile_button);
    }

    public final void setOnDismissButtonClickListener(View.OnClickListener onClickListener) {
        this.b.setOnClickListener(onClickListener);
    }

    public final void setOpenProfileClickListener(View.OnClickListener onClickListener) {
        this.c.setOnClickListener(onClickListener);
    }
}

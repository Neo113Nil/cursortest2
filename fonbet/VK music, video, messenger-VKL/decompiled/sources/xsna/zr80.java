package xsna;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.vk.catalog2.common.dto.ui.actions.UIBlockActionOpenUrl;
import com.vkontakte.android.R;

/* compiled from: OpenSectionPopupView.kt */
/* loaded from: classes16.dex */
public final class zr80 extends FrameLayout {
    public final View b;
    public final izs<UIBlockActionOpenUrl, s3q0> c;
    public UIBlockActionOpenUrl d;

    /* JADX WARN: Multi-variable type inference failed */
    public zr80(View view, izs<? super UIBlockActionOpenUrl, s3q0> izsVar) {
        super(view.getContext());
        this.b = view;
        this.c = izsVar;
        LayoutInflater.from(getContext()).inflate(R.layout.open_section_popup, (ViewGroup) this, true);
        LinearLayout linearLayout = (LinearLayout) findViewById(R.id.content);
        if (linearLayout != null) {
            linearLayout.setOnClickListener(new k6p(this, 5));
        }
    }
}

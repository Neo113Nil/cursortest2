package xsna;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.vk.core.view.OverlayTextView;
import com.vkontakte.android.R;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class ths implements bin0 {
    public final /* synthetic */ ViewGroup b;
    public final /* synthetic */ z00 c;

    public /* synthetic */ ths(ViewGroup viewGroup, z00 z00Var) {
        this.b = viewGroup;
        this.c = z00Var;
    }

    @Override // xsna.bin0
    public final Object get() {
        ViewGroup viewGroup = this.b;
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.news_button_fresh, viewGroup, false);
        inflate.setVisibility(8);
        ((OverlayTextView) inflate.findViewById(android.R.id.button1)).setOverlay(R.drawable.highlight_new_posts);
        inflate.setOnClickListener(this.c);
        viewGroup.addView(inflate);
        return inflate;
    }
}

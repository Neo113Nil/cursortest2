package xsna;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.im.ui.views.DialogListInfoBarView;

/* compiled from: VhInfoBar.kt */
/* loaded from: classes2.dex */
public final class urr0 extends RecyclerView.e0 {
    public static final /* synthetic */ int m = 0;
    public final DialogListInfoBarView l;

    public urr0(View view) {
        super(view);
        DialogListInfoBarView dialogListInfoBarView = (DialogListInfoBarView) view;
        this.l = dialogListInfoBarView;
        dialogListInfoBarView.setTextFormatter(new av70(new gdp()));
    }
}

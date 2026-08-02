package xsna;

import android.content.Context;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.vkontakte.android.R;

/* compiled from: ShadowBackground.kt */
/* loaded from: classes16.dex */
public final class w4j0 implements vbp0 {
    public final View a;

    public w4j0(Context context) {
        View view = new View(context);
        view.setBackgroundResource(R.drawable.bg_topshelf);
        ConstraintLayout.b bVar = new ConstraintLayout.b(-1, (int) (context.getResources().getDisplayMetrics().widthPixels / 1.5625f));
        bVar.l = 0;
        view.setLayoutParams(bVar);
        this.a = view;
    }

    @Override // xsna.vbp0
    public final View getView() {
        return this.a;
    }

    @Override // xsna.vbp0
    public final void destroy() {
    }
}

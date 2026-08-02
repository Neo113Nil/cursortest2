package xsna;

import android.view.View;
import com.vk.lists.DefaultErrorView;

/* compiled from: DefaultErrorView.java */
/* loaded from: classes3.dex */
public final class nel implements View.OnClickListener {
    public final /* synthetic */ DefaultErrorView b;

    public nel(DefaultErrorView defaultErrorView) {
        this.b = defaultErrorView;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        long currentTimeMillis = System.currentTimeMillis();
        DefaultErrorView defaultErrorView = this.b;
        if (currentTimeMillis - defaultErrorView.d < 400) {
            return;
        }
        defaultErrorView.a();
        defaultErrorView.d = System.currentTimeMillis();
    }
}

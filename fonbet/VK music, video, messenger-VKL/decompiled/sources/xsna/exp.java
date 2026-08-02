package xsna;

import android.view.View;
import com.vk.libvideo.live.impl.views.error.ErrorView;

/* compiled from: ErrorView.java */
/* loaded from: classes3.dex */
public final class exp implements View.OnClickListener {
    public final /* synthetic */ ErrorView b;

    public exp(ErrorView errorView) {
        this.b = errorView;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        cvp cvpVar = this.b.e;
        if (cvpVar != null) {
            cvpVar.c();
        }
    }
}

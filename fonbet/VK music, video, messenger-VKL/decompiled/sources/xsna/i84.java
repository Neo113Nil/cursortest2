package xsna;

import android.view.View;
import com.vkontakte.android.R;

/* compiled from: AttachmentsEditorView.java */
/* loaded from: classes7.dex */
public final class i84 implements Runnable {
    public final /* synthetic */ View b;

    public i84(View view) {
        this.b = view;
    }

    @Override // java.lang.Runnable
    public final void run() {
        u1u0.n(8, this.b.findViewById(R.id.attach_progress));
    }
}

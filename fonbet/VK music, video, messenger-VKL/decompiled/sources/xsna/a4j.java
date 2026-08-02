package xsna;

import android.view.View;
import com.vk.channels.impl.comments.e;
import com.vkontakte.android.R;

/* compiled from: ConnectionErrorHolder.kt */
/* loaded from: classes16.dex */
public final class a4j extends vfz<b4j> {
    public final View l;

    /* compiled from: ConnectionErrorHolder.kt */
    public interface a {
        void k();
    }

    public a4j(View view, e.a aVar) {
        super(view);
        View findViewById = view.findViewById(R.id.error_retry);
        this.l = findViewById;
        bwt0.i0(findViewById, new wje(aVar, 9));
    }

    @Override // xsna.vfz
    public final /* bridge */ /* synthetic */ void W5(b4j b4jVar) {
    }
}

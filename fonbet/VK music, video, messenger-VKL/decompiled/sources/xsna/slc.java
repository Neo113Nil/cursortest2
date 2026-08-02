package xsna;

import android.content.Context;
import com.vk.bridges.di.BridgeComponent;
import com.vkontakte.android.R;
import xsna.ikv0;

/* compiled from: ClipActionButtonFooterClickHandler.kt */
/* loaded from: classes4.dex */
public final class slc {
    public final Context a;
    public final BridgeComponent b;
    public final p20 c;
    public io.reactivex.rxjava3.disposables.c d;

    public slc(Context context, BridgeComponent bridgeComponent, p20 p20Var) {
        this.a = context;
        this.b = bridgeComponent;
        this.c = p20Var;
    }

    public final void a() {
        Context context = this.a;
        String string = context.getString(R.string.clips_full_video_snackbar_error_title);
        ikv0.a aVar = new ikv0.a(context);
        aVar.t = ikv0.c.b.a;
        aVar.u = new ikv0.d(new ikv0.d.c(string), (ikv0.d.b) null, (ikv0.d.a) null, 6);
        aVar.n();
    }
}

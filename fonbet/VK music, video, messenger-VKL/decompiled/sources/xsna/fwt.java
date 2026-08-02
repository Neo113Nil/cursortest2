package xsna;

import android.app.Activity;
import com.vk.dto.hints.Hint;
import com.vkontakte.android.MainActivity;
import java.lang.ref.WeakReference;
import xsna.c63;

/* compiled from: GetUnbanRecommendationsTask.kt */
/* loaded from: classes7.dex */
public final class fwt extends c63.b {
    public final /* synthetic */ io.reactivex.rxjava3.core.y<g8e0> b;
    public final /* synthetic */ Hint c;

    public fwt(io.reactivex.rxjava3.core.y<g8e0> yVar, Hint hint) {
        this.b = yVar;
        this.c = hint;
    }

    @Override // xsna.c63.b
    public final void p(Activity activity) {
        if (activity instanceof MainActivity) {
            this.b.onSuccess(new g8e0(this.c, new WeakReference(activity)));
        }
    }
}

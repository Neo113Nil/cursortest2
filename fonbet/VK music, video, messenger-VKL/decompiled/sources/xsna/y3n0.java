package xsna;

import android.app.Activity;
import android.content.Context;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.core.fragments.FragmentImpl;
import com.vkontakte.android.R;
import com.vungle.ads.internal.protos.Sdk;
import kotlin.Lazy;
import xsna.ikv0;

/* compiled from: SuggestedPostsEventsHandler.kt */
/* loaded from: classes4.dex */
public final class y3n0 {
    public final mo60 a;
    public bin0<Context> b;
    public bin0<FragmentImpl> c;
    public bin0<RecyclerView> d;
    public bin0<Activity> e;
    public final Lazy f;

    public y3n0(mo60 mo60Var, Lazy lazy, bin0 bin0Var, a4n0 a4n0Var, b4n0 b4n0Var, rvh rvhVar) {
        this.a = mo60Var;
        this.b = bin0Var;
        this.c = a4n0Var;
        this.d = b4n0Var;
        this.e = rvhVar;
        this.f = lazy;
    }

    public static void a(Context context, String str, com.vk.catalog2.common.ui.holders.b bVar, FragmentImpl fragmentImpl) {
        ikv0.a aVar = new ikv0.a(context);
        aVar.t = ikv0.c.f.a;
        aVar.u = new ikv0.d(str, (String) null, (ikv0.d.a) null, 6);
        aVar.e = 4000L;
        if (bVar != null) {
            aVar.s = new ikv0.e.a(Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE, context.getString(R.string.comment_action_sb_cancel), new vth(3, bVar));
            aVar.e = 10000L;
        }
        ikv0 f = pkv0.f(aVar);
        if (f != null) {
            pkv0.b(f, fragmentImpl);
        }
    }
}

package xsna;

import android.app.Activity;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Lifecycle;
import com.vk.api.sdk.exceptions.VKApiExecutionException;
import com.vk.music.haptic.MusicHapticEvent;
import com.vkontakte.android.R;
import com.vungle.ads.internal.protos.Sdk;
import xsna.ikv0;
import xsna.sx40;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes17.dex */
public final /* synthetic */ class p2i implements gzs {
    public final /* synthetic */ int b = 1;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ p2i(View view, izs izsVar, boolean z) {
        this.d = view;
        this.e = izsVar;
        this.c = z;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        Lifecycle lifecycle;
        Lifecycle.State currentState;
        switch (this.b) {
            case 0:
                VKApiExecutionException vKApiExecutionException = (VKApiExecutionException) this.d;
                boolean z = this.c;
                r2i r2iVar = (r2i) this.e;
                c63 c63Var = c63.a;
                Activity b = c63.b();
                if (b != null) {
                    Integer num = r2i.c.get(Integer.valueOf(vKApiExecutionException.C()));
                    String string = b.getString(num != null ? num.intValue() : R.string.community_strike_error_default_header);
                    mhy.b(b);
                    if (z) {
                        String string2 = b.getString(R.string.community_strike_error_more_info);
                        w37 w37Var = new w37(r2iVar, b, string, vKApiExecutionException, 1);
                        AppCompatActivity appCompatActivity = b instanceof AppCompatActivity ? (AppCompatActivity) b : null;
                        if (appCompatActivity != null) {
                            ikv0.a aVar = new ikv0.a(appCompatActivity);
                            aVar.t = ikv0.c.b.a;
                            aVar.u = new ikv0.d(string, (String) null, new ikv0.d.a(string2, null, w37Var, Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE), 2);
                            if (!c63.f || (lifecycle = appCompatActivity.getLifecycle()) == null || (currentState = lifecycle.getCurrentState()) == null || currentState.a(Lifecycle.State.RESUMED)) {
                                pkv0.f(aVar);
                            } else {
                                c63.a(new q2i(aVar));
                            }
                        }
                    } else {
                        ((u2i) r2iVar.b.getValue()).a(b, string, vKApiExecutionException.t());
                    }
                    break;
                } else {
                    break;
                }
                break;
            default:
                View view = (View) this.d;
                izs izsVar = (izs) this.e;
                boolean z2 = this.c;
                cl40.a(view, MusicHapticEvent.LIGHT);
                izsVar.invoke(new sx40.q0(z2));
                break;
        }
        return s3q0.a;
    }

    public /* synthetic */ p2i(VKApiExecutionException vKApiExecutionException, boolean z, r2i r2iVar) {
        this.d = vKApiExecutionException;
        this.c = z;
        this.e = r2iVar;
    }
}

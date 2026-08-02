package xsna;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.vk.superapp.browser.internal.bridges.JsApiMethodType;
import com.vk.superapp.core.errors.VkAppsErrors;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.collections.EmptyList;
import org.json.JSONObject;
import xsna.bex0;

/* compiled from: VkUiKeepScreenOnCommand.kt */
/* loaded from: classes6.dex */
public final class lwv0 extends dvv0 {
    public static final List<Long> h = e43.l(7573939L, 7475344L, 7405838L, 7388073L, 7942588L, 7914181L);
    public final Fragment e;
    public final bpn0 f = new bpn0(new jkg0(11));
    public io.reactivex.rxjava3.disposables.c g;

    public lwv0(Fragment fragment) {
        this.e = fragment;
    }

    @Override // xsna.dvv0
    public final void a(String str) {
        fvv0 M;
        if (str == null) {
            return;
        }
        try {
            int i = new JSONObject(str).getInt("time");
            r6y r6yVar = this.b;
            if (!j5g.P(j5g.u0(((Boolean) this.f.getValue()).booleanValue() ? e43.l(7058363L, 51918563L, 53770070L, 7787819L, 51903111L, 53770071L) : EmptyList.b, h), (r6yVar == null || (M = r6yVar.M()) == null) ? null : Long.valueOf(M.getAppId()))) {
                r6y r6yVar2 = this.b;
                if (r6yVar2 != null) {
                    bex0.a.a(r6yVar2, JsApiMethodType.KEEP_SCREEN_ON, VkAppsErrors.Client.ACCESS_DENIED, null, null, null, 60);
                    return;
                }
                return;
            }
            if (i >= 0 && i < 1801) {
                d(i);
                return;
            }
            r6y r6yVar3 = this.b;
            if (r6yVar3 != null) {
                bex0.a.a(r6yVar3, JsApiMethodType.KEEP_SCREEN_ON, VkAppsErrors.Client.INVALID_PARAMS, null, null, null, 60);
            }
        } catch (Exception e) {
            r6y r6yVar4 = this.b;
            if (r6yVar4 != null) {
                bex0.a.a(r6yVar4, JsApiMethodType.KEEP_SCREEN_ON, VkAppsErrors.Client.INVALID_PARAMS, null, null, null, 60);
            }
            xgx0.a.getClass();
            xgx0.d(e);
        }
    }

    public final void d(int i) {
        io.reactivex.rxjava3.disposables.c cVar;
        io.reactivex.rxjava3.disposables.c cVar2;
        bpn0 bpn0Var = this.f;
        if (((Boolean) bpn0Var.getValue()).booleanValue() && (cVar = this.g) != null && !cVar.h() && (cVar2 = this.g) != null) {
            cVar2.dispose();
        }
        FragmentActivity activity = this.e.getActivity();
        if (activity != null) {
            iah0.x(activity, true);
        }
        r6y r6yVar = this.b;
        if (r6yVar != null) {
            bex0.a.b(r6yVar, JsApiMethodType.KEEP_SCREEN_ON, com.vk.movika.sdk.android.defaultplayer.interactive.c.b("result", true), null, 12);
        }
        int i2 = 6;
        io.reactivex.rxjava3.disposables.c subscribe = io.reactivex.rxjava3.core.a.r(Math.min(i, 1800), TimeUnit.SECONDS).o(io.reactivex.rxjava3.android.schedulers.a.b()).h(new rg60(this, i2)).subscribe(new sbb(this, i2), new wbs0(new bnc0(this, 29), 5));
        if (((Boolean) bpn0Var.getValue()).booleanValue()) {
            this.g = subscribe;
        }
        io.reactivex.rxjava3.disposables.b b = b();
        if (b != null) {
            b.b(subscribe);
        }
    }
}

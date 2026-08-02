package xsna;

import android.content.Context;
import com.vk.core.apps.BuildInfo;
import com.vk.dto.common.data.Subscription;
import com.vkontakte.android.R;
import xsna.ys8;

/* compiled from: BuyMusicSubscriptionComposeButton.kt */
/* loaded from: classes3.dex */
public final class at8 implements ys8.b {
    public final /* synthetic */ rk6 a;
    public final /* synthetic */ qr8 b;
    public final /* synthetic */ Context c;

    public at8(rk6 rk6Var, qr8 qr8Var, Context context) {
        this.a = rk6Var;
        this.b = qr8Var;
        this.c = context;
    }

    @Override // xsna.ys8.b
    public final void a() {
        this.a.getClass();
        qr8 qr8Var = this.b;
        qr8Var.f.setValue(Boolean.TRUE);
        qr8Var.e.setValue(Boolean.FALSE);
    }

    @Override // xsna.ys8.b
    public final void b(Subscription subscription) {
        this.a.a(this.b, subscription, this.c);
    }

    @Override // xsna.ys8.b
    public final void onError(int i) {
        String string;
        this.a.getClass();
        qr8 qr8Var = this.b;
        wh50<Boolean> wh50Var = qr8Var.f;
        Boolean bool = Boolean.FALSE;
        wh50Var.setValue(bool);
        qr8Var.e.setValue(bool);
        qr8Var.c.setValue(bool);
        qr8Var.d.setValue(bool);
        wh50<String> wh50Var2 = qr8Var.a;
        Context context = this.c;
        if (i == 1) {
            string = context.getString(R.string.music_subscription_unavailable_device);
        } else if (i == 2) {
            string = context.getString(R.string.music_subscription_unavailable_region).replace('\n', ' ');
        } else if (i == 3) {
            string = context.getString(R.string.music_subscription_unavailable_network);
        } else if (i != 5) {
            string = context.getString(R.string.music_subscription_unavailable_unknown).replace('\n', ' ');
        } else {
            string = context.getString(BuildInfo.k() ? R.string.music_subscription_unavailable_sign_in_required_huawei : BuildInfo.n() ? R.string.music_subscription_unavailable_sign_in_required_rustroe : R.string.music_subscription_unavailable_sign_in_required);
        }
        wh50Var2.setValue(string);
    }
}

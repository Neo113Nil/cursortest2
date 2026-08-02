package xsna;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.vk.bridges.di.BridgeComponent;
import com.vkontakte.android.R;
import kotlin.LazyThreadSafetyMode;

/* compiled from: MessageViewsModalFragment.kt */
/* loaded from: classes2.dex */
public final class mc20 extends ck50 {
    public static final /* synthetic */ int m1 = 0;
    public final Object l1;

    public mc20() {
        this.D = true;
        this.l1 = msy.a(LazyThreadSafetyMode.NONE, new r010(this, 2));
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.ck50
    public final yj50<?, ?, ?, ?, ?, ?, ?> Yn() {
        g9w g9wVar = (g9w) this.l1.getValue();
        return new hc20(new mo8(new xc20(new rc20(g9wVar.a, g9wVar.b, new pli(10)))), this, this, ((BridgeComponent) m7m.d(this).a(fpf0.a(BridgeComponent.class))).F());
    }

    @Override // xsna.ck50
    public final ViewGroup Zn(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return (ViewGroup) layoutInflater.inflate(R.layout.im_message_views_users_list_modal_fragment, (ViewGroup) null, false);
    }
}

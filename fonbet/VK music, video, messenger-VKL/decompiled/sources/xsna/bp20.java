package xsna;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.TextView;
import com.vk.voip.miniapps.impl.picture_in_picture.feature.data.MiniAppNetworkState;
import com.vkontakte.android.R;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.e3m;
import xsna.vo20;

/* compiled from: MiniAppCallPiPView.kt */
/* loaded from: classes7.dex */
public final /* synthetic */ class bp20 extends FunctionReferenceImpl implements izs<vo20.a, s3q0> {
    @Override // xsna.izs
    public final s3q0 invoke(vo20.a aVar) {
        vo20.a aVar2 = aVar;
        vo20 vo20Var = (vo20) this.receiver;
        View view = vo20Var.l;
        TextView textView = vo20Var.k;
        boolean z = aVar2.a;
        MiniAppNetworkState miniAppNetworkState = aVar2.b;
        if (z) {
            textView.setText(R.string.mini_app_call_reconnect);
            bwt0.p0(textView, true);
            bwt0.p0(view, true);
            textView.setCompoundDrawablesWithIntrinsicBounds(vo20Var.o, (Drawable) null, (Drawable) null, (Drawable) null);
        } else if (miniAppNetworkState != MiniAppNetworkState.GOOD) {
            textView.setText(R.string.mini_app_call_bad_network);
            bwt0.p0(textView, true);
            bwt0.p0(view, true);
            Drawable drawable = vo20Var.n;
            if (drawable != null) {
                l7s l7sVar = vo20Var.a;
                int a = vo20.a(miniAppNetworkState);
                e3m.a aVar3 = e3m.a;
                drawable.setTint(l7sVar.getColor(a));
            }
            textView.setCompoundDrawablesWithIntrinsicBounds(vo20Var.n, (Drawable) null, (Drawable) null, (Drawable) null);
        } else {
            bwt0.p0(textView, false);
            bwt0.p0(view, false);
        }
        return s3q0.a;
    }
}

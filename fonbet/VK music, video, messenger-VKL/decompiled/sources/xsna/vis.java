package xsna;

import android.graphics.drawable.ColorDrawable;
import com.vkontakte.android.R;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: FriendRequestHolderRedesign2LinesIcons.kt */
/* loaded from: classes16.dex */
public final /* synthetic */ class vis extends FunctionReferenceImpl implements gzs<s3q0> {
    @Override // xsna.gzs
    public final s3q0 invoke() {
        wis wisVar = (wis) this.receiver;
        int i = wis.P;
        wisVar.itemView.setForeground(new ColorDrawable(dhr0.t.c(R.attr.vk_legacy_button_primary_foreground_disabled)));
        wisVar.z.setVisibility(8);
        wisVar.A.setVisibility(8);
        wisVar.B.setVisibility(8);
        wisVar.C.setVisibility(8);
        wisVar.D.setVisibility(8);
        if (wisVar.K) {
            wisVar.itemView.requestLayout();
        }
        return s3q0.a;
    }
}

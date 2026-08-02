package xsna;

import android.content.Context;
import android.content.DialogInterface;
import com.vkontakte.android.R;
import xsna.h7u0;
import xsna.k840;

/* compiled from: MusicNetworkAlertDisplayerImpl.kt */
/* loaded from: classes.dex */
public final class hp40 implements ep40 {
    @Override // xsna.ep40
    public final void h(Context context, final gzs<s3q0> gzsVar) {
        h7u0.a c;
        int i = h7u0.p;
        c = h7u0.b.c(context);
        c.g0(R.string.music_confirm_downloading_by_mobile_net);
        c.U(R.string.music_confirm_downloading_by_mobile_net_description);
        c.W(R.string.music_forbid, new DialogInterface.OnClickListener() { // from class: xsna.fp40
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                dialogInterface.dismiss();
            }
        });
        c.c0(R.string.music_allow, new DialogInterface.OnClickListener() { // from class: xsna.gp40
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                k840.a.d().S(true);
                gzs.this.invoke();
                dialogInterface.dismiss();
            }
        });
        c.m();
    }
}

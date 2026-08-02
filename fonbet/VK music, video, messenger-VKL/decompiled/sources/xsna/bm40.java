package xsna;

import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import com.vk.dto.common.id.UserId;
import xsna.zl40;

/* compiled from: MusicKidsModeManagerImpl.kt */
/* loaded from: classes3.dex */
public final class bm40 implements pcs {
    public final /* synthetic */ lq9 b;

    public bm40(lq9 lq9Var) {
        this.b = lq9Var;
    }

    @Override // xsna.pcs
    public final void p(Bundle bundle, String str) {
        Parcelable parcelable;
        Object parcelable2;
        if (Build.VERSION.SDK_INT >= 33) {
            parcelable2 = bundle.getParcelable("arg_user_to_switch", UserId.class);
            parcelable = (Parcelable) parcelable2;
        } else {
            Parcelable parcelable3 = bundle.getParcelable("arg_user_to_switch");
            if (!(parcelable3 instanceof UserId)) {
                parcelable3 = null;
            }
            parcelable = (UserId) parcelable3;
        }
        UserId userId = (UserId) parcelable;
        lq9 lq9Var = this.b;
        if (userId != null) {
            lq9Var.resumeWith(zl40.a.Success);
        } else {
            lq9Var.resumeWith(zl40.a.Cancelled);
        }
    }
}

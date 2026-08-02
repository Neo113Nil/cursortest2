package xsna;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.SwitchCompat;
import com.unity3d.services.UnityAdsConstants;
import com.vkontakte.android.R;
import kotlin.Pair;
import xsna.dw20;

/* compiled from: OnlineBookingBottomSheet.kt */
/* loaded from: classes16.dex */
public final class wo80 extends dw20 {
    public final izs<Boolean, s3q0> f1;
    public boolean g1;
    public final xo80 h1 = new xo80(this, 0);

    /* compiled from: OnlineBookingBottomSheet.kt */
    public static final class a extends dw20.b {
        public final kpd e;
        public final boolean f;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public a(Context context, kpd kpdVar, boolean z) {
            super((r0 == null || r0.intValue() != dhr0.u().c) ? new l7s(context, dhr0.u().c) : context, null);
            lpj lpjVar = context instanceof lpj ? (lpj) context : null;
            Integer valueOf = lpjVar != null ? Integer.valueOf(lpjVar.getThemeResId()) : null;
            dhr0.a.getClass();
            this.e = kpdVar;
            this.f = z;
        }

        @Override // xsna.dw20.b, xsna.dw20.a
        public final dw20 f() {
            v(0);
            x(0);
            c(new ts90(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 3));
            F0(true);
            wo80 wo80Var = new wo80(this.e);
            wo80Var.setArguments(yfb.b(new Pair("online_booking", Boolean.valueOf(this.f))));
            return wo80Var;
        }
    }

    public wo80(kpd kpdVar) {
        this.f1 = kpdVar;
    }

    @Override // xsna.dw20, xsna.dh6, androidx.fragment.app.d
    public final void tn() {
        Qn(true);
        super.tn();
    }

    @Override // xsna.dw20, xsna.c33, androidx.fragment.app.d
    public final Dialog yn(Bundle bundle) {
        Context mo2getContext = mo2getContext();
        dhr0.a.getClass();
        View inflate = LayoutInflater.from(new ContextThemeWrapper(mo2getContext, dhr0.u().c)).inflate(R.layout.layout_story_online_booking, (ViewGroup) null, false);
        if (inflate != null) {
            Bundle arguments = getArguments();
            boolean z = arguments != null ? arguments.getBoolean("online_booking") : false;
            SwitchCompat switchCompat = (SwitchCompat) inflate.findViewById(R.id.share_switch_enabled);
            switchCompat.setChecked(z);
            jjc.g(inflate.findViewById(R.id.save_btn), new sh3(21, this, switchCompat));
            dw20.Rn(this, inflate, 6);
            this.e0 = new d5j(inflate);
        }
        Dialog yn = super.yn(bundle);
        final b33 b33Var = (b33) yn;
        yn.setOnShowListener(new DialogInterface.OnShowListener() { // from class: xsna.vo80
            @Override // android.content.DialogInterface.OnShowListener
            public final void onShow(DialogInterface dialogInterface) {
                ww50 v = s200.v(b33.this.getContext());
                if (v != null) {
                    v.S(this.h1);
                }
            }
        });
        return yn;
    }
}

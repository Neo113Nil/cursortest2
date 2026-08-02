package xsna;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.vk.profile.user.api.di.UserProfileComponent;
import com.vk.profile.user.api.di.UserProfileParamsComponent;
import com.vk.profile.user.impl.ui.taboptions.domain.ProfileTabOptions;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.EmptyList;
import xsna.dw20;
import xsna.gm50;
import xsna.mk50;
import xsna.xn50;
import xsna.zzd0;

/* compiled from: ProfileTabOptionsModalBottomSheet.kt */
/* loaded from: classes5.dex */
public final class c0e0 extends pyd0<a0e0, j0e0, zzd0> implements w8i {
    public static final /* synthetic */ int m1 = 0;
    public i0e0 l1;

    /* compiled from: ProfileTabOptionsModalBottomSheet.kt */
    public static final class a extends dw20.b {
        public final List<ProfileTabOptions> e;

        public a(FragmentActivity fragmentActivity, List list) {
            super(fragmentActivity, tzp0.a(null, 3));
            this.e = list;
            c(new a470());
            F0(true);
            x(0);
        }

        @Override // xsna.dw20.b, xsna.dw20.a
        public final dw20 f() {
            c0e0 c0e0Var = new c0e0();
            Bundle bundle = new Bundle();
            bundle.putSerializable("CONTENT_KEY", p4g.q(this.e));
            c0e0Var.setArguments(bundle);
            return c0e0Var;
        }
    }

    @Override // xsna.xn50
    public final mk50 Fl() {
        i0e0 i0e0Var = new i0e0(requireContext(), this, new iyd0(this, 1));
        this.l1 = i0e0Var;
        return new mk50.c((View) i0e0Var.d.getValue());
    }

    @Override // xsna.xn50
    public final void Jh(ao50 ao50Var, View view) {
        gm50.a.b(this, ((j0e0) ao50Var).a, new v4w(this, 21));
    }

    @Override // xsna.tl50, xsna.xn50
    public final void R4(vk50 vk50Var) {
        ((a0e0) vk50Var).i.a(new gda0(this, 9), this);
    }

    @Override // xsna.dw20
    public final boolean a0() {
        xn50.a.c(this, zzd0.d.b);
        return false;
    }

    @Override // androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        this.l1 = null;
        super.onDestroyView();
    }

    @Override // xsna.dw20, xsna.dh6, androidx.fragment.app.d, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        ww50 v;
        Context mo2getContext = mo2getContext();
        if (mo2getContext != null && (v = s200.v(mo2getContext)) != null) {
            v.H(this.j1);
        }
        super.onDismiss(dialogInterface);
    }

    @Override // xsna.xn50
    public final vk50 x8(Bundle bundle, km50 km50Var) {
        Serializable serializable = requireArguments().getSerializable("CONTENT_KEY");
        List list = serializable instanceof ArrayList ? (ArrayList) serializable : null;
        if (list == null) {
            list = EmptyList.b;
        }
        htq0 htq0Var = new htq0(null, null, null, null, false, null, false, null, 16383);
        return new a0e0(new f0e0(new h0e0(list)), ((UserProfileParamsComponent) ((k7m) m7m.f(this)).b(fpf0.a(UserProfileParamsComponent.class), new qmq0(htq0Var))).Y8(), list, ((UserProfileComponent) ((k7m) m7m.f(this)).mo408a(fpf0.a(UserProfileComponent.class))).mc());
    }

    @Override // xsna.pyd0, xsna.tl50, xsna.dw20, xsna.c33, androidx.fragment.app.d
    public final Dialog yn(Bundle bundle) {
        Dialog yn = super.yn(bundle);
        final b33 b33Var = (b33) yn;
        yn.setOnShowListener(new DialogInterface.OnShowListener() { // from class: xsna.b0e0
            @Override // android.content.DialogInterface.OnShowListener
            public final void onShow(DialogInterface dialogInterface) {
                int i = c0e0.m1;
                ww50 v = s200.v(b33.this.getContext());
                if (v != null) {
                    v.S(this.j1);
                }
            }
        });
        return yn;
    }
}

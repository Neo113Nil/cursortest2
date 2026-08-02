package xsna;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.vk.clips.playlists.ClipsPlaylistNamingLaunchParams;
import com.vk.clips.playlists.di.ClipsPlaylistsComponentImpl;
import com.vk.core.ui.tracking.UiTrackingScreen;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vkontakte.android.R;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import xsna.ite;
import xsna.mk50;
import xsna.tzp0;

/* compiled from: ClipsPlaylistsFolderNamingBottomSheet.kt */
/* loaded from: classes16.dex */
public final class kse extends tl50<yse, ite, jse> implements w8i {
    public static final /* synthetic */ qcy<Object>[] n1 = {new MutablePropertyReference1Impl(kse.class, "contentView", "getContentView()Lcom/vk/clips/playlists/folders/naming/ui/ClipsPlaylistsFolderNamingContentView;", 0), p5j.a(0, kse.class, "loadingContent", "getLoadingContent()Lcom/vk/clips/playlists/folders/naming/ui/ClipsPlaylistsFolderNamingLoadingDialog;", fpf0.a), new MutablePropertyReference1Impl(kse.class, "renderHolder", "getRenderHolder()Lcom/vk/mvi/compose/render/ComposeStateRenderHolder;", 0)};
    public static final tzp0.c.a o1 = new tzp0.c.a(new b(), false);
    public final bpn0 i1 = new bpn0(new na(this, 27));
    public final nf3 j1 = new nf3();
    public final nf3 k1 = new nf3();
    public final nf3 l1 = new nf3();
    public final Object m1 = msy.a(LazyThreadSafetyMode.NONE, new ra0(this, 26));

    /* compiled from: ClipsPlaylistsFolderNamingBottomSheet.kt */
    public static final class a extends wpi {
        public final ClipsPlaylistNamingLaunchParams g;

        public a(Context context, ClipsPlaylistNamingLaunchParams clipsPlaylistNamingLaunchParams) {
            super(context, kse.o1);
            this.g = clipsPlaylistNamingLaunchParams;
            T0();
            c(new a470());
            I(true);
            D();
            l(e3m.f(R.attr.vk_ui_transparent, context));
            n0(0);
            o0(0);
            p0(0);
            m0(0);
            N0();
        }

        @Override // xsna.dw20.b, xsna.dw20.a
        public final dw20 f() {
            kse kseVar = new kse();
            Bundle bundle = new Bundle();
            bundle.putParcelable("folder_input_params", this.g);
            kseVar.setArguments(bundle);
            return kseVar;
        }
    }

    /* compiled from: ClipsPlaylistsFolderNamingBottomSheet.kt */
    public static final class b implements m0q0 {
        @Override // xsna.m0q0
        public final void y(UiTrackingScreen uiTrackingScreen) {
            uiTrackingScreen.a = MobileOfficialAppsCoreNavStat$EventScreen.CLIPS_PLAYLIST_NAMING_DIALOG;
        }
    }

    @Override // xsna.xn50
    public final mk50 Fl() {
        qcy<Object>[] qcyVarArr = n1;
        xqi xqiVar = (xqi) this.l1.getValue(this, qcyVarArr[2]);
        Context requireContext = requireContext();
        ClipsPlaylistNamingLaunchParams clipsPlaylistNamingLaunchParams = (ClipsPlaylistNamingLaunchParams) requireArguments().getParcelable("folder_input_params");
        wse wseVar = new wse(xqiVar, this, requireContext, clipsPlaylistNamingLaunchParams != null ? clipsPlaylistNamingLaunchParams.d : true);
        qcy<Object> qcyVar = qcyVarArr[0];
        nf3 nf3Var = this.j1;
        nf3Var.c = wseVar;
        return new mk50.c(((wse) nf3Var.getValue(this, qcyVar)).c());
    }

    @Override // xsna.dw20
    public final nw20 Fn(int i, Context context) {
        return new npi(context, i);
    }

    @Override // xsna.xn50
    public final void Jh(ao50 ao50Var, View view) {
        ite iteVar = (ite) ao50Var;
        qcy<Object>[] qcyVarArr = n1;
        xqi xqiVar = (xqi) this.l1.getValue(this, qcyVarArr[2]);
        Context requireContext = requireContext();
        ClipsPlaylistNamingLaunchParams clipsPlaylistNamingLaunchParams = (ClipsPlaylistNamingLaunchParams) requireArguments().getParcelable("folder_input_params");
        zse zseVar = new zse(xqiVar, this, requireContext, clipsPlaylistNamingLaunchParams != null ? clipsPlaylistNamingLaunchParams.d : true);
        qcy<Object> qcyVar = qcyVarArr[1];
        nf3 nf3Var = this.k1;
        nf3Var.c = zseVar;
        int i = 0;
        int i2 = 4;
        ((zse) nf3Var.getValue(this, qcyVar)).f(iteVar, new t50(1, this, kse.class, "sendAction", "sendAction(Lcom/vk/mvi/core/data/MviAction;)V", i, i2));
        ((wse) this.j1.getValue(this, qcyVarArr[0])).f(iteVar, new yp1(1, this, kse.class, "sendAction", "sendAction(Lcom/vk/mvi/core/data/MviAction;)V", i, i2));
    }

    @Override // xsna.tl50, xsna.xn50
    public final void R4(vk50 vk50Var) {
        yse yseVar = (yse) vk50Var;
        cm50<VS, P, S> cm50Var = yseVar.c;
        xqi xqiVar = new xqi(ite.a.b.a, this, e43.l(((ite) cm50Var.g()).a, ((ite) cm50Var.g()).b));
        qcy<Object> qcyVar = n1[2];
        this.l1.c = xqiVar;
        yseVar.k.a(new fm0(this, 21), this);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Dialog dialog = this.s;
        if (dialog != null) {
            dialog.addContentView(((zse) this.k1.getValue(this, n1[1])).d, new ViewGroup.LayoutParams(-1, -1));
        }
        return super.onCreateView(layoutInflater, viewGroup, bundle);
    }

    /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.xn50
    public final vk50 x8(Bundle bundle, km50 km50Var) {
        ?? r7 = this.m1;
        return new yse(((ClipsPlaylistNamingLaunchParams) r7.getValue()).c, ((ClipsPlaylistNamingLaunchParams) r7.getValue()).b, ((ClipsPlaylistsComponentImpl) this.i1.getValue()).Ef(), ((ClipsPlaylistNamingLaunchParams) r7.getValue()).f, ((ClipsPlaylistNamingLaunchParams) r7.getValue()).g);
    }
}

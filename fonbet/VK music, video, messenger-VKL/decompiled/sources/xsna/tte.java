package xsna;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import com.vk.clips.playlists.ClipsPlaylistsFolderLaunchParams;
import com.vk.clips.playlists.di.ClipsPlaylistsComponentImpl;
import com.vk.clips.sdk.shared.api.playlist.ClipsPlaylist;
import com.vk.core.ui.tracking.UiTrackingScreen;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vkontakte.android.R;
import kotlin.Pair;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import xsna.cue;
import xsna.mk50;
import xsna.tzp0;

/* compiled from: ClipsPlaylistsFoldersMviBottomSheet.kt */
/* loaded from: classes16.dex */
public final class tte extends tl50<ste, cue, jte> implements w8i {
    public final bpn0 i1 = new bpn0(new com.vk.newsfeed.posting.mediapicker.photovk.base.a(this, 26));
    public final bpn0 j1 = new bpn0(new f1(this, 22));
    public final nf3 k1 = new nf3();
    public final nf3 l1 = new nf3();
    public final nf3 m1 = new nf3();
    public final nf3 n1 = new nf3();
    public static final /* synthetic */ qcy<Object>[] p1 = {new MutablePropertyReference1Impl(tte.class, "contentView", "getContentView()Lcom/vk/clips/playlists/folders/list/ClipsPlaylistsFoldersContentView;", 0), p5j.a(0, tte.class, "bottomContentView", "getBottomContentView()Lcom/vk/clips/playlists/folders/list/ClipsPlaylistsFoldersBottomContentView;", fpf0.a), new MutablePropertyReference1Impl(tte.class, "renderHolder", "getRenderHolder()Lcom/vk/mvi/compose/render/ComposeStateRenderHolder;", 0), new MutablePropertyReference1Impl(tte.class, "inputParams", "getInputParams()Lcom/vk/clips/playlists/ClipsPlaylistsFolderLaunchParams;", 0)};
    public static final c o1 = new c();
    public static final int q1 = (int) (iah0.f().heightPixels * 0.8f);
    public static final tzp0.c.a r1 = new tzp0.c.a(new b(), false);

    /* compiled from: ClipsPlaylistsFoldersMviBottomSheet.kt */
    public static final class a extends wpi {
        public final ClipsPlaylistsFolderLaunchParams g;

        public a(Context context, ClipsPlaylistsFolderLaunchParams clipsPlaylistsFolderLaunchParams) {
            super(context, tte.r1);
            this.g = clipsPlaylistsFolderLaunchParams;
            cpo cpoVar = new cpo(false, 0, 7);
            tte.o1.getClass();
            cpoVar.e = tte.q1;
            c(cpoVar);
            w();
            t();
            boolean z = clipsPlaylistsFolderLaunchParams.c;
            if (z) {
                bwt0.u(context);
            }
            if (z) {
                dhr0.a.getClass();
            }
            l(dhr0.Y(R.attr.vk_ui_background_content, context));
            v0(clipsPlaylistsFolderLaunchParams.b.equals(ClipsPlaylistsFolderLaunchParams.FoldersLaunchType.Reorder.b) ? R.string.clips_playlist_order_title : R.string.clips_playlist_choose_title);
        }

        @Override // xsna.dw20.b, xsna.dw20.a
        public final dw20 f() {
            tte tteVar = new tte();
            Bundle bundle = new Bundle();
            bundle.putParcelable("folder_input_params", this.g);
            tteVar.setArguments(bundle);
            return tteVar;
        }
    }

    /* compiled from: ClipsPlaylistsFoldersMviBottomSheet.kt */
    public static final class b implements m0q0 {
        @Override // xsna.m0q0
        public final void y(UiTrackingScreen uiTrackingScreen) {
            uiTrackingScreen.a = MobileOfficialAppsCoreNavStat$EventScreen.CLIPS_PLAYLISTS_LIST;
        }
    }

    /* compiled from: ClipsPlaylistsFoldersMviBottomSheet.kt */
    public static final class c {
    }

    @Override // xsna.xn50
    public final mk50 Fl() {
        qcy<Object>[] qcyVarArr = p1;
        xqi xqiVar = (xqi) this.m1.getValue(this, qcyVarArr[2]);
        Context requireContext = requireContext();
        ClipsPlaylistsFolderLaunchParams clipsPlaylistsFolderLaunchParams = (ClipsPlaylistsFolderLaunchParams) requireArguments().getParcelable("folder_input_params");
        pte pteVar = new pte(xqiVar, requireContext, this, q1, clipsPlaylistsFolderLaunchParams != null ? clipsPlaylistsFolderLaunchParams.c : true);
        qcy<Object> qcyVar = qcyVarArr[0];
        nf3 nf3Var = this.k1;
        nf3Var.c = pteVar;
        return new mk50.c(((pte) nf3Var.getValue(this, qcyVar)).c());
    }

    @Override // xsna.xn50
    public final void Jh(ao50 ao50Var, View view) {
        ((pte) this.k1.getValue(this, p1[0])).f((cue) ao50Var, new kf8(1, this, tte.class, "sendAction", "sendAction(Lcom/vk/mvi/core/data/MviAction;)V", 0, 3));
    }

    @Override // xsna.tl50, xsna.xn50
    public final void R4(vk50 vk50Var) {
        ste steVar = (ste) vk50Var;
        cm50<VS, P, S> cm50Var = steVar.c;
        xqi xqiVar = new xqi(cue.a.c.a, this, e43.l(((cue) cm50Var.g()).a, ((cue) cm50Var.g()).b, ((cue) cm50Var.g()).c));
        qcy<Object> qcyVar = p1[2];
        this.m1.c = xqiVar;
        steVar.j.a(new com.vk.movika.sdk.base.data.a(this, 26), this);
        steVar.k.a(new com.vk.newsfeed.posting.impl.presentation.base.fragment.a(this, 23), this);
    }

    @Override // xsna.tl50
    public final void Yn(cue cueVar, View view) {
        ((lte) this.l1.getValue(this, p1[1])).f(cueVar, new jnb(1, this, tte.class, "sendAction", "sendAction(Lcom/vk/mvi/core/data/MviAction;)V", 0, 2));
    }

    @Override // xsna.tl50
    public final mk50 Zn() {
        qcy<Object>[] qcyVarArr = p1;
        xqi xqiVar = (xqi) this.m1.getValue(this, qcyVarArr[2]);
        Context requireContext = requireContext();
        ClipsPlaylistsFolderLaunchParams clipsPlaylistsFolderLaunchParams = (ClipsPlaylistsFolderLaunchParams) requireArguments().getParcelable("folder_input_params");
        lte lteVar = new lte(xqiVar, requireContext, this, clipsPlaylistsFolderLaunchParams != null ? clipsPlaylistsFolderLaunchParams.c : true);
        qcy<Object> qcyVar = qcyVarArr[1];
        nf3 nf3Var = this.l1;
        nf3Var.c = lteVar;
        return new mk50.c(((lte) nf3Var.getValue(this, qcyVar)).c());
    }

    public final void bo(ClipsPlaylist clipsPlaylist, boolean z) {
        String str;
        ClipsPlaylistsFolderLaunchParams clipsPlaylistsFolderLaunchParams = (ClipsPlaylistsFolderLaunchParams) requireArguments().getParcelable("folder_input_params");
        if (clipsPlaylistsFolderLaunchParams == null || (str = clipsPlaylistsFolderLaunchParams.d) == null) {
            return;
        }
        getParentFragmentManager().k0(yfb.b(z ? new Pair("playlist_selected", clipsPlaylist) : new Pair("playlist_deselected", clipsPlaylist)), str);
    }

    @Override // xsna.xn50
    public final vk50 x8(Bundle bundle, km50 km50Var) {
        ClipsPlaylistsFolderLaunchParams clipsPlaylistsFolderLaunchParams = (ClipsPlaylistsFolderLaunchParams) bundle.getParcelable("folder_input_params");
        if (clipsPlaylistsFolderLaunchParams == null) {
            throw new IllegalArgumentException("You must provide input params via bundle. See ClipsPlaylistsFolderLaunchParams.kt");
        }
        qcy<Object>[] qcyVarArr = p1;
        qcy<Object> qcyVar = qcyVarArr[3];
        nf3 nf3Var = this.n1;
        nf3Var.c = clipsPlaylistsFolderLaunchParams;
        return new ste(((ClipsPlaylistsFolderLaunchParams) nf3Var.getValue(this, qcyVar)).b, ((ClipsPlaylistsComponentImpl) this.i1.getValue()).Ef(), ((ClipsPlaylistsFolderLaunchParams) nf3Var.getValue(this, qcyVarArr[3])).e, (mhd) this.j1.getValue());
    }
}

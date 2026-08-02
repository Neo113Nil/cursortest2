package xsna;

import android.animation.ValueAnimator;
import android.app.Dialog;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.fragment.app.FragmentActivity;
import com.google.android.material.appbar.AppBarLayout;
import com.vk.attachpicker.adapter.PhotoSmallAdapter;
import com.vk.attachpicker.fragment.gallery.GalleryFragmentImpl;
import com.vk.clips.coauthors.di.ClipsCoauthorsComponent;
import com.vk.clips.design.view.stikers.ClipsStickersView;
import com.vk.clips.upload.vk.ui.api.ClipsUploadScreenStaticConfig;
import com.vk.clips.upload.vk.ui.impl.fragment.ClipsUploadFragmentImpl;
import com.vk.core.view.components.button.VkButton;
import com.vk.dialogsscreen.impl.DialogsScreenFragment;
import com.vk.friends.recommendations.impl.presentation.FriendsRecommendationsFragment;
import com.vk.friends.requests.impl.requests.presentation.FriendRequestsFragment;
import com.vk.games.di.GamesCatalogComponent;
import com.vk.games.presentation.catalog.GamesCatalogFragment;
import com.vk.musc.kidsmode.api.di.MusicKidsModeComponent;
import com.vk.music.playlist.display.audiobook.presentation.fragment.DisplayAudioBookChaptersFragment;
import com.vk.newsfeed.api.di.NewsFeedComponent;
import com.vk.newsfeed.impl.fragments.EntriesListFragment;
import com.vk.profile.community.creationonboarding.api.models.CommunityCreationOnboardingFinishArguments;
import com.vk.profile.community.impl.ui.profile.actions.CommunityProfileAction;
import com.vkontakte.android.R;
import kotlin.NoWhenBranchMatchedException;
import ru.ok.android.externcalls.sdk.id.peer.PeerIdGenerator;
import xsna.ahs;
import xsna.c8p;
import xsna.f0p;
import xsna.gz10;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class i5f implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ i5f(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v70, types: [java.io.File] */
    /* JADX WARN: Type inference failed for: r0v9, types: [android.os.Parcelable] */
    @Override // xsna.gzs
    public final Object invoke() {
        Parcelable parcelable;
        Object parcelable2;
        CommunityCreationOnboardingFinishArguments communityCreationOnboardingFinishArguments;
        AppBarLayout appBarLayout;
        float f;
        int i = this.b;
        int i2 = 2;
        Object obj = this.c;
        switch (i) {
            case 0:
                int i3 = ClipsStickersView.Q;
                ((ClipsStickersView) obj).invalidate();
                return s3q0.a;
            case 1:
                return (ClipsCoauthorsComponent) ((rdf) obj).d.mo408a(fpf0.a(ClipsCoauthorsComponent.class));
            case 2:
                String str = ClipsUploadFragmentImpl.a0;
                Bundle arguments = ((ClipsUploadFragmentImpl) obj).getArguments();
                if (arguments != null) {
                    if (Build.VERSION.SDK_INT >= 33) {
                        parcelable2 = arguments.getParcelable("clip_upload_screen_static_config", ClipsUploadScreenStaticConfig.class);
                        parcelable = (Parcelable) parcelable2;
                    } else {
                        ?? parcelable3 = arguments.getParcelable("clip_upload_screen_static_config");
                        parcelable = (ClipsUploadScreenStaticConfig) (parcelable3 instanceof ClipsUploadScreenStaticConfig ? parcelable3 : null);
                    }
                    ClipsUploadScreenStaticConfig clipsUploadScreenStaticConfig = (ClipsUploadScreenStaticConfig) parcelable;
                    if (clipsUploadScreenStaticConfig != null) {
                        return clipsUploadScreenStaticConfig;
                    }
                }
                return ClipsUploadScreenStaticConfig.m;
            case 3:
                return ((r2g) obj).g;
            case 4:
                qcy<Object>[] qcyVarArr = nzg.k1;
                Bundle arguments2 = ((nzg) obj).getArguments();
                return (arguments2 == null || (communityCreationOnboardingFinishArguments = (CommunityCreationOnboardingFinishArguments) arguments2.getParcelable("arguments_key")) == null) ? CommunityCreationOnboardingFinishArguments.g : communityCreationOnboardingFinishArguments;
            case 5:
                ((d3h) ((d4h) obj).c.invoke()).c.h();
                return s3q0.a;
            case 6:
                ((cbh) obj).j.h();
                return s3q0.a;
            case 7:
                ((mph) obj).l.invoke(new CommunityProfileAction.o(true));
                return s3q0.a;
            case 8:
                return new bqh(((lrh) obj).s());
            case 9:
                ((ryh) obj).g = null;
                return s3q0.a;
            case 10:
                return ((j2j) obj).itemView.findViewById(R.id.voip_assign_randomly_in_progress);
            case 11:
                return Long.valueOf(((PeerIdGenerator) obj).generatePeerId());
            case 12:
                ((yok0) obj).b(null);
                return s3q0.a;
            case 13:
                hrk hrkVar = (hrk) obj;
                ValueAnimator valueAnimator = hrkVar.f;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
                hrkVar.f = null;
                hrkVar.d.removeCallbacks(hrkVar.g);
                hrkVar.c.invoke();
                return s3q0.a;
            case 14:
                return "Updates source event : " + ((sxp) obj);
            case 15:
                int i4 = DialogsScreenFragment.p0;
                View view = ((DialogsScreenFragment) obj).getView();
                if (view != null && (appBarLayout = (AppBarLayout) view.findViewById(R.id.dialogs_toolbar_container)) != null) {
                    appBarLayout.g(true, false, true);
                }
                return s3q0.a;
            case 16:
                int i5 = DisplayAudioBookChaptersFragment.b0;
                return ((MusicKidsModeComponent) m7m.d((DisplayAudioBookChaptersFragment) obj).a(fpf0.a(MusicKidsModeComponent.class))).T9();
            case 17:
                djo djoVar = (djo) obj;
                LayoutInflater from = LayoutInflater.from(djoVar.k);
                ViewGroup viewGroup = djoVar.b;
                View inflate = from.inflate(R.layout.draw_tool_controls_top, viewGroup, false);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) inflate.getLayoutParams();
                layoutParams.gravity = 48;
                inflate.setLayoutParams(layoutParams);
                djoVar.u = inflate.findViewById(R.id.button_cancel);
                djoVar.x = inflate.findViewById(R.id.button_apply);
                djoVar.v = inflate.findViewById(R.id.button_draw_undo);
                djoVar.w = inflate.findViewById(R.id.button_draw_redo);
                View view2 = djoVar.u;
                if (view2 != null) {
                    view2.setOnClickListener(new ra6(djoVar, i2));
                }
                View view3 = djoVar.x;
                if (view3 != null) {
                    view3.setOnClickListener(new sa6(djoVar, 3));
                }
                View view4 = djoVar.v;
                if (view4 != null) {
                    view4.setOnClickListener(new f9(djoVar, 7));
                }
                View view5 = djoVar.w;
                if (view5 != null) {
                    view5.setOnClickListener(new dd6(djoVar, i2));
                }
                djoVar.u();
                viewGroup.addView(inflate);
                return inflate;
            case 18:
                f0p.d dVar = (f0p.d) obj;
                f0p.this.B.F1(!r0.g1());
                dVar.c();
                return s3q0.a;
            case 19:
                c8p c8pVar = (c8p) obj;
                c8p.b bVar = c8p.n1;
                Dialog dialog = c8pVar.s;
                if (dialog == null) {
                    return s3q0.a;
                }
                nwk nwkVar = new nwk(c8pVar, 5);
                nw20 nw20Var = dialog instanceof nw20 ? (nw20) dialog : null;
                if (nw20Var != null) {
                    nw20Var.Y0 = nwkVar;
                }
                return s3q0.a;
            case 20:
                int i6 = EntriesListFragment.m0;
                return (NewsFeedComponent) m7m.d((EntriesListFragment) obj).a(fpf0.a(NewsFeedComponent.class));
            case 21:
                gzs<s3q0> gzsVar = ((txq) obj).i;
                if (gzsVar != null) {
                    gzsVar.invoke();
                }
                return s3q0.a;
            case 22:
                ?? r0 = ((iar) obj).h;
                return "Directory " + (r0 != 0 ? r0 : null) + " does not exist";
            case 23:
                m1s m1sVar = (m1s) obj;
                m1sVar.i.a();
                m1sVar.j.b();
                return s3q0.a;
            case 24:
                return new ahs.c((ahs) obj);
            case 25:
                int i7 = FriendRequestsFragment.d0;
                FragmentActivity activity = ((FriendRequestsFragment) obj).getActivity();
                if (activity != null) {
                    activity.onBackPressed();
                }
                return s3q0.a;
            case 26:
                return (VkButton) ((wls) obj).itemView.findViewById(R.id.hide);
            case 27:
                int i8 = FriendsRecommendationsFragment.b0;
                h3p0.b((FriendsRecommendationsFragment) obj);
                return s3q0.a;
            case 28:
                GalleryFragmentImpl galleryFragmentImpl = (GalleryFragmentImpl) obj;
                t4t t4tVar = galleryFragmentImpl.R;
                int i9 = GalleryFragmentImpl.d.$EnumSwitchMapping$0[(t4tVar.o ? PhotoSmallAdapter.PreviewType.Long : t4tVar.p ? PhotoSmallAdapter.PreviewType.Preview15 : t4tVar.B ? PhotoSmallAdapter.PreviewType.Short : PhotoSmallAdapter.PreviewType.Default).ordinal()];
                if (i9 == 1) {
                    f = 1.33f;
                } else if (i9 == 2) {
                    f = 1.5f;
                } else if (i9 == 3) {
                    f = 0.5f;
                } else {
                    if (i9 != 4) {
                        throw new NoWhenBranchMatchedException();
                    }
                    f = 1.0f;
                }
                return galleryFragmentImpl.q0.d(galleryFragmentImpl.requireContext(), f, new gz10.a(new t2l(galleryFragmentImpl, 10), new yce(galleryFragmentImpl, 22), new kbe(galleryFragmentImpl, 25)));
            default:
                int i10 = GamesCatalogFragment.i0;
                return (GamesCatalogComponent) m7m.d((GamesCatalogFragment) obj).a(fpf0.a(GamesCatalogComponent.class));
        }
    }
}

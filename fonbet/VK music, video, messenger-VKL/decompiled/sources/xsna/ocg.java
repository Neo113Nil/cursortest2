package xsna;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.drawable.InsetDrawable;
import android.os.Bundle;
import android.widget.TextView;
import com.unity3d.services.UnityAdsConstants;
import com.vk.attachpicker.fragment.gallery.GalleryFragmentImpl;
import com.vk.attachpicker.fragment.gallery.GalleryFragmentImpl.e;
import com.vk.bridges.di.BridgeComponent;
import com.vk.core.view.components.button.VkSimpleButton;
import com.vk.dto.user.RequestUserProfile;
import com.vk.friends.impl.friends.presentation.fragment.FriendsSelectionFragment;
import com.vk.friends.recommendations.impl.presentation.FriendsImportFragment;
import com.vk.im.engine.di.ImCmdDirectExecutorComponent;
import com.vk.im.engine.di.executor.ImCmdDirectExecutorScopedComponentImpl;
import com.vk.im.ui.components.dialog_header.DialogHeaderController;
import com.vk.im.ui.fragments.chat.ChatFragment;
import com.vk.lists.RecyclerPaginatedView;
import com.vk.music.playlist.display.presentation.DisplayMusicPlaylistFragment;
import com.vk.music.subscription.api.di.MusicSubscriptionComponent;
import com.vk.newsfeed.impl.fave_feed.presentation.fragment.FaveFeedFragment;
import com.vk.newsfeed.impl.fragments.CommentThreadFragment;
import com.vk.profile.community.address.impl.presentation.CommunityAddressesFragment;
import com.vk.profile.community.creationonboarding.api.models.CreationOnboardingArguments;
import com.vk.profile.community.impl.ui.profile.CommunityProfileFragment;
import com.vk.profile.community.impl.ui.profile.actions.CommunityProfileAction;
import com.vkontakte.android.R;
import java.util.ArrayList;
import kotlin.Lazy;
import xsna.e3m;
import xsna.fss;
import xsna.mem;
import xsna.o2j;
import xsna.p2s;
import xsna.s1c0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class ocg implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ ocg(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.gzs
    public final Object invoke() {
        CreationOnboardingArguments creationOnboardingArguments;
        switch (this.b) {
            case 0:
                CommentThreadFragment commentThreadFragment = (CommentThreadFragment) this.c;
                ArrayList<dl60> arrayList = CommentThreadFragment.y0;
                return ((BridgeComponent) m7m.d(commentThreadFragment).a(fpf0.a(BridgeComponent.class))).s();
            case 1:
                return ((xeg) this.c).m;
            case 2:
                CommunityAddressesFragment.g gVar = ((CommunityAddressesFragment) this.c).S;
                (gVar != null ? gVar : null).h();
                return s3q0.a;
            case 3:
                c1h c1hVar = (c1h) this.c;
                return Float.valueOf(((Number) c1hVar.n.getValue()).floatValue() * (c1hVar.b.I0(6) + c1hVar.w()));
            case 4:
                return new oeh((peh) this.c);
            case 5:
                CommunityProfileFragment communityProfileFragment = (CommunityProfileFragment) this.c;
                int i = CommunityProfileFragment.k0;
                return new woh(new n8(communityProfileFragment, 4));
            case 6:
                ((y89) this.c).invoke(new CommunityProfileAction.e.g.a(null));
                return s3q0.a;
            case 7:
                return (VkSimpleButton) ((s5i) this.c).a.findViewById(R.id.nativeads_call_to_action);
            case 8:
                return (TextView) ((z0j) this.c).itemView.findViewById(R.id.voip_participants_section_title);
            case 9:
                a2j a2jVar = (a2j) this.c;
                a2jVar.g.a.X();
                a2jVar.T(o2j.v.b);
                return s3q0.a;
            case 10:
                a7k a7kVar = (a7k) this.c;
                return Integer.valueOf(a7kVar.c ? ((Number) a7kVar.g.getValue()).intValue() + a7kVar.i + a7kVar.j : 0);
            case 11:
                fck fckVar = (fck) this.c;
                qcy<Object>[] qcyVarArr = fck.t1;
                Bundle arguments = fckVar.getArguments();
                return (arguments == null || (creationOnboardingArguments = (CreationOnboardingArguments) arguments.getParcelable("arguments_key")) == null) ? CreationOnboardingArguments.i : creationOnboardingArguments;
            case 12:
                mem.a aVar = ((sem) this.c).l;
                if (aVar != null) {
                    mem memVar = mem.this;
                    DialogHeaderController.b bVar = memVar.t;
                    if (bVar != null) {
                        bVar.a();
                    }
                    DialogHeaderController.b bVar2 = memVar.t;
                    if (bVar2 != null) {
                        com.vk.im.ui.components.msg_list.a aVar2 = ChatFragment.this.H0;
                        (aVar2 != null ? aVar2 : null).o2();
                    }
                }
                return s3q0.a;
            case 13:
                DisplayMusicPlaylistFragment displayMusicPlaylistFragment = (DisplayMusicPlaylistFragment) this.c;
                int i2 = DisplayMusicPlaylistFragment.b0;
                return ((MusicSubscriptionComponent) m7m.d(displayMusicPlaylistFragment).a(fpf0.a(MusicSubscriptionComponent.class))).q1();
            case 14:
                boo booVar = (boo) this.c;
                Context context = booVar.b.getContext();
                e3m.a aVar3 = e3m.a;
                InsetDrawable insetDrawable = new InsetDrawable(m33.a(R.drawable.vk_icon_lock_12, context), booVar.e, 0, 0, 0);
                insetDrawable.setTint(booVar.b.getContext().getColor(R.color.vk_white));
                return insetDrawable;
            case 15:
                return (b25) ((Lazy) this.c).getValue();
            case 16:
                FaveFeedFragment faveFeedFragment = (FaveFeedFragment) this.c;
                qcy<Object>[] qcyVarArr2 = FaveFeedFragment.s0;
                s1c0.a aVar4 = new s1c0.a();
                aVar4.b = true;
                sf2 sf2Var = new sf2();
                sf2Var.b = faveFeedFragment.j0.get();
                aVar4.s = sf2Var.a();
                return aVar4.a();
            case 17:
                return Integer.valueOf(krv0.m(R.attr.vk_ui_overlay_secondary, (l7s) this.c));
            case 18:
                o4r o4rVar = (o4r) this.c;
                o4rVar.k1.invoke(((zak0) o4rVar.j1).getValue());
                o4rVar.dismiss();
                return s3q0.a;
            case 19:
                return ((com.vk.newsfeed.common.recycler.holders.a) this.c).itemView.findViewById(R.id.likes_panel_actions_container);
            case 20:
                ((r2s) this.c).a.onNext(p2s.h.b);
                return s3q0.a;
            case 21:
                ((zak0) ((v1z) this.c).j).setValue("");
                return s3q0.a;
            case 22:
                yis yisVar = (yis) this.c;
                yisVar.n.a(new fss.a((RequestUserProfile) yisVar.m));
                return s3q0.a;
            case 23:
                RecyclerPaginatedView recyclerPaginatedView = ((FriendsImportFragment) this.c).U;
                if (recyclerPaginatedView != null) {
                    return recyclerPaginatedView.getRecyclerView();
                }
                return null;
            case 24:
                h3p0.b((FriendsSelectionFragment) this.c);
                return s3q0.a;
            case 25:
                GalleryFragmentImpl galleryFragmentImpl = (GalleryFragmentImpl) this.c;
                int i3 = GalleryFragmentImpl.R0;
                return new e3t(galleryFragmentImpl.new e());
            case 26:
                return (ufu) ((vfu) this.c).b.invoke(o25.a());
            case 27:
                ImCmdDirectExecutorScopedComponentImpl imCmdDirectExecutorScopedComponentImpl = (ImCmdDirectExecutorScopedComponentImpl) this.c;
                acw acwVar = imCmdDirectExecutorScopedComponentImpl.a;
                return acwVar.a ? new jzv(sdy.n(acwVar)) : ((ImCmdDirectExecutorComponent) imCmdDirectExecutorScopedComponentImpl.b.getValue()).g();
            case 28:
                qex qexVar = (qex) this.c;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f);
                ofFloat.addUpdateListener(new oex(qexVar, 0));
                ofFloat.setDuration(5000L);
                qexVar.n.getClass();
                ofFloat.setStartDelay(500L);
                return ofFloat;
            default:
                return efz.b(((a500) this.c).v.g, "...", new StringBuilder("waiting after failure for "));
        }
    }
}

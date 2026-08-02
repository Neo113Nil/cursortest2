package xsna;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.widget.Toast;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.auth.DefaultAuthActivity;
import com.vk.auth.main.AuthActivity;
import com.vk.auth.main.VkAuthMetaInfo;
import com.vk.auth.utils.VkPassportPage;
import com.vk.auth.validation.VkPassportRouterInfo;
import com.vk.catalog2.common.dto.ui.UIBlockVideo;
import com.vk.catalog2.common.ui.mvp.holder.video.showcase.ShowcaseVideoAutoPlayViewHolder;
import com.vk.core.serialize.Serializer;
import com.vk.dto.common.Peer;
import com.vk.dto.common.Source;
import com.vk.dto.common.id.UserId;
import com.vk.dto.stories.model.StoryEntry;
import com.vk.dto.stories.model.StoryOwner;
import com.vk.dto.stories.model.StoryViewAction;
import com.vk.im.ui.fragments.ImStartGroupCallFragment;
import com.vk.newsfeed.impl.newsfeed_section.presentation.base.fragment.NewsfeedSectionFragment;
import com.vk.newsfeed.impl.presentation.newsfeed_reactions.presentation.fragment.ReactionsFeedFragment;
import com.vkontakte.android.R;
import xsna.go30;
import xsna.pgn0;
import xsna.sgh0;
import xsna.w1m0;
import xsna.wpa0;
import xsna.y8g;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes15.dex */
public final /* synthetic */ class bj6 implements View.OnClickListener {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ bj6(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Type inference failed for: r1v17, types: [java.lang.Object, kotlin.Lazy] */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        UIBlockVideo uIBlockVideo;
        int i = this.b;
        int i2 = 2;
        int i3 = 0;
        Object obj = this.c;
        switch (i) {
            case 0:
                im90 tn = ((com.vk.auth.ui.checkaccess.a) obj).tn();
                tn.getClass();
                wdx0 wdx0Var = e370.f;
                if (wdx0Var == null) {
                    wdx0Var = null;
                }
                int i4 = pgn0.a.a;
                String str = wdx0Var.c().a;
                if (str == null) {
                    Context context = tn.a;
                    Toast.makeText(context, context.getString(R.string.vk_login_confirmation_user_data_error), 1).show();
                    break;
                } else {
                    VkAuthMetaInfo vkAuthMetaInfo = VkAuthMetaInfo.h;
                    wdx0 wdx0Var2 = e370.f;
                    VkPassportRouterInfo vkPassportRouterInfo = new VkPassportRouterInfo(str, null, vkAuthMetaInfo, (wdx0Var2 != null ? wdx0Var2 : null).c().f, VkPassportPage.PAGE_SECURITY);
                    oju0 oju0Var = tn.c;
                    DefaultAuthActivity defaultAuthActivity = DefaultAuthActivity.U;
                    Context context2 = oju0Var.a;
                    r55.b();
                    Intent intent = new Intent(context2, (Class<?>) AuthActivity.class);
                    intent.putExtra("passportData", vkPassportRouterInfo);
                    DefaultAuthActivity.b.a(intent);
                    context2.startActivity(intent);
                    break;
                }
            case 1:
                djo djoVar = (djo) obj;
                djoVar.m(true);
                w1m0.a aVar = djoVar.G;
                if (aVar.g) {
                    djoVar.t(new wpa0.a(new y8g.c(aVar.f), true));
                    break;
                }
                break;
            case 2:
                a3s a3sVar = ((q7r) obj).y0;
                StoryOwner storyOwner = a3sVar.a.i0.getStoriesContainer().b;
                StoryEntry currentStory = a3sVar.a.i0.getCurrentStory();
                if (storyOwner != null && currentStory != null) {
                    UserId c = o25.a().c();
                    if (!a3sVar.a.i0.getDependencies().k.c(storyOwner, c)) {
                        if (a3sVar.a.i0.getDependencies().k.a(a3sVar.a.i0.getStoriesContainer().b, c)) {
                            a3sVar.c.b();
                            StoryOwner storyOwner2 = a3sVar.a.i0.getStoriesContainer().b;
                            a3sVar.a(storyOwner2, a3sVar.a.i0.getContext(), a3sVar.a.i0.getCurrentStory().u, new ku1(13, a3sVar, storyOwner2));
                            if (!(storyOwner instanceof StoryOwner.Community)) {
                                a3sVar.a.i0.f1(StoryViewAction.ADD_TO_FRIENDS, null);
                                break;
                            } else {
                                a3sVar.a.i0.f1(StoryViewAction.AUTHOR_SUBSCRIBE, null);
                                break;
                            }
                        }
                    } else {
                        or1 or1Var = new or1(a3sVar.a.i0.getContext());
                        or1Var.b(new xj3(a3sVar, storyOwner, currentStory, i2), a3sVar.a.i0.getStoriesContainer().b instanceof StoryOwner.User ? a3sVar.a.i0.getContext().getString(R.string.profile_friend_cancel) : a3sVar.a.i0.getResources().getString(R.string.profile_unsubscribe));
                        a3sVar.b.e(or1Var.d(), null);
                        break;
                    }
                }
                break;
            case 3:
                ImStartGroupCallFragment imStartGroupCallFragment = (ImStartGroupCallFragment) obj;
                com.vk.im.ui.components.contacts.a aVar2 = imStartGroupCallFragment.W;
                Object obj2 = (aVar2 != null ? aVar2 : null).b1().r;
                boolean z = view.getId() == R.id.vkim_btn_video_call;
                vrb vrbVar = imStartGroupCallFragment.d0;
                long j = imStartGroupCallFragment.Z;
                vrbVar.getClass();
                Serializer.c<Peer> cVar = Peer.CREATOR;
                imStartGroupCallFragment.e0 = vrbVar.a.E("DialogInfoLoader", new tqm(Peer.a.b(j), Source.CACHE)).l(new ux0(new zib(j, 1), 11)).subscribe(new pmu(new hdw(imStartGroupCallFragment, obj2, z, i3), i2), new k5(new kz0(24), 25));
                break;
            case 4:
                go30.a aVar3 = ((fo30) obj).c;
                if (aVar3 != null) {
                    aVar3.a();
                    break;
                }
                break;
            case 5:
                int i5 = NewsfeedSectionFragment.V;
                ((NewsfeedSectionFragment) obj).go(sgh0.b.a);
                break;
            case 6:
                qcy<Object>[] qcyVarArr = ReactionsFeedFragment.q0;
                RecyclerView recyclerView = ((ReactionsFeedFragment) obj).Z;
                RecyclerView.o layoutManager = recyclerView != null ? recyclerView.getLayoutManager() : null;
                LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
                if (linearLayoutManager != null) {
                    linearLayoutManager.K(0, 0);
                    break;
                }
                break;
            case 7:
                com.vk.sharing.core.view.f.Q0((com.vk.sharing.core.view.f) obj);
                break;
            case 8:
                ShowcaseVideoAutoPlayViewHolder showcaseVideoAutoPlayViewHolder = (ShowcaseVideoAutoPlayViewHolder) obj;
                Activity b = enj.b(view);
                if (b != null && (uIBlockVideo = showcaseVideoAutoPlayViewHolder.j) != null) {
                    s6s0 b2 = showcaseVideoAutoPlayViewHolder.b(uIBlockVideo, false);
                    if (!((Boolean) showcaseVideoAutoPlayViewHolder.M.getValue()).booleanValue()) {
                        new e6s0(b, b2, null).c();
                        break;
                    } else {
                        new w6s0(b2, null).e(b);
                        break;
                    }
                }
                break;
            default:
                ((gzs) obj).invoke();
                break;
        }
    }
}

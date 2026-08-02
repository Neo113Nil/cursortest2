package xsna;

import android.content.Context;
import com.vk.api.generated.base.dto.BaseOkResponseDto;
import com.vk.api.generated.shortVideo.dto.ShortVideoGetPopularHashtagsResponseDto;
import com.vk.api.generated.shortVideo.dto.ShortVideoPopularHashtagDto;
import com.vk.api.sdk.exceptions.VKApiExecutionException;
import com.vk.clips.editor.templates.api.model.TemplatesFlowScreen;
import com.vk.core.serialize.Serializer;
import com.vk.design.demo.presentation.nav.ScreenKey;
import com.vk.dto.music.Playlist;
import com.vk.feed.core.models.discover.DiscoverGridItem;
import com.vk.friends.requests.impl.requests.presentation.FriendRequestsFragment;
import com.vk.im.engine.models.groups.Group;
import com.vk.im.ui.views.dialog_actions.DialogActionsListView;
import com.vk.log.L;
import com.vk.newsfeed.api.posting.profilefriendslists.ProfileFriendItem;
import com.vk.profile.community.creationonboarding.impl.finish.presentation.feature.CommunityCreationOnboardingFinishState;
import com.vk.profile.community.impl.ui.profile.state.CommunityProfileState;
import com.vk.registration.funnels.RegistrationFunnelScreenStack;
import com.vk.search.params.impl.presentation.modal.education.mvi.model.EducationState;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.collections.EmptyList;
import org.json.JSONObject;
import ru.ok.android.externcalls.sdk.stat.accept.AcceptCallStat;
import ru.ok.android.webrtc.stat.call.methods.eventual.CallEventualStatSender;
import xsna.gfc;
import xsna.npf;
import xsna.q2j;
import xsna.sza;
import xsna.tre;
import xsna.vre;
import xsna.vsf;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes9.dex */
public final /* synthetic */ class oj implements izs {
    public final /* synthetic */ int b;

    public /* synthetic */ oj(int i) {
        this.b = i;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        s3q0 onAcceptCall$lambda$2;
        switch (this.b) {
            case 0:
                onAcceptCall$lambda$2 = AcceptCallStat.onAcceptCall$lambda$2((CallEventualStatSender) obj);
                return onAcceptCall$lambda$2;
            case 1:
                qgi0.r((tgi0) obj, "audioBookChapterProgressTime");
                return s3q0.a;
            case 2:
                List list = (List) ((xpp) obj).a();
                return list == null ? EmptyList.b : list;
            case 3:
                Serializer.c<ProfileFriendItem> cVar = ProfileFriendItem.CREATOR;
                return ProfileFriendItem.a.a((JSONObject) obj);
            case 4:
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : (List) obj) {
                    if (jnj.b(((Playlist) obj2).O)) {
                        arrayList.add(obj2);
                    }
                }
                return arrayList;
            case 5:
                return new sza.a.b(((Group) obj).A);
            case 6:
                return gfc.b.a;
            case 7:
                return aqc.a((ppc) obj);
            case 8:
                return Boolean.valueOf(((vre.b) obj).r instanceof tre.b);
            case 9:
                List<ShortVideoPopularHashtagDto> d = ((ShortVideoGetPopularHashtagsResponseDto) obj).d();
                ArrayList arrayList2 = new ArrayList();
                for (Object obj3 : d) {
                    if (((ShortVideoPopularHashtagDto) obj3).e()) {
                        arrayList2.add(obj3);
                    }
                }
                ArrayList arrayList3 = new ArrayList(c5g.u(arrayList2, 10));
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    ShortVideoPopularHashtagDto shortVideoPopularHashtagDto = (ShortVideoPopularHashtagDto) it.next();
                    arrayList3.add(new spp0(shortVideoPopularHashtagDto.d(), shortVideoPopularHashtagDto.getDescription()));
                }
                return arrayList3;
            case 10:
                L.e("TemplateFlow onNext " + ((TemplatesFlowScreen) obj));
                return s3q0.a;
            case 11:
                return ((vsf) obj) instanceof vsf.a ? npf.i.b.b : npf.i.c.b;
            case 12:
                qgi0.r((tgi0) obj, "communities_catalog_top_bar_create_icon");
                return s3q0.a;
            case 13:
                return (CommunityCreationOnboardingFinishState) obj;
            case 14:
                return s3q0.a;
            case 15:
                return Boolean.valueOf(((CommunityProfileState) obj).h);
            case 16:
                L.i((Throwable) obj);
                return s3q0.a;
            case 17:
                qgi0.h((tgi0) obj, "");
                return s3q0.a;
            case 18:
                return Integer.valueOf(((q2j.c) obj).g);
            case 19:
                return (ScreenKey) j5g.i0(((x3m) obj).b);
            case 20:
                LinkedHashMap linkedHashMap = DialogActionsListView.j;
                return ((Context) obj).getString(R.string.vkim_search);
            case 21:
                return new b0l0(((b0l0) obj).a());
            case 22:
                return ((EducationState) obj).c;
            case 23:
                u1c0 u1c0Var = (u1c0) obj;
                if (!(u1c0Var instanceof a160)) {
                    return u1c0Var;
                }
                a160 a160Var = (a160) u1c0Var;
                List<u1c0> list2 = a160Var.q;
                ArrayList arrayList4 = new ArrayList(c5g.u(list2, 10));
                for (u1c0 u1c0Var2 : list2) {
                    if (u1c0Var2 instanceof k2n) {
                        k2n k2nVar = (k2n) u1c0Var2;
                        DiscoverGridItem discoverGridItem = k2nVar.s;
                        int a = g2n.a(discoverGridItem.c, discoverGridItem);
                        if (a != k2nVar.c) {
                            u1c0Var2 = lbs.c(u1c0Var2, null, null, a, 3);
                            r3 = true;
                        }
                    }
                    arrayList4.add(u1c0Var2);
                }
                if (!r3) {
                    return a160Var;
                }
                a160 a160Var2 = new a160(a160Var.a, a160Var.b, a160Var.c, arrayList4);
                lbs.k(a160Var2, a160Var);
                return a160Var2;
            case 24:
                return ((u5r) obj).c;
            case 25:
                return String.valueOf(((Integer) obj).intValue());
            case 26:
                cps cpsVar = (cps) obj;
                int i = FriendRequestsFragment.d0;
                return new FriendRequestsFragment.b(cpsVar, null, cpsVar.c.b, 6);
            case 27:
                Throwable th = (Throwable) obj;
                if (th instanceof VKApiExecutionException) {
                    VKApiExecutionException vKApiExecutionException = (VKApiExecutionException) th;
                    if (vKApiExecutionException.C() != -1) {
                        RegistrationFunnelScreenStack registrationFunnelScreenStack = frf0.a;
                        frf0.f = Integer.valueOf(vKApiExecutionException.C());
                    }
                }
                return s3q0.a;
            case 28:
                L.f("PostingMediaPickerGalleryChangeObserver", "Exception in GalleryChangeObserver", (Throwable) obj);
                return s3q0.a;
            default:
                return Boolean.valueOf(((BaseOkResponseDto) obj) == BaseOkResponseDto.OK);
        }
    }

    public /* synthetic */ oj(bqp bqpVar) {
        this.b = 23;
    }
}

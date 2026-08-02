package xsna;

import android.os.Bundle;
import android.view.View;
import com.ironsource.Hf;
import com.ironsource.environment.thread.IronSourceThreadManager;
import com.vk.api.generated.shortVideo.dto.ShortVideoGetPlaylistsResponseDto;
import com.vk.api.generated.users.dto.UsersUserFullDto;
import com.vk.clips.sdk.shared.feed.model.FeedItem;
import com.vk.content.design.view.photo.flow.PhotoFlowToolbarView;
import com.vk.dto.common.data.VKFromList;
import com.vk.dto.group.Group;
import com.vk.feed.core.models.news.NewsEntry;
import com.vk.friends.recommendations.impl.presentation.FriendsImportFragment;
import com.vk.newsfeed.presentation.model.actions.NewsfeedExternalAction;
import com.vk.photos.root.albumdetails.presentation.a;
import com.vk.registration.funnels.RegistrationFunnelScreenStack;
import com.vk.stat.sak.scheme.SchemeStatSak$TypeRegistrationItem;
import com.vk.voip.api.join.JoinData;
import com.vk.voip.invite.GroupCallInviteFragment;
import com.vk.voip.ui.change_name.ui.result.VoipChangeNameResult;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import one.video.cast.manager.status.MediaRouteConnectStatus;
import xsna.bzp0;
import xsna.ihz;
import xsna.jza0;
import xsna.ngl;
import xsna.o2k;
import xsna.qi6;
import xsna.x89;
import xsna.xn50;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes7.dex */
public final /* synthetic */ class v20 implements io.reactivex.rxjava3.functions.l, PhotoFlowToolbarView.b, PhotoFlowToolbarView.d, io.reactivex.rxjava3.functions.c, ngl.a, io.reactivex.rxjava3.functions.m, k0a, ihz.a, pcs, Hf.a, qi6.b {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ v20(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // xsna.qi6.b
    public void a(View view, NewsEntry newsEntry, NewsEntry newsEntry2, int i) {
        ho60 ho60Var = (ho60) this.c;
        ho60Var.n.sa(new NewsfeedExternalAction.d.b(view, newsEntry, newsEntry2, i, ho60Var.d));
    }

    @Override // io.reactivex.rxjava3.functions.c
    public Object apply(Object obj, Object obj2) {
        switch (this.b) {
            case 4:
                return (List) ((kc4) this.c).invoke(obj, obj2);
            case 14:
                return (Pair) ((wzs) this.c).invoke(obj, obj2);
            default:
                return (ezo0) ((nwm) this.c).invoke(obj, obj2);
        }
    }

    @Override // xsna.k0a
    public void b(int i) {
        ((xbc) this.c).a(i != 1 ? i != 2 ? i != 3 ? i != 4 ? MediaRouteConnectStatus.NO_DEVICES_AVAILABLE : MediaRouteConnectStatus.CONNECTED : MediaRouteConnectStatus.CONNECTING : MediaRouteConnectStatus.NOT_CONNECTED : MediaRouteConnectStatus.NO_DEVICES_AVAILABLE);
    }

    @Override // com.ironsource.Hf.a
    public void cancel() {
        IronSourceThreadManager.d.a((Runnable) this.c);
    }

    @Override // xsna.ngl.a
    public void e(bzp0.c cVar) {
        c37 c37Var = (c37) this.c;
        c37Var.E.getClass();
        com.vk.registration.funnels.b.a.getClass();
        RegistrationFunnelScreenStack registrationFunnelScreenStack = frf0.a;
        frf0.a(SchemeStatSak$TypeRegistrationItem.EventType.INCORRECT_EMAIL_CODE, null, null, null, null, null, null, 254);
        y27 y27Var = (y27) c37Var.a;
        if (y27Var != null) {
            y27Var.th();
        }
        y27 y27Var2 = (y27) c37Var.a;
        if (y27Var2 != null) {
            y27Var2.Pc();
        }
    }

    @Override // xsna.ihz.a
    public void invoke(Object obj) {
        fwa0 fwa0Var = (fwa0) this.c;
        jza0.b bVar = (jza0.b) obj;
        bVar.onLoadingChanged(fwa0Var.g);
        bVar.onIsLoadingChanged(fwa0Var.g);
    }

    @Override // com.vk.content.design.view.photo.flow.PhotoFlowToolbarView.d
    public void onClick() {
        ((nj3) this.c).h.getRecyclerView().smoothScrollToPosition(0);
    }

    @Override // xsna.pcs
    public void p(Bundle bundle, String str) {
        VoipChangeNameResult voipChangeNameResult;
        GroupCallInviteFragment groupCallInviteFragment = (GroupCallInviteFragment) this.c;
        int i = GroupCallInviteFragment.V;
        if (str.hashCode() == 480222762 && str.equals("request_key_change_name") && (voipChangeNameResult = (VoipChangeNameResult) bundle.getParcelable("result_key_change_name")) != null) {
            uhu uhuVar = groupCallInviteFragment.T;
            Object obj = null;
            if (uhuVar == null) {
                uhuVar = null;
            }
            x89 x89Var = uhuVar.t;
            if (x89Var instanceof x89.a) {
                VoipChangeNameResult.JoinAs joinAs = voipChangeNameResult.b;
                if (joinAs instanceof VoipChangeNameResult.JoinAs.CurrentUser) {
                    x89.a aVar = (x89.a) x89Var;
                    s89 s89Var = aVar.a;
                    String str2 = s89Var.c;
                    JoinData joinData = s89Var.e;
                    x89.a a = x89.a.a(aVar, new x89.c.C3983c(new JoinData(str2, joinData.c, joinData.d), uhuVar.n.o(), new og0(((VoipChangeNameResult.JoinAs.CurrentUser) joinAs).b, ((jsa) uhuVar.u.getValue()).a())));
                    uhuVar.t = a;
                    uhuVar.X0(a);
                } else if (joinAs instanceof VoipChangeNameResult.JoinAs.Group) {
                    x89.a aVar2 = (x89.a) x89Var;
                    VoipChangeNameResult.JoinAs.Group group = (VoipChangeNameResult.JoinAs.Group) joinAs;
                    Iterator<T> it = aVar2.d.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        Object next = it.next();
                        if (fkq0.a(((Group) next).c).equals(fkq0.a(group.b))) {
                            obj = next;
                            break;
                        }
                    }
                    Group group2 = (Group) obj;
                    if (group2 != null) {
                        s89 s89Var2 = aVar2.a;
                        String str3 = s89Var2.c;
                        JoinData joinData2 = s89Var2.e;
                        uhuVar.t = x89.a.a(aVar2, new x89.c.b(new JoinData(str3, joinData2.c, joinData2.d), group2));
                    }
                    uhuVar.X0(uhuVar.t);
                } else {
                    if (!(joinAs instanceof VoipChangeNameResult.JoinAs.Anonym)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    VoipChangeNameResult.JoinAs.Anonym anonym = (VoipChangeNameResult.JoinAs.Anonym) joinAs;
                    uhuVar.I0(io.reactivex.rxjava3.kotlin.c.e(new io.reactivex.rxjava3.internal.operators.single.j(new io.reactivex.rxjava3.internal.operators.single.n(uhuVar.j.a(uhuVar.k, anonym.b), new tf(new u6k(uhuVar, 9), 27)), new o0s(uhuVar.Y0(), 1)), new tcn(uhuVar, 11), new ysd(uhuVar, (x89.a) x89Var, anonym, 5)));
                }
                s3q0 s3q0Var = s3q0.a;
            }
        }
    }

    @Override // io.reactivex.rxjava3.functions.m
    public boolean test(Object obj) {
        switch (this.b) {
            case 6:
                return ((Boolean) ((qt) this.c).invoke(obj)).booleanValue();
            default:
                return ((Boolean) ((iou) this.c).invoke(obj)).booleanValue();
        }
    }

    @Override // com.vk.content.design.view.photo.flow.PhotoFlowToolbarView.b
    public void onClick(View view) {
        xn50.a.c(((com.vk.photos.root.albumdetails.presentation.c) this.c).c, new a.e(view));
    }

    @Override // io.reactivex.rxjava3.functions.l
    public Object apply(Object obj) {
        int i = this.b;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                return (List) ((qt) obj2).invoke(obj);
            case 1:
                return (io.reactivex.rxjava3.core.b0) ((com.vk.im.ui.fragments.b) obj2).invoke(obj);
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 11:
            case 14:
            case 19:
            case 20:
            default:
                return (io.reactivex.rxjava3.core.b0) ((f2s) obj2).invoke(obj);
            case 7:
                return (UsersUserFullDto) ((qt) obj2).invoke(obj);
            case 8:
                return (String) ((nt) obj2).invoke(obj);
            case 9:
                return (hda) ((sf4) obj2).invoke(obj);
            case 10:
                return (List) ((com.vk.im.ui.fragments.b) obj2).invoke(obj);
            case 12:
                return (io.reactivex.rxjava3.core.b0) ((rr3) obj2).invoke(obj);
            case 13:
                return (ShortVideoGetPlaylistsResponseDto) ((hl1) obj2).invoke(obj);
            case 15:
                return (nwg) ((omf) obj2).invoke(obj);
            case 16:
                return (List) ((qt) obj2).invoke(obj);
            case 17:
                return (ptk) ((omf) obj2).invoke(obj);
            case 18:
                return (o2k.b) ((sf4) obj2).invoke(obj);
            case 21:
                return (Pair) ((j0r) obj2).invoke(obj);
            case 22:
                return (FeedItem.d) ((j4r) obj2).invoke(obj);
            case 23:
                return (io.reactivex.rxjava3.core.t) ((omf) obj2).invoke(obj);
            case 24:
                int i2 = FriendsImportFragment.a0;
                return (VKFromList) ((j0r) obj2).invoke(obj);
        }
    }
}

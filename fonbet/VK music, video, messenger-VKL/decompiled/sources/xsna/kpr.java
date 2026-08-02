package xsna;

import android.graphics.PointF;
import android.view.View;
import com.unity3d.services.UnityAdsConstants;
import com.vk.api.generated.communitySubscriptions.dto.CommunitySubscriptionsHasActiveSubscriptionResponseDto;
import com.vk.api.generated.groups.dto.GroupsGetByIdObjectResponseDto;
import com.vk.api.generated.groups.dto.GroupsGetMembersFieldsResponseDto;
import com.vk.api.generated.groups.dto.GroupsUserXtrRoleDto;
import com.vk.api.generated.users.dto.UsersFieldsDto;
import com.vk.content.design.view.camera.MasksWrap;
import com.vk.dto.common.data.VKList;
import com.vk.dto.masks.Mask;
import com.vk.friends.groupinvite.impl.models.InviteFriendsTabIndex;
import com.vk.newsfeed.impl.postmodal.reactions.tabs.all.b;
import com.vk.newsfeed.posting.music_picker.domain.model.MusicPickerState;
import com.vk.newsfeed.posting.poll_editor.domain.model.PollEditorState;
import com.vk.profilelist.impl.fragments.GroupMembersListFragment;
import com.vkontakte.android.R;
import com.vungle.ads.internal.protos.Sdk;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;
import ru.ok.android.internal.tracer.TracerLiteFacade;
import ru.ok.tracer.lite.TracerLite;
import xsna.co20;
import xsna.d4p;
import xsna.erx;
import xsna.f5h0;
import xsna.tlo0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class kpr implements izs {
    public final /* synthetic */ int b;

    public /* synthetic */ kpr(int i) {
        this.b = i;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x01e0  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01dd  */
    @Override // xsna.izs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj) {
        tlo0.a aVar;
        int i;
        tlo0 c;
        JSONObject optJSONObject;
        s3q0 tracerLite_delegate$lambda$0$0;
        switch (this.b) {
            case 0:
                return u0u0.a((u0u0) obj, 0, 0, 0, 0, 31);
            case 1:
                GroupsGetMembersFieldsResponseDto groupsGetMembersFieldsResponseDto = (GroupsGetMembersFieldsResponseDto) obj;
                List<UsersFieldsDto> list = GroupMembersListFragment.R0;
                List<GroupsUserXtrRoleDto> d = groupsGetMembersFieldsResponseDto.d();
                ArrayList arrayList = new ArrayList(c5g.u(d, 10));
                Iterator<T> it = d.iterator();
                while (it.hasNext()) {
                    arrayList.add(qru.a((GroupsUserXtrRoleDto) it.next()));
                }
                return new VKList(groupsGetMembersFieldsResponseDto.getCount(), arrayList);
            case 2:
                erx erxVar = (erx) obj;
                if (!(erxVar instanceof erx.c)) {
                    return null;
                }
                erx.c cVar = (erx.c) erxVar;
                if (cVar.d.a) {
                    return null;
                }
                int size = jsx.a(cVar.b, InviteFriendsTabIndex.SELECTED.h()).size();
                boolean f = frx.f(erxVar);
                lps lpsVar = erxVar != null ? ((erx.c) erxVar).c : null;
                int i2 = lpsVar != null ? lpsVar.a : Integer.MAX_VALUE;
                if (f) {
                    aVar = tlo0.Companion;
                    i = R.string.invite_friends_clear_selection;
                } else {
                    if (i2 < frx.c(erxVar).size()) {
                        tlo0.a aVar2 = tlo0.Companion;
                        Object[] objArr = {Integer.valueOf(i2)};
                        aVar2.getClass();
                        c = tlo0.a.c(R.string.invite_friends_select_count, objArr);
                        boolean f2 = frx.f(erxVar);
                        lps lpsVar2 = erxVar == null ? ((erx.c) erxVar).c : null;
                        return new g48(new xrx(c, f2, (lpsVar2 != null ? lpsVar2.a : Integer.MAX_VALUE) <= 0), new arx(tq.h(tlo0.Companion, R.string.invite_friends_button), size > 0 ? Integer.valueOf(size) : null, size > 0));
                    }
                    aVar = tlo0.Companion;
                    i = R.string.invite_friends_select_all;
                }
                c = tq.h(aVar, i);
                boolean f22 = frx.f(erxVar);
                if (erxVar == null) {
                }
                return new g48(new xrx(c, f22, (lpsVar2 != null ? lpsVar2.a : Integer.MAX_VALUE) <= 0), new arx(tq.h(tlo0.Companion, R.string.invite_friends_button), size > 0 ? Integer.valueOf(size) : null, size > 0));
            case 3:
                new dqu();
                return dqu.a(((GroupsGetByIdObjectResponseDto) obj).d().get(0));
            case 4:
                return nx00.a;
            case 5:
                return u810.j((y810) obj);
            case 6:
                int i3 = MasksWrap.e0;
                return (Mask) ((ArrayList) obj).get(0);
            case 7:
                try {
                    optJSONObject = ((JSONObject) obj).optJSONObject("response");
                } catch (Exception e) {
                    com.vk.metrics.eventtracking.b.a.a(e);
                }
                if (optJSONObject == null) {
                    return s3q0.a;
                }
                f620 f620Var = f620.b;
                f620.a(optJSONObject);
                hf8.b("com.vkontakte.android.COUNTERS_UPDATED");
                return s3q0.a;
            case 8:
                ((zak0) co20.g).setValue((co20.b) obj);
                return s3q0.a;
            case 9:
                return new g4p(((d4p.a) obj).a);
            case 10:
                return b.a.a;
            case 11:
                return s3q0.a;
            case 12:
                return ((MusicPickerState) obj).k;
            case 13:
                ojt ojtVar = (ojt) obj;
                ojtVar.l = f5h0.o.a;
                ojtVar.m = new PointF(0.5f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                return s3q0.a;
            case 14:
                return s3q0.a;
            case 15:
                return Boolean.valueOf(((View) obj) instanceof ggs);
            case 16:
                return Boolean.valueOf(((CommunitySubscriptionsHasActiveSubscriptionResponseDto) obj).d());
            case 17:
                return Boolean.valueOf(((sy40) obj).e.d);
            case 18:
                PollEditorState pollEditorState = (PollEditorState) obj;
                return Boolean.valueOf(pollEditorState instanceof PollEditorState.Editing ? ((PollEditorState.Editing) pollEditorState).k : false);
            case 19:
                return new tfu(n34.a(((ery) obj).a()));
            case 20:
                return s3q0.a;
            case 21:
                z4g.d().n(true);
                return s3q0.a;
            case 22:
                return Boolean.TRUE;
            case 23:
                z8n0 z8n0Var = (z8n0) obj;
                if ((z8n0Var instanceof f9n0) && !((f9n0) z8n0Var).g()) {
                    r2 = true;
                }
                return Boolean.valueOf(r2);
            case 24:
                mol0 mol0Var = (mol0) obj;
                return mol0.a(mol0Var, null, null, null, null, ggr.a(mol0Var.g, true, null, null, Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE), null, Sdk.SDKError.Reason.STALE_CACHED_RESPONSE_VALUE);
            case 25:
                qgi0.r((tgi0) obj, "story_statistics_stats_counter");
                return s3q0.a;
            case 26:
                return io.reactivex.rxjava3.internal.operators.completable.i.b;
            case 27:
                return Long.valueOf(TimeUnit.NANOSECONDS.toMillis(((kyo0) ((List) obj).get(1)).a));
            case 28:
                return Boolean.valueOf(((jhw0) obj).isEnabled());
            default:
                tracerLite_delegate$lambda$0$0 = TracerLiteFacade.tracerLite_delegate$lambda$0$0((TracerLite.Configuration.Builder) obj);
                return tracerLite_delegate$lambda$0$0;
        }
    }

    public /* synthetic */ kpr(Object obj, int i) {
        this.b = i;
    }
}

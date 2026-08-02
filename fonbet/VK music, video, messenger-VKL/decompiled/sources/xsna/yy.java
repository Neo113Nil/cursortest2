package xsna;

import android.content.Context;
import android.os.Bundle;
import android.widget.ImageView;
import com.vk.api.generated.groups.dto.GroupsGetContentForTabsResponseDto;
import com.vk.api.generated.groups.dto.GroupsGetSuggestionsResponseDto;
import com.vk.api.generated.groups.dto.GroupsSuggestionDto;
import com.vk.api.generated.groups.dto.GroupsTabContentServicesDto;
import com.vk.api.generated.market.dto.MarketMarketItemDto;
import com.vk.auth.api.models.AuthResult;
import com.vk.auth.main.SignUpDataHolder;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.clips.attachments.api.publish.cta.ClipInvolvementActionButton;
import com.vk.dto.common.Good;
import com.vk.dto.common.GroupsSuggestions;
import com.vk.dto.common.id.UserId;
import com.vk.dto.common.im.ImageList;
import com.vk.dto.user.UserProfile;
import com.vk.dzenarticle.impl.ui.entity.DzenArticleState;
import com.vk.im.engine.models.contacts.Contact;
import com.vk.im.engine.models.groups.Group;
import com.vk.im.engine.models.users.User;
import com.vk.im.engine.models.users.UserNameCase;
import com.vk.im.ui.views.dialog_actions.DialogActionsListView;
import com.vk.narratives.impl.highlights.AllHighlightsFragment;
import com.vk.stat.scheme.SchemeStat$TypeDevNullItem;
import com.vkontakte.android.R;
import com.vungle.ads.internal.protos.Sdk;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import xsna.f5h0;
import xsna.hh8;
import xsna.ohr;
import xsna.tj50;
import xsna.xkh;
import xsna.yc00;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class yy implements izs {
    public final /* synthetic */ int b;

    public /* synthetic */ yy(int i) {
        this.b = i;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        ArrayList arrayList;
        List<MarketMarketItemDto> e;
        ImageList imageList;
        boolean z = true;
        Bundle bundle = null;
        r5 = null;
        String str = null;
        Object obj2 = null;
        switch (this.b) {
            case 0:
                return s3q0.a;
            case 1:
                int i = AllHighlightsFragment.g0;
                qgi0.r((tgi0) obj, "back_button");
                return s3q0.a;
            case 2:
                return ((nex0) obj).a;
            case 3:
                yc00 yc00Var = (yc00) obj;
                if (yc00Var instanceof yc00.b) {
                    UserId.b bVar = UserId.c;
                    ((yc00.b) yc00Var).getClass();
                    throw null;
                }
                if (yc00Var instanceof yc00.a) {
                    ((yc00.a) yc00Var).getClass();
                    throw null;
                }
                if (!epx.f(yc00Var, yc00.c.a)) {
                    throw new NoWhenBranchMatchedException();
                }
                q55 q55Var = q55.a;
                SignUpDataHolder signUpDataHolder = q55.c().a;
                if (signUpDataHolder.K == null) {
                    signUpDataHolder.K = new Bundle();
                }
                signUpDataHolder.K.putBoolean("mail_flow_white_token_expired", true);
                s3q0 s3q0Var = s3q0.a;
                UserId userId = UserId.d;
                try {
                    bundle = q55.c().a.K;
                } catch (Throwable unused) {
                }
                return new AuthResult("", null, userId, false, 0, null, null, null, null, 0, null, 0, null, null, null, 0L, bundle, null, null, null, null, null, null, 8323064, null);
            case 4:
                ((vgg) obj).c();
                return s3q0.a;
            case 5:
                return s3q0.a;
            case 6:
                tj50.a aVar = (tj50.a) obj;
                cq7 cq7Var = cq7.b;
                ao8 ao8Var = ao8.d;
                return new com.vk.ecomm.onlinebooking.impl.edit.q(aVar.a(cq7Var, ao8Var), aVar.a(com.vk.ecomm.onlinebooking.impl.edit.i.b, ao8Var), aVar.a(dq7.b, ao8Var), aVar.a(eq7.b, ao8Var), aVar.a(com.vk.ecomm.onlinebooking.impl.edit.j.b, ao8Var), aVar.a(com.vk.ecomm.onlinebooking.impl.edit.l.b, ao8Var), aVar.a(com.vk.ecomm.onlinebooking.impl.edit.k.b, ao8Var), aVar.a(com.vk.ecomm.onlinebooking.impl.edit.m.b, ao8Var), aVar.a(com.vk.ecomm.onlinebooking.impl.edit.n.b, ao8Var), aVar.a(aq7.b, ao8Var), aVar.a(com.vk.ecomm.onlinebooking.impl.edit.g.b, ao8Var), aVar.a(com.vk.ecomm.onlinebooking.impl.edit.h.b, ao8Var), aVar.a(bq7.b, ao8Var));
            case 7:
                hh8 hh8Var = (hh8) obj;
                hh8Var.getClass();
                boolean z2 = hh8Var instanceof hh8.b;
                hh8.a aVar2 = hh8Var instanceof hh8.a ? (hh8.a) hh8Var : null;
                ohr ohrVar = aVar2 != null ? aVar2.i : null;
                if (!z2 && !(ohrVar instanceof ohr.c) && !(ohrVar instanceof ohr.a)) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 8:
                return Boolean.valueOf(epx.f(((UIBlock) obj).b, "video_kids_filter_fake_placeholder"));
            case 9:
                ImageView imageView = new ImageView((Context) obj);
                imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
                return imageView;
            case 10:
                return ((User) obj).Cb(UserNameCase.NOM);
            case 11:
                Iterator it = ((List) obj).iterator();
                while (true) {
                    if (it.hasNext()) {
                        Object next = it.next();
                        if (((qaq0) next).a == 0) {
                            obj2 = next;
                        }
                    }
                }
                qaq0 qaq0Var = (qaq0) obj2;
                return qaq0Var == null ? io.reactivex.rxjava3.internal.operators.observable.g0.b : io.reactivex.rxjava3.core.q.T(new ClipInvolvementActionButton.DonutLevel(qaq0Var.a, qaq0Var.b));
            case 12:
                return k9q0.u((List) obj);
            case 13:
                ((ikv0) obj).a();
                return s3q0.a;
            case 14:
                return ((rmf) obj).l;
            case 15:
                ((ojt) obj).l = f5h0.f.a;
                return s3q0.a;
            case 16:
                Map.Entry entry = (Map.Entry) obj;
                return new Pair(entry.getKey(), ((UserProfile) entry.getValue()).l0());
            case 17:
                GroupsGetContentForTabsResponseDto groupsGetContentForTabsResponseDto = (GroupsGetContentForTabsResponseDto) obj;
                GroupsTabContentServicesDto B = groupsGetContentForTabsResponseDto.B();
                if (B == null || (e = B.e()) == null) {
                    arrayList = null;
                } else {
                    ArrayList e2 = b210.e(e);
                    arrayList = new ArrayList(c5g.u(e2, 10));
                    Iterator it2 = e2.iterator();
                    while (it2.hasNext()) {
                        arrayList.add(new f5u((Good) it2.next()));
                    }
                }
                GroupsTabContentServicesDto B2 = groupsGetContentForTabsResponseDto.B();
                String f = B2 != null ? B2.f() : null;
                GroupsTabContentServicesDto B3 = groupsGetContentForTabsResponseDto.B();
                return new xkh.b(arrayList, f, B3 != null ? B3.g() : null);
            case 18:
                qgi0.r((tgi0) obj, "CommunityScheduledClipsGridViewDatePicker");
                return s3q0.a;
            case 19:
                return Boolean.valueOf(((k3j) obj).c);
            case 20:
                Long l = ((Contact) obj).j;
                return Long.valueOf(l != null ? l.longValue() : 0L);
            case 21:
                l5m l5mVar = new l5m(null, null, 3);
                l5mVar.g = (SchemeStat$TypeDevNullItem) obj;
                l5mVar.q();
                return s3q0.a;
            case 22:
                LinkedHashMap linkedHashMap = DialogActionsListView.j;
                return e3m.e(R.attr.im_ic_unarchive, (Context) obj);
            case 23:
                return String.valueOf(((Integer) obj).intValue());
            case 24:
                Group group = (Group) j5g.Z(((wpp) obj).c.values());
                String str2 = group != null ? group.c : null;
                if (group != null && (imageList = group.e) != null) {
                    str = imageList.Db();
                }
                return new sr5(str2, str, group != null ? group.o : false);
            case 25:
                return ((s080) obj).c;
            case 26:
                return DzenArticleState.a((DzenArticleState) obj, null, null, DzenArticleState.LoadingState.ERROR_INITIAL_LOAD, null, null, false, Sdk.SDKError.Reason.JSON_ENCODE_ERROR_VALUE);
            case 27:
                ((etv0) obj).b(false);
                return s3q0.a;
            case 28:
                GroupsGetSuggestionsResponseDto groupsGetSuggestionsResponseDto = (GroupsGetSuggestionsResponseDto) obj;
                String i2 = groupsGetSuggestionsResponseDto.f().i();
                String title = groupsGetSuggestionsResponseDto.getTitle();
                String e3 = groupsGetSuggestionsResponseDto.e();
                List<GroupsSuggestionDto> d = groupsGetSuggestionsResponseDto.d();
                ArrayList arrayList2 = new ArrayList(c5g.u(d, 10));
                Iterator<T> it3 = d.iterator();
                while (it3.hasNext()) {
                    arrayList2.add(hru.a((GroupsSuggestionDto) it3.next()));
                }
                return new GroupsSuggestions(i2, title, e3, p4g.q(arrayList2), null, groupsGetSuggestionsResponseDto.r());
            default:
                qgi0.r((tgi0) obj, "delete_button");
                return s3q0.a;
        }
    }

    public /* synthetic */ yy(Object obj, int i) {
        this.b = i;
    }
}

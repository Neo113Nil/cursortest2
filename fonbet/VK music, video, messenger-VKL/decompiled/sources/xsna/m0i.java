package xsna;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import com.vk.clips.edit.di.ClipEditComponent;
import com.vk.dto.common.ClipVideoFile;
import com.vk.dto.common.GroupsSuggestions;
import com.vk.dto.common.VideoFileOld;
import com.vk.dto.gift.CatalogedGift;
import com.vk.dto.posting.PostingVisibilityMode;
import com.vk.dto.user.UserProfile;
import com.vk.im.ui.components.common.LinkAction;
import com.vk.newsfeed.api.posting.community.PostingCountersModel;
import com.vk.profile.community.members.impl.domain.MembersListBanner;
import com.vk.profile.community.members.impl.domain.User;
import com.vk.profile.community.members.impl.ui.MembersState;
import com.vk.profile.community.members.impl.ui.d;
import com.vk.profile.user.impl.ui.f;
import com.vk.qrcode.d;
import com.vk.voip.OKVoipEngine;
import com.vkontakte.android.R;
import com.vkontakte.android.api.ExtendedUserProfile;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.Ref$FloatRef;
import org.json.JSONObject;
import ru.ok.android.externcalls.sdk.factory.StartCallParams;
import ru.ok.android.externcalls.sdk.id.ParticipantId;
import xsna.e3m;
import xsna.utq0;
import xsna.uxv;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes5.dex */
public final /* synthetic */ class m0i implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ m0i(Activity activity, com.vk.qrcode.c cVar, d.b bVar, cme0 cme0Var) {
        this.b = 5;
        this.c = activity;
        this.d = cVar;
        this.e = bVar;
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.izs
    public final Object invoke(Object obj) {
        String str;
        Bundle bundle;
        int i = this.b;
        int i2 = 4;
        int i3 = 1;
        Object obj2 = this.e;
        Object obj3 = this.d;
        Object obj4 = this.c;
        switch (i) {
            case 0:
                izs izsVar = (izs) obj3;
                PostingVisibilityMode postingVisibilityMode = (PostingVisibilityMode) obj;
                VideoFileOld copy = ((ClipVideoFile) obj4).copy();
                copy.x0 = ((ClipEditComponent) ((n0i) obj2).c.getValue()).d6().b(postingVisibilityMode);
                izsVar.invoke(Boolean.valueOf(postingVisibilityMode == PostingVisibilityMode.ALL));
                wjs0.a(new fyr0(copy));
                break;
            case 1:
                uxv uxvVar = (uxv) obj4;
                Context context = (Context) obj3;
                String str2 = (String) obj2;
                int i4 = uxv.a.$EnumSwitchMapping$0[((LinkAction) obj).ordinal()];
                if (i4 == 2) {
                    uxv.a(context, str2);
                } else if (i4 == 4) {
                    uxvVar.c.k().e(context, str2);
                }
                break;
            case 2:
                MembersState membersState = (MembersState) obj4;
                z37 z37Var = (z37) obj3;
                gzs gzsVar = (gzs) obj2;
                nvy nvyVar = (nvy) obj;
                MembersListBanner membersListBanner = membersState.f;
                boolean z = membersState.b;
                boolean z2 = membersState.d;
                List<User> list = membersState.c;
                MembersState.Error error = membersState.g;
                if (membersListBanner != null) {
                    nvy.g(nvyVar, "banner", null, new jai(-255226109, new np7(i3, membersState, z37Var), true), 2);
                }
                nvyVar.e(list.size(), new d.C1635d(new u4u(10), list), new d.e(new xmz(i2), list), new jai(802480018, new d.f(list, z37Var), true));
                if (z2) {
                    if ((error != null ? error.b : null) != MembersState.Error.Cause.NETWORK_ERROR && !z) {
                        nvy.g(nvyVar, null, null, mhi.a, 3);
                    }
                }
                if ((error != null ? error.b : null) == MembersState.Error.Cause.NETWORK_ERROR && !list.isEmpty()) {
                    nvy.g(nvyVar, null, null, new jai(658139019, new u0r(gzsVar, i3), true), 3);
                }
                if ((error != null ? error.b : null) == MembersState.Error.Cause.ACCESS_TO_GROUP_DENIED) {
                    nvy.g(nvyVar, null, null, mhi.b, 3);
                }
                if (!z && !z2 && list.isEmpty() && error == null) {
                    nvy.g(nvyVar, null, null, mhi.c, 3);
                }
                break;
            case 3:
                OKVoipEngine.c cVar = (OKVoipEngine.c) obj2;
                StartCallParams.Builder myId = ((StartCallParams.Builder) obj).setOpponentId(new ParticipantId((String) obj4)).setPayload(((JSONObject) obj3).toString()).setMyId(new ParticipantId(cVar.c));
                OKVoipEngine.d dVar = cVar.h;
                break;
            case 4:
                ((com.vk.profile.core.info_items.a) obj4).v6(((PostingCountersModel.a) obj3).c, ((PostingCountersModel) obj2).c);
                break;
            case 5:
                Activity activity = (Activity) obj4;
                com.vk.qrcode.c cVar2 = (com.vk.qrcode.c) obj3;
                d.b bVar = (d.b) obj2;
                UserProfile userProfile = (UserProfile) obj;
                if (epx.f(userProfile, UserProfile.f0)) {
                    userProfile = null;
                }
                com.vk.qrcode.d dVar2 = com.vk.qrcode.d.b;
                com.vk.movika.sdk.base.flow.binding.l lVar = new com.vk.movika.sdk.base.flow.binding.l(17, userProfile, activity);
                String str3 = userProfile != null ? userProfile.h : null;
                if (userProfile == null || (bundle = userProfile.s) == null || (str = bundle.getString("name_dat")) == null) {
                    str = userProfile != null ? userProfile.e : null;
                    if (str == null) {
                        str = "";
                    }
                }
                String string = activity.getString(R.string.qr_money_transfer_title, str);
                com.vk.movika.sdk.base.ui.i iVar = new com.vk.movika.sdk.base.ui.i(26, activity, cVar2);
                com.vk.movika.sdk.base.flow.binding.l lVar2 = userProfile != null ? lVar : null;
                String string2 = activity.getString(R.string.qr_vkpay_description);
                e3m.a aVar = e3m.a;
                com.vk.qrcode.d.k(dVar2, activity, bVar, null, str3, null, lVar2, m33.a(R.drawable.vk_icon_money_request_circle_fill_blue_20, activity), string, null, string2, 3, null, new Pair(activity.getString(R.string.continue_), iVar), null, null, null, null, null, 2050152);
                break;
            case 6:
                com.vk.lists.c cVar3 = (com.vk.lists.c) obj4;
                GroupsSuggestions groupsSuggestions = (GroupsSuggestions) obj3;
                jdf0 jdf0Var = (jdf0) obj2;
                kru kruVar = (kru) obj;
                String s1 = kruVar.s1();
                cVar3.s(s1);
                if (s1 != null && s1.length() != 0 && !kruVar.getItems().isEmpty()) {
                    r5 = true;
                }
                cVar3.r(r5);
                groupsSuggestions.k = s1;
                groupsSuggestions.l.addAll(kruVar.getItems());
                if (!kruVar.getItems().isEmpty()) {
                    jdf0Var.G.n0(jdf0.c7(kruVar.s1(), kruVar.getItems()));
                }
                break;
            case 7:
                Ref$FloatRef ref$FloatRef = (Ref$FloatRef) obj4;
                x6p0 x6p0Var = (x6p0) obj3;
                gq2 gq2Var = (gq2) obj;
                zak0 zak0Var = (zak0) gq2Var.e;
                float floatValue = ((Number) zak0Var.getValue()).floatValue() - ref$FloatRef.element;
                float b = x6p0Var.b();
                x6p0Var.e(b + floatValue);
                float abs = Math.abs(b - x6p0Var.b());
                ref$FloatRef.element = ((Number) zak0Var.getValue()).floatValue();
                ((Ref$FloatRef) obj2).element = ((Number) gq2Var.b()).floatValue();
                if (Math.abs(floatValue - abs) > 0.5f) {
                    gq2Var.a();
                }
                break;
            default:
                utq0 utq0Var = (utq0) obj3;
                CatalogedGift catalogedGift = (CatalogedGift) obj2;
                ExtendedUserProfile extendedUserProfile = ((utq0.a) obj4).e;
                if (extendedUserProfile != null) {
                    utq0Var.o.B(new f.e.n1(extendedUserProfile, catalogedGift));
                    break;
                } else {
                    break;
                }
        }
        return s3q0.a;
    }

    public /* synthetic */ m0i(Object obj, Object obj2, Object obj3, int i) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
    }
}

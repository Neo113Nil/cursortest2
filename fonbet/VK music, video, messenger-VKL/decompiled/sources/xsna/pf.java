package xsna;

import android.content.Context;
import android.location.Location;
import com.vk.api.generated.apps.dto.AppsAppDto;
import com.vk.api.generated.apps.dto.AppsCatalogListDto;
import com.vk.api.generated.base.dto.BaseOkResponseDto;
import com.vk.api.generated.shortVideo.dto.ShortVideoSetCoOwnerStatusResponseDto;
import com.vk.api.sdk.exceptions.VKApiExecutionException;
import com.vk.catalog.mvi.block.video.impl.channel.AuthorsChannelSliderView$AuthorsChannelState;
import com.vk.clips.coauthors.list.pendings.mvi.entity.state.ClipCoauthorDecisionState;
import com.vk.core.apps.BuildInfo;
import com.vk.draftslist.impl.ui.entity.DraftsListState;
import com.vk.dto.common.AttachmentWithMedia;
import com.vk.im.ui.components.contacts.ContactsListFactory;
import com.vk.im.ui.components.contacts.SortOrder;
import com.vk.im.ui.fragments.chat.ChatFragment;
import com.vk.im.ui.views.dialog_actions.DialogActionsListView;
import com.vk.photos.ui.editalbum.domain.Mode;
import com.vk.superapp.api.internal.requests.app.ConfirmResult;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Pair;
import xsna.bhk;
import xsna.npb;
import xsna.tj50;
import xsna.ttf;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class pf implements izs {
    public final /* synthetic */ int b;

    public /* synthetic */ pf(int i) {
        this.b = i;
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.izs
    public final Object invoke(Object obj) {
        yvv yvvVar;
        boolean z = false;
        r1 = false;
        boolean z2 = false;
        z = false;
        switch (this.b) {
            case 0:
                return s3q0.a;
            case 1:
                it80.b.getClass();
                return new it80((Location) obj);
            case 2:
                AppsCatalogListDto appsCatalogListDto = (AppsCatalogListDto) obj;
                Integer valueOf = Integer.valueOf(appsCatalogListDto.getCount());
                List<AppsAppDto> e = appsCatalogListDto.e();
                ArrayList arrayList = new ArrayList(c5g.u(e, 10));
                for (AppsAppDto appsAppDto : e) {
                    ((re3) ue3.a.getValue()).getClass();
                    arrayList.add(re3.b(appsAppDto));
                }
                return new Pair(valueOf, arrayList);
            case 3:
                return AuthorsChannelSliderView$AuthorsChannelState.a((AuthorsChannelSliderView$AuthorsChannelState) obj, true);
            case 4:
                return s3q0.a;
            case 5:
                return (AttachmentWithMedia) obj;
            case 6:
                return (hda) obj;
            case 7:
                return s3q0.a;
            case 8:
                bn40.c((Throwable) obj, new Object[0]);
                return s3q0.a;
            case 9:
                ((pvw0) obj).Z();
                return s3q0.a;
            case 10:
                return new npb.c(((tj50.a) obj).a(new rf(15), ao8.d));
            case 11:
                ChatFragment.d dVar = ChatFragment.w1;
                if (BuildInfo.m() || (yvvVar = zvv.a.get()) == null) {
                    return s3q0.a;
                }
                ChatFragment.d dVar2 = ChatFragment.w1;
                yvvVar.b();
                throw null;
            case 12:
                int i = inc.l1;
                return aoc.a((ClipCoauthorDecisionState) obj);
            case 13:
                u0a u0aVar = (u0a) obj;
                if ((u0aVar instanceof y280) && ((y280) u0aVar).a.z.contains("local_block_id")) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 14:
                Object[] objArr = (Object[]) obj;
                ArrayList arrayList2 = new ArrayList(objArr.length);
                for (Object obj2 : objArr) {
                    arrayList2.add((ShortVideoSetCoOwnerStatusResponseDto) obj2);
                }
                return arrayList2;
            case 15:
                return new ttf.e(((tqf) obj).a);
            case 16:
                return Integer.valueOf(an10.b(sa30.E(((Float) obj).floatValue(), new k9x(-1, 1, 1), new k9x(-50, 50, 1))));
            case 17:
                Throwable th = (Throwable) obj;
                if (th instanceof VKApiExecutionException) {
                    j03.a.getClass();
                    j03.k((VKApiExecutionException) th);
                } else {
                    cvk.u(R.string.live_network_error_description, false);
                }
                return s3q0.a;
            case 18:
                qgi0.r((tgi0) obj, "priority_block_content_list");
                return s3q0.a;
            case 19:
                return ((ztg) obj).d;
            case 20:
                ContactsListFactory contactsListFactory = ContactsListFactory.CREATE_CONVERSATION_VKME;
                return new ldj(((x8j) obj).a, SortOrder.BY_CONTACT_NAME);
            case 21:
                return new tfu(n34.a(2));
            case 22:
                return s3q0.a;
            case 23:
                return Boolean.valueOf(!epx.f((n730) obj, z7x0.a));
            case 24:
                return ((bhk.a) obj).c;
            case 25:
                return ((BaseOkResponseDto) obj) == BaseOkResponseDto.OK ? ConfirmResult.OK : ConfirmResult.FAILURE;
            case 26:
                LinkedHashMap linkedHashMap = DialogActionsListView.j;
                return ((Context) obj).getString(R.string.vkim_dialog_shared_chats);
            case 27:
                return DraftsListState.a((DraftsListState) obj, null, null, 0, false, false, 31);
            case 28:
                com.vk.photos.ui.editalbum.domain.h hVar = (com.vk.photos.ui.editalbum.domain.h) obj;
                if ((hVar.g instanceof Mode.User) && !hVar.b) {
                    z2 = true;
                }
                return Boolean.valueOf(z2);
            default:
                return s3q0.a;
        }
    }
}

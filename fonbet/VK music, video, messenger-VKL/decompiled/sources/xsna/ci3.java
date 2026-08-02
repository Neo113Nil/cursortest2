package xsna;

import android.content.Context;
import com.vk.api.generated.friends.dto.FriendsGetBirthdaysResponseDto;
import com.vk.api.generated.friends.dto.FriendsGetBirthdaysSectionDto;
import com.vk.api.generated.friends.dto.FriendsGetBirthdaysSectionProfileDto;
import com.vk.clips.design.view.correction.CorrectionsRecyclerView;
import com.vk.draftslist.impl.ui.entity.DraftsListState;
import com.vk.dto.attaches.AttachWithImage;
import com.vk.dto.common.Attachment;
import com.vk.dto.common.Peer;
import com.vk.dto.user.UserProfile;
import com.vk.ecomm.onlinebooking.impl.services.presentation.model.BookingServicesScreenState;
import com.vk.im.engine.models.channels.ChannelsCounters;
import com.vk.im.engine.models.messages.MsgFromChannel;
import com.vk.im.ui.views.dialog_actions.DialogActionsListView;
import com.vk.log.L;
import com.vk.photos.ui.editalbum.domain.i;
import com.vkontakte.android.R;
import com.vkontakte.android.attachments.MarketAttachment;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import kotlin.collections.EmptyList;
import org.json.JSONObject;
import xsna.bhk;
import xsna.c8x0;
import xsna.npb;
import xsna.tj50;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class ci3 implements izs {
    public final /* synthetic */ int b;

    public /* synthetic */ ci3(int i) {
        this.b = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.util.ArrayList] */
    @Override // xsna.izs
    public final Object invoke(Object obj) {
        ?? r2;
        switch (this.b) {
            case 0:
                ChannelsCounters.b bVar = ((ChannelsCounters) obj).c;
                qcy<Object> qcyVar = ChannelsCounters.g[2];
                Integer num = (Integer) bVar.a().a();
                return Boolean.valueOf((num != null ? num.intValue() : 0) > 0);
            case 1:
                return (AttachWithImage) obj;
            case 2:
                FriendsGetBirthdaysResponseDto friendsGetBirthdaysResponseDto = (FriendsGetBirthdaysResponseDto) obj;
                List<FriendsGetBirthdaysSectionDto> d = friendsGetBirthdaysResponseDto.d();
                if (d != null) {
                    List<FriendsGetBirthdaysSectionDto> list = d;
                    r2 = new ArrayList(c5g.u(list, 10));
                    for (FriendsGetBirthdaysSectionDto friendsGetBirthdaysSectionDto : list) {
                        String title = friendsGetBirthdaysSectionDto.getTitle();
                        List<FriendsGetBirthdaysSectionProfileDto> d2 = friendsGetBirthdaysSectionDto.d();
                        if (d2 == null) {
                            d2 = EmptyList.b;
                        }
                        r2.add(new ab7(title, d2));
                    }
                } else {
                    r2 = EmptyList.b;
                }
                List<FriendsGetBirthdaysSectionDto> d3 = friendsGetBirthdaysResponseDto.d();
                return new qa7(r2, !(d3 == null || d3.isEmpty()));
            case 3:
                return ((BookingServicesScreenState.ServiceWrapper) obj).b;
            case 4:
                return ((c8x0.c) ((c8x0) obj)).a;
            case 5:
                ((pvw0) obj).D();
                return s3q0.a;
            case 6:
                return Boolean.valueOf(((Attachment) obj) instanceof MarketAttachment);
            case 7:
                return String.valueOf(((MsgFromChannel) obj).d);
            case 8:
                return String.valueOf(((Peer) obj).b);
            case 9:
                return new npb.b(((tj50.a) obj).a(new nk(9), ao8.d));
            case 10:
                return s3q0.a;
            case 11:
                return (File) obj;
            case 12:
                Throwable th = (Throwable) obj;
                h03.b(th);
                L.g("ClipsTemplateEditorCropperActionsHandlerImpl", th);
                return s3q0.a;
            case 13:
                return null;
            case 14:
                return Float.valueOf(sa30.E(((Float) obj).floatValue(), new k9x(0, 100, 1), new k9x(-1, 1, 1)));
            case 15:
                Throwable th2 = (Throwable) obj;
                h03.b(th2);
                com.vk.metrics.eventtracking.b.a.a(th2);
                return s3q0.a;
            case 16:
                return Integer.valueOf(((ztg) obj).h);
            case 17:
                List list2 = (List) obj;
                ArrayList arrayList = new ArrayList(c5g.u(list2, 10));
                Iterator it = list2.iterator();
                if (!it.hasNext()) {
                    return c5g.v(arrayList);
                }
                ((k2i0) it.next()).getClass();
                new ArrayList(c5g.u(null, 10));
                throw null;
            case 18:
                lwj lwjVar = (lwj) obj;
                int i = CorrectionsRecyclerView.i;
                lwjVar.c = true;
                return lwjVar;
            case 19:
                return ((bhk.a) obj).b;
            case 20:
                qgi0.r((tgi0) obj, "publication_input");
                return s3q0.a;
            case 21:
                qgi0.g((tgi0) obj);
                return s3q0.a;
            case 22:
                return new ArrayList();
            case 23:
                LinkedHashMap linkedHashMap = DialogActionsListView.j;
                return e3m.e(R.attr.im_ic_open_shared_chats, (Context) obj);
            case 24:
                return Boolean.valueOf(!((Set) obj).isEmpty());
            case 25:
                return new b0l0(((fku0) obj).a);
            case 26:
                return DraftsListState.a((DraftsListState) obj, null, DraftsListState.LoadingState.ERROR_INITIAL_LOAD, 0, false, false, 59);
            case 27:
                tj50.a aVar = (tj50.a) obj;
                czo czoVar = czo.b;
                ao8 ao8Var = ao8.d;
                return new i.a(aVar.a(czoVar, ao8Var), aVar.a(dzo.b, ao8Var), aVar.a(ezo.b, ao8Var), aVar.a(fzo.b, ao8Var), aVar.a(gzo.b, ao8Var), aVar.a(hzo.b, ao8Var), aVar.a(new pf(28), ao8Var));
            case 28:
                return s3q0.a;
            default:
                return new UserProfile((JSONObject) obj);
        }
    }
}

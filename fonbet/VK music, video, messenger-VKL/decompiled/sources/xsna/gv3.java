package xsna;

import android.content.Context;
import android.view.ViewGroup;
import com.vk.api.generated.base.dto.BaseBoolIntDto;
import com.vk.api.generated.calls.dto.CallsAsrTranscriptionItemDto;
import com.vk.api.generated.calls.dto.CallsChatDto;
import com.vk.api.generated.calls.dto.CallsGetAsrTranscriptionsResponseDto;
import com.vk.draftslist.impl.ui.entity.DraftsListState;
import com.vk.dto.attaches.AttachWithImage;
import com.vk.dto.common.data.VKList;
import com.vk.dto.photo.Photo;
import com.vk.ecomm.cart.impl.cart.ui.items.CartItem;
import com.vk.im.engine.models.messages.CnvMsgId;
import com.vk.im.engine.models.messages.NestedMsg;
import com.vk.im.ui.components.contacts.ContactsListFactory;
import com.vk.im.ui.views.dialog_actions.DialogActionsListView;
import com.vk.log.L;
import com.vkontakte.android.R;
import com.vkontakte.android.attachments.PhotoAttachment;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import org.json.JSONObject;
import xsna.bhk;
import xsna.iqq;
import xsna.n410;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes7.dex */
public final /* synthetic */ class gv3 implements izs {
    public final /* synthetic */ int b;

    public /* synthetic */ gv3(int i) {
        this.b = i;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                CallsGetAsrTranscriptionsResponseDto callsGetAsrTranscriptionsResponseDto = (CallsGetAsrTranscriptionsResponseDto) obj;
                List<CallsAsrTranscriptionItemDto> d = callsGetAsrTranscriptionsResponseDto.d();
                ArrayList arrayList = new ArrayList(c5g.u(d, 10));
                for (CallsAsrTranscriptionItemDto callsAsrTranscriptionItemDto : d) {
                    String f = callsAsrTranscriptionItemDto.f();
                    String j = callsAsrTranscriptionItemDto.j();
                    String i = callsAsrTranscriptionItemDto.i();
                    int e = callsAsrTranscriptionItemDto.e();
                    Integer g = callsAsrTranscriptionItemDto.g();
                    CallsChatDto d2 = callsAsrTranscriptionItemDto.d();
                    arrayList.add(new ev3(e, f, j, i, d2 != null ? d2.getTitle() : null, g));
                }
                VKList vKList = new VKList(arrayList);
                vKList.o(callsGetAsrTranscriptionsResponseDto.getCount());
                return vKList;
            case 1:
                return (AttachWithImage) ca3.b(new PhotoAttachment((Photo) obj));
            case 2:
                return s3q0.a;
            case 3:
                return new tfu(n34.a(((ery) obj).a()));
            case 4:
                return s3q0.a;
            case 5:
                return qjg.a((CartItem) obj);
            case 6:
                qgi0.r((tgi0) obj, "catalog_banner_ad_free_sub_title_test_tag");
                return s3q0.a;
            case 7:
                NestedMsg nestedMsg = (NestedMsg) obj;
                return new CnvMsgId(nestedMsg.e, nestedMsg.d);
            case 8:
                lyd.a.a("ClipsAdvancedEditorActionsHandler", (Throwable) obj);
                return s3q0.a;
            case 9:
                return Boolean.valueOf(!((List) obj).isEmpty());
            case 10:
                L.e("ClipsThumbsUploadTaskGU", "getUploadServer: " + ((ncq0) obj));
                return s3q0.a;
            case 11:
                return Float.valueOf(sa30.E(((Float) obj).floatValue(), new k9x(0, 100, 1), new k9x(-1, 1, 1)));
            case 12:
                return Boolean.valueOf(((ztg) obj).c);
            case 13:
                qgi0.r((tgi0) obj, "groupBannerIcon");
                return s3q0.a;
            case 14:
                ContactsListFactory contactsListFactory = ContactsListFactory.CREATE_CONVERSATION_VKME;
                return new z8j(0);
            case 15:
                return Boolean.valueOf(((bhk.a) obj).g);
            case 16:
                return new zl7((ViewGroup) obj);
            case 17:
                LinkedHashMap linkedHashMap = DialogActionsListView.j;
                return e3m.e(R.attr.im_ic_notifications_on, (Context) obj);
            case 18:
                return Boolean.valueOf(brm0.B((String) obj, "PRIMARY", false));
            case 19:
                zk70.e((Throwable) obj);
                return s3q0.a;
            case 20:
                return new b0l0(((nna0) obj).a);
            case 21:
                qgi0.r((tgi0) obj, "DonutTeaserCancelButton");
                return s3q0.a;
            case 22:
                return DraftsListState.a((DraftsListState) obj, null, DraftsListState.LoadingState.LOADING_REFRESH, 0, false, false, 59);
            case 23:
                qgi0.r((tgi0) obj, "edit_storefront_album_top_bar_done");
                return s3q0.a;
            case 24:
                return new wsq(iqq.a.a(((JSONObject) obj).getJSONObject("response")), null);
            case 25:
                L.i((Throwable) obj);
                return s3q0.a;
            case 26:
                return s3q0.a;
            case 27:
                ((ojt) obj).b = 100;
                return s3q0.a;
            case 28:
                return Boolean.valueOf(((BaseBoolIntDto) obj).i() == BaseBoolIntDto.YES.i());
            default:
                n410.a aVar = ((x410) obj).G;
                if (aVar != null) {
                    return new q48(aVar.a, aVar.b);
                }
                return null;
        }
    }

    public /* synthetic */ gv3(jvi jviVar) {
        this.b = 0;
    }
}

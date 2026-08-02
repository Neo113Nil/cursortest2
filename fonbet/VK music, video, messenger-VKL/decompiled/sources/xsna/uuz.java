package xsna;

import android.net.Uri;
import com.ironsource.X3;
import com.unity3d.services.UnityAdsConstants;
import com.vk.api.generated.base.dto.BaseBoolIntDto;
import com.vk.api.generated.friends.dto.FriendsGetListsResponseDto;
import com.vk.api.generated.groups.dto.GroupsGetByIdObjectResponseDto;
import com.vk.api.generated.groups.dto.GroupsGroupFullDto;
import com.vk.api.generated.messages.dto.MessagesGetConversationsResponseDto;
import com.vk.api.generated.messages.dto.MessagesGetGroupsForCallResponseDto;
import com.vk.api.generated.store.dto.StoreStockItemDiscountsDto;
import com.vk.core.preference.Preference;
import com.vk.core.serialize.Serializer;
import com.vk.dto.common.im.ImageList;
import com.vk.dto.group.Group;
import com.vk.dto.user.UserProfile;
import com.vk.log.L;
import com.vk.mediastore.system.AlbumEntry;
import com.vk.voip.userid.CallsUserId;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;
import xsna.df50;
import xsna.er9;
import xsna.f6e0;
import xsna.kx00;
import xsna.tj50;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class uuz implements izs {
    public final /* synthetic */ int b;

    public /* synthetic */ uuz(int i) {
        this.b = i;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : (Object[]) obj) {
                    if (obj2 instanceof AlbumEntry) {
                        arrayList.add(obj2);
                    }
                }
                return j5g.O0(arrayList);
            case 1:
                qaj0.c(Preference.l(), "pref_last_known_location_json", ((JSONObject) obj).toString());
                return s3q0.a;
            case 2:
                return ((kx00.a) ((kx00) obj)).e;
            case 3:
                return Boolean.valueOf(((BaseBoolIntDto) obj) == BaseBoolIntDto.YES);
            case 4:
                return Boolean.valueOf(((y810) obj).t);
            case 5:
                com.vk.metrics.eventtracking.b.a.a((Throwable) obj);
                return s3q0.a;
            case 6:
                ((vak0) co20.o).g(((Float) obj).floatValue());
                return s3q0.a;
            case 7:
                return Boolean.FALSE;
            case 8:
                bn40.c((Throwable) obj, new Object[0]);
                return s3q0.a;
            case 9:
                return new tt70(5, 0L, rli0.A(rli0.y(rli0.t(new i5g((List) obj), new d220(6)), 2)));
            case 10:
                return df50.a.b.a;
            case 11:
                return ((me70) obj).getClass();
            case 12:
                return Boolean.valueOf(((sy40) obj).B);
            case 13:
                return s3q0.a;
            case 14:
                qgi0.r((tgi0) obj, "PostingMediaPickerToolbarButtonClose");
                return s3q0.a;
            case 15:
                new dqu();
                List<GroupsGroupFullDto> d = ((GroupsGetByIdObjectResponseDto) obj).d();
                if (d != null) {
                    return dqu.a((GroupsGroupFullDto) j5g.Y(d));
                }
                throw new IllegalArgumentException("Required value was null.");
            case 16:
                return Boolean.valueOf(epx.f(((Uri) obj).getScheme(), X3.i.b));
            case 17:
                return ((FriendsGetListsResponseDto) obj).d();
            case 18:
                qgi0.r((tgi0) obj, "product_card_restriction_icon");
                return s3q0.a;
            case 19:
                return new UserProfile((Group) obj);
            case 20:
                return new f6e0.a(((tj50.a) obj).a(new ept(23), ao8.d));
            case 21:
                ggj ggjVar = (ggj) obj;
                er9.b a0 = ggjVar.a0();
                long d2 = a0.d();
                a0.a().e();
                try {
                    a0.a.c(-3.4028235E38f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, Float.MAX_VALUE, Float.MAX_VALUE, 1);
                    ggjVar.s1();
                    nq.b(a0, d2);
                    return s3q0.a;
                } catch (Throwable th) {
                    nq.b(a0, d2);
                    throw th;
                }
            case 22:
                List<GroupsGroupFullDto> d3 = ((MessagesGetGroupsForCallResponseDto) obj).d();
                ArrayList arrayList2 = new ArrayList(c5g.u(d3, 10));
                for (GroupsGroupFullDto groupsGroupFullDto : d3) {
                    Serializer.c<? extends Serializer.StreamParcelable> cVar = CallsUserId.CREATOR;
                    CallsUserId.VkUserId vkUserId = new CallsUserId.VkUserId(fkq0.e(groupsGroupFullDto.P0()));
                    String y1 = groupsGroupFullDto.y1();
                    if (y1 == null) {
                        y1 = "";
                    }
                    Serializer.c<ImageList> cVar2 = ImageList.CREATOR;
                    arrayList2.add(new rww0(vkUserId, y1, ImageList.a.a(groupsGroupFullDto.V1()), epx.f(groupsGroupFullDto.N3(), Boolean.TRUE)));
                }
                return arrayList2;
            case 23:
                return new jgh0(((Integer) obj).intValue());
            case 24:
                return Integer.valueOf(((MessagesGetConversationsResponseDto) obj).getCount());
            case 25:
                L.i((Throwable) obj);
                return s3q0.a;
            case 26:
                return u8l0.b((StoreStockItemDiscountsDto) obj);
            case 27:
                return drm0.p0(((pno0) obj).d()).toString();
            case 28:
                qgi0.u((tgi0) obj);
                return s3q0.a;
            default:
                qgi0.r((tgi0) obj, "ToolbarTags.TITLE");
                return s3q0.a;
        }
    }

    public /* synthetic */ uuz(Object obj, int i) {
        this.b = i;
    }
}

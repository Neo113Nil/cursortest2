package xsna;

import android.widget.ImageView;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.vk.api.generated.catalog.dto.CatalogSectionResponseObjectDto;
import com.vk.api.generated.stories.dto.StoriesGetV5113ResponseDto;
import com.vk.core.serialize.Serializer;
import com.vk.dto.notifications.NotificationItem;
import com.vk.dto.notifications.NotificationsGetResponse$NotificationsResponseItem;
import com.vk.dto.notifications.settings.NotificationSettingsCategory;
import com.vk.dto.notifications.settings.NotificationsSettingsConfig;
import com.vk.ecomm.onlinebooking.impl.records.ui.BookingRecordsScreenFragment;
import com.vk.log.L;
import com.vk.profile.community.impl.ui.profile.actions.CommunityProfileAction;
import java.util.ArrayList;
import kotlin.jvm.internal.FunctionReferenceImpl;
import org.json.JSONArray;
import org.json.JSONObject;
import ru.ok.android.utils.Logger;
import xsna.xn50;

/* compiled from: BookingRecordsScreenFragment.kt */
/* loaded from: classes18.dex */
public final /* synthetic */ class hv7 extends FunctionReferenceImpl implements izs {
    public final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ hv7(int i, Object obj, Class cls, String str, String str2, int i2, int i3) {
        super(i, obj, cls, str, str2, i2);
        this.b = i3;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        JSONArray jSONArray;
        NotificationSettingsCategory[] notificationSettingsCategoryArr;
        JSONArray jSONArray2;
        dk70[] dk70VarArr;
        ArrayList arrayList;
        String str;
        NotificationsGetResponse$NotificationsResponseItem notificationsGetResponse$NotificationsResponseItem;
        int i = 0;
        switch (this.b) {
            case 0:
                BookingRecordsScreenFragment bookingRecordsScreenFragment = (BookingRecordsScreenFragment) this.receiver;
                bookingRecordsScreenFragment.getClass();
                xn50.a.c(bookingRecordsScreenFragment, (dv7) obj);
                return s3q0.a;
            case 1:
                L.i((Throwable) obj);
                return s3q0.a;
            case 2:
                com.vk.profile.community.impl.ui.profile.a aVar = (com.vk.profile.community.impl.ui.profile.a) this.receiver;
                aVar.getClass();
                if (epx.f(((zaa0) obj).c, aVar.i.a)) {
                    aVar.C(new CommunityProfileAction.o(false));
                }
                return s3q0.a;
            case 3:
                ((kmz) this.receiver).b.invoke();
                return s3q0.a;
            case 4:
                return ((afa) this.receiver).a((CatalogSectionResponseObjectDto) obj);
            case 5:
                ((ek70) this.receiver).getClass();
                JSONObject optJSONObject = ((JSONObject) obj).optJSONObject("response");
                if (optJSONObject == null) {
                    return new dk70[0];
                }
                JSONObject optJSONObject2 = optJSONObject.optJSONObject("sections");
                if (optJSONObject2 == null) {
                    optJSONObject2 = optJSONObject;
                }
                String str2 = "items";
                JSONArray optJSONArray = optJSONObject2.optJSONArray("items");
                if (optJSONArray == null) {
                    JSONObject optJSONObject3 = optJSONObject.optJSONObject("items");
                    optJSONArray = optJSONObject3 != null ? new JSONArray().put(optJSONObject3) : null;
                    if (optJSONArray == null) {
                        return new dk70[0];
                    }
                }
                zj70 zj70Var = new zj70(optJSONObject2);
                int length = optJSONArray.length();
                dk70[] dk70VarArr2 = new dk70[length];
                int i2 = 0;
                while (i2 < length) {
                    JSONObject optJSONObject4 = optJSONArray.optJSONObject(i2);
                    String optString = optJSONObject4.optString("id");
                    String optString2 = optJSONObject4.optString("section_title");
                    JSONArray optJSONArray2 = optJSONObject4.optJSONArray(str2);
                    if (optJSONArray2 != null) {
                        int length2 = optJSONArray2.length();
                        notificationSettingsCategoryArr = new NotificationSettingsCategory[length2];
                        int i3 = i;
                        while (i3 < length2) {
                            JSONObject optJSONObject5 = optJSONArray2.optJSONObject(i3);
                            Serializer.c<NotificationSettingsCategory> cVar = NotificationSettingsCategory.CREATOR;
                            String optString3 = optJSONObject5.optString("id");
                            String optString4 = optJSONObject5.optString("label");
                            String optString5 = optJSONObject5.optString("description");
                            String optString6 = optJSONObject5.optString("icon_type");
                            String optString7 = optJSONObject5.optString(CampaignEx.JSON_KEY_ICON_URL);
                            String optString8 = optJSONObject5.optString("push_key");
                            String optString9 = optJSONObject5.optString("push_value");
                            JSONArray optJSONArray3 = optJSONObject5.optJSONArray("settings");
                            int i4 = length;
                            qey qeyVar = NotificationsSettingsConfig.g;
                            String str3 = str2;
                            if (optJSONArray3 != null) {
                                jSONArray2 = optJSONArray;
                                ArrayList arrayList2 = new ArrayList(optJSONArray3.length());
                                int length3 = optJSONArray3.length();
                                dk70VarArr = dk70VarArr2;
                                int i5 = 0;
                                while (i5 < length3) {
                                    int i6 = length3;
                                    JSONObject optJSONObject6 = optJSONArray3.optJSONObject(i5);
                                    if (optJSONObject6 != null) {
                                        arrayList2.add(qeyVar.invoke(optJSONObject6));
                                    }
                                    i5++;
                                    length3 = i6;
                                }
                                arrayList = arrayList2;
                            } else {
                                jSONArray2 = optJSONArray;
                                dk70VarArr = dk70VarArr2;
                                arrayList = null;
                            }
                            int optInt = optJSONObject5.optInt("count", -1);
                            JSONObject optJSONObject7 = optJSONObject5.optJSONObject("hint_example");
                            if (optJSONObject7 != null) {
                                Serializer.c<NotificationsGetResponse$NotificationsResponseItem> cVar2 = NotificationsGetResponse$NotificationsResponseItem.CREATOR;
                                Serializer.c<NotificationItem> cVar3 = NotificationItem.CREATOR;
                                str = null;
                                notificationsGetResponse$NotificationsResponseItem = new NotificationsGetResponse$NotificationsResponseItem(NotificationItem.a.a(optJSONObject7, zj70Var), null, null);
                            } else {
                                str = null;
                                notificationsGetResponse$NotificationsResponseItem = null;
                            }
                            notificationSettingsCategoryArr[i3] = new NotificationSettingsCategory(optString3, optString4, optString5, optString6, optString7, optString8, optString9, arrayList, optInt, notificationsGetResponse$NotificationsResponseItem, optJSONObject5.optString("hint_text", str));
                            i3++;
                            length = i4;
                            str2 = str3;
                            optJSONArray = jSONArray2;
                            dk70VarArr2 = dk70VarArr;
                        }
                        jSONArray = optJSONArray;
                    } else {
                        jSONArray = optJSONArray;
                        notificationSettingsCategoryArr = null;
                    }
                    int i7 = length;
                    String str4 = str2;
                    dk70[] dk70VarArr3 = dk70VarArr2;
                    dk70VarArr3[i2] = new dk70(optString, optString2, notificationSettingsCategoryArr);
                    i2++;
                    length = i7;
                    str2 = str4;
                    optJSONArray = jSONArray;
                    dk70VarArr2 = dk70VarArr3;
                    i = 0;
                }
                return dk70VarArr2;
            case 6:
                L.i((Throwable) obj);
                return s3q0.a;
            case 7:
                ((o0i0) this.receiver).f((String) obj);
                return s3q0.a;
            case 8:
                return ((rsl0) this.receiver).a((StoriesGetV5113ResponseDto) obj);
            default:
                ((ImageView) this.receiver).setColorFilter(((Number) obj).intValue());
                return s3q0.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hv7(BookingRecordsScreenFragment bookingRecordsScreenFragment) {
        super(1, bookingRecordsScreenFragment, BookingRecordsScreenFragment.class, "sendAction", "sendAction(Lcom/vk/mvi/core/data/MviAction;)V", 0);
        this.b = 0;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hv7(Object obj, int i) {
        super(1, obj, L.class, Logger.METHOD_E, "e(Ljava/lang/Throwable;)V", 0);
        this.b = i;
        switch (i) {
            case 4:
                super(1, obj, afa.class, "map", "map(Lcom/vk/api/generated/catalog/dto/CatalogSectionResponseObjectDto;)Lcom/vk/catalog2/common/dto/api/CatalogResponse;", 0);
                break;
            case 5:
                super(1, obj, ek70.class, "parse", "parse(Lorg/json/JSONObject;)[Lcom/vk/dto/notifications/settings/NotificationsSettingsSection;", 0);
                break;
            case 6:
                super(1, obj, L.class, Logger.METHOD_E, "e(Ljava/lang/Throwable;)V", 0);
                break;
            default:
                break;
        }
    }
}

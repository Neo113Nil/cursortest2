package xsna;

import android.content.Context;
import com.vk.api.generated.friends.dto.FriendsGetFieldsResponseDto;
import com.vk.api.generated.users.dto.UsersUserFullDto;
import com.vk.dto.common.ImageSize;
import com.vk.dto.common.im.Image;
import com.vk.superapp.bridges.SuperappUiRouterBridge;
import com.vkontakte.android.R;
import java.util.HashMap;
import java.util.List;
import java.util.ListIterator;
import kotlin.collections.builders.ListBuilder;
import org.json.JSONArray;
import org.json.JSONObject;
import xsna.qs80;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class nkc implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Context c;

    public /* synthetic */ nkc(Context context, int i) {
        this.b = i;
        this.c = context;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        Context context;
        Object obj2;
        String W1;
        ListBuilder a;
        String W12;
        ListBuilder a2;
        int i = this.b;
        Context context2 = this.c;
        switch (i) {
            case 0:
                if ((((qs80) obj) instanceof qs80.a) && (context = this.c) != null) {
                    cmf0.d(context, s200.y(context), context.getString(R.string.clip_delete_success), false, (56 & 16) != 0 ? iah0.a(88) : 0, (56 & 32) != 0);
                }
                break;
            case 1:
                SuperappUiRouterBridge superappUiRouterBridge = e370.d;
                (superappUiRouterBridge != null ? superappUiRouterBridge : null).j(context2.getString(R.string.vk_common_network_error));
                break;
            default:
                List<UsersUserFullDto> d = ((FriendsGetFieldsResponseDto) obj).d();
                UsersUserFullDto usersUserFullDto = (UsersUserFullDto) j5g.a0(d);
                HashMap a3 = hq.a("type", "friend", "title", "Новая заявка в друзья");
                StringBuilder sb = new StringBuilder();
                sb.append(usersUserFullDto != null ? usersUserFullDto.D0() : null);
                sb.append(" хочет добавить Вас в друзья");
                a3.put("body", sb.toString());
                JSONObject jSONObject = new JSONObject();
                JSONObject jSONObject2 = new JSONObject();
                JSONArray jSONArray = new JSONArray();
                if (usersUserFullDto != null && (a2 = bi70.a(usersUserFullDto)) != null) {
                    ListIterator listIterator = a2.listIterator(0);
                    while (true) {
                        ListBuilder.a aVar = (ListBuilder.a) listIterator;
                        if (aVar.hasNext()) {
                            ImageSize imageSize = (ImageSize) aVar.next();
                            JSONObject jSONObject3 = new JSONObject();
                            Image image = imageSize.d;
                            jSONObject3.put("url", image.d);
                            jSONObject3.put("width", image.b);
                            jSONObject3.put("height", image.c);
                            jSONArray.put(jSONObject3);
                        }
                    }
                }
                if (usersUserFullDto != null && (W12 = usersUserFullDto.W1()) != null) {
                    JSONObject jSONObject4 = new JSONObject();
                    jSONObject4.put("url", W12);
                    jSONObject4.put("width", 200);
                    jSONObject4.put("height", 200);
                    jSONArray.put(jSONObject4);
                }
                s3q0 s3q0Var = s3q0.a;
                jSONObject2.put("photo", jSONArray);
                if (usersUserFullDto == null || (obj2 = rq.a(usersUserFullDto, new StringBuilder(), ' ')) == null) {
                    obj2 = "";
                }
                jSONObject2.put("title", obj2);
                jSONObject2.put("subtitle", "хочет добавить Вас в друзья");
                JSONObject jSONObject5 = new JSONObject();
                StringBuilder sb2 = new StringBuilder();
                UsersUserFullDto usersUserFullDto2 = (UsersUserFullDto) j5g.b0(1, d);
                sb2.append(usersUserFullDto2 != null ? rq.a(usersUserFullDto2, new StringBuilder(), ' ') : null);
                sb2.append(" и ещё 20 общих друзей");
                jSONObject5.put("text", sb2.toString());
                JSONArray jSONArray2 = new JSONArray();
                for (int i2 = 1; i2 < 4; i2++) {
                    JSONArray jSONArray3 = new JSONArray();
                    UsersUserFullDto usersUserFullDto3 = (UsersUserFullDto) j5g.b0(i2, d);
                    if (usersUserFullDto3 != null && (a = bi70.a(usersUserFullDto3)) != null) {
                        ListIterator listIterator2 = a.listIterator(0);
                        while (true) {
                            ListBuilder.a aVar2 = (ListBuilder.a) listIterator2;
                            if (aVar2.hasNext()) {
                                ImageSize imageSize2 = (ImageSize) aVar2.next();
                                JSONObject jSONObject6 = new JSONObject();
                                Image image2 = imageSize2.d;
                                jSONObject6.put("url", image2.d);
                                jSONObject6.put("width", image2.b);
                                jSONObject6.put("height", image2.c);
                                jSONArray3.put(jSONObject6);
                                listIterator2 = listIterator2;
                            }
                        }
                    }
                    UsersUserFullDto usersUserFullDto4 = (UsersUserFullDto) j5g.b0(i2, d);
                    if (usersUserFullDto4 != null && (W1 = usersUserFullDto4.W1()) != null) {
                        JSONObject jSONObject7 = new JSONObject();
                        jSONObject7.put("url", W1);
                        jSONObject7.put("width", 200);
                        jSONObject7.put("height", 200);
                        jSONArray3.put(jSONObject7);
                    }
                    jSONArray2.put(jSONArray3);
                }
                s3q0 s3q0Var2 = s3q0.a;
                jSONObject5.put("images", jSONArray2);
                jSONObject2.put("mutual", jSONObject5);
                jSONObject.put("info", jSONObject2);
                a3.put("context", jSONObject.toString());
                e870 e870Var = e870.b;
                io.reactivex.rxjava3.internal.operators.observable.m1 b = e870.b(context2, a3);
                if (b != null) {
                    b.subscribe(new n1r(new m360(context2, 3), 12), new eiy(new p5e(com.vk.metrics.eventtracking.b.a, 5), 10));
                }
                break;
        }
        return s3q0.a;
    }
}

package xsna;

import android.content.Context;
import android.graphics.Bitmap;
import com.vk.api.generated.groups.dto.GroupsGetByIdObjectResponseDto;
import com.vk.dto.common.Attachment;
import com.vk.dto.music.Playlist;
import com.vk.dto.photo.Photo;
import com.vk.ecomm.onlinebooking.impl.model.BookingServiceModel;
import com.vk.friends.recommendations.impl.presentation.FriendsImportFragment;
import com.vk.log.L;
import com.vk.newsfeed.impl.fragments.EntriesListFragment;
import com.vk.voip.ui.asr.ui.start.AsrRecordStartFragment;
import com.vkontakte.android.attachments.FwdMessagesAttachment;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import org.json.JSONArray;
import org.json.JSONObject;
import ru.ok.android.externcalls.sdk.ConversationFactory;
import ru.ok.android.sdk.api.session.ApiSessionStore;
import xsna.hzg;
import xsna.it80;
import xsna.qls;
import xsna.tj50;
import xsna.us2;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class wh1 implements izs {
    public final /* synthetic */ int b;

    public /* synthetic */ wh1(int i) {
        this.b = i;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        ApiSessionStore lambda$callInternal$2;
        ArrayList arrayList;
        r2 = false;
        boolean z = false;
        switch (this.b) {
            case 0:
                return Boolean.valueOf(((com.vk.photos.root.albumdetails.presentation.j) obj).j);
            case 1:
                ((Float) obj).floatValue();
                return s3q0.a;
            case 2:
                return Boolean.valueOf(!(((us2.a) obj) instanceof fh90));
            case 3:
                int i = AsrRecordStartFragment.U;
                return Boolean.valueOf(((it80) obj).a != 0);
            case 4:
                return Boolean.valueOf(((sy40) obj).e.d);
            case 5:
                return s3q0.a;
            case 6:
                return ((BookingServiceModel) obj).c;
            case 7:
                Map.Entry entry = (Map.Entry) obj;
                return io.reactivex.rxjava3.core.q.O((Collection) entry.getValue()).U(new qj4(new vdb(((Number) entry.getKey()).longValue()), 5));
            case 8:
                return new j7g((Context) obj);
            case 9:
                return ((vtg) obj).c;
            case 10:
                tj50.a aVar = (tj50.a) obj;
                g53 g53Var = new g53(10);
                ao8 ao8Var = ao8.d;
                return new hzg.b(aVar.a(g53Var, ao8Var), aVar.a(new mo1(19), ao8Var));
            case 11:
                qgi0.r((tgi0) obj, "community_top_bar_subscription_container");
                return s3q0.a;
            case 12:
                L.g("Error on get main call participant list", (Throwable) obj);
                return s3q0.a;
            case 13:
                lambda$callInternal$2 = ConversationFactory.lambda$callInternal$2((ApiSessionStore) obj);
                return lambda$callInternal$2;
            case 14:
                return ((c9k) obj).t;
            case 15:
                return com.vk.im.engine.internal.storage.delegates.dialogs.b.e(((nrm) obj).a);
            case 16:
                com.vk.metrics.eventtracking.b.a.a((Throwable) obj);
                return s3q0.a;
            case 17:
                int i2 = EntriesListFragment.m0;
                qgi0.r((tgi0) obj, "toolbar_back_tag");
                return s3q0.a;
            case 18:
                return new qls.b(((tj50.a) obj).a(new p60(24), ao8.d));
            case 19:
                int i3 = FriendsImportFragment.a0;
                return s3q0.a;
            case 20:
                JSONArray optJSONArray = ((JSONObject) obj).getJSONObject("response").optJSONArray("items");
                Photo.b bVar = Photo.R;
                if (optJSONArray != null) {
                    arrayList = new ArrayList(optJSONArray.length());
                    int length = optJSONArray.length();
                    for (int i4 = 0; i4 < length; i4++) {
                        JSONObject optJSONObject = optJSONArray.optJSONObject(i4);
                        if (optJSONObject != null) {
                            arrayList.add((Photo) bVar.a(optJSONObject));
                        }
                    }
                } else {
                    arrayList = null;
                }
                if (arrayList != null) {
                    return j5g.V(arrayList);
                }
                return null;
            case 21:
                L.i((Throwable) obj);
                return s3q0.a;
            case 22:
                new dqu();
                return dqu.a(((GroupsGetByIdObjectResponseDto) obj).d().get(0));
            case 23:
                it80.b.getClass();
                return it80.a.a();
            case 24:
                return Boolean.valueOf(!(((Attachment) obj) instanceof FwdMessagesAttachment));
            case 25:
                com.vk.metrics.eventtracking.b.a.a((Throwable) obj);
                return s3q0.a;
            case 26:
                return ((Playlist) obj).m;
            case 27:
                return j5g.y0((List) obj);
            case 28:
                return new Pair((Bitmap) obj, null);
            default:
                u0a u0aVar = (u0a) obj;
                if ((u0aVar instanceof y280) && ((y280) u0aVar).a.z.contains("local_block_id")) {
                    z = true;
                }
                return Boolean.valueOf(z);
        }
    }

    public /* synthetic */ wh1(com.vk.im.engine.internal.storage.delegates.dialogs.b bVar) {
        this.b = 15;
    }
}

package xsna;

import android.hardware.SensorEvent;
import android.location.Location;
import android.util.Log;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.services.UnityAdsConstants;
import com.vk.api.generated.groups.dto.GroupsGetByIdObjectResponseDto;
import com.vk.api.generated.groups.dto.GroupsGroupFullDto;
import com.vk.api.generated.users.dto.UsersUserFullDto;
import com.vk.clips.design.view.timeline.TimelineVoiceoverView;
import com.vk.core.serialize.Serializer;
import com.vk.dto.newsfeed.entries.Photos;
import com.vk.dto.photo.Photo;
import com.vk.dto.stickers.StickerStockItem;
import com.vk.dto.user.ImageStatus;
import com.vk.dto.video.Doc2DocItem;
import com.vk.im.engine.models.contacts.Contact;
import com.vk.im.engine.models.messages.MsgFromUser;
import com.vk.log.L;
import com.vk.video.ui.discovery.recommendations.VideoDiscoveryRecommendationsRepository;
import com.vk.video.ui.smartcrop.impl.presentation.feature.entity.SmartCropState;
import com.vk.video.ui.upload.impl.publish.presentation.publish.feature.entity.PublishState;
import com.vk.voip.VoipService;
import com.vk.voip.ui.VoipViewModelState;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import xsna.dra0;
import xsna.ggp0;
import xsna.oap;
import xsna.tj50;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class ev60 implements izs {
    public final /* synthetic */ int b;

    public /* synthetic */ ev60(int i) {
        this.b = i;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        r3 = true;
        boolean z = true;
        int i = 0;
        switch (this.b) {
            case 0:
                lu60 lu60Var = (lu60) obj;
                return lu60Var.a().isEmpty() ? io.reactivex.rxjava3.core.x.i(new RuntimeException("Cache is empty")) : io.reactivex.rxjava3.core.x.k(lu60Var);
            case 1:
                L.l("OKVoipAudioManager", ms9.b("playConnected onError=", (Throwable) obj));
                return s3q0.a;
            case 2:
                return new dra0.c((Location) obj);
            case 3:
                return ((sht0) obj).toString();
            case 4:
                qgi0.r((tgi0) obj, "PollExitDialogExitButton");
                return s3q0.a;
            case 5:
                Serializer.c<Photos> cVar = Photos.CREATOR;
                return Collections.singletonList(Photos.a.a((Photo) j5g.Y((ArrayList) obj)));
            case 6:
                MsgFromUser msgFromUser = (MsgFromUser) obj;
                return Boolean.valueOf(msgFromUser.Kb() && !msgFromUser.cc());
            case 7:
                qgi0.r((tgi0) obj, "product_card_community_subscribe_button");
                return s3q0.a;
            case 8:
                float[] fArr = ((SensorEvent) obj).values;
                if (fArr == null) {
                    return null;
                }
                return fArr;
            case 9:
                return new l1h0((Map<Object, Map<String, List<Object>>>) obj);
            case 10:
                return SmartCropState.a((SmartCropState) obj, null, null, null, null, 0L, false, null, false, false, null, IronSourceError.ERROR_INIT_ALREADY_FINISHED);
            case 11:
                return StickerStockItem.Ab((StickerStockItem) obj, false, 0, null, null, -536870913, 8191);
            case 12:
                return (UsersUserFullDto) j5g.Y((List) obj);
            case 13:
                return new io.reactivex.rxjava3.internal.operators.observable.s0(new lfk(new oap.b((String) obj), r3 ? 1 : 0)).L(new a0m0(new zzl0(i), i), false);
            case 14:
                int i2 = TimelineVoiceoverView.v;
                Log.e("ClipsEditorVoiceoverView", "", (Throwable) obj);
                return s3q0.a;
            case 15:
                tj50.a aVar = (tj50.a) obj;
                m4k0 m4k0Var = new m4k0(8);
                ao8 ao8Var = ao8.d;
                return new ggp0.a.C2942a(aVar.a(m4k0Var, ao8Var), aVar.a(cgp0.b, ao8Var), aVar.a(new e750(22), ao8Var), aVar.a(new ygm0(5), ao8Var));
            case 16:
                return PublishState.a((PublishState) obj, null, null, null, null, false, null, null, null, null, null, false, false, null, null, null, null, null, null, null, null, null, null, false, false, false, null, null, null, null, false, null, null, false, false, null, false, false, null, false, false, false, false, -4097, 2047);
            case 17:
                Integer num = (Integer) obj;
                if (num != null && num.intValue() == 0) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 18:
                List list = (List) obj;
                List list2 = list;
                ArrayList arrayList = new ArrayList(c5g.u(list2, 10));
                Iterator it = list2.iterator();
                while (it.hasNext()) {
                    arrayList.add(new Doc2DocItem.Video(Collections.singletonList(((czs0) it.next()).a)));
                }
                return new VideoDiscoveryRecommendationsRepository.a(new c3t(arrayList, list.size()), null, 14);
            case 19:
                qgi0.r((tgi0) obj, "ad_banner_dismiss_button");
                return s3q0.a;
            case 20:
                hd60.a().l1((ImageStatus) obj);
                hf8.b("com.vkontakte.android.ACTION_USER_IMAGE_STATUS_CHANGED");
                return s3q0.a;
            case 21:
                return s3q0.a;
            case 22:
                q5j q5jVar = (q5j) obj;
                m6j m6jVar = q5jVar.d;
                s5j s5jVar = q5jVar.c;
                jor0.a(m6jVar, s5jVar.c, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 6);
                jcv.b(q5jVar.g, s5jVar.f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 6);
                return s3q0.a;
            case 23:
                return "VKPay Checkout: ".concat((String) obj);
            case 24:
                return (Contact) ((qtd0) obj);
            case 25:
                Object obj2 = VoipService.q;
                com.vk.voip.ui.c.b.getClass();
                return Boolean.valueOf(com.vk.voip.ui.c.K0 == VoipViewModelState.ReceivingCallFromPeer && !com.vk.voip.ui.c.J);
            default:
                new dqu();
                List<GroupsGroupFullDto> d = ((GroupsGetByIdObjectResponseDto) obj).d();
                if (d != null) {
                    return dqu.a((GroupsGroupFullDto) j5g.Y(d));
                }
                throw new IllegalArgumentException("Required value was null.");
        }
    }

    public /* synthetic */ ev60(VoipService voipService) {
        this.b = 25;
    }
}

package xsna;

import android.content.Intent;
import android.os.Bundle;
import android.view.ViewGroup;
import com.vk.api.generated.messages.dto.MessagesConversationCanWriteDto;
import com.vk.api.generated.messages.dto.MessagesConversationDto;
import com.vk.api.generated.messages.dto.MessagesGetConversationByIdDto;
import com.vk.api.generated.shortVideo.dto.ShortVideoGetResponseDto;
import com.vk.ecomm.cart.api.model.DeliveryPoint;
import com.vk.ecomm.cart.impl.points_map.ui.fragment.DeliveryPointsMapFragment;
import com.vk.log.L;
import com.vk.newsfeed.impl.postmodal.comments.CommentsOutherFragment;
import com.vk.voip.ui.hint.VoipHintView;
import com.vk.voip.ui.hint.a;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.FunctionReferenceImpl;
import ru.ok.android.utils.Logger;

/* compiled from: ClipsShareRemoteStorage.kt */
/* loaded from: classes17.dex */
public final /* synthetic */ class l3f extends FunctionReferenceImpl implements izs {
    public final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l3f(int i, Object obj, Class cls, String str, String str2, int i2, int i3) {
        super(i, obj, cls, str, str2, i2);
        this.b = i3;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                ((p3f) this.receiver).getClass();
                List<MessagesConversationDto> d = ((MessagesGetConversationByIdDto) obj).d();
                ArrayList arrayList = new ArrayList(c5g.u(d, 10));
                Iterator<T> it = d.iterator();
                while (it.hasNext()) {
                    MessagesConversationCanWriteDto e = ((MessagesConversationDto) it.next()).e();
                    arrayList.add(Boolean.valueOf(!((e == null || e.d()) ? false : true)));
                }
                Boolean bool = (Boolean) j5g.a0(arrayList);
                return Boolean.valueOf(bool != null ? bool.booleanValue() : false);
            case 1:
                int intValue = ((Number) obj).intValue();
                ViewGroup viewGroup = ((CommentsOutherFragment) this.receiver).U;
                if (viewGroup != null) {
                    f4m.v(intValue, viewGroup);
                }
                return s3q0.a;
            case 2:
                ((com.vk.profile.community.impl.ui.profile.a) this.receiver).T((com.vk.profile.community.impl.ui.profile.d) obj);
                return s3q0.a;
            case 3:
                com.vk.im.ui.components.contacts.a aVar = (com.vk.im.ui.components.contacts.a) this.receiver;
                qcy<Object>[] qcyVarArr = com.vk.im.ui.components.contacts.a.d0;
                aVar.g1((Throwable) obj);
                return s3q0.a;
            case 4:
                ((com.vk.metrics.eventtracking.b) this.receiver).a((Throwable) obj);
                return s3q0.a;
            case 5:
                DeliveryPointsMapFragment deliveryPointsMapFragment = (DeliveryPointsMapFragment) this.receiver;
                qcy<Object>[] qcyVarArr2 = DeliveryPointsMapFragment.T;
                deliveryPointsMapFragment.getClass();
                Intent intent = new Intent();
                Bundle bundle = new Bundle();
                bundle.putParcelable("delivery_point_id_key", (DeliveryPoint) obj);
                s3q0 s3q0Var = s3q0.a;
                deliveryPointsMapFragment.Mf(-1, intent.putExtra("delivery_point_extra", bundle));
                return s3q0.a;
            case 6:
                Throwable th = (Throwable) obj;
                afm afmVar = (afm) this.receiver;
                f9w f9wVar = afm.F;
                afmVar.getClass();
                afm.F.a(th);
                dfm dfmVar = afmVar.z;
                if (dfmVar != null) {
                    dfmVar.d(th);
                }
                return s3q0.a;
            case 7:
                ((com.vk.metrics.eventtracking.b) this.receiver).a((Throwable) obj);
                return s3q0.a;
            case 8:
                ((vkq) this.receiver).d.onNext((String) obj);
                return s3q0.a;
            case 9:
                ((com.vk.metrics.eventtracking.b) this.receiver).a((Throwable) obj);
                return s3q0.a;
            case 10:
                L.i((Throwable) obj);
                return s3q0.a;
            case 11:
                boolean booleanValue = ((Boolean) obj).booleanValue();
                rcx0 rcx0Var = (rcx0) this.receiver;
                com.vk.voip.ui.hint.a aVar2 = rcx0Var.a;
                if (!rcx0Var.c.isMeCreatorOrAdmin()) {
                    if (booleanValue) {
                        VoipHintView voipHintView = aVar2.a;
                        if (a.EnumC2056a.WatchTogetherFeatureAllowed.h() >= aVar2.a()) {
                            voipHintView.a(new VoipHintView.a(voipHintView.getResources().getString(R.string.voip_watch_together_allowed_for_me), null, null, null, false, 14));
                            voipHintView.setVisibility(0);
                            aVar2.i = a.EnumC2056a.WatchTogetherFeatureForbidden;
                            aVar2.j(io.reactivex.rxjava3.core.a.s(5000L, TimeUnit.MILLISECONDS, io.reactivex.rxjava3.android.schedulers.a.b()).subscribe(new oua(aVar2, 6)));
                        }
                    } else {
                        aVar2.i();
                    }
                }
                return s3q0.a;
            default:
                ((fgj0) this.receiver).getClass();
                return fgj0.a((ShortVideoGetResponseDto) obj);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l3f(Object obj, int i) {
        super(1, obj, p3f.class, "mapToCanShareToChat", "mapToCanShareToChat(Lcom/vk/api/generated/messages/dto/MessagesGetConversationByIdDto;)Z", 0);
        this.b = i;
        switch (i) {
            case 4:
                super(1, obj, com.vk.metrics.eventtracking.b.class, "logException", "logException(Ljava/lang/Throwable;)V", 0);
                break;
            case 5:
            case 8:
            case 11:
            default:
                break;
            case 6:
                super(1, obj, afm.class, "onUpdateAllByCacheError", "onUpdateAllByCacheError(Ljava/lang/Throwable;)V", 0);
                break;
            case 7:
                super(1, obj, com.vk.metrics.eventtracking.b.class, "logException", "logException(Ljava/lang/Throwable;)V", 0);
                break;
            case 9:
                super(1, obj, com.vk.metrics.eventtracking.b.class, "logException", "logException(Ljava/lang/Throwable;)V", 0);
                break;
            case 10:
                super(1, obj, L.class, Logger.METHOD_E, "e(Ljava/lang/Throwable;)V", 0);
                break;
            case 12:
                super(1, obj, fgj0.class, "map", "map(Lcom/vk/api/generated/shortVideo/dto/ShortVideoGetResponseDto;)Lcom/vk/dto/common/ClipVideoFile;", 0);
                break;
        }
    }
}

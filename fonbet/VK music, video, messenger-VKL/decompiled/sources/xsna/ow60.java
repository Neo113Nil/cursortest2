package xsna;

import android.content.Context;
import android.graphics.PointF;
import com.unity3d.services.UnityAdsConstants;
import com.vk.api.generated.auth.dto.AuthCheckValidationStatusResponseDto;
import com.vk.api.generated.groups.dto.GroupsGetResponseDto;
import com.vk.api.generated.video.dto.VideoGetAlbumsExtendedResponseDto;
import com.vk.api.generated.video.dto.VideoGetForPlayResponseDto;
import com.vk.api.generated.video.dto.VideoSkippablePartDto;
import com.vk.api.generated.video.dto.VideoVideoAlbumFullDto;
import com.vk.auth.modal.qrwithcode.QrWithCodeAuthErrorType;
import com.vk.auth.modal.qrwithcode.c;
import com.vk.core.view.components.picture.VkPicture;
import com.vk.core.view.components.tabs.Tab$Mode;
import com.vk.core.view.components.tabs.VkTabs;
import com.vk.dto.common.VideoSkippablePart;
import com.vk.dto.common.data.LikeInfo;
import com.vk.ecomm.product_list.presentation.q;
import com.vk.log.L;
import com.vk.video.profile.presentation.views.VideoNewProfileHeaderViewV2;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.time.DurationUnit;
import ru.ok.android.webrtc.simulcast.SimulcastConfig;
import ru.ok.android.webrtc.simulcast.SimulcastLayerInfo;
import xsna.dt70;
import xsna.e3m;
import xsna.f5h0;
import xsna.it80;
import xsna.tlo0;
import xsna.wfq0;
import xsna.zno;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class ow60 implements izs {
    public final /* synthetic */ int b;

    public /* synthetic */ ow60(int i) {
        this.b = i;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x018c, code lost:
    
        if (r13.equals("declined") == false) goto L88;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:?, code lost:
    
        return com.vk.auth.modal.qrwithcode.c.a.a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x01a1, code lost:
    
        if (r13.equals("validated") == false) goto L88;
     */
    @Override // xsna.izs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object invoke(Object obj) {
        ArrayList arrayList = null;
        switch (this.b) {
            case 0:
                Throwable th = (Throwable) obj;
                j03.l(th);
                com.vk.metrics.eventtracking.b.a.a(th);
                return s3q0.a;
            case 1:
                Boolean d = ((GroupsGetResponseDto) obj).d();
                return Boolean.valueOf(d != null ? d.booleanValue() : true);
            case 2:
                return ((dt70.a) obj).a;
            case 3:
                ojt ojtVar = (ojt) obj;
                ojtVar.l = f5h0.o.a;
                ojtVar.m = new PointF(0.5f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                return s3q0.a;
            case 4:
                Context context = (Context) obj;
                VkPicture vkPicture = new VkPicture(context, null, 6, 0);
                e3m.a aVar = e3m.a;
                vkPicture.setTopLeftBadge(new ycv0(m33.a(R.drawable.vk_icon_achievement_circle_fill_blue_28, context), true));
                return vkPicture;
            case 5:
                qgi0.r((tgi0) obj, "additional_info_title");
                return s3q0.a;
            case 6:
                tgi0 tgi0Var = (tgi0) obj;
                qgi0.r(tgi0Var, "playlist_menu_subtitle");
                rgi0.a(tgi0Var);
                return s3q0.a;
            case 7:
                aqd0 aqd0Var = (aqd0) obj;
                kc10 kc10Var = com.vk.ecomm.product_list.presentation.p.a;
                Exception exc = aqd0Var.f;
                tlo0.f fVar = aqd0Var.c;
                if (aqd0Var.d) {
                    return new q.c(new b8p0(fVar));
                }
                if (exc != null && h03.a(exc)) {
                    return new q.d(new b8p0(fVar), tq.h(tlo0.Companion, R.string.product_list_network_error_title), new tlo0.f(R.string.product_list_network_error_description), new tlo0.f(R.string.product_list_retry_button_title));
                }
                if (exc != null) {
                    return new q.b(new b8p0(fVar), tq.h(tlo0.Companion, R.string.product_list_other_error_description), new tlo0.f(R.string.product_list_retry_button_title));
                }
                List<vpd0> list = aqd0Var.e;
                ArrayList arrayList2 = new ArrayList(c5g.u(list, 10));
                for (vpd0 vpd0Var : list) {
                    mqd0 mqd0Var = new mqd0(vpd0Var);
                    kc10 kc10Var2 = com.vk.ecomm.product_list.presentation.p.a;
                    boolean z = vpd0Var.r;
                    wfq0.d dVar = wfq0.d.a;
                    kc10Var2.getClass();
                    arrayList2.add(new upd0(vpd0Var, kc10.a(mqd0Var, z, dVar)));
                }
                return new q.a(new b8p0(fVar), arrayList2);
            case 8:
                String lowerCase = ((AuthCheckValidationStatusResponseDto) obj).d().toLowerCase(Locale.ROOT);
                switch (lowerCase.hashCode()) {
                    case -1313911455:
                        if (lowerCase.equals("timeout")) {
                            return new c.b(QrWithCodeAuthErrorType.CodeExpired);
                        }
                        return new c.b(QrWithCodeAuthErrorType.Generic);
                    case -1109784050:
                        break;
                    case 3641717:
                        if (lowerCase.equals("wait")) {
                            return c.C0407c.a;
                        }
                        return new c.b(QrWithCodeAuthErrorType.Generic);
                    case 568196142:
                        break;
                    default:
                        return new c.b(QrWithCodeAuthErrorType.Generic);
                }
            case 9:
                qgi0.r((tgi0) obj, "community_rebooking_title");
                return s3q0.a;
            case 10:
                LikeInfo likeInfo = (LikeInfo) obj;
                StringBuilder sb = new StringBuilder();
                sb.append(likeInfo != null ? likeInfo.c.getString("firstNameDat") : null);
                sb.append(' ');
                sb.append(likeInfo != null ? likeInfo.c.getString("lastNameDat") : null);
                return sb.toString();
            case 11:
                qgi0.r((tgi0) obj, "search_database_item_title");
                return s3q0.a;
            case 12:
                qgi0.r((tgi0) obj, "TEST_TAG_IMAGE");
                return s3q0.a;
            case 13:
                qgi0.r((tgi0) obj, "upload_cell_right_switch");
                return s3q0.a;
            case 14:
                return SimulcastConfig.b((SimulcastLayerInfo) obj);
            case 15:
                it80.b.getClass();
                return it80.a.a();
            case 16:
                List list2 = (List) obj;
                return list2.isEmpty() ? io.reactivex.rxjava3.core.x.i(new RuntimeException("Empty list of music has been received in audioService.audioGetById")) : io.reactivex.rxjava3.core.x.k(j5g.Y(list2));
            case 17:
                VkTabs vkTabs = new VkTabs((Context) obj, null, 0, 14, 0);
                vkTabs.setMode(Tab$Mode.Secondary);
                return vkTabs;
            case 18:
                List<VideoVideoAlbumFullDto> d2 = ((VideoGetAlbumsExtendedResponseDto) obj).d();
                ArrayList arrayList3 = new ArrayList(c5g.u(d2, 10));
                Iterator<T> it = d2.iterator();
                while (it.hasNext()) {
                    arrayList3.add(b1s0.a((VideoVideoAlbumFullDto) it.next()));
                }
                return arrayList3;
            case 19:
                VideoGetForPlayResponseDto videoGetForPlayResponseDto = (VideoGetForPlayResponseDto) obj;
                List<VideoSkippablePartDto> d3 = videoGetForPlayResponseDto.d();
                if (d3 != null) {
                    List<VideoSkippablePartDto> list3 = d3;
                    ArrayList arrayList4 = new ArrayList(c5g.u(list3, 10));
                    for (VideoSkippablePartDto videoSkippablePartDto : list3) {
                        VideoSkippablePartDto.TypeDto f = videoSkippablePartDto.f();
                        int i = f == null ? -1 : dht0.$EnumSwitchMapping$0[f.ordinal()];
                        VideoSkippablePart.SkippableType skippableType = i != 1 ? i != 2 ? VideoSkippablePart.SkippableType.UNKNOWN : VideoSkippablePart.SkippableType.ENDING : VideoSkippablePart.SkippableType.OPENING;
                        zno.a aVar2 = zno.c;
                        int e = videoSkippablePartDto.e();
                        DurationUnit durationUnit = DurationUnit.SECONDS;
                        long e2 = zno.e(eoo.e(e, durationUnit));
                        Integer d4 = videoSkippablePartDto.d();
                        arrayList4.add(new VideoSkippablePart.Part(skippableType, e2, d4 != null ? Long.valueOf(zno.e(eoo.e(d4.intValue(), durationUnit))) : null));
                    }
                    arrayList = arrayList4;
                }
                Boolean e3 = videoGetForPlayResponseDto.e();
                return new VideoSkippablePart(e3 != null ? e3.booleanValue() : false, arrayList);
            case 20:
                int i2 = VideoNewProfileHeaderViewV2.y;
                ((etv0) obj).b(false);
                return s3q0.a;
            case 21:
                L.j((Throwable) obj, "Catalog");
                return s3q0.a;
            default:
                return Boolean.valueOf(((it80) obj).a != 0);
        }
    }
}

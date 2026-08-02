package xsna;

import android.content.Context;
import android.graphics.Bitmap;
import com.vk.api.generated.video.dto.VideoGetAdsDataResponseDto;
import com.vk.api.generated.video.dto.VideoVideoAdsDataOverlayDto;
import com.vk.imageloader.view.VkImageViewTopCrop;
import com.vk.log.L;
import com.vk.mediastore.system.MediaStoreEntry;
import com.vk.search.integration.api.SearchDelegate;
import com.vk.search.params.api.VkPeopleSearchParams;
import com.vk.search.ui.api.SearchQuery;
import com.vk.voip.ui.scheduled.creation.feature.models.VoipScheduleCallTimeZone;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.FunctionReferenceImpl;
import ru.ok.android.utils.Logger;
import xsna.b26;
import xsna.uxp;
import xsna.xn50;

/* compiled from: ClipsGeoPickerBottomSheet.kt */
/* loaded from: classes16.dex */
public final /* synthetic */ class u9e extends FunctionReferenceImpl implements izs {
    public final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u9e(int i, Object obj, Class cls, String str, String str2, int i2, int i3) {
        super(i, obj, cls, str, str2, i2);
        this.b = i3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v6, types: [kotlin.jvm.internal.FunctionReferenceImpl, xsna.gzs] */
    @Override // xsna.izs
    public final Object invoke(Object obj) {
        b26.f fVar;
        srh0 srh0Var;
        ArrayList arrayList = null;
        Object obj2 = null;
        switch (this.b) {
            case 0:
                com.vk.clips.attachments.impl.publish.geolocation.presentation.b bVar = (com.vk.clips.attachments.impl.publish.geolocation.presentation.b) this.receiver;
                bVar.getClass();
                xn50.a.c(bVar, (com.vk.clips.attachments.impl.publish.geolocation.presentation.a) obj);
                break;
            case 1:
                ((com.vk.profile.community.impl.ui.profile.a) this.receiver).Y((com.vk.profile.community.impl.ui.profile.actions.d) obj);
                break;
            case 2:
                Throwable th = (Throwable) obj;
                pim pimVar = (pim) this.receiver;
                f9w f9wVar = pim.q;
                pimVar.getClass();
                pim.q.a(th);
                btk0 btk0Var = pimVar.l;
                Object[] objArr = btk0Var.f || btk0Var.g;
                if (btk0Var.g) {
                    btk0Var.g = false;
                    tim timVar = pimVar.m;
                    if (timVar != null) {
                        timVar.a();
                    }
                }
                s3q0 s3q0Var = s3q0.a;
                btk0 btk0Var2 = pimVar.l;
                Object[] objArr2 = btk0Var2.f || btk0Var2.g;
                if (objArr != objArr2 && (fVar = pimVar.o) != null) {
                    b26 b26Var = b26.this;
                    if (objArr2 == true) {
                        b26.n(b26Var, b26.a.PINNED, false);
                    } else {
                        b26Var.g(b26.a.PINNED, true, 0L);
                    }
                }
                if (pimVar.m != null) {
                    zk70.e(th);
                }
                break;
            case 3:
                ((e6n) this.receiver).getClass();
                ur60 ur60Var = ((t4n) obj).b;
                break;
            case 4:
                ((io.reactivex.rxjava3.core.r) this.receiver).onNext((MediaStoreEntry) obj);
                break;
            case 5:
                boolean booleanValue = ((Boolean) obj).booleanValue();
                n620 n620Var = (n620) this.receiver;
                f0i0 f0i0Var = n620Var.f;
                SearchDelegate.SearchState searchState = f0i0Var.f;
                f0i0Var.d = booleanValue;
                SearchDelegate.SearchState a = f0i0Var.a();
                f0i0Var.f = a;
                if (searchState != a) {
                    f0i0Var.a.invoke();
                }
                if (!booleanValue && (srh0Var = n620Var.k) != null) {
                    srh0Var.g(new SearchQuery("", null, null, null, 14, null));
                }
                r620 g = n620Var.g();
                if (g != null && !booleanValue) {
                    VkPeopleSearchParams copy = g.i.c.copy();
                    copy.reset();
                    ((yh90) g.f.getValue()).h(copy);
                }
                break;
            case 6:
                ((a290) this.receiver).getClass();
                List<VideoVideoAdsDataOverlayDto> d = ((VideoGetAdsDataResponseDto) obj).d();
                if (d != null) {
                    List<VideoVideoAdsDataOverlayDto> list = d;
                    arrayList = new ArrayList(c5g.u(list, 10));
                    for (VideoVideoAdsDataOverlayDto videoVideoAdsDataOverlayDto : list) {
                        Integer f = videoVideoAdsDataOverlayDto.f();
                        int intValue = f != null ? f.intValue() : 0;
                        long intValue2 = videoVideoAdsDataOverlayDto.e() != null ? r7.intValue() * 1000 : 0L;
                        Integer d2 = videoVideoAdsDataOverlayDto.d();
                        arrayList.add(new m290(intValue, intValue2, d2 != null ? d2.intValue() : 0));
                    }
                    break;
                }
                break;
            case 7:
                mkm0 mkm0Var = ((x4m0) this.receiver).c;
                Context context = mkm0Var.getContext();
                cmf0.d(context, mkm0Var.getWindow(), j03.g(context, (Throwable) obj, R.string.error), false, iah0.a(88), true);
                break;
            case 8:
                ((VkImageViewTopCrop) this.receiver).setImageBitmap((Bitmap) obj);
                break;
            case 9:
                L.i((Throwable) obj);
                break;
            default:
                String str = (String) obj;
                qyo0 qyo0Var = (qyo0) this.receiver;
                io.reactivex.rxjava3.subjects.f<uxp> fVar2 = qyo0Var.c;
                if (!str.equals(qyo0Var.a.b)) {
                    Iterator<T> it = qyo0Var.b.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            Object next = it.next();
                            if (((VoipScheduleCallTimeZone) next).b.equals(str)) {
                                obj2 = next;
                            }
                        }
                    }
                    VoipScheduleCallTimeZone voipScheduleCallTimeZone = (VoipScheduleCallTimeZone) obj2;
                    if (voipScheduleCallTimeZone != null) {
                        fVar2.onNext(new uxp.b(voipScheduleCallTimeZone));
                        fVar2.onNext(uxp.a.a);
                    }
                }
                break;
        }
        return s3q0.a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u9e(Object obj, int i) {
        super(1, obj, pim.class, "onPinnedMsgDetachProgressError", "onPinnedMsgDetachProgressError(Ljava/lang/Throwable;)V", 0);
        this.b = i;
        switch (i) {
            case 3:
                super(1, obj, e6n.class, "map", "map(Lcom/vk/newsfeed/impl/presentation/discover_media/presentation/feature/DiscoverMediaState;)Lcom/vk/newsfeed/impl/presentation/discover_media/presentation/model/DiscoverMediaViewState;", 0);
                break;
            case 4:
            case 5:
            case 8:
            default:
                break;
            case 6:
                super(1, obj, a290.class, "parseOverlayData", "parseOverlayData(Lcom/vk/api/generated/video/dto/VideoGetAdsDataResponseDto;)Ljava/util/List;", 0);
                break;
            case 7:
                super(1, obj, x4m0.class, "failedAddStoryToHighlights", "failedAddStoryToHighlights(Ljava/lang/Throwable;)V", 0);
                break;
            case 9:
                super(1, obj, L.class, Logger.METHOD_E, "e(Ljava/lang/Throwable;)V", 0);
                break;
        }
    }
}

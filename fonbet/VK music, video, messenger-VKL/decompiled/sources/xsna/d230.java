package xsna;

import android.view.ViewGroup;
import com.vk.api.generated.apps.dto.AppsAppDto;
import com.vk.api.generated.utils.dto.UtilsDomainResolvedWithDataDto;
import com.vk.api.generated.video.dto.VideoGetAssistantVideosFromAlbumResponseDto;
import com.vk.api.generated.video.dto.VideoVideoForAlbumDto;
import com.vk.api.generated.video.dto.VideoVideoFullDto;
import com.vk.catalog2.common.dto.api.CatalogDataType;
import com.vk.catalog2.common.dto.api.CatalogViewType;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.ui.UIBlockList;
import com.vk.catalog2.common.ui.mvp.holder.clip.VideoCatalogSearchRootVh;
import com.vk.core.serialize.Serializer;
import com.vk.dto.common.StatPixel;
import com.vk.dto.common.VideoFileOld;
import com.vk.dto.music.MusicTrack;
import com.vk.dto.newsfeed.Counters;
import com.vk.libvideo.upload.api.VideoUploadEvent;
import com.vk.messagetemplates.impl.details.TemplateDetailsState;
import com.vk.voip.ui.VoipStatManager;
import com.vk.voip.ui.VoipViewModelState;
import com.vkontakte.android.data.b;
import java.net.SocketTimeoutException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;
import xsna.gbc0;
import xsna.tj50;
import xsna.z0o0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class d230 implements izs {
    public final /* synthetic */ int b;

    public /* synthetic */ d230(int i) {
        this.b = i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:161:0x0260, code lost:
    
        if (r1 != null) goto L155;
     */
    @Override // xsna.izs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj) {
        String message;
        Integer num = null;
        r1 = null;
        ydp ydpVar = null;
        boolean z = true;
        switch (this.b) {
            case 0:
                x130 x130Var = (x130) obj;
                if (x130Var.f == 1) {
                    Counters counters = x130Var.c;
                    if (counters != null) {
                        num = Integer.valueOf(counters.c);
                        break;
                    }
                }
                z = false;
                return Boolean.valueOf(z);
            case 1:
                return ((e430) obj).b;
            case 2:
                return ((MusicTrack) obj).Jb();
            case 3:
                ArrayList<UIBlock> Sb = ((UIBlockList) obj).Sb();
                if (Sb == null || !Sb.isEmpty()) {
                    Iterator<T> it = Sb.iterator();
                    while (it.hasNext()) {
                        if (((UIBlock) it.next()).Cb().i()) {
                            return Boolean.valueOf(z);
                        }
                    }
                }
                z = false;
                return Boolean.valueOf(z);
            case 4:
                return ((JSONObject) obj).getJSONObject("response");
            case 5:
                qgi0.r((tgi0) obj, "error_title");
                return s3q0.a;
            case 6:
                int i = ((u1c0) obj).c;
                if (i != 93 && i != 248 && i != 314) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 7:
                Throwable th = (Throwable) obj;
                if (th.getCause() instanceof SocketTimeoutException) {
                    new b.d("poster_fallback_timeout").e();
                } else {
                    Throwable cause = th.getCause();
                    if ((cause == null || (message = cause.getMessage()) == null) && (message = th.getMessage()) == null) {
                        message = "";
                    }
                    b.d dVar = new b.d("poster_fallback_fail");
                    dVar.b(message, "message");
                    dVar.e();
                }
                return new gbc0.a(0, 0, "");
            case 8:
                ArrayList<UIBlock> arrayList = ((UIBlockList) obj).y;
                if (arrayList == null || !arrayList.isEmpty()) {
                    for (UIBlock uIBlock : arrayList) {
                        if (uIBlock.e == CatalogDataType.DATA_TYPE_SEARCH_AUTHORS && e43.l(CatalogViewType.LIST_WITH_NOTIFICATION_STATE, CatalogViewType.LIST).contains(uIBlock.d)) {
                            return Boolean.valueOf(z);
                        }
                    }
                }
                z = false;
                return Boolean.valueOf(z);
            case 9:
                AppsAppDto d = ((UtilsDomainResolvedWithDataDto) obj).d();
                if (d == null) {
                    return null;
                }
                new re3();
                return re3.b(d);
            case 10:
                qof0 qof0Var = (qof0) obj;
                return new hof0(qof0Var.a(), qof0Var.a);
            case 11:
                List list = (List) obj;
                Object obj2 = list.get(0);
                boolean booleanValue = (obj2 != null ? (Boolean) obj2 : null).booleanValue();
                Object obj3 = list.get(1);
                boolean f = epx.f(obj3, Boolean.FALSE);
                fh9 fh9Var = k2h0.b;
                if (!f && obj3 != null) {
                    ydpVar = (ydp) ((izs) fh9Var.c).invoke(obj3);
                }
                return new yta0(ydpVar.a, booleanValue);
            case 12:
                return Boolean.valueOf(((y280) obj).a.z.contains("local_block_id"));
            case 13:
                return y7i0.a((x7i0) obj);
            case 14:
                return new r4l0((ViewGroup) obj);
            case 15:
                return Long.valueOf(((sh00) obj).a.b);
            case 16:
                return s3q0.a;
            case 17:
                return new z0o0.b(((tj50.a) obj).a(i1o0.b, ao8.d));
            case 18:
                return TemplateDetailsState.a((TemplateDetailsState) obj, null, null, false, 7);
            case 19:
                return s3q0.a;
            case 20:
                VideoGetAssistantVideosFromAlbumResponseDto videoGetAssistantVideosFromAlbumResponseDto = (VideoGetAssistantVideosFromAlbumResponseDto) obj;
                ums0 ums0Var = ums0.a;
                List<VideoVideoForAlbumDto> e = videoGetAssistantVideosFromAlbumResponseDto.e();
                ArrayList arrayList2 = new ArrayList();
                Iterator<T> it2 = e.iterator();
                while (it2.hasNext()) {
                    VideoVideoFullDto d2 = ((VideoVideoForAlbumDto) it2.next()).d();
                    if (d2 != null) {
                        arrayList2.add(d2);
                    }
                }
                return ums0.e(ums0Var, arrayList2, videoGetAssistantVideosFromAlbumResponseDto.f(), videoGetAssistantVideosFromAlbumResponseDto.d(), false, 52);
            case 21:
                UIBlock uIBlock2 = (UIBlock) obj;
                if (uIBlock2 == null || !(uIBlock2 instanceof UIBlockList)) {
                    return null;
                }
                UIBlock uIBlock3 = (UIBlock) j5g.a0(((UIBlockList) uIBlock2).y);
                if ((uIBlock3 != null ? uIBlock3.e : null) == CatalogDataType.DATA_SYNTHETIC_SECTION && uIBlock3.d == CatalogViewType.SLIDER) {
                    return Integer.valueOf(VideoCatalogSearchRootVh.S);
                }
                return null;
            case 22:
                VideoFileOld.a aVar = VideoFileOld.z1;
                return StatPixel.a.b.a(((Serializer) obj).H());
            case 23:
                ((etv0) obj).b(false);
                return s3q0.a;
            case 24:
                return ((VideoUploadEvent) obj).b.Fb();
            case 25:
                return ((pno0) obj).d().toString();
            default:
                if (VoipStatManager.c) {
                    com.vk.voip.ui.c cVar = com.vk.voip.ui.c.b;
                    cVar.getClass();
                    if ((com.vk.voip.ui.c.H0.a && com.vk.voip.ui.c.K0 == VoipViewModelState.InCall) || cVar.x0() || com.vk.voip.ui.c.z0() || com.vk.voip.ui.c.i0().g()) {
                        VoipStatManager.a.e = true;
                    }
                }
                return s3q0.a;
        }
    }

    public /* synthetic */ d230(com.vk.newsfeed.impl.posting.a aVar) {
        this.b = 7;
    }
}

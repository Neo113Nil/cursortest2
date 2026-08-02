package xsna;

import android.content.Context;
import android.util.Size;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.vk.api.comments.CommentsOrder;
import com.vk.api.generated.video.dto.VideoCommentOrderDto;
import com.vk.api.generated.video.dto.VideoCommentOrdersDto;
import com.vk.api.generated.video.dto.VideoCommentSortingDto;
import com.vk.api.generated.video.dto.VideoGetCommentsExtendedResponseDto;
import com.vk.api.generated.video.dto.VideoGetCommentsExtendedSortDto;
import com.vk.api.generated.wall.dto.WallWallCommentDto;
import com.vk.dto.common.data.PrivacySetting;
import com.vk.dto.common.data.VKList;
import com.vk.dto.common.id.UserId;
import com.vk.im.engine.models.attaches.AttachVideo;
import com.vk.im.ui.components.attaches_history.attaches.model.simple.SimpleAttachListItem;
import com.vk.im.ui.components.attaches_history.attaches.model.simple.SimpleAttachesState;
import com.vk.im.ui.components.attaches_history.attaches.pagination.PageLoadingState;
import com.vk.newsfeed.api.data.VideoStatistic;
import com.vk.video.profile.presentation.views.VideoNewProfileHeaderViewV2;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import xsna.gyw0;
import xsna.ikv0;
import xsna.iyw0;
import xsna.jto0;
import xsna.pyn;
import xsna.tlo0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class ito0 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ ito0(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x00a8, code lost:
    
        if (r5 != null) goto L26;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v9, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v0, types: [android.util.Size, xsna.ikv0$d$a, xsna.ikv0$d$b] */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r4v12, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r9v14, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r9v8, types: [java.lang.Iterable, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r9v9 */
    @Override // xsna.izs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj) {
        String i;
        Object obj2;
        VideoCommentSortingDto d;
        int i2 = this.b;
        ?? r2 = 0;
        r2 = 0;
        Object obj3 = this.d;
        Object obj4 = this.c;
        switch (i2) {
            case 0:
                ((i0b0) obj4).invoke(jto0.b.a((jto0.b) obj3, (jto0.a) obj, null, null, null, false, null, false, false, false, false, null, false, false, false, null, false, 65534));
                break;
            case 1:
                PrivacySetting privacySetting = (PrivacySetting) obj4;
                rkq0 rkq0Var = (rkq0) obj3;
                PrivacySetting privacySetting2 = (PrivacySetting) obj;
                PrivacySetting privacySetting3 = new PrivacySetting();
                privacySetting3.b = privacySetting2.b;
                privacySetting3.e = privacySetting2.e;
                privacySetting3.c = privacySetting.c;
                privacySetting3.d = privacySetting.d;
                privacySetting3.f = privacySetting.f;
                ((foz) rkq0Var.j.getValue()).a(privacySetting3);
                izs<? super rfd0, s3q0> izsVar = rkq0Var.h;
                if (izsVar != null) {
                    izsVar.invoke(new rfd0(privacySetting3, 2));
                }
                break;
            case 2:
                j2s0 j2s0Var = (j2s0) obj4;
                Context context = j2s0Var.t;
                AttachVideo attachVideo = (AttachVideo) obj3;
                int i3 = 6;
                if (((Boolean) obj).booleanValue()) {
                    l2s0 l2s0Var = j2s0Var.u;
                    SimpleAttachesState simpleAttachesState = (SimpleAttachesState) l2s0Var.b.P0();
                    io.reactivex.rxjava3.subjects.d<PageLoadingState<SimpleAttachListItem>> dVar = l2s0Var.b;
                    List<SimpleAttachListItem> list = simpleAttachesState.f;
                    ArrayList arrayList = new ArrayList();
                    for (Object obj5 : list) {
                        if (!epx.f(((SimpleAttachListItem) obj5).b.d, attachVideo)) {
                            arrayList.add(obj5);
                        }
                    }
                    dVar.onNext(SimpleAttachesState.Fb(simpleAttachesState, arrayList));
                    tlo0.h d2 = oq.d(tlo0.Companion, context.getString(R.string.vkim_video_delete_success, attachVideo.getTitle()));
                    ikv0.a aVar = new ikv0.a(context);
                    aVar.t = new ikv0.c.C3058c(R.drawable.vk_icon_check_circle_outline_28, Integer.valueOf(R.attr.vk_ui_icon_positive), (Size) r2, 12);
                    aVar.u = new ikv0.d(new ikv0.d.c(tlo0.b.a(d2, context).toString()), (ikv0.d.b) r2, (ikv0.d.a) r2, i3);
                    aVar.n();
                } else {
                    tlo0.h d3 = oq.d(tlo0.Companion, context.getString(R.string.vkim_video_delete_failure, attachVideo.getTitle()));
                    ikv0.a aVar2 = new ikv0.a(context);
                    float f = 28;
                    aVar2.t = new ikv0.c.C3058c(R.drawable.vk_icon_error_triangle_outline_56, Integer.valueOf(R.attr.vk_ui_icon_negative), new Size(iah0.a(f), iah0.a(f)), 8);
                    aVar2.u = new ikv0.d(new ikv0.d.c(tlo0.b.a(d3, context).toString()), (ikv0.d.b) r2, (ikv0.d.a) r2, i3);
                    aVar2.n();
                }
                break;
            case 3:
                owt owtVar = (owt) obj3;
                VideoGetCommentsExtendedResponseDto videoGetCommentsExtendedResponseDto = (VideoGetCommentsExtendedResponseDto) obj;
                lns0 lns0Var = (lns0) ((ics0) obj4).b.getValue();
                UserId userId = owtVar.b;
                boolean z = owtVar.f;
                VideoStatistic videoStatistic = owtVar.k;
                boolean z2 = lns0Var.c;
                List<WallWallCommentDto> f2 = videoGetCommentsExtendedResponseDto.f();
                ?? arrayList2 = new ArrayList(c5g.u(f2, 10));
                Iterator it = f2.iterator();
                while (it.hasNext()) {
                    arrayList2.add(lns0Var.a((WallWallCommentDto) it.next(), userId, videoGetCommentsExtendedResponseDto));
                }
                if (z) {
                    arrayList2 = j5g.y0(arrayList2);
                }
                VideoCommentOrdersDto i4 = videoGetCommentsExtendedResponseDto.i();
                if (i4 != null && (d = i4.d()) != null && (i = d.i()) != null) {
                    if (!z2) {
                        i = null;
                        break;
                    }
                }
                i = VideoGetCommentsExtendedSortDto.NEWEST_COMMENT_FIRST.i();
                VKList vKList = new VKList((Collection) arrayList2);
                if (videoGetCommentsExtendedResponseDto.getCount() > 0) {
                    vKList.o(videoGetCommentsExtendedResponseDto.getCount());
                }
                int count = videoGetCommentsExtendedResponseDto.getCount();
                Integer l = videoGetCommentsExtendedResponseDto.l();
                int intValue = l != null ? l.intValue() : 0;
                List<CommentsOrder.Item> list2 = lns0Var.e;
                VideoCommentOrdersDto i5 = videoGetCommentsExtendedResponseDto.i();
                if (i5 != null) {
                    if (!z2) {
                        i5 = null;
                    }
                    if (i5 != null) {
                        List<VideoCommentOrderDto> e = i5.e();
                        ArrayList arrayList3 = new ArrayList();
                        for (VideoCommentOrderDto videoCommentOrderDto : e) {
                            Iterator it2 = list2.iterator();
                            while (true) {
                                if (it2.hasNext()) {
                                    obj2 = it2.next();
                                    if (epx.f(((CommentsOrder.Item) obj2).b, videoCommentOrderDto.d().i())) {
                                    }
                                } else {
                                    obj2 = null;
                                }
                            }
                            CommentsOrder.Item item = (CommentsOrder.Item) obj2;
                            if (item != null) {
                                arrayList3.add(item);
                            }
                        }
                        r2 = arrayList3;
                    }
                }
                if (r2 != 0) {
                    list2 = r2;
                }
                break;
            case 4:
                int i6 = VideoNewProfileHeaderViewV2.y;
                ((b8e0) obj4).invoke(((pyn.b) ((pyn) obj3)).c);
                break;
            default:
                cyw0 cyw0Var = (cyw0) obj4;
                iyw0.a aVar3 = (iyw0.a) obj;
                boolean z3 = !aVar3.c;
                cyw0Var.T(new gyw0.b(z3));
                cyw0.V(cyw0Var, null, Boolean.valueOf(z3), null, null, null, null, null, null, null, aVar3, IronSourceError.ERROR_CODE_NO_ADS_TO_SHOW);
                break;
        }
        return s3q0.a;
    }
}

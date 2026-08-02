package xsna;

import android.text.Layout;
import com.vk.dto.common.ImageSize;
import com.vk.log.L;
import com.vk.newsfeed.posting.impl.domain.model.LocalMediaEntry;
import com.vk.newsfeed.posting.impl.domain.model.MediaPickerEntry;
import com.vk.newsfeed.posting.impl.domain.model.MediaPickerSelectedItem;
import com.vk.newsfeed.posting.impl.domain.model.MediaPickerState;
import com.vk.newsfeed.posting.impl.domain.model.PostingState;
import com.vk.newsfeed.posting.impl.domain.model.VkMediaEntry$VkPhoto;
import com.vk.newsfeed.posting.impl.domain.model.VkMediaEntry$VkVideo;
import com.vk.stories.design.view.stats.tabs.viewers.mvi.StoryStatisticsViewersFragment;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.FunctionReferenceImpl;
import ru.ok.android.utils.Logger;
import xsna.bfc;
import xsna.lbv;
import xsna.tav;
import xsna.xn50;
import xsna.zai0;
import xsna.zhg;

/* compiled from: BroadcastFinishView.kt */
/* loaded from: classes7.dex */
public final /* synthetic */ class kf8 extends FunctionReferenceImpl implements izs {
    public final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ kf8(int i, Object obj, Class cls, String str, String str2, int i2, int i3) {
        super(i, obj, cls, str, str2, i2);
        this.b = i3;
    }

    /* JADX WARN: Type inference failed for: r0v26, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.izs
    public final Object invoke(Object obj) {
        List list;
        zai0 zai0Var;
        switch (this.b) {
            case 0:
                bwt0.p0(((wf8) this.receiver).q, ((Boolean) obj).booleanValue());
                return s3q0.a;
            case 1:
                L.i((Throwable) obj);
                return s3q0.a;
            case 2:
                bfc bfcVar = (bfc) obj;
                rec recVar = (rec) this.receiver;
                int i = rec.j1;
                recVar.getClass();
                if (!(bfcVar instanceof bfc.a)) {
                    throw new NoWhenBranchMatchedException();
                }
                bfc.a aVar = (bfc.a) bfcVar;
                String string = recVar.requireArguments().getString("request_key");
                if (string == null) {
                    throw new IllegalArgumentException("Request key (request_key) must be specified");
                }
                recVar.getParentFragmentManager().k0(yfb.b(new Pair("city_result", aVar.a)), string);
                recVar.g0 = null;
                recVar.dismiss();
                return s3q0.a;
            case 3:
                tte tteVar = (tte) this.receiver;
                tteVar.getClass();
                xn50.a.c(tteVar, (jte) obj);
                return s3q0.a;
            case 4:
                ((com.vk.profile.community.impl.ui.profile.a) this.receiver).Y((com.vk.profile.community.impl.ui.profile.actions.d) obj);
                return s3q0.a;
            case 5:
                c8p c8pVar = (c8p) this.receiver;
                c8pVar.getClass();
                xn50.a.c(c8pVar, (com.vk.search.params.impl.presentation.modal.education.mvi.model.a) obj);
                return s3q0.a;
            case 6:
                lbv lbvVar = (lbv) obj;
                ((fvt0) this.receiver).getClass();
                if (lbvVar.equals(lbv.d.a)) {
                    return tav.d.a;
                }
                if (lbvVar.equals(lbv.c.a)) {
                    return tav.c.a;
                }
                if (lbvVar.equals(lbv.e.a)) {
                    return tav.e.a;
                }
                if (lbvVar.equals(lbv.b.a)) {
                    return tav.b.a;
                }
                if (lbvVar.equals(lbv.a.a)) {
                    return tav.a.a;
                }
                throw new NoWhenBranchMatchedException();
            case 7:
                PostingState postingState = (PostingState) obj;
                vpc0 vpc0Var = (vpc0) this.receiver;
                vpc0Var.getClass();
                ?? r0 = vpc0Var.c;
                if (postingState instanceof PostingState.Editing) {
                    MediaPickerState mediaPickerState = ((PostingState.Editing) postingState).f;
                    if (mediaPickerState.e.isEmpty()) {
                        list = EmptyList.b;
                    } else {
                        ArrayList a = com.vk.newsfeed.posting.impl.domain.model.b.a(mediaPickerState);
                        ArrayList arrayList = new ArrayList(c5g.u(a, 10));
                        Iterator it = a.iterator();
                        while (it.hasNext()) {
                            MediaPickerEntry mediaPickerEntry = (MediaPickerEntry) it.next();
                            if (mediaPickerEntry instanceof LocalMediaEntry) {
                                LocalMediaEntry localMediaEntry = (LocalMediaEntry) mediaPickerEntry;
                                zai0Var = new zai0(new MediaPickerSelectedItem.LocalMedia(localMediaEntry), new zai0.a.C4170a(localMediaEntry.ba().f()));
                            } else if (mediaPickerEntry instanceof VkMediaEntry$VkPhoto) {
                                VkMediaEntry$VkPhoto vkMediaEntry$VkPhoto = (VkMediaEntry$VkPhoto) mediaPickerEntry;
                                MediaPickerSelectedItem.VkPhoto vkPhoto = new MediaPickerSelectedItem.VkPhoto(vkMediaEntry$VkPhoto);
                                ImageSize Cb = vkMediaEntry$VkPhoto.b.y.Cb(((Number) r0.getValue()).intValue(), true, false);
                                zai0Var = new zai0(vkPhoto, new zai0.a.b(Cb != null ? Cb.d.d : null));
                            } else {
                                if (!(mediaPickerEntry instanceof VkMediaEntry$VkVideo)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                VkMediaEntry$VkVideo vkMediaEntry$VkVideo = (VkMediaEntry$VkVideo) mediaPickerEntry;
                                MediaPickerSelectedItem.VkVideo vkVideo = new MediaPickerSelectedItem.VkVideo(vkMediaEntry$VkVideo);
                                ImageSize Cb2 = vkMediaEntry$VkVideo.b.getImage().Cb(((Number) r0.getValue()).intValue(), true, false);
                                zai0Var = new zai0(vkVideo, new zai0.a.b(Cb2 != null ? Cb2.d.d : null));
                            }
                            arrayList.add(zai0Var);
                        }
                        list = arrayList;
                    }
                } else {
                    list = EmptyList.b;
                }
                return new wow(list);
            case 8:
                ((g6h0) this.receiver).c.b(new zhg.a((Throwable) obj));
                return s3q0.a;
            case 9:
                StoryStatisticsViewersFragment storyStatisticsViewersFragment = (StoryStatisticsViewersFragment) this.receiver;
                storyStatisticsViewersFragment.getClass();
                xn50.a.c(storyStatisticsViewersFragment, (com.vk.stories.design.view.stats.tabs.viewers.mvi.a) obj);
                return s3q0.a;
            case 10:
                cmo0 cmo0Var = (cmo0) this.receiver;
                Layout.Alignment[] alignmentArr = cmo0.y;
                cmo0Var.e((t5s) obj);
                return s3q0.a;
            case 11:
                zfp0 zfp0Var = (zfp0) this.receiver;
                zfp0Var.getClass();
                xn50.a.c(zfp0Var, (tfp0) obj);
                return s3q0.a;
            default:
                ((f4z) this.receiver).b((sww0) obj);
                return s3q0.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kf8(Object obj, int i) {
        super(1, obj, L.class, Logger.METHOD_E, "e(Ljava/lang/Throwable;)V", 0);
        this.b = i;
        switch (i) {
            case 6:
                super(1, obj, fvt0.class, "transform", "transform(Lcom/vk/voip/ui/holiday_interaction/view/HolidayInteractionViewEvent;)Lcom/vk/voip/ui/holiday_interaction/feature/HolidayInteractionFeatureAction;", 0);
                break;
            case 7:
                super(1, obj, vpc0.class, "mapSelectedMedia", "mapSelectedMedia-m4snZxA(Lcom/vk/newsfeed/posting/impl/domain/model/PostingState;)Ljava/util/List;", 0);
                break;
            case 8:
                super(1, obj, g6h0.class, "showError", "showError(Ljava/lang/Throwable;)V", 0);
                break;
            case 9:
            case 10:
            case 11:
            default:
                break;
            case 12:
                super(1, obj, f4z.class, "notify", "notify(Ljava/lang/Object;)V", 0);
                break;
        }
    }
}

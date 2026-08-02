package xsna;

import android.util.Log;
import com.vk.api.generated.audio.dto.AudioLyricsDataDto;
import com.vk.api.generated.audio.dto.AudioLyricsDto;
import com.vk.api.generated.audio.dto.AudioLyricsTimelinesDto;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.api.ui.action.UIBlockAction;
import com.vk.catalog2.common.ui.holders.video.VideoProfileHorizontallScrollItemWithHighlightVh;
import com.vk.core.serialize.Serializer;
import com.vk.dto.common.Peer;
import com.vk.dto.common.Source;
import com.vk.dto.stories.model.StoriesContainer;
import com.vk.log.L;
import com.vk.newsfeed.posting.impl.domain.model.PostingState;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.text.Regex;
import ru.ok.android.api.methods.batch.execute.BatchApiRequest;
import ru.ok.android.utils.Logger;
import xsna.ob00;
import xsna.xn50;

/* compiled from: AsrRecordStartView.kt */
/* loaded from: classes7.dex */
public final /* synthetic */ class lw3 extends FunctionReferenceImpl implements izs {
    public final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ lw3(int i, Object obj, Class cls, String str, String str2, int i2, int i3) {
        super(i, obj, cls, str, str2, i2);
        this.b = i3;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        ArrayList arrayList;
        Object obj2;
        int d;
        List<String> d2;
        switch (this.b) {
            case 0:
                enj.q(R.string.voip_asr_start_error, 0, ((ow3) this.receiver).a);
                return s3q0.a;
            case 1:
                ((m99) this.receiver).getClass();
                return Boolean.valueOf(m99.m(obj));
            case 2:
                h6n0 h6n0Var = (h6n0) obj;
                shm shmVar = (shm) this.receiver;
                atk0 a = atk0.a(shmVar.k, null, new h6n0(m420.a(h6n0Var.a, false, 0, 11), h6n0Var.b), 3);
                shmVar.k = a;
                shmVar.n.onNext(a.c);
                g2z g2zVar = shmVar.r;
                if (g2zVar != null) {
                    g2zVar.a(shmVar.k.c.a);
                }
                atk0 atk0Var = shmVar.k;
                Serializer.c<Peer> cVar = Peer.CREATOR;
                shmVar.l.b(new io.reactivex.rxjava3.internal.operators.single.r(shmVar.i.F(shmVar, new fem(Peer.a.b(atk0Var.a), atk0Var.b, Source.ACTUAL, true)), new iu4(new xcd(shmVar, 16), 9)).subscribe(new v8(new bw6(shmVar, 3), 19), new ph3(new p99(shmVar, 3), 25)));
                return s3q0.a;
            case 3:
                y9n.r1((y9n) this.receiver, (StoriesContainer) obj);
                return s3q0.a;
            case 4:
                com.vk.ads.easypromote.impl.presentation.b bVar = (com.vk.ads.easypromote.impl.presentation.b) this.receiver;
                bVar.getClass();
                xn50.a.c(bVar, (hkq) obj);
                return s3q0.a;
            case 5:
                L.i((Throwable) obj);
                return s3q0.a;
            case 6:
                AudioLyricsDto audioLyricsDto = (AudioLyricsDto) obj;
                ((ny40) this.receiver).getClass();
                AudioLyricsDataDto e = audioLyricsDto.e();
                List<AudioLyricsTimelinesDto> e2 = e != null ? e.e() : null;
                AudioLyricsDataDto e3 = audioLyricsDto.e();
                if (e3 == null || (d2 = e3.d()) == null) {
                    arrayList = null;
                } else {
                    List<String> list = d2;
                    arrayList = new ArrayList(c5g.u(list, 10));
                    Iterator<T> it = list.iterator();
                    while (it.hasNext()) {
                        arrayList.add(new Regex("[\u2028\u2029]").g((String) it.next(), ""));
                    }
                }
                if (e2 == null) {
                    return arrayList != null ? new cyk0(arrayList, audioLyricsDto.d()) : ggp.a;
                }
                List<AudioLyricsTimelinesDto> list2 = e2;
                Iterator<T> it2 = list2.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        obj2 = it2.next();
                        String g = ((AudioLyricsTimelinesDto) obj2).g();
                        if (g == null || g.length() == 0) {
                        }
                    } else {
                        obj2 = null;
                    }
                }
                AudioLyricsTimelinesDto audioLyricsTimelinesDto = (AudioLyricsTimelinesDto) obj2;
                ob00.a aVar = (audioLyricsTimelinesDto == null || (d = audioLyricsTimelinesDto.d()) <= 3000) ? null : new ob00.a(d - 3000, d);
                ArrayList arrayList2 = new ArrayList();
                for (AudioLyricsTimelinesDto audioLyricsTimelinesDto2 : list2) {
                    String g2 = audioLyricsTimelinesDto2.g();
                    String c = g2 != null ? z23.c("[\u2028\u2029]", g2, "") : null;
                    ob00 dVar = c != null ? new ob00.d(audioLyricsTimelinesDto2.d(), audioLyricsTimelinesDto2.e(), c) : epx.f(audioLyricsTimelinesDto2.f(), Boolean.TRUE) ? new ob00.c(audioLyricsTimelinesDto2.d(), audioLyricsTimelinesDto2.e()) : null;
                    if (dVar != null) {
                        arrayList2.add(dVar);
                    }
                }
                ob00 ob00Var = (ob00) j5g.k0(arrayList2);
                int a2 = ob00Var != null ? ob00Var.a() : 0;
                String d3 = audioLyricsDto.d();
                return new yvo0(aVar, arrayList2, new ob00.b(a2, d3 != null ? d3 : ""));
            case 7:
                yj50 yj50Var = (yj50) this.receiver;
                qcy<Object>[] qcyVarArr = yj50.m;
                Log.e(yj50Var.getClass().getCanonicalName(), "Error!", (Throwable) obj);
                return s3q0.a;
            case 8:
                ((dv60) this.receiver).a((r070) obj);
                return s3q0.a;
            case 9:
                cbb0 cbb0Var = (cbb0) this.receiver;
                cbb0Var.getClass();
                xn50.a.c(cbb0Var, (vab0) obj);
                return s3q0.a;
            case 10:
                ((vpc0) this.receiver).getClass();
                return vpc0.b((PostingState) obj);
            case 11:
                j03.l((Throwable) obj);
                return s3q0.a;
            case 12:
                UIBlock uIBlock = (UIBlock) obj;
                UIBlockAction uIBlockAction = ((VideoProfileHorizontallScrollItemWithHighlightVh) this.receiver).g;
                return Boolean.valueOf(uIBlockAction != null && uIBlock.k == uIBlockAction.k);
            default:
                L.i((Throwable) obj);
                return s3q0.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lw3(Object obj, int i) {
        super(1, obj, shm.class, "onRequestByCacheSuccess", "onRequestByCacheSuccess(Lcom/vk/im/ui/components/dialog_mention/vc/SuggestionData;)V", 0);
        this.b = i;
        switch (i) {
            case 5:
                super(1, obj, L.class, Logger.METHOD_E, "e(Ljava/lang/Throwable;)V", 0);
                break;
            case 6:
            case 9:
            case 12:
            default:
                break;
            case 7:
                super(1, obj, yj50.class, BatchApiRequest.FIELD_NAME_ON_ERROR, "onError(Ljava/lang/Throwable;)V", 0);
                break;
            case 8:
                super(1, obj, dv60.class, "startTask", "startTask(Lcom/vk/mvi/MviTask;)V", 0);
                break;
            case 10:
                super(1, obj, vpc0.class, "mapCarouselSwitcherState", "mapCarouselSwitcherState(Lcom/vk/newsfeed/posting/impl/domain/model/PostingState;)Lcom/vk/newsfeed/posting/impl/presentation/model/PostingCarouselSwitcherViewState;", 0);
                break;
            case 11:
                super(1, obj, j03.class, "showErrorToast", "showErrorToast(Ljava/lang/Throwable;)V", 0);
                break;
            case 13:
                super(1, obj, L.class, Logger.METHOD_E, "e(Ljava/lang/Throwable;)V", 0);
                break;
        }
    }
}

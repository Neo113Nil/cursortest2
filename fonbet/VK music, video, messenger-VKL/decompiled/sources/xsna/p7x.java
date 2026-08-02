package xsna;

import android.location.Location;
import com.vk.api.generated.base.dto.BaseOkResponseDto;
import com.vk.api.generated.ecosystem.dto.EcosystemSendOtpResponseDto;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.feature.music.dto.ui.UIBlockMusicTrack;
import com.vk.dto.common.data.VKList;
import com.vk.dto.music.Playlist;
import com.vk.dto.stickers.StickerStockItem;
import com.vk.im.engine.models.attaches.AttachUgcSticker;
import com.vk.log.L;
import com.vk.log.LoggerOutputTarget;
import com.vk.newsfeed.impl.requests.WallGetMain;
import com.vk.newsfeed.impl.requests.WallWithCounters;
import com.vk.newsfeed.posting.impl.domain.model.PostingState;
import com.vk.newsfeed.posting.impl.domain.rules.PostingRule;
import com.vk.newsfeed.posting.impl.domain.rules.RuleAttachment;
import com.vk.newsfeed.posting.impl.domain.rules.api.ActionButtonAttachmentRule;
import com.vk.newsfeed.posting.impl.presentation.model.ActionButton;
import com.vk.newsfeed.posting.impl.presentation.model.PostingSettings;
import com.vk.translate.impl.views.TranslateFailedView;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import xsna.dmz;
import xsna.no90;
import xsna.r7x;
import xsna.tj50;
import xsna.yqc0;
import xsna.ywi0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class p7x implements izs {
    public final /* synthetic */ int b;

    public /* synthetic */ p7x(int i) {
        this.b = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.izs
    public final Object invoke(Object obj) {
        Object obj2 = null;
        switch (this.b) {
            case 0:
                return r7x.a.a((r7x.a) obj, true, null, 5);
            case 1:
                return dmz.d.a;
            case 2:
                io.reactivex.rxjava3.internal.operators.completable.v vVar = new io.reactivex.rxjava3.internal.operators.completable.v(new io.reactivex.rxjava3.internal.operators.completable.p(new io.reactivex.rxjava3.internal.operators.single.o(new io.reactivex.rxjava3.internal.operators.single.v(new f720()).m(asu0.a.d()), new bdz(new d220(2), 4))), io.reactivex.rxjava3.internal.functions.a.g);
                k720 k720Var = k720.a;
                return vVar.d(k720.I((Location) ((it80) obj).a, null));
            case 3:
                ((io.reactivex.rxjava3.functions.a) obj).run();
                return s3q0.a;
            case 4:
                return bn00.a((EcosystemSendOtpResponseDto) obj);
            case 5:
                return null;
            case 6:
                return j5g.H0(j5g.S(((Playlist) obj).y, 0), 30);
            case 7:
                return ((AttachUgcSticker) obj).f;
            case 8:
                return Boolean.valueOf(((UIBlock) obj) instanceof UIBlockMusicTrack);
            case 9:
                return ((id50) obj).b;
            case 10:
                com.vk.metrics.eventtracking.b.a.a((Throwable) obj);
                return s3q0.a;
            case 11:
                return s3q0.a;
            case 12:
                ((Long) obj).longValue();
                return s3q0.a;
            case 13:
                return s3q0.a;
            case 14:
                qgi0.r((tgi0) obj, "order_product_properties");
                return s3q0.a;
            case 15:
                VKList vKList = (VKList) obj;
                return new no90.c.b(vKList.size(), vKList, vKList.i() > vKList.size());
            case 16:
                qgi0.r((tgi0) obj, "watch_shuffled_button");
                return s3q0.a;
            case 17:
                PostingState.Editing editing = (PostingState.Editing) obj;
                PostingSettings postingSettings = editing.d;
                List<ActionButton> list = postingSettings.i;
                Iterator<T> it = postingSettings.d.b.iterator();
                while (true) {
                    if (it.hasNext()) {
                        Object next = it.next();
                        if (((PostingRule) next) instanceof ActionButtonAttachmentRule) {
                            obj2 = next;
                        }
                    }
                }
                PostingRule postingRule = (PostingRule) obj2;
                if (postingRule == null) {
                    return list;
                }
                ActionButtonAttachmentRule actionButtonAttachmentRule = (ActionButtonAttachmentRule) postingRule;
                xmc0 xmc0Var = new xmc0(editing);
                Set<RuleAttachment> set = actionButtonAttachmentRule.c;
                if ((set instanceof Collection) && set.isEmpty()) {
                    return list;
                }
                Iterator<T> it2 = set.iterator();
                while (it2.hasNext()) {
                    if (!xmc0Var.c((RuleAttachment) it2.next())) {
                        ArrayList arrayList = new ArrayList();
                        for (Object obj3 : list) {
                            if (((ActionButton) obj3).b.f() != actionButtonAttachmentRule.b) {
                                arrayList.add(obj3);
                            }
                        }
                        return arrayList;
                    }
                }
                return list;
            case 18:
                return new yqc0.a(((tj50.a) obj).e(new ulz(16)));
            case 19:
                return Float.valueOf(((hfk) obj).getY1());
            case 20:
                return s3q0.a;
            case 21:
                qgi0.r((tgi0) obj, "search_filters_top_bar_close");
                return s3q0.a;
            case 22:
                int i = gbi0.o1;
                return s3q0.a;
            case 23:
                return new ywi0.a(((tj50.a) obj).a(new nc90(12), ao8.d));
            case 24:
                return Boolean.valueOf(!((StickerStockItem) obj).Hb());
            case 25:
                qyg0 V0 = ((hyg0) obj).V0("DELETE FROM store_packs");
                try {
                    V0.step();
                    V0.close();
                    return s3q0.a;
                } catch (Throwable th) {
                    V0.close();
                    throw th;
                }
            case 26:
                Throwable th2 = (Throwable) obj;
                L l = L.a;
                l.getClass();
                if (!L.m(LoggerOutputTarget.NONE)) {
                    L.u(l, L.LogType.e, new Object[]{ms9.b("Failed to extract waveform: ", th2)});
                }
                return s3q0.a;
            case 27:
                return Boolean.valueOf(((BaseOkResponseDto) obj) == BaseOkResponseDto.OK);
            case 28:
                int i2 = TranslateFailedView.f;
                return s3q0.a;
            default:
                WallGetMain.Result result = (WallGetMain.Result) obj;
                WallWithCounters wallWithCounters = new WallWithCounters(result.i());
                wallWithCounters.addAll(result);
                return wallWithCounters;
        }
    }

    public /* synthetic */ p7x(nsq0 nsq0Var) {
        this.b = 29;
    }
}

package xsna;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import com.unity3d.ads.adplayer.ExposedFunction;
import com.unity3d.ads.core.data.model.AdObject;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import com.unity3d.services.core.di.ServiceProvider;
import com.unity3d.services.core.di.ServicesRegistry;
import com.unity3d.services.core.di.UnityAdsModule;
import com.vk.catalog.mvi.block.BlockId;
import com.vk.dto.common.Good;
import com.vk.dto.music.MusicTrack;
import com.vk.dto.polls.PhotoPoll;
import com.vk.dto.polls.Poll;
import com.vk.dto.polls.PollBackground;
import com.vk.dto.polls.PollContentColor;
import com.vk.ecomm.market.good.ui.holder.contentholder.MediaContentItem;
import com.vk.im.ui.components.contacts.a;
import com.vk.libvideo.autoplay.VideoAutoPlay;
import com.vk.stickers.api.styles.StickerCommonStyle;
import com.vkontakte.android.R;
import java.util.ArrayList;
import kotlin.Pair;
import xsna.i6w;
import xsna.kjf0;
import xsna.l6w;
import xsna.t44;
import xsna.wqs0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class xg2 implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ xg2(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x00ef, code lost:
    
        if (r4 != r0) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0121, code lost:
    
        r3 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0116, code lost:
    
        if (r0 != r1) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x011f, code lost:
    
        if (r2 != r0) goto L52;
     */
    /* JADX WARN: Type inference failed for: r0v19, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.gzs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke() {
        ExposedFunction invoke$lambda$28;
        int i;
        int i2;
        Object obj;
        yvj initialize$lambda$220$lambda$10;
        switch (this.b) {
            case 0:
                gzs gzsVar = (gzs) this.c;
                rg50 rg50Var = (rg50) this.d;
                rg50Var.C(rg50Var.getIntValue() + 1);
                gzsVar.invoke();
                break;
            case 1:
                ((izs) this.c).invoke(new t44.c.b(((kfd) this.d).a, !r1.d));
                break;
            case 2:
                cih cihVar = (cih) this.c;
                break;
            case 3:
                com.vk.im.ui.components.contacts.a aVar = (com.vk.im.ui.components.contacts.a) this.c;
                aVar.i.D((a.b) this.d, new dbj());
                aVar.j.d().getClass();
                break;
            case 4:
                ((eqo) this.c).d((hqo) this.d);
                break;
            case 5:
                break;
            case 6:
                invoke$lambda$28 = HandleInvocationsFromAdViewer.invoke$lambda$28((HandleInvocationsFromAdViewer) this.c, (AdObject) this.d);
                break;
            case 7:
                ((p7w) this.c).d.invoke(new i6w.s(((l6w.b.m) this.d).a));
                break;
            case 8:
                jd10 jd10Var = (jd10) this.c;
                MediaContentItem mediaContentItem = (MediaContentItem) this.d;
                f4m.j(jd10Var.k);
                w6e w6eVar = jd10Var.i;
                cxo cxoVar = (cxo) w6eVar.b;
                cxoVar.a.c().getClass();
                MediaContentItem a = MediaContentItem.a(mediaContentItem);
                ArrayList arrayList = cxoVar.U;
                arrayList.set(arrayList.indexOf(mediaContentItem), a);
                Good good = cxoVar.r;
                if (good != null) {
                    cxoVar.c.a(cxoVar, new kjf0.a(34, new nq10(good.V ? R.string.product_service_media_content_title : R.string.product_media_content_title, j5g.H0(arrayList, 3), cxoVar.V >= 3), 0));
                }
                w6eVar.k(jd10Var.h.getContext(), mediaContentItem);
                break;
            case 9:
                hpb0 hpb0Var = (hpb0) this.c;
                Poll poll = (Poll) this.d;
                boolean z = hpb0Var.j;
                boolean z2 = false;
                if (!z) {
                    Pair<Integer, Integer> h = hpb0Var.h();
                    int intValue = h.d().intValue();
                    int intValue2 = h.g().intValue();
                    PollBackground pollBackground = poll.s;
                    if (!(pollBackground instanceof PhotoPoll)) {
                        if (pollBackground == null) {
                            i = 0;
                            break;
                        } else {
                            i = pollBackground.b;
                            break;
                        }
                    } else if (pollBackground == null) {
                        i2 = 0;
                        break;
                    } else {
                        i2 = pollBackground.b;
                        break;
                    }
                } else {
                    StickerCommonStyle stickerCommonStyle = null;
                    if (!z || (obj = hpb0Var.n.K0()) == null || !(obj instanceof StickerCommonStyle)) {
                        obj = null;
                    }
                    StickerCommonStyle stickerCommonStyle2 = (StickerCommonStyle) obj;
                    PollBackground pollBackground2 = poll.s;
                    PollContentColor pollContentColor = pollBackground2 instanceof PollContentColor ? (PollContentColor) pollBackground2 : null;
                    if (pollContentColor != null) {
                        stickerCommonStyle = pollContentColor.d;
                        break;
                    }
                }
                break;
            case 10:
                ((com.vk.profile.core.tabs.ui.music.a) this.c).f.invoke((MusicTrack) this.d);
                break;
            case 11:
                initialize$lambda$220$lambda$10 = ServiceProvider.initialize$lambda$220$lambda$10((UnityAdsModule) this.c, (ServicesRegistry) this.d);
                break;
            case 12:
                break;
            case 13:
                Activity activity = (Activity) this.c;
                yg5 yg5Var = (yg5) this.d;
                scn0.b.getClass();
                scn0.E(activity, yg5Var, true);
                break;
            case 14:
                dfq0 dfq0Var = (dfq0) this.c;
                Context context = (Context) this.d;
                Intent C = dfq0Var.C();
                C.putExtra("target_user_id", dfq0Var.x.k);
                break;
            case 15:
                String str = (String) this.c;
                VideoAutoPlay videoAutoPlay = (VideoAutoPlay) this.d;
                StringBuilder a2 = t33.a("VideoFile.ovid is not a number (", str, "), videoFile= ");
                a2.append(videoAutoPlay.u);
                break;
            case 16:
                ((izs) this.c).invoke(new wqs0.n((BlockId.CompositeId) this.d));
                break;
            default:
                d0l d0lVar = (d0l) this.c;
                com.vk.core.compose.component.datetime.d dVar = (com.vk.core.compose.component.datetime.d) this.d;
                Long f = d0lVar.f();
                if (f != null) {
                    long longValue = f.longValue();
                    dVar.e(false);
                    dVar.f(com.vk.core.compose.component.datetime.c.a(longValue));
                }
                break;
        }
        return s3q0.a;
    }
}

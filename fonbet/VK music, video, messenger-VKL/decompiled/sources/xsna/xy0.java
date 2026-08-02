package xsna;

import android.content.Context;
import android.graphics.RectF;
import android.os.Build;
import android.view.View;
import android.widget.LinearLayout;
import com.vk.attachpicker.PhotoVideoAttachActivity;
import com.vk.camera.clips.drafts.sync.api.di.ClipsDraftSyncComponent;
import com.vk.clips.sdk.shared.item.common.error.ErrorOverlayRenderDelegate;
import com.vk.dto.common.VideoFile;
import com.vk.dto.common.id.UserId;
import com.vk.dto.hints.HintId;
import com.vk.dto.newsfeed.entries.Post;
import com.vk.dto.stickers.StickersDictionaryItemLight;
import com.vk.ecomm.cart.impl.cart.ui.items.CartItem;
import com.vk.ecomm.design.compose.tile.MarketProductTileConfig;
import com.vk.im.ui.components.common.AvatarAction;
import com.vk.libvideo.design.compose.base.timeline.TimelineViewState;
import com.vk.onboarding.api.dto.VkOnboardingCampaign;
import com.vk.video.ui.discovery.minimizable.doc2doc.recycler.HorizontalRecyclerPaginationView;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Triple;
import xsna.dt70;
import xsna.h75;
import xsna.r2c;
import xsna.rv9;
import xsna.ry9;
import xsna.us70;
import xsna.ymb;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes17.dex */
public final /* synthetic */ class xy0 implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ xy0(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x00fe, code lost:
    
        if (r0 > 3) goto L32;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v113, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v20, types: [xsna.j8i, xsna.xwb$a] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.gzs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke() {
        kj50 gVar;
        int i;
        switch (this.b) {
            case 0:
                return new ErrorOverlayRenderDelegate(((b11) ((zy0) this.c).a.getValue()).f, new h5((ux0) this.d, 3));
            case 1:
                gzs gzsVar = (gzs) this.c;
                rg50 rg50Var = (rg50) this.d;
                rg50Var.C(rg50Var.getIntValue() + 1);
                gzsVar.invoke();
                return s3q0.a;
            case 2:
                izs izsVar = (izs) this.c;
                CartItem.Summary summary = (CartItem.Summary) this.d;
                CartItem.Summary.Action action = summary.g;
                UserId userId = summary.c;
                int i2 = ry9.a.$EnumSwitchMapping$0[action.c.ordinal()];
                if (i2 == 1) {
                    gVar = new rv9.g(userId);
                } else {
                    if (i2 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    gVar = new rv9.a.d(userId);
                }
                izsVar.invoke(gVar);
                return s3q0.a;
            case 3:
                Collection<Triple> collection = (Collection) this.c;
                ymb ymbVar = (ymb) this.d;
                for (Triple triple : collection) {
                    int intValue = ((Number) triple.i()).intValue();
                    Integer num = (Integer) triple.j();
                    Collection collection2 = (Collection) triple.k();
                    ymb.a aVar = (ymb.a) ymbVar.k.get(Integer.valueOf(intValue));
                    if (aVar != null && !aVar.b) {
                        gtx0 gtx0Var = aVar.a;
                        aux0 aux0Var = gtx0Var instanceof aux0 ? (aux0) gtx0Var : null;
                        ymbVar.W(intValue, j5g.O0(collection2), num, aux0Var != null ? aux0Var.R5() : null, false);
                    }
                }
                ymbVar.V();
                return s3q0.a;
            case 4:
                ((xwb) this.c).b.p((AvatarAction) this.d);
                return s3q0.a;
            case 5:
                ((izs) this.c).invoke(new r2c.b(((c3c) this.d).b));
                return s3q0.a;
            case 6:
                return o1d.C((o1d) this.c, (Context) this.d);
            case 7:
                q7v0 q7v0Var = (q7v0) this.c;
                wcf wcfVar = (wcf) this.d;
                VkOnboardingCampaign e = q7v0Var.e(HintId.CLIPS_NEW_BC_POSTING_ONBOARDING.getId());
                boolean z = false;
                if (e != null && q7v0Var.d(e)) {
                    z = q7v0Var.b(e, false);
                }
                wcfVar.e(new vgf(z));
                return s3q0.a;
            case 8:
                return (ClipsDraftSyncComponent) ((g8m) this.d).b(fpf0.a(ClipsDraftSyncComponent.class), new odo(((b25) this.c).c().b));
            case 9:
                ((izs) this.c).invoke(new com.vk.profile.design.compose.header.sink.b((zhf0) ((wh50) this.d).getValue()));
                return s3q0.a;
            case 10:
                ((ffq) this.c).a().postDelayed(new j0((dw20) this.d, 8), 1500L);
                return s3q0.a;
            case 11:
                ((izs) this.c).invoke(new h75.a(((ovx) this.d).c));
                return s3q0.a;
            case 12:
                izs izsVar2 = (izs) this.c;
                MarketProductTileConfig marketProductTileConfig = (MarketProductTileConfig) this.d;
                if (izsVar2 != null) {
                    izsVar2.invoke(new MarketProductTileConfig.f(marketProductTileConfig.a));
                }
                return s3q0.a;
            case 13:
                for (Pair pair : (ArrayList) this.c) {
                    ((scr) pair.d()).c.invoke(this.d, pair.g());
                }
                return s3q0.a;
            case 14:
                ((jg30) this.c).d.add((kuc0) this.d);
                return s3q0.a;
            case 15:
                return (RectF) ((izs) this.c).invoke((View) this.d);
            case 16:
                ((izs) this.c).invoke(new us70.b(((dt70.a) this.d).a));
                return s3q0.a;
            case 17:
                bwt0.c0(((LinearLayout) this.d).getMeasuredHeight(), ((PhotoVideoAttachActivity) this.c).U);
                return s3q0.a;
            case 18:
                Post post = (Post) this.c;
                com.vk.qrcode.c cVar = (com.vk.qrcode.c) this.d;
                boolean X = post.X();
                q76.d(cVar, post, new hi3(post, X, 2), 2);
                post.s0(!X);
                return s3q0.a;
            case 19:
                vof0 vof0Var = (vof0) this.c;
                hof0 hof0Var = ((com.vk.reefton.trackers.i) this.d).a;
                boolean a = hof0Var.a();
                boolean l = hof0Var.b.l("android.permission.ACCESS_WIFI_STATE");
                vfe vfeVar = hof0Var.b;
                vof0Var.a(new dy90(a, vfeVar.l("android.permission.READ_PHONE_STATE"), l, Build.VERSION.SDK_INT >= 30 ? vfeVar.l("android.permission.READ_PRECISE_PHONE_STATE") : false, vfeVar.l("android.permission.READ_PHONE_NUMBERS")));
                return s3q0.a;
            case 20:
                wh50 wh50Var = (wh50) this.c;
                mtk0 mtk0Var = (mtk0) this.d;
                if (((Number) wh50Var.getValue()).intValue() <= 1) {
                    int size = ((List) mtk0Var.getValue()).size();
                    i = 3;
                    break;
                }
                i = 2;
                return Integer.valueOf(i);
            case 21:
                znj0 znj0Var = (znj0) this.c;
                df90 df90Var = (df90) this.d;
                HorizontalRecyclerPaginationView a2 = znj0Var.h().a();
                if (a2 != null) {
                    a2.u(df90Var);
                }
                return s3q0.a;
            case 22:
                ((izs) this.c).invoke(j5g.H0(new wow((List) this.d), r1.size() - 1));
                return s3q0.a;
            case 23:
                g3n0 g3n0Var = (g3n0) this.c;
                f3n0 f3n0Var = (f3n0) this.d;
                g3n0Var.m.p(f3n0Var.b, f3n0Var.d);
                return s3q0.a;
            case 24:
                p6n0 p6n0Var = (p6n0) this.c;
                List list = (List) this.d;
                p6n0Var.a.b();
                q6n0 q6n0Var = p6n0Var.a;
                List<StickersDictionaryItemLight> list2 = list;
                ArrayList arrayList = new ArrayList(c5g.u(list2, 10));
                for (StickersDictionaryItemLight stickersDictionaryItemLight : list2) {
                    arrayList.add(new dxm(stickersDictionaryItemLight.Ab(), stickersDictionaryItemLight.zb(), stickersDictionaryItemLight.Bb()));
                }
                q6n0Var.a(arrayList);
                return s3q0.a;
            case 25:
                wh50 wh50Var2 = (wh50) this.c;
                TimelineViewState timelineViewState = (TimelineViewState) this.d;
                Long l2 = (Long) wh50Var2.getValue();
                return Long.valueOf(swe0.i(l2 != null ? l2.longValue() : timelineViewState.a.getValue().longValue(), 0L, timelineViewState.c));
            default:
                return ((s290) ((zjt0) this.c).M.getValue()).a(((VideoFile) this.d).w2());
        }
    }
}

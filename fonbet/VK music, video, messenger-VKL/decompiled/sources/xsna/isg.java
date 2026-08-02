package xsna;

import android.content.DialogInterface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.Lifecycle;
import com.unity3d.services.UnityAdsConstants;
import com.vk.catalog2.common.dto.ui.UIBlockList;
import com.vk.core.tips.Tooltip;
import com.vk.core.tool.onboarding.VkTooltip$BalloonPosition;
import com.vk.core.tool.onboarding.VkTooltip$BalloonTilt;
import com.vk.core.tool.onboarding.VkTooltip$MarkerSize;
import com.vk.core.tool.onboarding.VkTooltip$MarkerStyle;
import com.vk.dto.hints.Hint;
import com.vk.dto.hints.HintId;
import com.vk.dto.music.Playlist;
import com.vk.dto.newsfeed.activities.Comment;
import com.vk.dto.newsfeed.entries.Post;
import com.vk.dto.reactions.ReactionMeta;
import com.vk.libvideo.design.compose.video.videocard.VideoCardViewState;
import java.lang.ref.WeakReference;
import java.util.List;
import kotlin.jvm.internal.Ref$ObjectRef;
import xsna.dai;
import xsna.ish0;
import xsna.m8v0;
import xsna.o4z;
import xsna.saj;
import xsna.xrh;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes5.dex */
public final /* synthetic */ class isg implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ isg(Object obj, Object obj2, Object obj3, int i) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v7, types: [xsna.e5z, xsna.n4z] */
    @Override // xsna.izs
    public final Object invoke(Object obj) {
        dai.c b;
        kbe kbeVar;
        int i = this.b;
        boolean z = false;
        Object obj2 = this.e;
        Object obj3 = this.d;
        Object obj4 = this.c;
        switch (i) {
            case 0:
                xrh.d.f fVar = (xrh.d.f) obj4;
                ksg ksgVar = (ksg) obj3;
                View view = (View) obj2;
                String str = fVar.c;
                int i2 = m8v0.M;
                m8v0.a.a(view, str, null, VkTooltip$MarkerStyle.Style3, VkTooltip$MarkerSize.Size146, null, VkTooltip$BalloonPosition.BottomRight, VkTooltip$BalloonTilt.Right, new gr3(view, 22), new com.vk.im.engine.internal.api_commands.messages.a(view, 23), null, null, null, null, null, 0, false, ksgVar.h, ksgVar.i, false, bwt0.t(view.getContext()), false, 10615844);
                ksgVar.b.b(fVar.b);
                break;
            case 1:
                saj sajVar = (saj) obj4;
                LayoutInflater layoutInflater = (LayoutInflater) obj3;
                saj.a aVar = (saj.a) obj2;
                ViewGroup viewGroup = (ViewGroup) obj;
                boolean z2 = sajVar.i;
                boolean z3 = sajVar.h;
                if (!z2) {
                    break;
                } else {
                    break;
                }
            case 2:
                kky kkyVar = (kky) obj4;
                final prq0 prq0Var = (prq0) obj3;
                wmd0 wmd0Var = (wmd0) obj2;
                View view2 = (View) obj;
                Hint b2 = pla.e().b().b(HintId.INFO_VIDEO_KAZ_LANG.getId());
                if (b2 != null) {
                    Tooltip.l(new Tooltip(kkyVar.a, null, b2.c, null, null, new DialogInterface.OnShowListener() { // from class: xsna.jky
                        @Override // android.content.DialogInterface.OnShowListener
                        public final void onShow(DialogInterface dialogInterface) {
                            prq0.this.invoke();
                        }
                    }, null, 0, 0, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 48, 0, false, null, 0, false, null, null, null, null, null, null, new r2v(wmd0Var, 2), 2400L, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, null, false, -iah0.a(16), new WeakReference(view2), null, null, null, 1048573912, 15), kkyVar.a, bwt0.G(view2), false, false, false, false, 236);
                    break;
                } else {
                    break;
                }
            case 3:
                f5z f5zVar = (f5z) obj4;
                final n5z n5zVar = (n5z) obj3;
                final izs izsVar = (izs) obj2;
                final Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
                ?? r2 = new androidx.lifecycle.l() { // from class: xsna.n4z
                    /* JADX WARN: Type inference failed for: r2v4, types: [T, java.lang.Object] */
                    @Override // androidx.lifecycle.l
                    public final void onStateChanged(f5z f5zVar2, Lifecycle.Event event) {
                        int i3 = o4z.b.$EnumSwitchMapping$0[event.ordinal()];
                        Ref$ObjectRef ref$ObjectRef2 = ref$ObjectRef;
                        if (i3 == 1) {
                            ref$ObjectRef2.element = izsVar.invoke(n5z.this);
                        } else {
                            if (i3 != 2) {
                                return;
                            }
                            o5z o5zVar = (o5z) ref$ObjectRef2.element;
                            if (o5zVar != null) {
                                o5zVar.a();
                            }
                            ref$ObjectRef2.element = null;
                        }
                    }
                };
                f5zVar.getLifecycle().addObserver(r2);
                break;
            case 4:
                nk40 nk40Var = (nk40) obj3;
                List list = (List) obj2;
                UIBlockList uIBlockList = (UIBlockList) obj;
                if (qr.f(((Playlist) obj4).c)) {
                    nk40Var.getClass();
                    if (k5a.b(uIBlockList, new com.vk.movika.sdk.base.ui.s0(19, list, nk40Var))) {
                        z = true;
                    }
                }
                break;
            case 5:
                dv60 dv60Var = (dv60) obj4;
                iw60 iw60Var = (iw60) obj3;
                io.reactivex.rxjava3.core.x<lu60> I = dv60Var.I(dv60Var.w().h(iw60Var, (jw60) obj2), iw60Var.m);
                int i3 = iw60Var.c;
                io.reactivex.rxjava3.core.x<lu60> H = dv60Var.H(dv60Var.A(I, i3), i3);
                if (dv60Var.y()) {
                    fs00 fs00Var = new fs00(new h2s(dv60Var, 24), 7);
                    H.getClass();
                    break;
                }
                break;
            case 6:
                Comment comment = (Comment) obj4;
                Post post = (Post) obj2;
                new d2f0();
                d2f0.e(comment, (ReactionMeta) obj3, (t9x0) obj);
                comment.G2();
                ysg0.b.a(new b0x(post.m, post.n, comment.b));
                break;
            case 7:
                sk3 sk3Var = (sk3) obj4;
                rfc rfcVar = (rfc) obj3;
                izs izsVar2 = (izs) obj2;
                sk3Var.addLast((ish0) obj);
                while (!sk3Var.isEmpty()) {
                    ish0 ish0Var = (ish0) sk3Var.removeFirst();
                    if (ish0Var instanceof ish0.a) {
                        sk3Var.addAll(((ish0.a) ish0Var).a);
                    } else if (rfcVar.c(ish0Var)) {
                        izsVar2.invoke(ish0Var);
                    }
                }
                break;
            default:
                String str2 = (String) obj3;
                String str3 = (String) obj2;
                tgi0 tgi0Var = (tgi0) obj;
                VideoCardViewState.c c = ((xrs0) obj4).c.c();
                if (c != null && (b = c.b()) != null && (kbeVar = b.c) != null) {
                    bgi0.c(tgi0Var, kbeVar);
                }
                if (str2 != null) {
                    bgi0.d(tgi0Var, str2);
                }
                if (str3 != null) {
                    sgi0<String> sgi0Var = bgi0.j;
                    qcy<Object> qcyVar = bgi0.a[8];
                    sgi0Var.getClass();
                    tgi0Var.a(sgi0Var, str3);
                }
                qgi0.r(tgi0Var, "mvi_catalog_large_video_card_test_tag");
                break;
        }
        return s3q0.a;
    }
}

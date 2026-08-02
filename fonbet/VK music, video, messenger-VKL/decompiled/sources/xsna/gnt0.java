package xsna;

import com.vk.clips.sdk.facade.api.MyTargetVideoPlaybackErrorType;
import com.vk.clips.sdk.shared.item.ads.AdsItemAction;
import com.vk.clips.sdk.shared.item.ads.AdsItemPatch;
import com.vk.clips.viewer.impl.feed.view.ClipFeedListFragment;
import com.vk.stat.model.DevNullEventKey;
import com.vk.stat.scheme.SchemeStat$TypeDevNullItem;
import kotlin.NoWhenBranchMatchedException;
import one.video.player.error.OneVideoPlaybackException;
import xsna.hz0;
import xsna.nz0;
import xsna.wk50;
import xsna.xp50;

/* compiled from: VideoUIEventActionApplier.kt */
/* loaded from: classes17.dex */
public final class gnt0 implements oj50<nz0, AdsItemAction, AdsItemPatch> {
    public final bx0 a;
    public final hme b;

    public gnt0(bx0 bx0Var, hme hmeVar) {
        this.a = bx0Var;
        this.b = hmeVar;
    }

    @Override // xsna.oj50
    public final void a(wk50.a aVar, km50 km50Var, kj50 kj50Var) {
        nz0 nz0Var = (nz0) km50Var;
        AdsItemAction adsItemAction = (AdsItemAction) kj50Var;
        if ((nz0Var instanceof nz0.a) && (adsItemAction instanceof AdsItemAction.t)) {
            AdsItemAction.t tVar = (AdsItemAction.t) adsItemAction;
            if (tVar instanceof AdsItemAction.t.h) {
                nz0.a aVar2 = (nz0.a) nz0Var;
                hz0.a aVar3 = ((AdsItemAction.t.h) adsItemAction).b.a;
                boolean z = aVar3.a;
                boolean z2 = aVar3.b;
                boolean z3 = true;
                boolean z4 = z && !z2;
                boolean z5 = aVar3.c;
                ev evVar = aVar2.i;
                boolean z6 = evVar.a;
                boolean z7 = evVar.b;
                boolean z8 = z4 || (z6 && !z2);
                if (!z5 && !z7) {
                    z3 = false;
                }
                aVar.b(new AdsItemPatch.f.h(z8, z3));
                return;
            }
            if (tVar instanceof AdsItemAction.t.g) {
                nz0.a aVar4 = (nz0.a) nz0Var;
                aVar.b(new AdsItemPatch.f.g(((AdsItemAction.t.g) adsItemAction).b));
                wp50 wp50Var = aVar4.l;
                if (wp50Var != null) {
                    j4b0 j4b0Var = aVar4.e;
                    if (j4b0Var.d) {
                        wp50Var.f(xp50.f.a);
                        return;
                    } else {
                        if (j4b0Var.a) {
                            return;
                        }
                        wp50Var.f(xp50.g.a);
                        return;
                    }
                }
                return;
            }
            if (tVar instanceof AdsItemAction.t.j) {
                ((AdsItemAction.t.j) adsItemAction).getClass();
                aVar.b(new AdsItemPatch.f.j());
                wp50 wp50Var2 = ((nz0.a) nz0Var).l;
                if (wp50Var2 != null) {
                    wp50Var2.f(xp50.f.a);
                    return;
                }
                return;
            }
            if (tVar instanceof AdsItemAction.t.f) {
                aVar.b(new AdsItemPatch.f.C0650f(((AdsItemAction.t.f) adsItemAction).b));
                wp50 wp50Var3 = ((nz0.a) nz0Var).l;
                if (wp50Var3 != null) {
                    wp50Var3.f(xp50.e.a);
                    return;
                }
                return;
            }
            if (!(tVar instanceof AdsItemAction.t.c)) {
                if (tVar instanceof AdsItemAction.t.i) {
                    aVar.b(new AdsItemPatch.f.i(((AdsItemAction.t.i) adsItemAction).b));
                    return;
                }
                if (tVar instanceof AdsItemAction.t.d) {
                    aVar.b(new AdsItemPatch.f.d(((AdsItemAction.t.d) adsItemAction).b));
                    return;
                }
                if (tVar instanceof AdsItemAction.t.e) {
                    aVar.b(new AdsItemPatch.f.e(((AdsItemAction.t.e) adsItemAction).b));
                    return;
                }
                if (tVar instanceof AdsItemAction.t.b) {
                    aVar.b(new AdsItemPatch.f.b(((AdsItemAction.t.b) adsItemAction).b));
                    return;
                }
                if (tVar instanceof AdsItemAction.t.a) {
                    aVar.b(new AdsItemPatch.f.a(((AdsItemAction.t.a) adsItemAction).b));
                    wp50 wp50Var4 = ((nz0.a) nz0Var).l;
                    if (wp50Var4 != null) {
                        wp50Var4.f(xp50.c.a);
                        return;
                    }
                    return;
                }
                if (!(tVar instanceof AdsItemAction.t.k)) {
                    throw new NoWhenBranchMatchedException();
                }
                boolean booleanValue = ((Boolean) this.a.invoke()).booleanValue();
                wp50 wp50Var5 = ((nz0.a) nz0Var).l;
                if (wp50Var5 != null) {
                    wp50Var5.f(new xp50.h(!booleanValue));
                }
                aVar.b(new AdsItemPatch.f.k(booleanValue));
                return;
            }
            AdsItemAction.t.c cVar = (AdsItemAction.t.c) adsItemAction;
            j4b0 j4b0Var2 = cVar.b;
            OneVideoPlaybackException.ErrorCode errorCode = cVar.d;
            aVar.b(new AdsItemPatch.f.c(j4b0Var2, cVar.c));
            wp50 wp50Var6 = ((nz0.a) nz0Var).l;
            if (wp50Var6 != null) {
                wp50Var6.f(new xp50.d((errorCode == OneVideoPlaybackException.ErrorCode.TIMEOUT || errorCode == OneVideoPlaybackException.ErrorCode.IO_NETWORK_CONNECTION_TIMEOUT) ? MyTargetVideoPlaybackErrorType.TIMEOUT : MyTargetVideoPlaybackErrorType.UNKNOWN_ERROR));
                String e = wp50Var6.e();
                long a = wp50Var6.a();
                String b = wp50Var6.b();
                String name = errorCode.name();
                Throwable th = cVar.e;
                hme hmeVar = this.b;
                hmeVar.getClass();
                int i = ClipFeedListFragment.a2;
                fsk0 fsk0Var = qsk0.a;
                if (fsk0Var == null) {
                    return;
                }
                String str = null;
                l5m l5mVar = new l5m(fsk0Var, null, 2);
                String h = DevNullEventKey.CLIPS_FEED_BAD_RESPONSE.h();
                String str2 = (String) hmeVar.a.invoke();
                String valueOf = String.valueOf(a);
                if (th != null) {
                    StringBuilder sb = new StringBuilder();
                    do {
                        sb.append(String.valueOf(th));
                        sb.append("\n");
                        th = th.getCause();
                        if (th == null) {
                            break;
                        }
                    } while (!th.equals(th.getCause()));
                    str = erm0.D0(1024, sb.toString());
                }
                l5mVar.g = new SchemeStat$TypeDevNullItem(h, str, "mytarget_item_playback_error", null, str2, null, e, null, valueOf, null, name, null, b, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -5464, 3, null);
                l5mVar.q();
            }
        }
    }

    @Override // xsna.oj50
    public final void onDestroy() {
    }
}

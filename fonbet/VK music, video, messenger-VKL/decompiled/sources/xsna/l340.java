package xsna;

import com.vk.clips.sdk.shared.item.static_ads.events.StaticAdsItemViewEvent;
import com.vk.common.links.AwayLink;
import com.vk.newsfeed.impl.requests.WallWithCounters;
import java.util.List;
import xsna.exy0;
import xsna.xuw0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes5.dex */
public final /* synthetic */ class l340 implements io.reactivex.rxjava3.functions.m, io.reactivex.rxjava3.functions.l, io.reactivex.rxjava3.functions.g, io.reactivex.rxjava3.core.a0, saz, yads.ng1, exy0.a {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ l340(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // xsna.saz
    public void I(AwayLink awayLink) {
        ((dw20) this.c).hide();
    }

    public void a(StaticAdsItemViewEvent staticAdsItemViewEvent) {
        com.vk.clips.sdk.shared.item.static_ads.c.m((com.vk.clips.sdk.shared.item.static_ads.c) this.c, staticAdsItemViewEvent);
    }

    @Override // io.reactivex.rxjava3.functions.l
    public Object apply(Object obj) {
        switch (this.b) {
            case 1:
                return (tt70) ((tuq) this.c).invoke(obj);
            case 2:
                return (io.reactivex.rxjava3.core.t) ((el30) this.c).invoke(obj);
            case 3:
            case 9:
            case 12:
            case 13:
            case 17:
            default:
                return (xuw0.a) ((ubt0) this.c).invoke(obj);
            case 4:
                return (io.reactivex.rxjava3.core.t) ((el30) this.c).invoke(obj);
            case 5:
                return (io.reactivex.rxjava3.core.e) ((d4r) this.c).invoke(obj);
            case 6:
                return (io.reactivex.rxjava3.core.t) ((v74) this.c).invoke(obj);
            case 7:
                return (WallWithCounters) ((el30) this.c).invoke(obj);
            case 8:
                return (Integer) ((el30) this.c).invoke(obj);
            case 10:
                return (wia0) ((yvd) this.c).invoke(obj);
            case 11:
                return (hda) ((lhj0) this.c).invoke(obj);
            case 14:
                return (List) ((ptl0) this.c).invoke(obj);
            case 15:
                return (List) ((u2k0) this.c).invoke(obj);
            case 16:
                return (io.reactivex.rxjava3.core.t) ((v74) this.c).invoke(obj);
            case 18:
                return (bwq0) ((udk0) this.c).invoke(obj);
            case 19:
                return (io.reactivex.rxjava3.core.t) ((u2k0) this.c).invoke(obj);
            case 20:
                return (List) ((udk0) this.c).invoke(obj);
            case 21:
                return (io.reactivex.rxjava3.core.t) ((u2k0) this.c).invoke(obj);
            case 22:
                return (io.reactivex.rxjava3.core.t) ((ocu0) this.c).invoke(obj);
            case 23:
                return (byte[]) ((udk0) this.c).invoke(obj);
        }
    }

    @Override // xsna.exy0.a
    public void b() {
        mbz0 mbz0Var = (mbz0) this.c;
        mbz0Var.c.e(mbz0Var.d);
    }

    @Override // io.reactivex.rxjava3.functions.g
    public Object d(Object obj, Object obj2, Object obj3) {
        return (cps) ((ua30) this.c).invoke(obj, obj2, obj3);
    }

    @Override // yads.ng1
    public void invoke(Object obj) {
        ((yads.nf2) obj).a(((yads.df2) this.c).f);
    }

    @Override // io.reactivex.rxjava3.core.a0
    public void subscribe(io.reactivex.rxjava3.core.y yVar) {
        try {
            yVar.onSuccess(((gzs) this.c).invoke());
        } catch (Exception e) {
            yVar.b(e);
        }
    }

    @Override // io.reactivex.rxjava3.functions.m
    public boolean test(Object obj) {
        switch (this.b) {
            case 0:
                return ((Boolean) ((v74) this.c).invoke(obj)).booleanValue();
            default:
                return ((Boolean) ((dso0) this.c).invoke(obj)).booleanValue();
        }
    }
}

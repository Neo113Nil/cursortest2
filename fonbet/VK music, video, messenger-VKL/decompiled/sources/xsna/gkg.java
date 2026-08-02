package xsna;

import com.vk.dto.common.id.UserId;
import com.vk.dto.shortvideo.ClipGridParams;
import java.util.Collections;
import java.util.List;
import kotlin.collections.EmptyList;
import xsna.r1r0;
import xsna.wfu;
import xsna.wqu;

/* compiled from: CommonHeader.kt */
/* loaded from: classes17.dex */
public final class gkg extends bkg {
    public final gxe c;
    public final hld d;

    public gkg(gxe gxeVar, hld hldVar, wee weeVar, ClipGridParams clipGridParams) {
        super(clipGridParams, weeVar);
        this.c = gxeVar;
        this.d = hldVar;
    }

    @Override // xsna.wfu
    public final void a(wfu.a aVar, List<ClipGridParams.Data.Profile> list) {
        boolean z = aVar instanceof wfu.a.C3931a;
        wee weeVar = this.a;
        if (z) {
            wfu.a.C3931a c3931a = (wfu.a.C3931a) aVar;
            fde fdeVar = c3931a.a;
            if (fdeVar.a != null) {
                ild ildVar = c3931a.b;
                weeVar.n4(fdeVar, ildVar, c3931a.c);
                ClipGridParams.Data data = fdeVar.a;
                if (data == null) {
                    return;
                }
                weeVar.qk(data, ildVar);
                return;
            }
        }
        weeVar.jm(null);
    }

    @Override // xsna.wfu
    public final io.reactivex.rxjava3.core.x<wfu.a> b() {
        io.reactivex.rxjava3.internal.operators.single.y l;
        ClipGridParams clipGridParams = this.b;
        ClipGridParams.Data.Music music = clipGridParams instanceof ClipGridParams.Data.Music ? (ClipGridParams.Data.Music) clipGridParams : null;
        ClipGridParams.OnlyId zb = (music == null || !music.b.l) ? clipGridParams.zb() : new ClipGridParams.OnlyId.Audio(music.f);
        if (zb instanceof ClipGridParams.OnlyId.Profile) {
            gxe gxeVar = this.c;
            gxeVar.getClass();
            UserId userId = ((ClipGridParams.OnlyId.Profile) zb).b;
            if (fkq0.d(userId)) {
                dz2 x = yfb.x(r1r0.a.b(gxeVar.b, Collections.singletonList(userId), gxe.d, null, null, 58));
                ahn.D(x);
                l = rsg0.w0(x).l(new kf3(new mo1(15), 10)).l(new pi0(new ow4(gxeVar, 2), 14));
            } else {
                dz2 x2 = yfb.x(wqu.a.b(gxeVar.c, Collections.singletonList(fkq0.a(userId)), gxe.e, null, 4));
                ahn.D(x2);
                l = rsg0.w0(x2).l(new nb(new k60(16), 10)).l(new gv(new s8(gxeVar, 6), 12));
            }
            return l.l(new l8(new j60(11), 16));
        }
        hld hldVar = this.d;
        ClipGridParams clipGridParams2 = this.b;
        ngj0 ngj0Var = hldVar.b.a;
        boolean z = zb instanceof ClipGridParams.OnlyId.Hashtag;
        ClipGridParams.OnlyId.Hashtag hashtag = z ? (ClipGridParams.OnlyId.Hashtag) zb : null;
        String str = hashtag != null ? hashtag.b : null;
        boolean z2 = zb instanceof ClipGridParams.OnlyId.Audio;
        ClipGridParams.OnlyId.Audio audio = z2 ? (ClipGridParams.OnlyId.Audio) zb : null;
        String str2 = audio != null ? audio.b : null;
        boolean z3 = zb instanceof ClipGridParams.OnlyId.CameraMask;
        ClipGridParams.OnlyId.CameraMask cameraMask = z3 ? (ClipGridParams.OnlyId.CameraMask) zb : null;
        String str3 = cameraMask != null ? cameraMask.b : null;
        boolean z4 = zb instanceof ClipGridParams.OnlyId.ClipCompilation;
        ClipGridParams.OnlyId.ClipCompilation clipCompilation = z4 ? (ClipGridParams.OnlyId.ClipCompilation) zb : null;
        Integer valueOf = clipCompilation != null ? Integer.valueOf(clipCompilation.b) : null;
        boolean z5 = zb instanceof ClipGridParams.OnlyId.GeoPlace;
        ClipGridParams.OnlyId.GeoPlace geoPlace = z5 ? (ClipGridParams.OnlyId.GeoPlace) zb : null;
        dz2 x3 = yfb.x(ngj0Var.C(str, str2, str3, valueOf, geoPlace != null ? Integer.valueOf(geoPlace.b) : null, j5g.u0(z2 ? Collections.singletonList("audio") : z3 ? Collections.singletonList("mask") : z4 ? e43.l("compilation", "verified", "is_clips_notifications_ignored", "member_status") : z5 ? Collections.singletonList("place") : z ? Collections.singletonList("verified,member_status") : EmptyList.b, jld.b)));
        x3.d = true;
        return new io.reactivex.rxjava3.internal.operators.single.r(rsg0.w0(x3), new o7(new com.vk.im.engine.commands.messages.a(10, hldVar, clipGridParams2), 10));
    }
}

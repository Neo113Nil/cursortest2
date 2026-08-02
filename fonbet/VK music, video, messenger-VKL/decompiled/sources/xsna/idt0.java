package xsna;

import android.content.Context;
import com.vk.core.preference.Preference;
import com.vk.dto.common.VideoFile;
import com.vk.dto.common.restrictions.RestrictionButton;
import com.vk.dto.common.restrictions.VideoRestriction;
import com.vk.log.L;
import com.vk.restriction.di.VideoRestrictionManagerComponentImpl;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;

/* compiled from: VideoRestrictionManagerImpl.kt */
/* loaded from: classes11.dex */
public final class idt0 implements hdt0, w8i {
    public final y0f b;
    public final VideoRestrictionManagerComponentImpl.b c;
    public final f5o d;
    public final LinkedHashMap e = new LinkedHashMap();
    public final LinkedHashSet f = new LinkedHashSet();
    public final LinkedHashSet g = new LinkedHashSet();
    public final bpn0 h = new bpn0(new fu2(this, 10));
    public final bpn0 i;

    public idt0(y0f y0fVar, VideoRestrictionManagerComponentImpl.b bVar, f5o f5oVar) {
        this.b = y0fVar;
        this.c = bVar;
        this.d = f5oVar;
        new bpn0(new vbp(this, 8));
        this.i = new bpn0(new nxv(this, 7));
    }

    @Override // xsna.hdt0
    public final void a(Context context, VideoFile videoFile, String str, k4 k4Var, ks2 ks2Var) {
        if (epx.f(str, VideoRestriction.SupportedAction.PLAY.i())) {
            d(videoFile);
            return;
        }
        if (epx.f(str, VideoRestriction.SupportedAction.LOGIN.i())) {
            ((b25) this.i.getValue()).getClass();
            return;
        }
        boolean f = epx.f(str, VideoRestriction.SupportedAction.DELETE.i());
        bpn0 bpn0Var = this.h;
        if (f) {
            ((cfs0) bpn0Var.getValue()).getClass();
            return;
        }
        if (epx.f(str, VideoRestriction.SupportedAction.SUBSCRIBE.i())) {
            cfs0 cfs0Var = (cfs0) bpn0Var.getValue();
            videoFile.P();
            cfs0Var.getClass();
        } else if (epx.f(str, VideoRestriction.SupportedAction.UPDATE.i())) {
            ((cfs0) bpn0Var.getValue()).getClass();
        }
    }

    @Override // xsna.hdt0
    public final void b(VideoFile videoFile) {
        if ((videoFile != null ? videoFile.O() : null) != null && this.g.remove(videoFile.r1())) {
            wjs0.a(ayr0.a);
        }
    }

    @Override // xsna.hdt0
    public final boolean c(VideoFile videoFile) {
        VideoRestriction O;
        VideoRestriction O2;
        if (videoFile == null || (O = videoFile.O()) == null) {
            return false;
        }
        int Cb = O.Cb();
        Integer valueOf = Integer.valueOf(Cb);
        LinkedHashMap linkedHashMap = this.e;
        Object obj = linkedHashMap.get(valueOf);
        if (obj == null) {
            obj = Long.valueOf(Preference.m(0L, "VideoRestrictionManager", "VideoRestrictionManager.disableRestrictionUntilTime" + Cb));
            linkedHashMap.put(valueOf, obj);
        }
        long longValue = ((Number) obj).longValue();
        if ((this.d.a() && (O2 = videoFile.O()) != null && e5o.b(O2)) || videoFile.x5()) {
            return false;
        }
        if (O.Bb()) {
            String r1 = videoFile.r1();
            if (videoFile.k0() || this.g.contains(r1)) {
                return false;
            }
            if (longValue != 0 && (longValue >= ((Number) this.c.invoke()).longValue() || this.f.contains(Integer.valueOf(Cb)))) {
                return false;
            }
        } else if (O.Bb()) {
            Boolean i = ((com.vk.libvideo.autoplay.b) this.b.invoke()).i(videoFile);
            if (!(i != null ? i.booleanValue() : true)) {
                return false;
            }
        }
        return true;
    }

    @Override // xsna.hdt0
    public final void d(VideoFile videoFile) {
        yg5 e;
        RestrictionButton zb;
        VideoRestriction O = videoFile.O();
        if (epx.f((O == null || (zb = O.zb()) == null) ? null : zb.zb(), VideoRestriction.SupportedAction.PLAY.i())) {
            this.g.add(videoFile.r1());
            e = ((com.vk.libvideo.autoplay.b) this.b.invoke()).e(videoFile, null);
            e.E();
            wjs0.a(ayr0.a);
            rsg0.y0(new ub1(videoFile.I0(), videoFile.o0()), null, null, 3).subscribe(new lw30(new lx60(18, this, e), 19), new qw40(new l3f(L.a, 10), 29));
        }
    }
}

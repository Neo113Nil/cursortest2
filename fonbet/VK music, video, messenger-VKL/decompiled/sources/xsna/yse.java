package xsna;

import com.vk.api.generated.shortVideo.dto.ShortVideoAddPlaylistTypeDto;
import com.vk.dto.common.id.UserId;
import kotlin.NoWhenBranchMatchedException;
import xsna.a7f0;
import xsna.ate;
import xsna.gte;
import xsna.jse;
import xsna.xse;

/* compiled from: ClipsPlaylistsFolderNamingFeature.kt */
/* loaded from: classes16.dex */
public final class yse extends wk50<ite, gte, jse, ate> {
    public final String f;
    public final UserId g;
    public final kue h;
    public final int i;
    public final hqe j;
    public final f4z<xse> k;

    public yse(String str, UserId userId, kue kueVar, int i, hqe hqeVar) {
        super(new jse.a(str == null ? "" : str), new fte());
        this.f = str;
        this.g = userId;
        this.h = kueVar;
        this.i = i;
        this.j = hqeVar;
        this.k = new f4z<>();
    }

    @Override // xsna.wk50
    public final void N(gte gteVar, jse jseVar) {
        gte gteVar2 = gteVar;
        jse jseVar2 = jseVar;
        if (jseVar2.equals(jse.b.b)) {
            String str = this.f;
            if (str == null) {
                str = "";
            }
            C(new jse.d(new tho0(str, 0L, 6)));
            return;
        }
        if (jseVar2 instanceof jse.a) {
            String str2 = ((jse.a) jseVar2).b;
            int length = str2.length();
            T(new ate.b(new tho0(str2, jgz.c(length, length), 4)));
            return;
        }
        if (jseVar2 instanceof jse.d) {
            T(new ate.b(((jse.d) jseVar2).b));
            return;
        }
        if (jseVar2 instanceof jse.c) {
            T(ate.a.b);
            return;
        }
        if (jseVar2.equals(jse.e.b)) {
            T(ete.b);
            if (gteVar2 instanceof gte.a) {
                UserId userId = this.g;
                kue kueVar = this.h;
                int i = this.i;
                if (i > 0) {
                    a7f0.a.f(this, rsg0.W(yfb.x(kueVar.b.B(i, userId, ((gte.a) gteVar2).b.a.c)), 7), new uf1(15, this, gteVar2), new com.vk.im.ui.components.viewcontrollers.dialog_header.info.a(this, 25), 1);
                    return;
                } else {
                    a7f0.a.f(this, rsg0.W(yfb.x(kueVar.b.x(userId, ShortVideoAddPlaylistTypeDto.AUTHORS, ((gte.a) gteVar2).b.a.c)), 7), new oce(this, 1), new fre(this, 1), 1);
                    return;
                }
            }
            return;
        }
        if (!(jseVar2 instanceof jse.f)) {
            throw new NoWhenBranchMatchedException();
        }
        if (!(gteVar2 instanceof gte.a)) {
            fp.d("SpinnerFinished should be called only from Content state");
            return;
        }
        gte.a.InterfaceC2955a interfaceC2955a = ((gte.a) gteVar2).d;
        if (epx.f(interfaceC2955a, gte.a.InterfaceC2955a.d.a) || epx.f(interfaceC2955a, gte.a.InterfaceC2955a.c.a)) {
            return;
        }
        if (epx.f(interfaceC2955a, gte.a.InterfaceC2955a.b.a)) {
            T(dte.b);
        } else {
            if (!(interfaceC2955a instanceof gte.a.InterfaceC2955a.C2956a)) {
                throw new NoWhenBranchMatchedException();
            }
            this.k.b(new xse.a(((gte.a.InterfaceC2955a.C2956a) interfaceC2955a).a));
        }
    }
}

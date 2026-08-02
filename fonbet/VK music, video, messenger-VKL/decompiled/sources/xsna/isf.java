package xsna;

import com.vk.clips.viewer.impl.feed.wrapper.domain.model.ClipsWrapperHeaderMode;
import xsna.vpf;
import xsna.wtf;

/* compiled from: ClipsWrapperMviState.kt */
/* loaded from: classes17.dex */
public final class isf implements km50 {
    public final zrf b;
    public final lsf c;
    public final ntf d;
    public final upf e;
    public final euf f;
    public final kuf g;
    public final rsf h;
    public final usf i;
    public final wtf j;
    public final hsf k;
    public final vpf l;

    public isf() {
        this(0);
    }

    public static isf a(isf isfVar, zrf zrfVar, lsf lsfVar, ntf ntfVar, upf upfVar, euf eufVar, kuf kufVar, rsf rsfVar, usf usfVar, wtf wtfVar, hsf hsfVar, vpf vpfVar, int i) {
        if ((i & 1) != 0) {
            zrfVar = isfVar.b;
        }
        zrf zrfVar2 = zrfVar;
        if ((i & 2) != 0) {
            lsfVar = isfVar.c;
        }
        lsf lsfVar2 = lsfVar;
        if ((i & 4) != 0) {
            ntfVar = isfVar.d;
        }
        ntf ntfVar2 = ntfVar;
        upf upfVar2 = (i & 8) != 0 ? isfVar.e : upfVar;
        euf eufVar2 = (i & 16) != 0 ? isfVar.f : eufVar;
        kuf kufVar2 = (i & 32) != 0 ? isfVar.g : kufVar;
        rsf rsfVar2 = (i & 64) != 0 ? isfVar.h : rsfVar;
        usf usfVar2 = (i & 128) != 0 ? isfVar.i : usfVar;
        wtf wtfVar2 = (i & 256) != 0 ? isfVar.j : wtfVar;
        hsf hsfVar2 = (i & 512) != 0 ? isfVar.k : hsfVar;
        vpf vpfVar2 = (i & 1024) != 0 ? isfVar.l : vpfVar;
        isfVar.getClass();
        return new isf(zrfVar2, lsfVar2, ntfVar2, upfVar2, eufVar2, kufVar2, rsfVar2, usfVar2, wtfVar2, hsfVar2, vpfVar2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof isf)) {
            return false;
        }
        isf isfVar = (isf) obj;
        return epx.f(this.b, isfVar.b) && epx.f(this.c, isfVar.c) && epx.f(this.d, isfVar.d) && epx.f(this.e, isfVar.e) && epx.f(this.f, isfVar.f) && epx.f(this.g, isfVar.g) && epx.f(this.h, isfVar.h) && epx.f(this.i, isfVar.i) && epx.f(this.j, isfVar.j) && epx.f(this.k, isfVar.k) && epx.f(this.l, isfVar.l);
    }

    public final int hashCode() {
        return this.l.hashCode() + ((this.k.hashCode() + ((this.j.hashCode() + ((this.i.hashCode() + ((this.h.hashCode() + ((this.g.hashCode() + ((this.f.hashCode() + ((this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + (this.b.hashCode() * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "ClipsWrapperMviState(itemsState=" + this.b + ", navigationButtonState=" + this.c + ", searchButtonState=" + this.d + ", createButtonState=" + this.e + ", titleState=" + this.f + ", tooltipsState=" + this.g + ", onboardingState=" + this.h + ", openActionState=" + this.i + ", statisticsState=" + this.j + ", moreButtonMviState=" + this.k + ", decorationState=" + this.l + ')';
    }

    public isf(zrf zrfVar, lsf lsfVar, ntf ntfVar, upf upfVar, euf eufVar, kuf kufVar, rsf rsfVar, usf usfVar, wtf wtfVar, hsf hsfVar, vpf vpfVar) {
        this.b = zrfVar;
        this.c = lsfVar;
        this.d = ntfVar;
        this.e = upfVar;
        this.f = eufVar;
        this.g = kufVar;
        this.h = rsfVar;
        this.i = usfVar;
        this.j = wtfVar;
        this.k = hsfVar;
        this.l = vpfVar;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public isf(int i) {
        this(r1, new lsf(r15), new ntf(r15), new upf(r15), new euf(oq.d(tlo0.Companion, ""), null, true, true, r1, ClipsWrapperHeaderMode.NONE, 1.0f, false, null, false), new kuf(null), new rsf(null), new usf(null), wtf.d.i, new hsf(r15), new vpf.a(true, null));
        int i2 = 0;
        zrf zrfVar = new zrf(0);
    }
}

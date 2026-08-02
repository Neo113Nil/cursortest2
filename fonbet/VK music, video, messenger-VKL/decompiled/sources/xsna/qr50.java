package xsna;

import com.vk.dto.newsfeed.entries.MyTargetNativeAdEntry;

/* compiled from: MyTargetInternalNativeAdVideoUiDto.kt */
/* loaded from: classes4.dex */
public final class qr50 extends ol60 {
    public final gjx h;
    public final MyTargetNativeAdEntry i;
    public final jq6 j;
    public final float k;
    public final int l;

    public qr50(gjx gjxVar, MyTargetNativeAdEntry myTargetNativeAdEntry, jq6 jq6Var, float f, int i) {
        super(i, 0, 0, 0, null);
        this.h = gjxVar;
        this.i = myTargetNativeAdEntry;
        this.j = jq6Var;
        this.k = f;
        this.l = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qr50)) {
            return false;
        }
        qr50 qr50Var = (qr50) obj;
        qr50Var.getClass();
        return epx.f(this.h, qr50Var.h) && epx.f(this.i, qr50Var.i) && epx.f(this.j, qr50Var.j) && Float.compare(this.k, qr50Var.k) == 0 && this.l == qr50Var.l;
    }

    @Override // xsna.ol60
    public final int f() {
        return 0;
    }

    public final int hashCode() {
        return Integer.hashCode(this.l) + io.reactivex.rxjava3.subjects.b.a(this.k, (this.j.hashCode() + ((this.i.hashCode() + ((this.h.hashCode() + (Integer.hashCode(0) * 31)) * 31)) * 31)) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MyTargetInternalNativeAdVideoUiDto(seqId=0, internalNativeBanner=");
        sb.append(this.h);
        sb.append(", rawEntry=");
        sb.append(this.i);
        sb.append(", baseVideoAutoplayHolderUiDto=");
        sb.append(this.j);
        sb.append(", aspectRatio=");
        sb.append(this.k);
        sb.append(", videoViewType=");
        return vu5.b(sb, this.l, ')');
    }
}

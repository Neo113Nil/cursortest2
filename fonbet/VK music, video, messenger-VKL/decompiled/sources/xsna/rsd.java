package xsna;

import com.vk.clips.sdk.drafts.models.video.filter.ClipsDraftFilterType;

/* compiled from: ClipsDraftFilter.kt */
/* loaded from: classes17.dex */
public final class rsd {
    public final ClipsDraftFilterType a;
    public final float b;
    public final ssd c;
    public final tsd d;

    public rsd() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rsd)) {
            return false;
        }
        rsd rsdVar = (rsd) obj;
        return this.a == rsdVar.a && Float.compare(this.b, rsdVar.b) == 0 && epx.f(this.c, rsdVar.c) && epx.f(this.d, rsdVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + io.reactivex.rxjava3.subjects.b.a(this.b, this.a.hashCode() * 31, 31)) * 31);
    }

    public final String toString() {
        return "ClipsDraftFilter(filter=" + this.a + ", filterIntensity=" + this.b + ", corrections=" + this.c + ", hsl=" + this.d + ')';
    }

    public rsd(ClipsDraftFilterType clipsDraftFilterType, float f, ssd ssdVar, tsd tsdVar) {
        this.a = clipsDraftFilterType;
        this.b = f;
        this.c = ssdVar;
        this.d = tsdVar;
    }

    public /* synthetic */ rsd(int i) {
        this(ClipsDraftFilterType.NONE, 1.0f, new ssd(0), new tsd(0));
    }
}

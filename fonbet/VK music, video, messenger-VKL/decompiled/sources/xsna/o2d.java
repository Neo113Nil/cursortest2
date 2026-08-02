package xsna;

import com.vk.clips.sdk.shared.item.clip.ClipItemPatch;

/* compiled from: ClipItemPatch.kt */
/* loaded from: classes17.dex */
public final class o2d implements ClipItemPatch {
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;

    public o2d(String str, String str2, String str3, String str4, String str5) {
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = str5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o2d)) {
            return false;
        }
        o2d o2dVar = (o2d) obj;
        return epx.f(this.b, o2dVar.b) && epx.f(this.c, o2dVar.c) && epx.f(this.d, o2dVar.d) && epx.f(this.e, o2dVar.e) && epx.f(this.f, o2dVar.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + urd0.a(urd0.a(urd0.a(this.b.hashCode() * 31, 31, this.c), 31, this.d), 31, this.e);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DataLoaded(image=");
        sb.append(this.b);
        sb.append(", label=");
        sb.append(this.c);
        sb.append(", age=");
        sb.append(this.d);
        sb.append(", title=");
        sb.append(this.e);
        sb.append(", buttonText=");
        return ho8.a(sb, this.f, ')');
    }
}

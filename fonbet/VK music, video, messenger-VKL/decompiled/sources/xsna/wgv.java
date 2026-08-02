package xsna;

import com.vk.dto.clips.filters.HslInfo;
import com.vk.editor.filters.correction.entity.HslColorType;

/* compiled from: HslItem.kt */
/* loaded from: classes18.dex */
public final class wgv {
    public final HslColorType a;
    public final int b;
    public float c;
    public float d;
    public float e;
    public boolean f;

    /* compiled from: HslItem.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[HslColorType.values().length];
            try {
                iArr[HslColorType.Red.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[HslColorType.Orange.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[HslColorType.Yellow.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[HslColorType.Green.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[HslColorType.Cyan.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[HslColorType.Blue.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[HslColorType.Purple.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[HslColorType.Magenta.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public wgv(HslColorType hslColorType, int i, float f, float f2, float f3, boolean z) {
        this.a = hslColorType;
        this.b = i;
        this.c = f;
        this.d = f2;
        this.e = f3;
        this.f = z;
    }

    public final HslInfo.Params a() {
        return new HslInfo.Params(this.c, this.d, this.e);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wgv)) {
            return false;
        }
        wgv wgvVar = (wgv) obj;
        return this.a == wgvVar.a && this.b == wgvVar.b && Float.compare(this.c, wgvVar.c) == 0 && Float.compare(this.d, wgvVar.d) == 0 && Float.compare(this.e, wgvVar.e) == 0 && this.f == wgvVar.f;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f) + io.reactivex.rxjava3.subjects.b.a(this.e, io.reactivex.rxjava3.subjects.b.a(this.d, io.reactivex.rxjava3.subjects.b.a(this.c, shy.a(this.b, this.a.hashCode() * 31, 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("HslItem(type=");
        sb.append(this.a);
        sb.append(", color=");
        sb.append(this.b);
        sb.append(", hue=");
        sb.append(this.c);
        sb.append(", saturation=");
        sb.append(this.d);
        sb.append(", brightness=");
        sb.append(this.e);
        sb.append(", isSelected=");
        return defpackage.q0.a(sb, this.f, ')');
    }
}

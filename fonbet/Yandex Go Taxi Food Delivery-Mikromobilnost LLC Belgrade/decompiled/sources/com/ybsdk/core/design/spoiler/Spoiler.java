package com.ybsdk.core.design.spoiler;

import com.ybsdk.core.utils.ColorModel;
import defpackage.jl40;
import defpackage.k4o;
import defpackage.ovt0;
import defpackage.ung0;
import defpackage.vfc;
import defpackage.vvb1;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes2.dex */
public final class Spoiler {
    public static final ColorModel.Attr e = new ColorModel.Attr(ung0.ybColor_fill_default_300);
    public final boolean a;
    public final a b;
    public final ColorModel c;
    public final SpoilerEnable d;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lcom/ybsdk/core/design/spoiler/Spoiler$Gravity;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "START", "CENTER", "END", "core-design_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Gravity {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ Gravity[] $VALUES;
        private final int value;
        public static final Gravity START = new Gravity("START", 0, 0);
        public static final Gravity CENTER = new Gravity("CENTER", 1, 1);
        public static final Gravity END = new Gravity("END", 2, 2);

        private static final /* synthetic */ Gravity[] $values() {
            return new Gravity[]{START, CENTER, END};
        }

        static {
            Gravity[] $values = $values();
            $VALUES = $values;
            $ENTRIES = kotlin.enums.a.a($values);
        }

        private Gravity(String str, int i, int i2) {
            this.value = i2;
        }

        public static k4o getEntries() {
            return $ENTRIES;
        }

        public static Gravity valueOf(String str) {
            return (Gravity) Enum.valueOf(Gravity.class, str);
        }

        public static Gravity[] values() {
            return (Gravity[]) $VALUES.clone();
        }

        public final int getValue() {
            return this.value;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/ybsdk/core/design/spoiler/Spoiler$SpoilerEnable;", "", "<init>", "(Ljava/lang/String;I)V", "DISABLED", "ENABLED", "core-design_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class SpoilerEnable {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ SpoilerEnable[] $VALUES;
        public static final SpoilerEnable DISABLED = new SpoilerEnable("DISABLED", 0);
        public static final SpoilerEnable ENABLED = new SpoilerEnable("ENABLED", 1);

        private static final /* synthetic */ SpoilerEnable[] $values() {
            return new SpoilerEnable[]{DISABLED, ENABLED};
        }

        static {
            SpoilerEnable[] $values = $values();
            $VALUES = $values;
            $ENTRIES = kotlin.enums.a.a($values);
        }

        private SpoilerEnable(String str, int i) {
        }

        public static k4o getEntries() {
            return $ENTRIES;
        }

        public static SpoilerEnable valueOf(String str) {
            return (SpoilerEnable) Enum.valueOf(SpoilerEnable.class, str);
        }

        public static SpoilerEnable[] values() {
            return (SpoilerEnable[]) $VALUES.clone();
        }
    }

    public /* synthetic */ Spoiler(a aVar, ColorModel colorModel, int i) {
        this(false, (i & 2) != 0 ? new a(0) : aVar, (i & 4) != 0 ? e : colorModel, SpoilerEnable.ENABLED);
    }

    public static Spoiler a(Spoiler spoiler, boolean z, a aVar, ColorModel colorModel, SpoilerEnable spoilerEnable, int i) {
        if ((i & 1) != 0) {
            z = spoiler.a;
        }
        if ((i & 2) != 0) {
            aVar = spoiler.b;
        }
        if ((i & 4) != 0) {
            colorModel = spoiler.c;
        }
        if ((i & 8) != 0) {
            spoilerEnable = spoiler.d;
        }
        spoiler.getClass();
        return new Spoiler(z, aVar, colorModel, spoilerEnable);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Spoiler)) {
            return false;
        }
        Spoiler spoiler = (Spoiler) obj;
        return this.a == spoiler.a && jl40.l(this.b, spoiler.b) && jl40.l(this.c, spoiler.c) && this.d == spoiler.d;
    }

    public final int hashCode() {
        return this.d.hashCode() + vfc.d(this.c, (this.b.hashCode() + (Boolean.hashCode(this.a) * 31)) * 31, 31);
    }

    public final String toString() {
        return "Spoiler(shown=" + this.a + ", size=" + this.b + ", color=" + this.c + ", isSpoilerEnabled=" + this.d + Extension.C_BRAKE;
    }

    public static final class a {
        public final ovt0 a;
        public final ovt0 b;

        public a(ovt0 ovt0Var, ovt0 ovt0Var2) {
            this.a = ovt0Var;
            this.b = ovt0Var2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return jl40.l(this.a, aVar.a) && jl40.l(this.b, aVar.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "Size(width=" + this.a + ", height=" + this.b + Extension.C_BRAKE;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public /* synthetic */ a(int i) {
            this(r1, r1);
            vvb1 vvb1Var = vvb1.Q;
        }

        public a() {
            this(0);
        }
    }

    public Spoiler(boolean z, a aVar, ColorModel colorModel, SpoilerEnable spoilerEnable) {
        this.a = z;
        this.b = aVar;
        this.c = colorModel;
        this.d = spoilerEnable;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Spoiler() {
        this(null, 0 == true ? 1 : 0, 15);
    }
}

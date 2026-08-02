package com.airbnb.lottie.model;

import android.graphics.PointF;
import defpackage.unr0;

/* loaded from: classes10.dex */
public class DocumentData {
    public String a;
    public String b;
    public float c;
    public Justification d;
    public int e;
    public float f;
    public float g;
    public int h;
    public int i;
    public float j;
    public boolean k;
    public PointF l;
    public PointF m;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class Justification {
        private static final /* synthetic */ Justification[] $VALUES;
        public static final Justification CENTER;
        public static final Justification LEFT_ALIGN;
        public static final Justification RIGHT_ALIGN;

        static {
            Justification justification = new Justification("LEFT_ALIGN", 0);
            LEFT_ALIGN = justification;
            Justification justification2 = new Justification("RIGHT_ALIGN", 1);
            RIGHT_ALIGN = justification2;
            Justification justification3 = new Justification("CENTER", 2);
            CENTER = justification3;
            $VALUES = new Justification[]{justification, justification2, justification3};
        }

        public static Justification valueOf(String str) {
            return (Justification) Enum.valueOf(Justification.class, str);
        }

        public static Justification[] values() {
            return (Justification[]) $VALUES.clone();
        }
    }

    public final int hashCode() {
        int ordinal = ((this.d.ordinal() + (((int) (unr0.b(this.a.hashCode() * 31, 31, this.b) + this.c)) * 31)) * 31) + this.e;
        long floatToRawIntBits = Float.floatToRawIntBits(this.f);
        return (((ordinal * 31) + ((int) (floatToRawIntBits ^ (floatToRawIntBits >>> 32)))) * 31) + this.h;
    }
}

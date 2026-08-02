package yads;

import android.graphics.Color;

/* loaded from: classes10.dex */
public final class j43 {
    public final String a;
    public final int b;
    public final Integer c;
    public final Integer d;
    public final float e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final boolean i;
    public final int j;

    public j43(String str, int i, Integer num, Integer num2, float f, boolean z, boolean z2, boolean z3, boolean z4, int i2) {
        this.a = str;
        this.b = i;
        this.c = num;
        this.d = num2;
        this.e = f;
        this.f = z;
        this.g = z2;
        this.h = z3;
        this.i = z4;
        this.j = i2;
    }

    public static boolean a(String str) {
        try {
            int parseInt = Integer.parseInt(str);
            return parseInt == 1 || parseInt == -1;
        } catch (NumberFormatException e) {
            ji1.d("SsaStyle", ji1.a("Failed to parse boolean value: '" + str + "'", e));
            return false;
        }
    }

    public static Integer b(String str) {
        try {
            long parseLong = str.startsWith("&H") ? Long.parseLong(str.substring(2), 16) : Long.parseLong(str);
            if (parseLong > 4294967295L) {
                throw new IllegalArgumentException();
            }
            return Integer.valueOf(Color.argb(wd1.a(((parseLong >> 24) & 255) ^ 255), wd1.a(parseLong & 255), wd1.a((parseLong >> 8) & 255), wd1.a((parseLong >> 16) & 255)));
        } catch (IllegalArgumentException e) {
            ji1.d("SsaStyle", ji1.a("Failed to parse color expression: '" + str + "'", e));
            return null;
        }
    }
}

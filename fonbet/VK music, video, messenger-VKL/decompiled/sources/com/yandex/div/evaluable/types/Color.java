package com.yandex.div.evaluable.types;

import com.vk.dto.common.ImageSizeKey;
import java.util.Locale;
import xsna.drm0;
import xsna.ro;
import xsna.vby;
import xsna.zcl;

/* compiled from: Color.kt */
@vby
/* loaded from: classes7.dex */
public final class Color {
    public static final Companion Companion = new Companion(null);
    private final int value;

    /* compiled from: Color.kt */
    public static final class Companion {
        public /* synthetic */ Companion(zcl zclVar) {
            this();
        }

        /* renamed from: argb-H0kstlE, reason: not valid java name */
        public final int m193argbH0kstlE(int i, int i2, int i3, int i4) {
            return Color.m185constructorimpl((i << 24) | (i2 << 16) | (i3 << 8) | i4);
        }

        /* renamed from: parse-C4zCDoM, reason: not valid java name */
        public final int m194parseC4zCDoM(String str) throws IllegalArgumentException, NumberFormatException {
            String str2;
            if (str.length() <= 0) {
                throw new IllegalArgumentException("Expected color string, actual string is empty");
            }
            if (str.charAt(0) != '#') {
                throw new IllegalArgumentException("Unknown color ".concat(str).toString());
            }
            int length = str.length();
            if (length == 4) {
                char charAt = str.charAt(1);
                char charAt2 = str.charAt(2);
                char charAt3 = str.charAt(3);
                str2 = new String(new char[]{'f', 'f', charAt, charAt, charAt2, charAt2, charAt3, charAt3});
            } else if (length == 5) {
                char charAt4 = str.charAt(1);
                char charAt5 = str.charAt(2);
                char charAt6 = str.charAt(3);
                char charAt7 = str.charAt(4);
                str2 = new String(new char[]{charAt4, charAt4, charAt5, charAt5, charAt6, charAt6, charAt7, charAt7});
            } else if (length == 7) {
                str2 = "ff".concat(str.substring(1));
            } else {
                if (length != 9) {
                    throw new IllegalArgumentException("Unknown color ".concat(str));
                }
                str2 = str.substring(1);
            }
            ro.d(16);
            return Color.m185constructorimpl((int) Long.parseLong(str2, 16));
        }

        private Companion() {
        }
    }

    private /* synthetic */ Color(int i) {
        this.value = i;
    }

    /* renamed from: alpha-impl, reason: not valid java name */
    public static final int m182alphaimpl(int i) {
        return i >>> 24;
    }

    /* renamed from: blue-impl, reason: not valid java name */
    public static final int m183blueimpl(int i) {
        return i & 255;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ Color m184boximpl(int i) {
        return new Color(i);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m186equalsimpl(int i, Object obj) {
        return (obj instanceof Color) && i == ((Color) obj).m192unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m187equalsimpl0(int i, int i2) {
        return i == i2;
    }

    /* renamed from: green-impl, reason: not valid java name */
    public static final int m188greenimpl(int i) {
        return (i >> 8) & 255;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m189hashCodeimpl(int i) {
        return Integer.hashCode(i);
    }

    /* renamed from: red-impl, reason: not valid java name */
    public static final int m190redimpl(int i) {
        return (i >> 16) & 255;
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m191toStringimpl(int i) {
        return "#".concat(drm0.R(Integer.toHexString(i), 8, ImageSizeKey.SIZE_KEY_UNDEFINED).toUpperCase(Locale.ROOT));
    }

    public boolean equals(Object obj) {
        return m186equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m189hashCodeimpl(this.value);
    }

    public String toString() {
        return m191toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m192unboximpl() {
        return this.value;
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static int m185constructorimpl(int i) {
        return i;
    }
}

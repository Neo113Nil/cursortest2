package com.caverock.androidsvg;

/* loaded from: classes10.dex */
public abstract /* synthetic */ class h {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[SVG$Unit.values().length];
        a = iArr;
        try {
            iArr[SVG$Unit.px.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            a[SVG$Unit.em.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            a[SVG$Unit.ex.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            a[SVG$Unit.in.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            a[SVG$Unit.cm.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            a[SVG$Unit.mm.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            a[SVG$Unit.pt.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            a[SVG$Unit.pc.ordinal()] = 8;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            a[SVG$Unit.percent.ordinal()] = 9;
        } catch (NoSuchFieldError unused9) {
        }
    }
}

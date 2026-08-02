package com.caverock.androidsvg;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes10.dex */
final class CSSParser$AttribOp {
    private static final /* synthetic */ CSSParser$AttribOp[] $VALUES;
    public static final CSSParser$AttribOp DASHMATCH;
    public static final CSSParser$AttribOp EQUALS;
    public static final CSSParser$AttribOp EXISTS;
    public static final CSSParser$AttribOp INCLUDES;

    static {
        CSSParser$AttribOp cSSParser$AttribOp = new CSSParser$AttribOp("EXISTS", 0);
        EXISTS = cSSParser$AttribOp;
        CSSParser$AttribOp cSSParser$AttribOp2 = new CSSParser$AttribOp("EQUALS", 1);
        EQUALS = cSSParser$AttribOp2;
        CSSParser$AttribOp cSSParser$AttribOp3 = new CSSParser$AttribOp("INCLUDES", 2);
        INCLUDES = cSSParser$AttribOp3;
        CSSParser$AttribOp cSSParser$AttribOp4 = new CSSParser$AttribOp("DASHMATCH", 3);
        DASHMATCH = cSSParser$AttribOp4;
        $VALUES = new CSSParser$AttribOp[]{cSSParser$AttribOp, cSSParser$AttribOp2, cSSParser$AttribOp3, cSSParser$AttribOp4};
    }

    public static CSSParser$AttribOp valueOf(String str) {
        return (CSSParser$AttribOp) Enum.valueOf(CSSParser$AttribOp.class, str);
    }

    public static CSSParser$AttribOp[] values() {
        return (CSSParser$AttribOp[]) $VALUES.clone();
    }
}

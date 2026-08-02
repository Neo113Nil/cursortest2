package com.google.gson;

import com.google.gson.internal.LazilyParsedNumber;
import com.google.gson.stream.MalformedJsonException;
import defpackage.sjz0;
import defpackage.unr0;
import defpackage.vtb1;
import defpackage.wdx;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes11.dex */
public abstract class ToNumberPolicy implements sjz0 {
    private static final /* synthetic */ ToNumberPolicy[] $VALUES;
    public static final ToNumberPolicy BIG_DECIMAL;
    public static final ToNumberPolicy DOUBLE;
    public static final ToNumberPolicy LAZILY_PARSED_NUMBER;
    public static final ToNumberPolicy LONG_OR_DOUBLE;

    static {
        ToNumberPolicy toNumberPolicy = new ToNumberPolicy() { // from class: com.google.gson.ToNumberPolicy.1
            @Override // defpackage.sjz0
            public final Number a(wdx wdxVar) {
                return Double.valueOf(wdxVar.nextDouble());
            }
        };
        DOUBLE = toNumberPolicy;
        ToNumberPolicy toNumberPolicy2 = new ToNumberPolicy() { // from class: com.google.gson.ToNumberPolicy.2
            @Override // defpackage.sjz0
            public final Number a(wdx wdxVar) {
                return new LazilyParsedNumber(wdxVar.nextString());
            }
        };
        LAZILY_PARSED_NUMBER = toNumberPolicy2;
        ToNumberPolicy toNumberPolicy3 = new ToNumberPolicy() { // from class: com.google.gson.ToNumberPolicy.3
            public static Double b(String str, wdx wdxVar) {
                try {
                    Double valueOf = Double.valueOf(str);
                    if (!valueOf.isInfinite()) {
                        if (valueOf.isNaN()) {
                        }
                        return valueOf;
                    }
                    if (!(wdxVar.b == Strictness.LENIENT)) {
                        throw new MalformedJsonException("JSON forbids NaN and infinities: " + valueOf + "; at path " + wdxVar.w());
                    }
                    return valueOf;
                } catch (NumberFormatException e) {
                    StringBuilder x = unr0.x("Cannot parse ", str, "; at path ");
                    x.append(wdxVar.w());
                    throw new JsonParseException(x.toString(), e);
                }
            }

            @Override // defpackage.sjz0
            public final Number a(wdx wdxVar) {
                String nextString = wdxVar.nextString();
                if (nextString.indexOf(46) >= 0) {
                    return b(nextString, wdxVar);
                }
                try {
                    return Long.valueOf(Long.parseLong(nextString));
                } catch (NumberFormatException unused) {
                    return b(nextString, wdxVar);
                }
            }
        };
        LONG_OR_DOUBLE = toNumberPolicy3;
        ToNumberPolicy toNumberPolicy4 = new ToNumberPolicy() { // from class: com.google.gson.ToNumberPolicy.4
            @Override // defpackage.sjz0
            public final Number a(wdx wdxVar) {
                String nextString = wdxVar.nextString();
                try {
                    return vtb1.d(nextString);
                } catch (NumberFormatException e) {
                    StringBuilder x = unr0.x("Cannot parse ", nextString, "; at path ");
                    x.append(wdxVar.w());
                    throw new JsonParseException(x.toString(), e);
                }
            }
        };
        BIG_DECIMAL = toNumberPolicy4;
        $VALUES = new ToNumberPolicy[]{toNumberPolicy, toNumberPolicy2, toNumberPolicy3, toNumberPolicy4};
    }

    public static ToNumberPolicy valueOf(String str) {
        return (ToNumberPolicy) Enum.valueOf(ToNumberPolicy.class, str);
    }

    public static ToNumberPolicy[] values() {
        return (ToNumberPolicy[]) $VALUES.clone();
    }
}

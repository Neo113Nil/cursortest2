package com.ybsdk.core.utils.text;

import com.ybsdk.core.utils.text.Text;
import defpackage.j73;

/* loaded from: classes8.dex */
public final class b {
    public static Text.Constant a(String str) {
        return new Text.Constant(str);
    }

    public static Text.Formatted b(int i, Text.Formatted.Arg... argArr) {
        return new Text.Formatted(i, j73.d0(argArr));
    }
}

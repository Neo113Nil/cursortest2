package com.ybsdk.core.design.animation.ticker;

import defpackage.evu0;
import defpackage.ny61;
import java.util.HashMap;

/* loaded from: classes2.dex */
public final class b {
    public final char[] a;
    public final int b;
    public final HashMap c;

    public b(String str) {
        int i = 0;
        if (evu0.y(str, "\u0000", false)) {
            ny61.g("You cannot include TickerUtils.EMPTY_CHAR in the character list.");
            throw null;
        }
        char[] charArray = str.toCharArray();
        int length = charArray.length;
        this.b = length;
        this.c = new HashMap(length);
        for (int i2 = 0; i2 < length; i2++) {
            this.c.put(Character.valueOf(charArray[i2]), Integer.valueOf(i2));
        }
        char[] cArr = new char[(length * 2) + 1];
        this.a = cArr;
        cArr[0] = 0;
        while (i < length) {
            char[] cArr2 = this.a;
            int i3 = i + 1;
            cArr2[i3] = charArray[i];
            cArr2[length + 1 + i] = charArray[i];
            i = i3;
        }
    }

    public final int a(char c) {
        if (c == 0) {
            return 0;
        }
        Character valueOf = Character.valueOf(c);
        HashMap hashMap = this.c;
        if (hashMap.containsKey(valueOf)) {
            return ((Number) hashMap.get(Character.valueOf(c))).intValue() + 1;
        }
        return -1;
    }
}

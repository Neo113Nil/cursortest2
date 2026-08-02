package com.yandex.passport.internal.flags;

import defpackage.bvu0;

/* loaded from: classes8.dex */
public final class b extends g {
    public final Enum[] c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(String str, Enum r3, Enum[] enumArr) {
        super(str, r3);
        Flag$Type flag$Type = Flag$Type.BOOLEAN;
        this.c = enumArr;
    }

    @Override // com.yandex.passport.internal.flags.g
    public final Object a(String str) {
        Integer l = bvu0.l(10, str);
        Object obj = this.b;
        if (l == null) {
            return (Enum) obj;
        }
        int intValue = l.intValue();
        if (intValue >= 0) {
            Enum[] enumArr = this.c;
            if (intValue < enumArr.length) {
                return enumArr[intValue];
            }
        }
        return (Enum) obj;
    }
}

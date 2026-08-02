package com.yandex.passport.internal.flags;

/* loaded from: classes8.dex */
public final class a extends g {
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public a(String str, boolean z) {
        super(str, r3);
        Boolean valueOf = Boolean.valueOf(z);
        Flag$Type flag$Type = Flag$Type.BOOLEAN;
    }

    @Override // com.yandex.passport.internal.flags.g
    public final Object a(String str) {
        return Boolean.valueOf(str.equals("0") ? false : str.equals("1") ? true : ((Boolean) this.b).booleanValue());
    }
}

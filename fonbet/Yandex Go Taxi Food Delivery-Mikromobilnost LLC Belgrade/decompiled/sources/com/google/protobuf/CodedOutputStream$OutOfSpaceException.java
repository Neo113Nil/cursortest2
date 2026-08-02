package com.google.protobuf;

import defpackage.unr0;
import java.io.IOException;
import java.util.Locale;

/* loaded from: classes11.dex */
public class CodedOutputStream$OutOfSpaceException extends IOException {
    private static final long serialVersionUID = -6947486886997889499L;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public CodedOutputStream$OutOfSpaceException(int i, int i2, int i3, IndexOutOfBoundsException indexOutOfBoundsException) {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.: ".concat(r0.toString()), indexOutOfBoundsException);
        Locale locale = Locale.US;
        StringBuilder w = unr0.w(i, "Pos: ", ", limit: ");
        w.append(i2);
        w.append(", len: ");
        w.append(i3);
    }

    public CodedOutputStream$OutOfSpaceException(IndexOutOfBoundsException indexOutOfBoundsException) {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.", indexOutOfBoundsException);
    }
}

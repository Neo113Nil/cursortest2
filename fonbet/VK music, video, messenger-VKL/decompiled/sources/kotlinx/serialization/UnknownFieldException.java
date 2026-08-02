package kotlinx.serialization;

import xsna.lhg;

/* compiled from: SerializationExceptions.kt */
/* loaded from: classes8.dex */
public final class UnknownFieldException extends SerializationException {
    public UnknownFieldException(int i) {
        super(lhg.a(i, "An unknown field for index "));
    }
}

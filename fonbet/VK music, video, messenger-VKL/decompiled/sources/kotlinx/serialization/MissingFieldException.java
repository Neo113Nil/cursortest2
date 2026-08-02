package kotlinx.serialization;

import java.util.List;

/* compiled from: SerializationExceptions.kt */
/* loaded from: classes8.dex */
public final class MissingFieldException extends SerializationException {
    private final List<String> missingFields;

    public MissingFieldException() {
        throw null;
    }

    public MissingFieldException(List list, String str, MissingFieldException missingFieldException) {
        super(str, missingFieldException);
        this.missingFields = list;
    }

    public final List<String> d() {
        return this.missingFields;
    }
}

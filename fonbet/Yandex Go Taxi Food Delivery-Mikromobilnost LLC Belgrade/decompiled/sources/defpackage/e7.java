package defpackage;

import kotlinx.datetime.DateTimeFormatException;
import kotlinx.datetime.internal.format.parser.ParseException;

/* loaded from: classes9.dex */
public abstract class e7 {
    public abstract od7 a();

    public abstract fpe b();

    public final Object c(CharSequence charSequence) {
        String str;
        try {
            try {
                return d(kp50.G(a().c, charSequence, b()));
            } catch (IllegalArgumentException e) {
                String message = e.getMessage();
                if (message == null) {
                    str = b64.h(charSequence, "The value parsed from '", "' is invalid");
                } else {
                    str = message + " (when parsing '" + ((Object) charSequence) + "')";
                }
                throw new DateTimeFormatException(str, e);
            }
        } catch (ParseException e2) {
            throw new DateTimeFormatException("Failed to parse value from '" + ((Object) charSequence) + '\'', e2);
        }
    }

    public abstract Object d(fpe fpeVar);
}

package defpackage;

import kotlin.a;
import kotlinx.datetime.DateTimeFormatException;

/* loaded from: classes9.dex */
public abstract class pb61 {
    public static final oqv a = new oqv(null, null);
    public static final i3y b = a.a(new z151(22));

    public static final void a(Object obj, String str) {
        if (obj == null) {
            throw new DateTimeFormatException(unr0.p("Can not create a ", str, " from the given input: the field ", str, " is missing"));
        }
    }
}

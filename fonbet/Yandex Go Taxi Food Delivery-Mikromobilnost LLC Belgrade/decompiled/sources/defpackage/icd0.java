package defpackage;

import com.yandex.plus.core.graphql.exception.GraphQLParseException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.Result;

/* loaded from: classes2.dex */
public final class icd0 {
    public final List a = Collections.singletonList(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.ENGLISH));

    public final Date a(String str) {
        Date date;
        Object failure;
        Iterator it = this.a.iterator();
        while (true) {
            if (!it.hasNext()) {
                date = null;
                break;
            }
            try {
                failure = ((DateFormat) it.next()).parse(str);
            } catch (Throwable th) {
                failure = new Result.Failure(th);
            }
            if (failure instanceof Result.Failure) {
                failure = null;
            }
            date = (Date) failure;
            if (date != null) {
                break;
            }
        }
        if (date != null) {
            return date;
        }
        throw new GraphQLParseException("Couldn't parse date: ".concat(str), null);
    }
}

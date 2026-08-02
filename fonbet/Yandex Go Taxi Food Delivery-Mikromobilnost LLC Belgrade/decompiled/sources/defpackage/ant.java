package defpackage;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.TimeZone;
import kotlin.a;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* loaded from: classes12.dex */
public final class ant implements KSerializer {
    public static final ant a = new ant();
    public static final i3y b = a.a(new sss(19));
    public static final o2f0 c = d6z.a("Date", h2f0.o);

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        Date parse;
        String p = decoder.p();
        i3y i3yVar = b;
        synchronized (((List) i3yVar.getValue())) {
            for (SimpleDateFormat simpleDateFormat : (List) i3yVar.getValue()) {
                TimeZone timeZone = simpleDateFormat.getTimeZone();
                try {
                    parse = simpleDateFormat.parse(p);
                } catch (ParseException unused) {
                } catch (Throwable th) {
                    simpleDateFormat.setTimeZone(timeZone);
                    throw th;
                }
                if (parse != null) {
                    simpleDateFormat.setTimeZone(timeZone);
                    return parse;
                }
                simpleDateFormat.setTimeZone(timeZone);
            }
            yci0.m(oyr.p("Fail to decode Date from \"", p, "\""));
            return null;
        }
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return c;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        String format;
        Date date = (Date) obj;
        i3y i3yVar = b;
        SimpleDateFormat simpleDateFormat = (SimpleDateFormat) kotlin.collections.a.P((List) i3yVar.getValue());
        synchronized (((List) i3yVar.getValue())) {
            format = simpleDateFormat.format(date);
        }
        encoder.t(format);
    }
}

package defpackage;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import kotlin.a;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* loaded from: classes14.dex */
public final class aob implements KSerializer {
    public static final aob a = new aob();
    public static final i3y b = a.a(new qlb(14));
    public static final o2f0 c = ant.c;

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        String p = decoder.p();
        Date c2 = ((drg) b.getValue()).c(p);
        if (c2 != null) {
            return c2;
        }
        yci0.m(oyr.p("Fail to decode until_time from \"", p, "\""));
        return null;
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return c;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        String format;
        Date date = (Date) obj;
        ant antVar = ant.a;
        i3y i3yVar = ant.b;
        SimpleDateFormat simpleDateFormat = (SimpleDateFormat) kotlin.collections.a.P((List) i3yVar.getValue());
        synchronized (((List) i3yVar.getValue())) {
            format = simpleDateFormat.format(date);
        }
        encoder.t(format);
    }
}

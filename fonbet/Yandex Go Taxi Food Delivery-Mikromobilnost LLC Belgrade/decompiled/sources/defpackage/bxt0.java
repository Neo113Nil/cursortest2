package defpackage;

import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonToken;
import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.TimeZone;

/* loaded from: classes11.dex */
public final class bxt0 extends nl11 {
    public static final a b = new a();
    public final SimpleDateFormat a;

    public class a implements ol11 {
        @Override // defpackage.ol11
        public final nl11 create(u3u u3uVar, TypeToken typeToken) {
            if (typeToken.getRawType() == Date.class) {
                return new bxt0(0);
            }
            return null;
        }
    }

    private bxt0() {
        this.a = new SimpleDateFormat("MMM d, yyyy");
    }

    @Override // defpackage.nl11
    public final Object read(wdx wdxVar) {
        Date date;
        if (wdxVar.R() == JsonToken.NULL) {
            wdxVar.B0();
            return null;
        }
        String nextString = wdxVar.nextString();
        synchronized (this) {
            TimeZone timeZone = this.a.getTimeZone();
            try {
                try {
                    date = new Date(this.a.parse(nextString).getTime());
                } catch (ParseException e) {
                    throw new JsonSyntaxException("Failed parsing '" + nextString + "' as SQL Date; at path " + wdxVar.w(), e);
                }
            } finally {
                this.a.setTimeZone(timeZone);
            }
        }
        return date;
    }

    @Override // defpackage.nl11
    public final void write(afx afxVar, Object obj) {
        String format;
        Date date = (Date) obj;
        if (date == null) {
            afxVar.w();
            return;
        }
        synchronized (this) {
            format = this.a.format((java.util.Date) date);
        }
        afxVar.W(format);
    }

    public /* synthetic */ bxt0(int i) {
        this();
    }
}

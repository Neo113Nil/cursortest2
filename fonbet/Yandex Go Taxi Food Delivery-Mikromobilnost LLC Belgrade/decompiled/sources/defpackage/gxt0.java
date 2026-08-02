package defpackage;

import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonToken;
import java.sql.Time;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

/* loaded from: classes11.dex */
public final class gxt0 extends nl11 {
    public static final a b = new a();
    public final SimpleDateFormat a;

    public class a implements ol11 {
        @Override // defpackage.ol11
        public final nl11 create(u3u u3uVar, TypeToken typeToken) {
            if (typeToken.getRawType() == Time.class) {
                return new gxt0(0);
            }
            return null;
        }
    }

    private gxt0() {
        this.a = new SimpleDateFormat("hh:mm:ss a");
    }

    @Override // defpackage.nl11
    public final Object read(wdx wdxVar) {
        Time time;
        if (wdxVar.R() == JsonToken.NULL) {
            wdxVar.B0();
            return null;
        }
        String nextString = wdxVar.nextString();
        synchronized (this) {
            TimeZone timeZone = this.a.getTimeZone();
            try {
                try {
                    time = new Time(this.a.parse(nextString).getTime());
                } catch (ParseException e) {
                    throw new JsonSyntaxException("Failed parsing '" + nextString + "' as SQL Time; at path " + wdxVar.w(), e);
                }
            } finally {
                this.a.setTimeZone(timeZone);
            }
        }
        return time;
    }

    @Override // defpackage.nl11
    public final void write(afx afxVar, Object obj) {
        String format;
        Time time = (Time) obj;
        if (time == null) {
            afxVar.w();
            return;
        }
        synchronized (this) {
            format = this.a.format((Date) time);
        }
        afxVar.W(format);
    }

    public /* synthetic */ gxt0(int i) {
        this();
    }
}

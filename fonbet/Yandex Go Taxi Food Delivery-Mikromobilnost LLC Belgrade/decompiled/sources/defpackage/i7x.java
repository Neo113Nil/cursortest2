package defpackage;

import com.google.gson.stream.JsonToken;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.OffsetDateTime;
import java.time.OffsetTime;
import java.time.ZoneOffset;
import ru.CryptoPro.JCSP.tools.common.window.ipc.RemoteBioParameters;
import ru.rt.ebs.cryptosdk.core.metadata.entities.MetaDataField;

/* loaded from: classes11.dex */
public final class i7x extends nl11 {
    public final /* synthetic */ int a;
    public final /* synthetic */ nl11 b;
    public final /* synthetic */ nl11 c;

    public /* synthetic */ i7x(nl11 nl11Var, nl11 nl11Var2, int i) {
        this.a = i;
        this.b = nl11Var;
        this.c = nl11Var2;
    }

    @Override // defpackage.nl11
    public final Object read(wdx wdxVar) {
        int i = this.a;
        nl11 nl11Var = this.c;
        nl11 nl11Var2 = this.b;
        LocalDate localDate = null;
        LocalTime localTime = null;
        LocalDateTime localDateTime = null;
        switch (i) {
            case 0:
                wdxVar.c();
                LocalTime localTime2 = null;
                while (wdxVar.R() != JsonToken.END_OBJECT) {
                    String nextName = wdxVar.nextName();
                    nextName.getClass();
                    if (nextName.equals(MetaDataField.DATE_FIELD)) {
                        localDate = (LocalDate) nl11Var2.read(wdxVar);
                    } else if (nextName.equals(RemoteBioParameters.TIME)) {
                        localTime2 = (LocalTime) nl11Var.read(wdxVar);
                    } else {
                        wdxVar.skipValue();
                    }
                }
                wdxVar.n();
                g7x.a(localDate, MetaDataField.DATE_FIELD, wdxVar);
                g7x.a(localTime2, RemoteBioParameters.TIME, wdxVar);
                return LocalDateTime.of(localDate, localTime2);
            case 1:
                wdxVar.c();
                ZoneOffset zoneOffset = null;
                while (wdxVar.R() != JsonToken.END_OBJECT) {
                    String nextName2 = wdxVar.nextName();
                    nextName2.getClass();
                    if (nextName2.equals("offset")) {
                        zoneOffset = (ZoneOffset) nl11Var.read(wdxVar);
                    } else if (nextName2.equals("dateTime")) {
                        localDateTime = (LocalDateTime) nl11Var2.read(wdxVar);
                    } else {
                        wdxVar.skipValue();
                    }
                }
                wdxVar.n();
                g7x.a(localDateTime, "dateTime", wdxVar);
                g7x.a(zoneOffset, "offset", wdxVar);
                return OffsetDateTime.of(localDateTime, zoneOffset);
            default:
                wdxVar.c();
                ZoneOffset zoneOffset2 = null;
                while (wdxVar.R() != JsonToken.END_OBJECT) {
                    String nextName3 = wdxVar.nextName();
                    nextName3.getClass();
                    if (nextName3.equals("offset")) {
                        zoneOffset2 = (ZoneOffset) nl11Var.read(wdxVar);
                    } else if (nextName3.equals(RemoteBioParameters.TIME)) {
                        localTime = (LocalTime) nl11Var2.read(wdxVar);
                    } else {
                        wdxVar.skipValue();
                    }
                }
                wdxVar.n();
                g7x.a(localTime, RemoteBioParameters.TIME, wdxVar);
                g7x.a(zoneOffset2, "offset", wdxVar);
                return OffsetTime.of(localTime, zoneOffset2);
        }
    }

    @Override // defpackage.nl11
    public final void write(afx afxVar, Object obj) {
        int i = this.a;
        nl11 nl11Var = this.c;
        nl11 nl11Var2 = this.b;
        switch (i) {
            case 0:
                LocalDateTime localDateTime = (LocalDateTime) obj;
                afxVar.d();
                afxVar.o(MetaDataField.DATE_FIELD);
                nl11Var2.write(afxVar, localDateTime.toLocalDate());
                afxVar.o(RemoteBioParameters.TIME);
                nl11Var.write(afxVar, localDateTime.toLocalTime());
                afxVar.n();
                break;
            case 1:
                OffsetDateTime offsetDateTime = (OffsetDateTime) obj;
                afxVar.d();
                afxVar.o("dateTime");
                nl11Var2.write(afxVar, offsetDateTime.toLocalDateTime());
                afxVar.o("offset");
                nl11Var.write(afxVar, offsetDateTime.getOffset());
                afxVar.n();
                break;
            default:
                OffsetTime offsetTime = (OffsetTime) obj;
                afxVar.d();
                afxVar.o(RemoteBioParameters.TIME);
                nl11Var2.write(afxVar, offsetTime.toLocalTime());
                afxVar.o("offset");
                nl11Var.write(afxVar, offsetTime.getOffset());
                afxVar.n();
                break;
        }
    }
}

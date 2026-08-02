package defpackage;

import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonToken;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes11.dex */
public final class h7x extends nl11 {
    public final /* synthetic */ int a = 0;
    public final nl11 b;
    public final Object c;
    public final Object d;

    public h7x(u3u u3uVar, nl11 nl11Var, Type type) {
        this.c = u3uVar;
        this.b = nl11Var;
        this.d = type;
    }

    @Override // defpackage.nl11
    public final Object read(wdx wdxVar) {
        LocalDateTime localDateTime = null;
        Map map = null;
        switch (this.a) {
            case 0:
                wdxVar.c();
                ZoneOffset zoneOffset = null;
                ZoneId zoneId = null;
                while (wdxVar.R() != JsonToken.END_OBJECT) {
                    String nextName = wdxVar.nextName();
                    nextName.getClass();
                    switch (nextName) {
                        case "offset":
                            zoneOffset = (ZoneOffset) ((nl11) this.c).read(wdxVar);
                            break;
                        case "zone":
                            zoneId = (ZoneId) ((nl11) this.d).read(wdxVar);
                            break;
                        case "dateTime":
                            localDateTime = (LocalDateTime) this.b.read(wdxVar);
                            break;
                        default:
                            wdxVar.skipValue();
                            break;
                    }
                }
                wdxVar.n();
                g7x.a(localDateTime, "dateTime", wdxVar);
                g7x.a(zoneOffset, "offset", wdxVar);
                g7x.a(zoneId, "zone", wdxVar);
                return ZonedDateTime.ofInstant(localDateTime, zoneOffset, zoneId);
            case 1:
                JsonToken R = wdxVar.R();
                if (R == JsonToken.NULL) {
                    wdxVar.B0();
                } else {
                    map = (Map) ((fp60) this.d).i();
                    if (R == JsonToken.BEGIN_ARRAY) {
                        wdxVar.a();
                        while (wdxVar.hasNext()) {
                            wdxVar.a();
                            Object read = ((h7x) this.b).b.read(wdxVar);
                            Object read2 = ((h7x) this.c).b.read(wdxVar);
                            if (map.containsKey(read)) {
                                throw new JsonSyntaxException(qv10.o("duplicate key: ", read));
                            }
                            map.put(read, read2);
                            wdxVar.k();
                        }
                        wdxVar.k();
                    } else {
                        wdxVar.c();
                        while (wdxVar.hasNext()) {
                            ydx.a.getClass();
                            if (wdxVar instanceof rex) {
                                rex rexVar = (rex) wdxVar;
                                rexVar.k0(JsonToken.NAME);
                                Map.Entry entry = (Map.Entry) ((Iterator) rexVar.v0()).next();
                                rexVar.x0(entry.getValue());
                                rexVar.x0(new rdx((String) entry.getKey()));
                            } else {
                                int i = wdxVar.A;
                                if (i == 0) {
                                    i = wdxVar.e();
                                }
                                if (i == 13) {
                                    wdxVar.A = 9;
                                } else if (i == 12) {
                                    wdxVar.A = 8;
                                } else {
                                    if (i != 14) {
                                        throw wdxVar.f0("a name");
                                    }
                                    wdxVar.A = 10;
                                }
                            }
                            Object read3 = ((h7x) this.b).b.read(wdxVar);
                            Object read4 = ((h7x) this.c).b.read(wdxVar);
                            if (map.containsKey(read3)) {
                                throw new JsonSyntaxException(qv10.o("duplicate key: ", read3));
                            }
                            map.put(read3, read4);
                        }
                        wdxVar.n();
                    }
                }
                return map;
            default:
                return this.b.read(wdxVar);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0041, code lost:
    
        if ((r0 instanceof defpackage.api0) == false) goto L27;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.reflect.Type] */
    @Override // defpackage.nl11
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void write(afx afxVar, Object obj) {
        nl11 a;
        int i = this.a;
        Object obj2 = this.d;
        nl11 nl11Var = this.b;
        Object obj3 = this.c;
        switch (i) {
            case 0:
                ZonedDateTime zonedDateTime = (ZonedDateTime) obj;
                if (zonedDateTime == null) {
                    afxVar.w();
                    break;
                } else {
                    afxVar.d();
                    afxVar.o("dateTime");
                    nl11Var.write(afxVar, zonedDateTime.toLocalDateTime());
                    afxVar.o("offset");
                    ((nl11) obj3).write(afxVar, zonedDateTime.getOffset());
                    afxVar.o("zone");
                    ((nl11) obj2).write(afxVar, zonedDateTime.getZone());
                    afxVar.n();
                    break;
                }
            case 1:
                Map map = (Map) obj;
                h7x h7xVar = (h7x) obj3;
                if (map == null) {
                    afxVar.w();
                    break;
                } else {
                    afxVar.d();
                    for (Map.Entry entry : map.entrySet()) {
                        afxVar.o(String.valueOf(entry.getKey()));
                        h7xVar.write(afxVar, entry.getValue());
                    }
                    afxVar.n();
                    break;
                }
            default:
                ?? r1 = (Type) obj2;
                Class<?> cls = (obj == null || !((r1 instanceof Class) || (r1 instanceof TypeVariable))) ? r1 : obj.getClass();
                if (cls != r1) {
                    nl11 e = ((u3u) obj3).e(TypeToken.get((Type) cls));
                    if (e instanceof api0) {
                        nl11 nl11Var2 = nl11Var;
                        while ((nl11Var2 instanceof qsq0) && (a = ((qsq0) nl11Var2).a()) != nl11Var2) {
                            nl11Var2 = a;
                        }
                        break;
                    }
                    nl11Var = e;
                }
                nl11Var.write(afxVar, obj);
                break;
        }
    }

    public h7x(pcc pccVar, h7x h7xVar, h7x h7xVar2, fp60 fp60Var) {
        this.b = h7xVar;
        this.c = h7xVar2;
        this.d = fp60Var;
    }

    public h7x(nl11 nl11Var, nl11 nl11Var2, nl11 nl11Var3) {
        this.b = nl11Var;
        this.c = nl11Var2;
        this.d = nl11Var3;
    }
}

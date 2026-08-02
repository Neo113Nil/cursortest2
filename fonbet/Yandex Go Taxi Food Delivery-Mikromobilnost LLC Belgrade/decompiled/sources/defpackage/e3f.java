package defpackage;

import android.util.Base64;
import android.util.JsonReader;
import com.yandex.passport.internal.ui.authsdk.AuthSdkActivity;
import defpackage.c3f;
import io.appmetrica.analytics.impl.C0553n3;
import io.appmetrica.analytics.rtm.internal.Constants;
import java.io.StringReader;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import ru.CryptoPro.JCP.ASN.PKIXCMP.PKIBody;
import ru.CryptoPro.JCSP.CStructReader.BlobHeaderStructure;
import ru.yandex.common.clid.ClidProvider;

/* loaded from: classes.dex */
public class e3f {
    public static final vit a;

    static {
        mcx mcxVar = new mcx();
        cq3 cq3Var = cq3.a;
        mcxVar.a(c3f.class, cq3Var);
        mcxVar.a(z34.class, cq3Var);
        iq3 iq3Var = iq3.a;
        mcxVar.a(c3f.e.class, iq3Var);
        mcxVar.a(m44.class, iq3Var);
        fq3 fq3Var = fq3.a;
        mcxVar.a(c3f.e.a.class, fq3Var);
        mcxVar.a(o44.class, fq3Var);
        gq3 gq3Var = gq3.a;
        mcxVar.a(c3f.e.a.b.class, gq3Var);
        mcxVar.a(p44.class, gq3Var);
        yq3 yq3Var = yq3.a;
        mcxVar.a(c3f.e.f.class, yq3Var);
        mcxVar.a(x54.class, yq3Var);
        xq3 xq3Var = xq3.a;
        mcxVar.a(c3f.e.AbstractC0027e.class, xq3Var);
        mcxVar.a(v54.class, xq3Var);
        hq3 hq3Var = hq3.a;
        mcxVar.a(c3f.e.c.class, hq3Var);
        mcxVar.a(r44.class, hq3Var);
        sq3 sq3Var = sq3.a;
        mcxVar.a(c3f.e.d.class, sq3Var);
        mcxVar.a(t44.class, sq3Var);
        jq3 jq3Var = jq3.a;
        mcxVar.a(c3f.e.d.a.class, jq3Var);
        mcxVar.a(v44.class, jq3Var);
        lq3 lq3Var = lq3.a;
        mcxVar.a(c3f.e.d.a.b.class, lq3Var);
        mcxVar.a(x44.class, lq3Var);
        oq3 oq3Var = oq3.a;
        mcxVar.a(c3f.e.d.a.b.AbstractC0020e.class, oq3Var);
        mcxVar.a(f54.class, oq3Var);
        pq3 pq3Var = pq3.a;
        mcxVar.a(c3f.e.d.a.b.AbstractC0020e.AbstractC0022b.class, pq3Var);
        mcxVar.a(h54.class, pq3Var);
        mq3 mq3Var = mq3.a;
        mcxVar.a(c3f.e.d.a.b.c.class, mq3Var);
        mcxVar.a(b54.class, mq3Var);
        aq3 aq3Var = aq3.a;
        mcxVar.a(c3f.a.class, aq3Var);
        mcxVar.a(c44.class, aq3Var);
        zp3 zp3Var = zp3.a;
        mcxVar.a(c3f.a.AbstractC0010a.class, zp3Var);
        mcxVar.a(e44.class, zp3Var);
        nq3 nq3Var = nq3.a;
        mcxVar.a(c3f.e.d.a.b.AbstractC0018d.class, nq3Var);
        mcxVar.a(d54.class, nq3Var);
        kq3 kq3Var = kq3.a;
        mcxVar.a(c3f.e.d.a.b.AbstractC0014a.class, kq3Var);
        mcxVar.a(z44.class, kq3Var);
        bq3 bq3Var = bq3.a;
        mcxVar.a(c3f.c.class, bq3Var);
        mcxVar.a(g44.class, bq3Var);
        qq3 qq3Var = qq3.a;
        mcxVar.a(c3f.e.d.a.c.class, qq3Var);
        mcxVar.a(j54.class, qq3Var);
        rq3 rq3Var = rq3.a;
        mcxVar.a(c3f.e.d.c.class, rq3Var);
        mcxVar.a(l54.class, rq3Var);
        tq3 tq3Var = tq3.a;
        mcxVar.a(c3f.e.d.AbstractC0025d.class, tq3Var);
        mcxVar.a(n54.class, tq3Var);
        wq3 wq3Var = wq3.a;
        mcxVar.a(c3f.e.d.f.class, wq3Var);
        mcxVar.a(t54.class, wq3Var);
        uq3 uq3Var = uq3.a;
        mcxVar.a(c3f.e.d.AbstractC0026e.class, uq3Var);
        mcxVar.a(p54.class, uq3Var);
        vq3 vq3Var = vq3.a;
        mcxVar.a(c3f.e.d.AbstractC0026e.b.class, vq3Var);
        mcxVar.a(r54.class, vq3Var);
        dq3 dq3Var = dq3.a;
        mcxVar.a(c3f.d.class, dq3Var);
        mcxVar.a(i44.class, dq3Var);
        eq3 eq3Var = eq3.a;
        mcxVar.a(c3f.d.b.class, eq3Var);
        mcxVar.a(k44.class, eq3Var);
        mcxVar.d = true;
        a = new vit(24, mcxVar);
    }

    public static h54 a(JsonReader jsonReader) {
        g54 g54Var = new g54();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.getClass();
            switch (nextName) {
                case "offset":
                    g54Var.d(jsonReader.nextLong());
                    break;
                case "symbol":
                    g54Var.f(jsonReader.nextString());
                    break;
                case "pc":
                    g54Var.e(jsonReader.nextLong());
                    break;
                case "file":
                    g54Var.b(jsonReader.nextString());
                    break;
                case "importance":
                    g54Var.c(jsonReader.nextInt());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return g54Var.a();
    }

    public static g44 b(JsonReader jsonReader) {
        f44 f44Var = new f44();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.getClass();
            if (nextName.equals("key")) {
                f44Var.b(jsonReader.nextString());
            } else if (nextName.equals("value")) {
                f44Var.c(jsonReader.nextString());
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        return f44Var.a();
    }

    public static c3f.a c(JsonReader jsonReader) {
        int i;
        b44 b44Var = new b44();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.getClass();
            i = 4;
            switch (nextName) {
                case "buildIdMappingForArch":
                    b44Var.b(d(jsonReader, new x8e(i)));
                    break;
                case "pid":
                    b44Var.d(jsonReader.nextInt());
                    break;
                case "pss":
                    b44Var.f(jsonReader.nextLong());
                    break;
                case "rss":
                    b44Var.h(jsonReader.nextLong());
                    break;
                case "timestamp":
                    b44Var.i(jsonReader.nextLong());
                    break;
                case "processName":
                    b44Var.e(jsonReader.nextString());
                    break;
                case "reasonCode":
                    b44Var.g(jsonReader.nextInt());
                    break;
                case "traceFile":
                    b44Var.j(jsonReader.nextString());
                    break;
                case "importance":
                    b44Var.c(jsonReader.nextInt());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return b44Var.a();
    }

    public static List d(JsonReader jsonReader, x8e x8eVar) {
        ArrayList arrayList = new ArrayList();
        jsonReader.beginArray();
        while (jsonReader.hasNext()) {
            arrayList.add(x8eVar.f(jsonReader));
        }
        jsonReader.endArray();
        return Collections.unmodifiableList(arrayList);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static c3f.e.d e(JsonReader jsonReader) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        s44 s44Var = new s44();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.getClass();
            switch (nextName.hashCode()) {
                case -1335157162:
                    if (nextName.equals("device")) {
                        z = false;
                        break;
                    }
                    z = -1;
                    break;
                case -259312414:
                    if (nextName.equals("rollouts")) {
                        z = true;
                        break;
                    }
                    z = -1;
                    break;
                case 96801:
                    if (nextName.equals("app")) {
                        z = 2;
                        break;
                    }
                    z = -1;
                    break;
                case 107332:
                    if (nextName.equals("log")) {
                        z = 3;
                        break;
                    }
                    z = -1;
                    break;
                case 3575610:
                    if (nextName.equals("type")) {
                        z = 4;
                        break;
                    }
                    z = -1;
                    break;
                case 55126294:
                    if (nextName.equals(ClidProvider.TIMESTAMP)) {
                        z = 5;
                        break;
                    }
                    z = -1;
                    break;
                default:
                    z = -1;
                    break;
            }
            int i = 6;
            switch (z) {
                case false:
                    k54 k54Var = new k54();
                    jsonReader.beginObject();
                    while (jsonReader.hasNext()) {
                        String nextName2 = jsonReader.nextName();
                        nextName2.getClass();
                        switch (nextName2.hashCode()) {
                            case -1708606089:
                                if (nextName2.equals("batteryLevel")) {
                                    z2 = false;
                                    break;
                                }
                                z2 = -1;
                                break;
                            case -1455558134:
                                if (nextName2.equals("batteryVelocity")) {
                                    z2 = true;
                                    break;
                                }
                                z2 = -1;
                                break;
                            case -1439500848:
                                if (nextName2.equals("orientation")) {
                                    z2 = 2;
                                    break;
                                }
                                z2 = -1;
                                break;
                            case 279795450:
                                if (nextName2.equals("diskUsed")) {
                                    z2 = 3;
                                    break;
                                }
                                z2 = -1;
                                break;
                            case 976541947:
                                if (nextName2.equals("ramUsed")) {
                                    z2 = 4;
                                    break;
                                }
                                z2 = -1;
                                break;
                            case 1516795582:
                                if (nextName2.equals("proximityOn")) {
                                    z2 = 5;
                                    break;
                                }
                                z2 = -1;
                                break;
                            default:
                                z2 = -1;
                                break;
                        }
                        switch (z2) {
                            case false:
                                k54Var.b(Double.valueOf(jsonReader.nextDouble()));
                                break;
                            case true:
                                k54Var.c(jsonReader.nextInt());
                                break;
                            case true:
                                k54Var.e(jsonReader.nextInt());
                                break;
                            case true:
                                k54Var.d(jsonReader.nextLong());
                                break;
                            case true:
                                k54Var.g(jsonReader.nextLong());
                                break;
                            case true:
                                k54Var.f(jsonReader.nextBoolean());
                                break;
                            default:
                                jsonReader.skipValue();
                                break;
                        }
                    }
                    jsonReader.endObject();
                    s44Var.c(k54Var.a());
                    break;
                case true:
                    s54 s54Var = new s54();
                    jsonReader.beginObject();
                    while (jsonReader.hasNext()) {
                        String nextName3 = jsonReader.nextName();
                        nextName3.getClass();
                        if (nextName3.equals("assignments")) {
                            s54Var.b(d(jsonReader, new x8e(i)));
                        } else {
                            jsonReader.skipValue();
                        }
                    }
                    jsonReader.endObject();
                    s44Var.e(s54Var.a());
                    break;
                case true:
                    u44 u44Var = new u44();
                    jsonReader.beginObject();
                    while (jsonReader.hasNext()) {
                        String nextName4 = jsonReader.nextName();
                        nextName4.getClass();
                        switch (nextName4.hashCode()) {
                            case -1405314732:
                                if (nextName4.equals("appProcessDetails")) {
                                    z3 = false;
                                    break;
                                }
                                z3 = -1;
                                break;
                            case -1332194002:
                                if (nextName4.equals(C0553n3.g)) {
                                    z3 = true;
                                    break;
                                }
                                z3 = -1;
                                break;
                            case -1090974952:
                                if (nextName4.equals("execution")) {
                                    z3 = 2;
                                    break;
                                }
                                z3 = -1;
                                break;
                            case -80231855:
                                if (nextName4.equals("internalKeys")) {
                                    z3 = 3;
                                    break;
                                }
                                z3 = -1;
                                break;
                            case 555169704:
                                if (nextName4.equals("customAttributes")) {
                                    z3 = 4;
                                    break;
                                }
                                z3 = -1;
                                break;
                            case 928737948:
                                if (nextName4.equals("uiOrientation")) {
                                    z3 = 5;
                                    break;
                                }
                                z3 = -1;
                                break;
                            case 1847730860:
                                if (nextName4.equals("currentProcessDetails")) {
                                    z3 = 6;
                                    break;
                                }
                                z3 = -1;
                                break;
                            default:
                                z3 = -1;
                                break;
                        }
                        switch (z3) {
                            case false:
                                ArrayList arrayList = new ArrayList();
                                jsonReader.beginArray();
                                while (jsonReader.hasNext()) {
                                    arrayList.add(g(jsonReader));
                                }
                                jsonReader.endArray();
                                u44Var.b(Collections.unmodifiableList(arrayList));
                                break;
                            case true:
                                u44Var.c(Boolean.valueOf(jsonReader.nextBoolean()));
                                break;
                            case true:
                                w44 w44Var = new w44();
                                jsonReader.beginObject();
                                while (jsonReader.hasNext()) {
                                    String nextName5 = jsonReader.nextName();
                                    nextName5.getClass();
                                    switch (nextName5.hashCode()) {
                                        case -1375141843:
                                            if (nextName5.equals("appExitInfo")) {
                                                z4 = false;
                                                break;
                                            }
                                            z4 = -1;
                                            break;
                                        case -1337936983:
                                            if (nextName5.equals("threads")) {
                                                z4 = true;
                                                break;
                                            }
                                            z4 = -1;
                                            break;
                                        case -902467928:
                                            if (nextName5.equals("signal")) {
                                                z4 = 2;
                                                break;
                                            }
                                            z4 = -1;
                                            break;
                                        case 937615455:
                                            if (nextName5.equals("binaries")) {
                                                z4 = 3;
                                                break;
                                            }
                                            z4 = -1;
                                            break;
                                        case 1481625679:
                                            if (nextName5.equals(Constants.KEY_EXCEPTION)) {
                                                z4 = 4;
                                                break;
                                            }
                                            z4 = -1;
                                            break;
                                        default:
                                            z4 = -1;
                                            break;
                                    }
                                    switch (z4) {
                                        case false:
                                            w44Var.b(c(jsonReader));
                                            break;
                                        case true:
                                            w44Var.f(d(jsonReader, new x8e(7)));
                                            break;
                                        case true:
                                            c54 c54Var = new c54();
                                            jsonReader.beginObject();
                                            while (jsonReader.hasNext()) {
                                                String nextName6 = jsonReader.nextName();
                                                nextName6.getClass();
                                                switch (nextName6.hashCode()) {
                                                    case -1147692044:
                                                        if (nextName6.equals("address")) {
                                                            z5 = false;
                                                            break;
                                                        }
                                                        z5 = -1;
                                                        break;
                                                    case 3059181:
                                                        if (nextName6.equals(AuthSdkActivity.RESPONSE_TYPE_CODE)) {
                                                            z5 = true;
                                                            break;
                                                        }
                                                        z5 = -1;
                                                        break;
                                                    case 3373707:
                                                        if (nextName6.equals("name")) {
                                                            z5 = 2;
                                                            break;
                                                        }
                                                        z5 = -1;
                                                        break;
                                                    default:
                                                        z5 = -1;
                                                        break;
                                                }
                                                switch (z5) {
                                                    case false:
                                                        c54Var.b(jsonReader.nextLong());
                                                        break;
                                                    case true:
                                                        c54Var.c(jsonReader.nextString());
                                                        break;
                                                    case true:
                                                        c54Var.d(jsonReader.nextString());
                                                        break;
                                                    default:
                                                        jsonReader.skipValue();
                                                        break;
                                                }
                                            }
                                            jsonReader.endObject();
                                            w44Var.e(c54Var.a());
                                            break;
                                        case true:
                                            w44Var.c(d(jsonReader, new x8e(8)));
                                            break;
                                        case true:
                                            w44Var.d(f(jsonReader));
                                            break;
                                        default:
                                            jsonReader.skipValue();
                                            break;
                                    }
                                }
                                jsonReader.endObject();
                                u44Var.f(w44Var.a());
                                break;
                            case true:
                                ArrayList arrayList2 = new ArrayList();
                                jsonReader.beginArray();
                                while (jsonReader.hasNext()) {
                                    arrayList2.add(b(jsonReader));
                                }
                                jsonReader.endArray();
                                u44Var.g(Collections.unmodifiableList(arrayList2));
                                break;
                            case true:
                                ArrayList arrayList3 = new ArrayList();
                                jsonReader.beginArray();
                                while (jsonReader.hasNext()) {
                                    arrayList3.add(b(jsonReader));
                                }
                                jsonReader.endArray();
                                u44Var.e(Collections.unmodifiableList(arrayList3));
                                break;
                            case true:
                                u44Var.h(jsonReader.nextInt());
                                break;
                            case true:
                                u44Var.d(g(jsonReader));
                                break;
                            default:
                                jsonReader.skipValue();
                                break;
                        }
                    }
                    jsonReader.endObject();
                    s44Var.b(u44Var.a());
                    break;
                case true:
                    m54 m54Var = new m54();
                    jsonReader.beginObject();
                    while (jsonReader.hasNext()) {
                        if (jsonReader.nextName().equals("content")) {
                            m54Var.b(jsonReader.nextString());
                        } else {
                            jsonReader.skipValue();
                        }
                    }
                    jsonReader.endObject();
                    s44Var.d(m54Var.a());
                    break;
                case true:
                    s44Var.g(jsonReader.nextString());
                    break;
                case true:
                    s44Var.f(jsonReader.nextLong());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return s44Var.a();
    }

    public static c3f.e.d.a.b.c f(JsonReader jsonReader) {
        a54 a54Var = new a54();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.getClass();
            switch (nextName) {
                case "frames":
                    a54Var.c(d(jsonReader, new x8e(10)));
                    break;
                case "reason":
                    a54Var.e(jsonReader.nextString());
                    break;
                case "type":
                    a54Var.f(jsonReader.nextString());
                    break;
                case "causedBy":
                    a54Var.b(f(jsonReader));
                    break;
                case "overflowCount":
                    a54Var.d(jsonReader.nextInt());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return a54Var.a();
    }

    public static c3f.e.d.a.c g(JsonReader jsonReader) {
        i54 i54Var = new i54();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.getClass();
            switch (nextName) {
                case "pid":
                    i54Var.b = jsonReader.nextInt();
                    i54Var.e = (byte) (i54Var.e | 1);
                    break;
                case "processName":
                    String nextString = jsonReader.nextString();
                    if (nextString == null) {
                        ny61.t("Null processName");
                        return null;
                    }
                    i54Var.a = nextString;
                    break;
                case "defaultProcess":
                    i54Var.d = jsonReader.nextBoolean();
                    i54Var.e = (byte) (i54Var.e | 4);
                    break;
                case "importance":
                    i54Var.c = jsonReader.nextInt();
                    i54Var.e = (byte) (i54Var.e | 2);
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return i54Var.a();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static c3f h(JsonReader jsonReader) {
        char c;
        char c2;
        char c3;
        boolean z;
        boolean z2;
        Charset charset = c3f.a;
        y34 y34Var = new y34();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.getClass();
            int i = 5;
            switch (nextName.hashCode()) {
                case -2118372775:
                    if (nextName.equals("ndkPayload")) {
                        c = 0;
                        break;
                    }
                    c = 65535;
                    break;
                case -1962630338:
                    if (nextName.equals("sdkVersion")) {
                        c = 1;
                        break;
                    }
                    c = 65535;
                    break;
                case -1907185581:
                    if (nextName.equals("appQualitySessionId")) {
                        c = 2;
                        break;
                    }
                    c = 65535;
                    break;
                case -1375141843:
                    if (nextName.equals("appExitInfo")) {
                        c = 3;
                        break;
                    }
                    c = 65535;
                    break;
                case -911706486:
                    if (nextName.equals("buildVersion")) {
                        c = 4;
                        break;
                    }
                    c = 65535;
                    break;
                case -401988390:
                    if (nextName.equals("firebaseAuthenticationToken")) {
                        c = 5;
                        break;
                    }
                    c = 65535;
                    break;
                case 344431858:
                    if (nextName.equals("gmpAppId")) {
                        c = 6;
                        break;
                    }
                    c = 65535;
                    break;
                case 719853845:
                    if (nextName.equals("installationUuid")) {
                        c = 7;
                        break;
                    }
                    c = 65535;
                    break;
                case 1047652060:
                    if (nextName.equals("firebaseInstallationId")) {
                        c = '\b';
                        break;
                    }
                    c = 65535;
                    break;
                case 1874684019:
                    if (nextName.equals("platform")) {
                        c = '\t';
                        break;
                    }
                    c = 65535;
                    break;
                case 1975623094:
                    if (nextName.equals("displayVersion")) {
                        c = '\n';
                        break;
                    }
                    c = 65535;
                    break;
                case 1984987798:
                    if (nextName.equals("session")) {
                        c = 11;
                        break;
                    }
                    c = 65535;
                    break;
                default:
                    c = 65535;
                    break;
            }
            switch (c) {
                case 0:
                    h44 h44Var = new h44();
                    jsonReader.beginObject();
                    while (jsonReader.hasNext()) {
                        String nextName2 = jsonReader.nextName();
                        nextName2.getClass();
                        if (nextName2.equals("files")) {
                            h44Var.b(d(jsonReader, new x8e(i)));
                        } else if (nextName2.equals("orgId")) {
                            h44Var.c(jsonReader.nextString());
                        } else {
                            jsonReader.skipValue();
                        }
                    }
                    jsonReader.endObject();
                    y34Var.k = h44Var.a();
                    continue;
                case 1:
                    String nextString = jsonReader.nextString();
                    if (nextString == null) {
                        ny61.t("Null sdkVersion");
                        return null;
                    }
                    y34Var.a = nextString;
                    break;
                case 2:
                    y34Var.g = jsonReader.nextString();
                    break;
                case 3:
                    y34Var.l = c(jsonReader);
                    break;
                case 4:
                    String nextString2 = jsonReader.nextString();
                    if (nextString2 == null) {
                        ny61.t("Null buildVersion");
                        return null;
                    }
                    y34Var.h = nextString2;
                    break;
                case 5:
                    y34Var.f = jsonReader.nextString();
                    break;
                case 6:
                    String nextString3 = jsonReader.nextString();
                    if (nextString3 == null) {
                        ny61.t("Null gmpAppId");
                        return null;
                    }
                    y34Var.b = nextString3;
                    break;
                case 7:
                    String nextString4 = jsonReader.nextString();
                    if (nextString4 == null) {
                        ny61.t("Null installationUuid");
                        return null;
                    }
                    y34Var.d = nextString4;
                    break;
                case '\b':
                    y34Var.e = jsonReader.nextString();
                    break;
                case '\t':
                    y34Var.c = jsonReader.nextInt();
                    y34Var.m = (byte) (y34Var.m | 1);
                    break;
                case '\n':
                    String nextString5 = jsonReader.nextString();
                    if (nextString5 == null) {
                        ny61.t("Null displayVersion");
                        return null;
                    }
                    y34Var.i = nextString5;
                    break;
                case 11:
                    l44 l44Var = new l44();
                    l44Var.b(false);
                    jsonReader.beginObject();
                    while (jsonReader.hasNext()) {
                        String nextName3 = jsonReader.nextName();
                        nextName3.getClass();
                        switch (nextName3.hashCode()) {
                            case -2128794476:
                                if (nextName3.equals("startedAt")) {
                                    c2 = 0;
                                    break;
                                }
                                c2 = 65535;
                                break;
                            case -1907185581:
                                if (nextName3.equals("appQualitySessionId")) {
                                    c2 = 1;
                                    break;
                                }
                                c2 = 65535;
                                break;
                            case -1618432855:
                                if (nextName3.equals("identifier")) {
                                    c2 = 2;
                                    break;
                                }
                                c2 = 65535;
                                break;
                            case -1606742899:
                                if (nextName3.equals("endedAt")) {
                                    c2 = 3;
                                    break;
                                }
                                c2 = 65535;
                                break;
                            case -1335157162:
                                if (nextName3.equals("device")) {
                                    c2 = 4;
                                    break;
                                }
                                c2 = 65535;
                                break;
                            case -1291329255:
                                if (nextName3.equals("events")) {
                                    c2 = 5;
                                    break;
                                }
                                c2 = 65535;
                                break;
                            case 3556:
                                if (nextName3.equals("os")) {
                                    c2 = 6;
                                    break;
                                }
                                c2 = 65535;
                                break;
                            case 96801:
                                if (nextName3.equals("app")) {
                                    c2 = 7;
                                    break;
                                }
                                c2 = 65535;
                                break;
                            case 3599307:
                                if (nextName3.equals("user")) {
                                    c2 = '\b';
                                    break;
                                }
                                c2 = 65535;
                                break;
                            case 286956243:
                                if (nextName3.equals("generator")) {
                                    c2 = '\t';
                                    break;
                                }
                                c2 = 65535;
                                break;
                            case 1025385094:
                                if (nextName3.equals("crashed")) {
                                    c2 = '\n';
                                    break;
                                }
                                c2 = 65535;
                                break;
                            case 2047016109:
                                if (nextName3.equals("generatorType")) {
                                    c2 = 11;
                                    break;
                                }
                                c2 = 65535;
                                break;
                            default:
                                c2 = 65535;
                                break;
                        }
                        switch (c2) {
                            case 0:
                                l44Var.d = jsonReader.nextLong();
                                l44Var.m = (byte) (l44Var.m | 1);
                                break;
                            case 1:
                                l44Var.c = jsonReader.nextString();
                                break;
                            case 2:
                                l44Var.b = new String(Base64.decode(jsonReader.nextString(), 2), c3f.a);
                                break;
                            case 3:
                                l44Var.e = Long.valueOf(jsonReader.nextLong());
                                break;
                            case 4:
                                q44 q44Var = new q44();
                                jsonReader.beginObject();
                                while (jsonReader.hasNext()) {
                                    String nextName4 = jsonReader.nextName();
                                    nextName4.getClass();
                                    switch (nextName4.hashCode()) {
                                        case -1981332476:
                                            if (nextName4.equals("simulator")) {
                                                c3 = 0;
                                                break;
                                            }
                                            c3 = 65535;
                                            break;
                                        case -1969347631:
                                            if (nextName4.equals("manufacturer")) {
                                                c3 = 1;
                                                break;
                                            }
                                            c3 = 65535;
                                            break;
                                        case 112670:
                                            if (nextName4.equals("ram")) {
                                                c3 = 2;
                                                break;
                                            }
                                            c3 = 65535;
                                            break;
                                        case 3002454:
                                            if (nextName4.equals("arch")) {
                                                c3 = 3;
                                                break;
                                            }
                                            c3 = 65535;
                                            break;
                                        case 81784169:
                                            if (nextName4.equals("diskSpace")) {
                                                c3 = 4;
                                                break;
                                            }
                                            c3 = 65535;
                                            break;
                                        case 94848180:
                                            if (nextName4.equals("cores")) {
                                                c3 = 5;
                                                break;
                                            }
                                            c3 = 65535;
                                            break;
                                        case 104069929:
                                            if (nextName4.equals("model")) {
                                                c3 = 6;
                                                break;
                                            }
                                            c3 = 65535;
                                            break;
                                        case 109757585:
                                            if (nextName4.equals(ClidProvider.STATE)) {
                                                c3 = 7;
                                                break;
                                            }
                                            c3 = 65535;
                                            break;
                                        case 2078953423:
                                            if (nextName4.equals("modelClass")) {
                                                c3 = '\b';
                                                break;
                                            }
                                            c3 = 65535;
                                            break;
                                        default:
                                            c3 = 65535;
                                            break;
                                    }
                                    switch (c3) {
                                        case 0:
                                            q44Var.f = jsonReader.nextBoolean();
                                            q44Var.j = (byte) (q44Var.j | PKIBody._CKUANN);
                                            break;
                                        case 1:
                                            String nextString6 = jsonReader.nextString();
                                            if (nextString6 == null) {
                                                ny61.t("Null manufacturer");
                                                return null;
                                            }
                                            q44Var.h = nextString6;
                                            break;
                                        case 2:
                                            q44Var.d = jsonReader.nextLong();
                                            q44Var.j = (byte) (q44Var.j | 4);
                                            break;
                                        case 3:
                                            q44Var.a = jsonReader.nextInt();
                                            q44Var.j = (byte) (q44Var.j | 1);
                                            break;
                                        case 4:
                                            q44Var.e = jsonReader.nextLong();
                                            q44Var.j = (byte) (q44Var.j | 8);
                                            break;
                                        case 5:
                                            q44Var.c = jsonReader.nextInt();
                                            q44Var.j = (byte) (q44Var.j | 2);
                                            break;
                                        case 6:
                                            String nextString7 = jsonReader.nextString();
                                            if (nextString7 == null) {
                                                ny61.t("Null model");
                                                return null;
                                            }
                                            q44Var.b = nextString7;
                                            break;
                                        case 7:
                                            q44Var.g = jsonReader.nextInt();
                                            q44Var.j = (byte) (q44Var.j | BlobHeaderStructure.BLOB_VERSION);
                                            break;
                                        case '\b':
                                            String nextString8 = jsonReader.nextString();
                                            if (nextString8 == null) {
                                                ny61.t("Null modelClass");
                                                return null;
                                            }
                                            q44Var.i = nextString8;
                                            break;
                                        default:
                                            jsonReader.skipValue();
                                            break;
                                    }
                                }
                                jsonReader.endObject();
                                l44Var.j = q44Var.a();
                                break;
                            case 5:
                                ArrayList arrayList = new ArrayList();
                                jsonReader.beginArray();
                                while (jsonReader.hasNext()) {
                                    arrayList.add(e(jsonReader));
                                }
                                jsonReader.endArray();
                                l44Var.k = Collections.unmodifiableList(arrayList);
                                break;
                            case 6:
                                u54 u54Var = new u54();
                                jsonReader.beginObject();
                                while (jsonReader.hasNext()) {
                                    String nextName5 = jsonReader.nextName();
                                    nextName5.getClass();
                                    switch (nextName5.hashCode()) {
                                        case -911706486:
                                            if (nextName5.equals("buildVersion")) {
                                                z = false;
                                                break;
                                            }
                                            z = -1;
                                            break;
                                        case -293026577:
                                            if (nextName5.equals("jailbroken")) {
                                                z = true;
                                                break;
                                            }
                                            z = -1;
                                            break;
                                        case 351608024:
                                            if (nextName5.equals("version")) {
                                                z = 2;
                                                break;
                                            }
                                            z = -1;
                                            break;
                                        case 1874684019:
                                            if (nextName5.equals("platform")) {
                                                z = 3;
                                                break;
                                            }
                                            z = -1;
                                            break;
                                        default:
                                            z = -1;
                                            break;
                                    }
                                    switch (z) {
                                        case false:
                                            String nextString9 = jsonReader.nextString();
                                            if (nextString9 == null) {
                                                ny61.t("Null buildVersion");
                                                return null;
                                            }
                                            u54Var.c = nextString9;
                                            break;
                                        case true:
                                            u54Var.d = jsonReader.nextBoolean();
                                            u54Var.e = (byte) (u54Var.e | 2);
                                            break;
                                        case true:
                                            String nextString10 = jsonReader.nextString();
                                            if (nextString10 == null) {
                                                ny61.t("Null version");
                                                return null;
                                            }
                                            u54Var.b = nextString10;
                                            break;
                                        case true:
                                            u54Var.a = jsonReader.nextInt();
                                            u54Var.e = (byte) (u54Var.e | 1);
                                            break;
                                        default:
                                            jsonReader.skipValue();
                                            break;
                                    }
                                }
                                jsonReader.endObject();
                                l44Var.i = u54Var.a();
                                break;
                            case 7:
                                n44 n44Var = new n44();
                                jsonReader.beginObject();
                                while (jsonReader.hasNext()) {
                                    String nextName6 = jsonReader.nextName();
                                    nextName6.getClass();
                                    switch (nextName6.hashCode()) {
                                        case -1618432855:
                                            if (nextName6.equals("identifier")) {
                                                z2 = false;
                                                break;
                                            }
                                            z2 = -1;
                                            break;
                                        case -519438642:
                                            if (nextName6.equals("developmentPlatform")) {
                                                z2 = true;
                                                break;
                                            }
                                            z2 = -1;
                                            break;
                                        case 213652010:
                                            if (nextName6.equals("developmentPlatformVersion")) {
                                                z2 = 2;
                                                break;
                                            }
                                            z2 = -1;
                                            break;
                                        case 351608024:
                                            if (nextName6.equals("version")) {
                                                z2 = 3;
                                                break;
                                            }
                                            z2 = -1;
                                            break;
                                        case 719853845:
                                            if (nextName6.equals("installationUuid")) {
                                                z2 = 4;
                                                break;
                                            }
                                            z2 = -1;
                                            break;
                                        case 1975623094:
                                            if (nextName6.equals("displayVersion")) {
                                                z2 = 5;
                                                break;
                                            }
                                            z2 = -1;
                                            break;
                                        default:
                                            z2 = -1;
                                            break;
                                    }
                                    switch (z2) {
                                        case false:
                                            String nextString11 = jsonReader.nextString();
                                            if (nextString11 == null) {
                                                ny61.t("Null identifier");
                                                return null;
                                            }
                                            n44Var.a = nextString11;
                                            break;
                                        case true:
                                            n44Var.e = jsonReader.nextString();
                                            break;
                                        case true:
                                            n44Var.f = jsonReader.nextString();
                                            break;
                                        case true:
                                            String nextString12 = jsonReader.nextString();
                                            if (nextString12 == null) {
                                                ny61.t("Null version");
                                                return null;
                                            }
                                            n44Var.b = nextString12;
                                            break;
                                        case true:
                                            n44Var.d = jsonReader.nextString();
                                            break;
                                        case true:
                                            n44Var.c = jsonReader.nextString();
                                            break;
                                        default:
                                            jsonReader.skipValue();
                                            break;
                                    }
                                }
                                jsonReader.endObject();
                                l44Var.g = n44Var.a();
                                break;
                            case '\b':
                                w54 w54Var = new w54();
                                jsonReader.beginObject();
                                while (jsonReader.hasNext()) {
                                    if (jsonReader.nextName().equals("identifier")) {
                                        w54Var.b(jsonReader.nextString());
                                    } else {
                                        jsonReader.skipValue();
                                    }
                                }
                                jsonReader.endObject();
                                l44Var.h = w54Var.a();
                                break;
                            case '\t':
                                String nextString13 = jsonReader.nextString();
                                if (nextString13 == null) {
                                    ny61.t("Null generator");
                                    return null;
                                }
                                l44Var.a = nextString13;
                                break;
                            case '\n':
                                l44Var.b(jsonReader.nextBoolean());
                                break;
                            case 11:
                                l44Var.l = jsonReader.nextInt();
                                l44Var.m = (byte) (l44Var.m | 4);
                                break;
                            default:
                                jsonReader.skipValue();
                                break;
                        }
                    }
                    jsonReader.endObject();
                    y34Var.j = l44Var.a();
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return y34Var.a();
    }

    public static c3f i(String str) {
        try {
            JsonReader jsonReader = new JsonReader(new StringReader(str));
            try {
                c3f h = h(jsonReader);
                jsonReader.close();
                return h;
            } finally {
            }
        } catch (IllegalStateException e) {
            kbs.r(e);
            return null;
        }
    }
}

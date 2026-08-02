package xsna;

import android.util.Base64;
import android.util.JsonReader;
import androidx.annotation.NonNull;
import com.ironsource.O6;
import com.ironsource.X3;
import com.mbridge.msdk.MBridgeConstans;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import io.appmetrica.analytics.impl.L2;
import java.io.IOException;
import java.io.StringReader;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import ru.ok.android.sdk.OkListenerKt;
import ru.ok.android.webrtc.stat.listener.mapper.RTCStatsConstants;
import ru.ok.proto.rtmp.amf.AmfConstants;
import xsna.bl5;
import xsna.el5;
import xsna.fl5;
import xsna.ml5;
import xsna.nl5;
import xsna.ol5;
import xsna.sl5;
import xsna.tl5;
import xsna.uk5;
import xsna.wk5;
import xsna.zk5;

/* compiled from: CrashlyticsReportJsonTransform.java */
/* loaded from: classes.dex */
public final class o5k {
    public static final u8y a;

    /* compiled from: CrashlyticsReportJsonTransform.java */
    public interface a<T> {
        T d(@NonNull JsonReader jsonReader) throws IOException;
    }

    static {
        v8y v8yVar = new v8y();
        ye5.a.configure(v8yVar);
        v8yVar.d = true;
        a = new u8y(v8yVar);
    }

    public static ml5 a(JsonReader jsonReader) {
        ml5.a aVar = new ml5.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.getClass();
            switch (nextName) {
                case "offset":
                    aVar.d = jsonReader.nextLong();
                    aVar.f = (byte) (aVar.f | 2);
                    break;
                case "symbol":
                    String nextString = jsonReader.nextString();
                    if (nextString == null) {
                        throw new NullPointerException("Null symbol");
                    }
                    aVar.b = nextString;
                    break;
                case "pc":
                    aVar.a = jsonReader.nextLong();
                    aVar.f = (byte) (aVar.f | 1);
                    break;
                case "file":
                    aVar.c = jsonReader.nextString();
                    break;
                case "importance":
                    aVar.e = jsonReader.nextInt();
                    aVar.f = (byte) (aVar.f | 4);
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return aVar.a();
    }

    public static yk5 b(JsonReader jsonReader) {
        jsonReader.beginObject();
        String str = null;
        String str2 = null;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.getClass();
            if (nextName.equals("key")) {
                str = jsonReader.nextString();
                if (str == null) {
                    throw new NullPointerException("Null key");
                }
            } else if (nextName.equals("value")) {
                str2 = jsonReader.nextString();
                if (str2 == null) {
                    throw new NullPointerException("Null value");
                }
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        if (str != null && str2 != null) {
            return new yk5(str, str2);
        }
        StringBuilder sb = new StringBuilder();
        if (str == null) {
            sb.append(" key");
        }
        if (str2 == null) {
            sb.append(" value");
        }
        throw new IllegalStateException(t9c.b("Missing required properties:", sb));
    }

    @NonNull
    public static wk5 c(@NonNull JsonReader jsonReader) throws IOException {
        wk5.a aVar = new wk5.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.getClass();
            switch (nextName) {
                case "buildIdMappingForArch":
                    aVar.b(d(jsonReader, new io.reactivex.rxjava3.internal.operators.observable.q1(14)));
                    break;
                case "pid":
                    aVar.d(jsonReader.nextInt());
                    break;
                case "pss":
                    aVar.f(jsonReader.nextLong());
                    break;
                case "rss":
                    aVar.h(jsonReader.nextLong());
                    break;
                case "timestamp":
                    aVar.i(jsonReader.nextLong());
                    break;
                case "processName":
                    aVar.e(jsonReader.nextString());
                    break;
                case "reasonCode":
                    aVar.g(jsonReader.nextInt());
                    break;
                case "traceFile":
                    aVar.j(jsonReader.nextString());
                    break;
                case "importance":
                    aVar.c(jsonReader.nextInt());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return aVar.a();
    }

    @NonNull
    public static <T> List<T> d(@NonNull JsonReader jsonReader, @NonNull a<T> aVar) throws IOException {
        ArrayList arrayList = new ArrayList();
        jsonReader.beginArray();
        while (jsonReader.hasNext()) {
            arrayList.add(aVar.d(jsonReader));
        }
        jsonReader.endArray();
        return Collections.unmodifiableList(arrayList);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @NonNull
    public static fl5 e(@NonNull JsonReader jsonReader) throws IOException {
        char c;
        char c2;
        char c3;
        char c4;
        char c5;
        fl5.a aVar = new fl5.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.getClass();
            switch (nextName.hashCode()) {
                case -1335157162:
                    if (nextName.equals("device")) {
                        c = 0;
                        break;
                    }
                    c = 65535;
                    break;
                case -259312414:
                    if (nextName.equals("rollouts")) {
                        c = 1;
                        break;
                    }
                    c = 65535;
                    break;
                case 96801:
                    if (nextName.equals(MBridgeConstans.DYNAMIC_VIEW_WX_APP)) {
                        c = 2;
                        break;
                    }
                    c = 65535;
                    break;
                case 107332:
                    if (nextName.equals("log")) {
                        c = 3;
                        break;
                    }
                    c = 65535;
                    break;
                case 3575610:
                    if (nextName.equals("type")) {
                        c = 4;
                        break;
                    }
                    c = 65535;
                    break;
                case 55126294:
                    if (nextName.equals("timestamp")) {
                        c = 5;
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
                    ol5.a aVar2 = new ol5.a();
                    jsonReader.beginObject();
                    while (jsonReader.hasNext()) {
                        String nextName2 = jsonReader.nextName();
                        nextName2.getClass();
                        switch (nextName2.hashCode()) {
                            case -1708606089:
                                if (nextName2.equals(X3.j.Y)) {
                                    c2 = 0;
                                    break;
                                }
                                c2 = 65535;
                                break;
                            case -1455558134:
                                if (nextName2.equals("batteryVelocity")) {
                                    c2 = 1;
                                    break;
                                }
                                c2 = 65535;
                                break;
                            case -1439500848:
                                if (nextName2.equals(X3.i.n)) {
                                    c2 = 2;
                                    break;
                                }
                                c2 = 65535;
                                break;
                            case 279795450:
                                if (nextName2.equals("diskUsed")) {
                                    c2 = 3;
                                    break;
                                }
                                c2 = 65535;
                                break;
                            case 976541947:
                                if (nextName2.equals("ramUsed")) {
                                    c2 = 4;
                                    break;
                                }
                                c2 = 65535;
                                break;
                            case 1516795582:
                                if (nextName2.equals("proximityOn")) {
                                    c2 = 5;
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
                                aVar2.a = Double.valueOf(jsonReader.nextDouble());
                                break;
                            case 1:
                                aVar2.b = jsonReader.nextInt();
                                aVar2.g = (byte) (aVar2.g | 1);
                                break;
                            case 2:
                                aVar2.d = jsonReader.nextInt();
                                aVar2.g = (byte) (aVar2.g | 4);
                                break;
                            case 3:
                                aVar2.f = jsonReader.nextLong();
                                aVar2.g = (byte) (aVar2.g | AmfConstants.TYPE_TYPED_OBJECT_MARKER);
                                break;
                            case 4:
                                aVar2.e = jsonReader.nextLong();
                                aVar2.g = (byte) (aVar2.g | 8);
                                break;
                            case 5:
                                aVar2.c = jsonReader.nextBoolean();
                                aVar2.g = (byte) (aVar2.g | 2);
                                break;
                            default:
                                jsonReader.skipValue();
                                break;
                        }
                    }
                    jsonReader.endObject();
                    aVar.d = aVar2.a();
                    break;
                case 1:
                    sl5.a aVar3 = new sl5.a();
                    jsonReader.beginObject();
                    while (jsonReader.hasNext()) {
                        String nextName3 = jsonReader.nextName();
                        nextName3.getClass();
                        if (nextName3.equals("assignments")) {
                            aVar3.b(d(jsonReader, new ir(12)));
                        } else {
                            jsonReader.skipValue();
                        }
                    }
                    jsonReader.endObject();
                    aVar.f = aVar3.a();
                    break;
                case 2:
                    jsonReader.beginObject();
                    byte b = 0;
                    int i = 0;
                    hl5 hl5Var = null;
                    List list = null;
                    List list2 = null;
                    Boolean bool = null;
                    nl5 nl5Var = null;
                    List list3 = null;
                    while (jsonReader.hasNext()) {
                        String nextName4 = jsonReader.nextName();
                        nextName4.getClass();
                        switch (nextName4.hashCode()) {
                            case -1405314732:
                                if (nextName4.equals("appProcessDetails")) {
                                    c3 = 0;
                                    break;
                                }
                                c3 = 65535;
                                break;
                            case -1332194002:
                                if (nextName4.equals(L2.g)) {
                                    c3 = 1;
                                    break;
                                }
                                c3 = 65535;
                                break;
                            case -1090974952:
                                if (nextName4.equals("execution")) {
                                    c3 = 2;
                                    break;
                                }
                                c3 = 65535;
                                break;
                            case -80231855:
                                if (nextName4.equals("internalKeys")) {
                                    c3 = 3;
                                    break;
                                }
                                c3 = 65535;
                                break;
                            case 555169704:
                                if (nextName4.equals("customAttributes")) {
                                    c3 = 4;
                                    break;
                                }
                                c3 = 65535;
                                break;
                            case 928737948:
                                if (nextName4.equals("uiOrientation")) {
                                    c3 = 5;
                                    break;
                                }
                                c3 = 65535;
                                break;
                            case 1847730860:
                                if (nextName4.equals("currentProcessDetails")) {
                                    c3 = 6;
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
                                ArrayList arrayList = new ArrayList();
                                jsonReader.beginArray();
                                while (jsonReader.hasNext()) {
                                    arrayList.add(g(jsonReader));
                                }
                                jsonReader.endArray();
                                list3 = Collections.unmodifiableList(arrayList);
                            case 1:
                                bool = Boolean.valueOf(jsonReader.nextBoolean());
                            case 2:
                                jsonReader.beginObject();
                                List list4 = null;
                                jl5 jl5Var = null;
                                wk5 wk5Var = null;
                                kl5 kl5Var = null;
                                List list5 = null;
                                while (jsonReader.hasNext()) {
                                    String nextName5 = jsonReader.nextName();
                                    nextName5.getClass();
                                    switch (nextName5.hashCode()) {
                                        case -1375141843:
                                            if (nextName5.equals("appExitInfo")) {
                                                c4 = 0;
                                                break;
                                            }
                                            c4 = 65535;
                                            break;
                                        case -1337936983:
                                            if (nextName5.equals("threads")) {
                                                c4 = 1;
                                                break;
                                            }
                                            c4 = 65535;
                                            break;
                                        case -902467928:
                                            if (nextName5.equals("signal")) {
                                                c4 = 2;
                                                break;
                                            }
                                            c4 = 65535;
                                            break;
                                        case 937615455:
                                            if (nextName5.equals("binaries")) {
                                                c4 = 3;
                                                break;
                                            }
                                            c4 = 65535;
                                            break;
                                        case 1481625679:
                                            if (nextName5.equals(OkListenerKt.KEY_EXCEPTION)) {
                                                c4 = 4;
                                                break;
                                            }
                                            c4 = 65535;
                                            break;
                                        default:
                                            c4 = 65535;
                                            break;
                                    }
                                    switch (c4) {
                                        case 0:
                                            wk5Var = c(jsonReader);
                                        case 1:
                                            list4 = d(jsonReader, new l5k());
                                        case 2:
                                            jsonReader.beginObject();
                                            long j = 0;
                                            byte b2 = 0;
                                            String str = null;
                                            String str2 = null;
                                            while (jsonReader.hasNext()) {
                                                String nextName6 = jsonReader.nextName();
                                                nextName6.getClass();
                                                switch (nextName6.hashCode()) {
                                                    case -1147692044:
                                                        if (nextName6.equals(RTCStatsConstants.KEY_ADDRESS)) {
                                                            c5 = 0;
                                                            break;
                                                        }
                                                        c5 = 65535;
                                                        break;
                                                    case 3059181:
                                                        if (nextName6.equals("code")) {
                                                            c5 = 1;
                                                            break;
                                                        }
                                                        c5 = 65535;
                                                        break;
                                                    case 3373707:
                                                        if (nextName6.equals("name")) {
                                                            c5 = 2;
                                                            break;
                                                        }
                                                        c5 = 65535;
                                                        break;
                                                    default:
                                                        c5 = 65535;
                                                        break;
                                                }
                                                switch (c5) {
                                                    case 0:
                                                        b2 = (byte) (b2 | 1);
                                                        j = jsonReader.nextLong();
                                                        break;
                                                    case 1:
                                                        str2 = jsonReader.nextString();
                                                        if (str2 == null) {
                                                            throw new NullPointerException("Null code");
                                                        }
                                                        break;
                                                    case 2:
                                                        str = jsonReader.nextString();
                                                        if (str == null) {
                                                            throw new NullPointerException("Null name");
                                                        }
                                                        break;
                                                    default:
                                                        jsonReader.skipValue();
                                                        break;
                                                }
                                            }
                                            jsonReader.endObject();
                                            if (b2 != 1 || str == null || str2 == null) {
                                                StringBuilder sb = new StringBuilder();
                                                if (str == null) {
                                                    sb.append(" name");
                                                }
                                                if (str2 == null) {
                                                    sb.append(" code");
                                                }
                                                if ((b2 & 1) == 0) {
                                                    sb.append(" address");
                                                }
                                                throw new IllegalStateException(t9c.b("Missing required properties:", sb));
                                            }
                                            kl5Var = new kl5(str, str2, j);
                                            break;
                                        case 3:
                                            list5 = d(jsonReader, new m5k());
                                            if (list5 == null) {
                                                throw new NullPointerException("Null binaries");
                                            }
                                        case 4:
                                            jl5Var = f(jsonReader);
                                        default:
                                            jsonReader.skipValue();
                                    }
                                }
                                jsonReader.endObject();
                                if (kl5Var == null || list5 == null) {
                                    StringBuilder sb2 = new StringBuilder();
                                    if (kl5Var == null) {
                                        sb2.append(" signal");
                                    }
                                    if (list5 == null) {
                                        sb2.append(" binaries");
                                    }
                                    throw new IllegalStateException(t9c.b("Missing required properties:", sb2));
                                }
                                hl5Var = new hl5(list4, jl5Var, wk5Var, kl5Var, list5);
                                break;
                            case 3:
                                ArrayList arrayList2 = new ArrayList();
                                jsonReader.beginArray();
                                while (jsonReader.hasNext()) {
                                    arrayList2.add(b(jsonReader));
                                }
                                jsonReader.endArray();
                                list2 = Collections.unmodifiableList(arrayList2);
                            case 4:
                                ArrayList arrayList3 = new ArrayList();
                                jsonReader.beginArray();
                                while (jsonReader.hasNext()) {
                                    arrayList3.add(b(jsonReader));
                                }
                                jsonReader.endArray();
                                list = Collections.unmodifiableList(arrayList3);
                            case 5:
                                i = jsonReader.nextInt();
                                b = (byte) 1;
                            case 6:
                                nl5Var = g(jsonReader);
                            default:
                                jsonReader.skipValue();
                        }
                    }
                    jsonReader.endObject();
                    if (b == 1 && hl5Var != null) {
                        aVar.c = new gl5(hl5Var, list, list2, bool, nl5Var, list3, i);
                        break;
                    } else {
                        StringBuilder sb3 = new StringBuilder();
                        if (hl5Var == null) {
                            sb3.append(" execution");
                        }
                        if (b == 0) {
                            sb3.append(" uiOrientation");
                        }
                        throw new IllegalStateException(t9c.b("Missing required properties:", sb3));
                    }
                case 3:
                    jsonReader.beginObject();
                    String str3 = null;
                    while (jsonReader.hasNext()) {
                        if (jsonReader.nextName().equals(HandleInvocationsFromAdViewer.KEY_PRIVACY_UPDATE_CONTENT)) {
                            String nextString = jsonReader.nextString();
                            if (nextString == null) {
                                throw new NullPointerException("Null content");
                            }
                            str3 = nextString;
                        } else {
                            jsonReader.skipValue();
                        }
                    }
                    jsonReader.endObject();
                    if (str3 == null) {
                        throw new IllegalStateException("Missing required properties: content");
                    }
                    aVar.e = new pl5(str3);
                    break;
                case 4:
                    String nextString2 = jsonReader.nextString();
                    if (nextString2 == null) {
                        throw new NullPointerException("Null type");
                    }
                    aVar.b = nextString2;
                    break;
                case 5:
                    aVar.a = jsonReader.nextLong();
                    aVar.g = (byte) (aVar.g | 1);
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return aVar.a();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x004a, code lost:
    
        if (r2.equals("reason") == false) goto L7;
     */
    @NonNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static jl5 f(@NonNull JsonReader jsonReader) throws IOException {
        jsonReader.beginObject();
        int i = 0;
        String str = null;
        String str2 = null;
        List list = null;
        jl5 jl5Var = null;
        byte b = 0;
        while (true) {
            char c = 1;
            if (!jsonReader.hasNext()) {
                jsonReader.endObject();
                if (b == 1 && str != null && list != null) {
                    return new jl5(str, str2, list, jl5Var, i);
                }
                StringBuilder sb = new StringBuilder();
                if (str == null) {
                    sb.append(" type");
                }
                if (list == null) {
                    sb.append(" frames");
                }
                if ((b & 1) == 0) {
                    sb.append(" overflowCount");
                }
                throw new IllegalStateException(t9c.b("Missing required properties:", sb));
            }
            String nextName = jsonReader.nextName();
            nextName.getClass();
            switch (nextName.hashCode()) {
                case -1266514778:
                    if (nextName.equals(com.mbridge.msdk.foundation.entity.b.JSON_KEY_FRAME_ADS)) {
                        c = 0;
                        break;
                    }
                    c = 65535;
                    break;
                case -934964668:
                    break;
                case 3575610:
                    if (nextName.equals("type")) {
                        c = 2;
                        break;
                    }
                    c = 65535;
                    break;
                case 91997906:
                    if (nextName.equals("causedBy")) {
                        c = 3;
                        break;
                    }
                    c = 65535;
                    break;
                case 581754413:
                    if (nextName.equals("overflowCount")) {
                        c = 4;
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
                    List d = d(jsonReader, new n5k());
                    if (d == null) {
                        throw new NullPointerException("Null frames");
                    }
                    list = d;
                    break;
                case 1:
                    str2 = jsonReader.nextString();
                    break;
                case 2:
                    String nextString = jsonReader.nextString();
                    if (nextString == null) {
                        throw new NullPointerException("Null type");
                    }
                    str = nextString;
                    break;
                case 3:
                    jl5Var = f(jsonReader);
                    break;
                case 4:
                    i = jsonReader.nextInt();
                    b = (byte) (b | 1);
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
    }

    @NonNull
    public static nl5 g(@NonNull JsonReader jsonReader) throws IOException {
        nl5.a aVar = new nl5.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.getClass();
            switch (nextName) {
                case "pid":
                    aVar.b = jsonReader.nextInt();
                    aVar.e = (byte) (aVar.e | 1);
                    break;
                case "processName":
                    String nextString = jsonReader.nextString();
                    if (nextString == null) {
                        throw new NullPointerException("Null processName");
                    }
                    aVar.a = nextString;
                    break;
                case "defaultProcess":
                    aVar.d = jsonReader.nextBoolean();
                    aVar.e = (byte) (aVar.e | 4);
                    break;
                case "importance":
                    aVar.c = jsonReader.nextInt();
                    aVar.e = (byte) (aVar.e | 2);
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return aVar.a();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @NonNull
    public static uk5 h(@NonNull JsonReader jsonReader) throws IOException {
        char c;
        char c2;
        char c3;
        char c4;
        char c5;
        Charset charset = j5k.a;
        uk5.a aVar = new uk5.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.getClass();
            int i = 8;
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
                    zk5.a aVar2 = new zk5.a();
                    jsonReader.beginObject();
                    while (jsonReader.hasNext()) {
                        String nextName2 = jsonReader.nextName();
                        nextName2.getClass();
                        if (nextName2.equals("files")) {
                            aVar2.b(d(jsonReader, new hr(i)));
                        } else if (nextName2.equals("orgId")) {
                            aVar2.c(jsonReader.nextString());
                        } else {
                            jsonReader.skipValue();
                        }
                    }
                    jsonReader.endObject();
                    aVar.k = aVar2.a();
                    continue;
                case 1:
                    String nextString = jsonReader.nextString();
                    if (nextString == null) {
                        throw new NullPointerException("Null sdkVersion");
                    }
                    aVar.a = nextString;
                    break;
                case 2:
                    aVar.g = jsonReader.nextString();
                    break;
                case 3:
                    aVar.l = c(jsonReader);
                    break;
                case 4:
                    String nextString2 = jsonReader.nextString();
                    if (nextString2 == null) {
                        throw new NullPointerException("Null buildVersion");
                    }
                    aVar.h = nextString2;
                    break;
                case 5:
                    aVar.f = jsonReader.nextString();
                    break;
                case 6:
                    String nextString3 = jsonReader.nextString();
                    if (nextString3 == null) {
                        throw new NullPointerException("Null gmpAppId");
                    }
                    aVar.b = nextString3;
                    break;
                case 7:
                    String nextString4 = jsonReader.nextString();
                    if (nextString4 == null) {
                        throw new NullPointerException("Null installationUuid");
                    }
                    aVar.d = nextString4;
                    break;
                case '\b':
                    aVar.e = jsonReader.nextString();
                    break;
                case '\t':
                    aVar.c = jsonReader.nextInt();
                    aVar.m = (byte) (aVar.m | 1);
                    break;
                case '\n':
                    String nextString5 = jsonReader.nextString();
                    if (nextString5 == null) {
                        throw new NullPointerException("Null displayVersion");
                    }
                    aVar.i = nextString5;
                    break;
                case 11:
                    bl5.a aVar3 = new bl5.a();
                    aVar3.f = false;
                    aVar3.m = (byte) (aVar3.m | 2);
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
                                if (nextName3.equals(O6.F)) {
                                    c2 = 6;
                                    break;
                                }
                                c2 = 65535;
                                break;
                            case 96801:
                                if (nextName3.equals(MBridgeConstans.DYNAMIC_VIEW_WX_APP)) {
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
                                aVar3.d = jsonReader.nextLong();
                                aVar3.m = (byte) (aVar3.m | 1);
                                break;
                            case 1:
                                aVar3.c = jsonReader.nextString();
                                break;
                            case 2:
                                aVar3.b = new String(Base64.decode(jsonReader.nextString(), 2), j5k.a);
                                break;
                            case 3:
                                aVar3.e = Long.valueOf(jsonReader.nextLong());
                                break;
                            case 4:
                                el5.a aVar4 = new el5.a();
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
                                            if (nextName4.equals("state")) {
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
                                            aVar4.f = jsonReader.nextBoolean();
                                            aVar4.j = (byte) (aVar4.j | AmfConstants.TYPE_TYPED_OBJECT_MARKER);
                                            break;
                                        case 1:
                                            String nextString6 = jsonReader.nextString();
                                            if (nextString6 == null) {
                                                throw new NullPointerException("Null manufacturer");
                                            }
                                            aVar4.h = nextString6;
                                            break;
                                        case 2:
                                            aVar4.d = jsonReader.nextLong();
                                            aVar4.j = (byte) (aVar4.j | 4);
                                            break;
                                        case 3:
                                            aVar4.a = jsonReader.nextInt();
                                            aVar4.j = (byte) (aVar4.j | 1);
                                            break;
                                        case 4:
                                            aVar4.e = jsonReader.nextLong();
                                            aVar4.j = (byte) (aVar4.j | 8);
                                            break;
                                        case 5:
                                            aVar4.c = jsonReader.nextInt();
                                            aVar4.j = (byte) (aVar4.j | 2);
                                            break;
                                        case 6:
                                            String nextString7 = jsonReader.nextString();
                                            if (nextString7 == null) {
                                                throw new NullPointerException("Null model");
                                            }
                                            aVar4.b = nextString7;
                                            break;
                                        case 7:
                                            aVar4.g = jsonReader.nextInt();
                                            aVar4.j = (byte) (aVar4.j | 32);
                                            break;
                                        case '\b':
                                            String nextString8 = jsonReader.nextString();
                                            if (nextString8 == null) {
                                                throw new NullPointerException("Null modelClass");
                                            }
                                            aVar4.i = nextString8;
                                            break;
                                        default:
                                            jsonReader.skipValue();
                                            break;
                                    }
                                }
                                jsonReader.endObject();
                                aVar3.j = aVar4.a();
                                break;
                            case 5:
                                ArrayList arrayList = new ArrayList();
                                jsonReader.beginArray();
                                while (jsonReader.hasNext()) {
                                    arrayList.add(e(jsonReader));
                                }
                                jsonReader.endArray();
                                aVar3.k = Collections.unmodifiableList(arrayList);
                                break;
                            case 6:
                                tl5.a aVar5 = new tl5.a();
                                jsonReader.beginObject();
                                while (jsonReader.hasNext()) {
                                    String nextName5 = jsonReader.nextName();
                                    nextName5.getClass();
                                    switch (nextName5.hashCode()) {
                                        case -911706486:
                                            if (nextName5.equals("buildVersion")) {
                                                c4 = 0;
                                                break;
                                            }
                                            c4 = 65535;
                                            break;
                                        case -293026577:
                                            if (nextName5.equals("jailbroken")) {
                                                c4 = 1;
                                                break;
                                            }
                                            c4 = 65535;
                                            break;
                                        case 351608024:
                                            if (nextName5.equals("version")) {
                                                c4 = 2;
                                                break;
                                            }
                                            c4 = 65535;
                                            break;
                                        case 1874684019:
                                            if (nextName5.equals("platform")) {
                                                c4 = 3;
                                                break;
                                            }
                                            c4 = 65535;
                                            break;
                                        default:
                                            c4 = 65535;
                                            break;
                                    }
                                    switch (c4) {
                                        case 0:
                                            String nextString9 = jsonReader.nextString();
                                            if (nextString9 == null) {
                                                throw new NullPointerException("Null buildVersion");
                                            }
                                            aVar5.c = nextString9;
                                            break;
                                        case 1:
                                            aVar5.d = jsonReader.nextBoolean();
                                            aVar5.e = (byte) (aVar5.e | 2);
                                            break;
                                        case 2:
                                            String nextString10 = jsonReader.nextString();
                                            if (nextString10 == null) {
                                                throw new NullPointerException("Null version");
                                            }
                                            aVar5.b = nextString10;
                                            break;
                                        case 3:
                                            aVar5.a = jsonReader.nextInt();
                                            aVar5.e = (byte) (aVar5.e | 1);
                                            break;
                                        default:
                                            jsonReader.skipValue();
                                            break;
                                    }
                                }
                                jsonReader.endObject();
                                aVar3.i = aVar5.a();
                                break;
                            case 7:
                                jsonReader.beginObject();
                                String str = null;
                                String str2 = null;
                                String str3 = null;
                                String str4 = null;
                                String str5 = null;
                                String str6 = null;
                                while (jsonReader.hasNext()) {
                                    String nextName6 = jsonReader.nextName();
                                    nextName6.getClass();
                                    switch (nextName6.hashCode()) {
                                        case -1618432855:
                                            if (nextName6.equals("identifier")) {
                                                c5 = 0;
                                                break;
                                            }
                                            c5 = 65535;
                                            break;
                                        case -519438642:
                                            if (nextName6.equals("developmentPlatform")) {
                                                c5 = 1;
                                                break;
                                            }
                                            c5 = 65535;
                                            break;
                                        case 213652010:
                                            if (nextName6.equals("developmentPlatformVersion")) {
                                                c5 = 2;
                                                break;
                                            }
                                            c5 = 65535;
                                            break;
                                        case 351608024:
                                            if (nextName6.equals("version")) {
                                                c5 = 3;
                                                break;
                                            }
                                            c5 = 65535;
                                            break;
                                        case 719853845:
                                            if (nextName6.equals("installationUuid")) {
                                                c5 = 4;
                                                break;
                                            }
                                            c5 = 65535;
                                            break;
                                        case 1975623094:
                                            if (nextName6.equals("displayVersion")) {
                                                c5 = 5;
                                                break;
                                            }
                                            c5 = 65535;
                                            break;
                                        default:
                                            c5 = 65535;
                                            break;
                                    }
                                    switch (c5) {
                                        case 0:
                                            String nextString11 = jsonReader.nextString();
                                            if (nextString11 == null) {
                                                throw new NullPointerException("Null identifier");
                                            }
                                            str = nextString11;
                                            break;
                                        case 1:
                                            str5 = jsonReader.nextString();
                                            break;
                                        case 2:
                                            str6 = jsonReader.nextString();
                                            break;
                                        case 3:
                                            String nextString12 = jsonReader.nextString();
                                            if (nextString12 == null) {
                                                throw new NullPointerException("Null version");
                                            }
                                            str2 = nextString12;
                                            break;
                                        case 4:
                                            str4 = jsonReader.nextString();
                                            break;
                                        case 5:
                                            str3 = jsonReader.nextString();
                                            break;
                                        default:
                                            jsonReader.skipValue();
                                            break;
                                    }
                                }
                                jsonReader.endObject();
                                if (str != null && str2 != null) {
                                    aVar3.g = new cl5(str, str2, str3, str4, str5, str6);
                                    break;
                                } else {
                                    StringBuilder sb = new StringBuilder();
                                    if (str == null) {
                                        sb.append(" identifier");
                                    }
                                    if (str2 == null) {
                                        sb.append(" version");
                                    }
                                    throw new IllegalStateException(t9c.b("Missing required properties:", sb));
                                }
                                break;
                            case '\b':
                                jsonReader.beginObject();
                                String str7 = null;
                                while (jsonReader.hasNext()) {
                                    if (jsonReader.nextName().equals("identifier")) {
                                        str7 = jsonReader.nextString();
                                        if (str7 == null) {
                                            throw new NullPointerException("Null identifier");
                                        }
                                    } else {
                                        jsonReader.skipValue();
                                    }
                                }
                                jsonReader.endObject();
                                if (str7 == null) {
                                    throw new IllegalStateException("Missing required properties: identifier");
                                }
                                aVar3.h = new ul5(str7);
                                break;
                            case '\t':
                                String nextString13 = jsonReader.nextString();
                                if (nextString13 == null) {
                                    throw new NullPointerException("Null generator");
                                }
                                aVar3.a = nextString13;
                                break;
                            case '\n':
                                aVar3.f = jsonReader.nextBoolean();
                                aVar3.m = (byte) (aVar3.m | 2);
                                break;
                            case 11:
                                aVar3.l = jsonReader.nextInt();
                                aVar3.m = (byte) (aVar3.m | 4);
                                break;
                            default:
                                jsonReader.skipValue();
                                break;
                        }
                    }
                    jsonReader.endObject();
                    aVar.j = aVar3.a();
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return aVar.a();
    }

    @NonNull
    public static uk5 i(@NonNull String str) throws IOException {
        try {
            JsonReader jsonReader = new JsonReader(new StringReader(str));
            try {
                uk5 h = h(jsonReader);
                jsonReader.close();
                return h;
            } finally {
            }
        } catch (IllegalStateException e) {
            throw new IOException(e);
        }
    }
}

package xsna;

import android.util.JsonReader;
import java.util.List;
import xsna.o5k;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class l5k implements o5k.a {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0031, code lost:
    
        if (r5.equals("name") == false) goto L7;
     */
    @Override // xsna.o5k.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(JsonReader jsonReader) {
        jsonReader.beginObject();
        String str = null;
        byte b = 0;
        int i = 0;
        List list = null;
        while (true) {
            char c = 1;
            if (!jsonReader.hasNext()) {
                jsonReader.endObject();
                if (b == 1 && str != null && list != null) {
                    return new ll5(str, i, list);
                }
                StringBuilder sb = new StringBuilder();
                if (str == null) {
                    sb.append(" name");
                }
                if ((b & 1) == 0) {
                    sb.append(" importance");
                }
                if (list == null) {
                    sb.append(" frames");
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
                case 3373707:
                    break;
                case 2125650548:
                    if (nextName.equals("importance")) {
                        c = 2;
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
                    list = o5k.d(jsonReader, new n5k());
                    if (list == null) {
                        throw new NullPointerException("Null frames");
                    }
                    break;
                case 1:
                    str = jsonReader.nextString();
                    if (str == null) {
                        throw new NullPointerException("Null name");
                    }
                    break;
                case 2:
                    i = jsonReader.nextInt();
                    b = (byte) (b | 1);
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
    }
}

package xsna;

import android.util.Base64;
import android.util.JsonReader;
import xsna.o5k;
import xsna.yrl;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class m5k implements o5k.a, io.reactivex.rxjava3.functions.m, yrl.a {
    public static String b(Throwable th, StringBuilder sb) {
        sb.append(th.getMessage());
        return sb.toString();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x002b, code lost:
    
        if (r1.equals("baseAddress") == false) goto L7;
     */
    @Override // xsna.o5k.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object d(JsonReader jsonReader) {
        jsonReader.beginObject();
        String str = null;
        String str2 = null;
        long j = 0;
        long j2 = 0;
        byte b = 0;
        while (true) {
            char c = 3;
            if (!jsonReader.hasNext()) {
                jsonReader.endObject();
                if (b == 3 && str != null) {
                    return new il5(j, j2, str, str2);
                }
                StringBuilder sb = new StringBuilder();
                if ((b & 1) == 0) {
                    sb.append(" baseAddress");
                }
                if ((b & 2) == 0) {
                    sb.append(" size");
                }
                if (str == null) {
                    sb.append(" name");
                }
                throw new IllegalStateException(t9c.b("Missing required properties:", sb));
            }
            String nextName = jsonReader.nextName();
            nextName.getClass();
            switch (nextName.hashCode()) {
                case 3373707:
                    if (nextName.equals("name")) {
                        c = 0;
                        break;
                    }
                    c = 65535;
                    break;
                case 3530753:
                    if (nextName.equals("size")) {
                        c = 1;
                        break;
                    }
                    c = 65535;
                    break;
                case 3601339:
                    if (nextName.equals("uuid")) {
                        c = 2;
                        break;
                    }
                    c = 65535;
                    break;
                case 1153765347:
                    break;
                default:
                    c = 65535;
                    break;
            }
            switch (c) {
                case 0:
                    String nextString = jsonReader.nextString();
                    if (nextString == null) {
                        throw new NullPointerException("Null name");
                    }
                    str = nextString;
                    break;
                case 1:
                    b = (byte) (b | 2);
                    j2 = jsonReader.nextLong();
                    break;
                case 2:
                    str2 = new String(Base64.decode(jsonReader.nextString(), 2), j5k.a);
                    break;
                case 3:
                    b = (byte) (b | 1);
                    j = jsonReader.nextLong();
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
    }

    @Override // io.reactivex.rxjava3.functions.m
    public boolean test(Object obj) {
        Boolean bool = (Boolean) obj;
        bool.booleanValue();
        return bool.booleanValue();
    }

    @Override // xsna.yrl.a
    public void a(f9e0 f9e0Var) {
    }
}

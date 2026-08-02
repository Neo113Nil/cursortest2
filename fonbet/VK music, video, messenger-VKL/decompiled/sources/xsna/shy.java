package xsna;

import com.google.crypto.tink.shaded.protobuf.CodedOutputStream;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class shy {
    public static int a(int i, int i2, int i3) {
        return (Integer.hashCode(i) + i2) * i3;
    }

    public static int b(int i, int i2, int i3, int i4) {
        return CodedOutputStream.p(i) + i2 + i3 + i4;
    }

    public static String c(float f, String str, StringBuilder sb) {
        sb.append(f);
        sb.append(str);
        return sb.toString();
    }
}

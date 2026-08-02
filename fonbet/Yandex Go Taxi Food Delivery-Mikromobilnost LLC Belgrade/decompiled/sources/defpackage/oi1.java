package defpackage;

import com.google.crypto.tink.proto.OutputPrefixType;
import java.util.Collections;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public abstract class oi1 {
    public static final md90 a;
    public static final ld90 b;
    public static final bjx c;
    public static final qix d;
    public static final Map e;
    public static final Map f;

    static {
        u77 b2 = rw21.b("type.googleapis.com/google.crypto.tink.AesSivKey");
        a = new md90(ni1.class);
        b = new ld90(b2);
        c = new bjx(ii1.class);
        d = new qix(b2, new xfo(17));
        HashMap hashMap = new HashMap();
        OutputPrefixType outputPrefixType = OutputPrefixType.RAW;
        mi1 mi1Var = mi1.d;
        hashMap.put(mi1Var, outputPrefixType);
        OutputPrefixType outputPrefixType2 = OutputPrefixType.TINK;
        mi1 mi1Var2 = mi1.b;
        hashMap.put(mi1Var2, outputPrefixType2);
        OutputPrefixType outputPrefixType3 = OutputPrefixType.CRUNCHY;
        mi1 mi1Var3 = mi1.c;
        hashMap.put(mi1Var3, outputPrefixType3);
        e = Collections.unmodifiableMap(hashMap);
        EnumMap enumMap = new EnumMap(OutputPrefixType.class);
        enumMap.put((EnumMap) outputPrefixType, (OutputPrefixType) mi1Var);
        enumMap.put((EnumMap) outputPrefixType2, (OutputPrefixType) mi1Var2);
        enumMap.put((EnumMap) outputPrefixType3, (OutputPrefixType) mi1Var3);
        enumMap.put((EnumMap) OutputPrefixType.LEGACY, (OutputPrefixType) mi1Var3);
        f = Collections.unmodifiableMap(enumMap);
    }
}

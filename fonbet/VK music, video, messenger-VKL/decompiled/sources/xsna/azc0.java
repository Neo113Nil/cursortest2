package xsna;

import androidx.datastore.core.CorruptionException;
import androidx.datastore.preferences.PreferencesProto$Value;
import androidx.datastore.preferences.a;
import androidx.datastore.preferences.protobuf.ByteString;
import androidx.datastore.preferences.protobuf.CodedOutputStream;
import androidx.datastore.preferences.protobuf.InvalidProtocolBufferException;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.logging.Logger;
import kotlin.NoWhenBranchMatchedException;
import xsna.d8f0;
import xsna.d8f0.a;
import xsna.e8f0.a;
import xsna.uyc0;
import xsna.zyc0;

/* compiled from: PreferencesSerializer.jvm.kt */
/* loaded from: classes.dex */
public final class azc0 implements vy70<uyc0> {
    public static final azc0 a = new azc0();

    /* compiled from: PreferencesSerializer.jvm.kt */
    public /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[PreferencesProto$Value.ValueCase.values().length];
            try {
                iArr[PreferencesProto$Value.ValueCase.BOOLEAN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PreferencesProto$Value.ValueCase.FLOAT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[PreferencesProto$Value.ValueCase.DOUBLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[PreferencesProto$Value.ValueCase.INTEGER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[PreferencesProto$Value.ValueCase.LONG.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[PreferencesProto$Value.ValueCase.STRING.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[PreferencesProto$Value.ValueCase.STRING_SET.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[PreferencesProto$Value.ValueCase.BYTES.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[PreferencesProto$Value.ValueCase.VALUE_NOT_SET.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Override // xsna.vy70
    public final nh50 a(e8f0 e8f0Var) throws IOException, CorruptionException {
        byte[] bArr;
        try {
            zyc0 r = zyc0.r(e8f0Var.new a());
            nh50 a2 = vyc0.a(new uyc0.b[0]);
            for (Map.Entry<String, PreferencesProto$Value> entry : r.p().entrySet()) {
                String key = entry.getKey();
                PreferencesProto$Value value = entry.getValue();
                PreferencesProto$Value.ValueCase F = value.F();
                switch (F == null ? -1 : a.$EnumSwitchMapping$0[F.ordinal()]) {
                    case -1:
                        throw new CorruptionException("Value case is null.", null);
                    case 0:
                    default:
                        throw new NoWhenBranchMatchedException();
                    case 1:
                        a2.d(new uyc0.a<>(key), Boolean.valueOf(value.w()));
                        break;
                    case 2:
                        a2.d(new uyc0.a<>(key), Float.valueOf(value.A()));
                        break;
                    case 3:
                        a2.d(new uyc0.a<>(key), Double.valueOf(value.z()));
                        break;
                    case 4:
                        a2.d(new uyc0.a<>(key), Integer.valueOf(value.B()));
                        break;
                    case 5:
                        a2.d(new uyc0.a<>(key), Long.valueOf(value.C()));
                        break;
                    case 6:
                        a2.d(new uyc0.a<>(key), value.D());
                        break;
                    case 7:
                        a2.d(new uyc0.a<>(key), j5g.S0(value.E().q()));
                        break;
                    case 8:
                        uyc0.a<?> aVar = new uyc0.a<>(key);
                        ByteString x = value.x();
                        int size = x.size();
                        if (size == 0) {
                            bArr = androidx.datastore.preferences.protobuf.p.b;
                        } else {
                            byte[] bArr2 = new byte[size];
                            x.f(size, bArr2);
                            bArr = bArr2;
                        }
                        a2.d(aVar, bArr);
                        break;
                    case 9:
                        throw new CorruptionException("Value not set.", null);
                }
            }
            return new nh50(new LinkedHashMap(a2.a()), true);
        } catch (InvalidProtocolBufferException e) {
            throw new CorruptionException("Unable to parse preferences proto.", e);
        }
    }

    @Override // xsna.vy70
    public final s3q0 b(Object obj, d8f0 d8f0Var) {
        PreferencesProto$Value e;
        Map<uyc0.a<?>, Object> a2 = ((uyc0) obj).a();
        zyc0.a q = zyc0.q();
        for (Map.Entry<uyc0.a<?>, Object> entry : a2.entrySet()) {
            uyc0.a<?> key = entry.getKey();
            Object value = entry.getValue();
            String str = key.a;
            if (value instanceof Boolean) {
                PreferencesProto$Value.a G = PreferencesProto$Value.G();
                boolean booleanValue = ((Boolean) value).booleanValue();
                G.j();
                PreferencesProto$Value.t((PreferencesProto$Value) G.c, booleanValue);
                e = G.e();
            } else if (value instanceof Float) {
                PreferencesProto$Value.a G2 = PreferencesProto$Value.G();
                float floatValue = ((Number) value).floatValue();
                G2.j();
                PreferencesProto$Value.u((PreferencesProto$Value) G2.c, floatValue);
                e = G2.e();
            } else if (value instanceof Double) {
                PreferencesProto$Value.a G3 = PreferencesProto$Value.G();
                double doubleValue = ((Number) value).doubleValue();
                G3.j();
                PreferencesProto$Value.q((PreferencesProto$Value) G3.c, doubleValue);
                e = G3.e();
            } else if (value instanceof Integer) {
                PreferencesProto$Value.a G4 = PreferencesProto$Value.G();
                int intValue = ((Number) value).intValue();
                G4.j();
                PreferencesProto$Value.v((PreferencesProto$Value) G4.c, intValue);
                e = G4.e();
            } else if (value instanceof Long) {
                PreferencesProto$Value.a G5 = PreferencesProto$Value.G();
                long longValue = ((Number) value).longValue();
                G5.j();
                PreferencesProto$Value.n((PreferencesProto$Value) G5.c, longValue);
                e = G5.e();
            } else if (value instanceof String) {
                PreferencesProto$Value.a G6 = PreferencesProto$Value.G();
                G6.j();
                PreferencesProto$Value.o((PreferencesProto$Value) G6.c, (String) value);
                e = G6.e();
            } else if (value instanceof Set) {
                PreferencesProto$Value.a G7 = PreferencesProto$Value.G();
                a.C0026a r = androidx.datastore.preferences.a.r();
                r.k((Set) value);
                G7.j();
                PreferencesProto$Value.p((PreferencesProto$Value) G7.c, r.e());
                e = G7.e();
            } else {
                if (!(value instanceof byte[])) {
                    throw new IllegalStateException("PreferencesSerializer does not support type: ".concat(value.getClass().getName()));
                }
                PreferencesProto$Value.a G8 = PreferencesProto$Value.G();
                byte[] bArr = (byte[]) value;
                ByteString.g gVar = ByteString.b;
                ByteString.g e2 = ByteString.e(0, bArr.length, bArr);
                G8.j();
                PreferencesProto$Value.r((PreferencesProto$Value) G8.c, e2);
                e = G8.e();
            }
            q.getClass();
            q.j();
            zyc0.o((zyc0) q.c).put(str, e);
        }
        zyc0 e3 = q.e();
        d8f0.a aVar = d8f0Var.new a();
        int d = e3.d(null);
        Logger logger = CodedOutputStream.d;
        if (d > 4096) {
            d = 4096;
        }
        CodedOutputStream.c cVar = new CodedOutputStream.c(aVar, d);
        e3.b(cVar);
        if (cVar.h > 0) {
            cVar.S();
        }
        return s3q0.a;
    }

    @Override // xsna.vy70
    public final nh50 getDefaultValue() {
        return new nh50(true, 1);
    }
}

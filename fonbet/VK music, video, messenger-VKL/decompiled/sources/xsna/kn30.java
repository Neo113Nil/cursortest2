package xsna;

import java.math.BigInteger;
import java.nio.ByteBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CodingErrorAction;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;
import org.msgpack.core.MessageFormat;
import org.msgpack.core.MessageStringCodingException;
import org.msgpack.value.ValueType;
import xsna.dpw;
import xsna.wnw;

/* compiled from: MsgPackJsonExt.kt */
/* loaded from: classes3.dex */
public final class kn30 {

    /* compiled from: MsgPackJsonExt.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[MessageFormat.values().length];
            try {
                iArr[MessageFormat.INT8.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[MessageFormat.INT16.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[MessageFormat.INT32.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[ValueType.values().length];
            try {
                iArr2[ValueType.MAP.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[ValueType.ARRAY.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[ValueType.STRING.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[ValueType.FLOAT.ordinal()] = 4;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[ValueType.BOOLEAN.ordinal()] = 5;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr2[ValueType.INTEGER.ordinal()] = 6;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr2[ValueType.NIL.ordinal()] = 7;
            } catch (NoSuchFieldError unused10) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public static final JSONObject a(bm00 bm00Var) {
        dpw.c c = bm00Var.c();
        LinkedHashMap linkedHashMap = new LinkedHashMap(on00.e(c.size()));
        Iterator<T> it = c.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            mpw e = e((kjr0) entry.getKey());
            linkedHashMap.put(e != null ? d(e) : null, entry.getValue());
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(on00.e(linkedHashMap.size()));
        for (Map.Entry entry2 : linkedHashMap.entrySet()) {
            linkedHashMap2.put(entry2.getKey(), b((kjr0) entry2.getValue(), false));
        }
        return new JSONObject(linkedHashMap2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:45:0x00c2, code lost:
    
        if (r7 == null) goto L56;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object b(kjr0 kjr0Var, boolean z) {
        ph50 ph50Var;
        fh50 fh50Var;
        ValueType h = kjr0Var.h();
        int i = 0;
        switch (h == null ? -1 : a.$EnumSwitchMapping$1[h.ordinal()]) {
            case 1:
                if (!z) {
                    return a(kjr0Var.d());
                }
                bm00 d = kjr0Var.d();
                int length = ((dpw) d).b.length / 2;
                if (length == 0) {
                    ph50Var = h5h0.b;
                } else {
                    kjr0[] kjr0VarArr = ((dpw) d).b;
                    kjr0[] kjr0VarArr2 = (kjr0[]) Arrays.copyOf(kjr0VarArr, kjr0VarArr.length);
                    ph50 ph50Var2 = new ph50(length);
                    int length2 = kjr0VarArr2.length - 1;
                    while (i <= length2) {
                        mpw e = e(kjr0VarArr2[i]);
                        String d2 = e != null ? d(e) : null;
                        int i2 = i + 1;
                        if (d2 != null && i2 <= length2) {
                            ph50Var2.p(d2, b(kjr0VarArr2[i2], true));
                        }
                        i += 2;
                    }
                    ph50Var = ph50Var2;
                }
                return new jn30((g5h0<String, Object>) ph50Var);
            case 2:
                if (!z) {
                    wnw.a aVar = new wnw.a(((wnw) kjr0Var.m()).b);
                    ArrayList arrayList = new ArrayList(c5g.u(aVar, 10));
                    Iterator<kjr0> it = aVar.iterator();
                    while (it.hasNext()) {
                        arrayList.add(b(it.next(), false));
                    }
                    return new JSONArray((Collection) arrayList);
                }
                vnw m = kjr0Var.m();
                if (m != null) {
                    kjr0[] kjr0VarArr3 = ((wnw) m).b;
                    int length3 = kjr0VarArr3.length;
                    if (length3 != 0) {
                        fh50 fh50Var2 = new fh50(length3);
                        while (i < length3) {
                            kjr0 kjr0Var2 = kjr0VarArr3[i];
                            fh50Var2.j(kjr0Var2 != null ? b(kjr0Var2, true) : null);
                            i++;
                        }
                        fh50Var = fh50Var2;
                        break;
                    } else {
                        fh50Var = sp70.b;
                        break;
                    }
                }
                fh50Var = sp70.b;
                return new in30(fh50Var);
            case 3:
                return d(kjr0Var.x());
            case 4:
                return Double.valueOf(kjr0Var.G().b);
            case 5:
                return Boolean.valueOf(kjr0Var.y().b);
            case 6:
                sow g = kjr0Var.g();
                BigInteger bigInteger = xnw.c;
                MessageFormat messageFormat = g.C() ? MessageFormat.INT8 : g.z() ? MessageFormat.INT16 : g.u() ? MessageFormat.INT32 : g.r() ? MessageFormat.INT64 : MessageFormat.UINT64;
                int i3 = messageFormat != null ? a.$EnumSwitchMapping$0[messageFormat.ordinal()] : -1;
                return (i3 == 1 || i3 == 2 || i3 == 3) ? Integer.valueOf(g.o()) : Long.valueOf(g.e());
            case 7:
                return null;
            default:
                throw new UnsupportedOperationException(kjr0Var.h().name());
        }
    }

    public static final String c(byte[] bArr) {
        try {
            try {
                CharsetDecoder newDecoder = org.msgpack.core.b.a.newDecoder();
                CodingErrorAction codingErrorAction = CodingErrorAction.REPORT;
                return newDecoder.onMalformedInput(codingErrorAction).onUnmappableCharacter(codingErrorAction).decode(ByteBuffer.wrap(bArr).asReadOnlyBuffer()).toString();
            } catch (CharacterCodingException e) {
                throw new MessageStringCodingException(e);
            }
        } catch (CharacterCodingException unused) {
            CharsetDecoder newDecoder2 = org.msgpack.core.b.a.newDecoder();
            CodingErrorAction codingErrorAction2 = CodingErrorAction.REPLACE;
            return newDecoder2.onMalformedInput(codingErrorAction2).onUnmappableCharacter(codingErrorAction2).decode(ByteBuffer.wrap(bArr).asReadOnlyBuffer()).toString();
        }
    }

    public static final String d(mpw mpwVar) {
        try {
            try {
                return mpwVar.f();
            } catch (CharacterCodingException e) {
                throw new MessageStringCodingException(e);
            }
        } catch (MessageStringCodingException unused) {
            CharsetDecoder newDecoder = org.msgpack.core.b.a.newDecoder();
            CodingErrorAction codingErrorAction = CodingErrorAction.REPLACE;
            return newDecoder.onMalformedInput(codingErrorAction).onUnmappableCharacter(codingErrorAction).decode(mpwVar.t()).toString();
        }
    }

    public static final mpw e(kjr0 kjr0Var) {
        if (kjr0Var.i()) {
            return kjr0Var.x();
        }
        if (kjr0Var.E()) {
            return new npw(String.valueOf(kjr0Var.g().e()));
        }
        if (kjr0Var.j()) {
            return new npw(String.valueOf(kjr0Var.G().b));
        }
        if (kjr0Var.w()) {
            return new npw(String.valueOf(kjr0Var.y().b));
        }
        return null;
    }
}

package defpackage;

import android.os.Bundle;
import com.yandex.messaging.sdk.ChatFilterParams;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes15.dex */
public final class n4b extends s120 {
    public final g720 a;
    public final boolean b;
    public final Boolean c;
    public final ChatFilterParams d;
    public final String e;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public n4b(Bundle bundle) {
        this(r1, r2, r3, (ChatFilterParams) r0);
        Object valueOf;
        Class cls;
        Class cls2;
        Object u;
        Object u2;
        String string = bundle.getString("Messaging.Arguments.Source");
        if (string == null) {
            vg10.d("missing required key ".concat("Messaging.Arguments.Source"));
            throw null;
        }
        int i = g720.c;
        g720 b = glb1.b(string);
        boolean containsKey = bundle.containsKey("ENABLE_MENU");
        Class cls3 = Character.TYPE;
        Class cls4 = Double.TYPE;
        Class cls5 = Float.TYPE;
        Class cls6 = Long.TYPE;
        Class cls7 = Integer.TYPE;
        Class cls8 = Short.TYPE;
        Class cls9 = Byte.TYPE;
        Class cls10 = Boolean.TYPE;
        if (containsKey) {
            g0c a = qoi0.a(Boolean.class);
            valueOf = a.equals(qoi0.a(cls10)) ? Boolean.valueOf(bundle.getBoolean("ENABLE_MENU", true)) : a.equals(qoi0.a(cls9)) ? (Boolean) bundle.getByte("ENABLE_MENU", (byte) 0) : a.equals(qoi0.a(byte[].class)) ? (Boolean) bundle.getByteArray("ENABLE_MENU") : a.equals(qoi0.a(cls8)) ? (Boolean) Short.valueOf(bundle.getShort("ENABLE_MENU")) : a.equals(qoi0.a(cls7)) ? (Boolean) Integer.valueOf(bundle.getInt("ENABLE_MENU", 0)) : a.equals(qoi0.a(int[].class)) ? (Boolean) bundle.getIntArray("ENABLE_MENU") : a.equals(qoi0.a(cls6)) ? (Boolean) Long.valueOf(bundle.getLong("ENABLE_MENU", 0L)) : a.equals(qoi0.a(long[].class)) ? (Boolean) bundle.getLongArray("ENABLE_MENU") : a.equals(qoi0.a(cls5)) ? (Boolean) Float.valueOf(bundle.getFloat("ENABLE_MENU")) : a.equals(qoi0.a(float[].class)) ? (Boolean) bundle.getFloatArray("ENABLE_MENU") : a.equals(qoi0.a(cls4)) ? (Boolean) Double.valueOf(bundle.getDouble("ENABLE_MENU")) : a.equals(qoi0.a(double[].class)) ? (Boolean) bundle.getDoubleArray("ENABLE_MENU") : a.equals(qoi0.a(cls3)) ? (Boolean) Character.valueOf(bundle.getChar("ENABLE_MENU")) : a.equals(qoi0.a(CharSequence.class)) ? (Boolean) bundle.getCharSequence("ENABLE_MENU") : a.equals(qoi0.a(CharSequence[].class)) ? (Boolean) bundle.getCharSequenceArray("ENABLE_MENU") : a.equals(qoi0.a(Bundle.class)) ? (Boolean) bundle.getBundle("ENABLE_MENU") : vng.u(bundle, Boolean.class, "ENABLE_MENU");
        } else {
            valueOf = null;
        }
        Boolean bool = (Boolean) valueOf;
        boolean booleanValue = bool != null ? bool.booleanValue() : true;
        if (bundle.containsKey("ENABLE_COMPACT_MODE")) {
            g0c a2 = qoi0.a(Boolean.class);
            if (a2.equals(qoi0.a(cls10))) {
                u = Boolean.valueOf(bundle.getBoolean("ENABLE_COMPACT_MODE", true));
            } else if (a2.equals(qoi0.a(cls9))) {
                u = (Boolean) bundle.getByte("ENABLE_COMPACT_MODE", (byte) 0);
            } else if (a2.equals(qoi0.a(byte[].class))) {
                u = (Boolean) bundle.getByteArray("ENABLE_COMPACT_MODE");
            } else if (a2.equals(qoi0.a(cls8))) {
                u = (Boolean) Short.valueOf(bundle.getShort("ENABLE_COMPACT_MODE"));
            } else if (a2.equals(qoi0.a(cls7))) {
                u = (Boolean) Integer.valueOf(bundle.getInt("ENABLE_COMPACT_MODE", 0));
            } else if (a2.equals(qoi0.a(int[].class))) {
                u = (Boolean) bundle.getIntArray("ENABLE_COMPACT_MODE");
            } else if (a2.equals(qoi0.a(cls6))) {
                cls = Bundle.class;
                cls2 = CharSequence[].class;
                u = (Boolean) Long.valueOf(bundle.getLong("ENABLE_COMPACT_MODE", 0L));
            } else {
                cls = Bundle.class;
                cls2 = CharSequence[].class;
                u = a2.equals(qoi0.a(long[].class)) ? (Boolean) bundle.getLongArray("ENABLE_COMPACT_MODE") : a2.equals(qoi0.a(cls5)) ? (Boolean) Float.valueOf(bundle.getFloat("ENABLE_COMPACT_MODE")) : a2.equals(qoi0.a(float[].class)) ? (Boolean) bundle.getFloatArray("ENABLE_COMPACT_MODE") : a2.equals(qoi0.a(cls4)) ? (Boolean) Double.valueOf(bundle.getDouble("ENABLE_COMPACT_MODE")) : a2.equals(qoi0.a(double[].class)) ? (Boolean) bundle.getDoubleArray("ENABLE_COMPACT_MODE") : a2.equals(qoi0.a(cls3)) ? (Boolean) Character.valueOf(bundle.getChar("ENABLE_COMPACT_MODE")) : a2.equals(qoi0.a(CharSequence.class)) ? (Boolean) bundle.getCharSequence("ENABLE_COMPACT_MODE") : a2.equals(qoi0.a(cls2)) ? (Boolean) bundle.getCharSequenceArray("ENABLE_COMPACT_MODE") : a2.equals(qoi0.a(cls)) ? (Boolean) bundle.getBundle("ENABLE_COMPACT_MODE") : vng.u(bundle, Boolean.class, "ENABLE_COMPACT_MODE");
            }
            cls = Bundle.class;
            cls2 = CharSequence[].class;
        } else {
            cls = Bundle.class;
            cls2 = CharSequence[].class;
            u = null;
        }
        Boolean bool2 = (Boolean) u;
        if (bundle.containsKey("CHAT_FILTER")) {
            g0c a3 = qoi0.a(ChatFilterParams.class);
            u2 = a3.equals(qoi0.a(cls10)) ? (ChatFilterParams) Boolean.valueOf(bundle.getBoolean("CHAT_FILTER", true)) : a3.equals(qoi0.a(cls9)) ? (ChatFilterParams) bundle.getByte("CHAT_FILTER", (byte) 0) : a3.equals(qoi0.a(byte[].class)) ? (ChatFilterParams) bundle.getByteArray("CHAT_FILTER") : a3.equals(qoi0.a(cls8)) ? (ChatFilterParams) Short.valueOf(bundle.getShort("CHAT_FILTER")) : a3.equals(qoi0.a(cls7)) ? (ChatFilterParams) Integer.valueOf(bundle.getInt("CHAT_FILTER", 0)) : a3.equals(qoi0.a(int[].class)) ? (ChatFilterParams) bundle.getIntArray("CHAT_FILTER") : a3.equals(qoi0.a(cls6)) ? (ChatFilterParams) Long.valueOf(bundle.getLong("CHAT_FILTER", 0L)) : a3.equals(qoi0.a(long[].class)) ? (ChatFilterParams) bundle.getLongArray("CHAT_FILTER") : a3.equals(qoi0.a(cls5)) ? (ChatFilterParams) Float.valueOf(bundle.getFloat("CHAT_FILTER")) : a3.equals(qoi0.a(float[].class)) ? (ChatFilterParams) bundle.getFloatArray("CHAT_FILTER") : a3.equals(qoi0.a(cls4)) ? (ChatFilterParams) Double.valueOf(bundle.getDouble("CHAT_FILTER")) : a3.equals(qoi0.a(double[].class)) ? (ChatFilterParams) bundle.getDoubleArray("CHAT_FILTER") : a3.equals(qoi0.a(cls3)) ? (ChatFilterParams) Character.valueOf(bundle.getChar("CHAT_FILTER")) : a3.equals(qoi0.a(CharSequence.class)) ? (ChatFilterParams) bundle.getCharSequence("CHAT_FILTER") : a3.equals(qoi0.a(cls2)) ? (ChatFilterParams) bundle.getCharSequenceArray("CHAT_FILTER") : a3.equals(qoi0.a(cls)) ? (ChatFilterParams) bundle.getBundle("CHAT_FILTER") : vng.u(bundle, ChatFilterParams.class, "CHAT_FILTER");
        } else {
            u2 = null;
        }
    }

    @Override // defpackage.s120
    public final String a() {
        return this.e;
    }

    @Override // defpackage.s120
    public final g720 b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n4b)) {
            return false;
        }
        n4b n4bVar = (n4b) obj;
        return jl40.l(this.a, n4bVar.a) && this.b == n4bVar.b && jl40.l(this.c, n4bVar.c) && jl40.l(this.d, n4bVar.d);
    }

    public final int hashCode() {
        int e = unr0.e(this.a.hashCode() * 31, 31, this.b);
        Boolean bool = this.c;
        int hashCode = (e + (bool == null ? 0 : bool.hashCode())) * 31;
        ChatFilterParams chatFilterParams = this.d;
        return hashCode + (chatFilterParams != null ? chatFilterParams.hashCode() : 0);
    }

    public final String toString() {
        return "ChatListArguments(source=" + this.a + ", enableChatItemMenu=" + this.b + ", enableCompactMode=" + this.c + ", chatFilter=" + this.d + Extension.C_BRAKE;
    }

    public n4b(g720 g720Var, boolean z, Boolean bool, ChatFilterParams chatFilterParams) {
        this.a = g720Var;
        this.b = z;
        this.c = bool;
        this.d = chatFilterParams;
        this.e = "Messaging.Arguments.Key.ChatList";
    }

    public /* synthetic */ n4b(g720 g720Var) {
        this(g720Var, true, null, null);
    }
}

package xsna;

import android.text.TextUtils;
import android.util.Pair;
import com.huawei.hms.framework.common.hianalytics.CrashHianalyticsData;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Map;
import kotlinx.serialization.SerializationException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import org.json.JSONArray;
import org.json.JSONObject;
import org.webrtc.RTCStats;

/* compiled from: AbstractDecoder.kt */
/* loaded from: classes8.dex */
public abstract class be implements Decoder, ssi, i7d0 {
    public static long H() {
        return System.currentTimeMillis();
    }

    public static Object I(RTCStats rTCStats, String str) {
        return rTCStats.getMembers().get(str);
    }

    public static Object[] J(Throwable th, com.digitalturbine.ignite.authenticator.events.c cVar) {
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(new Pair(CrashHianalyticsData.EXCEPTION_NAME, th.getClass().getSimpleName()));
        arrayList.add(new Pair("description", th.getMessage()));
        StringWriter stringWriter = new StringWriter();
        th.printStackTrace(new PrintWriter(stringWriter));
        String stringBuffer = stringWriter.getBuffer().toString();
        if (!TextUtils.isEmpty(stringBuffer)) {
            zy60.f(CrashHianalyticsData.STACK_TRACE, stringBuffer, arrayList);
        }
        if (cVar != null) {
            arrayList.add(new Pair("error_code", cVar.h()));
        }
        Object[] objArr = new Object[arrayList.size() * 2];
        int i = 1;
        int i2 = 0;
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            Pair pair = (Pair) arrayList.get(i3);
            objArr[i2] = pair.first;
            objArr[i] = pair.second;
            i2 += 2;
            i += 2;
        }
        return objArr;
    }

    public static int b(double d, int i) {
        return zjh0.b(d, i, 31);
    }

    @Override // xsna.ssi
    public Decoder A(ebd0 ebd0Var, int i) {
        return C(ebd0Var.h(i));
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public abstract int B();

    @Override // kotlinx.serialization.encoding.Decoder
    public float D() {
        L();
        throw null;
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public boolean E() {
        L();
        throw null;
    }

    @Override // xsna.ssi
    public boolean F(SerialDescriptor serialDescriptor, int i) {
        return E();
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public boolean G() {
        return true;
    }

    public abstract boolean K(x630 x630Var);

    public void L() {
        throw new SerializationException(fpf0.a(getClass()) + " can't retrieve untyped values");
    }

    public abstract void M(ytf0 ytf0Var);

    public abstract ph50 N(fd3 fd3Var, rp70 rp70Var);

    public abstract Object O();

    public abstract Map P();

    public abstract String Q();

    public abstract float R(Object obj);

    public abstract JSONObject S(JSONObject jSONObject);

    public JSONObject U(JSONObject jSONObject) {
        JSONArray jSONArray = new JSONArray();
        JSONArray optJSONArray = jSONObject.optJSONArray("collection");
        if (optJSONArray != null) {
            int length = optJSONArray.length();
            for (int i = 0; i < length; i++) {
                jSONArray.put(S(optJSONArray.getJSONObject(i)));
            }
        }
        return new JSONObject().put("collection", jSONArray);
    }

    public abstract void V();

    public abstract void W();

    public abstract void X(boolean z);

    public abstract void Y();

    public abstract void Z(Object obj, float f);

    @Override // kotlinx.serialization.encoding.Decoder
    public double g() {
        L();
        throw null;
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public Object h(a3m a3mVar) {
        return a3mVar.deserialize(this);
    }

    @Override // xsna.ssi
    public Object i(SerialDescriptor serialDescriptor, int i, a3m a3mVar, Object obj) {
        if (a3mVar.getDescriptor().b() || G()) {
            return h(a3mVar);
        }
        return null;
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public int j(SerialDescriptor serialDescriptor) {
        L();
        throw null;
    }

    @Override // xsna.ssi
    public byte k(ebd0 ebd0Var, int i) {
        return p();
    }

    @Override // xsna.ssi
    public float n(SerialDescriptor serialDescriptor, int i) {
        return D();
    }

    @Override // xsna.ssi
    public double o(SerialDescriptor serialDescriptor, int i) {
        return g();
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public abstract byte p();

    @Override // xsna.ssi
    public char q(ebd0 ebd0Var, int i) {
        return w();
    }

    @Override // xsna.ssi
    public long r(SerialDescriptor serialDescriptor, int i) {
        return t();
    }

    @Override // xsna.ssi
    public int s(SerialDescriptor serialDescriptor, int i) {
        return B();
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public abstract long t();

    @Override // xsna.ssi
    public String u(SerialDescriptor serialDescriptor, int i) {
        return x();
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public abstract short v();

    @Override // kotlinx.serialization.encoding.Decoder
    public char w() {
        L();
        throw null;
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public String x() {
        L();
        throw null;
    }

    @Override // xsna.ssi
    public Object y(SerialDescriptor serialDescriptor, int i, a3m a3mVar, Object obj) {
        return h(a3mVar);
    }

    @Override // xsna.ssi
    public short z(ebd0 ebd0Var, int i) {
        return v();
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public Decoder C(SerialDescriptor serialDescriptor) {
        return this;
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public ssi d(SerialDescriptor serialDescriptor) {
        return this;
    }

    @Override // xsna.ssi
    public void e(SerialDescriptor serialDescriptor) {
    }
}

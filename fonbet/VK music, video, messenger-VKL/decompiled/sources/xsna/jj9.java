package xsna;

import android.os.Build;
import com.vk.clips.blacklists.api.di.ClipsBlacklistsComponent;
import com.vk.log.L;
import com.vk.log.LoggerOutputTarget;
import com.vk.ml.MLFeatures;
import com.vk.toggle.Features;
import com.vk.toggle.b;
import java.util.ArrayList;
import java.util.Locale;
import org.json.JSONArray;
import org.json.JSONObject;
import ru.ok.android.webrtc.stat.call.internal.ConnectivityTracker;
import ru.ok.gl.tf.TensorflowModel;
import xsna.x930;

/* compiled from: CameraMorphingProvider.kt */
/* loaded from: classes16.dex */
public final class jj9 implements y930 {
    public final hq0 a;
    public final a b;

    /* compiled from: CameraMorphingProvider.kt */
    public static final class a {
        public final tjd a;
        public final JSONObject b;
        public final int c;
        public final int d;
        public final double e;
        public final double f;
        public final boolean g;
        public final long h;
        public final boolean i;

        public a(tjd tjdVar, JSONObject jSONObject) {
            this.a = tjdVar;
            this.b = jSONObject;
            this.c = jSONObject.optInt("min_sdk", 29);
            this.d = jSONObject.optInt("min_cpu_cores", 8);
            this.e = jSONObject.optDouble("min_cpu_freq_mhz", ConnectivityTracker.DEFAULT_UPLINK_BITRATE);
            this.f = jSONObject.optDouble("max_cpu_freq_mhz", 2200.0d);
            this.g = jSONObject.optBoolean("only_64bit_abi", true);
            this.h = jSONObject.optLong("gpu_test_time", 0L);
            this.i = jSONObject.optBoolean("dry_run", false);
        }

        public final String[] a() {
            JSONArray optJSONArray = this.b.optJSONArray("white_list");
            if (optJSONArray == null) {
                return new String[0];
            }
            int length = optJSONArray.length();
            String[] strArr = new String[length];
            for (int i = 0; i < length; i++) {
                strArr[i] = optJSONArray.get(i).toString().toUpperCase(Locale.ROOT);
            }
            return strArr;
        }

        public final x930 b() {
            String upperCase = Build.MODEL.toUpperCase(Locale.ROOT);
            L l = L.a;
            l.getClass();
            if (!L.m(LoggerOutputTarget.NONE)) {
                L.u(l, L.LogType.d, new Object[]{go9.b("Test device acceptance for morphing: ", upperCase)});
            }
            String[] a = a();
            int length = a.length;
            boolean z = false;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                }
                if (epx.f(a[i], upperCase)) {
                    z = true;
                    break;
                }
                i++;
            }
            if (z) {
                L l2 = L.a;
                l2.getClass();
                if (!L.m(LoggerOutputTarget.NONE)) {
                    L.u(l2, L.LogType.i, new Object[]{tdj.a(new StringBuilder("Device accepted for morphing due whitelist "), rl3.Z(a(), null, null, null, null, 63), " device ", upperCase)});
                }
                return x930.g.b;
            }
            int i2 = Build.VERSION.SDK_INT;
            int i3 = this.c;
            if (i3 > i2) {
                L l3 = L.a;
                l3.getClass();
                if (!L.m(LoggerOutputTarget.NONE)) {
                    L.u(l3, L.LogType.i, new Object[]{efz.a(i3, i2, "Device rejected for morphing due minSdkInt ", " device ")});
                }
                return x930.f.b;
            }
            b4k b4kVar = b4k.e;
            int i4 = b4kVar.a;
            int i5 = this.d;
            if (i5 > i4) {
                L l4 = L.a;
                l4.getClass();
                if (!L.m(LoggerOutputTarget.NONE)) {
                    L.LogType logType = L.LogType.i;
                    StringBuilder b = ji.b(i5, "Device rejected for morphing due minCpuCores ", " device ");
                    b.append(b4k.e.a);
                    L.u(l4, logType, new Object[]{b.toString()});
                }
                return x930.b.b;
            }
            double d = b4kVar.c;
            double d2 = this.e;
            if (d2 > d) {
                L l5 = L.a;
                l5.getClass();
                if (!L.m(LoggerOutputTarget.NONE)) {
                    L.LogType logType2 = L.LogType.i;
                    StringBuilder a2 = lby.a("Device rejected for morphing due minCpuFrequencyMhz ", d2, " device ");
                    a2.append(b4k.e.c);
                    L.u(l5, logType2, new Object[]{a2.toString()});
                }
                return x930.e.b;
            }
            double d3 = b4kVar.d;
            double d4 = this.f;
            if (d4 > d3) {
                L l6 = L.a;
                l6.getClass();
                if (!L.m(LoggerOutputTarget.NONE)) {
                    L.LogType logType3 = L.LogType.i;
                    StringBuilder a3 = lby.a("Device rejected for morphing due maxCpuFrequencyMhz ", d4, " device ");
                    a3.append(b4k.e.d);
                    L.u(l6, logType3, new Object[]{a3.toString()});
                }
                return x930.d.b;
            }
            boolean z2 = this.g;
            if (!z2 || b4kVar.b) {
                if (!this.a.b()) {
                    L.p("Device accepted for morphing.");
                    return x930.h.b;
                }
                L l7 = L.a;
                l7.getClass();
                if (!L.m(LoggerOutputTarget.NONE)) {
                    L.u(l7, L.LogType.i, new Object[]{"Device rejected for morphing due blackList. Device: ".concat(upperCase)});
                }
                return x930.c.b;
            }
            L l8 = L.a;
            l8.getClass();
            if (!L.m(LoggerOutputTarget.NONE)) {
                L.u(l8, L.LogType.i, new Object[]{"Device rejected for morphing due isOnly64bitAbiRequired " + z2 + " device " + b4k.e.b});
            }
            return x930.a.b;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return epx.f(this.a, aVar.a) && epx.f(this.b, aVar.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "MorphingPerformanceConfig(blacklistsRepository=" + this.a + ", json=" + this.b + ')';
        }
    }

    public jj9(dm9 dm9Var) {
        this.a = new hq0(dm9Var.a);
        b.d i = com.vk.toggle.b.A.i(Features.Type.FEATURE_CLIPS_MORPHING_BLACKLIST);
        a aVar = null;
        if (i != null) {
            if (((!i.a || i.c.toString() == null) ? null : i) != null) {
                L l = L.a;
                l.getClass();
                if (!L.m(LoggerOutputTarget.NONE)) {
                    L.u(l, L.LogType.d, new Object[]{"Morphing json " + i.c.toString()});
                }
                aVar = new a(((ClipsBlacklistsComponent) dm9Var.o.getValue()).f4(), new JSONObject(i.c.toString()));
            }
        }
        this.b = aVar;
    }

    @Override // xsna.y930
    public final long a() {
        a aVar = this.b;
        if (aVar != null) {
            String upperCase = Build.MODEL.toUpperCase(Locale.ROOT);
            for (String str : aVar.a()) {
                if (epx.f(str, upperCase)) {
                    return 0L;
                }
            }
        }
        if (aVar != null) {
            return aVar.h;
        }
        return 0L;
    }

    @Override // xsna.y930
    public final boolean b() {
        a aVar = this.b;
        if (aVar != null) {
            return aVar.i ? true : aVar.b().a;
        }
        return false;
    }

    @Override // xsna.y930
    public final void c(TensorflowModel[] tensorflowModelArr, vw70 vw70Var, aad aadVar) {
        hq0 hq0Var = this.a;
        xb00 xb00Var = hq0Var.a;
        io.reactivex.rxjava3.disposables.c cVar = hq0Var.b;
        if (cVar != null) {
            cVar.dispose();
        }
        ArrayList arrayList = new ArrayList(tensorflowModelArr.length);
        for (TensorflowModel tensorflowModel : tensorflowModelArr) {
            arrayList.add(xb00Var.a().c().b(tensorflowModel));
        }
        if (!xb00Var.b().c) {
            MLFeatures.e(arrayList, new per(8));
        }
        hq0Var.b = new io.reactivex.rxjava3.internal.operators.observable.i0(hg1.c(ysg0.b.a.a0(asu0.a.c()), com.vk.ml.f.class).U(new eq0(0)), new o7(new zx(arrayList, 2), 1)).subscribe(new m20(new fq0(aadVar, tensorflowModelArr, hq0Var, arrayList, vw70Var), 1), new n20(new gq0(aadVar, tensorflowModelArr, hq0Var, 0), 1));
    }

    @Override // xsna.y930
    public final boolean d() {
        a aVar = this.b;
        return aVar != null && aVar.b().a;
    }

    @Override // xsna.y930
    public final void e() {
        io.reactivex.rxjava3.disposables.c cVar = this.a.b;
        if (cVar != null) {
            cVar.dispose();
        }
    }
}

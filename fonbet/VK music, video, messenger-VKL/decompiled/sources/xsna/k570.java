package xsna;

import com.vk.core.preference.Preference;
import com.vk.ml.MLFeatures;
import com.vk.toggle.Features;
import com.vk.toggle.b;
import com.vk.toggle.features.VoipFeatures;
import com.vk.voip.OKVoipEngine;
import com.vk.voip.ui.ns.NoiseSuppressorFeature$State;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.MutablePropertyReference0Impl;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import xsna.l570;

/* compiled from: NoiseSuppressorControl.kt */
/* loaded from: classes7.dex */
public final class k570 {
    public static final /* synthetic */ qcy<Object>[] h = {new MutablePropertyReference1Impl(k570.class, "availableStates", "getAvailableStates()Ljava/util/List;", 0), p5j.a(0, k570.class, "selectedState", "getSelectedState()Lcom/vk/voip/ui/ns/NoiseSuppressorFeature$State;", fpf0.a)};
    public final apv a;
    public final vfe b;
    public final c4g0 c;
    public final tbx0 d;
    public final tbx0 e;
    public dw20 f;
    public com.vk.voip.b g;

    /* compiled from: NoiseSuppressorControl.kt */
    public static final /* synthetic */ class a extends MutablePropertyReference0Impl {
        @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, xsna.rcy
        public final Object get() {
            k570 k570Var = (k570) this.receiver;
            qcy<Object>[] qcyVarArr = k570.h;
            return k570Var.b();
        }

        @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, xsna.mcy
        public final void set(Object obj) {
            k570 k570Var = (k570) this.receiver;
            qcy<Object>[] qcyVarArr = k570.h;
            k570Var.d.setValue(k570Var, k570.h[0], (List) obj);
        }
    }

    /* compiled from: NoiseSuppressorControl.kt */
    public static final /* synthetic */ class b extends MutablePropertyReference0Impl {
        @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, xsna.rcy
        public final Object get() {
            k570 k570Var = (k570) this.receiver;
            qcy<Object>[] qcyVarArr = k570.h;
            return k570Var.c();
        }

        @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, xsna.mcy
        public final void set(Object obj) {
            qcy<Object>[] qcyVarArr = k570.h;
            ((k570) this.receiver).e((NoiseSuppressorFeature$State) obj);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00c4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public k570(apv apvVar) {
        NoiseSuppressorFeature$State noiseSuppressorFeature$State;
        this.a = apvVar;
        vfe vfeVar = new vfe(10);
        this.b = vfeVar;
        this.c = new c4g0();
        a aVar = new a(this, k570.class, "availableStates", "getAvailableStates()Ljava/util/List;", 0);
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) vfeVar.b;
        concurrentHashMap.putIfAbsent(aVar.getName(), io.reactivex.rxjava3.subjects.d.N0());
        tbx0 tbx0Var = new tbx0(vfeVar);
        this.d = tbx0Var;
        concurrentHashMap.putIfAbsent(new b(this, k570.class, "selectedState", "getSelectedState()Lcom/vk/voip/ui/ns/NoiseSuppressorFeature$State;", 0).getName(), io.reactivex.rxjava3.subjects.d.N0());
        this.e = new tbx0(vfeVar);
        tbx0Var.setValue(this, h[0], rl3.u0(NoiseSuppressorFeature$State.values()));
        com.vk.voip.ui.c.b.getClass();
        if (((Boolean) com.vk.voip.ui.c.s0.b.invoke()).booleanValue()) {
            if (Preference.f("voip_prefs_shared").contains("noise-suppressor-state")) {
                int i = Preference.f("voip_prefs_shared").getInt("noise-suppressor-state", -1);
                NoiseSuppressorFeature$State[] values = NoiseSuppressorFeature$State.values();
                if (i >= 0 && i < values.length) {
                    noiseSuppressorFeature$State = values[i];
                    if (noiseSuppressorFeature$State != null || !b().contains(noiseSuppressorFeature$State)) {
                        noiseSuppressorFeature$State = !((Boolean) com.vk.voip.ui.c.s0.b.invoke()).booleanValue() ? NoiseSuppressorFeature$State.AUTO : NoiseSuppressorFeature$State.PLATFORM;
                        if (!b().contains(noiseSuppressorFeature$State)) {
                            noiseSuppressorFeature$State = NoiseSuppressorFeature$State.PLATFORM;
                        }
                    }
                }
            }
            noiseSuppressorFeature$State = null;
            if (noiseSuppressorFeature$State != null) {
            }
            if (!((Boolean) com.vk.voip.ui.c.s0.b.invoke()).booleanValue()) {
            }
            if (!b().contains(noiseSuppressorFeature$State)) {
            }
        } else {
            noiseSuppressorFeature$State = NoiseSuppressorFeature$State.PLATFORM;
        }
        e(noiseSuppressorFeature$State);
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x007c, code lost:
    
        if (((r8 == null || (r8 = r8.g()) == null) ? true : r8.optBoolean("allowClientModel")) != false) goto L36;
     */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00d7 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0091 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(NoiseSuppressorFeature$State noiseSuppressorFeature$State) {
        hm70 hm70Var;
        com.vk.voip.b bVar = this.g;
        if (bVar == null || !(bVar instanceof OKVoipEngine)) {
            return;
        }
        com.vk.voip.ui.c.b.getClass();
        if (((Boolean) com.vk.voip.ui.c.s0.b.invoke()).booleanValue() || com.vk.toggle.b.A.a(Features.Type.FEATURE_VOIP_NOISE_SUP_OFF_AS_PLATFORM)) {
            com.vk.voip.ui.c.S();
            NoiseSuppressorFeature$State noiseSuppressorFeature$State2 = NoiseSuppressorFeature$State.NONE;
            boolean z = false;
            if (noiseSuppressorFeature$State == noiseSuppressorFeature$State2 && !com.vk.toggle.b.A.a(Features.Type.FEATURE_VOIP_NOISE_SUP_OFF_AS_PLATFORM)) {
                OKVoipEngine.U((OKVoipEngine) bVar, false, false);
                return;
            }
            if ((noiseSuppressorFeature$State == noiseSuppressorFeature$State2 && com.vk.toggle.b.A.a(Features.Type.FEATURE_VOIP_NOISE_SUP_OFF_AS_PLATFORM)) || noiseSuppressorFeature$State == NoiseSuppressorFeature$State.PLATFORM) {
                OKVoipEngine.U((OKVoipEngine) bVar, false, true);
                return;
            }
            if (noiseSuppressorFeature$State == NoiseSuppressorFeature$State.AUTO) {
                com.vk.toggle.b bVar2 = com.vk.toggle.b.A;
                if (!bVar2.a(VoipFeatures.ENABLE_NS_DF_TINY)) {
                    b.d i = bVar2.i(Features.Type.FEATURE_VOIP_NOISE_SUPPRESSION);
                }
                z = true;
                l570.a aVar = null;
                if (z) {
                    List<MLFeatures.MLFeature> a2 = o570.a();
                    ArrayList arrayList = new ArrayList();
                    for (MLFeatures.MLFeature mLFeature : a2) {
                        com.vk.ml.b bVar3 = MLFeatures.a;
                        if (bVar3.f() && com.vk.ml.b.g(bVar3.d(mLFeature)) && bVar3.h(mLFeature)) {
                            if (mLFeature == MLFeatures.MLFeature.NS_PIPELINE_SPLIT) {
                                hm70Var = new hm70(mLFeature, 2);
                            } else if (mLFeature == MLFeatures.MLFeature.NS_PIPELINE_48K) {
                                hm70Var = new hm70(mLFeature, 2);
                            } else if (mLFeature == MLFeatures.MLFeature.NS_DF_TINY) {
                                hm70Var = new hm70(mLFeature, 1);
                            }
                            if (hm70Var == null) {
                                arrayList.add(hm70Var);
                            }
                        }
                        hm70Var = null;
                        if (hm70Var == null) {
                        }
                    }
                    aVar = (l570.a) j5g.a0(arrayList);
                }
                if (aVar == null) {
                    OKVoipEngine.U((OKVoipEngine) bVar, true, true);
                } else {
                    asu0.a.getClass();
                    asu0.n().execute(new ne9(4, aVar, bVar));
                }
            }
        }
    }

    public final List<NoiseSuppressorFeature$State> b() {
        tbx0 tbx0Var = this.d;
        qcy<Object> qcyVar = h[0];
        return (List) tbx0Var.b;
    }

    public final NoiseSuppressorFeature$State c() {
        tbx0 tbx0Var = this.e;
        qcy<Object> qcyVar = h[1];
        return (NoiseSuppressorFeature$State) tbx0Var.b;
    }

    public final void d(OKVoipEngine oKVoipEngine) {
        apv apvVar = this.a;
        if (oKVoipEngine != null && this.g == null && apvVar.a()) {
            this.g = oKVoipEngine;
            if (apvVar.a()) {
                a(c());
            }
        }
        if (apvVar.isIdle()) {
            this.g = null;
        }
    }

    public final void e(NoiseSuppressorFeature$State noiseSuppressorFeature$State) {
        this.e.setValue(this, h[1], noiseSuppressorFeature$State);
    }
}

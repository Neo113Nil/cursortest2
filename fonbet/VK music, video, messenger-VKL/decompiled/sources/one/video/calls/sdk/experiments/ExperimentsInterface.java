package one.video.calls.sdk.experiments;

import android.content.Context;
import defpackage.k0;
import java.io.File;
import org.webrtc.PeerConnection;
import ru.ok.android.externcalls.sdk.exception.Domain;
import ru.ok.android.webrtc.mediarecord.AudioFormat;
import ru.ok.android.webrtc.signaling.transport.SignalingTransport;
import ru.ok.android.webrtc.stat.NegotiationError;
import xsna.asp;
import xsna.gm70;
import xsna.qc1;
import xsna.zrp;

/* loaded from: classes8.dex */
public interface ExperimentsInterface {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class EmulatedIceCandidatesError {
        public static final EmulatedIceCandidatesError LOCAL;
        public static final EmulatedIceCandidatesError NONE;
        public static final EmulatedIceCandidatesError REMOTE;
        public static final /* synthetic */ EmulatedIceCandidatesError[] a;
        public static final /* synthetic */ zrp b;

        static {
            EmulatedIceCandidatesError emulatedIceCandidatesError = new EmulatedIceCandidatesError("NONE", 0);
            NONE = emulatedIceCandidatesError;
            EmulatedIceCandidatesError emulatedIceCandidatesError2 = new EmulatedIceCandidatesError("REMOTE", 1);
            REMOTE = emulatedIceCandidatesError2;
            EmulatedIceCandidatesError emulatedIceCandidatesError3 = new EmulatedIceCandidatesError("LOCAL", 2);
            LOCAL = emulatedIceCandidatesError3;
            EmulatedIceCandidatesError[] emulatedIceCandidatesErrorArr = {emulatedIceCandidatesError, emulatedIceCandidatesError2, emulatedIceCandidatesError3};
            a = emulatedIceCandidatesErrorArr;
            b = new asp(emulatedIceCandidatesErrorArr);
        }

        public static EmulatedIceCandidatesError valueOf(String str) {
            return (EmulatedIceCandidatesError) Enum.valueOf(EmulatedIceCandidatesError.class, str);
        }

        public static EmulatedIceCandidatesError[] values() {
            return (EmulatedIceCandidatesError[]) a.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class EmulatedSignalingError {
        public static final EmulatedSignalingError NONE;
        public static final EmulatedSignalingError PARTICIPANT_LIMIT_REACHED;
        public static final EmulatedSignalingError SERVICE_UNAVAILABLE;
        public static final /* synthetic */ EmulatedSignalingError[] a;
        public static final /* synthetic */ zrp b;

        static {
            EmulatedSignalingError emulatedSignalingError = new EmulatedSignalingError("NONE", 0);
            NONE = emulatedSignalingError;
            EmulatedSignalingError emulatedSignalingError2 = new EmulatedSignalingError("SERVICE_UNAVAILABLE", 1);
            SERVICE_UNAVAILABLE = emulatedSignalingError2;
            EmulatedSignalingError emulatedSignalingError3 = new EmulatedSignalingError("PARTICIPANT_LIMIT_REACHED", 2);
            PARTICIPANT_LIMIT_REACHED = emulatedSignalingError3;
            EmulatedSignalingError[] emulatedSignalingErrorArr = {emulatedSignalingError, emulatedSignalingError2, emulatedSignalingError3};
            a = emulatedSignalingErrorArr;
            b = new asp(emulatedSignalingErrorArr);
        }

        public static EmulatedSignalingError valueOf(String str) {
            return (EmulatedSignalingError) Enum.valueOf(EmulatedSignalingError.class, str);
        }

        public static EmulatedSignalingError[] values() {
            return (EmulatedSignalingError[]) a.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class SimulcastState {
        public static final SimulcastState ALL_SUPPORTED_CODEC;
        public static final SimulcastState DISABLED;
        public static final SimulcastState ONLY_SW_VP8;
        public static final /* synthetic */ SimulcastState[] a;
        public static final /* synthetic */ zrp b;

        static {
            SimulcastState simulcastState = new SimulcastState("DISABLED", 0);
            DISABLED = simulcastState;
            SimulcastState simulcastState2 = new SimulcastState("ONLY_SW_VP8", 1);
            ONLY_SW_VP8 = simulcastState2;
            SimulcastState simulcastState3 = new SimulcastState("ALL_SUPPORTED_CODEC", 2);
            ALL_SUPPORTED_CODEC = simulcastState3;
            SimulcastState[] simulcastStateArr = {simulcastState, simulcastState2, simulcastState3};
            a = simulcastStateArr;
            b = new asp(simulcastStateArr);
        }

        public static SimulcastState valueOf(String str) {
            return (SimulcastState) Enum.valueOf(SimulcastState.class, str);
        }

        public static SimulcastState[] values() {
            return (SimulcastState[]) a.clone();
        }

        public final boolean h() {
            return this == ONLY_SW_VP8 || this == ALL_SUPPORTED_CODEC;
        }
    }

    public interface a {

        /* renamed from: one.video.calls.sdk.experiments.ExperimentsInterface$a$a, reason: collision with other inner class name */
        public static final class C2170a implements a {
            public static final C2170a a = new C2170a();
        }

        public static final class b implements a {
            public final String a;
            public final String b;

            public b(Context context) {
                String absolutePath = new File(context.getFilesDir(), k0.a(System.currentTimeMillis(), "target_bitrate_dump_")).getAbsolutePath();
                this.a = absolutePath;
                this.b = absolutePath.concat(".log.json");
            }
        }
    }

    public static final class b {
        static {
            Domain domain = Domain.NETWORK;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            throw null;
        }

        public final int hashCode() {
            throw null;
        }

        public final String toString() {
            throw null;
        }
    }

    public static final /* synthetic */ class c {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[EmulatedSignalingError.values().length];
            try {
                iArr[EmulatedSignalingError.NONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EmulatedSignalingError.SERVICE_UNAVAILABLE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EmulatedSignalingError.PARTICIPANT_LIMIT_REACHED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    boolean A();

    Float B();

    boolean C();

    boolean D();

    EmulatedSignalingError E();

    boolean F();

    boolean G();

    Integer H();

    boolean I();

    boolean J();

    boolean K();

    b L();

    boolean M();

    SignalingTransport.Timeouts N();

    boolean O();

    boolean P();

    AudioFormat.Config Q();

    boolean R();

    boolean S();

    boolean T();

    SignalingTransport.FallbackParams U();

    boolean V();

    boolean W();

    Double X();

    boolean Y();

    boolean Z();

    boolean a();

    boolean a0();

    int b();

    EmulatedIceCandidatesError b0();

    boolean c();

    boolean c0();

    boolean d();

    boolean d0();

    boolean e();

    boolean e0();

    boolean f();

    a f0();

    boolean g();

    SimulcastState h();

    default Integer i() {
        Integer H = H();
        return H == null ? a0() ? 1 : null : H;
    }

    boolean j();

    Double k();

    boolean l();

    String m();

    boolean n();

    qc1 o();

    boolean p();

    boolean q();

    boolean r();

    boolean s();

    PeerConnection.VpnPreference t();

    boolean u();

    boolean v();

    boolean w();

    NegotiationError.Type x();

    gm70 y();

    boolean z();
}

package xsna;

import java.util.concurrent.TimeUnit;
import kotlin.NoWhenBranchMatchedException;
import ru.ok.android.externcalls.sdk.audio.CallsAudioManager;

/* compiled from: VoipAudioOutputPlayerAnalyticsDelegateImpl.kt */
/* loaded from: classes11.dex */
public final class pew0 extends ldw0<a> {
    public final bpn0 d;
    public final String e = "VoipAudioOutputPlayerAnalyticsDelegateImpl";
    public final io.reactivex.rxjava3.subjects.f<CallsAudioManager.AudioDeviceType> f = new io.reactivex.rxjava3.subjects.f<>();
    public final io.reactivex.rxjava3.disposables.b g = new io.reactivex.rxjava3.disposables.b();

    /* compiled from: VoipAudioOutputPlayerAnalyticsDelegateImpl.kt */
    /* loaded from: classes7.dex */
    public interface a extends ndw0 {

        /* compiled from: VoipAudioOutputPlayerAnalyticsDelegateImpl.kt */
        /* renamed from: xsna.pew0$a$a, reason: collision with other inner class name */
        public static final class C3510a implements a {
            public final CallsAudioManager.AudioDeviceType a;

            public C3510a(CallsAudioManager.AudioDeviceType audioDeviceType) {
                this.a = audioDeviceType;
            }

            public final CallsAudioManager.AudioDeviceType a() {
                return this.a;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C3510a) && this.a == ((C3510a) obj).a;
            }

            public final int hashCode() {
                return this.a.hashCode();
            }

            public final String toString() {
                return "OnSpeakerModeChanged(type=" + this.a + ')';
            }
        }
    }

    /* compiled from: VoipAudioOutputPlayerAnalyticsDelegateImpl.kt */
    /* loaded from: classes7.dex */
    public interface b {
        io.reactivex.rxjava3.subjects.f b();
    }

    /* compiled from: VoipAudioOutputPlayerAnalyticsDelegateImpl.kt */
    /* loaded from: classes7.dex */
    public static final /* synthetic */ class c {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[CallsAudioManager.AudioDeviceType.values().length];
            try {
                iArr[CallsAudioManager.AudioDeviceType.BLUETOOTH.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CallsAudioManager.AudioDeviceType.WIRED_HEADSET.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[CallsAudioManager.AudioDeviceType.EARPIECE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[CallsAudioManager.AudioDeviceType.SPEAKER_PHONE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[CallsAudioManager.AudioDeviceType.NONE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public pew0(bpn0 bpn0Var) {
        this.d = bpn0Var;
    }

    @Override // xsna.ldw0
    public final String b() {
        return this.e;
    }

    @Override // xsna.ldw0
    public final void c() {
        super.c();
        this.g.b(io.reactivex.rxjava3.kotlin.c.f(2, new io.reactivex.rxjava3.internal.operators.observable.y(this.f.y(5L, TimeUnit.SECONDS), io.reactivex.rxjava3.internal.functions.a.a, io.reactivex.rxjava3.internal.functions.b.a), null, new xd8(this), new c3k0(this, 19)));
    }

    @Override // xsna.ldw0
    public final void d(a aVar) {
        a aVar2 = aVar;
        if (!(aVar2 instanceof a.C3510a)) {
            throw new NoWhenBranchMatchedException();
        }
        this.f.onNext(((a.C3510a) aVar2).a());
    }

    @Override // xsna.ldw0
    public final void e() {
        super.e();
        this.g.e();
    }
}

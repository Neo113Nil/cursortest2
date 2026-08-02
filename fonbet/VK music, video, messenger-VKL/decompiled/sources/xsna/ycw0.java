package xsna;

import com.vk.voip.ui.logs.app.AppLogsSending$SendType;
import com.vk.voip.ui.ns.NoiseSuppressorFeature$State;
import ru.ok.android.externcalls.sdk.audio.CallsAudioDeviceInfo;
import ru.ok.android.webrtc.media_options.MediaOptionState;
import xsna.k5x0;

/* compiled from: VoipActionsViewModel.kt */
/* loaded from: classes7.dex */
public interface ycw0 {

    /* compiled from: VoipActionsViewModel.kt */
    public static final class a {
        public final boolean a;
        public final boolean b;

        public a(boolean z, boolean z2) {
            this.a = z;
            this.b = z2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a == aVar.a && this.b == aVar.b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.b) + (Boolean.hashCode(this.a) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("AsrOnline(isAvailable=");
            sb.append(this.a);
            sb.append(", isEnabled=");
            return defpackage.q0.a(sb, this.b, ')');
        }
    }

    /* compiled from: VoipActionsViewModel.kt */
    public static final class b {
        public final boolean a;
        public final boolean b;
        public final boolean c;

        public b(boolean z, boolean z2, boolean z3) {
            this.a = z;
            this.b = z2;
            this.c = z3;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.a == bVar.a && this.b == bVar.b && this.c == bVar.c;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.c) + qoy.b(Boolean.hashCode(this.a) * 31, 31, this.b);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("AsrRecordStatus(isVisible=");
            sb.append(this.a);
            sb.append(", isStarted=");
            sb.append(this.b);
            sb.append(", canStop=");
            return defpackage.q0.a(sb, this.c, ')');
        }
    }

    /* compiled from: VoipActionsViewModel.kt */
    public static final class c {
        public final boolean a;
        public final boolean b;

        public c(boolean z, boolean z2) {
            this.a = z;
            this.b = z2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return this.a == cVar.a && this.b == cVar.b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.b) + (Boolean.hashCode(this.a) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("BeautyFilter(isVisible=");
            sb.append(this.a);
            sb.append(", isInitialized=");
            return defpackage.q0.a(sb, this.b, ')');
        }
    }

    /* compiled from: VoipActionsViewModel.kt */
    public static final class d {
        public final boolean a;
        public final boolean b;
        public final boolean c;
        public final Long d;
        public final boolean e;

        public d(boolean z, boolean z2, boolean z3, Long l, boolean z4) {
            this.a = z;
            this.b = z2;
            this.c = z3;
            this.d = l;
            this.e = z4;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return this.a == dVar.a && this.b == dVar.b && this.c == dVar.c && epx.f(this.d, dVar.d) && this.e == dVar.e;
        }

        public final int hashCode() {
            int b = qoy.b(qoy.b(Boolean.hashCode(this.a) * 31, 31, this.b), 31, this.c);
            Long l = this.d;
            return Boolean.hashCode(this.e) + ((b + (l == null ? 0 : l.hashCode())) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("BroadcastStatus(isSupported=");
            sb.append(this.a);
            sb.append(", isEnabled=");
            sb.append(this.b);
            sb.append(", isStarted=");
            sb.append(this.c);
            sb.append(", startTimeMs=");
            sb.append(this.d);
            sb.append(", isManagedByUser=");
            return defpackage.q0.a(sb, this.e, ')');
        }
    }

    /* compiled from: VoipActionsViewModel.kt */
    public static final class e {
        public final boolean a;
        public final boolean b;
        public final int c;

        public e(boolean z, boolean z2, int i) {
            this.a = z;
            this.b = z2;
            this.c = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            return this.a == eVar.a && this.b == eVar.b && this.c == eVar.c;
        }

        public final int hashCode() {
            return Integer.hashCode(this.c) + qoy.b(Boolean.hashCode(this.a) * 31, 31, this.b);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("CallDump(isVisible=");
            sb.append(this.a);
            sb.append(", isRecording=");
            sb.append(this.b);
            sb.append(", title=");
            return vu5.b(sb, this.c, ')');
        }
    }

    /* compiled from: VoipActionsViewModel.kt */
    public static final class f {
        public final boolean a;

        public f(boolean z) {
            this.a = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof f) && this.a == ((f) obj).a;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.a);
        }

        public final String toString() {
            return defpackage.q0.a(new StringBuilder("CallEffectsPlaceholder(isVisible="), this.a, ')');
        }
    }

    /* compiled from: VoipActionsViewModel.kt */
    public static final class g {
        public final boolean a;

        public g(boolean z) {
            this.a = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof g) && this.a == ((g) obj).a;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.a);
        }

        public final String toString() {
            return defpackage.q0.a(new StringBuilder("DebugMenu(isVisible="), this.a, ')');
        }
    }

    /* compiled from: VoipActionsViewModel.kt */
    public static final class h {
        public final boolean a;
        public final boolean b;

        public h(boolean z, boolean z2) {
            this.a = z;
            this.b = z2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof h)) {
                return false;
            }
            h hVar = (h) obj;
            return this.a == hVar.a && this.b == hVar.b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.b) + (Boolean.hashCode(this.a) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("FrontCameraMirroring(isVisible=");
            sb.append(this.a);
            sb.append(", isEnabled=");
            return defpackage.q0.a(sb, this.b, ')');
        }
    }

    /* compiled from: VoipActionsViewModel.kt */
    public static final class i {
        public final boolean a;
        public final boolean b;

        public i(boolean z, boolean z2) {
            this.a = z;
            this.b = z2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof i)) {
                return false;
            }
            i iVar = (i) obj;
            return this.a == iVar.a && this.b == iVar.b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.b) + (Boolean.hashCode(this.a) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("GesturesFeedback(isVisible=");
            sb.append(this.a);
            sb.append(", isEnabled=");
            return defpackage.q0.a(sb, this.b, ')');
        }
    }

    /* compiled from: VoipActionsViewModel.kt */
    public static final class j {
        public final boolean a;
        public final String b;
        public final String c;

        public j(boolean z, String str, String str2) {
            this.a = z;
            this.b = str;
            this.c = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof j)) {
                return false;
            }
            j jVar = (j) obj;
            return this.a == jVar.a && epx.f(this.b, jVar.b) && epx.f(this.c, jVar.c);
        }

        public final int hashCode() {
            return this.c.hashCode() + urd0.a(Boolean.hashCode(this.a) * 31, 31, this.b);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("HolidayInteraction(isVisible=");
            sb.append(this.a);
            sb.append(", title=");
            sb.append(this.b);
            sb.append(", iconUrl=");
            return ho8.a(sb, this.c, ')');
        }
    }

    /* compiled from: VoipActionsViewModel.kt */
    public static final class k {
        public final AppLogsSending$SendType a;

        public k(AppLogsSending$SendType appLogsSending$SendType) {
            this.a = appLogsSending$SendType;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof k) && this.a == ((k) obj).a;
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "LogsSending(type=" + this.a + ')';
        }
    }

    /* compiled from: VoipActionsViewModel.kt */
    public static final class l {
        public final boolean a;
        public final boolean b;
        public final boolean c;
        public final k5x0.a d;

        public l(boolean z, boolean z2, boolean z3, k5x0.a aVar) {
            this.a = z;
            this.b = z2;
            this.c = z3;
            this.d = aVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof l)) {
                return false;
            }
            l lVar = (l) obj;
            return this.a == lVar.a && this.b == lVar.b && this.c == lVar.c && epx.f(this.d, lVar.d);
        }

        public final int hashCode() {
            return this.d.hashCode() + qoy.b(qoy.b(Boolean.hashCode(this.a) * 31, 31, this.b), 31, this.c);
        }

        public final String toString() {
            return "Mask(isVisible=" + this.a + ", isInitialized=" + this.b + ", isEnabled=" + this.c + ", effectState=" + this.d + ')';
        }
    }

    /* compiled from: VoipActionsViewModel.kt */
    public static final class m {
        public final boolean a;
        public final boolean b;

        public m(boolean z, boolean z2) {
            this.a = z;
            this.b = z2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof m)) {
                return false;
            }
            m mVar = (m) obj;
            return this.a == mVar.a && this.b == mVar.b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.b) + (Boolean.hashCode(this.a) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("MediaRequestAttention(isVisible=");
            sb.append(this.a);
            sb.append(", shouldShowAllText=");
            return defpackage.q0.a(sb, this.b, ')');
        }
    }

    /* compiled from: VoipActionsViewModel.kt */
    public static final class n {
        public final boolean a;
        public final CallsAudioDeviceInfo b;

        public n(boolean z, CallsAudioDeviceInfo callsAudioDeviceInfo) {
            this.a = z;
            this.b = callsAudioDeviceInfo;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof n)) {
                return false;
            }
            n nVar = (n) obj;
            return this.a == nVar.a && epx.f(this.b, nVar.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (Boolean.hashCode(this.a) * 31);
        }

        public final String toString() {
            return "MediaSettingAudio(isVisible=" + this.a + ", audioDevice=" + this.b + ')';
        }
    }

    /* compiled from: VoipActionsViewModel.kt */
    public static final class o {
        public final boolean a;
        public final MediaOptionState b;

        public o(boolean z, MediaOptionState mediaOptionState) {
            this.a = z;
            this.b = mediaOptionState;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof o)) {
                return false;
            }
            o oVar = (o) obj;
            return this.a == oVar.a && this.b == oVar.b;
        }

        public final int hashCode() {
            return this.b.hashCode() + (Boolean.hashCode(this.a) * 31);
        }

        public final String toString() {
            return "MediaSettingMicrophone(isVisible=" + this.a + ", state=" + this.b + ')';
        }
    }

    /* compiled from: VoipActionsViewModel.kt */
    public static final class p {
        public final boolean a;
        public final MediaOptionState b;

        public p(boolean z, MediaOptionState mediaOptionState) {
            this.a = z;
            this.b = mediaOptionState;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof p)) {
                return false;
            }
            p pVar = (p) obj;
            return this.a == pVar.a && this.b == pVar.b;
        }

        public final int hashCode() {
            return this.b.hashCode() + (Boolean.hashCode(this.a) * 31);
        }

        public final String toString() {
            return "MediaSettingVideo(isVisible=" + this.a + ", state=" + this.b + ')';
        }
    }

    /* compiled from: VoipActionsViewModel.kt */
    public static final class q {
        public final boolean a;
        public final boolean b;
        public final boolean c;
        public final NoiseSuppressorFeature$State d;

        public q(boolean z, boolean z2, boolean z3, NoiseSuppressorFeature$State noiseSuppressorFeature$State) {
            this.a = z;
            this.b = z2;
            this.c = z3;
            this.d = noiseSuppressorFeature$State;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof q)) {
                return false;
            }
            q qVar = (q) obj;
            return this.a == qVar.a && this.b == qVar.b && this.c == qVar.c && this.d == qVar.d;
        }

        public final int hashCode() {
            return this.d.hashCode() + qoy.b(qoy.b(Boolean.hashCode(this.a) * 31, 31, this.b), 31, this.c);
        }

        public final String toString() {
            return "NoiseSuppressor(isVisible=" + this.a + ", isInitialised=" + this.b + ", isEnabled=" + this.c + ", mode=" + this.d + ')';
        }
    }

    /* compiled from: VoipActionsViewModel.kt */
    public static final class r {
        public final boolean a;
        public final boolean b;
        public final boolean c;
        public final boolean d;

        public r(boolean z, boolean z2, boolean z3, boolean z4) {
            this.a = z;
            this.b = z2;
            this.c = z3;
            this.d = z4;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof r)) {
                return false;
            }
            r rVar = (r) obj;
            return this.a == rVar.a && this.b == rVar.b && this.c == rVar.c && this.d == rVar.d;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.d) + qoy.b(qoy.b(Boolean.hashCode(this.a) * 31, 31, this.b), 31, this.c);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("RecordStatus(isSupported=");
            sb.append(this.a);
            sb.append(", isEnabled=");
            sb.append(this.b);
            sb.append(", isStarted=");
            sb.append(this.c);
            sb.append(", isManagedByUser=");
            return defpackage.q0.a(sb, this.d, ')');
        }
    }

    /* compiled from: VoipActionsViewModel.kt */
    public static final class s {
        public final boolean a;
        public final boolean b;
        public final int c;
        public final boolean d;
        public final boolean e;
        public final boolean f;
        public final boolean g;
        public final String h;
        public final boolean i;

        public s(int i, String str, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7) {
            this.a = z;
            this.b = z2;
            this.c = i;
            this.d = z3;
            this.e = z4;
            this.f = z5;
            this.g = z6;
            this.h = str;
            this.i = z7;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof s)) {
                return false;
            }
            s sVar = (s) obj;
            return this.a == sVar.a && this.b == sVar.b && this.c == sVar.c && this.d == sVar.d && this.e == sVar.e && this.f == sVar.f && this.g == sVar.g && epx.f(this.h, sVar.h) && this.i == sVar.i;
        }

        public final int hashCode() {
            int b = qoy.b(qoy.b(qoy.b(qoy.b(shy.a(this.c, qoy.b(Boolean.hashCode(this.a) * 31, 31, this.b), 31), 31, this.d), 31, this.e), 31, this.f), 31, this.g);
            String str = this.h;
            return Boolean.hashCode(this.i) + ((b + (str == null ? 0 : str.hashCode())) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("SessionRooms(isConfigureOptionVisible=");
            sb.append(this.a);
            sb.append(", isConfigureOptionHighlighted=");
            sb.append(this.b);
            sb.append(", configureOptionTitle=");
            sb.append(this.c);
            sb.append(", isJoinOptionVisible=");
            sb.append(this.d);
            sb.append(", isJoinOptionEnabled=");
            sb.append(this.e);
            sb.append(", isAssistanceRequestOptionVisible=");
            sb.append(this.f);
            sb.append(", isSessionRoomLeaveVisible=");
            sb.append(this.g);
            sb.append(", roomName=");
            sb.append(this.h);
            sb.append(", isSendMessageToAllRoomsVisible=");
            return defpackage.q0.a(sb, this.i, ')');
        }
    }

    /* compiled from: VoipActionsViewModel.kt */
    public static final class t {
        public final boolean a;

        public t(boolean z) {
            this.a = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof t) && this.a == ((t) obj).a;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.a);
        }

        public final String toString() {
            return defpackage.q0.a(new StringBuilder("ShareLink(isVisible="), this.a, ')');
        }
    }

    /* compiled from: VoipActionsViewModel.kt */
    public static final class u {
        public final boolean a;
        public final boolean b;
        public final boolean c;
        public final k5x0.b d;

        public u(boolean z, boolean z2, boolean z3, k5x0.b bVar) {
            this.a = z;
            this.b = z2;
            this.c = z3;
            this.d = bVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof u)) {
                return false;
            }
            u uVar = (u) obj;
            return this.a == uVar.a && this.b == uVar.b && this.c == uVar.c && epx.f(this.d, uVar.d);
        }

        public final int hashCode() {
            return this.d.hashCode() + qoy.b(qoy.b(Boolean.hashCode(this.a) * 31, 31, this.b), 31, this.c);
        }

        public final String toString() {
            return "VirtualBackground(isVisible=" + this.a + ", isInitialized=" + this.b + ", isEnabled=" + this.c + ", effectState=" + this.d + ')';
        }
    }

    /* compiled from: VoipActionsViewModel.kt */
    public static final class v {
        public final boolean a;
        public final boolean b;
        public final boolean c;
        public final w5w0 d;

        public v(boolean z, boolean z2, boolean z3, w5w0 w5w0Var) {
            this.a = z;
            this.b = z2;
            this.c = z3;
            this.d = w5w0Var;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof v)) {
                return false;
            }
            v vVar = (v) obj;
            return this.a == vVar.a && this.b == vVar.b && this.c == vVar.c && epx.f(this.d, vVar.d);
        }

        public final int hashCode() {
            return this.d.hashCode() + qoy.b(qoy.b(Boolean.hashCode(this.a) * 31, 31, this.b), 31, this.c);
        }

        public final String toString() {
            return "VmojiStatus(isVisible=" + this.a + ", isEnabled=" + this.b + ", isInitialized=" + this.c + ", vmoji=" + this.d + ')';
        }
    }

    /* compiled from: VoipActionsViewModel.kt */
    public static final class w {
        public final boolean a;
        public final boolean b;

        public w(boolean z, boolean z2) {
            this.a = z;
            this.b = z2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof w)) {
                return false;
            }
            w wVar = (w) obj;
            return this.a == wVar.a && this.b == wVar.b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.b) + (Boolean.hashCode(this.a) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("WatchTogether(isVisible=");
            sb.append(this.a);
            sb.append(", isEnabled=");
            return defpackage.q0.a(sb, this.b, ')');
        }
    }
}

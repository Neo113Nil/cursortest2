package xsna;

import com.vk.dto.common.id.UserId;
import com.vk.voip.api.id.CallId;
import io.reactivex.rxjava3.internal.functions.a;
import ru.ok.android.webrtc.sessionroom.SessionRoomId;
import xsna.dd9;
import xsna.nmw0;

/* compiled from: VoipChatInfoLoader.kt */
/* loaded from: classes7.dex */
public final class pmw0 {
    public final rd9 a;
    public final nmw0.a b;
    public final nmw0.b c;
    public final nmw0.c d;
    public final yqd0 e;
    public io.reactivex.rxjava3.disposables.c f;
    public final io.reactivex.rxjava3.disposables.b g;
    public final io.reactivex.rxjava3.subjects.f<a> h;

    /* compiled from: VoipChatInfoLoader.kt */
    public interface a {

        /* compiled from: VoipChatInfoLoader.kt */
        /* renamed from: xsna.pmw0$a$a, reason: collision with other inner class name */
        public static final class C3519a implements a {
            public static final C3519a a = new C3519a();
        }

        /* compiled from: VoipChatInfoLoader.kt */
        public static final class b implements a {
            public final CallId a;
            public final SessionRoomId b;

            public b(CallId callId, SessionRoomId sessionRoomId) {
                this.a = callId;
                this.b = sessionRoomId;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof b)) {
                    return false;
                }
                b bVar = (b) obj;
                return epx.f(this.a, bVar.a) && epx.f(this.b, bVar.b);
            }

            public final int hashCode() {
                return this.b.hashCode() + (this.a.b.hashCode() * 31);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder();
                sb.append(this.a);
                sb.append(':');
                sb.append(this.b);
                return sb.toString();
            }
        }
    }

    public pmw0(cd9 cd9Var, rd9 rd9Var, nmw0.a aVar, nmw0.b bVar, nmw0.c cVar, yqd0 yqd0Var) {
        this.a = rd9Var;
        this.b = aVar;
        this.c = bVar;
        this.d = cVar;
        this.e = yqd0Var;
        io.reactivex.rxjava3.disposables.b bVar2 = new io.reactivex.rxjava3.disposables.b();
        this.g = bVar2;
        io.reactivex.rxjava3.subjects.f<a> fVar = new io.reactivex.rxjava3.subjects.f<>();
        this.h = fVar;
        io.reactivex.rxjava3.core.q<dd9.a> d = cd9Var.d((UserId) yqd0Var.invoke());
        asu0 asu0Var = asu0.a;
        bVar2.b(d.a0(asu0Var.d()).subscribe(new xvr0(new z7t0(this, 6), 6)));
        io.reactivex.rxjava3.internal.operators.observable.m1 a0 = fVar.a0(asu0Var.d());
        jw80 jw80Var = new jw80(new wql0(17), 27);
        a.l lVar = io.reactivex.rxjava3.internal.functions.a.d;
        a.k kVar = io.reactivex.rxjava3.internal.functions.a.c;
        bVar2.b(new io.reactivex.rxjava3.internal.operators.observable.y(a0.E(jw80Var, lVar, kVar, kVar), io.reactivex.rxjava3.internal.functions.a.a, io.reactivex.rxjava3.internal.functions.b.a).b0(a.b.class).subscribe(new xvq0(new omw0(1, this, pmw0.class, "executeRequest", "executeRequest(Lcom/vk/voip/ui/chatinfo/VoipChatInfoLoader$ChatInfoRequest$RealRequest;)V", 0), 12)));
    }
}

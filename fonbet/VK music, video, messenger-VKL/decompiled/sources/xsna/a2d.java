package xsna;

import android.os.Handler;
import android.view.View;
import java.util.Collection;
import java.util.HashSet;
import ru.ok.android.externcalls.sdk.sessionroom.internal.participant.SessionRoomParticipantsDataProviderImpl;
import ru.ok.android.webrtc.sessionroom.SessionRoomId;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes17.dex */
public final /* synthetic */ class a2d implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ a2d(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f = obj4;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.gzs
    public final Object invoke() {
        HashSet g;
        s3q0 roomParticipants$lambda$0;
        switch (this.b) {
            case 0:
                return new i1d(((w6d) ((b2d) this.c).a.getValue()).n, (u6d) this.d, (jlh0) this.e, (cjh0) this.f);
            case 1:
                c7x c7xVar = (c7x) this.c;
                Throwable th = (Throwable) this.d;
                String str = (String) this.e;
                izs izsVar = (izs) this.f;
                c7xVar.f(th);
                r6x e = c7xVar.e(th);
                synchronized (e) {
                    e.b();
                    u6x u6xVar = e.g;
                    synchronized (u6xVar) {
                        u6xVar.e();
                        u6xVar.h("external instant cancel requested by '" + str + '\'');
                        g = u6xVar.g(str, izsVar);
                    }
                }
                return g;
            case 2:
                roomParticipants$lambda$0 = SessionRoomParticipantsDataProviderImpl.getRoomParticipants$lambda$0((izs) this.c, (SessionRoomId) this.d, (SessionRoomParticipantsDataProviderImpl) this.e, (Collection) this.f);
                return roomParticipants$lambda$0;
            default:
                Handler handler = (Handler) this.c;
                gzs gzsVar = (gzs) this.d;
                View view = (View) this.e;
                vvt0 vvt0Var = (vvt0) this.f;
                handler.removeCallbacksAndMessages(null);
                if (gzsVar != null) {
                    gzsVar.invoke();
                }
                view.removeOnLayoutChangeListener(vvt0Var);
                return s3q0.a;
        }
    }
}

package xsna;

import com.vk.core.compose.component.modal.SheetValue;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Ref$ObjectRef;
import ru.ok.android.externcalls.sdk.layout.ConversationVideoTrackParticipantKey;
import ru.ok.android.externcalls.sdk.ui.FrameDecorator;
import ru.ok.android.externcalls.sdk.ui.TextureViewRenderer;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class y2t implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ y2t(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f = obj4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v7, types: [T, io.reactivex.rxjava3.disposables.c] */
    @Override // xsna.gzs
    public final Object invoke() {
        switch (this.b) {
            case 0:
                Ref$ObjectRef ref$ObjectRef = (Ref$ObjectRef) this.c;
                io.reactivex.rxjava3.disposables.b bVar = (io.reactivex.rxjava3.disposables.b) this.d;
                c3t c3tVar = (c3t) this.e;
                io.reactivex.rxjava3.subjects.f fVar = (io.reactivex.rxjava3.subjects.f) this.f;
                io.reactivex.rxjava3.disposables.c cVar = (io.reactivex.rxjava3.disposables.c) ref$ObjectRef.element;
                if (cVar != null) {
                    cVar.dispose();
                }
                io.reactivex.rxjava3.internal.operators.observable.y yVar = new io.reactivex.rxjava3.internal.operators.observable.y(new io.reactivex.rxjava3.internal.operators.observable.o0(io.reactivex.rxjava3.core.q.P(0L, 100L, TimeUnit.MILLISECONDS).t0(12L), new d22(new lrk(c3tVar, 16), 17)), new q9(new dh5(27), 11), io.reactivex.rxjava3.internal.functions.b.a);
                asu0 asu0Var = asu0.a;
                ?? subscribe = yVar.r0(asu0Var.c()).a0(asu0Var.d()).subscribe(new xn(new eaa(14, fVar, ref$ObjectRef), 22), new xz(new oj(28), 23));
                bVar.b(subscribe);
                ref$ObjectRef.element = subscribe;
                return s3q0.a;
            case 1:
                fdj0 fdj0Var = (fdj0) this.c;
                yvj yvjVar = (yvj) this.d;
                if2 if2Var = (if2) this.e;
                gzs gzsVar = (gzs) this.f;
                if (((SheetValue) ((zak0) fdj0Var.b.f).getValue()) == SheetValue.Expanded && fdj0Var.b.e().f(SheetValue.PartiallyExpanded)) {
                    myc0.h(yvjVar, null, null, new gix(if2Var, null), 3);
                    myc0.h(yvjVar, null, null, new hix(fdj0Var, null), 3);
                } else {
                    myc0.h(yvjVar, null, null, new iix(fdj0Var, null), 3).E(new dix(0, gzsVar));
                }
                return s3q0.a;
            case 2:
                es60 es60Var = (es60) this.c;
                jm50 jm50Var = (jm50) this.d;
                h0b h0bVar = (h0b) this.e;
                return new kr60(es60Var.c, es60Var.e, es60Var.g, es60Var.i, es60Var.j, jm50Var, new eht((gtq0) this.f, h0bVar));
            default:
                sct0 sct0Var = (sct0) this.c;
                sct0Var.b.setParticipantView((ConversationVideoTrackParticipantKey) this.d, (TextureViewRenderer) this.e, (FrameDecorator) this.f);
                return s3q0.a;
        }
    }
}

package xsna;

import android.graphics.Bitmap;
import com.vk.api.sdk.exceptions.VKApiExecutionException;
import com.vk.httpexecutor.api.NetworkClient;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.collections.EmptyList;
import okhttp3.p;
import ru.ok.android.externcalls.sdk.id.ParticipantId;
import ru.ok.android.externcalls.sdk.stereo.StereoRoomManager;
import ru.ok.android.externcalls.sdk.stereo.StereoRoomManagerAdaptersKt;
import ru.ok.pattern.entity.PatternMatch;
import ru.ok.pattern.entity.PatternMatchRaw;
import ru.ok.pattern.pipeline.BodyPatternMatchingPipeline;
import ru.ok.tensorflow.util.Function;
import xsna.rfb0;
import xsna.tq70;
import xsna.v7s0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes9.dex */
public final /* synthetic */ class sj7 implements Function, io.reactivex.rxjava3.core.d, tq70.b, io.reactivex.rxjava3.core.s, yads.ng1 {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ sj7(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    @Override // xsna.tq70.b
    public void accept(Object obj) {
        ((rfb0.a) obj).d((g250) this.c, (VKApiExecutionException) ((Throwable) this.d));
    }

    @Override // ru.ok.tensorflow.util.Function
    public Object apply(Object obj) {
        PatternMatch lambda$process$7;
        lambda$process$7 = ((BodyPatternMatchingPipeline) this.c).lambda$process$7((Bitmap) this.d, (PatternMatchRaw) obj);
        return lambda$process$7;
    }

    @Override // yads.ng1
    public void invoke(Object obj) {
        ((yads.af) obj).getClass();
    }

    @Override // io.reactivex.rxjava3.core.s
    public void subscribe(io.reactivex.rxjava3.core.r rVar) {
        String str = (String) this.c;
        b0m0 b0m0Var = (b0m0) this.d;
        o260 o260Var = d260.a;
        if (o260Var == null) {
            o260Var = null;
        }
        o260Var.getClass();
        okhttp3.o b = o260Var.b(NetworkClient.ClientType.CLIENT_DEFAULT);
        p.a aVar = new p.a();
        aVar.i(str);
        aVar.d();
        f8f0 f8f0Var = (f8f0) b.a(aVar.b());
        f8f0Var.f9(new e0a(b0m0Var, rVar));
        rVar.a(new wzl0(f8f0Var, 0));
    }

    @Override // io.reactivex.rxjava3.core.d
    public void subscribe(io.reactivex.rxjava3.core.b bVar) {
        switch (this.b) {
            case 1:
                final mx8 mx8Var = (mx8) this.c;
                final ay8 ay8Var = (ay8) this.d;
                v7s0 v7s0Var = mx8Var.a;
                String str = ay8Var.d;
                r7s0 r7s0Var = ay8Var.e;
                o7o o7oVar = v7s0Var.e(r7s0Var).g.get(str);
                boolean z = false;
                if (o7oVar != null && o7oVar.b == 3) {
                    z = true;
                }
                final nx8 nx8Var = new nx8(ay8Var, mx8Var, bVar);
                if (z) {
                    bVar.onComplete();
                } else {
                    v7s0Var.c(r7s0Var, nx8Var);
                    v7s0Var.b(ay8Var);
                }
                bVar.a(new io.reactivex.rxjava3.functions.e() { // from class: xsna.lx8
                    @Override // io.reactivex.rxjava3.functions.e
                    public final void cancel() {
                        v7s0 v7s0Var2 = mx8.this.a;
                        r7s0 r7s0Var2 = ay8Var.e;
                        ConcurrentHashMap<r7s0, List<v7s0.a>> concurrentHashMap = v7s0Var2.d;
                        List<v7s0.a> list = concurrentHashMap.get(r7s0Var2);
                        if (list == null) {
                            list = EmptyList.b;
                        }
                        concurrentHashMap.put(r7s0Var2, j5g.s0(list, nx8Var));
                    }
                });
                break;
            default:
                StereoRoomManagerAdaptersKt.unpromoteParticipant$lambda$0((StereoRoomManager) this.c, (ParticipantId) this.d, bVar);
                break;
        }
    }
}

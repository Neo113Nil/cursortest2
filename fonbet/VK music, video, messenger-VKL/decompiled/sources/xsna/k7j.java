package xsna;

import com.vk.media.player.video.view.SimpleVideoView;
import ru.ok.gl.util.Consumer2;
import xsna.by1;
import xsna.ihz;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes9.dex */
public final /* synthetic */ class k7j implements Consumer2, ihz.a, SimpleVideoView.m {
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ k7j(Object obj, Object obj2) {
        this.b = obj;
        this.c = obj2;
    }

    @Override // ru.ok.gl.util.Consumer2
    public void accept(Object obj, Object obj2) {
        ((Consumer2) this.b).lambda$andThen$0((Consumer2) this.c, obj, obj2);
    }

    @Override // xsna.ihz.a
    public void invoke(Object obj) {
        bpz bpzVar = (bpz) this.b;
        pr10 pr10Var = (pr10) this.c;
        by1 by1Var = (by1) obj;
        by1Var.getClass();
        by1Var.F(bpzVar, pr10Var);
    }

    @Override // com.vk.media.player.video.view.SimpleVideoView.m
    public void onPrepared() {
        SimpleVideoView.m mVar = (SimpleVideoView.m) this.b;
        i0q0.i(1L, new qb3((grt0) this.c, 17));
        if (mVar != null) {
            mVar.onPrepared();
        }
    }

    public /* synthetic */ k7j(by1.a aVar, bpz bpzVar, pr10 pr10Var, int i) {
        this.b = bpzVar;
        this.c = pr10Var;
    }
}

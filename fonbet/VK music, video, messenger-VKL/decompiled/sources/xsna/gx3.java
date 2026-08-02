package xsna;

import com.vk.dto.common.Image;
import java.util.Collections;
import kotlin.collections.EmptyList;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class gx3 implements io.reactivex.rxjava3.functions.n {
    public final /* synthetic */ ix3 b;

    public /* synthetic */ gx3(ix3 ix3Var) {
        this.b = ix3Var;
    }

    @Override // io.reactivex.rxjava3.functions.n
    public final Object get() {
        ix3 ix3Var = this.b;
        io.reactivex.rxjava3.subjects.d<Image> dVar = ix3Var.b;
        if (dVar.Q0()) {
            return dVar.K();
        }
        dz2 x = yfb.x(ix3Var.a.b(Collections.singletonList("clipsAppOnboarding")));
        ahn.D(x);
        return new io.reactivex.rxjava3.internal.operators.single.o(rsg0.w0(x).l(new q40(new pe1(3), 2)), new js1(new t9(ix3Var, 4), 2)).o(new Image(EmptyList.b));
    }
}

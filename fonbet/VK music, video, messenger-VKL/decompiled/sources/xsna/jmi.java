package xsna;

import com.vk.libvideo.design.compose.video.videocard.VideoCardViewState;
import io.requery.android.database.sqlite.SQLiteStatement;
import xsna.i8s0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class jmi implements yzs {
    public final /* synthetic */ int b;

    public /* synthetic */ jmi(int i) {
        this.b = i;
    }

    @Override // xsna.yzs
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.b) {
            case 0:
                i8s0.a.C3039a c3039a = (i8s0.a.C3039a) obj;
                androidx.compose.runtime.a aVar = (androidx.compose.runtime.a) obj2;
                int intValue = ((Integer) obj3).intValue();
                if ((intValue & 6) == 0) {
                    intValue |= aVar.J(c3039a) ? 4 : 2;
                }
                if (aVar.t(intValue & 1, (intValue & 19) != 18)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-287662308, intValue, -1, "com.vk.design.demo.presentation.screens.ComposableSingletons$VideoCardScreenContentKt.lambda$-287662308.<anonymous> (VideoCardScreenContent.kt:65)");
                    }
                    c3039a.a.d().c(VideoCardViewState.Size.Medium, aVar, 6);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar.h();
                }
                return s3q0.a;
            case 1:
                ((SQLiteStatement) obj).bindLong(((Integer) obj3).intValue(), ((com.vk.im.engine.models.dialogs.b) obj2).X);
                return s3q0.a;
            default:
                ep10 ep10Var = (ep10) obj;
                zo10 zo10Var = (zo10) obj2;
                o6j o6jVar = (o6j) obj3;
                long j = o6jVar.a;
                if (o6j.e(j)) {
                    int r0 = ep10Var.r0(kqu0.v) + ep10Var.r0(kqu0.w);
                    j = o6j.b(o6j.i(j) + r0, o6jVar.a, o6j.i(j) + r0, 0, 0, 12);
                }
                tra0 N = zo10Var.N(j);
                return ep10Var.Q(N.b, N.c, jgp.b, new ba40(N, 21));
        }
    }
}

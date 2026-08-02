package defpackage;

import androidx.camera.camera2.internal.d;
import androidx.camera.camera2.internal.l;
import androidx.camera.core.ImageCaptureException;
import androidx.camera.core.g;
import androidx.camera.core.impl.SessionConfig$SessionError;
import androidx.camera.core.impl.UseCaseConfigFactory$CaptureType;
import androidx.camera.video.i;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.ExecutionException;

/* loaded from: classes10.dex */
public final /* synthetic */ class p8v implements fyq0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ p8v(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.fyq0
    public final void a(jyq0 jyq0Var, SessionConfig$SessionError sessionConfig$SessionError) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                w8v w8vVar = (w8v) obj;
                if (w8vVar.e() != null) {
                    z7x0 z7x0Var = w8vVar.y;
                    z7x0Var.getClass();
                    tob1.b();
                    z7x0Var.y = true;
                    n9j0 n9j0Var = z7x0Var.w;
                    if (n9j0Var != null) {
                        tob1.b();
                        if (!n9j0Var.d.b.isDone()) {
                            ImageCaptureException imageCaptureException = new ImageCaptureException(3, "The request is aborted silently and retried.", null);
                            tob1.b();
                            n9j0Var.g = true;
                            o89 o89Var = n9j0Var.i;
                            Objects.requireNonNull(o89Var);
                            o89Var.cancel(true);
                            n9j0Var.e.d(imageCaptureException);
                            n9j0Var.f.b(null);
                            z7x0 z7x0Var2 = n9j0Var.b;
                            b8x0 b8x0Var = n9j0Var.a;
                            tob1.b();
                            sgb1.g(3, "TakePictureManagerImpl");
                            z7x0Var2.a.addFirst(b8x0Var);
                            z7x0Var2.c();
                        }
                    }
                    w8vVar.H(true);
                    String g = w8vVar.g();
                    x8v x8vVar = (x8v) w8vVar.h;
                    lru0 lru0Var = w8vVar.i;
                    lru0Var.getClass();
                    dyq0 I = w8vVar.I(g, x8vVar, lru0Var);
                    w8vVar.w = I;
                    Object[] objArr = {I.d()};
                    ArrayList arrayList = new ArrayList(1);
                    Object obj2 = objArr[0];
                    Objects.requireNonNull(obj2);
                    arrayList.add(obj2);
                    w8vVar.G(Collections.unmodifiableList(arrayList));
                    w8vVar.s();
                    z7x0 z7x0Var3 = w8vVar.y;
                    z7x0Var3.getClass();
                    tob1.b();
                    z7x0Var3.y = false;
                    z7x0Var3.c();
                    break;
                }
                break;
            case 1:
                v920 v920Var = (v920) obj;
                v920Var.b = v920Var.c();
                mm7 mm7Var = (mm7) v920Var.x;
                if (mm7Var != null) {
                    l lVar = mm7Var.b;
                    try {
                        if (((Boolean) jx81.r(new mm7(lVar, 2)).b.get()).booleanValue()) {
                            v920 v920Var2 = lVar.U;
                            jyq0 jyq0Var2 = (jyq0) v920Var2.b;
                            u920 u920Var = (u920) v920Var2.c;
                            lVar.c.execute(new d(lVar, l.z(v920Var2), jyq0Var2, u920Var, null, Collections.singletonList(UseCaseConfigFactory$CaptureType.METERING_REPEATING)));
                            break;
                        }
                    } catch (InterruptedException | ExecutionException e) {
                        ny61.n("Unable to check if MeteringRepeating is attached.", e);
                        return;
                    }
                }
                break;
            case 2:
                g gVar = (g) obj;
                if (gVar.e() != null) {
                    gVar.K((txe0) gVar.h, gVar.i);
                    gVar.s();
                    break;
                }
                break;
            case 3:
                Iterator it = ((hyq0) obj).n.iterator();
                while (it.hasNext()) {
                    ((fyq0) it.next()).a(jyq0Var, sessionConfig$SessionError);
                }
                break;
            default:
                ((i) obj).P();
                break;
        }
    }
}

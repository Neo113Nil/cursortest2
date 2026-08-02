package xsna;

import android.graphics.Bitmap;
import android.view.View;
import com.vk.attachpicker.screen.p;
import java.util.concurrent.Future;
import ru.mail.libverify.j0.j;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes15.dex */
public final /* synthetic */ class j3u0 implements p.e, j.c, yads.u31 {
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ j3u0(Object obj, Object obj2) {
        this.b = obj;
        this.c = obj2;
    }

    @Override // ru.mail.libverify.j0.j.c
    public void a(Future future) {
        ((ru.mail.libverify.api.s) this.b).b((ru.mail.libverify.requests.a) this.c, future);
    }

    public void b(Bitmap bitmap) {
        yads.y31.a((yads.v31) this.b, (yads.y31) this.c, bitmap);
    }

    @Override // com.vk.attachpicker.screen.p.e
    public void a(View view) {
        com.vk.attachpicker.screen.p pVar = (com.vk.attachpicker.screen.p) this.b;
        zmw[] zmwVarArr = (zmw[]) this.c;
        pVar.getClass();
        if (view instanceof zmw) {
            zmw zmwVar = (zmw) view;
            if (zmwVar.getPosition() == pVar.R) {
                zmwVarArr[0] = zmwVar;
            }
        }
    }
}

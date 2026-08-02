package xsna;

import android.net.Uri;
import com.vk.dto.photo.Photo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.collections.EmptyList;
import xsna.qge;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class jm9 implements Callable {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ jm9(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        tam0 tam0Var;
        switch (this.b) {
            case 0:
                List<Photo> list = ((com.vk.cameraui.impl.a) this.c).c.i0;
                if (list == null) {
                    return EmptyList.b;
                }
                ArrayList arrayList = new ArrayList();
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    String str = ((Photo) it.next()).t;
                    if (str != null) {
                        tam0Var = new tam0(new yaa0(brm0.B(str, "http", false) ? Uri.parse(str) : Uri.parse("file://".concat(str))), new ArrayList(), false, null, null, false, false, null, null, null, null, null, true, null, null, null, false, null, null, 520176);
                    } else {
                        tam0Var = null;
                    }
                    if (tam0Var != null) {
                        arrayList.add(tam0Var);
                    }
                }
                return arrayList;
            default:
                qge qgeVar = (qge) this.c;
                qhe qheVar = qgeVar.a;
                io.reactivex.rxjava3.disposables.c cVar = qgeVar.c;
                if (cVar == null || cVar.h()) {
                    io.reactivex.rxjava3.disposables.c subscribe = qheVar.e().subscribe(new ji3(new g20(qgeVar, 28), 14));
                    c63.a(new qge.a(subscribe));
                    qgeVar.c = subscribe;
                }
                io.reactivex.rxjava3.disposables.c cVar2 = qgeVar.d;
                if (cVar2 == null || cVar2.h()) {
                    io.reactivex.rxjava3.disposables.c subscribe2 = qheVar.i().subscribe(new kl6(new rge(1, qgeVar.b, eie.class, "setStatus", "setStatus(Lcom/vk/clips/interests/api/ClipsInterestsStatusProvider$Status;)V", 0), 6));
                    c63.a(new qge.a(subscribe2));
                    qgeVar.d = subscribe2;
                }
                return s3q0.a;
        }
    }
}

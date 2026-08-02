package xsna;

import androidx.recyclerview.widget.m;
import com.vk.dto.video.VideoOwner;
import java.util.ArrayList;
import java.util.List;
import xsna.nef0;

/* compiled from: RecommendedPresenter.java */
/* loaded from: classes3.dex */
public final class mef0 extends io.reactivex.rxjava3.observers.a<List<VideoOwner>> {
    public final /* synthetic */ nef0 c;

    public mef0(nef0 nef0Var) {
        this.c = nef0Var;
    }

    @Override // io.reactivex.rxjava3.core.v
    public final void onComplete() {
        wcf0 wcf0Var = this.c.d;
        wcf0Var.setProgressVisibility(false);
        wcf0Var.setErrorVisibility(false);
    }

    @Override // io.reactivex.rxjava3.core.v
    public final void onError(Throwable th) {
        wcf0 wcf0Var = this.c.d;
        wcf0Var.setProgressVisibility(false);
        wcf0Var.setErrorVisibility(true);
    }

    @Override // io.reactivex.rxjava3.core.v
    public final void onNext(Object obj) {
        List<VideoOwner> list = (List) obj;
        nef0 nef0Var = this.c;
        qef0 qef0Var = nef0Var.f;
        wcf0 wcf0Var = nef0Var.d;
        if (nef0Var.i) {
            nef0Var.i = false;
            qef0Var.c.addAll(list);
            qef0Var.notifyDataSetChanged();
            if (nef0Var.l) {
                nef0Var.d();
            }
        } else {
            ArrayList arrayList = qef0Var.c;
            nef0.a aVar = new nef0.a();
            aVar.b = arrayList;
            aVar.c = list;
            m.d a = androidx.recyclerview.widget.m.a(aVar, true);
            qef0Var.c.clear();
            qef0Var.c.addAll(list);
            a.b(qef0Var);
        }
        wcf0Var.setProgressVisibility(false);
        wcf0Var.setErrorVisibility(false);
    }
}

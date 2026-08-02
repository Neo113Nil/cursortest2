package xsna;

import com.vk.core.serialize.Serializer;
import com.vk.im.chat.clips.decoration.impl.presentation.bottom.view.linkedtext.LinkedMessageView;
import com.vk.masks.MasksController;
import com.vk.newsfeed.impl.discover.repository.TemporaryCache;
import xsna.kkl0;
import xsna.xjl0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class afs implements io.reactivex.rxjava3.functions.f {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ afs(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // io.reactivex.rxjava3.functions.f
    public final void accept(Object obj) {
        switch (this.b) {
            case 0:
                ((zes) this.c).invoke(obj);
                return;
            case 1:
                ((v6k) this.c).invoke(obj);
                return;
            case 2:
                ((u3u) this.c).invoke(obj);
                return;
            case 3:
                ((rh6) this.c).invoke(obj);
                return;
            case 4:
                LinkedMessageView.a aVar = (LinkedMessageView.a) this.c;
                int i = LinkedMessageView.f;
                aVar.invoke(obj);
                return;
            case 5:
                MasksController masksController = (MasksController) this.c;
                io.reactivex.rxjava3.disposables.c cVar = (io.reactivex.rxjava3.disposables.c) obj;
                synchronized (masksController) {
                    masksController.i = cVar;
                }
                return;
            case 6:
                ((u3u) this.c).invoke(obj);
                return;
            case 7:
                ((u3u) this.c).invoke(obj);
                return;
            case 8:
                ((u3u) this.c).invoke(obj);
                return;
            case 9:
                ((ie8) this.c).invoke(obj);
                return;
            case 10:
                ((u3u) this.c).invoke(obj);
                return;
            case 11:
                ((u3u) this.c).invoke(obj);
                return;
            case 12:
                ((jl6) this.c).invoke(obj);
                return;
            case 13:
                ((bqt) this.c).invoke(obj);
                return;
            case 14:
                ((com.vk.movika.sdk.base.logic.processor.d) this.c).invoke(obj);
                return;
            case 15:
                ((com.vk.movika.sdk.base.logic.processor.d) this.c).invoke(obj);
                return;
            case 16:
                ((i750) this.c).invoke(obj);
                return;
            case 17:
                ((com.vk.movika.sdk.base.logic.processor.d) this.c).invoke(obj);
                return;
            case 18:
                ((bqt) this.c).invoke(obj);
                return;
            case 19:
                ((isc0) this.c).e((lsc0) obj);
                return;
            case 20:
                ((jl6) this.c).invoke(obj);
                return;
            case 21:
                ((jl6) this.c).invoke(obj);
                return;
            case 22:
                ((xc50) this.c).invoke(obj);
                return;
            case 23:
                ((ece0) this.c).invoke(obj);
                return;
            case 24:
                ((bqt) this.c).invoke(obj);
                return;
            case 25:
                gpl0 gpl0Var = (gpl0) this.c;
                Throwable th = (Throwable) obj;
                mzp0 mzp0Var = gpl0Var.g;
                if (mzp0Var != null) {
                    mzp0Var.f();
                }
                gpl0Var.e(kkl0.c.a);
                gpl0Var.c(new xjl0.a(th));
                return;
            case 26:
                ((ucm0) this.c).invoke(obj);
                return;
            case 27:
                ((v6k) this.c).invoke(obj);
                return;
            case 28:
                ((bqt) this.c).invoke(obj);
                return;
            default:
                t9o0 t9o0Var = (t9o0) this.c;
                Serializer.c<TemporaryCache> cVar2 = TemporaryCache.CREATOR;
                t9o0Var.invoke(obj);
                return;
        }
    }
}

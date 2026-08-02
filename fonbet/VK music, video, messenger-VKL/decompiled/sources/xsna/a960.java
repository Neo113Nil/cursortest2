package xsna;

import com.vk.bridges.di.BridgeComponent;
import com.vk.channels.impl.post_settings.g;
import com.vk.im.engine.models.ProfilesInfo;
import com.vk.im.engine.models.ProfilesSimpleInfo;
import com.vk.im.engine.models.dialogs.Dialog;
import com.vk.log.L;
import com.vk.newsfeed.posting.impl.presentation.base.fragment.PostingFragment;
import com.vk.profile.questions.impl.h;
import com.vk.search.fragment.RestoreSearchFragment;
import java.util.ArrayList;
import java.util.Iterator;
import xsna.yo60;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes5.dex */
public final /* synthetic */ class a960 implements io.reactivex.rxjava3.functions.f {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ a960(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Type inference failed for: r0v49, types: [com.vk.pushes.PushAwareActivity, xsna.l4o0$b] */
    @Override // io.reactivex.rxjava3.functions.f
    public final void accept(Object obj) {
        switch (this.b) {
            case 0:
                ((b810) this.c).invoke(obj);
                break;
            case 1:
                rq60 rq60Var = (rq60) this.c;
                if (!((BridgeComponent) rq60Var.i.getValue()).s().b()) {
                    rq60Var.c(yo60.e.g.a);
                    break;
                }
                break;
            case 2:
                ((b810) this.c).invoke(obj);
                break;
            case 3:
                ((b810) this.c).invoke(obj);
                break;
            case 4:
                ((n15) this.c).invoke(obj);
                break;
            case 5:
                ((com.vk.libvideo.b) this.c).invoke(obj);
                break;
            case 6:
                ((com.vk.libvideo.design.view.video.a) this.c).invoke(obj);
                break;
            case 7:
                ((b810) this.c).invoke(obj);
                break;
            case 8:
                Throwable th = (Throwable) obj;
                ((com.vk.channels.impl.post_settings.b) this.c).n(new g.c(th));
                L.i(th);
                break;
            case 9:
                ((c3v) this.c).invoke(obj);
                break;
            case 10:
                fv90 fv90Var = (fv90) this.c;
                int i = PostingFragment.L0;
                fv90Var.invoke(obj);
                break;
            case 11:
                ((b810) this.c).invoke(obj);
                break;
            case 12:
                ((svz) this.c).invoke(obj);
                break;
            case 13:
                ((b810) this.c).invoke(obj);
                break;
            case 14:
                ((h.f) this.c).invoke(obj);
                break;
            case 15:
                ((com.vk.libvideo.design.view.video.a) this.c).invoke(obj);
                break;
            case 16:
                svz svzVar = (svz) this.c;
                int i2 = RestoreSearchFragment.h0;
                svzVar.invoke(obj);
                break;
            case 17:
                ((snj0) this.c).invoke(obj);
                break;
            case 18:
                ((b810) this.c).invoke(obj);
                break;
            case 19:
                ((qzl0) this.c).invoke(obj);
                break;
            case 20:
                ((fxi0) this.c).invoke(obj);
                break;
            case 21:
                ((qzl0) this.c).invoke(obj);
                break;
            case 22:
                ((qzl0) this.c).invoke(obj);
                break;
            case 23:
                l4o0 l4o0Var = (l4o0) this.c;
                j7j0 j7j0Var = (j7j0) obj;
                l4o0Var.i = !l4o0Var.i;
                ArrayList arrayList = j7j0Var.a;
                ProfilesInfo profilesInfo = j7j0Var.b;
                ArrayList arrayList2 = new ArrayList();
                ProfilesSimpleInfo Ob = profilesInfo.Ob();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    Dialog dialog = (Dialog) it.next();
                    if (dialog.Gb()) {
                        arrayList2.add(l4o0Var.f.a(dialog, Ob));
                    }
                }
                boolean z = j7j0Var.c;
                ?? r0 = l4o0Var.h;
                if (r0 != 0) {
                    r0.v(arrayList2, z);
                    break;
                }
                break;
            case 24:
                ((qzl0) this.c).invoke(obj);
                break;
            case 25:
                ((snj0) this.c).invoke(obj);
                break;
            case 26:
                ((n99) this.c).invoke(obj);
                break;
            case 27:
                ((n15) this.c).invoke(obj);
                break;
            case 28:
                ((q69) this.c).invoke(obj);
                break;
            default:
                ((qzl0) this.c).invoke(obj);
                break;
        }
    }
}

package xsna;

import com.vk.biometrics.lock.impl.service.HidePushContentService;
import com.vk.channels.impl.list.g;
import com.vk.clips.entrypoints.ui.ClipsEntryPointDraftsFragment;
import com.vk.clips.viewer.impl.grid.lists.fragments.ClipsGridDraftsListFragment;
import java.util.Set;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class qz implements io.reactivex.rxjava3.functions.f {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ qz(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // io.reactivex.rxjava3.functions.f
    public final void accept(Object obj) {
        int i = this.b;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                ((pz) obj2).invoke(obj);
                break;
            case 1:
                ((com.vk.movika.sdk.base.observable.w) obj2).invoke(obj);
                break;
            case 2:
                ((pz) obj2).invoke(obj);
                break;
            case 3:
                ((pz) obj2).invoke(obj);
                break;
            case 4:
                ((vw4) obj2).invoke(obj);
                break;
            case 5:
                ((p0) obj2).invoke(obj);
                break;
            case 6:
                ((td0) obj2).invoke(obj);
                break;
            case 7:
                com.vk.channels.impl.list.b bVar = (com.vk.channels.impl.list.b) obj2;
                Throwable th = (Throwable) obj;
                bVar.s().b(th, new x5(6));
                bVar.n(new g.b(th));
                break;
            case 8:
                int i2 = ClipsEntryPointDraftsFragment.Y;
                ((td0) obj2).invoke(obj);
                break;
            case 9:
                int i3 = ClipsGridDraftsListFragment.l0;
                ((pz) obj2).invoke(obj);
                break;
            case 10:
                ((q66) obj2).invoke(obj);
                break;
            case 11:
                ((vcg) obj2).invoke(obj);
                break;
            case 12:
                ((grh) obj2).invoke(obj);
                break;
            case 13:
                ((pz) obj2).invoke(obj);
                break;
            case 14:
                ((g53) obj2).invoke(obj);
                break;
            case 15:
                ((ozh) obj2).invoke(obj);
                break;
            case 16:
                pzr pzrVar = (pzr) obj2;
                pzrVar.q(new d9j((Set) obj, pzrVar));
                break;
            case 17:
                ((wpg) obj2).invoke(obj);
                break;
            case 18:
                ((bmt) obj2).e((dmt) obj);
                break;
            case 19:
                ((sop) obj2).invoke(obj);
                break;
            case 20:
                int i4 = HidePushContentService.j;
                ((sop) obj2).invoke(obj);
                break;
            case 21:
                ((mav) obj2).invoke(obj);
                break;
            case 22:
                ((k2e) obj2).invoke(obj);
                break;
            case 23:
                ((sop) obj2).invoke(obj);
                break;
            case 24:
                ((td0) obj2).invoke(obj);
                break;
            case 25:
                ((sop) obj2).invoke(obj);
                break;
            case 26:
                ((l2k) obj2).invoke(obj);
                break;
            case 27:
                ((sop) obj2).invoke(obj);
                break;
            case 28:
                ((td0) obj2).invoke(obj);
                break;
            default:
                ((y8) obj2).invoke(obj);
                break;
        }
    }
}

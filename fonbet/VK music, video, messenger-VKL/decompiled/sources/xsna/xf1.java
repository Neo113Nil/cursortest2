package xsna;

import com.vk.channels.impl.list.g;
import com.vk.friends.impl.friends.presentation.fragment.FriendsSelectionFragment;
import com.vk.home.HomeFragment2;
import com.vk.im.channelcreation.impl.i;
import kotlin.Pair;
import xsna.drz;
import xsna.hxs;
import xsna.l6w;
import xsna.otb;
import xsna.zs9;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class xf1 implements io.reactivex.rxjava3.functions.f {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ xf1(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // io.reactivex.rxjava3.functions.f
    public final void accept(Object obj) {
        int i = this.b;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                ((com.vk.movika.sdk.base.observable.a) obj2).invoke(obj);
                break;
            case 1:
                ((dq1) obj2).invoke(obj);
                break;
            case 2:
                ((cu4) obj2).invoke(obj);
                break;
            case 3:
                ((com.vk.movika.sdk.base.observable.a) obj2).invoke(obj);
                break;
            case 4:
                ((mz) obj2).invoke(obj);
                break;
            case 5:
                ((com.vk.movika.sdk.base.observable.a) obj2).invoke(obj);
                break;
            case 6:
                ((gb) obj2).invoke(obj);
                break;
            case 7:
                ((zs9.c) obj2).invoke(obj);
                break;
            case 8:
                ((com.vk.im.channelcreation.impl.b) obj2).n(new i.c((Throwable) obj));
                break;
            case 9:
                ((com.vk.movika.sdk.base.observable.a) obj2).invoke(obj);
                break;
            case 10:
                com.vk.channels.impl.list.b bVar = (com.vk.channels.impl.list.b) obj2;
                Throwable th = (Throwable) obj;
                bVar.s().b(th, new bv0(5));
                bVar.n(new g.b(th));
                break;
            case 11:
                ((otb.l) obj2).invoke(obj);
                break;
            case 12:
                ((com.vk.movika.sdk.base.observable.a) obj2).invoke(obj);
                break;
            case 13:
                ((t1e) obj2).invoke(obj);
                break;
            case 14:
                ((hdg) obj2).invoke(obj);
                break;
            case 15:
                ((dq1) obj2).invoke(obj);
                break;
            case 16:
                ((gb) obj2).invoke(obj);
                break;
            case 17:
                ((gb) obj2).invoke(obj);
                break;
            case 18:
                com.vk.im.ui.components.dialogs_list.c cVar = (com.vk.im.ui.components.dialogs_list.c) obj2;
                Throwable th2 = (Throwable) obj;
                com.vk.im.ui.components.dialogs_list.e eVar = cVar.h;
                eVar.y = false;
                eVar.A = false;
                eVar.B = false;
                if (cVar.f() != null) {
                    zk70.e(th2);
                    break;
                }
                break;
            case 19:
                ((gb) obj2).invoke(obj);
                break;
            case 20:
                ((gb) obj2).invoke(obj);
                break;
            case 21:
                ((t1e) obj2).invoke(obj);
                break;
            case 22:
                i2s i2sVar = (i2s) obj2;
                Pair pair = (Pair) obj;
                i2sVar.q(new ab((drz.a) pair.d(), (x1s) pair.g(), i2sVar));
                break;
            case 23:
                int i2 = FriendsSelectionFragment.w0;
                ((t1e) obj2).invoke(obj);
                break;
            case 24:
                ((hxs.a) obj2).invoke(obj);
                break;
            case 25:
                ((bmt) obj2).e((dmt) obj);
                break;
            case 26:
                ((dq1) obj2).invoke(obj);
                break;
            case 27:
                int i3 = HomeFragment2.x0;
                ((q99) obj2).invoke(obj);
                break;
            case 28:
                ((o3w) obj2).invoke(obj);
                break;
            default:
                d7w d7wVar = (d7w) obj2;
                Throwable th3 = (Throwable) obj;
                d7wVar.f.a(th3);
                d7wVar.c(new l6w.b.l(th3));
                break;
        }
    }
}

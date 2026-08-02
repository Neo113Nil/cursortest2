package xsna;

import com.vk.channels.impl.list.g;
import com.vk.home.HomeFragment2;
import com.vk.im.ui.fragments.ImDialogsSelectionFragment;
import com.vk.im.ui.fragments.dialogtheme.ImSettingsDialogThemeFragment;
import com.vk.sharing.api.dto.Target;
import java.util.Collections;
import java.util.Iterator;
import java.util.Objects;
import xsna.bll;
import xsna.h4n;
import xsna.l8j;
import xsna.pru;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class ho1 implements io.reactivex.rxjava3.functions.f {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ ho1(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // io.reactivex.rxjava3.functions.f
    public final void accept(Object obj) {
        Object obj2;
        int i = this.b;
        Object obj3 = this.c;
        switch (i) {
            case 0:
                ((go1) obj3).invoke(obj);
                break;
            case 1:
                ((go1) obj3).invoke(obj);
                break;
            case 2:
                ((sq4) obj3).invoke(obj);
                break;
            case 3:
                ((go1) obj3).invoke(obj);
                break;
            case 4:
                com.vk.sharing.core.a aVar = (com.vk.sharing.core.a) obj3;
                Target target = (Target) obj;
                aVar.f.B3(target, aVar.b);
                Iterable iterable = aVar.g.e;
                if (iterable == null) {
                    iterable = Collections.EMPTY_LIST;
                }
                Objects.requireNonNull(target);
                Iterator it = iterable.iterator();
                while (true) {
                    if (it.hasNext()) {
                        obj2 = it.next();
                        if (target.equals((Target) obj2)) {
                        }
                    } else {
                        obj2 = null;
                    }
                }
                Target target2 = (Target) obj2;
                if (target2 != null) {
                    boolean z = target2.g;
                    boolean z2 = target.g;
                    if (z != z2) {
                        target2.g = z2;
                        com.vk.sharing.core.view.l lVar = aVar.i;
                        lVar.D0(lVar.S1(target2));
                        break;
                    }
                }
                break;
            case 5:
                ((go1) obj3).invoke(obj);
                break;
            case 6:
                ((h7a) obj3).invoke(obj);
                break;
            case 7:
                com.vk.channels.impl.list.b bVar = (com.vk.channels.impl.list.b) obj3;
                Throwable th = (Throwable) obj;
                bVar.s().b(th, new kr6(2));
                bVar.n(new g.b(th));
                break;
            case 8:
                ((go1) obj3).invoke(obj);
                break;
            case 9:
                ((ptb) obj3).invoke(obj);
                break;
            case 10:
                ((rqc) obj3).invoke(obj);
                break;
            case 11:
                ((dxe) obj3).invoke(obj);
                break;
            case 12:
                ((oce) obj3).invoke(obj);
                break;
            case 13:
                ((idg) obj3).invoke(obj);
                break;
            case 14:
                ((com.vk.libvideo.b) obj3).invoke(obj);
                break;
            case 15:
                ((ync) obj3).invoke(obj);
                break;
            case 16:
                ((nsh) obj3).invoke(obj);
                break;
            case 17:
                ((l8j.e) obj3).invoke(obj);
                break;
            case 18:
                ((bll.a) obj3).invoke(obj);
                break;
            case 19:
                k3n k3nVar = (k3n) obj3;
                bwr0 bwr0Var = (bwr0) obj;
                if (!(bwr0Var instanceof hxr0)) {
                    if (!(bwr0Var instanceof dyr0)) {
                        s3q0 s3q0Var = s3q0.a;
                        break;
                    } else {
                        k3nVar.e(new h4n.b.a(((dyr0) bwr0Var).a, false));
                        break;
                    }
                } else {
                    k3nVar.e(new h4n.b.a(((hxr0) bwr0Var).a, true));
                    break;
                }
            case 20:
                ((com.vk.libvideo.b) obj3).invoke(obj);
                break;
            case 21:
                ((la2) obj3).invoke(obj);
                break;
            case 22:
                ((h7a) obj3).invoke(obj);
                break;
            case 23:
                ((r9k) obj3).invoke(obj);
                break;
            case 24:
                ((k7f) obj3).invoke(obj);
                break;
            case 25:
                ((r9k) obj3).invoke(obj);
                break;
            case 26:
                ((pru.a) obj3).invoke(obj);
                break;
            case 27:
                int i2 = HomeFragment2.x0;
                ((uf1) obj3).invoke(obj);
                break;
            case 28:
                int i3 = ImDialogsSelectionFragment.n0;
                ((com.vk.libvideo.b) obj3).invoke(obj);
                break;
            default:
                int i4 = ImSettingsDialogThemeFragment.c0;
                ((ImSettingsDialogThemeFragment.c) obj3).invoke(obj);
                break;
        }
    }
}

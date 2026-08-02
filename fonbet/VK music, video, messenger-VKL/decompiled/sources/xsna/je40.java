package xsna;

import com.vk.core.view.components.context.menu.VkContextMenu;
import com.vk.profile.user.impl.ui.UserProfileFragment;
import com.vk.video.ui.discovery.minimizable.c;
import java.util.List;
import kotlin.jvm.internal.Ref$ObjectRef;
import xsna.exy0;
import xsna.ned0;
import xsna.p4z0;
import xsna.wuw0;
import xsna.ymq0;
import xsna.zhw0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class je40 implements io.reactivex.rxjava3.functions.l, z960, zuq0, io.reactivex.rxjava3.functions.g, yads.ng1, exy0.a {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ je40(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.zuq0
    public void B(com.vk.profile.user.impl.ui.f fVar) {
        Ref$ObjectRef ref$ObjectRef = (Ref$ObjectRef) this.c;
        int i = UserProfileFragment.p0;
        ((fpq0) ref$ObjectRef.element).B(fVar);
    }

    @Override // io.reactivex.rxjava3.functions.l
    public Object apply(Object obj) {
        int i = this.b;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                return (List) ((c220) obj2).invoke(obj);
            case 1:
            case 8:
            case 14:
            case 18:
            default:
                return (wuw0.b) ((gyo0) obj2).invoke(obj);
            case 2:
                return (jks) ((ip80) obj2).invoke(obj);
            case 3:
                return (ncq0) ((c220) obj2).invoke(obj);
            case 4:
                return (io.reactivex.rxjava3.core.b0) ((r8a0) obj2).invoke(obj);
            case 5:
                return (io.reactivex.rxjava3.core.b0) ((ndh) obj2).invoke(obj);
            case 6:
                return (io.reactivex.rxjava3.core.b0) ((jp5) obj2).invoke(obj);
            case 7:
                return (io.reactivex.rxjava3.core.t) ((r8a0) obj2).invoke(obj);
            case 9:
                int i2 = nvi0.k1;
                return (Integer) ((mvi0) obj2).invoke(obj);
            case 10:
                return (ned0.a) ((cam0) obj2).invoke(obj);
            case 11:
                return (kyo0) ((gyo0) obj2).invoke(obj);
            case 12:
                return (io.reactivex.rxjava3.core.t) ((cpo0) obj2).invoke(obj);
            case 13:
                return ((ymq0.d) obj2).invoke(obj);
            case 15:
                return (bwq0) ((hsq0) obj2).invoke(obj);
            case 16:
                return (io.reactivex.rxjava3.core.b0) ((c220) obj2).invoke(obj);
            case 17:
                return (io.reactivex.rxjava3.core.t) ((gyo0) obj2).invoke(obj);
            case 19:
                return (ncq0) ((c220) obj2).invoke(obj);
            case 20:
                return (io.reactivex.rxjava3.core.t) ((z5b) obj2).invoke(obj);
            case 21:
                return (zhw0.a) ((uqv0) obj2).invoke(obj);
            case 22:
                return (Long) ((gyo0) obj2).invoke(obj);
        }
    }

    @Override // xsna.exy0.a
    public void b() {
        pdz0 pdz0Var = (pdz0) this.c;
        m6z0 m6z0Var = pdz0Var.k;
        if (m6z0Var != null) {
            m6z0Var.f = true;
            p4z0.a aVar = pdz0Var.g;
            aVar.a.e(m6z0Var.a);
            pdz0Var.x();
        }
    }

    @Override // io.reactivex.rxjava3.functions.g
    public Object d(Object obj, Object obj2, Object obj3) {
        return (c.s0.i) ((rgo0) this.c).invoke(obj, obj2, obj3);
    }

    @Override // xsna.z960
    public void g(VkContextMenu vkContextMenu, int i) {
        ((z960) this.c).g(vkContextMenu, i);
        if (vkContextMenu != null) {
            vkContextMenu.b();
        }
    }

    @Override // yads.ng1
    public void invoke(Object obj) {
        yads.ao0.h((yads.df2) this.c, (yads.nf2) obj);
    }
}

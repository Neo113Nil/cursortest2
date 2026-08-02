package xsna;

import android.view.View;
import com.vk.core.view.components.button.VkButton;
import com.vk.profile.core.tabs.ui.clips.Clips;
import com.vk.profile.user.impl.ui.UserProfileFragment;
import java.lang.ref.WeakReference;
import java.util.List;
import kotlin.Pair;
import xsna.s8z0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class a0m0 implements io.reactivex.rxjava3.functions.l, i0u0, io.reactivex.rxjava3.functions.j, yads.bd2, s8z0.a {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ a0m0(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // yads.bd2
    public void a() {
        yads.ch3.a((yads.ch3) this.c);
    }

    @Override // io.reactivex.rxjava3.functions.l
    public Object apply(Object obj) {
        int i = this.b;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                return (io.reactivex.rxjava3.core.t) ((zzl0) obj2).invoke(obj);
            case 1:
                return (Pair) ((zzl0) obj2).invoke(obj);
            case 2:
                return (io.reactivex.rxjava3.core.t) ((yl3) obj2).invoke(obj);
            case 3:
                return (List) ((zzl0) obj2).invoke(obj);
            case 4:
            default:
                return (it80) ((fvq0) obj2).invoke(obj);
            case 5:
                return (Clips) ((zyl0) obj2).invoke(obj);
            case 6:
                int i2 = UserProfileFragment.p0;
                return (io.reactivex.rxjava3.core.b0) ((zzl0) obj2).invoke(obj);
            case 7:
                return (Pair) ((t440) obj2).invoke(obj);
            case 8:
                return (io.reactivex.rxjava3.core.t) ((yl3) obj2).invoke(obj);
            case 9:
                return (io.reactivex.rxjava3.core.t) ((fvq0) obj2).invoke(obj);
            case 10:
                return (io.reactivex.rxjava3.core.b0) ((t35) obj2).invoke(obj);
        }
    }

    @Override // io.reactivex.rxjava3.functions.j
    public Object g(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        return (mit0) ((zsh) this.c).invoke(obj, obj2, obj3, obj4, obj5, obj6);
    }

    @Override // xsna.i0u0
    public View get() {
        return (View) new WeakReference((VkButton) this.c).get();
    }

    @Override // xsna.s8z0.a
    public void i(z9z0 z9z0Var) {
        ((rxy0) this.c).e = z9z0Var;
    }
}

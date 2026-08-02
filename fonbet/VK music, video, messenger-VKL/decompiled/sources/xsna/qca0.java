package xsna;

import android.net.Uri;
import android.view.View;
import com.vk.core.view.components.button.VkButton;
import com.vk.libvideo.ui.preview.VideoSeekPreviewImage;
import com.vk.newsfeed.posting.impl.presentation.model.PostingSettings;
import com.vk.subscription.api.SubscribeStatus;
import com.vk.voip.ui.groupcalls.grid.GroupCallGridContainerView;
import java.lang.ref.WeakReference;
import kotlin.Pair;
import xsna.l6o0;
import xsna.q1d0;
import xsna.s8z0;
import xsna.zhw0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class qca0 implements io.reactivex.rxjava3.functions.m, q1d0.a, io.reactivex.rxjava3.functions.l, io.reactivex.rxjava3.core.a0, io.reactivex.rxjava3.functions.b, i0u0, io.reactivex.rxjava3.functions.g, io.reactivex.rxjava3.functions.c, GroupCallGridContainerView.a, yads.ng1, s8z0.a {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ qca0(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // io.reactivex.rxjava3.functions.b
    public void accept(Object obj, Object obj2) {
        l6o0 l6o0Var = (l6o0) this.c;
        l6o0.b bVar = (l6o0.b) obj;
        Throwable th = (Throwable) obj2;
        if (th == null) {
            l6o0Var.h(bVar);
        } else {
            l6o0Var.g(th);
        }
    }

    @Override // io.reactivex.rxjava3.functions.l
    public Object apply(Object obj) {
        int i = this.b;
        Object obj2 = this.c;
        switch (i) {
            case 2:
                return (csf0) ((hx3) obj2).invoke(obj);
            case 3:
            case 7:
            case 9:
            default:
                return (qnt) ((q1) obj2).invoke(obj);
            case 4:
                return (SubscribeStatus) ((voh0) obj2).invoke(obj);
            case 5:
                return (PostingSettings) ((q1) obj2).invoke(obj);
            case 6:
                return (Pair) ((xd40) obj2).invoke(obj);
            case 8:
                return (io.reactivex.rxjava3.core.t) ((xd40) obj2).invoke(obj);
            case 10:
                return ((cnq0) obj2).invoke(obj);
            case 11:
                return (Pair) ((xd40) obj2).invoke(obj);
            case 12:
                return (Uri) ((evh0) obj2).invoke(obj);
            case 13:
                int i2 = VideoSeekPreviewImage.G;
                return (io.reactivex.rxjava3.core.t) ((eni0) obj2).invoke(obj);
        }
    }

    @Override // io.reactivex.rxjava3.functions.g
    public Object d(Object obj, Object obj2, Object obj3) {
        return (mit0) ((t0r) this.c).invoke(obj, obj2, obj3);
    }

    @Override // xsna.i0u0
    public View get() {
        return (View) new WeakReference((VkButton) this.c).get();
    }

    @Override // xsna.q1d0.a
    public hk0 getConfig() {
        return (hk0) this.c;
    }

    @Override // xsna.s8z0.a
    public void i(z9z0 z9z0Var) {
        ((sxy0) this.c).h = z9z0Var;
    }

    @Override // yads.ng1
    public void invoke(Object obj) {
        yads.ao0.d((yads.df2) this.c, (yads.nf2) obj);
    }

    @Override // io.reactivex.rxjava3.core.a0
    public void subscribe(io.reactivex.rxjava3.core.y yVar) {
        try {
            yVar.onSuccess(((gzs) this.c).invoke());
        } catch (Throwable th) {
            yVar.b(th);
        }
    }

    @Override // io.reactivex.rxjava3.functions.m
    public boolean test(Object obj) {
        switch (this.b) {
            case 0:
                return ((Boolean) ((xmz) this.c).invoke(obj)).booleanValue();
            default:
                return ((Boolean) ((eni0) this.c).invoke(obj)).booleanValue();
        }
    }

    @Override // io.reactivex.rxjava3.functions.c
    public Object apply(Object obj, Object obj2) {
        return (giw0) ((zhw0.e) this.c).invoke(obj, obj2);
    }
}

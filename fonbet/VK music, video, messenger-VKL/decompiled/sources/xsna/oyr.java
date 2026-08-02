package xsna;

import android.view.View;
import com.vk.common.presentation.base.view.swiperefreshlayout.SwipeDrawableRefreshLayout;
import com.vk.core.tips.Tooltip;
import com.vk.dto.common.data.VKList;
import com.vk.dto.video.VideoOwner;
import com.vk.superapp.api.dto.identity.WebIdentityEmail;
import com.vk.translate.impl.views.MessageTranslateActionsLayout;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import me.grishka.appkit.views.UsableRecyclerPaginatedView;
import xsna.boq0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class oyr implements io.reactivex.rxjava3.functions.l, beg, MessageTranslateActionsLayout.a, wj20, Tooltip.c, iy3, io.reactivex.rxjava3.functions.b, m6o, io.reactivex.rxjava3.functions.m, SwipeDrawableRefreshLayout.g, i0u0 {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ oyr(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // io.reactivex.rxjava3.functions.b
    public void accept(Object obj, Object obj2) {
        ((mke0) this.c).invoke(obj, obj2);
    }

    @Override // io.reactivex.rxjava3.functions.l
    public Object apply(Object obj) {
        switch (this.b) {
            case 0:
                return (utk) ((hl4) this.c).invoke(obj);
            case 1:
                return (Boolean) ((d0k) this.c).invoke(obj);
            case 2:
                return (WebIdentityEmail) ((eqq) this.c).c;
            case 3:
            case 6:
            case 7:
            case 11:
            case 15:
            case 17:
            case 19:
            case 22:
            case 23:
            case 24:
            case 25:
            default:
                return (io.reactivex.rxjava3.core.t) ((g2h0) this.c).invoke(obj);
            case 4:
                return (VideoOwner) ((d0k) this.c).invoke(obj);
            case 5:
                return (io.reactivex.rxjava3.core.b0) ((a0e) this.c).invoke(obj);
            case 8:
                return (Boolean) ((l8k) this.c).invoke(obj);
            case 9:
                return (io.reactivex.rxjava3.core.e) ((h57) this.c).invoke(obj);
            case 10:
                return (VKList) ((eqq) this.c).invoke(obj);
            case 12:
                return (io.reactivex.rxjava3.core.e) ((eqq) this.c).invoke(obj);
            case 13:
                return (ArrayList) ((d0k) this.c).invoke(obj);
            case 14:
                return (io.reactivex.rxjava3.core.e) ((i0b0) this.c).invoke(obj);
            case 16:
                return (io.reactivex.rxjava3.core.t) ((d0k) this.c).invoke(obj);
            case 18:
                return (k4f0) ((d0k) this.c).invoke(obj);
            case 20:
                return (io.reactivex.rxjava3.core.t) ((i0b0) this.c).invoke(obj);
            case 21:
                return (io.reactivex.rxjava3.core.b0) ((wlw) this.c).invoke(obj);
            case 26:
                return ((boq0.b) this.c).invoke(obj);
            case 27:
                return (vni0) ((ym1) this.c).invoke(obj);
            case 28:
                return (ffe0) ((xa30) this.c).invoke(obj);
        }
    }

    @Override // xsna.m6o
    public double b(double d) {
        return swe0.e(((njg0) this.c).k.b(d), r0.e, r0.f);
    }

    @Override // com.vk.core.tips.Tooltip.c
    public void c(int i) {
        switch (this.b) {
            case 11:
                ((wmd0) this.c).invoke();
                break;
            default:
                ((vtn0) this.c).b();
                break;
        }
    }

    @Override // xsna.i0u0
    public View get() {
        return (View) ((WeakReference) this.c).get();
    }

    @Override // com.vk.common.presentation.base.view.swiperefreshlayout.SwipeDrawableRefreshLayout.g
    public void h() {
        UsableRecyclerPaginatedView.a aVar = ((UsableRecyclerPaginatedView) this.c).Q;
        if (aVar != null) {
            aVar.h();
        }
    }

    @Override // xsna.beg
    public void n(boolean z) {
        ((wmf) ((com.vk.libvideo.live.impl.views.live.b) this.c).b0.a).Me().Jo(z);
    }

    @Override // io.reactivex.rxjava3.functions.m
    public boolean test(Object obj) {
        return ((Boolean) ((g2h0) this.c).invoke(obj)).booleanValue();
    }

    @Override // io.reactivex.rxjava3.functions.l
    public ugz apply(Object obj) {
        return ((androidx.camera.view.b) this.c).d.g();
    }
}

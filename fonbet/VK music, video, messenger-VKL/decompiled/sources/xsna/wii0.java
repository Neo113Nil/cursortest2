package xsna;

import android.os.Handler;
import android.view.View;
import com.ironsource.C4339gg;
import com.ironsource.InterfaceC4321fg;
import com.ironsource.X3;
import com.vk.api.generated.orders.dto.OrdersOrderDto;
import com.vk.auth.loginconfirmation.VkLoginConfirmationStatusType;
import com.vk.upload.impl.UploadNotification;
import com.vk.voip.ui.broadcast.fragments.info.StreamInfoFragment;
import java.lang.ref.WeakReference;
import java.util.Collection;
import kotlin.Pair;
import kotlin.Triple;
import xsna.bzp0;
import xsna.ngl;
import xsna.ub9;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class wii0 implements io.reactivex.rxjava3.functions.l, ub9.c, io.reactivex.rxjava3.functions.m, i0u0, io.reactivex.rxjava3.functions.b, ngl.a, io.reactivex.rxjava3.functions.c, yads.og1, InterfaceC4321fg {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ wii0(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // yads.og1
    public void a(Object obj, yads.ew0 ew0Var) {
        ((yads.ao0) this.c).a((yads.nf2) obj, ew0Var);
    }

    @Override // io.reactivex.rxjava3.functions.b
    public void accept(Object obj, Object obj2) {
        ((bv4) this.c).invoke(obj, obj2);
    }

    @Override // io.reactivex.rxjava3.functions.l
    public Object apply(Object obj) {
        int i = this.b;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                return (Triple) ((ge3) obj2).invoke(obj);
            case 1:
                return (Collection) ((w910) obj2).invoke(obj);
            case 2:
                return (io.reactivex.rxjava3.core.b0) ((w910) obj2).invoke(obj);
            case 3:
                return (io.reactivex.rxjava3.core.b0) ((xvl0) obj2).invoke(obj);
            case 4:
                int i2 = StreamInfoFragment.S;
                return (it80) ((mdk0) obj2).invoke(obj);
            case 5:
                return (io.reactivex.rxjava3.core.t) ((pcg) obj2).invoke(obj);
            case 6:
            case 9:
            case 10:
            case 12:
            case 15:
            default:
                return (djw0) ((kbq0) obj2).invoke(obj);
            case 7:
                return (Long) ((kpr) obj2).invoke(obj);
            case 8:
                return (Boolean) ((kpr) obj2).invoke(obj);
            case 11:
                return (Pair) ((mdk0) obj2).invoke(obj);
            case 13:
                return (io.reactivex.rxjava3.core.t) ((kbq0) obj2).invoke(obj);
            case 14:
                return (io.reactivex.rxjava3.core.t) ((kbq0) obj2).invoke(obj);
            case 16:
                return (OrdersOrderDto.StatusDto) ((izs) obj2).invoke(obj);
        }
    }

    @Override // xsna.ub9.c
    public Object attachCompleter(ub9.a aVar) {
        yon0 yon0Var = (yon0) this.c;
        yon0Var.o = aVar;
        return "StartStreamingFuture[session=" + yon0Var + X3.j.e;
    }

    @Override // xsna.ngl.a
    public void e(bzp0.c cVar) {
        v2v0 v2v0Var = (v2v0) ((a3v0) this.c).a;
        if (v2v0Var != null) {
            v2v0Var.oa(VkLoginConfirmationStatusType.UNKNOWN_CONFIRMATION);
        }
    }

    @Override // xsna.i0u0
    public View get() {
        return (View) new WeakReference(((olq0) this.c).g).get();
    }

    @Override // io.reactivex.rxjava3.functions.m
    public boolean test(Object obj) {
        return (obj instanceof UploadNotification.b) && ((UploadNotification.b) obj).a == ((com.vk.upload.impl.b) this.c).d;
    }

    @Override // com.ironsource.InterfaceC4321fg
    public void a(gzs gzsVar) {
        C4339gg.a((Handler) this.c, gzsVar);
    }

    @Override // io.reactivex.rxjava3.functions.c
    public Object apply(Object obj, Object obj2) {
        return (Boolean) ((bv4) this.c).invoke(obj, obj2);
    }
}

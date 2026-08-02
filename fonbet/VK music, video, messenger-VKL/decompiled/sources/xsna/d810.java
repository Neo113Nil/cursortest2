package xsna;

import android.app.Activity;
import android.graphics.Bitmap;
import com.vk.auth.verification.base.states.CodeState;
import com.vk.im.engine.models.conversations.BotButton;
import com.vk.im.engine.models.conversations.BotKeyboard;
import com.vk.im.engine.models.dialogs.Dialog;
import com.vk.libvideo.design.view.videotexture.VideoTextureView;
import com.vkontakte.android.R;
import java.lang.ref.SoftReference;
import java.util.List;
import kotlin.jvm.internal.FunctionReferenceImpl;
import one.video.transform.TransformController;
import xsna.p810;
import xsna.uon0;
import xsna.xgy;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class d810 implements io.reactivex.rxjava3.functions.c, io.reactivex.rxjava3.functions.d, io.reactivex.rxjava3.functions.l, xgy.a, whp, uon0.a, TransformController.d, io.reactivex.rxjava3.functions.m {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ d810(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // xsna.whp
    public String a() {
        return (String) this.c;
    }

    @Override // io.reactivex.rxjava3.functions.c
    public Object apply(Object obj, Object obj2) {
        switch (this.b) {
            case 0:
                return (p810.k) ((xk6) this.c).invoke(obj, obj2);
            default:
                return (gzs) ((fhi) this.c).invoke(obj, obj2);
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [kotlin.jvm.internal.FunctionReferenceImpl, xsna.izs] */
    @Override // one.video.transform.TransformController.d
    public void b(float f) {
        ?? r0 = (FunctionReferenceImpl) this.c;
        SoftReference<Bitmap> softReference = VideoTextureView.r;
        r0.invoke(Float.valueOf(f));
    }

    @Override // xsna.uon0.a
    public Object execute() {
        return Integer.valueOf(((n0q) this.c).G());
    }

    @Override // xsna.xgy.a
    public int getHeight() {
        kz30 kz30Var = (kz30) this.c;
        Dialog Cb = kz30Var.k.Cb();
        BotKeyboard V2 = Cb != null ? Cb.V2() : null;
        if (V2 == null) {
            return 0;
        }
        Activity activity = kz30Var.i;
        int a = e3m.a(R.dimen.vkim_bot_button_min_height, activity);
        int a2 = e3m.a(R.dimen.vkim_bot_button_margin, activity);
        int a3 = e3m.a(R.dimen.vkim_bot_keyboard_margin, activity);
        int d = ify.d(3, null);
        List<List<BotButton>> list = V2.f;
        return Math.min(d, (a3 * 2) + (list.size() * a) + ((list.size() + 1) * a2));
    }

    @Override // io.reactivex.rxjava3.functions.d
    public boolean test(Object obj, Object obj2) {
        return ((Boolean) ((a9b) this.c).invoke(obj, obj2)).booleanValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ d810(izs izsVar) {
        this.b = 14;
        this.c = (FunctionReferenceImpl) izsVar;
    }

    @Override // io.reactivex.rxjava3.functions.m
    public boolean test(Object obj) {
        switch (this.b) {
        }
        return ((Boolean) ((n1g0) this.c).invoke(obj)).booleanValue();
    }

    @Override // io.reactivex.rxjava3.functions.l
    public Object apply(Object obj) {
        int i = this.b;
        Object obj2 = this.c;
        switch (i) {
            case 2:
                return (io.reactivex.rxjava3.core.t) ((xld) obj2).invoke(obj);
            case 3:
            case 7:
            case 10:
            case 12:
            case 14:
            default:
                int i2 = otw0.i1;
                return (Boolean) ((ntw0) obj2).invoke(obj);
            case 4:
                return (tt70) ((gzn) obj2).invoke(obj);
            case 5:
                return (io.reactivex.rxjava3.core.t) ((zx40) obj2).invoke(obj);
            case 6:
                return (hqz) ((wq20) obj2).invoke(obj);
            case 8:
                return (ri6) ((d870) obj2).invoke(obj);
            case 9:
                return (CodeState) ((px30) obj2).invoke(obj);
            case 11:
                return (io.reactivex.rxjava3.core.b0) ((hn0) obj2).invoke(obj);
            case 13:
                return (Integer) ((n1g0) obj2).invoke(obj);
            case 15:
                return (io.reactivex.rxjava3.core.t) ((v24) obj2).invoke(obj);
        }
    }
}

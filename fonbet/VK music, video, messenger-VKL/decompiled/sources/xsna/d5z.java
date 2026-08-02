package xsna;

import androidx.lifecycle.Lifecycle;
import com.vk.dto.common.Peer;
import com.vk.im.engine.models.dialogs.DialogExt;
import xsna.hg1;

/* compiled from: DialogThemeObserver.kt */
/* loaded from: classes2.dex */
public final class d5z implements androidx.lifecycle.l {
    public final alm b;
    public io.reactivex.rxjava3.disposables.c c;

    /* compiled from: DialogThemeObserver.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Lifecycle.Event.values().length];
            try {
                iArr[Lifecycle.Event.ON_CREATE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Lifecycle.Event.ON_RESUME.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Lifecycle.Event.ON_DESTROY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public d5z(alm almVar) {
        this.b = almVar;
    }

    @Override // androidx.lifecycle.l
    public final void onStateChanged(f5z f5zVar, Lifecycle.Event event) {
        Peer peer;
        int i = a.$EnumSwitchMapping$0[event.ordinal()];
        if (i != 1) {
            if (i == 2 || i != 3) {
                return;
            }
            f5zVar.getLifecycle().removeObserver(this);
            io.reactivex.rxjava3.disposables.c cVar = this.c;
            if (cVar != null) {
                cVar.dispose();
                return;
            }
            return;
        }
        alm almVar = this.b;
        io.reactivex.rxjava3.disposables.b bVar = almVar.c;
        io.reactivex.rxjava3.internal.operators.observable.m1 a2 = almVar.a.l.a();
        DialogExt dialogExt = almVar.b;
        if (dialogExt != null && (peer = dialogExt.f) != null) {
            bVar.b(new io.reactivex.rxjava3.internal.operators.observable.i0(new io.reactivex.rxjava3.internal.operators.observable.i0(a2, new hg1.c1(zkm.b)), new e10(new ykm(peer.b, 0), 21)).subscribe(new j50(new i50(almVar, 23), 18), kwg0.b()));
        }
        bVar.b(io.reactivex.rxjava3.core.q.X(new io.reactivex.rxjava3.internal.operators.observable.i0(new io.reactivex.rxjava3.internal.operators.observable.i0(a2, new hg1.c1(fse.e)), new rx0(new gmj(almVar, 2), 19)).U(new np1(new wik(almVar, 2), 14)), new io.reactivex.rxjava3.internal.operators.observable.i0(new io.reactivex.rxjava3.internal.operators.observable.i0(a2, new hg1.c1(gse.d)).U(new vx6(new x2e(almVar, 8), 11)), new ox0(new j9k(almVar, 2), 15))).subscribe(new t00(new wg1(1, almVar, alm.class, "forceThemeUpdate", "forceThemeUpdate(Lcom/vk/im/engine/models/dialogs/DialogThemeId;)V", 0, 10), 23), kwg0.b()));
        this.c = bVar;
    }
}

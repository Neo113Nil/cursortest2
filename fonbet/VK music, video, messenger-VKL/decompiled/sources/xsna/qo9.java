package xsna;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import androidx.preference.Preference;
import com.vk.debug.ui.user.DebugUserSettingsFragment;
import com.vk.dto.masks.Mask;
import com.vk.dto.stickers.AnimatedStickerInfo;
import com.vk.inappreview.ReviewActionResult$Failed;
import com.vk.log.L;
import com.vk.masks.MasksController;
import xsna.by1;
import xsna.d4l0;
import xsna.ihz;
import xsna.r100;
import xsna.ub9;
import xsna.vo9;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes11.dex */
public final /* synthetic */ class qo9 implements iy3, Preference.c, ihz.a, io.reactivex.rxjava3.core.a0, io.reactivex.rxjava3.functions.l {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ qo9(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    @Override // io.reactivex.rxjava3.functions.l
    public Object apply(Object obj) {
        switch (this.b) {
            case 4:
                MasksController masksController = (MasksController) this.c;
                Mask mask = (Mask) this.d;
                masksController.getClass();
                boolean z = ((Mask) obj).i > mask.i;
                if (z) {
                    hi10 hi10Var = masksController.c;
                    synchronized (hi10Var) {
                        int d = hi10Var.d(mask);
                        if (d >= 0) {
                            hi10Var.c.remove(mask.Db());
                            hi10Var.b.remove(mask.Db());
                            hi10Var.a.set(d, mask);
                            hi10Var.c();
                        }
                    }
                }
                return Boolean.valueOf(z);
            default:
                return new d4l0.b((AnimatedStickerInfo) obj, (String) this.c, (String) this.d);
        }
    }

    @Override // androidx.preference.Preference.c
    public boolean eh(Preference preference) {
        hsp0 hsp0Var = (hsp0) this.c;
        DebugUserSettingsFragment debugUserSettingsFragment = (DebugUserSettingsFragment) this.d;
        int i = DebugUserSettingsFragment.l0;
        asu0.a.getClass();
        asu0.n().execute(new i73(2, hsp0Var, debugUserSettingsFragment));
        return true;
    }

    @Override // xsna.ihz.a
    public void invoke(Object obj) {
        ((by1) obj).g0((bpz) this.c, (pr10) this.d);
    }

    @Override // io.reactivex.rxjava3.core.a0
    public void subscribe(io.reactivex.rxjava3.core.y yVar) {
        jlv jlvVar = (jlv) this.c;
        String str = jlvVar.e;
        Intent intent = (Intent) this.d;
        jlvVar.f = yVar;
        try {
            r100.a(str, "Launching review intent");
            jlvVar.g.a(intent);
        } catch (ActivityNotFoundException e) {
            L.l("InAppReview", fo8.a(str, ": Can't launch review intent"), mnh0.A(new r100.a("InAppReviewException", e)));
            yVar.onError(new ReviewActionResult$Failed(ReviewActionResult$Failed.ErrorReason.INTERNAL_ERROR));
        }
    }

    public /* synthetic */ qo9(by1.a aVar, bpz bpzVar, pr10 pr10Var) {
        this.b = 2;
        this.c = bpzVar;
        this.d = pr10Var;
    }

    @Override // xsna.iy3
    /* renamed from: apply */
    public ugz mo416apply(Object obj) {
        ub9.d a;
        vo9 vo9Var = (vo9) this.c;
        Context context = (Context) this.d;
        synchronized (vo9Var.b) {
            obr.f("CameraX.initInternal() should only be called once per instance", vo9Var.k == vo9.b.UNINITIALIZED);
            vo9Var.k = vo9.b.INITIALIZING;
            a = ub9.a(new ro9(0, vo9Var, context));
        }
        return a;
    }
}

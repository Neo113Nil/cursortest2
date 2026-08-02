package xsna;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.FrameLayout;
import com.vk.core.dialogs.bottomsheet.modern.impl.CustomisableBottomSheetBehavior;
import com.vk.log.L;
import com.vkontakte.android.R;
import kotlin.jvm.internal.FunctionReferenceImpl;
import ru.ok.android.utils.Logger;

/* compiled from: FullScreenBannerPhoneController.kt */
/* loaded from: classes16.dex */
public final class qvs extends bh6 implements View.OnClickListener {
    public final Context n;
    public final pvs o;
    public final mzp0 p;
    public final lvs q;
    public boolean r;
    public boolean s;
    public final io.reactivex.rxjava3.disposables.c t;

    /* compiled from: FullScreenBannerPhoneController.kt */
    public static final /* synthetic */ class a extends FunctionReferenceImpl implements izs<Throwable, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(Throwable th) {
            L.i(th);
            return s3q0.a;
        }
    }

    public qvs(Context context, pvs pvsVar, mzp0 mzp0Var) {
        this.n = context;
        this.o = pvsVar;
        this.p = mzp0Var;
        this.q = new lvs(pvsVar);
        lwu0 lwu0Var = pvsVar.d;
        CustomisableBottomSheetBehavior<FrameLayout> customisableBottomSheetBehavior = new CustomisableBottomSheetBehavior<>(context);
        customisableBottomSheetBehavior.i = true;
        customisableBottomSheetBehavior.I(iah0.u());
        customisableBottomSheetBehavior.J(3);
        this.k = customisableBottomSheetBehavior;
        this.d = false;
        this.g = new zsd(this, 1);
        this.t = ((io.reactivex.rxjava3.subjects.f) pvsVar.c.b).subscribe(new st0(new i4h(this, 23), 19), new b60(new a(1, L.a, L.class, Logger.METHOD_E, "e(Ljava/lang/Throwable;)V", 0), 26));
        Activity h = e3m.h(context);
        if (h == null || lwu0Var.a != -10) {
            return;
        }
        try {
            lwu0Var.a = h.getRequestedOrientation();
            WindowManager windowManager = (WindowManager) h.getSystemService("window");
            if (windowManager.getDefaultDisplay() != null) {
                int rotation = windowManager.getDefaultDisplay().getRotation();
                int i = h.getResources().getConfiguration().orientation;
                if (rotation == 0) {
                    if (i == 2) {
                        h.setRequestedOrientation(0);
                        return;
                    } else {
                        h.setRequestedOrientation(1);
                        return;
                    }
                }
                if (rotation == 1) {
                    if (i == 1) {
                        h.setRequestedOrientation(9);
                        return;
                    } else {
                        h.setRequestedOrientation(0);
                        return;
                    }
                }
                if (rotation != 3) {
                    if (i == 2) {
                        h.setRequestedOrientation(8);
                        return;
                    } else {
                        h.setRequestedOrientation(9);
                        return;
                    }
                }
                if (i == 1) {
                    h.setRequestedOrientation(1);
                } else {
                    h.setRequestedOrientation(8);
                }
            }
        } catch (Exception unused) {
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (view.getId() == R.id.fsb_close_view) {
            this.r = true;
            CustomisableBottomSheetBehavior<FrameLayout> customisableBottomSheetBehavior = this.k;
            if (customisableBottomSheetBehavior != null) {
                customisableBottomSheetBehavior.J(5);
            }
        }
    }

    @Override // xsna.bh6, xsna.gw20
    public final void onDestroy() {
        Activity h = e3m.h(this.n);
        if (h != null) {
            try {
                this.o.d.a = -10;
                h.setRequestedOrientation(-1);
            } catch (Exception unused) {
            }
        }
        io.reactivex.rxjava3.disposables.c cVar = this.t;
        if (cVar != null) {
            cVar.dispose();
        }
    }

    @Override // xsna.bh6
    public final View z(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.full_screen_banner_phone, viewGroup);
        new mvs((ViewGroup) inflate, this.q, this.o, this);
        mzp0 mzp0Var = this.p;
        if (mzp0Var != null) {
            mzp0Var.e(inflate);
        }
        return inflate;
    }
}

package defpackage;

import android.content.Context;
import android.hardware.camera2.TotalCaptureResult;
import android.text.Layout;
import android.text.StaticLayout;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import androidx.media3.exoplayer.f;
import com.google.android.material.sidesheet.SideSheetBehavior;
import com.yandex.alicekit.core.views.ViewPagerFixedSizeLayout;
import com.yandex.go.shortcuts.impl.view.adapter.b;
import com.yandex.mobile.drive.scan.ui.c;
import java.util.ArrayList;
import java.util.Vector;
import ru.CryptoPro.JCP.tools.ActionTools;
import ru.CryptoPro.JCSP.KeyStore.MetaCSPStore;
import ru.yandex.taxi.widget.RobotoTextView;

/* loaded from: classes11.dex */
public final /* synthetic */ class jy4 implements nry0, aa3, ruy, vls, el7, ActionTools.Action, ax60, pi, ov71 {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ jy4(Object obj, int i, int i2) {
        this.a = i2;
        this.c = obj;
        this.b = i;
    }

    public int a(int i) {
        Integer num;
        ViewGroup viewGroup;
        int measuredHeight;
        float applyDimension;
        x5x0 x5x0Var = ((r810) this.c).a.a;
        w53 w53Var = x5x0Var.g;
        int i2 = -1;
        if (x5x0Var.m == null) {
            return -1;
        }
        ViewPagerFixedSizeLayout viewPagerFixedSizeLayout = x5x0Var.d;
        int collapsiblePaddingBottom = viewPagerFixedSizeLayout != null ? viewPagerFixedSizeLayout.getCollapsiblePaddingBottom() : 0;
        ArrayList c = x5x0Var.m.c();
        z83.h("Tab index is out ouf bounds!", i >= 0 && i < c.size());
        w5x0 w5x0Var = (w5x0) c.get(i);
        n0l a = w5x0Var.a.a.D.a();
        if (a != null) {
            String str = a.a;
            DisplayMetrics displayMetrics = w5x0Var.b;
            int i3 = a.b;
            if ("dp".equals(str)) {
                applyDimension = TypedValue.applyDimension(1, i3, displayMetrics);
            } else if ("sp".equals(str)) {
                applyDimension = TypedValue.applyDimension(2, i3, displayMetrics);
            } else {
                z83.j("No unit size defined");
                num = Integer.valueOf(i2);
            }
            i2 = (int) applyDimension;
            num = Integer.valueOf(i2);
        } else {
            num = null;
        }
        if (num != null) {
            measuredHeight = num.intValue();
        } else {
            h05 h05Var = (h05) w53Var.get(Integer.valueOf(i));
            if (h05Var == null) {
                ViewGroup viewGroup2 = (ViewGroup) x5x0Var.a.b(x5x0Var.i);
                h05 h05Var2 = new h05(x5x0Var, viewGroup2, w5x0Var, i);
                w53Var.put(Integer.valueOf(i), h05Var2);
                viewGroup = viewGroup2;
                h05Var = h05Var2;
            } else {
                viewGroup = h05Var.a;
            }
            h05Var.a();
            viewGroup.forceLayout();
            viewGroup.measure(View.MeasureSpec.makeMeasureSpec(this.b, 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
            measuredHeight = viewGroup.getMeasuredHeight();
        }
        return measuredHeight + collapsiblePaddingBottom;
    }

    @Override // defpackage.aa3
    public euy apply(Object obj) {
        an7 an7Var = (an7) this.c;
        TotalCaptureResult totalCaptureResult = (TotalCaptureResult) obj;
        an7Var.d.getClass();
        if (jn7.c(totalCaptureResult, this.b)) {
            an7Var.g = 5000000000L;
        }
        return an7Var.i.a(totalCaptureResult);
    }

    @Override // defpackage.nry0
    public boolean e(CharSequence charSequence) {
        RobotoTextView robotoTextView = ((b) this.c).d0;
        return new StaticLayout(charSequence, robotoTextView.getPaint(), this.b, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true).getLineCount() <= robotoTextView.getMaxLines();
    }

    @Override // ru.CryptoPro.JCP.tools.ActionTools.Action
    public Object execute() {
        Vector enumReaders;
        enumReaders = MetaCSPStore.enumReaders((String) this.c, this.b);
        return enumReaders;
    }

    @Override // defpackage.ruy
    public void invoke(Object obj) {
        switch (this.a) {
            case 3:
                ((xxc0) obj).onTimelineChanged(((jxc0) this.c).a, this.b);
                break;
            case 4:
            default:
                ((ub81) obj).h((op81) this.c, this.b);
                break;
            case 5:
                ((xxc0) obj).onMediaItemTransition((fe10) this.c, this.b);
                break;
        }
    }

    @Override // defpackage.el7
    public Object j(androidx.concurrent.futures.b bVar) {
        no6 no6Var = (no6) this.c;
        androidx.camera.core.impl.utils.executor.b bVar2 = (androidx.camera.core.impl.utils.executor.b) no6Var.w;
        int i = this.b;
        bVar2.execute(new z50(no6Var, bVar, i, 6));
        return oyr.m(i, "]", new StringBuilder("setExposureCompensationIndex["));
    }

    @Override // defpackage.ax60
    public void m(View view, n751 n751Var, bv31 bv31Var) {
        c cVar = (c) this.c;
        k751 k751Var = n751Var.a;
        cVar.E = k751Var.g(519).b;
        cVar.D = k751Var.g(519).d;
        ViewGroup viewGroup = cVar.o;
        ViewGroup.LayoutParams layoutParams = viewGroup.getLayoutParams();
        if (layoutParams == null) {
            ny61.t("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            return;
        }
        layoutParams.height = this.b + cVar.E;
        viewGroup.setLayoutParams(layoutParams);
        cVar.c(cVar.C, false);
    }

    @Override // defpackage.pi
    public boolean o(View view, hi hiVar) {
        SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.c;
        int i = SideSheetBehavior.Q;
        sideSheetBehavior.u(this.b);
        return true;
    }

    @Override // defpackage.vls, defpackage.ww01, io.appmetrica.analytics.coreapi.internal.backport.FunctionWithThrowable
    /* renamed from: apply, reason: collision with other method in class */
    public Object mo489apply(Object obj) {
        f fVar = (f) this.c;
        int i = this.b;
        if (i == 0) {
            Context context = fVar.e;
            int i2 = tw21.a;
            i = eg3.i(context).generateAudioSessionId();
        }
        return Integer.valueOf(i);
    }
}

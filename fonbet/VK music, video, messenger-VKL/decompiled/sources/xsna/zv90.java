package xsna;

import android.os.Trace;
import android.view.View;
import android.view.ViewTreeObserver;
import com.vk.core.ui.measuring.UiMeasuringScreen;
import com.vk.core.ui.measuring.slot.UiSlot;
import java.util.UUID;

/* compiled from: PerfettoUiMeasuringSession.kt */
/* loaded from: classes17.dex */
public final class zv90 implements mzp0 {
    public final UUID a;
    public final UiMeasuringScreen b;
    public final boolean c;

    /* compiled from: PerfettoUiMeasuringSession.kt */
    public static final class a implements ViewTreeObserver.OnDrawListener {
        public boolean b;
        public final /* synthetic */ View d;

        public a(View view) {
            this.d = view;
        }

        @Override // android.view.ViewTreeObserver.OnDrawListener
        public final void onDraw() {
            if (this.b) {
                return;
            }
            this.b = true;
            zv90.this.l(UiSlot.CFCP);
            View view = this.d;
            view.post(new aaq(5, view, this));
        }
    }

    /* compiled from: PerfettoUiMeasuringSession.kt */
    public static final class b implements ViewTreeObserver.OnDrawListener {
        public boolean b;
        public final /* synthetic */ View d;

        public b(View view) {
            this.d = view;
        }

        @Override // android.view.ViewTreeObserver.OnDrawListener
        public final void onDraw() {
            if (this.b) {
                return;
            }
            this.b = true;
            zv90.this.l(UiSlot.FCP);
            View view = this.d;
            view.post(new ugr(4, view, this));
        }
    }

    public zv90(UUID uuid, UiMeasuringScreen uiMeasuringScreen, boolean z) {
        this.a = uuid;
        this.b = uiMeasuringScreen;
        this.c = z;
    }

    public static String m(UiSlot uiSlot, String str) {
        String str2 = uiSlot.i() + '@' + str;
        return str2.length() <= 127 ? str2 : str2.substring(0, 127);
    }

    @Override // xsna.mzp0
    public final UUID Y0() {
        return this.a;
    }

    @Override // xsna.mzp0
    public final void a() {
        l(UiSlot.DLS);
    }

    @Override // xsna.mzp0
    public final void c(boolean z) {
        l(UiSlot.DLOADED);
    }

    @Override // xsna.mzp0
    public final void d(View view) {
        l(UiSlot.CONTENT);
        if (!this.c || view == null) {
            return;
        }
        view.getViewTreeObserver().addOnDrawListener(new a(view));
    }

    @Override // xsna.mzp0
    public final void e(View view) {
        l(UiSlot.FVC);
        view.getViewTreeObserver().addOnDrawListener(new b(view));
    }

    @Override // xsna.mzp0
    public final void h() {
        l(UiSlot.INTERACTIVE);
    }

    @Override // xsna.mzp0
    public final void init() {
        if (gz80.a(29)) {
            UiSlot uiSlot = UiSlot.INIT;
            Trace.endAsyncSection(m(uiSlot, this.b.name()), uiSlot.ordinal());
        }
    }

    public final void l(UiSlot uiSlot) {
        if (gz80.a(29)) {
            Trace.endAsyncSection(m(uiSlot, this.b.name()), uiSlot.ordinal());
        }
    }

    @Override // xsna.mzp0
    public final void start() {
        if (gz80.a(29)) {
            for (UiSlot uiSlot : UiSlot.h()) {
                Trace.beginAsyncSection(m(uiSlot, this.b.name()), uiSlot.ordinal());
            }
        }
    }

    @Override // xsna.mzp0
    public final void b() {
    }

    @Override // xsna.mzp0
    public final void f() {
    }

    @Override // xsna.mzp0
    public final void g() {
    }

    @Override // xsna.mzp0
    public final void i() {
    }

    @Override // xsna.mzp0
    public final void j() {
    }

    @Override // xsna.mzp0
    public final void k(String str) {
    }
}

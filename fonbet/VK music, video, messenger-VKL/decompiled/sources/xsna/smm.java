package xsna;

import android.graphics.Outline;
import android.os.Build;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.view.Window;
import android.view.WindowManager;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.compose.ui.window.SecureFlagPolicy;
import com.unity3d.services.UnityAdsConstants;
import com.vkontakte.android.R;
import java.util.UUID;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Lambda;

/* compiled from: AndroidDialog.android.kt */
/* loaded from: classes11.dex */
public final class smm extends y8i {
    public gzs<s3q0> f;
    public xim g;
    public final View h;
    public final kgm i;
    public boolean j;

    /* compiled from: AndroidDialog.android.kt */
    public static final class a extends ViewOutlineProvider {
        @Override // android.view.ViewOutlineProvider
        public final void getOutline(View view, Outline outline) {
            outline.setRect(0, 0, view.getWidth(), view.getHeight());
            outline.setAlpha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        }
    }

    /* compiled from: AndroidDialog.android.kt */
    public static final class b extends Lambda implements izs<m180, s3q0> {
        public b() {
            super(1);
        }

        @Override // xsna.izs
        public final s3q0 invoke(m180 m180Var) {
            smm smmVar = smm.this;
            if (smmVar.g.a) {
                smmVar.f.invoke();
            }
            return s3q0.a;
        }
    }

    /* compiled from: AndroidDialog.android.kt */
    public static final /* synthetic */ class c {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[LayoutDirection.values().length];
            try {
                iArr[LayoutDirection.Ltr.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[LayoutDirection.Rtl.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public smm(gzs<s3q0> gzsVar, xim ximVar, View view, LayoutDirection layoutDirection, azl azlVar, UUID uuid) {
        super(new ContextThemeWrapper(view.getContext(), ximVar.e ? R.style.DialogWindowTheme : R.style.FloatingDialogWindowTheme), 0);
        this.f = gzsVar;
        this.g = ximVar;
        this.h = view;
        float f = 8;
        Window window = getWindow();
        if (window == null) {
            throw new IllegalStateException("Dialog has no window");
        }
        xim ximVar2 = this.g;
        Window window2 = getWindow();
        if (window2 != null) {
            WindowManager.LayoutParams attributes = window2.getAttributes();
            attributes.type = ximVar2.g;
            window2.setAttributes(attributes);
        }
        window.requestFeature(1);
        window.setBackgroundDrawableResource(android.R.color.transparent);
        ppx0.b(window, this.g.e);
        window.setGravity(17);
        if (!this.g.e) {
            window.addFlags(65792);
            WindowManager.LayoutParams attributes2 = window.getAttributes();
            int i = Build.VERSION.SDK_INT;
            qw2.a.a(attributes2);
            if (i >= 30) {
                sw2 sw2Var = sw2.a;
                sw2Var.b(attributes2, 0);
                sw2Var.c(attributes2, 0);
            }
            window.setAttributes(attributes2);
        }
        kgm kgmVar = new kgm(getContext(), window);
        setTitle(this.g.f);
        kgmVar.setTag(R.id.compose_view_saveable_id_tag, "Dialog:" + uuid);
        kgmVar.setClipChildren(false);
        kgmVar.setElevation(azlVar.I0(f));
        kgmVar.setOutlineProvider(new a());
        this.i = kgmVar;
        View decorView = window.getDecorView();
        ViewGroup viewGroup = decorView instanceof ViewGroup ? (ViewGroup) decorView : null;
        if (viewGroup != null) {
            h(viewGroup);
        }
        setContentView(kgmVar);
        gqo.f(kgmVar, gqo.e(view));
        ro.o(kgmVar, ro.h(view));
        lyd.h(kgmVar, lyd.f(view));
        l(this.f, this.g, layoutDirection);
        mnh0.c(getOnBackPressedDispatcher(), this, new b(), 2);
    }

    public static final void h(ViewGroup viewGroup) {
        viewGroup.setClipChildren(false);
        if (viewGroup instanceof kgm) {
            return;
        }
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            ViewGroup viewGroup2 = childAt instanceof ViewGroup ? (ViewGroup) childAt : null;
            if (viewGroup2 != null) {
                h(viewGroup2);
            }
        }
    }

    public final void l(gzs<s3q0> gzsVar, xim ximVar, LayoutDirection layoutDirection) {
        int i;
        this.f = gzsVar;
        this.g = ximVar;
        SecureFlagPolicy secureFlagPolicy = ximVar.c;
        boolean b2 = nb2.b(this.h);
        int i2 = o2i0.$EnumSwitchMapping$0[secureFlagPolicy.ordinal()];
        if (i2 == 1) {
            b2 = false;
        } else if (i2 == 2) {
            b2 = true;
        } else if (i2 != 3) {
            throw new NoWhenBranchMatchedException();
        }
        getWindow().setFlags(b2 ? 8192 : -8193, 8192);
        int i3 = c.$EnumSwitchMapping$0[layoutDirection.ordinal()];
        if (i3 == 1) {
            i = 0;
        } else {
            if (i3 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            i = 1;
        }
        kgm kgmVar = this.i;
        kgmVar.setLayoutDirection(i);
        boolean z = ximVar.e;
        boolean z2 = ximVar.d;
        Window window = kgmVar.l;
        boolean z3 = (kgmVar.p && z2 == kgmVar.n && z == kgmVar.o) ? false : true;
        kgmVar.n = z2;
        kgmVar.o = z;
        if (z3) {
            WindowManager.LayoutParams attributes = window.getAttributes();
            int i4 = z2 ? -2 : -1;
            if (i4 != attributes.width || !kgmVar.p) {
                window.setLayout(i4, -2);
                kgmVar.p = true;
            }
        }
        setCanceledOnTouchOutside(ximVar.b);
        Window window2 = getWindow();
        if (window2 != null) {
            window2.setSoftInputMode(z ? 0 : Build.VERSION.SDK_INT < 31 ? 16 : 48);
        }
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public final boolean onKeyUp(int i, KeyEvent keyEvent) {
        if (!this.g.a || !keyEvent.isTracking() || keyEvent.isCanceled() || i != 111) {
            return super.onKeyUp(i, keyEvent);
        }
        this.f.invoke();
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0066, code lost:
    
        if (r5 <= r1) goto L31;
     */
    @Override // android.app.Dialog
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        View childAt;
        boolean onTouchEvent = super.onTouchEvent(motionEvent);
        if (this.g.b) {
            kgm kgmVar = this.i;
            kgmVar.getClass();
            if (Math.abs(motionEvent.getX()) <= Float.MAX_VALUE && Math.abs(motionEvent.getY()) <= Float.MAX_VALUE && (childAt = kgmVar.getChildAt(0)) != null) {
                int left = childAt.getLeft() + kgmVar.getLeft();
                int width = childAt.getWidth() + left;
                int top = childAt.getTop() + kgmVar.getTop();
                int height = childAt.getHeight() + top;
                int b2 = an10.b(motionEvent.getX());
                if (left <= b2) {
                    if (b2 <= width) {
                        int b3 = an10.b(motionEvent.getY());
                        if (top <= b3) {
                        }
                    }
                }
            }
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked == 0) {
                this.j = true;
                return true;
            }
            if (actionMasked != 1) {
                if (actionMasked == 3) {
                    this.j = false;
                    return onTouchEvent;
                }
            } else if (this.j) {
                this.f.invoke();
                this.j = false;
                return true;
            }
            return onTouchEvent;
        }
        int actionMasked2 = motionEvent.getActionMasked();
        if (actionMasked2 == 0 || actionMasked2 == 1 || actionMasked2 == 3) {
            this.j = false;
            return onTouchEvent;
        }
        return onTouchEvent;
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void cancel() {
    }
}

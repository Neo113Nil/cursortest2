package xsna;

import android.content.Context;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import com.vk.clips.sdk.shared.feed.controller.mvi.state.spinner.ScreenSpinnerViewState;
import com.vk.core.compose.component.defaults.SpinnerState;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: FeedScreenSpinnerRenderDelegate.kt */
/* loaded from: classes17.dex */
public final class n4r {
    public final Context a;
    public final o40 b;
    public final o99 c;
    public yyc d;

    /* compiled from: FeedScreenSpinnerRenderDelegate.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ScreenSpinnerViewState.Visible.values().length];
            try {
                iArr[ScreenSpinnerViewState.Visible.Error.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ScreenSpinnerViewState.Visible.Loading.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ScreenSpinnerViewState.Visible.Success.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public n4r(Context context, o40 o40Var, o99 o99Var) {
        this.a = context;
        this.b = o40Var;
        this.c = o99Var;
    }

    public final yyc a() {
        yyc yycVar = this.d;
        if (yycVar == null) {
            yycVar = new yyc(this.a);
        }
        this.d = yycVar;
        return yycVar;
    }

    public final void b(ScreenSpinnerViewState screenSpinnerViewState) {
        SpinnerState spinnerState;
        if (!(screenSpinnerViewState instanceof ScreenSpinnerViewState.Visible)) {
            if (!(screenSpinnerViewState instanceof ScreenSpinnerViewState.a)) {
                throw new NoWhenBranchMatchedException();
            }
            if (this.d != null) {
                ViewParent parent = a().getParent();
                ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
                if (viewGroup != null) {
                    viewGroup.removeView(a());
                    return;
                }
                return;
            }
            return;
        }
        Window a2 = this.b.a();
        if (a2 == null) {
            return;
        }
        ViewGroup viewGroup2 = (ViewGroup) a2.getDecorView();
        if (a().getParent() == null) {
            viewGroup2.addView(a(), -1, -1);
        }
        yyc a3 = a();
        int i = a.$EnumSwitchMapping$0[((ScreenSpinnerViewState.Visible) screenSpinnerViewState).ordinal()];
        if (i == 1) {
            spinnerState = SpinnerState.Error;
        } else if (i == 2) {
            spinnerState = SpinnerState.Loading;
        } else {
            if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            spinnerState = SpinnerState.Done;
        }
        a3.setState(spinnerState);
        a().setOnFinalStateShown(new dof(this, 21));
        a().setOnCancelClick(new b1h(this, 12));
    }
}

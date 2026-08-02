package xsna;

import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.vk.core.dialogs.bottomsheet.modern.impl.CustomisableBottomSheetBehavior;
import com.vk.core.dialogs.bottomsheet.modern.impl.CustomisableBottomSheetFragment;
import com.vkontakte.android.R;
import xsna.qpk;

/* compiled from: BaseModalBottomSheetController.kt */
/* loaded from: classes17.dex */
public abstract class bh6 implements gw20 {
    public static final io.reactivex.rxjava3.subjects.f<c> m = new io.reactivex.rxjava3.subjects.f<>();
    public int b;
    public boolean c = true;
    public boolean d = true;
    public DialogInterface.OnShowListener e = new yg6();
    public DialogInterface.OnCancelListener f = new zg6();
    public DialogInterface.OnDismissListener g = new ah6();
    public v9 h;
    public h9a i;
    public qpk.a j;
    public CustomisableBottomSheetBehavior<FrameLayout> k;
    public Integer l;

    /* compiled from: BaseModalBottomSheetController.kt */
    public static final class a implements c {
        public final DialogInterface a;

        public a(DialogInterface dialogInterface) {
            this.a = dialogInterface;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && epx.f(this.a, ((a) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "CancelEvent(di=" + this.a + ')';
        }
    }

    /* compiled from: BaseModalBottomSheetController.kt */
    public static final class b implements c {
        public final DialogInterface a;

        public b(DialogInterface dialogInterface) {
            this.a = dialogInterface;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && epx.f(this.a, ((b) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "DismissEvent(di=" + this.a + ')';
        }
    }

    /* compiled from: BaseModalBottomSheetController.kt */
    public interface c {
    }

    /* compiled from: BaseModalBottomSheetController.kt */
    public static final class d implements c {
        public final DialogInterface a;

        public d(DialogInterface dialogInterface) {
            this.a = dialogInterface;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && epx.f(this.a, ((d) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "ShowEvent(di=" + this.a + ')';
        }
    }

    @Override // xsna.gw20
    public final boolean a() {
        return this.c;
    }

    @Override // xsna.gw20
    public izs<Configuration, s3q0> d() {
        return this.h;
    }

    @Override // xsna.gw20
    public final DialogInterface.OnCancelListener e() {
        return this.f;
    }

    @Override // xsna.gw20
    public final DialogInterface.OnShowListener f() {
        return this.e;
    }

    @Override // xsna.gw20
    public final DialogInterface.OnKeyListener g() {
        return this.i;
    }

    @Override // xsna.gw20
    public final CustomisableBottomSheetBehavior<FrameLayout> getBehavior() {
        return this.k;
    }

    @Override // xsna.gw20
    public final Integer i() {
        return this.l;
    }

    @Override // xsna.gw20
    public final boolean k() {
        return this.d;
    }

    @Override // xsna.gw20
    public final DialogInterface.OnDismissListener q() {
        return this.g;
    }

    @Override // xsna.gw20
    public final int s() {
        return this.b;
    }

    @Override // xsna.gw20
    public final qpk.a w() {
        return this.j;
    }

    @Override // xsna.gw20
    public View x(CustomisableBottomSheetFragment customisableBottomSheetFragment, LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.modern_modal_dialog_bottom_sheet, viewGroup, false);
        ViewGroup viewGroup2 = (ViewGroup) inflate.findViewById(R.id.designed_bottom_sheet);
        viewGroup2.setClipChildren(true);
        viewGroup2.setClipToOutline(true);
        viewGroup2.setBackground(y(customisableBottomSheetFragment.requireContext()));
        viewGroup2.addView(z(layoutInflater, viewGroup, bundle));
        return inflate;
    }

    public Drawable y(Context context) {
        return gu9.b(R.attr.vk_ui_background_modal, context);
    }

    public abstract View z(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle);

    @Override // xsna.gw20
    public void onDestroy() {
    }

    @Override // xsna.gw20
    public void onPause() {
    }

    @Override // xsna.gw20
    public void onResume() {
    }
}

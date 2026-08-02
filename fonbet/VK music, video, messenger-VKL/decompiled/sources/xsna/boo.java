package xsna;

import android.view.View;
import android.widget.TextView;
import com.vk.voip.dto.call_member.CallMember;
import java.util.List;
import kotlin.collections.EmptyList;

/* compiled from: DurationDelegate.kt */
/* loaded from: classes7.dex */
public final class boo implements vgw0, tmg0 {
    public final TextView b;
    public final zzz c;
    public boolean d;
    public final int e;
    public final bpn0 f;
    public final bpn0 g;
    public final TextView h;
    public final EmptyList i;
    public final EmptyList j;

    /* compiled from: DurationDelegate.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[CallMember.NetworkStatus.values().length];
            try {
                iArr[CallMember.NetworkStatus.GOOD.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CallMember.NetworkStatus.MEDIUM.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[CallMember.NetworkStatus.BAD.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public boo(TextView textView) {
        this.b = textView;
        com.vk.voip.ui.c.b.getClass();
        a000 a000Var = (a000) com.vk.voip.ui.c.T().a;
        this.c = a000Var;
        this.e = cn70.b(6);
        this.f = new bpn0(new r5i(this, 11));
        new bpn0(new ocg(this, 14));
        this.g = new bpn0(new bv0(18));
        this.h = textView;
        EmptyList emptyList = EmptyList.b;
        this.i = emptyList;
        this.j = emptyList;
        if (!textView.isAttachedToWindow()) {
            textView.addOnAttachStateChangeListener(new c(textView, this));
            return;
        }
        a000Var.d(this);
        if (textView.isAttachedToWindow()) {
            textView.addOnAttachStateChangeListener(new b(textView, this));
        } else {
            a000Var.b(this);
        }
    }

    @Override // xsna.vgw0
    public final View a() {
        return this.h;
    }

    @Override // xsna.vgw0
    public final boolean b() {
        if (this.d) {
            return !this.c.isHorizontal() || ((Boolean) this.g.getValue()).booleanValue();
        }
        return false;
    }

    @Override // xsna.tmg0
    public final List<View> getAnimatedViewsToRotate() {
        return this.j;
    }

    @Override // xsna.tmg0
    public final List<View> getViewsToRotate() {
        return this.i;
    }

    @Override // xsna.tmg0, xsna.j6m
    public final void v0(float f) {
        super.v0(f);
        this.b.setVisibility(b() ? 0 : 8);
    }

    /* compiled from: View.kt */
    public static final class b implements View.OnAttachStateChangeListener {
        public final /* synthetic */ View b;
        public final /* synthetic */ boo c;

        public b(View view, boo booVar) {
            this.b = view;
            this.c = booVar;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewDetachedFromWindow(View view) {
            this.b.removeOnAttachStateChangeListener(this);
            boo booVar = this.c;
            booVar.c.b(booVar);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewAttachedToWindow(View view) {
        }
    }

    /* compiled from: View.kt */
    public static final class c implements View.OnAttachStateChangeListener {
        public final /* synthetic */ TextView b;
        public final /* synthetic */ boo c;

        public c(TextView textView, boo booVar) {
            this.b = textView;
            this.c = booVar;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewAttachedToWindow(View view) {
            this.b.removeOnAttachStateChangeListener(this);
            boo booVar = this.c;
            zzz zzzVar = booVar.c;
            zzzVar.d(booVar);
            TextView textView = booVar.h;
            if (textView.isAttachedToWindow()) {
                textView.addOnAttachStateChangeListener(new b(textView, booVar));
            } else {
                zzzVar.b(booVar);
            }
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewDetachedFromWindow(View view) {
        }
    }
}

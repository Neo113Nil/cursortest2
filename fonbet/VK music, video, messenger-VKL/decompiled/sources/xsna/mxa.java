package xsna;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.widget.TextView;
import com.vk.core.view.fresco.VKEnhancedImageView;
import kotlin.LazyThreadSafetyMode;

/* compiled from: ChannelDeactivationVC.kt */
/* loaded from: classes16.dex */
public final class mxa {
    public final Object a;
    public final Object b;
    public final Object c;
    public final Object d;

    /* compiled from: ChannelDeactivationVC.kt */
    public static final class a extends ViewOutlineProvider {
        @Override // android.view.ViewOutlineProvider
        public final void getOutline(View view, Outline outline) {
            if (view != null) {
                if (outline != null) {
                    outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), iah0.a(12));
                }
                view.setClipToOutline(true);
            }
        }
    }

    public mxa(ViewGroup viewGroup) {
        oo ooVar = new oo(viewGroup, 11);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.a = msy.a(lazyThreadSafetyMode, ooVar);
        this.b = msy.a(lazyThreadSafetyMode, new com.vk.movika.sdk.base.logic.interactor.h(this, 13));
        this.c = msy.a(lazyThreadSafetyMode, new wm1(this, 11));
        this.d = msy.a(lazyThreadSafetyMode, new com.vk.movika.sdk.base.logic.interactor.j(this, 16));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r4v4, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r4v9, types: [java.lang.Object, kotlin.Lazy] */
    public final void a(int i, int i2, int i3) {
        ?? r0 = this.b;
        ((TextView) r0.getValue()).setText(((TextView) r0.getValue()).getContext().getText(i));
        bwt0.p0((TextView) r0.getValue(), true);
        ?? r4 = this.c;
        ((TextView) r4.getValue()).setText(((TextView) r4.getValue()).getContext().getText(i2));
        ((VKEnhancedImageView) this.d.getValue()).setPlaceholder(i3);
    }
}

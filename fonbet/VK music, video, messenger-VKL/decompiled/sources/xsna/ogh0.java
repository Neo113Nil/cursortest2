package xsna;

import com.vk.im.ui.components.viewcontrollers.msg_list.stb.ScrollToBottomAnimator;
import com.vk.im.ui.views.ScrollToBottomView;
import kotlin.Lazy;
import kotlin.LazyThreadSafetyMode;
import xsna.vm30;

/* compiled from: ScrollToReactionController.kt */
/* loaded from: classes2.dex */
public final class ogh0 {
    public final Object a;
    public final ScrollToBottomAnimator b;
    public final vm30.l c;
    public kkm e;
    public boolean d = true;
    public final Object f = msy.a(LazyThreadSafetyMode.NONE, new wf40(this, 24));

    public ogh0(Lazy lazy, ScrollToBottomAnimator scrollToBottomAnimator, vm30.l lVar) {
        this.a = lazy;
        this.b = scrollToBottomAnimator;
        this.c = lVar;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final ScrollToBottomView a() {
        return (ScrollToBottomView) this.f.getValue();
    }
}

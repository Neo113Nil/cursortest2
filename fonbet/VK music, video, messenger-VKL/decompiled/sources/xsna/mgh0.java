package xsna;

import com.vk.im.ui.components.viewcontrollers.msg_list.stb.ScrollToBottomAnimator;
import com.vk.im.ui.views.ScrollToBottomView;
import kotlin.Lazy;
import kotlin.LazyThreadSafetyMode;
import xsna.vm30;

/* compiled from: ScrollToMentionController.kt */
/* loaded from: classes2.dex */
public final class mgh0 {
    public final Object a;
    public final ScrollToBottomAnimator b;
    public final vm30.k c;
    public kkm e;
    public final jsk d = new jsk(this, 11);
    public final Object f = msy.a(LazyThreadSafetyMode.NONE, new odc0(this, 11));
    public boolean g = true;

    public mgh0(Lazy lazy, ScrollToBottomAnimator scrollToBottomAnimator, vm30.k kVar) {
        this.a = lazy;
        this.b = scrollToBottomAnimator;
        this.c = kVar;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final ScrollToBottomView a() {
        return (ScrollToBottomView) this.f.getValue();
    }
}

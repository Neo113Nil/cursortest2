package xsna;

import android.view.View;
import com.vk.im.ui.components.viewcontrollers.msg_list.adapter.skelton.MsgSkeletonView;
import com.vk.im.ui.components.viewcontrollers.msg_list.adapter.skelton.MsgSkeletonViewRedesign;
import com.vk.toggle.features.ImFeatures;
import kotlin.Lazy;
import kotlin.LazyThreadSafetyMode;

/* compiled from: MsgListVcLoadingProgressController.kt */
/* loaded from: classes2.dex */
public final class an30 {
    public kkm a;
    public wz30 b;
    public final Object c;
    public final Object d;
    public final Object e;

    public an30(View view) {
        rp1 rp1Var = new rp1(13, view, this);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.c = msy.a(lazyThreadSafetyMode, rp1Var);
        this.d = msy.a(lazyThreadSafetyMode, new mk(15, view, this));
        this.e = msy.a(lazyThreadSafetyMode, new com.vk.movika.sdk.base.ui.r0(17, view, this));
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, kotlin.Lazy] */
    public final hh6 a() {
        ImFeatures imFeatures = ImFeatures.IM_CHAT_EMPTY_STATES_REDESIGN;
        imFeatures.getClass();
        return com.vk.toggle.b.A.a(imFeatures) ? (MsgSkeletonViewRedesign) this.e.getValue() : (MsgSkeletonView) this.d.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy<xsna.hh6>] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.Lazy<xsna.hh6>] */
    public final Lazy<hh6> b() {
        ImFeatures imFeatures = ImFeatures.IM_CHAT_EMPTY_STATES_REDESIGN;
        imFeatures.getClass();
        return com.vk.toggle.b.A.a(imFeatures) ? this.e : this.d;
    }
}

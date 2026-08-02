package xsna;

import com.vk.catalog2.common.ui.mvp.holder.clip.ClipDiscoverVh;
import com.vk.catalog2.common.ui.mvp.holder.container.ViewPagerVh;
import kotlin.jvm.internal.MutablePropertyReference0Impl;

/* compiled from: ClipDiscoverVh.kt */
/* loaded from: classes16.dex */
public final /* synthetic */ class yqc extends MutablePropertyReference0Impl {
    @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, xsna.rcy
    public final Object get() {
        return Boolean.valueOf(((ClipDiscoverVh) this.receiver).f);
    }

    @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, xsna.mcy
    public final void set(Object obj) {
        ClipDiscoverVh clipDiscoverVh = (ClipDiscoverVh) this.receiver;
        boolean booleanValue = ((Boolean) obj).booleanValue();
        ViewPagerVh viewPagerVh = clipDiscoverVh.l;
        if (booleanValue) {
            viewPagerVh.onResume();
        } else {
            viewPagerVh.onPause();
        }
        clipDiscoverVh.f = booleanValue;
    }
}

package com.yandex.div.core.view2.divs.pager;

import android.view.View;
import androidx.core.view.OneShotPreDrawListener;
import androidx.viewpager2.widget.ViewPager2;
import defpackage.b2l;
import defpackage.f1k;
import defpackage.t1l;
import defpackage.tls;
import defpackage.w1l;
import kotlin.Metadata;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;

@Metadata(d1 = {"\u0000\"\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\b\n\u0018\u00002\u00020\u00012\u00020\u0002J\u000f\u0010\u0004\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJW\u0010\u0013\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\u00020\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"com/yandex/div/core/view2/divs/pager/DivPagerBinder$observeSizeChange$1", "Lf1k;", "Landroid/view/View$OnLayoutChangeListener;", "", "getSize", "()I", "Lzy11;", "close", "()V", "Landroid/view/View;", "v", "left", "top", "right", "bottom", "oldLeft", "oldTop", "oldRight", "oldBottom", "onLayoutChange", "(Landroid/view/View;IIIIIIII)V", "oldSize", CA20Status.STATUS_USER_I, "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class DivPagerBinder$observeSizeChange$1 implements f1k, View.OnLayoutChangeListener {
    final /* synthetic */ t1l $div;
    final /* synthetic */ tls $observer;
    final /* synthetic */ ViewPager2 $this_observeSizeChange;
    private int oldSize;

    public DivPagerBinder$observeSizeChange$1(ViewPager2 viewPager2, tls tlsVar, t1l t1lVar) {
        this.$this_observeSizeChange = viewPager2;
        this.$observer = tlsVar;
        this.$div = t1lVar;
        viewPager2.addOnLayoutChangeListener(this);
        OneShotPreDrawListener.add(viewPager2, new w1l(viewPager2, this, tlsVar));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int getSize() {
        int orientation = this.$this_observeSizeChange.getOrientation();
        ViewPager2 viewPager2 = this.$this_observeSizeChange;
        return orientation == 0 ? viewPager2.getWidth() : viewPager2.getHeight();
    }

    @Override // java.lang.AutoCloseable, java.io.Closeable
    public void close() {
        this.$this_observeSizeChange.removeOnLayoutChangeListener(this);
    }

    @Override // android.view.View.OnLayoutChangeListener
    public void onLayoutChange(View v, int left, int top, int right, int bottom, int oldLeft, int oldTop, int oldRight, int oldBottom) {
        int size = getSize();
        if (this.oldSize != size) {
            this.oldSize = size;
            this.$observer.invoke(Integer.valueOf(size));
        } else if (this.$div.u instanceof b2l) {
            this.$this_observeSizeChange.requestTransform();
        }
    }
}

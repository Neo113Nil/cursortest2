package com.yandex.div.core.view2.divs.pager;

import android.view.View;
import androidx.viewpager2.widget.ViewPager2;
import com.yandex.div.core.Disposable;
import com.yandex.div2.DivPager;
import xsna.izs;
import xsna.qj80;
import xsna.s3q0;
import xsna.unn;

/* compiled from: DivPagerBinder.kt */
/* loaded from: classes7.dex */
public final class DivPagerBinder$observeSizeChange$1 implements Disposable, View.OnLayoutChangeListener {
    final /* synthetic */ DivPager $div;
    final /* synthetic */ izs<Object, s3q0> $observer;
    final /* synthetic */ ViewPager2 $this_observeSizeChange;
    private int oldSize;

    public DivPagerBinder$observeSizeChange$1(final ViewPager2 viewPager2, final izs<Object, s3q0> izsVar, DivPager divPager) {
        this.$this_observeSizeChange = viewPager2;
        this.$observer = izsVar;
        this.$div = divPager;
        viewPager2.addOnLayoutChangeListener(this);
        qj80.a(viewPager2, new Runnable() { // from class: com.yandex.div.core.view2.divs.pager.DivPagerBinder$observeSizeChange$1$special$$inlined$doOnPreDraw$1
            @Override // java.lang.Runnable
            public final void run() {
                int size;
                size = this.getSize();
                izsVar.invoke(Integer.valueOf(size));
                this.oldSize = size;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int getSize() {
        return this.$this_observeSizeChange.getOrientation() == 0 ? this.$this_observeSizeChange.getWidth() : this.$this_observeSizeChange.getHeight();
    }

    @Override // com.yandex.div.core.Disposable, java.lang.AutoCloseable, java.io.Closeable
    public void close() {
        this.$this_observeSizeChange.removeOnLayoutChangeListener(this);
    }

    @Override // android.view.View.OnLayoutChangeListener
    public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        int size = getSize();
        if (this.oldSize != size) {
            this.oldSize = size;
            this.$observer.invoke(Integer.valueOf(size));
        } else if (this.$div.u instanceof unn.b) {
            this.$this_observeSizeChange.c();
        }
    }
}

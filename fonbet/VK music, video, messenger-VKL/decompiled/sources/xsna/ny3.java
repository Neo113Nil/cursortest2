package xsna;

import android.annotation.SuppressLint;
import android.content.Context;
import android.widget.FrameLayout;

/* compiled from: AsyncItemCell.kt */
@SuppressLint({"ViewConstructor"})
/* loaded from: classes17.dex */
public final class ny3 extends FrameLayout {
    public final int b;
    public boolean c;
    public io.reactivex.rxjava3.disposables.c d;
    public izs<? super ny3, s3q0> e;

    public ny3(Context context, int i, int i2, int i3) {
        super(context, null, 0, 0);
        this.b = i3;
        setLayoutParams(new FrameLayout.LayoutParams(i, i2));
    }

    public final void a(izs izsVar) {
        io.reactivex.rxjava3.disposables.c cVar = this.d;
        if (cVar != null) {
            cVar.dispose();
        }
        this.d = new nbu0(getContext()).a(this.b, this, new com.vk.im.engine.commands.messages.a(1, this, izsVar));
    }
}

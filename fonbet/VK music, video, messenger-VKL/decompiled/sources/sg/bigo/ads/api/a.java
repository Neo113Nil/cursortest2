package sg.bigo.ads.api;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import sg.bigo.ads.core.adview.c;

/* loaded from: classes9.dex */
public abstract class a<T extends sg.bigo.ads.core.adview.c> extends FrameLayout {
    private T a;

    public a(@NonNull Context context) {
        super(context);
    }

    @NonNull
    public abstract T a();

    public final boolean a(int i, int i2) {
        return getViewImpl().a(i, i2);
    }

    @NonNull
    public final synchronized T getViewImpl() {
        try {
            if (this.a == null) {
                this.a = a();
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.a;
    }

    @Override // android.view.View
    @Deprecated
    public void setOnClickListener(@Nullable View.OnClickListener onClickListener) {
        super.setOnClickListener(onClickListener);
    }

    public a(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public a(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}

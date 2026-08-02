package xsna;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.vkontakte.android.R;
import xsna.ts5;

/* compiled from: BaseAvatarViewContainer.kt */
/* loaded from: classes15.dex */
public abstract class z66<T extends ts5> extends FrameLayout {
    public final T b;

    public z66(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public abstract T b(Context context, AttributeSet attributeSet, int i);

    public final T getDelegate() {
        return this.b;
    }

    @Override // android.view.View
    public void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
        super.setLayoutParams(layoutParams);
        removeAllViews();
        View view = this.b.getView();
        view.setId(R.id.avatar_container_view);
        view.setLayoutParams(new FrameLayout.LayoutParams(layoutParams != null ? layoutParams.width : -1, layoutParams != null ? layoutParams.height : -1));
        view.setPadding(0, 0, 0, 0);
        ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
        if (layoutParams2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams2;
        marginLayoutParams.setMargins(0, 0, 0, 0);
        view.setLayoutParams(marginLayoutParams);
        addView(view);
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        kxt0 kxt0Var = new kxt0(this);
        while (kxt0Var.hasNext()) {
            kxt0Var.next().setVisibility(i);
        }
    }

    public z66(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.b = b(context, attributeSet, i);
    }
}

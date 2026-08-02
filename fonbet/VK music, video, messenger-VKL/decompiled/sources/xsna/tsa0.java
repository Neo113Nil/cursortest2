package xsna;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.vk.core.view.components.button.VkSimpleButton;
import com.vk.core.view.components.picture.VkImageSimple;
import com.vk.core.view.components.text.VkText;
import com.vkontakte.android.R;

/* compiled from: PlaceholderView.kt */
/* loaded from: classes18.dex */
public final class tsa0 extends LinearLayout {
    public static final /* synthetic */ int h = 0;
    public final VkImageSimple b;
    public final VkText c;
    public final VkSimpleButton d;
    public dko e;
    public tlo0 f;
    public tlo0 g;

    public tsa0(Context context) {
        super(context, null, 0);
        LayoutInflater.from(context).inflate(R.layout.view_newsfeed_placeholder, (ViewGroup) this, true);
        setOrientation(1);
        setGravity(17);
        int a = iah0.a(32.0f);
        setPadding(a, a, a, a);
        this.b = (VkImageSimple) findViewById(R.id.newsfeed_placeholder_image);
        this.c = (VkText) findViewById(R.id.newsfeed_placeholder_title_text);
        this.d = (VkSimpleButton) findViewById(R.id.newsfeed_placeholder_find_button);
        setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
    }

    private final void setUpButtonText(tlo0 tlo0Var) {
        this.d.setText(tlo0Var != null ? tlo0Var.a(getContext()) : null);
    }

    private final void setUpDescriptionText(tlo0 tlo0Var) {
        this.c.setText(tlo0Var != null ? tlo0Var.a(getContext()) : null);
    }

    private final void setUpDrawable(dko dkoVar) {
        this.b.setImageDrawable(dkoVar != null ? dkoVar.a(getContext()) : null);
    }

    private final void setUpIsButtonShown(boolean z) {
        f4m.E(this.d, z);
    }

    public final tlo0 getButtonText() {
        return this.g;
    }

    public final tlo0 getDescriptionText() {
        return this.f;
    }

    public final dko getDrawable() {
        return this.e;
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        if (size > 0 && size2 > 0) {
            this.b.setVisibility(size < size2 ? 0 : 8);
        }
        super.onMeasure(i, i2);
    }

    public final void setButtonClickListener(View.OnClickListener onClickListener) {
        this.d.setOnClickListener(onClickListener);
    }

    public final void setButtonShown(boolean z) {
        setUpIsButtonShown(z);
    }

    public final void setButtonText(tlo0 tlo0Var) {
        this.g = tlo0Var;
        setUpButtonText(tlo0Var);
    }

    public final void setDescriptionText(tlo0 tlo0Var) {
        this.f = tlo0Var;
        setUpDescriptionText(tlo0Var);
    }

    public final void setDrawable(dko dkoVar) {
        this.e = dkoVar;
        setUpDrawable(dkoVar);
    }
}

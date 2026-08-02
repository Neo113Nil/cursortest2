package xsna;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.vk.core.view.components.text.VkText;
import com.vkontakte.android.R;
import xsna.tlo0;

/* compiled from: VkFeedInlineCommentInput.kt */
/* loaded from: classes18.dex */
public final class nuu0 extends FrameLayout {
    public final View b;
    public final VkText c;
    public tlo0 d;

    public nuu0(Context context) {
        super(context, null, 0);
        tlo0.Companion.getClass();
        this.d = tlo0.c.a;
        LayoutInflater.from(context).inflate(R.layout.pds_inline_comment_input, (ViewGroup) this, true);
        this.b = findViewById(R.id.container_inline_comment_input);
        this.c = (VkText) findViewById(R.id.pds_inline_comment_input_text);
    }

    private final void setUpText(tlo0 tlo0Var) {
        this.c.setText(tlo0Var.a(getContext()));
    }

    public final tlo0 getText() {
        return this.d;
    }

    public final void setText(tlo0 tlo0Var) {
        this.d = tlo0Var;
        setUpText(tlo0Var);
    }
}

package xsna;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.vk.core.view.components.button.VkButton;
import com.vkontakte.android.R;

/* compiled from: ArticleAuthorSubscribeView.kt */
/* loaded from: classes15.dex */
public final class mn3 extends LinearLayout {
    public izs<? super View, s3q0> b;
    public final TextView c;
    public final VkButton d;

    public mn3(Context context) {
        super(context, null, 0);
        LayoutInflater.from(context).inflate(R.layout.article_author_subscribe_view, this);
        setOrientation(1);
        this.c = (TextView) findViewById(R.id.title);
        VkButton vkButton = (VkButton) findViewById(R.id.button);
        this.d = vkButton;
        bwt0.i0(vkButton, new go1(this, 6));
    }

    public final izs<View, s3q0> getToggleSubscription() {
        return this.b;
    }

    public final void setToggleSubscription(izs<? super View, s3q0> izsVar) {
        this.b = izsVar;
    }
}

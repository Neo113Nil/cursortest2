package xsna;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.vk.im.ui.views.avatars.AvatarView;
import com.vkontakte.android.R;

/* compiled from: ContactView.kt */
@SuppressLint({"ViewConstructor"})
/* loaded from: classes2.dex */
public final class qaj extends ConstraintLayout {
    public final qtd0 t;

    public qaj(Context context, qtd0 qtd0Var) {
        super(context);
        this.t = qtd0Var;
        g3a0 g3a0Var = new g3a0();
        View.inflate(context, R.layout.vkim_promo_contact, this);
        float f = 6;
        setPadding(0, iah0.a(f), 0, iah0.a(f));
        setBackground(e3m.e(R.attr.selectableItemBackground, context));
        AvatarView avatarView = (AvatarView) findViewById(R.id.vkim_avatar);
        TextView textView = (TextView) findViewById(R.id.vkim_username);
        TextView textView2 = (TextView) findViewById(R.id.vkim_subtitle);
        avatarView.Y0(qtd0Var);
        textView.setText(hdp.a.a(qtd0Var.name()));
        textView2.setText(g3a0Var.a(qtd0Var.c5()));
    }

    public final qtd0 getContact() {
        return this.t;
    }
}

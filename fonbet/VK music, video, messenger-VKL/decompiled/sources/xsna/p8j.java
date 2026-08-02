package xsna;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.vk.im.ui.views.avatars.AvatarView;
import com.vkontakte.android.R;

/* compiled from: ContactHintVc.kt */
@SuppressLint({"ViewConstructor"})
/* loaded from: classes2.dex */
public final class p8j extends ConstraintLayout {
    public final TextView t;
    public final TextView u;
    public final View v;
    public final AvatarView w;

    public p8j(Context context) {
        super(context);
        View.inflate(context, R.layout.vkim_new_contact_hint, this);
        setLayoutParams(new ConstraintLayout.b(-2, -2));
        this.t = (TextView) findViewById(R.id.hint_title);
        this.u = (TextView) findViewById(R.id.hint_decription);
        this.v = findViewById(R.id.hint_action);
        this.w = (AvatarView) findViewById(R.id.avatar);
    }
}

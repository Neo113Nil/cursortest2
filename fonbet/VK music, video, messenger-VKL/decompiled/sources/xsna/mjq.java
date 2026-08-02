package xsna;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.view.View;
import android.widget.TextView;
import com.vk.im.ui.views.avatars.ImAvatarView;
import com.vkontakte.android.R;
import xsna.e3m;

/* compiled from: FakeContactVh.kt */
/* loaded from: classes2.dex */
public final class mjq extends vfz<kjq> {
    public final i8j l;
    public final TextView m;
    public final TextView n;
    public final g3a0 o;
    public String p;

    public mjq(View view, i8j i8jVar) {
        super(view);
        this.l = i8jVar;
        ImAvatarView imAvatarView = (ImAvatarView) this.itemView.findViewById(R.id.vkim_avatar);
        this.m = (TextView) this.itemView.findViewById(R.id.vkim_username);
        TextView textView = (TextView) this.itemView.findViewById(R.id.vkim_subtitle);
        this.n = textView;
        this.o = new g3a0();
        this.p = "";
        this.itemView.setOnClickListener(new v16(this, 4));
        Context context = this.itemView.getContext();
        e3m.a aVar = e3m.a;
        imAvatarView.o1(null, new LayerDrawable(new Drawable[]{m33.a(R.drawable.user_placeholder, context), m33.a(R.drawable.user_placeholder_icon, this.itemView.getContext())}));
        bwt0.p0(textView, true);
    }

    @Override // xsna.vfz
    public final void W5(kjq kjqVar) {
        CharSequence charSequence = kjqVar.b;
        this.m.setText(charSequence);
        String a = this.o.a(charSequence.toString());
        this.n.setText(a);
        this.p = a.toString();
    }
}

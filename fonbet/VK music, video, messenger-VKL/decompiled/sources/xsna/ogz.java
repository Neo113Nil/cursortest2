package xsna;

import android.view.ViewGroup;
import android.widget.TextView;
import com.vk.im.ui.views.avatars.AvatarView;
import com.vkontakte.android.R;
import xsna.ifz;

/* compiled from: ListViewHolderSpectator.kt */
/* loaded from: classes7.dex */
public final class ogz extends kgz<ifz.c> {
    public static final /* synthetic */ int p = 0;
    public final AvatarView m;
    public final TextView n;
    public final gdp o;

    public ogz(ViewGroup viewGroup) {
        super(viewGroup);
        this.m = (AvatarView) viewGroup.findViewById(R.id.avatar);
        this.n = (TextView) viewGroup.findViewById(R.id.name);
        this.o = new gdp();
    }

    @Override // xsna.kgz
    public final void W5(ifz.c cVar) {
        ifz.c cVar2 = cVar;
        x59.a(this.m, cVar2.b);
        CharSequence charSequence = cVar2.c;
        this.o.getClass();
        this.n.setText(gdp.a(charSequence));
    }
}

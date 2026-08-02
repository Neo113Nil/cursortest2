package xsna;

import android.widget.ImageView;
import java.io.IOException;
import xsna.by1;
import xsna.ihz;
import xsna.uaw;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes12.dex */
public final /* synthetic */ class fal implements ihz.a {
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ fal(by1.a aVar, bpz bpzVar, pr10 pr10Var, IOException iOException, boolean z) {
        this.b = bpzVar;
        this.c = pr10Var;
        this.d = iOException;
    }

    public void a() {
        uaw uawVar = (uaw) this.b;
        uaw.a aVar = (uaw.a) this.c;
        ImageView imageView = (ImageView) this.d;
        uawVar.b.remove(aVar);
        int i = aVar.c;
        if (i == -2) {
            com.vk.im.reactions.impl.assets.a aVar2 = uawVar.a;
            bpn0 bpn0Var = uaw.e;
            imageView.setImageDrawable(aVar2.a(imageView, i, uaw.b.a(), uawVar.d));
        }
    }

    @Override // xsna.ihz.a
    public void invoke(Object obj) {
        ((by1) obj).L((bpz) this.b, (pr10) this.c, (IOException) this.d);
    }

    public /* synthetic */ fal(uaw uawVar, uaw.a aVar, ImageView imageView) {
        this.b = uawVar;
        this.c = aVar;
        this.d = imageView;
    }
}

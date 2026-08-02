package xsna;

import android.widget.ImageView;
import com.vk.profile.community.impl.ui.profile.actions.CommunityProfileAction;
import com.vk.writebar.fullscreen.WriteBarButtonsBubbleView;
import com.vkontakte.android.R;
import xsna.f8h;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes7.dex */
public final /* synthetic */ class v0y0 implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ v0y0(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        int i = this.b;
        Object obj = this.c;
        switch (i) {
            case 0:
                int i2 = WriteBarButtonsBubbleView.h;
                return (ImageView) ((WriteBarButtonsBubbleView) obj).findViewById(R.id.writebar_send);
            default:
                f8h f8hVar = (f8h) obj;
                f8h.b bVar = f8hVar.c;
                w8h w8hVar = bVar.a;
                w8h w8hVar2 = f8hVar.n;
                jyg b = w8hVar.b();
                jyg b2 = w8hVar2.b();
                if (b != null && b2 != null) {
                    com.vk.profile.community.impl.ui.cover.redesign.delegate.b bVar2 = b.r;
                    com.vk.profile.community.impl.ui.cover.redesign.delegate.b bVar3 = b2.r;
                    if (bVar2 != null && bVar3 != null) {
                        bVar2.h.c(bVar3.h);
                    }
                }
                int i3 = 0;
                f8hVar.e.a.invoke(new CommunityProfileAction.g.d.C1587d(false));
                f8hVar.e.a.invoke(new CommunityProfileAction.g.d.h(false));
                Float c = w8hVar2.c();
                jyg b3 = w8hVar2.b();
                if (b3 != null) {
                    com.vk.profile.community.impl.ui.cover.redesign.delegate.a aVar = b3.q;
                    if (aVar != null) {
                        aVar.g(false);
                    }
                    com.vk.profile.community.impl.ui.cover.redesign.delegate.b bVar4 = b3.r;
                    if (bVar4 != null) {
                        bVar4.f(false);
                    }
                    b3.q = null;
                    b3.r = null;
                }
                bVar.a.e(c);
                f8hVar.k.postDelayed(new d8h(i3, f8hVar, c), 0L);
                return s3q0.a;
        }
    }
}

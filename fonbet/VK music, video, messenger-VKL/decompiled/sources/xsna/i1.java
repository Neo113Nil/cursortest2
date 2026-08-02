package xsna;

import android.app.Activity;
import android.content.Intent;
import android.view.View;
import com.vk.about.AboutAppFragment;
import com.vk.attachpicker.impl.fragment.GraffitiFragment;
import com.vk.attachpicker.impl.graffiti.presentation.GraffitiDrawingActivity;
import com.vk.comments.impl.marketitem.commentlist.presentation.MarketItemCommentsFragment;
import com.vk.core.view.components.text.links.a;
import com.vk.dto.common.Attachment;
import com.vk.dto.posting.PostingVisibilityMode;
import com.vk.stat.scheme.MobileOfficialAppsVideoStat$VideoEventSource;
import com.vk.stat.scheme.SchemeStat$PostDraftItemEventType;
import xsna.k010;
import xsna.xn50;
import xsna.yfu0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes14.dex */
public final /* synthetic */ class i1 implements View.OnClickListener {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ i1(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Type inference failed for: r6v4, types: [java.lang.Object, kotlin.Lazy] */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        x64 x64Var;
        int i = this.b;
        Object obj = this.c;
        switch (i) {
            case 0:
                int i2 = AboutAppFragment.U;
                ((AboutAppFragment) obj).finish();
                break;
            case 1:
                rx6 rx6Var = (rx6) obj;
                px6 px6Var = rx6Var.n;
                if (px6Var != null && !px6Var.e && !bwt0.b()) {
                    rx6Var.l.L1(px6Var.b);
                    jbc0 jbc0Var = (jbc0) rx6Var.o.getValue();
                    SchemeStat$PostDraftItemEventType schemeStat$PostDraftItemEventType = SchemeStat$PostDraftItemEventType.POST_NOW;
                    jbc0Var.g();
                    break;
                }
                break;
            case 2:
                mh7 mh7Var = (mh7) obj;
                Attachment attachment = mh7Var.d;
                if (attachment != null && (x64Var = mh7Var.p) != null) {
                    x64Var.c(attachment);
                    break;
                }
                break;
            case 3:
                sjc sjcVar = (sjc) obj;
                a.InterfaceC0867a interfaceC0867a = sjcVar.b;
                if (!jjc.e()) {
                    interfaceC0867a.playSoundEffect(0);
                    Activity h = e3m.h(interfaceC0867a.getContext());
                    if (h == null) {
                        View view2 = interfaceC0867a.getView();
                        h = view2 != null ? zwt0.a(view2) : null;
                    }
                    l2v0 l2v0Var = sjcVar.e;
                    if (l2v0Var != null) {
                        l2v0Var.f(h, interfaceC0867a.getView());
                    }
                    View.OnClickListener onClickListener = sjcVar.h;
                    if (onClickListener != null) {
                        onClickListener.onClick(interfaceC0867a.getView());
                    }
                    s3q0 s3q0Var = s3q0.a;
                    jjc.d().a();
                }
                sjcVar.d.reset();
                sjcVar.e = null;
                interfaceC0867a.invalidate();
                break;
            case 4:
                e9g e9gVar = (e9g) obj;
                q6g q6gVar = e9gVar.n;
                if (q6gVar != null) {
                    e9gVar.l.b(q6gVar);
                    break;
                }
                break;
            case 5:
                ((kqg) obj).h.invoke();
                break;
            case 6:
                GraffitiFragment graffitiFragment = (GraffitiFragment) obj;
                int i3 = GraffitiFragment.N0;
                graffitiFragment.getClass();
                Intent intent = new Intent(view.getContext(), (Class<?>) GraffitiDrawingActivity.class);
                String str = graffitiFragment.G0;
                if (str != null) {
                    intent.putExtra("graffiti_avatar", str);
                }
                String str2 = graffitiFragment.H0;
                if (str2 != null) {
                    intent.putExtra("graffiti_title", str2);
                }
                graffitiFragment.startActivityForResult(intent, 150);
                break;
            case 7:
                MarketItemCommentsFragment marketItemCommentsFragment = (MarketItemCommentsFragment) obj;
                int i4 = MarketItemCommentsFragment.j0;
                marketItemCommentsFragment.getClass();
                xn50.a.c(marketItemCommentsFragment, k010.j.b);
                break;
            case 8:
                ((cqc0) obj).X0(PostingVisibilityMode.UNAVAILABLE_FRIENDS_AND_FRIENDS_OF_FRIENDS);
                break;
            case 9:
                bth0 bth0Var = (bth0) obj;
                if (!bth0Var.v.f) {
                    bth0Var.P4(bth0Var.D, bth0Var.u.a.a, new t440(bth0Var, 22));
                    break;
                }
                break;
            case 10:
                ctp0 ctp0Var = (ctp0) obj;
                ctp0Var.c.b(ctp0Var.a(), MobileOfficialAppsVideoStat$VideoEventSource.CROSS);
                fwb0 fwb0Var = ctp0Var.f;
                (fwb0Var != null ? fwb0Var : null).b();
                break;
            default:
                yfu0.a aVar = ((yfu0) obj).f;
                if (aVar != null) {
                    aVar.a();
                    break;
                }
                break;
        }
    }
}

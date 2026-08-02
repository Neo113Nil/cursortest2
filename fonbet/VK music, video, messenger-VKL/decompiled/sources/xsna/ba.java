package xsna;

import android.view.View;
import android.widget.TextView;
import com.vk.dto.music.Artist;
import com.vk.dto.music.Playlist;
import com.vk.external.miniapp.net.app.WebApiApplication;
import com.vk.feed.core.models.news.NewsEntry;
import com.vk.money.createtransfer.AbsCreateTransferFragment;
import com.vk.profile.community.impl.ui.profile.actions.CommunityProfileAction;
import com.vk.profile.questions.impl.d;
import com.vk.stat.scheme.SchemeStat$TypeQuestionItem;
import xsna.d9b0;
import xsna.fdf0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class ba implements View.OnClickListener {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ ba(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.b) {
            case 0:
                AbsCreateTransferFragment absCreateTransferFragment = (AbsCreateTransferFragment) this.c;
                TextView textView = (TextView) this.d;
                oak oakVar = absCreateTransferFragment.m0;
                if (oakVar == null) {
                    oakVar = null;
                }
                oakVar.x(textView.getContext());
                break;
            case 1:
                ((vmh) this.c).a.d.invoke(new CommunityProfileAction.e.d.c((Artist) this.d));
                break;
            case 2:
                i7o i7oVar = (i7o) this.c;
                h7o h7oVar = (h7o) this.d;
                NewsEntry H0 = i7oVar.H0();
                if (H0 != null) {
                    h7oVar.a(view.getContext(), H0, i7oVar.n());
                    break;
                }
                break;
            case 3:
                d9b0.a aVar = (d9b0.a) this.c;
                d9b0 d9b0Var = (d9b0) this.d;
                Playlist playlist = (Playlist) aVar.l;
                if (playlist != null) {
                    d9b0Var.d.a(playlist);
                    break;
                }
                break;
            case 4:
                com.vk.profile.questions.impl.e eVar = (com.vk.profile.questions.impl.e) this.c;
                d.c cVar = (d.c) this.d;
                eVar.l.l1(cVar);
                iqe0.a(cVar, SchemeStat$TypeQuestionItem.Type.OPEN_STORY);
                break;
            case 5:
                fdf0 fdf0Var = (fdf0) this.c;
                WebApiApplication webApiApplication = (WebApiApplication) this.d;
                fdf0.a aVar2 = fdf0Var.e;
                if (aVar2 != null) {
                    aVar2.a(webApiApplication);
                    break;
                }
                break;
            default:
                wbr0 wbr0Var = (wbr0) this.c;
                androidx.appcompat.app.d dVar = (androidx.appcompat.app.d) this.d;
                wbr0Var.a = true;
                ubr0 ubr0Var = wbr0Var.b;
                io.reactivex.rxjava3.disposables.b bVar = ubr0Var.b.r;
                vdx0 vdx0Var = e370.e;
                if (vdx0Var == null) {
                    vdx0Var = null;
                }
                hg1.e(bVar, bug0.d(vdx0Var.d().A(wbr0Var.c.b, wbr0Var.d.b, wbr0Var.e, wbr0Var.f), ((ggu0) ubr0Var.g.c).b, null, 6).subscribe(new oo20(new qjm0(ubr0Var, 6), 28), new i3q0(new rtg0(ubr0Var, 13), 2)));
                dVar.dismiss();
                break;
        }
    }
}

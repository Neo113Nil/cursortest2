package xsna;

import android.app.ProgressDialog;
import com.vk.api.generated.groups.dto.GroupsGroupFullDto;
import com.vk.auth.api.models.AuthResult;
import com.vk.core.preference.Preference;
import com.vk.dto.common.id.UserId;
import com.vk.superapp.browser.ui.VkBrowserActivity;
import com.vk.voip.ui.group_selector.VoipGroupSelectorConfig;
import com.vk.voip.ui.history.past.presentation.base.fragment.VoipPastCallsFragment;
import com.vk.voip.ui.share.link.pager.view.VoipShareLinkPagerView;
import com.vk.voip.ui.share.link.pager.view.a;
import com.vk.voip.ui.whiteboard.presentation.main.ui.WhiteboardFragment;
import com.vkontakte.android.R;
import java.util.Iterator;
import java.util.List;
import xsna.jhw0;
import xsna.k9d0;
import xsna.p4g;
import xsna.q55;
import xsna.tj50;
import xsna.v59;
import xsna.vzw0;
import xsna.yow0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class i9u0 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ i9u0(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        Object obj2;
        com.vk.voip.ui.share.link.pager.view.b bVar;
        int i = this.b;
        yow0.b.c.a aVar = null;
        Object obj3 = this.c;
        switch (i) {
            case 0:
                lkr0 lkr0Var = ((j9u0) obj3).a;
                if (lkr0Var != null) {
                    lkr0Var.c();
                }
                break;
            case 1:
                com.vk.auth.ui.password.askpassword.a aVar2 = (com.vk.auth.ui.password.askpassword.a) obj3;
                AuthResult authResult = (AuthResult) obj;
                q55 q55Var = q55.a;
                List y0 = j5g.y0(q55.b);
                q55.b bVar2 = new q55.b(par0.a);
                p4g.a aVar3 = p4g.a;
                Iterator it = y0.iterator();
                while (it.hasNext()) {
                    try {
                        ((s25) it.next()).n(authResult);
                        s3q0 s3q0Var = s3q0.a;
                    } catch (Throwable th) {
                        bVar2.invoke(th);
                    }
                }
                aVar2.c.finish();
                break;
            case 2:
                eag0 eag0Var = (eag0) obj;
                int i2 = VkBrowserActivity.l;
                ((VkBrowserActivity) obj3).T1(eag0Var.a, eag0Var.b.a);
                break;
            case 3:
                break;
            case 4:
                i9w0 i9w0Var = (i9w0) obj3;
                f4m.j(i9w0Var.f);
                ProgressDialog progressDialog = i9w0Var.g;
                if (progressDialog != null) {
                    progressDialog.dismiss();
                }
                ProgressDialog progressDialog2 = new ProgressDialog(i9w0Var.b);
                progressDialog2.setMessage(progressDialog2.getContext().getString(R.string.rx_loading));
                progressDialog2.setCancelable(true);
                progressDialog2.setCanceledOnTouchOutside(false);
                i9w0Var.g = progressDialog2;
                progressDialog2.show();
                break;
            case 5:
                com.vk.voip.ui.call_by_link.feature.d dVar = (com.vk.voip.ui.call_by_link.feature.d) obj3;
                tj50.a aVar4 = (tj50.a) obj;
                igw0 igw0Var = new igw0(1, dVar.e, xfw0.class, "toViewState", "toViewState(Lcom/vk/voip/ui/call_by_link/feature/VoipCallByLinkState;)Lcom/vk/voip/ui/call_by_link/ui/VoipCallByLinkViewState$ContentDialog;", 0);
                ao8 ao8Var = ao8.d;
                break;
            case 6:
                io.reactivex.rxjava3.subjects.f<v59> fVar = ((ihw0) obj3).e;
                jhw0.f fVar2 = (jhw0.f) obj;
                if (fVar2 instanceof jhw0.f.b) {
                    fVar.onNext(new v59.b(!(Preference.m(0L, "voip_prefs_shared", "slider_moved") != 0)));
                    ysg0.b.a(new h3x0());
                } else if (fVar2 instanceof jhw0.f.a) {
                    fVar.onNext(v59.a.a);
                }
                break;
            case 7:
                ((xjw0) obj3).b.a((pv3) ((it80) obj).a);
                break;
            case 8:
                List list = (List) obj;
                VoipGroupSelectorConfig voipGroupSelectorConfig = ((wow0) obj3).f;
                UserId userId = voipGroupSelectorConfig.c;
                if (voipGroupSelectorConfig.g && userId == null) {
                    aVar = yow0.b.c.a.C4127a.a;
                } else if (userId == null || !fkq0.b(userId)) {
                    aVar = yow0.b.c.a.C4128b.a;
                } else {
                    UserId a = fkq0.a(userId);
                    Iterator it2 = list.iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            obj2 = it2.next();
                            if (epx.f(((GroupsGroupFullDto) obj2).P0(), a)) {
                            }
                        } else {
                            obj2 = null;
                        }
                    }
                    GroupsGroupFullDto groupsGroupFullDto = (GroupsGroupFullDto) obj2;
                    if (groupsGroupFullDto != null) {
                        aVar = new yow0.b.c.a.C4129c(groupsGroupFullDto);
                    }
                }
                break;
            case 9:
                VoipPastCallsFragment.b bVar3 = ((VoipPastCallsFragment) obj3).Q;
                sp.g((bVar3 != null ? bVar3 : null).b, 2);
                break;
            case 10:
                ((e0x0) obj3).l.c(vzw0.c.a);
                break;
            case 11:
                VoipShareLinkPagerView voipShareLinkPagerView = (VoipShareLinkPagerView) obj3;
                String str = voipShareLinkPagerView.i;
                if (str != null && (bVar = voipShareLinkPagerView.h) != null) {
                    bVar.a(new a.c(str));
                }
                break;
            default:
                jlx0 jlx0Var = (jlx0) obj;
                com.vk.voip.ui.whiteboard.presentation.main.ui.a aVar5 = ((WhiteboardFragment) obj3).Q;
                if (aVar5 != null) {
                    glx0 glx0Var = aVar5.e;
                    glx0Var.j.i(jlx0Var.b);
                    ty tyVar = glx0Var.g;
                    k9d0.c cVar = jlx0Var.c;
                    tyVar.i(cVar);
                    glx0Var.h.i(jlx0Var.d);
                    glx0Var.e.i(jlx0Var.f);
                    glx0Var.f.i(cVar);
                    glx0Var.i.i(jlx0Var.e);
                    boolean z = jlx0Var.a;
                    if (z != glx0Var.c) {
                        glx0Var.c = z;
                        h70 h70Var = glx0Var.a;
                        if (h70Var != null) {
                            h70Var.a(glx0Var, true);
                        }
                    }
                    h70 h70Var2 = glx0Var.a;
                    if (h70Var2 != null) {
                        h70Var2.a(glx0Var, false);
                    }
                }
                break;
        }
        return s3q0.a;
    }
}

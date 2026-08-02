package xsna;

import android.content.Context;
import android.view.View;
import com.vk.catalog2.common.ui.holders.search.SearchStaticMapPreviewVh;
import com.vk.core.ui.tracking.UiTracker;
import com.vk.core.ui.tracking.UiTrackingScreen;
import com.vk.core.view.components.formitem.VkFormField;
import com.vk.dto.attaches.Attach;
import com.vk.dto.common.id.UserId;
import com.vk.feed.settings.impl.presentation.filtered.tab.f;
import com.vk.im.engine.models.messages.Msg;
import com.vk.permission.dialog.VkSeparatePermissionDialog;
import com.vk.profile.questions.impl.QuestionsUsableRecyclerPaginatedView;
import com.vk.stat.scheme.SchemeStat$TypeNavgo;
import com.vk.superapp.browser.ui.dialogs.DialogResultState;
import com.vk.voip.ui.VoipTextButton;
import java.util.List;
import xsna.smu0;
import xsna.y1i0;
import xsna.ydz0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes17.dex */
public final /* synthetic */ class c98 implements View.OnClickListener {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ c98(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        yer yerVar;
        int i = this.b;
        Object obj = this.c;
        switch (i) {
            case 0:
                d98 d98Var = (d98) obj;
                d98Var.a.D0();
                d98Var.g.X(5);
                break;
            case 1:
                View.OnClickListener onClickListener = (View.OnClickListener) obj;
                bpn0 bpn0Var = jjc.a;
                if (!jjc.d().b(400L)) {
                    onClickListener.onClick(view);
                    break;
                }
                break;
            case 2:
                com.vk.feed.settings.impl.presentation.filtered.tab.a aVar = (com.vk.feed.settings.impl.presentation.filtered.tab.a) obj;
                if (!jjc.b() && (yerVar = (yer) aVar.m) != null) {
                    UserId userId = yerVar.a;
                    e40 e40Var = aVar.p;
                    if (e40Var != null) {
                        e40Var.a(new f.c.a(userId));
                    }
                    e40 e40Var2 = aVar.p;
                    if (e40Var2 != null) {
                        e40Var2.a(new f.a.b(userId));
                        break;
                    }
                }
                break;
            case 3:
                zzt zztVar = (zzt) obj;
                UiTrackingScreen uiTrackingScreen = UiTracker.j.b;
                if (uiTrackingScreen != null) {
                    uiTrackingScreen.i = SchemeStat$TypeNavgo.Cause.SUGGESTION_GIFTS;
                }
                UserId p = zztVar.l.p();
                urw f = xwk.d().f();
                Context context = e43.a;
                if (context == null) {
                    context = null;
                }
                StringBuilder sb = new StringBuilder("https://vk.com/gifts/catalog?ref=sugg_msg_direct&to_id=");
                sb.append(p != null ? Long.valueOf(p.b) : null);
                f.a(context, sb.toString(), false);
                break;
            case 4:
                com.vk.im.video.e eVar = (com.vk.im.video.e) obj;
                abi0 abi0Var = eVar.M;
                if (!epx.f(abi0Var != null ? Boolean.valueOf(abi0Var.b()) : eVar.I, Boolean.TRUE)) {
                    fh5 fh5Var = eVar.j;
                    (fh5Var != null ? fh5Var : null).n0();
                    break;
                }
                break;
            case 5:
                com.vk.ecomm.catalog.impl.catalog.simple.a aVar2 = (com.vk.ecomm.catalog.impl.catalog.simple.a) obj;
                aVar2.h(aVar2.e, aVar2.d, false);
                break;
            case 6:
                op30 op30Var = (op30) obj;
                pk30 pk30Var = op30Var.l;
                pp30 pp30Var = op30Var.m;
                Msg msg = pp30Var != null ? pp30Var.s : null;
                Attach attach = pp30Var != null ? pp30Var.u : null;
                if (pk30Var != null && msg != null && attach != null) {
                    pk30Var.O(attach);
                    break;
                }
                break;
            case 7:
                int i2 = m760.A;
                ((m760) obj).Dn(DialogResultState.CANCEL);
                break;
            case 8:
                ((q4a0) obj).f.n(null);
                break;
            case 9:
                lma0 lma0Var = (lma0) ((mma0) obj).h;
                if (lma0Var != null) {
                    lma0Var.Y0();
                    break;
                }
                break;
            case 10:
                ((QuestionsUsableRecyclerPaginatedView) obj).T.invoke();
                break;
            case 11:
                ((SearchStaticMapPreviewVh) obj).c();
                break;
            case 12:
                y1i0 y1i0Var = (y1i0) ((y1i0.d) obj).m;
                if (y1i0Var != null) {
                    y1i0Var.h.invoke(y1i0Var.g);
                    break;
                }
                break;
            case 13:
                ((mmf) obj).invoke(view);
                break;
            case 14:
                smu0 smu0Var = (smu0) obj;
                smu0.a aVar3 = smu0Var.f1;
                if (aVar3 != null) {
                    aVar3.b();
                }
                smu0Var.dismiss();
                break;
            case 15:
                List<Class<? extends View>> list = VkFormField.C;
                ((izs) obj).invoke(view);
                break;
            case 16:
                ((c0v0) obj).a();
                break;
            case 17:
                ((ebv0) obj).Mn();
                break;
            case 18:
                VkSeparatePermissionDialog vkSeparatePermissionDialog = (VkSeparatePermissionDialog) obj;
                qas qasVar = vkSeparatePermissionDialog.g1;
                if (qasVar != null) {
                    qasVar.c();
                }
                vkSeparatePermissionDialog.dismiss();
                break;
            case 19:
                ((qjo0) obj).invoke();
                break;
            case 20:
                gzs<s3q0> gzsVar = ((VoipTextButton) obj).c;
                if (gzsVar != null) {
                    gzsVar.invoke();
                    break;
                }
                break;
            case 21:
                s5z0 s5z0Var = (s5z0) obj;
                s5z0Var.removeView(s5z0Var.c);
                break;
            default:
                ((ydz0.b) obj).a(view, new akz0());
                break;
        }
    }
}

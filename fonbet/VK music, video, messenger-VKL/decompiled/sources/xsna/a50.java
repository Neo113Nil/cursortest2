package xsna;

import android.view.View;
import com.vk.auth.ui.fastlogin.VkConnectInfoHeader;
import com.vk.camera.drawing.gradient.StoryEditText;
import com.vk.core.view.components.subnavigation.VkSubnavigationButton;
import com.vk.dto.posting.PostingVisibilityMode;
import com.vk.im.design.view.pagination.DialogPinView;
import com.vk.newsfeed.impl.presentation.discover_media.presentation.fragment.DiscoverMediaTabFragment2;
import com.vk.newsfeed.posting.impl.domain.model.PostingAction;
import com.vk.registration.funnels.RegistrationFunnelScreenStack;
import com.vk.stat.sak.scheme.SchemeStatSak$TypeRegistrationItem;
import xsna.m2n;
import xsna.xn60;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class a50 implements View.OnClickListener {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ a50(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        l680 l680Var;
        int i = this.b;
        Object obj = this.c;
        switch (i) {
            case 0:
                p38 p38Var = (p38) obj;
                if (!jjc.b()) {
                    p38Var.d.invoke();
                    break;
                }
                break;
            case 1:
                uu3 uu3Var = (uu3) obj;
                ug8 ug8Var = uu3Var.l;
                qu3 qu3Var = uu3Var.o;
                ug8Var.invoke(qu3Var != null ? qu3Var : null);
                break;
            case 2:
                de6<?> de6Var = (de6) obj;
                if (view != null && (l680Var = de6Var.f) != null) {
                    l680Var.a(de6Var, de6Var.d, de6Var.e, view);
                    break;
                }
                break;
            case 3:
                gzs<s3q0> gzsVar = ((DialogPinView) obj).k;
                if (gzsVar != null) {
                    gzsVar.invoke();
                    break;
                }
                break;
            case 4:
                qcy<Object>[] qcyVarArr = DiscoverMediaTabFragment2.C0;
                ((n2n) ((DiscoverMediaTabFragment2) obj).T.getValue()).a(new m2n.d(xn60.d.a.b));
                break;
            case 5:
                Object obj2 = ((wmp) obj).o;
                ((ump) (obj2 != null ? obj2 : null)).g();
                break;
            case 6:
                ((izs) obj).invoke(PostingAction.ShowModalBackToStep1.b);
                break;
            case 7:
                ((enc0) obj).U.invoke(PostingAction.Navigation.OpenDraftsList.b);
                break;
            case 8:
                ((cqc0) obj).X0(PostingVisibilityMode.UNAVAILABLE_FRIENDS_AND_FRIENDS_LISTS);
                break;
            case 9:
                ((dw20) obj).hide();
                break;
            case 10:
                u6m0 u6m0Var = ((q6m0) obj).p;
                if (u6m0Var != null) {
                    nf9.b.m();
                    q6m0 q6m0Var = u6m0Var.b;
                    q6m0Var.h(false);
                    StoryEditText storyEditText = q6m0Var.j;
                    if (storyEditText == null) {
                        storyEditText = null;
                    }
                    mhy.d(storyEditText);
                    StoryEditText storyEditText2 = q6m0Var.j;
                    (storyEditText2 != null ? storyEditText2 : null).postDelayed(new qc9(u6m0Var, 6), 300L);
                    break;
                }
                break;
            case 11:
                ((ltn0) obj).a();
                break;
            case 12:
                if (f4m.h(((VkConnectInfoHeader) obj).e)) {
                    com.vk.registration.funnels.b.a.getClass();
                    RegistrationFunnelScreenStack registrationFunnelScreenStack = frf0.a;
                    frf0.a(SchemeStatSak$TypeRegistrationItem.EventType.UNIFIED_ACCOUNT_ALL_SERVICES, null, null, null, null, null, null, 254);
                    break;
                }
                break;
            default:
                VkSubnavigationButton vkSubnavigationButton = (VkSubnavigationButton) obj;
                View.OnClickListener onClickListener = vkSubnavigationButton.z;
                if (onClickListener != null) {
                    onClickListener.onClick(vkSubnavigationButton);
                    break;
                }
                break;
        }
    }
}

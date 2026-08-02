package xsna;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import androidx.fragment.app.FragmentActivity;
import com.unity3d.services.UnityAdsConstants;
import com.vk.feed.core.models.news.NewsEntry;
import com.vk.im.ui.fragments.chat.ChatFragment;
import com.vk.im.ui.views.dialog_actions.DialogActionsListView;
import com.vkontakte.android.R;
import com.vkontakte.android.api.ExtendedUserProfile;
import java.util.List;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.hb60;
import xsna.wym.a;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class yqb implements Runnable {
    public final /* synthetic */ int b = 2;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ yqb(FragmentActivity fragmentActivity, ExtendedUserProfile extendedUserProfile, rhq0 rhq0Var) {
        this.d = rhq0Var;
        this.c = fragmentActivity;
        this.e = extendedUserProfile;
    }

    @Override // java.lang.Runnable
    public final void run() {
        aez ydzVar;
        switch (this.b) {
            case 0:
                ChatFragment.e eVar = (ChatFragment.e) this.d;
                List<? extends u8m> list = (List) this.c;
                FunctionReferenceImpl functionReferenceImpl = (FunctionReferenceImpl) this.e;
                if (!eVar.i) {
                    eVar.i = true;
                    View inflate = ((ViewStub) eVar.a.findViewById(R.id.dialog_actions_stub)).inflate();
                    eVar.c = inflate;
                    eVar.d = inflate.findViewById(R.id.dialog_actions_dim);
                    View view = eVar.c;
                    if (view == null) {
                        view = null;
                    }
                    eVar.e = (ViewGroup) view.findViewById(R.id.dialog_actions_list_container);
                    View view2 = eVar.c;
                    if (view2 == null) {
                        view2 = null;
                    }
                    DialogActionsListView dialogActionsListView = (DialogActionsListView) view2.findViewById(R.id.dialog_actions_list_content);
                    kkm kkmVar = eVar.b;
                    if (kkmVar != null) {
                        kkmVar.e(dialogActionsListView, new pue(3));
                    }
                    eVar.f = dialogActionsListView;
                    View view3 = eVar.d;
                    if (view3 == null) {
                        view3 = null;
                    }
                    view3.setOnClickListener(new x16(eVar, 6));
                    View view4 = eVar.d;
                    if (view4 == null) {
                        view4 = null;
                    }
                    view4.setOnLongClickListener(new d9m(eVar, 0));
                    View view5 = eVar.d;
                    if (view5 == null) {
                        view5 = null;
                    }
                    eVar.g = new wym(view5);
                    if (gz80.a(23)) {
                        ViewGroup viewGroup = eVar.e;
                        if (viewGroup == null) {
                            viewGroup = null;
                        }
                        ydzVar = new zdz(viewGroup);
                    } else {
                        ViewGroup viewGroup2 = eVar.e;
                        if (viewGroup2 == null) {
                            viewGroup2 = null;
                        }
                        ydzVar = new ydz(viewGroup2);
                    }
                    eVar.h = ydzVar;
                }
                DialogActionsListView dialogActionsListView2 = eVar.f;
                if (dialogActionsListView2 == null) {
                    dialogActionsListView2 = null;
                }
                dialogActionsListView2.setDialogActions(list);
                DialogActionsListView dialogActionsListView3 = eVar.f;
                if (dialogActionsListView3 == null) {
                    dialogActionsListView3 = null;
                }
                jn4 jn4Var = new jn4();
                jn4Var.b = functionReferenceImpl;
                dialogActionsListView3.setOnActionClickListener(jn4Var);
                wym wymVar = eVar.g;
                if (wymVar == null) {
                    wymVar = null;
                }
                View view6 = wymVar.a;
                if (!wymVar.b()) {
                    wymVar.a();
                    view6.setVisibility(0);
                    view6.setAlpha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                    wymVar.b = view6.animate().alpha(0.4f).setDuration(225L).setInterpolator(wym.d).setListener(wymVar.new a(0));
                }
                aez aezVar = eVar.h;
                (aezVar != null ? aezVar : null).show();
                break;
            case 1:
                ((hb60.a) this.d).b((NewsEntry) this.e, (List) this.c);
                break;
            default:
                ((rhq0) this.d).d.e().a((FragmentActivity) this.c, ((ExtendedUserProfile) this.e).V);
                break;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ yqb(ChatFragment.e eVar, List list, izs izsVar) {
        this.d = eVar;
        this.c = list;
        this.e = (FunctionReferenceImpl) izsVar;
    }

    public /* synthetic */ yqb(hb60.a aVar, NewsEntry newsEntry, List list) {
        this.d = aVar;
        this.e = newsEntry;
        this.c = list;
    }
}

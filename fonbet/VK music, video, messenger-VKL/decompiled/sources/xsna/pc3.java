package xsna;

import android.view.View;
import com.vk.feed.design.view.newsfeed.topbar.FeedTopBar;
import com.vk.im.settings.appearance.AppearanceSettingsWithBackgroundsFragment;
import com.vk.newsfeed.impl.fragments.BottomSheetCommentsFragment;
import com.vk.superapp.bridges.SuperappUiRouterBridge;
import com.vk.voip.ui.broadcast.list.ui.PastBroadcastsFragment;
import com.vk.voip.ui.utils.StaticBottomSheetFragment;
import kotlin.jvm.internal.Ref$IntRef;
import xsna.nbv0;
import xsna.nzl;
import xsna.q4a0;
import xsna.zn30;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class pc3 implements View.OnClickListener {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ pc3(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.b;
        Object obj = this.c;
        switch (i) {
            case 0:
                int i2 = AppearanceSettingsWithBackgroundsFragment.b0;
                ((AppearanceSettingsWithBackgroundsFragment) obj).finish();
                break;
            case 1:
                com.vk.auth.verification.base.a aVar = (com.vk.auth.verification.base.a) obj;
                l0c l0cVar = aVar.p;
                (l0cVar != null ? l0cVar : null).l(aVar.l);
                break;
            case 2:
                u3g0 u3g0Var = (u3g0) obj;
                nzl.a aVar2 = BottomSheetCommentsFragment.f1;
                gzs<Boolean> gzsVar = u3g0Var.d;
                if (gzsVar == null || !gzsVar.invoke().booleanValue()) {
                    u3g0Var.Ic(false);
                    break;
                }
                break;
            case 3:
                Ref$IntRef ref$IntRef = (Ref$IntRef) obj;
                int i3 = ref$IntRef.element + 1;
                ref$IntRef.element = i3;
                if (i3 >= 5) {
                    SuperappUiRouterBridge superappUiRouterBridge = e370.d;
                    SuperappUiRouterBridge superappUiRouterBridge2 = superappUiRouterBridge != null ? superappUiRouterBridge : null;
                    view.getContext();
                    superappUiRouterBridge2.getClass();
                    break;
                }
                break;
            case 4:
                int i4 = FeedTopBar.p;
                gzs<s3q0> gzsVar2 = ((FeedTopBar.b.a) ((FeedTopBar.b) obj)).c;
                if (gzsVar2 != null) {
                    gzsVar2.invoke();
                    break;
                }
                break;
            case 5:
                zn30.a aVar3 = ((zn30) obj).k;
                if (aVar3 != null) {
                    aVar3.d();
                    break;
                }
                break;
            case 6:
                ((yz80) obj).l.g();
                break;
            case 7:
                int i5 = PastBroadcastsFragment.U;
                ((PastBroadcastsFragment) obj).finish();
                break;
            case 8:
                mbv0 mbv0Var = ((nbv0.a) obj).b;
                if (mbv0Var != null) {
                    mbv0Var.V2();
                    break;
                }
                break;
            case 9:
                int i6 = StaticBottomSheetFragment.O;
                ((StaticBottomSheetFragment) obj).wn();
                break;
            case 10:
                bst0 bst0Var = (bst0) obj;
                if (!bst0Var.g()) {
                    q4a0.e eVar = bst0Var.e;
                    if (eVar != null) {
                        q4a0.this.f.n(null);
                    }
                    View view2 = bst0Var.i;
                    if (view2 == null) {
                        view2 = null;
                    }
                    if (view2.getVisibility() == 0) {
                        View view3 = bst0Var.i;
                        if (view3 == null) {
                            view3 = null;
                        }
                        twt0.c(view3, 150L, null, 6);
                        break;
                    } else {
                        View view4 = bst0Var.i;
                        twt0.b(6, 150L, view4 != null ? view4 : null);
                        break;
                    }
                }
                break;
            default:
                ((m4z0) obj).dismiss();
                break;
        }
    }
}

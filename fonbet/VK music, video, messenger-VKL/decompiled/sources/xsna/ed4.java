package xsna;

import android.view.MenuItem;
import android.view.View;
import android.widget.PopupMenu;
import com.vk.core.compose.component.topbar.TopBar$Middle;
import com.vk.dto.group.Group;
import com.vk.dto.narratives.Narrative;
import com.vk.notifications.settings.CommunitiesManageNotificationsFragment;
import com.vkontakte.android.R;
import xsna.h7u0;
import xsna.idh0;
import xsna.q7h0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class ed4 implements wzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ ed4(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        switch (this.b) {
            case 0:
                ((Integer) obj2).getClass();
                ((kd4) this.c).a((q630) this.d, (androidx.compose.runtime.a) obj, ne7.I(1));
                break;
            case 1:
                jai jaiVar = (jai) this.c;
                h17 h17Var = (h17) this.d;
                androidx.compose.runtime.a aVar = (androidx.compose.runtime.a) obj;
                int intValue = ((Integer) obj2).intValue();
                if (aVar.t(intValue & 1, (intValue & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-2071656865, intValue, -1, "com.vk.music.stickyplayer.presentation.components.BigPlayerScaffold.<anonymous> (BigPlayerScaffold.kt:390)");
                    }
                    jaiVar.invoke(h17Var.b, aVar, 0);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar.h();
                }
                break;
            case 2:
                break;
            case 3:
                final com.vk.movika.sdk.base.observable.p pVar = (com.vk.movika.sdk.base.observable.p) this.c;
                final CommunitiesManageNotificationsFragment communitiesManageNotificationsFragment = (CommunitiesManageNotificationsFragment) this.d;
                View view = (View) obj;
                final Group group = (Group) obj2;
                PopupMenu popupMenu = new PopupMenu(view.getContext(), view);
                popupMenu.getMenu().add(0, 0, 0, R.string.edit);
                popupMenu.getMenu().add(0, 1, 0, R.string.disable_community);
                popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() { // from class: xsna.sog
                    @Override // android.widget.PopupMenu.OnMenuItemClickListener
                    public final boolean onMenuItemClick(MenuItem menuItem) {
                        int itemId = menuItem.getItemId();
                        Group group2 = group;
                        int i = 1;
                        if (itemId == 0) {
                            com.vk.movika.sdk.base.observable.p.this.invoke(group2);
                            return true;
                        }
                        if (itemId != 1) {
                            return true;
                        }
                        int i2 = CommunitiesManageNotificationsFragment.Z;
                        int i3 = h7u0.p;
                        CommunitiesManageNotificationsFragment communitiesManageNotificationsFragment2 = communitiesManageNotificationsFragment;
                        h7u0.a c = h7u0.b.c(communitiesManageNotificationsFragment2.requireContext());
                        c.h0(communitiesManageNotificationsFragment2.getString(R.string.community_disable_notifications_title, group2.d));
                        c.c0(R.string.community_disable_notifications_yes, new n83(i, group2, communitiesManageNotificationsFragment2));
                        c.W(R.string.community_disable_notifications_cancel, new rog());
                        c.m();
                        return true;
                    }
                });
                popupMenu.show();
                break;
            case 4:
                ((Integer) obj2).getClass();
                ((v0r) this.c).n((String) this.d, (androidx.compose.runtime.a) obj, ne7.I(7));
                break;
            case 5:
                Narrative narrative = (Narrative) this.c;
                mu50 mu50Var = (mu50) this.d;
                boolean booleanValue = ((Boolean) obj).booleanValue();
                if (((gmq) obj2).equals(narrative)) {
                    mu50Var.F.setActivated(booleanValue);
                }
                break;
            case 6:
                obe0 obe0Var = (obe0) this.c;
                jai jaiVar2 = (jai) this.d;
                ((Integer) obj2).getClass();
                obe0Var.a(ne7.I(7), (androidx.compose.runtime.a) obj, jaiVar2);
                break;
            case 7:
                q7h0.a aVar2 = (q7h0.a) obj2;
                break;
            case 8:
                idh0.a aVar3 = (idh0.a) this.c;
                izs izsVar = (izs) this.d;
                androidx.compose.runtime.a aVar4 = (androidx.compose.runtime.a) obj;
                int intValue2 = ((Integer) obj2).intValue();
                if (aVar4.t(intValue2 & 1, (intValue2 & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-675897929, intValue2, -1, "com.vk.video.ui.upload.impl.attachedclips.presentation.compose.screen.Loaded.<anonymous>.<anonymous> (Screen.kt:135)");
                    }
                    if (aVar3.b.isEmpty()) {
                        aVar4.K(-873677589);
                    } else {
                        aVar4.K(-868469899);
                        ich0.a(aVar3, izsVar, aVar4, 0);
                    }
                    aVar4.j();
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar4.h();
                }
                break;
            case 9:
                ((Integer) obj2).getClass();
                kml0.a((uvw) this.c, (izs) this.d, (androidx.compose.runtime.a) obj, ne7.I(1));
                break;
            case 10:
                ((Integer) obj2).getClass();
                ((TopBar$Middle.Text.a.b) this.c).a((q630) this.d, (androidx.compose.runtime.a) obj, ne7.I(1));
                break;
            default:
                jai jaiVar3 = (jai) this.c;
                l7k0 l7k0Var = (l7k0) this.d;
                androidx.compose.runtime.a aVar5 = (androidx.compose.runtime.a) obj;
                int intValue3 = ((Integer) obj2).intValue();
                if (aVar5.t(intValue3 & 1, (intValue3 & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1807980412, intValue3, -1, "com.vk.core.compose.snackbar.FadeInFadeOutWithScale.<anonymous>.<anonymous>.<anonymous>.<anonymous> (VkSnackbarHost.kt:281)");
                    }
                    jaiVar3.invoke(l7k0Var, aVar5, 0);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar5.h();
                }
                break;
        }
        return s3q0.a;
    }

    public /* synthetic */ ed4(Object obj, Object obj2, int i, int i2) {
        this.b = i2;
        this.c = obj;
        this.d = obj2;
    }
}

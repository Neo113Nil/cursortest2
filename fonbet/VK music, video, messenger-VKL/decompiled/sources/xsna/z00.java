package xsna;

import android.net.Uri;
import android.view.View;
import android.widget.TextView;
import com.vk.attachpicker.impl.DeprecatedAttachActivity;
import com.vk.auth.ui.fastlogin.VkConnectInfoHeader;
import com.vk.catalog2.common.dto.ui.actions.UIBlockActionFollow;
import com.vk.catalog2.common.ui.holders.ActionFollowVh;
import com.vk.clips.viewer.api.routing.ClipsRouter;
import com.vk.core.view.components.subnavigation.VkSubnavigationButton;
import com.vk.dto.common.ClipVideoFile;
import com.vk.dto.group.Group;
import com.vk.dto.user.UserProfile;
import com.vk.log.L;
import com.vk.log.LoggerOutputTarget;
import com.vk.voip.ui.asr.ui.list.PastAsrListFragment;
import com.vk.webapp.community_picker.AppsCommunityPickerFragment;
import com.vkontakte.android.R;
import xsna.as30;
import xsna.h7u0;
import xsna.vm30;
import xsna.vs60;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class z00 implements View.OnClickListener {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ z00(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v11, types: [P extends xsna.z55<?>] */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.b) {
            case 0:
                ActionFollowVh actionFollowVh = (ActionFollowVh) this.c;
                UIBlockActionFollow uIBlockActionFollow = actionFollowVh.m;
                if (uIBlockActionFollow != null) {
                    if (!uIBlockActionFollow.U()) {
                        actionFollowVh.onClick(view);
                        break;
                    } else {
                        Group group = uIBlockActionFollow.z;
                        if ((group != null && group.m == 2) || (group != null && group.m == 1)) {
                            actionFollowVh.onClick(view);
                            break;
                        } else {
                            UserProfile userProfile = uIBlockActionFollow.A;
                            int i = 0;
                            if (userProfile != null && userProfile.v == 3) {
                                TextView textView = actionFollowVh.h;
                                if (textView == null) {
                                    textView = null;
                                }
                                h7u0.a aVar = new h7u0.a(textView.getContext());
                                aVar.g0(R.string.catalog_delete_friend);
                                aVar.U(R.string.catalog_remove_friend_confirmation_message);
                                aVar.c0(android.R.string.yes, new a10(i, actionFollowVh, view));
                                aVar.W(android.R.string.no, null);
                                aVar.m();
                                break;
                            } else if (userProfile != null && userProfile.v == 1) {
                                TextView textView2 = actionFollowVh.h;
                                if (textView2 == null) {
                                    textView2 = null;
                                }
                                h7u0.a aVar2 = new h7u0.a(textView2.getContext());
                                aVar2.g0(R.string.catalog_delete_subscription);
                                aVar2.U(R.string.catalog_remove_subscriber_confirmation_message);
                                aVar2.c0(android.R.string.yes, new b10(i, actionFollowVh, view));
                                aVar2.W(android.R.string.no, null);
                                aVar2.m();
                                break;
                            } else {
                                actionFollowVh.onClick(view);
                                break;
                            }
                        }
                    }
                }
                break;
            case 1:
                AppsCommunityPickerFragment appsCommunityPickerFragment = (AppsCommunityPickerFragment) this.c;
                int i2 = AppsCommunityPickerFragment.U;
                h3p0.b(appsCommunityPickerFragment);
                break;
            case 2:
                sbd sbdVar = (sbd) this.c;
                ClipVideoFile clipVideoFile = sbdVar.G;
                if (clipVideoFile != null) {
                    g620.f().k(clipVideoFile.b, sbdVar.itemView.getContext(), ClipsRouter.GridForcedTab.NONE);
                    break;
                }
                break;
            case 3:
                DeprecatedAttachActivity deprecatedAttachActivity = (DeprecatedAttachActivity) this.c;
                int i3 = DeprecatedAttachActivity.K0;
                deprecatedAttachActivity.finish();
                break;
            case 4:
                ?? r10 = ((wmp) this.c).o;
                ((ump) (r10 != 0 ? r10 : null)).K();
                break;
            case 5:
                ((com.vk.photo.editor.features.mlenhance.a) this.c).a(true);
                break;
            case 6:
                ((as30.a) this.c).a();
                break;
            case 7:
                tr00 tr00Var = (tr00) this.c;
                x64 x64Var = tr00Var.m;
                if (x64Var != null) {
                    x64Var.c(tr00Var.d);
                    break;
                }
                break;
            case 8:
                wc60 wc60Var = (wc60) this.c;
                if (!jjc.b()) {
                    wc60Var.d.a(vs60.c.a.b);
                    break;
                }
                break;
            case 9:
                PastAsrListFragment pastAsrListFragment = (PastAsrListFragment) this.c;
                int i4 = PastAsrListFragment.U;
                pastAsrListFragment.finish();
                break;
            case 10:
                enc0 enc0Var = (enc0) this.c;
                wf40 wf40Var = new wf40(enc0Var, 16);
                int i5 = ify.a;
                if (ify.e(ify.c)) {
                    mhy.d(enc0Var.c);
                    ify.a(new inc0(wf40Var));
                } else {
                    wf40Var.invoke();
                }
                enc0Var.n.clearFocus();
                break;
            case 11:
                vm30.j jVar = ((lgh0) this.c).c;
                L l = L.a;
                l.getClass();
                if (!L.m(LoggerOutputTarget.NONE)) {
                    L.u(l, L.LogType.d, new Object[]{"ChatScrollIssue: scrolltobottom fab"});
                }
                ym30 ym30Var = vm30.this.t0;
                if (ym30Var != null) {
                    ym30Var.i0();
                    break;
                }
                break;
            case 12:
                VkConnectInfoHeader vkConnectInfoHeader = (VkConnectInfoHeader) this.c;
                int i6 = VkConnectInfoHeader.h;
                r55 r55Var = r55.a;
                String a = i5s.a(new StringBuilder("https://id."), a0a.d, "/terms");
                rex0 rex0Var = e370.j;
                (rex0Var != null ? rex0Var : null).b(vkConnectInfoHeader.getContext(), Uri.parse(a));
                break;
            default:
                VkSubnavigationButton vkSubnavigationButton = (VkSubnavigationButton) this.c;
                com.vk.core.view.components.subnavigation.b bVar = vkSubnavigationButton.A;
                if (bVar != null) {
                    bVar.a(vkSubnavigationButton);
                    break;
                }
                break;
        }
    }
}

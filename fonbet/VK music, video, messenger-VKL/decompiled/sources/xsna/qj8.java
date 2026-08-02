package xsna;

import android.content.ContextWrapper;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.mbridge.msdk.config.dynamic.baseview.ComponentGridView;
import com.vk.auth.ui.password.askpassword.VkAskPasswordView;
import com.vk.core.tips.Tooltip;
import com.vk.core.view.components.button.VkButton;
import com.vk.core.view.components.cell.VkCell;
import com.vk.feed.design.view.newsfeed.ads_mytarget.bls.MyTargetAdSurveyButtonsView;
import com.vk.registration.funnels.RegistrationFunnelScreenStack;
import com.vk.stat.sak.scheme.SchemeStatSak$EventScreen;
import com.vk.video.ui.discovery.minimizable.dialog.related_videos.VideoRelatedVideosFragment;
import com.vkontakte.android.R;
import com.vkontakte.android.api.ExtendedUserProfile;
import xsna.dw20;
import xsna.e3m;
import xsna.v1z0;
import xsna.yho;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes7.dex */
public final /* synthetic */ class qj8 implements View.OnClickListener {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ qj8(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.b;
        Object obj = this.c;
        switch (i) {
            case 0:
                ((rj8) obj).e.setChecked(!r1.isChecked());
                break;
            case 1:
                mhy.j(((mqd) obj).A);
                break;
            case 2:
                ((ComponentGridView) obj).a(view);
                break;
            case 3:
                com.vk.profile.questions.impl.b bVar = (com.vk.profile.questions.impl.b) obj;
                ExtendedUserProfile extendedUserProfile = bVar.g1;
                if (extendedUserProfile == null) {
                    extendedUserProfile = null;
                }
                if (extendedUserProfile.p0) {
                    b25 a = o25.a();
                    ExtendedUserProfile extendedUserProfile2 = bVar.g1;
                    if (extendedUserProfile2 == null) {
                        extendedUserProfile2 = null;
                    }
                    if (!a.a(extendedUserProfile2.a.c)) {
                        ContextWrapper ao = bVar.ao();
                        if (ao != null) {
                            ExtendedUserProfile extendedUserProfile3 = bVar.g1;
                            ExtendedUserProfile extendedUserProfile4 = extendedUserProfile3 != null ? extendedUserProfile3 : null;
                            t9k t9kVar = bVar.i1;
                            if (t9kVar != null && t9kVar.g) {
                                r3 = true;
                            }
                            new s9k(extendedUserProfile4, r3, ao, new vl1(bVar, 24)).a(ao, "CreateQuestionAnonymity");
                            break;
                        }
                    }
                }
                VkButton vkButton = bVar.l1;
                if (vkButton == null) {
                    vkButton = null;
                }
                RectF G = bwt0.G(vkButton);
                ContextWrapper ao2 = bVar.ao();
                if (ao2 != null) {
                    int i2 = Tooltip.n;
                    ExtendedUserProfile extendedUserProfile5 = bVar.g1;
                    String f = y8g0.f(R.string.create_question_anonymity_disabled, (extendedUserProfile5 != null ? extendedUserProfile5 : null).d);
                    Tooltip.WindowStyle windowStyle = Tooltip.WindowStyle.FULLSCREEN;
                    e3m.a aVar = e3m.a;
                    Tooltip.a.a(ao2, null, f, G, windowStyle, null, null, null, ao2.getColor(R.color.vk_white), ao2.getColor(R.color.vk_gray_900), null, 0.72f, null, 0, false, null, 0, null, null, null, null, null, null, 536851680);
                    break;
                }
                break;
            case 4:
                iio iioVar = ((wio) obj).e.c;
                (iioVar != null ? iioVar : null).a(yho.c.b);
                break;
            case 5:
                ((gzs) obj).invoke();
                break;
            case 6:
                ((ra40) obj).a.invoke();
                break;
            case 7:
                izs<? super View, s3q0> izsVar = ((MyTargetAdSurveyButtonsView) obj).e;
                if (izsVar != null) {
                    izsVar.invoke(view);
                    break;
                }
                break;
            case 8:
                ((x9d0) obj).W6(view);
                break;
            case 9:
                hmk0 hmk0Var = (hmk0) obj;
                dmk0 H = hmk0Var.H();
                boolean z = H.a;
                boolean z2 = !z;
                r3 = z ? false : H.b;
                hmk0Var.c.s(new dmk0(z2, r3, H.c, H.d));
                VkCell vkCell = hmk0Var.i;
                if (vkCell != null) {
                    vkCell.setRight(new VkCell.Right.d(new VkCell.Right.a.f((gzs) hmk0Var.k, r3, true), (VkCell.Right.e) null, (VkCell.Right.ExtraAction.a) null, (VkCell.Right.b) null, 30));
                    break;
                }
                break;
            case 10:
                VideoRelatedVideosFragment.ko((VideoRelatedVideosFragment) obj);
                break;
            case 11:
                final VkAskPasswordView vkAskPasswordView = ((VkAskPasswordView) obj).y.b;
                Drawable a2 = m33.a(R.drawable.vk_icon_new_logo_vk_56, vkAskPasswordView.getContext());
                if (a2 != null) {
                    a2.mutate();
                    a2.setTint(e3m.f(R.attr.vk_ui_vkontakte_landing_background, vkAskPasswordView.getContext()));
                } else {
                    a2 = null;
                }
                final kcu0 kcu0Var = new kcu0(SchemeStatSak$EventScreen.PARTIAL_EXPAND_HAVE_ACCOUNT, true, null);
                hz20 hz20Var = new hz20() { // from class: xsna.fbu0
                    @Override // xsna.hz20
                    public final void a(int i3) {
                        com.vk.auth.ui.password.askpassword.a aVar2 = vkAskPasswordView.y;
                        int i4 = VkAskPasswordView.D;
                        kcu0 kcu0Var2 = kcu0.this;
                        if (kcu0Var2.c) {
                            RegistrationFunnelScreenStack registrationFunnelScreenStack = frf0.a;
                            frf0.d(kcu0Var2.b, kcu0Var2.f, kcu0Var2.d, 8);
                            kcu0Var2.e = false;
                        }
                        if (i3 == -2) {
                            aVar2.c.H();
                        } else {
                            if (i3 != -1) {
                                return;
                            }
                            aVar2.c.m1();
                        }
                    }
                };
                dw20.b bVar2 = new dw20.b(vkAskPasswordView.getContext(), kcu0Var);
                cbq.a(bVar2);
                bVar2.N(a2).v0(R.string.vk_connect_profile_exists_question_vkid).i0(R.string.vk_connect_profile_exists_yes, hz20Var).U(R.string.vk_connect_profile_exists_no, hz20Var).I0("NotMyAccount");
                break;
            default:
                v1z0.a aVar2 = ((hhy0) obj).C;
                if (aVar2 != null) {
                    aVar2.b();
                    break;
                }
                break;
        }
    }
}

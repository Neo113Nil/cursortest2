package xsna;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import com.vk.catalog2.common.ui.holders.ClickType;
import com.vk.catalog2.common.ui.mvp.holder.ComposeHeaderIconShowAllBadgeVh;
import com.vk.clips.sdk.shared.item.clip.events.ClipItemViewEvent;
import com.vk.core.view.components.cell.rich.middle.VkRichCellMiddle;
import com.vk.im.chat.clips.decoration.impl.presentation.bottom.screen.reply.ChatClipsReplyFragment;
import com.vk.masks.MasksController;
import com.vk.photo.editor.markup.view.tools.BrushesPanel;
import com.vk.registration.funnels.RegistrationFunnelScreenStack;
import com.vk.stat.sak.scheme.SchemeStatSak$EventScreen;
import com.vk.stat.sak.scheme.SchemeStatSak$TypeRegistrationItem;
import com.vk.stories.StorySettingsActivity;
import com.yandex.div.internal.widget.SwitchView;
import me.grishka.appkit.fragments.AppKitFragment;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes17.dex */
public final /* synthetic */ class y01 implements View.OnClickListener {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ y01(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = 14;
        int i2 = 2;
        int i3 = 0;
        switch (this.b) {
            case 0:
                ((b11) this.c).b.a(zz0.b);
                break;
            case 1:
                AppKitFragment appKitFragment = (AppKitFragment) this.c;
                int i4 = AppKitFragment.Y;
                appKitFragment.go();
                break;
            case 2:
                rr4 rr4Var = (rr4) this.c;
                boolean z = rr4Var.l;
                jr4 jr4Var = jr4.this;
                if (!z) {
                    jr4Var.j.p(jr4Var.k);
                    break;
                } else {
                    jr4Var.j.q(jr4Var.k);
                    break;
                }
            case 3:
                Object obj = ((wa6) this.c).o;
                ((smp) (obj != null ? obj : null)).r();
                break;
            case 4:
                zn6 zn6Var = (zn6) this.c;
                ImageView imageView = zn6Var.b;
                ImageView imageView2 = zn6Var.f;
                ImageView imageView3 = zn6Var.e;
                ImageView imageView4 = zn6Var.d;
                ImageView imageView5 = zn6Var.c;
                if (epx.f(view, imageView)) {
                    zn6Var.a(0, new com.vk.movika.sdk.base.ui.g(zn6Var, i));
                } else if (epx.f(view, imageView5)) {
                    zn6Var.a(1, new m1(zn6Var, 5));
                } else {
                    int i5 = 8;
                    if (epx.f(view, imageView4)) {
                        zn6Var.a(2, new jd(zn6Var, i5));
                    } else if (epx.f(view, imageView3)) {
                        zn6Var.a(3, new kd(zn6Var, 12));
                    } else if (epx.f(view, imageView2)) {
                        zn6Var.a(4, new ld(zn6Var, i5));
                    }
                }
                if (zn6Var.getNeedToDropListenerAfterStarClick()) {
                    imageView.setOnClickListener(null);
                    imageView5.setOnClickListener(null);
                    imageView4.setOnClickListener(null);
                    imageView3.setOnClickListener(null);
                    imageView2.setOnClickListener(null);
                    break;
                }
                break;
            case 5:
                BrushesPanel brushesPanel = (BrushesPanel) this.c;
                int i6 = BrushesPanel.j;
                brushesPanel.b(BrushesPanel.BrushType.Glow);
                break;
            case 6:
                ChatClipsReplyFragment chatClipsReplyFragment = (ChatClipsReplyFragment) this.c;
                int i7 = ChatClipsReplyFragment.T;
                try {
                    chatClipsReplyFragment.tn();
                    s3q0 s3q0Var = s3q0.a;
                    break;
                } catch (Throwable unused) {
                    return;
                }
            case 7:
                ((x6d) this.c).e.a.a(ClipItemViewEvent.d.b);
                break;
            case 8:
                ComposeHeaderIconShowAllBadgeVh composeHeaderIconShowAllBadgeVh = (ComposeHeaderIconShowAllBadgeVh) this.c;
                int i8 = ComposeHeaderIconShowAllBadgeVh.A;
                if (!jjc.d().a()) {
                    int i9 = ComposeHeaderIconShowAllBadgeVh.A;
                    composeHeaderIconShowAllBadgeVh.b(ClickType.SHOW_ITEM);
                    s3q0 s3q0Var2 = s3q0.a;
                    break;
                }
                break;
            case 9:
                v4q v4qVar = (v4q) this.c;
                otu0 un = v4qVar.un();
                Context requireContext = v4qVar.requireContext();
                SchemeStatSak$EventScreen schemeStatSak$EventScreen = SchemeStatSak$EventScreen.REGISTRATION_EXISTENT_ACCOUNT_NO_PASSWORD;
                un.getClass();
                otu0.b(requireContext, schemeStatSak$EventScreen);
                break;
            case 10:
                ogw ogwVar = (ogw) this.c;
                com.vk.registration.funnels.b.a.getClass();
                RegistrationFunnelScreenStack registrationFunnelScreenStack = frf0.a;
                frf0.a(SchemeStatSak$TypeRegistrationItem.EventType.CAPTCHA_REFRESH, null, null, null, null, null, null, 254);
                ogwVar.c.refresh();
                break;
            case 11:
                nw20 nw20Var = (nw20) this.c;
                hz20 hz20Var = nw20Var.I;
                if (hz20Var != null) {
                    hz20Var.a(-1);
                }
                if (nw20Var.q) {
                    nw20Var.Q0 = true;
                    nw20Var.dismiss();
                    break;
                }
                break;
            case 12:
                StorySettingsActivity storySettingsActivity = (StorySettingsActivity) this.c;
                int i10 = StorySettingsActivity.P;
                boolean booleanExtra = storySettingsActivity.getIntent().getBooleanExtra("from_create_story", false);
                MasksController f = MasksController.f();
                f.m = true;
                if (!booleanExtra) {
                    io.reactivex.rxjava3.disposables.b bVar = storySettingsActivity.O;
                    io.reactivex.rxjava3.internal.operators.single.v vVar = new io.reactivex.rxjava3.internal.operators.single.v(new ha20(f, i2));
                    asu0 asu0Var = asu0.a;
                    bVar.b(vVar.q(asu0Var.c()).m(asu0Var.d()).subscribe(new r7a0(new mdm0(storySettingsActivity, i3), 11), new pd40(new sec(com.vk.metrics.eventtracking.b.a, 10), i)));
                    break;
                } else {
                    storySettingsActivity.setResult(-1);
                    storySettingsActivity.finish();
                    break;
                }
            case 13:
                ((SwitchView) this.c).forwardClicksToSwitch();
                break;
            default:
                ogv0 ogv0Var = (ogv0) this.c;
                int i11 = VkRichCellMiddle.p;
                ogv0Var.b.invoke();
                break;
        }
    }
}

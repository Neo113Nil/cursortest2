package xsna;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import androidx.compose.ui.platform.ComposeView;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.vk.catalog2.common.ui.holders.author.CircularAuthorViewHolder;
import com.vk.core.tool.view.onboarding.highlighter.VkOnboardingHighlighter;
import com.vk.core.view.components.button.VkButton;
import com.vk.dto.common.VideoFile;
import com.vk.dto.common.im.ImageList;
import com.vk.dto.group.Group;
import com.vk.dto.narratives.Narrative;
import com.vk.im.design.view.placeholder.ImPlaceholder;
import com.vk.im.ui.components.attaches_history.attaches.model.simple.SimpleAttachListItem;
import com.vk.im.ui.components.chat_profile.interactors.UserProfileAvatarsInteractor;
import com.vk.im.ui.components.viewcontrollers.msg_list_empty.b;
import com.vk.video.ui.discovery.minimizable.doc2doc.recycler.HorizontalRecyclerPaginationView;
import java.util.List;
import xsna.gtn;
import xsna.uxd0;
import xsna.xxd0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class xo8 implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ xo8(Object obj, Object obj2, Object obj3, int i) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        ImageList imageList;
        int i = this.b;
        int i2 = 17;
        int i3 = 0;
        Object obj = this.e;
        Object obj2 = this.d;
        Object obj3 = this.c;
        switch (i) {
            case 0:
                bp8 bp8Var = (bp8) obj3;
                uxd0.a.InterfaceC3848a interfaceC3848a = (uxd0.a.InterfaceC3848a) obj2;
                View view = (View) obj;
                xxd0 c = bp8Var.j.c();
                xxd0.b bVar = c instanceof xxd0.b ? (xxd0.b) c : null;
                if (bVar != null && (imageList = bVar.k) != null) {
                    if (!imageList.Jb()) {
                        imageList = null;
                    }
                    if (imageList != null) {
                        bp8Var.e(io.reactivex.rxjava3.kotlin.c.g(interfaceC3848a.o(UserProfileAvatarsInteractor.a(bp8Var.s, com.vk.dto.common.a.b(bp8Var.O()))), new zo8(bp8Var, view, imageList, i3), null, 2));
                        break;
                    }
                }
                break;
            case 1:
                ((CircularAuthorViewHolder) obj3).h(((ComposeView) obj2).getContext(), (Group) obj, null, null, null);
                break;
            case 2:
                gtn.a aVar = (gtn.a) obj2;
                SimpleAttachListItem simpleAttachListItem = (SimpleAttachListItem) obj;
                rd7 rd7Var = ((gtn) obj3).a;
                if (rd7Var != null) {
                    ((jtn) rd7Var.b).h(aVar.l.getContext(), simpleAttachListItem.b);
                }
                break;
            case 3:
                qor qorVar = (qor) obj3;
                qor.l(qorVar, (mpr) obj, qorVar.g((List) obj2), new p3h(qorVar, i2));
                break;
            case 4:
                com.vk.im.engine.models.groups.Group group = (com.vk.im.engine.models.groups.Group) obj2;
                com.vk.im.ui.components.viewcontrollers.msg_list_empty.a aVar2 = (com.vk.im.ui.components.viewcontrollers.msg_list_empty.a) obj;
                VkButton bottomFirstButton = ((ImPlaceholder) obj3).getBottomFirstButton();
                if (bottomFirstButton != null) {
                    if (group.Cb()) {
                        aVar2.T = false;
                        aVar2.e(new b.n(group, bottomFirstButton));
                    } else {
                        aVar2.T = true;
                        aVar2.e(new b.l(group, bottomFirstButton));
                    }
                }
                break;
            case 5:
                hw3 hw3Var = (hw3) obj3;
                pfp0 pfp0Var = (pfp0) obj2;
                yn80 yn80Var = (yn80) obj;
                if (hw3Var != null) {
                    break;
                }
                break;
            case 6:
                s6s0 s6s0Var = (s6s0) obj3;
                Activity activity = (Activity) obj2;
                y6s0 y6s0Var = (y6s0) obj;
                Integer num = s6s0Var.m;
                if (num != null) {
                    int intValue = num.intValue();
                    VideoFile videoFile = s6s0Var.a;
                    w1s0 w1s0Var = w1s0.b;
                    w1s0.j(activity, videoFile.I0(), videoFile, s6s0Var.d, intValue, new ni0(i2, y6s0Var, s6s0Var));
                }
                break;
            case 7:
                Throwable th = (Throwable) obj2;
                gxp gxpVar = (gxp) obj;
                HorizontalRecyclerPaginationView a = ((znj0) obj3).h().a();
                if (a != null) {
                    a.fj(th, gxpVar);
                }
                break;
            case 8:
                smq.f(((xsq0) obj3).a.l, (Context) obj2, (Narrative) obj, null, null, null, false, null, null, IronSourceError.ERROR_CODE_INIT_FAILED);
                break;
            default:
                final no00 no00Var = (no00) obj3;
                int i4 = VkOnboardingHighlighter.m;
                final Rect rect = new Rect();
                ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f);
                xo2.i(ofFloat, new ko00((gzs) obj, i3));
                ofFloat.setDuration(250L);
                ofFloat.setStartDelay(1000L);
                ofFloat.setInterpolator(new AccelerateDecelerateInterpolator());
                ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: xsna.lo00
                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        no00 no00Var2 = no00.this;
                        if (no00Var2.isAttachedToWindow()) {
                            int b = an10.b(((Float) valueAnimator.getAnimatedValue()).floatValue() * no00Var2.getWidth());
                            int height = no00Var2.getHeight();
                            Rect rect2 = rect;
                            rect2.set(0, 0, b, height);
                            no00Var2.setClipBounds(rect2);
                        }
                    }
                });
                xo2.h(ofFloat, new com.vk.movika.sdk.base.ui.r0(15, no00Var, (Long) obj2));
                ofFloat.start();
                break;
        }
        return s3q0.a;
    }
}

package xsna;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.TransitionDrawable;
import android.util.Property;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import com.vk.api.generated.vmoji.dto.VmojiPurchaseProductResponseDto;
import com.vk.core.view.components.context.menu.VkContextMenu;
import com.vk.core.view.components.context.menu.e;
import com.vk.dto.common.Good;
import com.vk.dto.common.id.UserId;
import com.vk.dto.stories.model.StoryEntry;
import com.vk.ecomm.design.compose.productattaches.ProductVideoAttach;
import com.vk.superapp.api.dto.widgets.actions.WebAction;
import com.vk.superapp.api.dto.widgets.actions.WebActionSubscribe;
import com.vk.superapp.api.dto.widgets.actions.WebSubscribeExtra;
import com.vk.video.ui.discovery.minimizable.n;
import com.vk.vmoji.character.model.VmojiProductModel;
import com.vkontakte.android.R;
import java.util.LinkedHashMap;
import kotlin.Pair;
import xsna.e6w0;
import xsna.fxw0;
import xsna.i8w0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class btl0 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ btl0(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    /* JADX WARN: Type inference failed for: r1v56, types: [kotlin.jvm.internal.FunctionReferenceImpl, xsna.izs] */
    @Override // xsna.izs
    public final Object invoke(Object obj) {
        WebSubscribeExtra webSubscribeExtra;
        int i = this.b;
        int i2 = 2;
        int i3 = 4;
        Object obj2 = this.d;
        Object obj3 = this.c;
        int i4 = 1;
        switch (i) {
            case 0:
                ((ctl0) obj3).b.e(128, new Pair((StoryEntry) obj2, (Throwable) obj));
                return s3q0.a;
            case 1:
                ien0 ien0Var = (ien0) obj3;
                acn0 acn0Var = (acn0) obj2;
                ImageButton imageButton = acn0Var.z;
                if (ien0Var.h() != null) {
                    if (!ien0Var.i()) {
                        imageButton.setContentDescription(!ien0Var.i() ? imageButton.getContext().getString(R.string.leave_group) : imageButton.getContext().getString(R.string.join_group));
                        TransitionDrawable transitionDrawable = new TransitionDrawable((BitmapDrawable[]) rli0.A(new ulp0(rli0.m(new ulp0(rl3.D(new Integer[]{Integer.valueOf(R.drawable.vk_icon_add_alt_20), Integer.valueOf(R.drawable.vk_icon_check_alt_20)}), new s55(dhr0.a, 16))), new yyl0(acn0Var, i3))).toArray(new BitmapDrawable[0]));
                        transitionDrawable.setCrossFadeEnabled(true);
                        imageButton.setImageDrawable(transitionDrawable);
                        transitionDrawable.startTransition(300);
                        AnimatorSet animatorSet = new AnimatorSet();
                        FrameLayout frameLayout = acn0Var.y;
                        Property property = View.SCALE_X;
                        ObjectAnimator duration = ObjectAnimator.ofFloat(frameLayout, (Property<FrameLayout, Float>) property, 0.8333333f).setDuration(300L);
                        Property property2 = View.SCALE_Y;
                        ObjectAnimator duration2 = ObjectAnimator.ofFloat(frameLayout, (Property<FrameLayout, Float>) property2, 0.8333333f).setDuration(300L);
                        ObjectAnimator duration3 = ObjectAnimator.ofFloat(frameLayout, (Property<FrameLayout, Float>) property, 1.0f).setDuration(300L);
                        duration3.setStartDelay(300L);
                        ObjectAnimator duration4 = ObjectAnimator.ofFloat(frameLayout, (Property<FrameLayout, Float>) property2, 1.0f).setDuration(300L);
                        duration4.setStartDelay(300L);
                        animatorSet.playTogether(duration, duration2, duration3, duration4);
                        animatorSet.start();
                    }
                    if (ien0Var.i()) {
                        imageButton.performHapticFeedback(17);
                        WebActionSubscribe h = ien0Var.h();
                        if (h != null) {
                            acn0Var.g6(false);
                            e4h.l(xwk.e().h0(), imageButton.getContext(), fkq0.e(new UserId(h.d)), new oh3(29, acn0Var, ien0Var), null, 24);
                        }
                    } else {
                        imageButton.performHapticFeedback(16);
                        WebActionSubscribe h2 = ien0Var.h();
                        if (h2 != null && (webSubscribeExtra = h2.e) != null) {
                            if (webSubscribeExtra.c == WebSubscribeExtra.GroupType.EVENT) {
                                int l = krv0.l(R.attr.vk_ui_icon_accent);
                                imageButton.getContext();
                                e.b bVar = new e.b(imageButton, null, null, l, 6);
                                bVar.w = R.layout.ds_internal_context_menu_item;
                                VkContextMenu.c.c(bVar, R.string.group_event_join_sure, null, false, null, new fg1(27, acn0Var, ien0Var), 30);
                                VkContextMenu.c.c(bVar, R.string.group_event_join_unsure, null, false, null, new dvk0(i4, acn0Var, ien0Var), 30);
                                bVar.a().j(false);
                            } else {
                                acn0Var.h6(ien0Var, true);
                            }
                        }
                    }
                }
                WebAction webAction = ien0Var.h.o.d;
                if (webAction != null) {
                    acn0Var.p.b(acn0Var.itemView.getContext(), webAction, ien0Var, null);
                }
                return s3q0.a;
            case 2:
                wzs wzsVar = (wzs) obj2;
                ProductVideoAttach productVideoAttach = (ProductVideoAttach) obj;
                Good good = (Good) ((LinkedHashMap) obj3).get(productVideoAttach);
                if (good == null) {
                    return s3q0.a;
                }
                wzsVar.invoke(productVideoAttach, good);
                return s3q0.a;
            case 3:
                com.vk.video.ui.discovery.minimizable.g gVar = (com.vk.video.ui.discovery.minimizable.g) obj3;
                gVar.T(new n.a(com.vk.video.ui.discovery.minimizable.g.c1(gVar, (com.vk.video.ui.discovery.minimizable.q) obj2, Boolean.TRUE, null, 4)));
                return s3q0.a;
            case 4:
                m6w0 m6w0Var = (m6w0) obj3;
                VmojiProductModel vmojiProductModel = (VmojiProductModel) obj2;
                VmojiPurchaseProductResponseDto vmojiPurchaseProductResponseDto = (VmojiPurchaseProductResponseDto) obj;
                if (vmojiPurchaseProductResponseDto.e() != null) {
                    m6w0Var.U(vmojiPurchaseProductResponseDto, vmojiProductModel);
                } else {
                    y7w0 y7w0Var = m6w0Var.g;
                    puv0 puv0Var = new puv0(i4, m6w0Var, vmojiProductModel);
                    View view = y7w0Var.a.getView();
                    if (view != null) {
                        view.post(new rih(y7w0Var, vmojiPurchaseProductResponseDto, puv0Var, i2));
                    }
                }
                return s3q0.a;
            case 5:
                i8w0.a aVar = (i8w0.a) obj2;
                ((e8w0) obj3).c.invoke(new e6w0.j(aVar.b, aVar.c));
                return s3q0.a;
            default:
                return ((pww0) obj3).Y((fxw0.a) ((fxw0) obj2), (f1x0) obj);
        }
    }
}

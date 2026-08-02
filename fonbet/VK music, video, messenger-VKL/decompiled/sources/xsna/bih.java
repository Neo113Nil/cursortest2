package xsna;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.graphics.Path;
import android.view.View;
import android.view.animation.Interpolator;
import androidx.fragment.app.FragmentActivity;
import com.vk.ads.easypromote.api.di.EasyPromoteComponent;
import com.vk.ads.easypromote.impl.presentation.EasyPromoteSettingsFragment;
import com.vk.auth.main.b;
import com.vk.bridges.di.BridgeComponent;
import com.vk.core.drawable.IndeterminateHorizontalProgressDrawable;
import com.vk.core.view.components.picture.VkImageSimple;
import com.vk.ecomm.market.album.MarketEditAlbumFinishedFragment;
import com.vk.im.engine.commands.contacts.ContactsSearchCmd;
import com.vk.newsfeed.impl.postmodal.ModalPostCommonFragment;
import com.vk.newsfeed.impl.postmodal.comments.CommentsOutherFragment;
import com.vk.newsfeed.posting.crop_editor.presentation.base.fragment.CropEditorFragment;
import com.vk.profile.community.subscription.api.di.CommunitySubscriptionComponent;
import com.vk.profile.community.suggestions.impl.ui.suggestions.CommunitySuggestionsFragment;
import com.vk.search.fragment.DiscoverSearchFragment;
import com.vk.superapp.multiaccount.impl.ecosystemswitcher.view.VkEcosystemLogoutButtonView;
import com.vkontakte.android.R;
import kotlin.Pair;
import kotlin.jvm.internal.Ref$ObjectRef;
import xsna.p1s;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes5.dex */
public final /* synthetic */ class bih implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ bih(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.gzs
    public final Object invoke() {
        int i = this.b;
        int i2 = 4;
        boolean z = true;
        Object obj = this.c;
        switch (i) {
            case 0:
                cih cihVar = (cih) obj;
                return new djh((ksd0) cihVar.f.E0.getValue(), cihVar.c);
            case 1:
                return (rmh) ((ynh) obj).D0.getValue();
            case 2:
                return ((BridgeComponent) ((h7m) obj).a(fpf0.a(BridgeComponent.class))).t().b();
            case 3:
                CommunitySuggestionsFragment communitySuggestionsFragment = (CommunitySuggestionsFragment) obj;
                int i3 = CommunitySuggestionsFragment.X;
                return o6h.a(((CommunitySubscriptionComponent) m7m.d(communitySuggestionsFragment).mo408a(fpf0.a(CommunitySubscriptionComponent.class))).E5(), communitySuggestionsFragment.requireContext(), (b3i) communitySuggestionsFragment.T.getValue(), null, null, new CommunitySuggestionsFragment.c(2, communitySuggestionsFragment, CommunitySuggestionsFragment.class, "updateGroupSubscriptionState", "updateGroupSubscriptionState(Lcom/vk/dto/common/id/UserId;I)V", 0), 12);
            case 4:
                ((r4i) obj).c.c();
                return s3q0.a;
            case 5:
                return ((i1j) obj).c.findViewById(R.id.back);
            case 6:
                String str = ((ContactsSearchCmd) obj).b;
                int i4 = 0;
                while (true) {
                    if (i4 < str.length()) {
                        if (Character.isLetter(str.charAt(i4))) {
                            z = false;
                        } else {
                            i4++;
                        }
                    }
                }
                return Boolean.valueOf(z);
            case 7:
                ((zak0) ((rfj) obj).j).setValue(Boolean.valueOf(!((Boolean) ((zak0) r0).getValue()).booleanValue()));
                return s3q0.a;
            case 8:
                qcy<Object>[] qcyVarArr = CropEditorFragment.W;
                return ((BridgeComponent) m7m.d((CropEditorFragment) obj).a(fpf0.a(BridgeComponent.class))).p().e();
            case 9:
                com.vk.newsfeed.common.recycler.holders.zhukov.a aVar = (com.vk.newsfeed.common.recycler.holders.zhukov.a) obj;
                aVar.a.setImageMatrix(aVar.g);
                return s3q0.a;
            case 10:
                return ((View) ((tdm) obj).b).findViewById(R.id.action_delete);
            case 11:
                egm egmVar = (egm) obj;
                VkImageSimple vkImageSimple = new VkImageSimple(egmVar.d, null, 6, 0);
                vkImageSimple.setId(R.id.dialog_item_hidden_icon);
                omw.d(vkImageSimple, R.drawable.vk_icon_hide_16, R.attr.vk_ui_icon_tertiary);
                vkImageSimple.setContentDescription(null);
                vkImageSimple.setLayoutParams(egm.W(egmVar, cn70.b(16), cn70.b(16), cn70.b(4), (int) (cn70.a() * 1.8f), 0, 0, 48));
                egmVar.b.addView(vkImageSimple);
                return vkImageSimple;
            case 12:
                int i5 = DiscoverSearchFragment.s0;
                qsh0 qsh0Var = new qsh0(((DiscoverSearchFragment) obj).requireContext());
                return new Pair(qsh0Var, qsh0Var);
            case 13:
                ((wfo) obj).d();
                return s3q0.a;
            case 14:
                qcy<Object>[] qcyVarArr2 = EasyPromoteSettingsFragment.S;
                return ((EasyPromoteComponent) ((k7m) m7m.f((EasyPromoteSettingsFragment) obj)).mo408a(fpf0.a(EasyPromoteComponent.class))).X();
            case 15:
                return (VkEcosystemLogoutButtonView) ((com.vk.superapp.multiaccount.impl.ecosystemswitcher.view.f) obj).c.findViewById(R.id.logout_button);
            case 16:
                dw20 dw20Var = (dw20) ((Ref$ObjectRef) obj).element;
                if (dw20Var != null) {
                    dw20Var.hide();
                }
                return s3q0.a;
            case 17:
                return "File " + ((u7r) obj).a + " is not a file";
            case 18:
                ((t1s) obj).O(new p1s.a(false));
                return s3q0.a;
            case 19:
                return ((n5u) obj).i;
            case 20:
                return ((View) obj).getContext().getString(R.string.feed_accessibility_search);
            case 21:
                IndeterminateHorizontalProgressDrawable indeterminateHorizontalProgressDrawable = (IndeterminateHorizontalProgressDrawable) obj;
                bpn0 bpn0Var = IndeterminateHorizontalProgressDrawable.AnimatorUtils.a;
                IndeterminateHorizontalProgressDrawable.AnimatorUtils.RectTransformX rectTransformX = indeterminateHorizontalProgressDrawable.d;
                ObjectAnimator a = IndeterminateHorizontalProgressDrawable.AnimatorUtils.a(rectTransformX, "translateX", null, (Path) IndeterminateHorizontalProgressDrawable.AnimatorUtils.c.getValue());
                a.setDuration(2000L);
                a.setInterpolator((Interpolator) IndeterminateHorizontalProgressDrawable.AnimatorUtils.a.getValue());
                a.setRepeatCount(-1);
                ObjectAnimator a2 = IndeterminateHorizontalProgressDrawable.AnimatorUtils.a(rectTransformX, null, "scaleX", (Path) IndeterminateHorizontalProgressDrawable.AnimatorUtils.d.getValue());
                a2.setDuration(2000L);
                a2.setInterpolator((Interpolator) IndeterminateHorizontalProgressDrawable.AnimatorUtils.b.getValue());
                a2.setRepeatCount(-1);
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.playTogether(a, a2);
                IndeterminateHorizontalProgressDrawable.AnimatorUtils.RectTransformX rectTransformX2 = indeterminateHorizontalProgressDrawable.e;
                ObjectAnimator a3 = IndeterminateHorizontalProgressDrawable.AnimatorUtils.a(rectTransformX2, "translateX", null, (Path) IndeterminateHorizontalProgressDrawable.AnimatorUtils.g.getValue());
                a3.setDuration(2000L);
                a3.setInterpolator((Interpolator) IndeterminateHorizontalProgressDrawable.AnimatorUtils.e.getValue());
                a3.setRepeatCount(-1);
                ObjectAnimator a4 = IndeterminateHorizontalProgressDrawable.AnimatorUtils.a(rectTransformX2, null, "scaleX", (Path) IndeterminateHorizontalProgressDrawable.AnimatorUtils.h.getValue());
                a4.setDuration(2000L);
                a4.setInterpolator((Interpolator) IndeterminateHorizontalProgressDrawable.AnimatorUtils.f.getValue());
                a4.setRepeatCount(-1);
                AnimatorSet animatorSet2 = new AnimatorSet();
                animatorSet2.playTogether(a3, a4);
                return new Animator[]{animatorSet, animatorSet2};
            case 22:
                ((c7x) obj).g();
                return s3q0.a;
            case 23:
                return new y2y((r6y) obj);
            case 24:
                com.vk.auth.main.b bVar = ((k3z) obj).d;
                if (bVar == null) {
                    bVar = null;
                }
                b.a.a(bVar, true, false, null, 6);
                return s3q0.a;
            case 25:
                int i6 = MarketEditAlbumFinishedFragment.Q;
                FragmentActivity activity = ((MarketEditAlbumFinishedFragment) obj).getActivity();
                if (activity != null) {
                    activity.onBackPressed();
                }
                return s3q0.a;
            case 26:
                nnp0 nnp0Var = ((pb20) obj).f1;
                return new wb20((nnp0Var == null ? null : nnp0Var).g, (nnp0Var == null ? null : nnp0Var).b, (nnp0Var == null ? null : nnp0Var).c, (nnp0Var != null ? nnp0Var : null).d);
            case 27:
                String str2 = ((qu20) obj).a;
                StringBuilder sb = new StringBuilder();
                int length = str2.length();
                for (int i7 = 0; i7 < length; i7++) {
                    char charAt = str2.charAt(i7);
                    if (Character.isDigit(charAt)) {
                        sb.append(charAt);
                    }
                }
                return sb.toString();
            case 28:
                int i8 = ModalPostCommonFragment.a0;
                return ((CommentsOutherFragment) obj).s;
            default:
                return new isk((up30) obj, i2);
        }
    }
}

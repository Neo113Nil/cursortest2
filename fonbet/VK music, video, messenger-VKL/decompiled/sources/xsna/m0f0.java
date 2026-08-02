package xsna;

import android.animation.AnimatorSet;
import android.animation.ArgbEvaluator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.text.TextPaint;
import android.util.Size;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.serialize.Serializer;
import com.vk.dto.common.Peer;
import com.vk.dto.user.UserSex;
import com.vk.im.engine.models.ProfilesSimpleInfo;
import com.vk.im.engine.models.users.UserNameCase;
import com.vk.im.reactions.api.chips.ReactionChipStyle;
import com.vk.im.ui.views.avatars.StackAvatarView;
import com.vkontakte.android.R;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: ReactionChipView.kt */
/* loaded from: classes2.dex */
public final class m0f0 extends CardView {
    public zaw i;
    public paw j;
    public k0f0 k;
    public ProfilesSimpleInfo l;
    public AnimatorSet m;
    public Size n;
    public boolean o;
    public final StackAvatarView p;
    public final TextView q;
    public final ImageView r;
    public static final bpn0 s = new bpn0(new lg(29));
    public static final bpn0 t = new bpn0(new mg(26));
    public static final bpn0 u = new bpn0(new ob0(26));
    public static final bpn0 v = new bpn0(new vg0(26));
    public static final bpn0 w = new bpn0(new cu1(27));
    public static final bpn0 x = new bpn0(new bu0(28));
    public static final bpn0 y = new bpn0(new kr6(19));
    public static final bpn0 z = new bpn0(new pkd0(2));
    public static final bpn0 A = new bpn0(new nm0(28));

    /* compiled from: ReactionChipView.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ReactionChipStyle.values().length];
            try {
                iArr[ReactionChipStyle.INCOMING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ReactionChipStyle.GRADIENT_BUBBLE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ReactionChipStyle.OUTGOING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ReactionChipStyle.WITHOUT_BUBBLE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public m0f0(Context context) {
        super(context, null, 0);
        LayoutInflater.from(context).inflate(R.layout.vkim_reactions_chip_view, (ViewGroup) this, true);
        setRadius(cn70.c(15));
        setCardElevation(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        setClickable(true);
        setForeground(dhr0.t.d(R.attr.selectableItemBackground));
        this.l = new ProfilesSimpleInfo();
        StackAvatarView stackAvatarView = (StackAvatarView) findViewById(R.id.stack_avatar_view);
        stackAvatarView.setReverseDrawingOrder(false);
        stackAvatarView.setStrokeColor(0);
        this.p = stackAvatarView;
        TextView textView = (TextView) findViewById(R.id.reaction_counter);
        textView.setLayerPaint((TextPaint) s.getValue());
        this.q = textView;
        this.r = (ImageView) findViewById(R.id.reaction_image);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0062  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void setContentDescriprion(k0f0 k0f0Var) {
        UserSex userSex;
        Iterator<T> it;
        String quantityString;
        zaw zawVar = this.i;
        String c = zawVar != null ? zawVar.c(k0f0Var.a, getContext()) : null;
        boolean z2 = k0f0Var.k;
        List<Long> list = k0f0Var.b;
        int i = k0f0Var.c;
        if (z2) {
            quantityString = getContext().getResources().getQuantityString(R.plurals.im_msg_reacted_users_count_content_description, i, Integer.valueOf(i), c);
        } else {
            Resources resources = getContext().getResources();
            Long l = (Long) j5g.k0(list);
            if (l != null) {
                long longValue = l.longValue();
                ProfilesSimpleInfo profilesSimpleInfo = this.l;
                Serializer.c<Peer> cVar = Peer.CREATOR;
                qtd0 zb = profilesSimpleInfo.zb(Peer.a.b(longValue));
                if (zb != null) {
                    userSex = zb.B2();
                    int i2 = userSex != UserSex.FEMALE ? R.plurals.im_msg_reacted_users_content_description_female : R.plurals.im_msg_reacted_users_content_description_male;
                    ProfilesSimpleInfo profilesSimpleInfo2 = this.l;
                    ArrayList arrayList = new ArrayList();
                    it = list.iterator();
                    while (it.hasNext()) {
                        long longValue2 = ((Number) it.next()).longValue();
                        Serializer.c<Peer> cVar2 = Peer.CREATOR;
                        qtd0 zb2 = profilesSimpleInfo2.zb(Peer.a.b(longValue2));
                        String d6 = zb2 != null ? zb2.d6(UserNameCase.NOM) : null;
                        if (d6 != null) {
                            arrayList.add(d6);
                        }
                    }
                    quantityString = resources.getQuantityString(i2, i, j5g.g0(arrayList, StringUtils.COMMA, null, null, 0, null, 62), c);
                }
            }
            userSex = null;
            if (userSex != UserSex.FEMALE) {
            }
            ProfilesSimpleInfo profilesSimpleInfo22 = this.l;
            ArrayList arrayList2 = new ArrayList();
            it = list.iterator();
            while (it.hasNext()) {
            }
            quantityString = resources.getQuantityString(i2, i, j5g.g0(arrayList2, StringUtils.COMMA, null, null, 0, null, 62), c);
        }
        setContentDescription(quantityString);
    }

    public final void d() {
        k0f0 k0f0Var = this.k;
        if (k0f0Var != null) {
            List<Long> list = k0f0Var.b;
            ArrayList arrayList = new ArrayList(c5g.u(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                long longValue = ((Number) it.next()).longValue();
                Serializer.c<Peer> cVar = Peer.CREATOR;
                arrayList.add(Peer.a.b(longValue));
            }
            ProfilesSimpleInfo profilesSimpleInfo = this.l;
            StackAvatarView stackAvatarView = this.p;
            stackAvatarView.getClass();
            stackAvatarView.e(arrayList, arrayList.size(), profilesSimpleInfo);
        }
    }

    public final void e(k0f0 k0f0Var, boolean z2) {
        int Y;
        boolean z3 = k0f0Var.d;
        ReactionChipStyle reactionChipStyle = k0f0Var.e;
        boolean z4 = k0f0Var.k;
        boolean f = epx.f(this.k, k0f0Var);
        ImageView imageView = this.r;
        if (f) {
            paw pawVar = this.j;
            if (pawVar != null) {
                pawVar.b(imageView, k0f0Var);
                return;
            }
            return;
        }
        if (!z4) {
            this.o = true;
        }
        ArrayList arrayList = new ArrayList();
        k0f0 k0f0Var2 = this.k;
        if (k0f0Var2 == null || k0f0Var2.a != k0f0Var.a) {
            arrayList.add(imageView);
        }
        k0f0 k0f0Var3 = this.k;
        TextView textView = this.q;
        if (k0f0Var3 == null || k0f0Var3.c != k0f0Var.c || k0f0Var3.k != z4) {
            arrayList.add(this.p);
            arrayList.add(textView);
        }
        if (z3) {
            int i = a.$EnumSwitchMapping$0[reactionChipStyle.ordinal()];
            if (i != 1) {
                if (i == 2 || i == 3) {
                    Y = -16777216;
                } else if (i != 4) {
                    throw new NoWhenBranchMatchedException();
                }
            }
            Y = -1;
        } else {
            int i2 = a.$EnumSwitchMapping$0[reactionChipStyle.ordinal()];
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 3) {
                        if (i2 != 4) {
                            throw new NoWhenBranchMatchedException();
                        }
                    }
                }
                Y = -1;
            }
            Y = dhr0.Y(R.attr.vk_ui_text_primary, getContext());
        }
        textView.setTextColor(Y);
        setContentDescriprion(k0f0Var);
        this.k = k0f0Var;
        int i3 = k0f0Var.f;
        if (z3) {
            int i4 = a.$EnumSwitchMapping$0[reactionChipStyle.ordinal()];
            if (i4 != 1) {
                if (i4 == 2 || i4 == 3) {
                    i3 = l8g.f(dhr0.a.c(getContext()) ? 0.65f : 0.95f, -1);
                } else {
                    if (i4 != 4) {
                        throw new NoWhenBranchMatchedException();
                    }
                    i3 = l8g.f(0.65f, i3);
                }
            }
        } else {
            int i5 = a.$EnumSwitchMapping$0[reactionChipStyle.ordinal()];
            if (i5 == 1) {
                i3 = l8g.f(0.2f, i3);
            } else if (i5 == 2 || i5 == 3) {
                i3 = l8g.f(!dhr0.a.c(getContext()) ? 0.6f : 0.4f, -1);
            } else {
                if (i5 != 4) {
                    throw new NoWhenBranchMatchedException();
                }
                i3 = l8g.f(0.25f, i3);
            }
        }
        uk ukVar = new uk(18, k0f0Var, this);
        kg kgVar = new kg(23, this, k0f0Var);
        AnimatorSet animatorSet = this.m;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        this.o = false;
        if (!z2) {
            setCardBackgroundColor(i3);
            ukVar.invoke();
            kgVar.invoke();
            return;
        }
        Size size = new Size(getMeasuredWidth(), getMeasuredHeight());
        ValueAnimator ofFloat = ValueAnimator.ofFloat(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f);
        ofFloat.addUpdateListener(new l0f0(arrayList, 0));
        ofFloat.addListener(new n0f0(arrayList));
        ofFloat.addListener(new o0f0(kgVar));
        ValueAnimator ofObject = ValueAnimator.ofObject(new ArgbEvaluator(), Integer.valueOf(getCardBackgroundColor().getDefaultColor()), Integer.valueOf(i3));
        ofObject.addUpdateListener(new pmo(this, 2));
        ukVar.invoke();
        measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
        ValueAnimator ofObject2 = ValueAnimator.ofObject(new sxj0(), size, new Size(getMeasuredWidth(), getMeasuredHeight()));
        ofObject2.addUpdateListener(new i20(this, 2));
        ofObject2.addListener(new q0f0(this));
        ofObject2.addListener(new p0f0(this));
        AnimatorSet animatorSet2 = new AnimatorSet();
        animatorSet2.play(ofObject).with(ofFloat);
        animatorSet2.play(ofFloat).with(ofObject2);
        animatorSet2.setDuration(200L);
        this.m = animatorSet2;
        animatorSet2.start();
    }

    public final void f(boolean z2) {
        ImageView imageView = this.r;
        ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
        if (marginLayoutParams == null) {
            return;
        }
        bpn0 bpn0Var = w;
        if (z2) {
            int intValue = ((Number) bpn0Var.getValue()).intValue() / 2;
            marginLayoutParams.leftMargin = intValue;
            marginLayoutParams.rightMargin = intValue;
        } else {
            marginLayoutParams.leftMargin = ((Number) bpn0Var.getValue()).intValue();
            marginLayoutParams.rightMargin = 0;
        }
        imageView.setLayoutParams(marginLayoutParams);
    }

    public final paw getAnimationCoordinator() {
        return this.j;
    }

    public final zaw getAssetsRepo() {
        return this.i;
    }

    public final k0f0 getCurrentReaction() {
        return this.k;
    }

    @Override // androidx.cardview.widget.CardView, android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        Size size = this.n;
        if (size == null) {
            super.onMeasure(i, i2);
        } else {
            setMeasuredDimension(size.getWidth(), this.n.getHeight());
        }
    }

    public final void setAnimationCoordinator(paw pawVar) {
        this.j = pawVar;
    }

    public final void setAssetsRepo(zaw zawVar) {
        this.i = zawVar;
    }

    public final void setProfilesInfo(ProfilesSimpleInfo profilesSimpleInfo) {
        this.l = profilesSimpleInfo;
        if (!this.o) {
            d();
        }
        k0f0 k0f0Var = this.k;
        if (k0f0Var != null) {
            setContentDescriprion(k0f0Var);
        }
    }
}

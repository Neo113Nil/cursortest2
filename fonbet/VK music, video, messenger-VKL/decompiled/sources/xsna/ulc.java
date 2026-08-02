package xsna;

import android.animation.ArgbEvaluator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.huawei.hms.framework.common.BundleUtil;
import com.vk.api.generated.groups.dto.GroupsFieldsDto;
import com.vk.api.generated.users.dto.UsersFieldsDto;
import com.vk.bridges.di.BridgeComponent;
import com.vk.core.ui.tracking.UiTracker;
import com.vk.dto.actionlinks.ActionLink;
import com.vk.dto.common.id.UserId;
import com.vk.feed.core.models.news.NewsEntry;
import com.vk.newsfeed.common.recycler.holders.clips.ClipActionButtonStateRepository;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.stat.scheme.SchemeStat$EventItem;
import com.vk.stat.scheme.SchemeStat$TypeClick;
import com.vk.stat.scheme.SchemeStat$TypeClipViewerItem;
import com.vkontakte.android.R;
import java.util.Collections;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Pair;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import xsna.ozc;
import xsna.sft0;

/* compiled from: ClipActionButtonFooterHolder.kt */
/* loaded from: classes4.dex */
public final class ulc extends rp6<ozc, NewsEntry> implements View.OnClickListener, View.OnAttachStateChangeListener {
    public final b0d E;
    public final ClipActionButtonStateRepository F;
    public final ConstraintLayout G;
    public final TextView H;
    public final ImageView I;
    public final View J;
    public a K;
    public ValueAnimator L;
    public final int M;
    public final int N;
    public final int O;
    public final int P;
    public final int Q;
    public final int R;
    public final slc S;
    public io.reactivex.rxjava3.disposables.c T;
    public final Object U;
    public final Object V;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: ClipActionButtonFooterHolder.kt */
    public static final class a {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ a[] $VALUES;
        public static final a ACTIVE;
        public static final a DEFAULT;

        static {
            a aVar = new a(SignalingProtocol.STATE_ACTIVE, 0);
            ACTIVE = aVar;
            a aVar2 = new a("DEFAULT", 1);
            DEFAULT = aVar2;
            a[] aVarArr = {aVar, aVar2};
            $VALUES = aVarArr;
            $ENTRIES = new asp(aVarArr);
        }

        public a() {
            throw null;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) $VALUES.clone();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ulc(ViewGroup viewGroup, BridgeComponent bridgeComponent, p20 p20Var, b0d b0dVar, ClipActionButtonStateRepository clipActionButtonStateRepository) {
        super(R.layout.news_clip_action_button_footer, viewGroup);
        viewGroup.getContext();
        this.D = t980.a;
        this.E = b0dVar;
        this.F = clipActionButtonStateRepository;
        this.G = (ConstraintLayout) this.itemView.findViewById(R.id.feed_clip_action_button_footer_container);
        this.H = (TextView) this.itemView.findViewById(R.id.title);
        this.I = (ImageView) this.itemView.findViewById(R.id.chevron);
        this.J = this.itemView.findViewById(R.id.divider);
        this.K = a.DEFAULT;
        abg0 abg0Var = dhr0.t;
        this.M = abg0Var.c(R.attr.vk_ui_background_secondary);
        this.N = abg0Var.c(R.attr.vk_ui_background_content);
        this.O = abg0Var.c(R.attr.vk_ui_text_primary);
        this.P = abg0Var.c(R.attr.vk_ui_icon_secondary);
        this.Q = abg0Var.c(R.attr.vk_ui_text_contrast);
        this.R = abg0Var.c(R.attr.vk_ui_icon_contrast_secondary);
        this.S = new slc(this.itemView.getContext(), bridgeComponent, p20Var);
        uv0 uv0Var = new uv0(6);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.U = msy.a(lazyThreadSafetyMode, uv0Var);
        this.V = msy.a(lazyThreadSafetyMode, new defpackage.h(this, 13));
        this.itemView.addOnAttachStateChangeListener(this);
        this.itemView.setOnClickListener(this);
    }

    @Override // xsna.qi6
    public final void I6() {
        String str;
        super.I6();
        ozc ozcVar = (ozc) this.C;
        if (ozcVar != null && (str = ozcVar.m) != null) {
            this.F.a.remove(str);
        }
        io.reactivex.rxjava3.disposables.c cVar = this.T;
        if (cVar != null) {
            cVar.dispose();
        }
    }

    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v5, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.rp6
    public final void R6(ozc ozcVar) {
        String str;
        ozc ozcVar2 = ozcVar;
        this.K = a.DEFAULT;
        this.F.a.remove(ozcVar2.m);
        Integer num = ozcVar2.k;
        ConstraintLayout constraintLayout = this.G;
        if (num == null) {
            constraintLayout.setBackgroundColor(this.M);
        } else {
            constraintLayout.setBackgroundColor(this.N);
        }
        int i = this.O;
        TextView textView = this.H;
        textView.setTextColor(i);
        this.I.setColorFilter(this.P);
        bwt0.p0(this.J, num != null);
        CharSequence charSequence = ozcVar2.h;
        String str2 = ozcVar2.i;
        if (str2 != null) {
            ?? r4 = this.U;
            ((SpannableStringBuilder) r4.getValue()).clear();
            ((SpannableStringBuilder) r4.getValue()).clearSpans();
            ?? r5 = this.V;
            ((ccr0) r5.getValue()).r(str2);
            SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) r4.getValue();
            ccr0 ccr0Var = (ccr0) r5.getValue();
            this.itemView.getContext();
            Spannable newSpannable = Spannable.Factory.getInstance().newSpannable(" ");
            ccr0Var.mutate();
            ccr0Var.setBounds(0, 0, ccr0Var.m, ccr0Var.n);
            newSpannable.setSpan(new tzx0(ccr0Var, 3, -1.0f, true, 0, 0, 0), 0, 1, 33);
            charSequence = spannableStringBuilder.append((CharSequence) newSpannable).append((CharSequence) rik0.b(8.0f)).append(charSequence);
        }
        textView.setText(charSequence);
        io.reactivex.rxjava3.disposables.c cVar = this.T;
        if (cVar != null) {
            cVar.dispose();
        }
        ozc ozcVar3 = (ozc) this.C;
        if (ozcVar3 == null || (str = ozcVar3.m) == null) {
            return;
        }
        this.T = this.E.a(str).a0(asu0.a.d()).subscribe(new lz(new q60(1, this, ulc.class, "forceUpdateActionButtonState", "forceUpdateActionButtonState(Lcom/vk/clips/sdk/shared/api/external/state/ClipInternalPatch;)V", 0, 4), 10));
    }

    public final void b7(Integer num) {
        String str;
        this.H.setTextColor(num != null ? num.intValue() : this.Q);
        this.I.setColorFilter(this.R);
        bwt0.p0(this.J, false);
        this.K = a.ACTIVE;
        ozc ozcVar = (ozc) this.C;
        if (ozcVar == null || (str = ozcVar.m) == null) {
            return;
        }
        this.F.a.put(str, ClipActionButtonStateRepository.State.ACTIVE);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Long n;
        Integer m;
        ozc ozcVar = (ozc) this.C;
        if (ozcVar == null) {
            return;
        }
        ActionLink actionLink = ozcVar.j;
        ozc.a aVar = ozcVar.n;
        slc slcVar = this.S;
        slcVar.getClass();
        Context context = slcVar.a;
        String str = actionLink.c;
        BridgeComponent bridgeComponent = slcVar.b;
        if (bridgeComponent.x().k0().a(context)) {
            return;
        }
        SchemeStat$TypeClick b = SchemeStat$TypeClick.a.b(new SchemeStat$EventItem(SchemeStat$EventItem.Type.CLIP, Long.valueOf(aVar.a), Long.valueOf(aVar.b), null, aVar.c, null, 40, null), new SchemeStat$TypeClipViewerItem(SchemeStat$TypeClipViewerItem.ScreenType.FEED, SchemeStat$TypeClipViewerItem.EventType.CLICK_TO_ACTION_BUTTON, null, null, null, null, null, null, null, null, new SchemeStat$EventItem(slcVar.c.a(str), Long.valueOf(actionLink.b), null, actionLink.e, actionLink.d, null, 36, null), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 1073740796, null), 2);
        UiTracker uiTracker = UiTracker.a;
        MobileOfficialAppsCoreNavStat$EventScreen c = UiTracker.c();
        uzp0 uzp0Var = UiTracker.h;
        uzp0Var.getClass();
        new bjc(c, b, uzp0Var.a).q();
        if (!epx.f(str, "video")) {
            String str2 = actionLink.e;
            if (drm0.N(fxc0.B().D(str2))) {
                bridgeComponent.p().e().a(context, str2);
                return;
            } else {
                bridgeComponent.p().e().a(context, str2);
                return;
            }
        }
        int i = 6;
        List c0 = drm0.c0(actionLink.d, new String[]{BundleUtil.UNDERLINE_TAG}, 0, 6);
        String str3 = (String) j5g.b0(0, c0);
        if (str3 == null || (n = arm0.n(str3)) == null) {
            return;
        }
        UserId userId = new UserId(n.longValue());
        String str4 = (String) j5g.b0(1, c0);
        if (str4 == null || (m = arm0.m(10, str4)) == null) {
            return;
        }
        Pair pair = new Pair(userId, m);
        UserId userId2 = (UserId) pair.d();
        int intValue = ((Number) pair.g()).intValue();
        io.reactivex.rxjava3.disposables.c cVar = slcVar.d;
        if (cVar != null) {
            cVar.dispose();
        }
        uft0 uft0Var = new uft0();
        List l = e43.l(GroupsFieldsDto.MEMBERS_COUNT.k(), UsersFieldsDto.FOLLOWERS_COUNT.i());
        StringBuilder sb = new StringBuilder();
        sb.append(userId2.b);
        sb.append('_');
        sb.append(intValue);
        slcVar.d = hg1.m(rsg0.y0(yfb.x(sft0.a.b(uft0Var, userId2, Collections.singletonList(sb.toString()), null, null, null, Boolean.TRUE, l, 16774134)), null, null, 3), context, 0L, false, 62).U(new l8(new j60(i), 15)).subscribe(new hz(new mb(slcVar, 24), 14), new jz(new iz(slcVar, 20), 11));
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        ozc ozcVar;
        Integer num;
        ((ccr0) this.V.getValue()).q(this.itemView);
        if (this.K != a.DEFAULT || (ozcVar = (ozc) this.C) == null || (num = ozcVar.k) == null) {
            return;
        }
        int intValue = num.intValue();
        ozc ozcVar2 = (ozc) this.C;
        Integer num2 = ozcVar2 != null ? ozcVar2.l : null;
        ValueAnimator ofObject = ValueAnimator.ofObject(new ArgbEvaluator(), Integer.valueOf(this.N), Integer.valueOf(intValue));
        ofObject.setDuration(300L);
        ofObject.setInterpolator(new LinearInterpolator());
        ofObject.setStartDelay(1500L);
        ofObject.addUpdateListener(new tlc(this, 0));
        ofObject.addListener(new vlc(this, num2));
        ofObject.start();
        this.L = ofObject;
    }

    /* JADX WARN: Type inference failed for: r3v8, types: [java.lang.Object, kotlin.Lazy] */
    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        ValueAnimator valueAnimator = this.L;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
        }
        ValueAnimator valueAnimator2 = this.L;
        if (valueAnimator2 != null) {
            valueAnimator2.removeAllUpdateListeners();
        }
        ValueAnimator valueAnimator3 = this.L;
        if (valueAnimator3 != null) {
            valueAnimator3.cancel();
        }
        this.L = null;
        io.reactivex.rxjava3.disposables.c cVar = this.S.d;
        if (cVar != null) {
            cVar.dispose();
        }
        io.reactivex.rxjava3.disposables.c cVar2 = this.T;
        if (cVar2 != null) {
            cVar2.dispose();
        }
        ccr0 ccr0Var = (ccr0) this.V.getValue();
        this.itemView.removeOnAttachStateChangeListener(ccr0Var.p);
        ccr0Var.t();
    }
}

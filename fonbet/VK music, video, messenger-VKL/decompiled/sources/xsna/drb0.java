package xsna;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.LinearLayoutCompat;
import com.google.android.flexbox.FlexboxLayout;
import com.unity3d.services.UnityAdsConstants;
import com.vk.dto.uxpolls.PollQuestion;
import com.vk.video.polls.entrypoint.model.UxPollType;
import com.vkontakte.android.R;
import kotlin.NoWhenBranchMatchedException;
import kotlin.NotImplementedError;
import xsna.xpe0;
import xsna.xrb0;

/* compiled from: PollRatingStarsView.kt */
/* loaded from: classes6.dex */
public final class drb0 extends LinearLayoutCompat implements ype0, View.OnClickListener {
    public final TextView q;
    public final FlexboxLayout r;
    public izs<? super xrb0, s3q0> s;

    /* compiled from: PollRatingStarsView.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[UxPollType.values().length];
            try {
                iArr[UxPollType.DiscoveryPoll.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[UxPollType.RecommendationsPoll.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public drb0(Context context) {
        super(context, null, 0);
        LayoutInflater.from(context).inflate(R.layout.polls_rating_stars_layout, (ViewGroup) this, true);
        setOrientation(1);
        this.q = (TextView) findViewById(R.id.polls_stars_title);
        this.r = (FlexboxLayout) findViewById(R.id.polls_stars_items);
    }

    @Override // xsna.ype0
    public final void a4(PollQuestion pollQuestion, zpe0 zpe0Var, izs<? super xrb0, s3q0> izsVar) {
        String string;
        UxPollType uxPollType = zpe0Var.b;
        if (!(pollQuestion instanceof PollQuestion.RatingStar)) {
            return;
        }
        this.s = izsVar;
        PollQuestion.RatingStar ratingStar = (PollQuestion.RatingStar) pollQuestion;
        String str = ratingStar.c;
        TextView textView = this.q;
        textView.setText(str);
        if (uxPollType == UxPollType.RecommendationsPoll) {
            f4m.q(iah0.a(20), textView);
        }
        FlexboxLayout flexboxLayout = this.r;
        flexboxLayout.removeAllViews();
        int i = ratingStar.e;
        if (1 > i) {
            return;
        }
        int i2 = 1;
        while (true) {
            srb0 srb0Var = new srb0(getContext());
            srb0Var.setItemId(i2);
            Context context = srb0Var.getContext();
            if (i2 == 1) {
                string = context.getString(R.string.polls_starts_1);
            } else if (i2 == 2) {
                string = context.getString(R.string.polls_starts_2);
            } else if (i2 == 3) {
                string = context.getString(R.string.polls_starts_3);
            } else if (i2 == 4) {
                string = context.getString(R.string.polls_starts_4);
            } else {
                if (i2 != 5) {
                    throw new NotImplementedError(lhg.a(i2, "no star string value for "));
                }
                string = context.getString(R.string.polls_starts_5);
            }
            srb0Var.setContentDescription(string);
            int i3 = a.$EnumSwitchMapping$0[uxPollType.ordinal()];
            if (i3 == 1) {
                srb0Var.setText(string);
                srb0Var.setCompoundDrawablePadding(iah0.a(8));
            } else {
                if (i3 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                srb0Var.setTextSize(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            }
            srb0Var.setTag(Integer.valueOf(ratingStar.b));
            srb0Var.setOnClickListener(this);
            srb0Var.setActive(false);
            flexboxLayout.addView(srb0Var, new LinearLayout.LayoutParams(-2, -2));
            if (i2 == i) {
                return;
            } else {
                i2++;
            }
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        izs<? super xrb0, s3q0> izsVar;
        if (!(view instanceof srb0) || (izsVar = this.s) == null) {
            return;
        }
        srb0 srb0Var = (srb0) view;
        izsVar.invoke(new xrb0.a.d.C4042a(((Integer) srb0Var.getTag()).intValue(), srb0Var.getItemId()));
    }

    @Override // xsna.ype0
    public void setState(xpe0 xpe0Var) {
        if (!(xpe0Var instanceof xpe0.e)) {
            return;
        }
        int i = ((xpe0.e) xpe0Var).a;
        int i2 = 0;
        while (true) {
            FlexboxLayout flexboxLayout = this.r;
            if (!(i2 < flexboxLayout.getChildCount())) {
                return;
            }
            int i3 = i2 + 1;
            View childAt = flexboxLayout.getChildAt(i2);
            if (childAt == null) {
                throw new IndexOutOfBoundsException();
            }
            if (!(childAt instanceof srb0)) {
                return;
            }
            srb0 srb0Var = (srb0) childAt;
            if (srb0Var.getItemId() > i) {
                srb0Var.setActive(false);
            } else {
                srb0Var.setActive(true);
            }
            i2 = i3;
        }
    }

    @Override // xsna.ype0
    public View getUiView() {
        return this;
    }
}

package defpackage;

import android.app.Activity;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.widget.ScrollView;
import android.widget.TextView;
import com.google.android.flexbox.FlexboxLayout;
import com.yandex.bricks.Brick;
import com.yandex.messaging.activity.calls.MessengerCallFeedbackArguments;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;

/* loaded from: classes15.dex */
public final class euq extends Brick {
    public final LinkedHashSet A;
    public final LinkedHashSet B;
    public final ArrayList C;
    public final LinkedHashMap D;
    public final TextView E;
    public v1b F;
    public final Activity a;
    public final wjm b;
    public final ScrollView c;
    public final FlexboxLayout w;
    public final boolean x;
    public final ArrayList y;
    public final ArrayList z;

    public euq(Activity activity, wjm wjmVar, MessengerCallFeedbackArguments messengerCallFeedbackArguments) {
        this.a = activity;
        this.b = wjmVar;
        ScrollView scrollView = (ScrollView) inflate(activity, olh0.msg_b_call_feedback_reasons);
        this.c = scrollView;
        this.w = (FlexboxLayout) scrollView.findViewById(e9h0.container);
        this.x = messengerCallFeedbackArguments.getHadVideo();
        this.y = new ArrayList();
        this.z = new ArrayList();
        this.A = new LinkedHashSet();
        this.B = new LinkedHashSet();
        this.C = new ArrayList();
        this.D = new LinkedHashMap();
        tje.e();
        TextView textView = new TextView(new ContextThemeWrapper(activity, w0i0.Messaging_Calls_FeedbackCommonReason));
        FlexboxLayout.LayoutParams layoutParams = new FlexboxLayout.LayoutParams(-2, -2);
        int i = (int) (6.0f * activity.getResources().getDisplayMetrics().density);
        layoutParams.setMargins(i, i, i, i);
        textView.setLayoutParams(layoutParams);
        textView.setText(activity.getResources().getString(oyh0.call_feedback_more_reasons));
        textView.setSelected(false);
        textView.setOnClickListener(new cmi(23, this));
        this.E = textView;
    }

    @Override // com.yandex.bricks.Brick
    public final View getView() {
        return this.c;
    }

    @Override // com.yandex.bricks.Brick, defpackage.ak6
    public final void onBrickAttach() {
        super.onBrickAttach();
        gym gymVar = new gym(this);
        wjm wjmVar = this.b;
        wjmVar.getClass();
        this.F = new v1b(wjmVar, gymVar);
    }

    @Override // com.yandex.bricks.Brick, defpackage.ak6
    public final void onBrickDetach() {
        super.onBrickDetach();
        v1b v1bVar = this.F;
        if (v1bVar != null) {
            v1bVar.close();
            this.F = null;
        }
    }
}

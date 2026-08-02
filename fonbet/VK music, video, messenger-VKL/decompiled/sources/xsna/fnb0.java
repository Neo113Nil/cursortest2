package xsna;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.widget.LinearLayoutCompat;
import com.google.android.flexbox.FlexboxLayout;
import com.vk.dto.uxpolls.ChipOption;
import com.vk.dto.uxpolls.PollQuestion;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import xsna.xpe0;
import xsna.xrb0;

/* compiled from: PollChipsView.kt */
/* loaded from: classes6.dex */
public final class fnb0 extends LinearLayoutCompat implements View.OnClickListener, ype0 {
    public final TextView q;
    public final FlexboxLayout r;
    public final ArrayList s;
    public izs<? super xrb0, s3q0> t;

    public fnb0(Context context) {
        super(context, null, 0);
        LayoutInflater.from(context).inflate(R.layout.polls_chips_layout, (ViewGroup) this, true);
        setOrientation(1);
        this.q = (TextView) findViewById(R.id.polls_checkbox_title);
        this.r = (FlexboxLayout) findViewById(R.id.polls_checkbox_items);
        this.s = new ArrayList();
    }

    private final void setupItems(Collection<ChipOption> collection) {
        FlexboxLayout flexboxLayout = this.r;
        flexboxLayout.removeAllViews();
        for (ChipOption chipOption : collection) {
            enb0 enb0Var = new enb0(getContext(), null, 0);
            enb0Var.setTextAppearance(R.style.VkUiTypography_FootnoteMedium);
            float f = 12;
            f4m.l(iah0.a(f), iah0.a(f), enb0Var);
            float f2 = 6;
            f4m.B(iah0.a(f2), iah0.a(f2), enb0Var);
            float f3 = 8;
            f4m.u(enb0Var, iah0.a(f3), iah0.a(f3), iah0.a(f3), iah0.a(f3));
            btb0.a(enb0Var);
            enb0Var.setActive(false);
            enb0Var.setItemId(chipOption.b);
            enb0Var.setText(drm0.p0(chipOption.c).toString());
            enb0Var.setOnClickListener(this);
            this.s.add(enb0Var);
            flexboxLayout.addView(enb0Var);
        }
    }

    @Override // xsna.ype0
    public final void a4(PollQuestion pollQuestion, zpe0 zpe0Var, izs<? super xrb0, s3q0> izsVar) {
        if (pollQuestion instanceof PollQuestion.Chips) {
            PollQuestion.Chips chips = (PollQuestion.Chips) pollQuestion;
            setTag(Integer.valueOf(chips.b));
            this.q.setText(chips.c);
            setupItems(chips.e);
            this.t = izsVar;
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        izs<? super xrb0, s3q0> izsVar;
        if (!(view instanceof enb0) || (izsVar = this.t) == null) {
            return;
        }
        izsVar.invoke(new xrb0.a.InterfaceC4038a.C4039a(((Integer) getTag()).intValue(), ((enb0) view).getItemId()));
    }

    @Override // xsna.ype0
    public void setState(xpe0 xpe0Var) {
        if (xpe0Var instanceof xpe0.b) {
            Iterator it = this.s.iterator();
            while (it.hasNext()) {
                enb0 enb0Var = (enb0) it.next();
                enb0Var.setActive(((xpe0.b) xpe0Var).a.contains(Integer.valueOf(enb0Var.getItemId())));
            }
        }
    }

    @Override // xsna.ype0
    public View getUiView() {
        return this;
    }
}

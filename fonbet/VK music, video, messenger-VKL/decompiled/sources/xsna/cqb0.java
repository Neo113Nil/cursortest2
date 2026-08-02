package xsna;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import com.vk.search.params.api.VkPollSearchParams;
import com.vkontakte.android.R;
import java.util.Iterator;
import java.util.List;

/* compiled from: PollFilterParamsView.kt */
/* loaded from: classes17.dex */
public final class cqb0 extends om6<VkPollSearchParams> {
    public final bqz0 k;
    public TextView l;
    public TextView m;
    public TextView n;
    public TextView o;
    public TextView p;
    public TextView q;

    /* compiled from: PollFilterParamsView.kt */
    public static final class a {
        public final VkPollSearchParams a;

        public a(VkPollSearchParams vkPollSearchParams) {
            this.a = vkPollSearchParams;
        }
    }

    public cqb0(bqz0 bqz0Var, VkPollSearchParams vkPollSearchParams, Activity activity) {
        super(vkPollSearchParams, activity);
        this.k = bqz0Var;
        super.f(vkPollSearchParams);
        setGender(vkPollSearchParams.c);
        setAge(vkPollSearchParams.d);
    }

    public static void m(cqb0 cqb0Var) {
        cqb0Var.setGender(1);
    }

    public static void n(cqb0 cqb0Var) {
        cqb0Var.setGender(2);
    }

    public static void o(cqb0 cqb0Var) {
        cqb0Var.setGender(0);
    }

    public static void p(cqb0 cqb0Var) {
        cqb0Var.setAge(2);
    }

    public static void q(cqb0 cqb0Var) {
        cqb0Var.setAge(3);
    }

    public static void r(cqb0 cqb0Var) {
        cqb0Var.setAge(0);
    }

    private final void setAge(int i) {
        TextView textView = this.o;
        if (textView != null) {
            textView.setSelected(i == 0);
        }
        TextView textView2 = this.p;
        if (textView2 != null) {
            textView2.setSelected(i == 2);
        }
        TextView textView3 = this.q;
        if (textView3 != null) {
            textView3.setSelected(i == 3);
        }
        getSearchParams().d = i;
        i();
    }

    private final void setGender(int i) {
        TextView textView = this.l;
        if (textView != null) {
            textView.setSelected(i == 0);
        }
        TextView textView2 = this.m;
        if (textView2 != null) {
            textView2.setSelected(i == 2);
        }
        TextView textView3 = this.n;
        if (textView3 != null) {
            textView3.setSelected(i == 1);
        }
        getSearchParams().c = i;
        i();
    }

    @Override // xsna.om6
    public final Object d() {
        return new a(getSearchParams());
    }

    @Override // xsna.om6
    public final void f(VkPollSearchParams vkPollSearchParams) {
        VkPollSearchParams vkPollSearchParams2 = vkPollSearchParams;
        super.f(vkPollSearchParams2);
        setGender(vkPollSearchParams2.c);
        setAge(vkPollSearchParams2.d);
    }

    @Override // xsna.om6
    public final int g() {
        return R.layout.poll_results_filter_layout_no_country;
    }

    @Override // xsna.om6
    public Bundle getCityListArguments() {
        Object obj;
        Bundle cityListArguments = super.getCityListArguments();
        bqz0 bqz0Var = this.k;
        if (bqz0Var != null) {
            Iterator it = ((List) bqz0Var.b).iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (((hnb0) obj).a == 0) {
                    break;
                }
            }
            hnb0 hnb0Var = (hnb0) obj;
            if (hnb0Var != null) {
                cityListArguments.putParcelableArrayList("static_cities", hnb0Var.b);
            }
        }
        return cityListArguments;
    }

    @Override // xsna.om6
    public final void h(View view) {
        bwt0.Z(R.attr.vk_ui_background_content, this);
        this.l = (TextView) view.findViewById(R.id.poll_filter_gender_any);
        this.m = (TextView) view.findViewById(R.id.poll_filter_gender_man);
        this.n = (TextView) view.findViewById(R.id.poll_filter_gender_female);
        this.o = (TextView) view.findViewById(R.id.poll_filter_age_any);
        this.p = (TextView) view.findViewById(R.id.poll_filter_age_18_plus);
        this.q = (TextView) view.findViewById(R.id.poll_filter_age_36_plus);
        TextView textView = this.l;
        if (textView != null) {
            textView.setOnClickListener(new q01(this, 11));
        }
        TextView textView2 = this.m;
        if (textView2 != null) {
            textView2.setOnClickListener(new wz5(this, 8));
        }
        TextView textView3 = this.n;
        if (textView3 != null) {
            textView3.setOnClickListener(new xz5(this, 10));
        }
        TextView textView4 = this.o;
        if (textView4 != null) {
            textView4.setOnClickListener(new s01(this, 9));
        }
        TextView textView5 = this.p;
        if (textView5 != null) {
            textView5.setOnClickListener(new t01(this, 8));
        }
        TextView textView6 = this.q;
        if (textView6 != null) {
            textView6.setOnClickListener(new u01(this, 12));
        }
    }
}

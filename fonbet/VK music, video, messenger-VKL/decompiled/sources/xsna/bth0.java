package xsna;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.vk.core.view.components.checkbox.VkCheckboxItem;
import com.vk.search.model.VideoSearchFiltersImpl;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.jgr;
import xsna.lgr;

/* compiled from: SearchFiltersModalPageContentView.kt */
@SuppressLint({"ViewConstructor"})
/* loaded from: classes5.dex */
public final class bth0 extends ConstraintLayout implements ner {
    public static final /* synthetic */ int I = 0;
    public final View A;
    public final TextView B;
    public final View C;
    public final TextView D;
    public final View E;
    public final TextView F;
    public final View G;
    public final TextView H;
    public final boolean t;
    public final nuz u;
    public final VideoSearchFiltersImpl v;
    public final int[] w;
    public final int[] x;
    public final VkCheckboxItem y;
    public final VkCheckboxItem z;

    /* compiled from: SearchFiltersModalPageContentView.kt */
    public static final class a extends wx20 {
        public final TextView c;
        public final List<ecr> d;
        public final b e;
        public final izs<Integer, s3q0> f;

        public a(TextView textView, List list, b bVar, izs izsVar) {
            this.c = textView;
            this.d = list;
            this.e = bVar;
            this.f = izsVar;
        }

        @Override // xsna.wx20
        public final List<e520> a() {
            ArrayList arrayList = new ArrayList();
            int i = 0;
            for (Object obj : this.d) {
                int i2 = i + 1;
                if (i < 0) {
                    e43.t();
                    throw null;
                }
                ecr ecrVar = (ecr) obj;
                if (ecrVar.isEnabled()) {
                    arrayList.add(new e520(ecrVar.getIndex(), 0, i, 946, this.c.getContext().getString(ecrVar.a())));
                }
                i = i2;
            }
            return arrayList;
        }

        @Override // xsna.wx20
        public final void f(Context context, e520 e520Var) {
            this.c.setText(e520Var.d);
            this.f.invoke(Integer.valueOf(e520Var.a));
            this.e.invoke();
        }
    }

    /* compiled from: SearchFiltersModalPageContentView.kt */
    public static final /* synthetic */ class b extends FunctionReferenceImpl implements gzs<s3q0> {
        @Override // xsna.gzs
        public final s3q0 invoke() {
            bth0 bth0Var = (bth0) this.receiver;
            int i = bth0.I;
            bth0Var.Q4();
            return s3q0.a;
        }
    }

    public bth0(Activity activity, boolean z, nuz nuzVar) {
        super(activity);
        this.t = z;
        this.u = nuzVar;
        this.v = new VideoSearchFiltersImpl();
        this.w = activity.getResources().getIntArray(R.array.video_duration_sec);
        this.x = activity.getResources().getIntArray(R.array.video_upload_date_sec);
        View inflate = LayoutInflater.from(activity).inflate(R.layout.modal_page_content_search_filters, (ViewGroup) this, true);
        this.B = (TextView) inflate.findViewById(R.id.sort_type_subtitle);
        View findViewById = inflate.findViewById(R.id.sort_type_view);
        this.A = findViewById;
        findViewById.setOnClickListener(new v01(this, 10));
        this.F = (TextView) inflate.findViewById(R.id.length_sort_type_subtitle);
        View findViewById2 = inflate.findViewById(R.id.sort_length_type_view);
        this.E = findViewById2;
        findViewById2.setOnClickListener(new a06(this, 11));
        this.D = (TextView) inflate.findViewById(R.id.sort_type_content_subtitle);
        View findViewById3 = inflate.findViewById(R.id.type_content_view);
        this.C = findViewById3;
        findViewById3.setOnClickListener(new i1(this, 9));
        this.H = (TextView) inflate.findViewById(R.id.date_sort_type_subtitle);
        View findViewById4 = inflate.findViewById(R.id.sort_date_type_view);
        this.G = findViewById4;
        findViewById4.setOnClickListener(new x01(this, 7));
        VkCheckboxItem vkCheckboxItem = (VkCheckboxItem) inflate.findViewById(R.id.filter_high_quality);
        this.y = vkCheckboxItem;
        vkCheckboxItem.setListener(new si60(this, 5));
        VkCheckboxItem vkCheckboxItem2 = (VkCheckboxItem) inflate.findViewById(R.id.filter_authors);
        this.z = vkCheckboxItem2;
        if (z) {
            return;
        }
        vkCheckboxItem2.setVisibility(0);
        vkCheckboxItem2.setListener(new xq70(this, 9));
    }

    public final void P4(TextView textView, List<? extends ecr> list, izs<? super Integer, s3q0> izsVar) {
        wx20.c(new a(textView, list, new b(0, this, bth0.class, "syncFilter", "syncFilter()V", 0), izsVar), getContext(), "SearchFiltersModalPageContentView_TAG", 0, 0, 28);
    }

    public final void Q4() {
        nuz nuzVar = this.u;
        c85 c85Var = nuzVar.e;
        jgr jgrVar = nuzVar.a;
        VideoSearchFiltersImpl videoSearchFiltersImpl = this.v;
        boolean z = false;
        boolean z2 = !videoSearchFiltersImpl.d && !videoSearchFiltersImpl.e && videoSearchFiltersImpl.i == 0 && videoSearchFiltersImpl.g == 2 && videoSearchFiltersImpl.h == 0 && videoSearchFiltersImpl.b == 0;
        c85Var.getClass();
        nuzVar.e = new c85(z2);
        ArrayList arrayList = jgrVar.a;
        arrayList.set(2, new jgr.b(((ecr) arrayList.get(2)).a(), (videoSearchFiltersImpl.i == this.w[2] || videoSearchFiltersImpl.d || this.t) ? false : true));
        ArrayList arrayList2 = jgrVar.a;
        arrayList2.set(3, new jgr.c(((ecr) arrayList2.get(3)).a(), videoSearchFiltersImpl.i == 0));
        boolean z3 = videoSearchFiltersImpl.h != 3;
        this.E.setEnabled(z3);
        this.F.setAlpha(z3 ? 1.0f : 0.64f);
        ArrayList arrayList3 = nuzVar.c.a;
        arrayList3.set(2, new lgr.b(((ecr) arrayList3.get(2)).a(), videoSearchFiltersImpl.h != 2));
        this.z.setEnabled(nuzVar.e.a);
        if (!videoSearchFiltersImpl.f && videoSearchFiltersImpl.h != 2) {
            z = true;
        }
        this.y.setEnabled(z);
    }

    @Override // xsna.ner
    public final void reset() {
        VideoSearchFiltersImpl videoSearchFiltersImpl = this.v;
        videoSearchFiltersImpl.reset();
        z2(videoSearchFiltersImpl);
        Q4();
    }

    @Override // xsna.ner
    public final void z2(set0 set0Var) {
        VideoSearchFiltersImpl videoSearchFiltersImpl = this.v;
        videoSearchFiltersImpl.R(set0Var);
        this.y.setChecked(videoSearchFiltersImpl.d);
        this.z.setChecked(videoSearchFiltersImpl.f);
        this.B.setText((CharSequence) rl3.u0(enj.j(R.array.video_search_sort, getContext())).get(videoSearchFiltersImpl.g));
        this.D.setText((CharSequence) rl3.u0(enj.j(R.array.video_search_content, getContext())).get(videoSearchFiltersImpl.h));
        List u0 = rl3.u0(enj.j(R.array.video_search_date, getContext()));
        int[] iArr = this.x;
        int length = iArr.length;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            int i4 = i3 + 1;
            if (videoSearchFiltersImpl.b == iArr[i2]) {
                this.H.setText((CharSequence) u0.get(i3));
            }
            i2++;
            i3 = i4;
        }
        List u02 = rl3.u0(enj.j(R.array.video_search_duration, getContext()));
        int[] iArr2 = this.w;
        int length2 = iArr2.length;
        int i5 = 0;
        while (i < length2) {
            int i6 = i5 + 1;
            if (videoSearchFiltersImpl.i == iArr2[i]) {
                this.F.setText((CharSequence) u02.get(i5));
            }
            i++;
            i5 = i6;
        }
        Q4();
    }

    @Override // xsna.ner
    public VideoSearchFiltersImpl getActualFilter() {
        return this.v;
    }
}

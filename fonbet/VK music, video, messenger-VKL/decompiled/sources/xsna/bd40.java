package xsna;

import android.view.View;
import android.view.ViewGroup;
import com.vkontakte.android.R;
import kotlin.jvm.internal.Ref$IntRef;

/* compiled from: ViewExt.kt */
/* loaded from: classes16.dex */
public final class bd40 implements gzs<s3q0> {
    public final /* synthetic */ View b;
    public final /* synthetic */ Ref$IntRef c;
    public final /* synthetic */ Ref$IntRef d;
    public final /* synthetic */ View e;
    public final /* synthetic */ ViewGroup f;

    public bd40(ViewGroup viewGroup, Ref$IntRef ref$IntRef, Ref$IntRef ref$IntRef2, View view, ViewGroup viewGroup2) {
        this.b = viewGroup;
        this.c = ref$IntRef;
        this.d = ref$IntRef2;
        this.e = view;
        this.f = viewGroup2;
    }

    @Override // xsna.gzs
    public final s3q0 invoke() {
        View view = this.b;
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        Ref$IntRef ref$IntRef = this.c;
        int i = ref$IntRef.element;
        Ref$IntRef ref$IntRef2 = this.d;
        if (i != measuredWidth || ref$IntRef2.element != measuredHeight) {
            ref$IntRef.element = measuredWidth;
            ref$IntRef2.element = measuredHeight;
            ViewGroup viewGroup = this.f;
            int height = viewGroup.getHeight();
            View view2 = this.e;
            view2.setMinimumHeight(height);
            View findViewById = view2.findViewById(R.id.error_content);
            if (findViewById.getHeight() > viewGroup.getHeight()) {
                f4m.y(e3m.a(R.dimen.catalog_tab_2_layout_height, view2.getContext()) + e3m.a(R.dimen.catalog_music_search_query_height, view2.getContext()), findViewById);
            } else {
                f4m.y(0, findViewById);
            }
        }
        return s3q0.a;
    }
}

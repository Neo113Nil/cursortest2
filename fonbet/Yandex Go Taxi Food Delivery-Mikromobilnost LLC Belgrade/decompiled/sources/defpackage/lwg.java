package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;

/* loaded from: classes4.dex */
public final class lwg extends pjm0 {
    public final acj a;
    public FrameLayout b;
    public FrameLayout c;
    public FrameLayout w;
    public zug x;

    public lwg(acj acjVar) {
        this.a = acjVar;
    }

    @Override // defpackage.pjm0
    public final ViewGroup a(View view) {
        FrameLayout frameLayout = this.c;
        if (frameLayout != null) {
            return frameLayout;
        }
        ny61.g("Required value was null.");
        return null;
    }

    @Override // defpackage.ws11
    public final View onCreateView(ViewGroup viewGroup) {
        FrameLayout frameLayout = new FrameLayout(viewGroup.getContext());
        frameLayout.setId(lch0.flexsdk_debug_scaffold_content_id);
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        this.c = frameLayout;
        FrameLayout frameLayout2 = new FrameLayout(viewGroup.getContext());
        frameLayout2.setId(lch0.flexsdk_debug_scaffold_top_view_id);
        frameLayout2.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
        this.w = frameLayout2;
        LayoutInflater from = LayoutInflater.from(viewGroup.getContext());
        FrameLayout frameLayout3 = this.w;
        View inflate = from.inflate(toh0.debug_scaffold, (ViewGroup) frameLayout3, false);
        frameLayout3.addView(inflate);
        LinearLayout linearLayout = (LinearLayout) inflate;
        int i = lch0.details;
        TextView textView = (TextView) cma1.O(i, inflate);
        if (textView != null) {
            i = lch0.message;
            TextView textView2 = (TextView) cma1.O(i, inflate);
            if (textView2 != null) {
                this.x = new zug(linearLayout, textView, textView2, 1);
                FrameLayout frameLayout4 = new FrameLayout(viewGroup.getContext());
                frameLayout4.setId(lch0.flexsdk_debug_scaffold_container_id);
                this.b = frameLayout4;
                frameLayout4.addView(this.w);
                frameLayout4.addView(this.c);
                return frameLayout4;
            }
        }
        ny61.t("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
        return null;
    }

    @Override // defpackage.ws11
    public final void onDestroyView(View view) {
        this.b = null;
        this.w = null;
        this.c = null;
        this.x = null;
    }

    @Override // defpackage.ws11
    public final void onUpdateState(Object obj) {
        ew2 ew2Var = (ew2) obj;
        this.a.invoke();
        if (Boolean.FALSE.booleanValue()) {
            mjm0 mjm0Var = (mjm0) ew2Var.b;
            kwg kwgVar = mjm0Var instanceof kwg ? (kwg) mjm0Var : null;
            if (kwgVar == null) {
                return;
            }
            zug zugVar = this.x;
            if (zugVar != null) {
                zugVar.d.setText(kwgVar.a);
                zugVar.c.setText(kwgVar.b);
            }
            FrameLayout frameLayout = this.w;
            if (frameLayout != null) {
                FrameLayout frameLayout2 = this.b;
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(frameLayout2 != null ? frameLayout2.getWidth() : 0, 0);
                FrameLayout frameLayout3 = this.b;
                frameLayout.measure(makeMeasureSpec, View.MeasureSpec.makeMeasureSpec(frameLayout3 != null ? frameLayout3.getWidth() : 0, 0));
            }
            FrameLayout frameLayout4 = this.c;
            if (frameLayout4 != null) {
                FrameLayout frameLayout5 = this.w;
                frameLayout4.setPadding(0, frameLayout5 != null ? frameLayout5.getMeasuredHeight() : 0, 0, 0);
            }
        }
    }
}

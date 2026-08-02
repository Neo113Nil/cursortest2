package xsna;

import android.graphics.Rect;
import android.text.Layout;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.appbar.AppBarLayout;

/* compiled from: View.kt */
/* loaded from: classes2.dex */
public final class cyb implements Runnable {
    public final /* synthetic */ View b;
    public final /* synthetic */ com.vk.im.ui.components.chat_profile.a c;
    public final /* synthetic */ String d;

    public cyb(TextView textView, com.vk.im.ui.components.chat_profile.a aVar, String str) {
        this.b = textView;
        this.c = aVar;
        this.d = str;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0099  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        boolean z;
        boolean z2;
        View view;
        TextView textView;
        TextView textView2;
        ConstraintLayout constraintLayout;
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        View view2;
        TextView textView3;
        TextView textView4;
        TextView textView5;
        AppBarLayout appBarLayout;
        int measuredHeight;
        com.vk.im.ui.components.chat_profile.a aVar = this.c;
        TextView textView6 = aVar.m;
        if (textView6 == null) {
            textView6 = null;
        }
        Layout layout = textView6.getLayout();
        if (layout == null) {
            TextView textView7 = aVar.m;
            if (textView7 == null) {
                textView7 = null;
            }
            textView7.onPreDraw();
            TextView textView8 = aVar.m;
            if (textView8 == null) {
                textView8 = null;
            }
            layout = textView8.getLayout();
        }
        boolean z3 = layout.getLineCount() > 1;
        aVar.K = z3;
        if (!z3) {
            TextView textView9 = aVar.x;
            if (textView9 == null) {
                textView9 = null;
            }
            if (textView9.getVisibility() != 0) {
                TextView textView10 = aVar.C;
                if (textView10 == null) {
                    textView10 = null;
                }
                if (textView10.getVisibility() != 0) {
                    z = false;
                    aVar.L = z;
                    z2 = aVar.K;
                    String str = this.d;
                    if (z2) {
                        TextView textView11 = aVar.p;
                        if (textView11 == null) {
                            textView11 = null;
                        }
                        textView11.setText(str);
                        TextView textView12 = aVar.q;
                        if (textView12 == null) {
                            textView12 = null;
                        }
                        f4m.j(textView12);
                    } else {
                        layout.getLineBounds(0, new Rect());
                        String obj = drm0.r0(str.substring(0, layout.getLineEnd(0))).toString();
                        String obj2 = obj.length() > 2 ? drm0.Y(obj, obj.length() - 2, obj.length(), "…").toString() : obj.concat("…");
                        TextView textView13 = aVar.p;
                        if (textView13 == null) {
                            textView13 = null;
                        }
                        textView13.setText(obj2);
                        TextView textView14 = aVar.q;
                        if (textView14 == null) {
                            textView14 = null;
                        }
                        textView14.setText(obj);
                    }
                    int primaryHorizontal = (int) layout.getPrimaryHorizontal(0);
                    view = aVar.w;
                    if (view == null) {
                        view = null;
                    }
                    int i = f4m.b(view).left + primaryHorizontal;
                    textView = aVar.q;
                    if (textView == null) {
                        textView = null;
                    }
                    f4m.s(i, textView);
                    textView2 = aVar.p;
                    if (textView2 == null) {
                        textView2 = null;
                    }
                    f4m.s(i, textView2);
                    constraintLayout = aVar.h;
                    if (constraintLayout == null) {
                        constraintLayout = null;
                    }
                    int top = constraintLayout.getTop();
                    viewGroup = aVar.u;
                    if (viewGroup == null) {
                        viewGroup = null;
                    }
                    int top2 = viewGroup.getTop() + top;
                    viewGroup2 = aVar.t;
                    if (viewGroup2 == null) {
                        viewGroup2 = null;
                    }
                    int top3 = viewGroup2.getTop() + top2;
                    view2 = aVar.w;
                    if (view2 == null) {
                        view2 = null;
                    }
                    int top4 = view2.getTop() + top3;
                    textView3 = aVar.m;
                    if (textView3 == null) {
                        textView3 = null;
                    }
                    int top5 = textView3.getTop() + top4;
                    textView4 = aVar.m;
                    if (textView4 == null) {
                        textView4 = null;
                    }
                    float measuredHeight2 = textView4.getMeasuredHeight();
                    float f = 1 - 0.1764706f;
                    textView5 = aVar.m;
                    if (textView5 == null) {
                        textView5 = null;
                    }
                    int measuredHeight3 = (int) ((measuredHeight2 - (f * textView5.getMeasuredHeight())) / 2);
                    aVar.U = measuredHeight3;
                    int i2 = top5 + measuredHeight3;
                    appBarLayout = aVar.f;
                    if (appBarLayout == null) {
                        appBarLayout = null;
                    }
                    int measuredHeight4 = appBarLayout.getMeasuredHeight();
                    Toolbar toolbar = aVar.e;
                    measuredHeight = measuredHeight4 - (toolbar != null ? toolbar : null).getMeasuredHeight();
                    aVar.P = measuredHeight;
                    float f2 = 1.0f;
                    aVar.Q = measuredHeight != 0 ? 1.0f : i2 / measuredHeight;
                    if (measuredHeight != 0) {
                        f2 = (measuredHeight - (aVar.j != null ? r1.getMeasuredHeight() : 0)) / aVar.P;
                    }
                    aVar.R = f2;
                }
            }
        }
        z = true;
        aVar.L = z;
        z2 = aVar.K;
        String str2 = this.d;
        if (z2) {
        }
        int primaryHorizontal2 = (int) layout.getPrimaryHorizontal(0);
        view = aVar.w;
        if (view == null) {
        }
        int i3 = f4m.b(view).left + primaryHorizontal2;
        textView = aVar.q;
        if (textView == null) {
        }
        f4m.s(i3, textView);
        textView2 = aVar.p;
        if (textView2 == null) {
        }
        f4m.s(i3, textView2);
        constraintLayout = aVar.h;
        if (constraintLayout == null) {
        }
        int top6 = constraintLayout.getTop();
        viewGroup = aVar.u;
        if (viewGroup == null) {
        }
        int top22 = viewGroup.getTop() + top6;
        viewGroup2 = aVar.t;
        if (viewGroup2 == null) {
        }
        int top32 = viewGroup2.getTop() + top22;
        view2 = aVar.w;
        if (view2 == null) {
        }
        int top42 = view2.getTop() + top32;
        textView3 = aVar.m;
        if (textView3 == null) {
        }
        int top52 = textView3.getTop() + top42;
        textView4 = aVar.m;
        if (textView4 == null) {
        }
        float measuredHeight22 = textView4.getMeasuredHeight();
        float f3 = 1 - 0.1764706f;
        textView5 = aVar.m;
        if (textView5 == null) {
        }
        int measuredHeight32 = (int) ((measuredHeight22 - (f3 * textView5.getMeasuredHeight())) / 2);
        aVar.U = measuredHeight32;
        int i22 = top52 + measuredHeight32;
        appBarLayout = aVar.f;
        if (appBarLayout == null) {
        }
        int measuredHeight42 = appBarLayout.getMeasuredHeight();
        Toolbar toolbar2 = aVar.e;
        measuredHeight = measuredHeight42 - (toolbar2 != null ? toolbar2 : null).getMeasuredHeight();
        aVar.P = measuredHeight;
        float f22 = 1.0f;
        aVar.Q = measuredHeight != 0 ? 1.0f : i22 / measuredHeight;
        if (measuredHeight != 0) {
        }
        aVar.R = f22;
    }
}

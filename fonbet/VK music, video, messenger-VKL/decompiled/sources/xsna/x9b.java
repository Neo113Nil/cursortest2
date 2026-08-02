package xsna;

import android.graphics.Rect;
import android.text.Layout;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.appbar.AppBarLayout;
import com.vk.clips.viewer.impl.feed.wrapper.domain.model.ClipsWrapperHeaderMode;
import com.vk.clips.viewer.impl.feed.wrapper.ui.fragment.ClipsWrapperFragment;
import com.vk.core.tool.onboarding.VkOnboarding$TintColor;
import com.vk.core.tool.onboarding.VkTooltip$BalloonPosition;
import com.vk.core.tool.onboarding.VkTooltip$BalloonTilt;
import com.vk.core.tool.onboarding.VkTooltip$MarkerSize;
import com.vk.core.tool.onboarding.VkTooltip$MarkerStyle;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Iterator;
import xsna.m8v0;

/* compiled from: View.kt */
/* loaded from: classes2.dex */
public final class x9b implements Runnable {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ x9b(Object obj, Object obj2, Object obj3, int i) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:101:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x01d9  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x01e3  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x01f4  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01a4  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        boolean z;
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
        int i = this.b;
        Object obj = this.e;
        Object obj2 = this.d;
        switch (i) {
            case 0:
                String str = (String) obj;
                w9b w9bVar = (w9b) obj2;
                TextView textView6 = w9bVar.m;
                if (textView6 == null) {
                    textView6 = null;
                }
                Layout layout = textView6.getLayout();
                if (layout == null) {
                    TextView textView7 = w9bVar.m;
                    if (textView7 == null) {
                        textView7 = null;
                    }
                    textView7.onPreDraw();
                    TextView textView8 = w9bVar.m;
                    if (textView8 == null) {
                        textView8 = null;
                    }
                    layout = textView8.getLayout();
                }
                boolean z2 = layout.getLineCount() > 1;
                w9bVar.J = z2;
                if (!z2) {
                    TextView textView9 = w9bVar.x;
                    if (textView9 == null) {
                        textView9 = null;
                    }
                    if (textView9.getVisibility() != 0) {
                        TextView textView10 = w9bVar.D;
                        if (textView10 == null) {
                            textView10 = null;
                        }
                        if (textView10.getVisibility() != 0) {
                            z = false;
                            w9bVar.K = z;
                            if (w9bVar.J) {
                                TextView textView11 = w9bVar.p;
                                if (textView11 == null) {
                                    textView11 = null;
                                }
                                textView11.setText(str);
                                TextView textView12 = w9bVar.q;
                                if (textView12 == null) {
                                    textView12 = null;
                                }
                                f4m.j(textView12);
                            } else {
                                layout.getLineBounds(0, new Rect());
                                String obj3 = drm0.r0(str.substring(0, layout.getLineEnd(0))).toString();
                                String obj4 = obj3.length() > 2 ? drm0.Y(obj3, obj3.length() - 2, obj3.length(), "…").toString() : obj3.concat("…");
                                TextView textView13 = w9bVar.p;
                                if (textView13 == null) {
                                    textView13 = null;
                                }
                                textView13.setText(obj4);
                                TextView textView14 = w9bVar.q;
                                if (textView14 == null) {
                                    textView14 = null;
                                }
                                textView14.setText(obj3);
                            }
                            int primaryHorizontal = (int) layout.getPrimaryHorizontal(0);
                            view = w9bVar.w;
                            if (view == null) {
                                view = null;
                            }
                            int i2 = f4m.b(view).left + primaryHorizontal;
                            textView = w9bVar.q;
                            if (textView == null) {
                                textView = null;
                            }
                            f4m.s(i2, textView);
                            textView2 = w9bVar.p;
                            if (textView2 == null) {
                                textView2 = null;
                            }
                            f4m.s(i2, textView2);
                            constraintLayout = w9bVar.i;
                            if (constraintLayout == null) {
                                constraintLayout = null;
                            }
                            int top = constraintLayout.getTop();
                            viewGroup = w9bVar.u;
                            if (viewGroup == null) {
                                viewGroup = null;
                            }
                            int top2 = viewGroup.getTop() + top;
                            viewGroup2 = w9bVar.t;
                            if (viewGroup2 == null) {
                                viewGroup2 = null;
                            }
                            int top3 = viewGroup2.getTop() + top2;
                            view2 = w9bVar.w;
                            if (view2 == null) {
                                view2 = null;
                            }
                            int top4 = view2.getTop() + top3;
                            textView3 = w9bVar.m;
                            if (textView3 == null) {
                                textView3 = null;
                            }
                            int top5 = textView3.getTop() + top4;
                            textView4 = w9bVar.m;
                            if (textView4 == null) {
                                textView4 = null;
                            }
                            float measuredHeight = textView4.getMeasuredHeight();
                            float f = 1 - 0.1764706f;
                            textView5 = w9bVar.m;
                            if (textView5 == null) {
                                textView5 = null;
                            }
                            int measuredHeight2 = (int) ((measuredHeight - (f * textView5.getMeasuredHeight())) / 2);
                            w9bVar.R = measuredHeight2;
                            int i3 = top5 + measuredHeight2;
                            appBarLayout = w9bVar.g;
                            if (appBarLayout == null) {
                                appBarLayout = null;
                            }
                            int measuredHeight3 = appBarLayout.getMeasuredHeight();
                            Toolbar toolbar = w9bVar.f;
                            int measuredHeight4 = measuredHeight3 - (toolbar != null ? toolbar : null).getMeasuredHeight();
                            w9bVar.M = measuredHeight4;
                            w9bVar.N = i3 / measuredHeight4;
                            w9bVar.O = (measuredHeight4 - (w9bVar.z != null ? r1.getMeasuredHeight() : 0)) / w9bVar.M;
                            break;
                        }
                    }
                }
                z = true;
                w9bVar.K = z;
                if (w9bVar.J) {
                }
                int primaryHorizontal2 = (int) layout.getPrimaryHorizontal(0);
                view = w9bVar.w;
                if (view == null) {
                }
                int i22 = f4m.b(view).left + primaryHorizontal2;
                textView = w9bVar.q;
                if (textView == null) {
                }
                f4m.s(i22, textView);
                textView2 = w9bVar.p;
                if (textView2 == null) {
                }
                f4m.s(i22, textView2);
                constraintLayout = w9bVar.i;
                if (constraintLayout == null) {
                }
                int top6 = constraintLayout.getTop();
                viewGroup = w9bVar.u;
                if (viewGroup == null) {
                }
                int top22 = viewGroup.getTop() + top6;
                viewGroup2 = w9bVar.t;
                if (viewGroup2 == null) {
                }
                int top32 = viewGroup2.getTop() + top22;
                view2 = w9bVar.w;
                if (view2 == null) {
                }
                int top42 = view2.getTop() + top32;
                textView3 = w9bVar.m;
                if (textView3 == null) {
                }
                int top52 = textView3.getTop() + top42;
                textView4 = w9bVar.m;
                if (textView4 == null) {
                }
                float measuredHeight5 = textView4.getMeasuredHeight();
                float f2 = 1 - 0.1764706f;
                textView5 = w9bVar.m;
                if (textView5 == null) {
                }
                int measuredHeight22 = (int) ((measuredHeight5 - (f2 * textView5.getMeasuredHeight())) / 2);
                w9bVar.R = measuredHeight22;
                int i32 = top52 + measuredHeight22;
                appBarLayout = w9bVar.g;
                if (appBarLayout == null) {
                }
                int measuredHeight32 = appBarLayout.getMeasuredHeight();
                Toolbar toolbar2 = w9bVar.f;
                int measuredHeight42 = measuredHeight32 - (toolbar2 != null ? toolbar2 : null).getMeasuredHeight();
                w9bVar.M = measuredHeight42;
                w9bVar.N = i32 / measuredHeight42;
                w9bVar.O = (measuredHeight42 - (w9bVar.z != null ? r1.getMeasuredHeight() : 0)) / w9bVar.M;
            default:
                if (((ClipsWrapperFragment) this.c).isAdded()) {
                    ife ifeVar = (ife) obj2;
                    otf otfVar = (otf) obj;
                    String string = ifeVar.getContext().getString(R.string.clips_shops_title);
                    LinearLayout linearLayout = ifeVar.d;
                    if (ifeVar.i == ClipsWrapperHeaderMode.TABS) {
                        k9x q = swe0.q(0, linearLayout.getChildCount());
                        ArrayList arrayList = new ArrayList();
                        j9x it = q.iterator();
                        while (it.d) {
                            View childAt = linearLayout.getChildAt(it.nextInt());
                            TextView textView15 = childAt instanceof TextView ? (TextView) childAt : null;
                            if (textView15 != null) {
                                arrayList.add(textView15);
                            }
                        }
                        Iterator it2 = arrayList.iterator();
                        while (true) {
                            if (it2.hasNext()) {
                                Object next = it2.next();
                                if (epx.f(((TextView) next).getText(), string)) {
                                    r3 = next;
                                }
                            }
                        }
                        r3 = r3;
                    }
                    View view3 = r3;
                    if (view3 != null) {
                        int i4 = m8v0.M;
                        m8v0.a.a(view3, otfVar.a, null, VkTooltip$MarkerStyle.Style6, VkTooltip$MarkerSize.Size48, VkOnboarding$TintColor.Lime, VkTooltip$BalloonPosition.BottomLeft, VkTooltip$BalloonTilt.Right, new j9(view3, 26), null, null, null, null, new com.vk.movika.sdk.base.data.a(otfVar, 27), null, 0, false, null, null, false, null, false, 16702980);
                        break;
                    }
                }
                break;
        }
    }
}

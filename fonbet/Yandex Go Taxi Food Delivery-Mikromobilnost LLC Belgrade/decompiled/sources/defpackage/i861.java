package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.ViewSwitcher;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.ybsdk.widgets.common.LoadableInput;
import com.ybsdk.widgets.common.ToolbarView;
import com.ybsdk.widgets.common.YbButtonView;

/* loaded from: classes2.dex */
public final class i861 implements zo31 {
    public final ConstraintLayout a;
    public final YbButtonView b;
    public final YbButtonView c;
    public final ViewSwitcher d;
    public final SeekBar e;
    public final TextView f;
    public final ToolbarView g;

    public i861(ConstraintLayout constraintLayout, YbButtonView ybButtonView, YbButtonView ybButtonView2, ViewSwitcher viewSwitcher, SeekBar seekBar, TextView textView, ToolbarView toolbarView) {
        this.a = constraintLayout;
        this.b = ybButtonView;
        this.c = ybButtonView2;
        this.d = viewSwitcher;
        this.e = seekBar;
        this.f = textView;
        this.g = toolbarView;
    }

    public static i861 p(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View inflate = layoutInflater.inflate(qmh0.ybsdk_screen_upgrade_edit, viewGroup, false);
        int i = jah0.buttonBack;
        YbButtonView ybButtonView = (YbButtonView) cma1.O(i, inflate);
        if (ybButtonView != null) {
            i = jah0.buttonNext;
            YbButtonView ybButtonView2 = (YbButtonView) cma1.O(i, inflate);
            if (ybButtonView2 != null) {
                i = jah0.input;
                if (((LoadableInput) cma1.O(i, inflate)) != null) {
                    i = jah0.input;
                    if (((LoadableInput) cma1.O(i, inflate)) != null) {
                        i = jah0.input_switcher;
                        ViewSwitcher viewSwitcher = (ViewSwitcher) cma1.O(i, inflate);
                        if (viewSwitcher != null) {
                            i = jah0.linear1;
                            if (((LinearLayout) cma1.O(i, inflate)) != null) {
                                i = jah0.linear2;
                                if (((LinearLayout) cma1.O(i, inflate)) != null) {
                                    i = jah0.progressBar;
                                    SeekBar seekBar = (SeekBar) cma1.O(i, inflate);
                                    if (seekBar != null) {
                                        i = jah0.progressLabel;
                                        TextView textView = (TextView) cma1.O(i, inflate);
                                        if (textView != null) {
                                            i = jah0.suggests;
                                            if (((RecyclerView) cma1.O(i, inflate)) != null) {
                                                i = jah0.suggests;
                                                if (((RecyclerView) cma1.O(i, inflate)) != null) {
                                                    i = jah0.toolbar;
                                                    ToolbarView toolbarView = (ToolbarView) cma1.O(i, inflate);
                                                    if (toolbarView != null) {
                                                        return new i861((ConstraintLayout) inflate, ybButtonView, ybButtonView2, viewSwitcher, seekBar, textView, toolbarView);
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        ny61.t("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
        return null;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }

    public final ConstraintLayout o() {
        return this.a;
    }
}

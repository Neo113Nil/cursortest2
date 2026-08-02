package me.grishka.appkit.fragments;

import android.app.ActionBar;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.FrameLayout;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.FragmentActivity;
import com.google.android.material.appbar.AppBarLayout;
import com.vk.core.fragments.FragmentImpl;
import com.vk.core.view.components.topbar.VkTopBar;
import com.vkontakte.android.R;
import java.lang.reflect.Field;
import java.util.HashSet;
import java.util.WeakHashMap;
import xsna.abg0;
import xsna.b0u0;
import xsna.dhr0;
import xsna.dsm0;
import xsna.e1z;
import xsna.eut0;
import xsna.ey50;
import xsna.fnj;
import xsna.gz80;
import xsna.h3p0;
import xsna.iah0;
import xsna.iut0;
import xsna.j6r0;
import xsna.u1u0;
import xsna.ww50;
import xsna.x53;
import xsna.xdr0;
import xsna.y01;

/* loaded from: classes11.dex */
public class AppKitFragment extends FragmentImpl implements e1z {
    public static final /* synthetic */ int Y = 0;
    public boolean N;
    public CharSequence O;
    public String P;
    public Toolbar Q;
    public FrameLayout R;
    public boolean S;
    public Spinner T;
    public int V;
    public int W;
    public boolean U = false;
    public int X = R.layout.appkit_spinner_view;

    /* loaded from: classes8.dex */
    public class a implements Toolbar.h {
        public a() {
        }

        @Override // androidx.appcompat.widget.Toolbar.h
        public final boolean onMenuItemClick(MenuItem menuItem) {
            return AppKitFragment.this.onOptionsItemSelected(menuItem);
        }
    }

    /* loaded from: classes8.dex */
    public class b extends ArrayAdapter {
        @Override // android.widget.ArrayAdapter, android.widget.BaseAdapter, android.widget.SpinnerAdapter
        public final View getDropDownView(int i, View view, ViewGroup viewGroup) {
            View dropDownView = super.getDropDownView(i, view, viewGroup);
            if (view == null) {
                abg0 abg0Var = dhr0.t;
                ((TextView) dropDownView).setTextColor(new ColorStateList(new int[][]{new int[]{android.R.attr.state_checked}, new int[0]}, new int[]{abg0Var.c(R.attr.vk_ui_text_accent), abg0Var.c(R.attr.vk_ui_text_primary)}));
            }
            return dropDownView;
        }
    }

    public boolean Ci() {
        return h3p0.a(this);
    }

    public boolean ea() {
        return false;
    }

    public final void eo() {
        try {
            this.Q.getMenu().clear();
            if (this.S) {
                onCreateOptionsMenu(this.Q.getMenu(), getActivity().getMenuInflater());
            }
        } catch (Throwable unused) {
            Log.e("AppKit", "error invalidateToolbarMenu");
        }
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    /* renamed from: getContext */
    public Context mo2getContext() {
        return getActivity();
    }

    public void go() {
        h3p0.b(this);
    }

    @NonNull
    public final Toolbar ho() {
        Toolbar toolbar = this.Q;
        if (toolbar != null) {
            return toolbar;
        }
        throw new NullPointerException("Toolbar not found or fragment view is not created");
    }

    public final void invalidateOptionsMenu() {
        if (this.Q != null) {
            eo();
        } else if (getActivity() != null) {
            getActivity().invalidateOptionsMenu();
        }
    }

    public final void io(ArrayAdapter arrayAdapter) {
        if (arrayAdapter == null) {
            Spinner spinner = this.T;
            if (spinner != null) {
                this.Q.removeView(spinner);
                this.T = null;
                return;
            }
            return;
        }
        if (this.T == null) {
            Spinner spinner2 = (Spinner) getActivity().getLayoutInflater().inflate(R.layout.appkit_navigation_spinner, (ViewGroup) null);
            this.T = spinner2;
            spinner2.setOnItemSelectedListener(new x53(this));
            this.T.setPopupBackgroundDrawable(new ColorDrawable(dhr0.t.c(R.attr.vk_ui_background_modal)));
            this.Q.addView(this.T, new Toolbar.g(-1));
            this.Q.setTitle((CharSequence) null);
            this.Q.setSubtitle((CharSequence) null);
        }
        this.T.setAdapter((SpinnerAdapter) arrayAdapter);
    }

    public final void jo(@NonNull VkTopBar vkTopBar) {
        if (this.R != null) {
            Toolbar toolbar = this.Q;
            if (toolbar != null) {
                toolbar.setVisibility(8);
            }
            this.R.setVisibility(0);
            this.R.addView(vkTopBar);
        }
    }

    public final void ko(Configuration configuration) {
        this.V = configuration.screenWidthDp;
        this.W = configuration.screenHeightDp;
        FragmentActivity activity = getActivity();
        HashSet hashSet = iah0.a;
        this.U = fnj.d(activity);
    }

    @Override // com.vk.core.fragments.FragmentImpl, xsna.fy50
    public final void lf() {
        mo();
    }

    public final void lo() {
        TextView textView;
        Toolbar toolbar = this.Q;
        if (toolbar == null) {
            return;
        }
        TextView textView2 = null;
        try {
            Field declaredField = toolbar.getClass().getDeclaredField("mTitleTextView");
            declaredField.setAccessible(true);
            textView = (TextView) declaredField.get(this.Q);
            try {
                Field declaredField2 = this.Q.getClass().getDeclaredField("mSubtitleTextView");
                declaredField2.setAccessible(true);
                textView2 = (TextView) declaredField2.get(this.Q);
            } catch (Exception unused) {
            }
        } catch (Exception unused2) {
            textView = null;
        }
        if (textView != null) {
            textView.setFadingEdgeLength(j6r0.b());
            textView.setHorizontalFadingEdgeEnabled(true);
            textView.setMarqueeRepeatLimit(2);
            textView.setEllipsize(TextUtils.TruncateAt.MARQUEE);
            if (gz80.a(28)) {
                textView.setScreenReaderFocusable(true);
            }
        }
        if (textView2 != null) {
            textView2.setFadingEdgeLength(j6r0.b());
            textView2.setHorizontalFadingEdgeEnabled(true);
            textView2.setMarqueeRepeatLimit(2);
            textView2.setEllipsize(TextUtils.TruncateAt.MARQUEE);
            textView2.setTextColor(-1);
            textView2.setAlpha(0.6f);
            if (gz80.a(28)) {
                textView2.setScreenReaderFocusable(true);
            }
        }
    }

    public final void mo() {
        if (this.Q != null) {
            LayoutInflater.Factory activity = getActivity();
            if (activity instanceof ey50) {
                ww50<?> Y2 = ((ey50) activity).Y();
                if (Y2 instanceof xdr0) {
                    ((xdr0) Y2).p0(this, this.Q);
                    return;
                }
                return;
            }
            if (Ci()) {
                u1u0.j(this.Q, R.drawable.vk_icon_arrow_left_outline_28);
            } else if (ea()) {
                u1u0.j(this.Q, R.drawable.vk_icon_deprecated_ic_ab_menu);
            }
        }
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        super.onAttach(context);
        ko(getResources().getConfiguration());
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        ko(configuration);
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.T = null;
        this.Q = null;
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.Q = (Toolbar) view.findViewById(R.id.toolbar);
        this.R = (FrameLayout) view.findViewById(R.id.topBarWrapper);
        if (this.Q != null && getArguments() != null && getArguments().getBoolean("__is_tab")) {
            View view2 = this.Q;
            if (view2.getParent() instanceof AppBarLayout) {
                view2 = (View) view2.getParent();
            }
            ((ViewGroup) view2.getParent()).removeView(view2);
            this.Q = null;
        }
        this.N = true;
        Toolbar toolbar = this.Q;
        if (toolbar != null) {
            CharSequence charSequence = this.O;
            if (charSequence != null) {
                toolbar.setTitle(charSequence);
            }
            String str = this.P;
            if (str != null) {
                this.Q.setSubtitle(str);
            }
            if (this.S) {
                eo();
                this.Q.setOnMenuItemClickListener(new a());
            }
            mo();
            this.Q.setNavigationOnClickListener(new y01(this, 1));
            this.Q.setImportantForAccessibility(1);
        } else {
            ActionBar actionBar = getActivity().getActionBar();
            if (actionBar != null && (getArguments() == null || !getArguments().getBoolean("_dialog"))) {
                if (this.O != null) {
                    if (actionBar.getNavigationMode() != 0) {
                        actionBar.setListNavigationCallbacks(dsm0.a(), null);
                        actionBar.setDisplayShowTitleEnabled(true);
                    }
                    actionBar.setNavigationMode(0);
                }
                String str2 = this.P;
                if (str2 != null) {
                    actionBar.setSubtitle(str2);
                }
            }
        }
        lo();
    }

    @Override // androidx.fragment.app.Fragment
    public final void setHasOptionsMenu(boolean z) {
        super.setHasOptionsMenu(z);
        this.S = z;
        invalidateOptionsMenu();
    }

    public final void setTitle(CharSequence charSequence) {
        this.O = charSequence;
        if (this.T != null) {
            return;
        }
        Toolbar toolbar = this.Q;
        if (toolbar == null) {
            if (this.N) {
                if (getArguments() == null || !getArguments().getBoolean("_dialog")) {
                    getActivity().setTitle(charSequence);
                    return;
                }
                return;
            }
            return;
        }
        toolbar.setTitle(charSequence);
        for (int i = 0; i < this.Q.getChildCount(); i++) {
            View childAt = this.Q.getChildAt(i);
            if ((childAt instanceof TextView) && ((TextView) childAt).getText().equals(charSequence)) {
                childAt.setContentDescription(charSequence);
                childAt.setImportantForAccessibility(1);
                WeakHashMap<View, b0u0> weakHashMap = iut0.a;
                new eut0().d(childAt, Boolean.TRUE);
            }
        }
        lo();
    }

    public final void setTitle(int i) {
        setTitle(getString(i));
    }

    public void fo(int i) {
    }
}

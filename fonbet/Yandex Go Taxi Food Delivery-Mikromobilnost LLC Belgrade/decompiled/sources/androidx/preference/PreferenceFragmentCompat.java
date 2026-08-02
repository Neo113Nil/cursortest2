package androidx.preference;

import android.R;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import defpackage.ame0;
import defpackage.cme0;
import defpackage.dme0;
import defpackage.e2i0;
import defpackage.eme0;
import defpackage.fme0;
import defpackage.fog0;
import defpackage.ime0;
import defpackage.kbs;
import defpackage.mbh0;
import defpackage.n2i0;
import defpackage.nuh0;
import defpackage.ny61;
import defpackage.oyr;
import defpackage.rej;
import defpackage.vg10;
import defpackage.wle0;

/* loaded from: classes10.dex */
public abstract class PreferenceFragmentCompat extends Fragment implements eme0, cme0, dme0, rej {
    public static final String ARG_PREFERENCE_ROOT = "androidx.preference.PreferenceFragmentCompat.PREFERENCE_ROOT";
    private static final String DIALOG_FRAGMENT_TAG = "androidx.preference.PreferenceFragment.DIALOG";
    private static final int MSG_BIND_PREFERENCES = 1;
    private static final String PREFERENCES_TAG = "android:preferences";
    private static final String TAG = "PreferenceFragment";
    private boolean mHavePrefs;
    private boolean mInitDone;
    RecyclerView mList;
    private fme0 mPreferenceManager;
    private Runnable mSelectPreferenceRunnable;
    private final wle0 mDividerDecoration = new wle0(this);
    private int mLayoutResId = nuh0.preference_list_fragment;
    private final Handler mHandler = new Handler(Looper.getMainLooper()) { // from class: androidx.preference.PreferenceFragmentCompat.1
        @Override // android.os.Handler
        public void handleMessage(Message message) {
            if (message.what != 1) {
                return;
            }
            PreferenceFragmentCompat.this.bindPreferences();
        }
    };
    private final Runnable mRequestFocus = new a(1, this);

    private void postBindPreferences() {
        if (this.mHandler.hasMessages(1)) {
            return;
        }
        this.mHandler.obtainMessage(1).sendToTarget();
    }

    private void requirePreferenceManager() {
        if (this.mPreferenceManager != null) {
            return;
        }
        kbs.g("This should be called after super.onCreate.");
    }

    private void scrollToPreferenceInternal(Preference preference, String str) {
        c cVar = new c(this, preference, str);
        if (this.mList == null) {
            this.mSelectPreferenceRunnable = cVar;
        } else {
            cVar.run();
        }
    }

    private void unbindPreferences() {
        getListView().setAdapter(null);
        PreferenceScreen preferenceScreen = getPreferenceScreen();
        if (preferenceScreen != null) {
            preferenceScreen.o();
        }
        onUnbindPreferences();
    }

    public void addPreferencesFromResource(int i) {
        requirePreferenceManager();
        setPreferenceScreen(this.mPreferenceManager.e(requireContext(), i, getPreferenceScreen()));
    }

    public void bindPreferences() {
        PreferenceScreen preferenceScreen = getPreferenceScreen();
        if (preferenceScreen != null) {
            getListView().setAdapter(onCreateAdapter(preferenceScreen));
            preferenceScreen.k();
        }
        onBindPreferences();
    }

    @Override // defpackage.rej
    public <T extends Preference> T findPreference(CharSequence charSequence) {
        PreferenceScreen preferenceScreen;
        fme0 fme0Var = this.mPreferenceManager;
        if (fme0Var == null || (preferenceScreen = fme0Var.g) == null) {
            return null;
        }
        return (T) preferenceScreen.A(charSequence);
    }

    public Fragment getCallbackFragment() {
        return null;
    }

    public final RecyclerView getListView() {
        return this.mList;
    }

    public fme0 getPreferenceManager() {
        return this.mPreferenceManager;
    }

    public PreferenceScreen getPreferenceScreen() {
        return this.mPreferenceManager.g;
    }

    public void onBindPreferences() {
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        TypedValue typedValue = new TypedValue();
        requireContext().getTheme().resolveAttribute(fog0.preferenceTheme, typedValue, true);
        int i = typedValue.resourceId;
        if (i == 0) {
            i = e2i0.PreferenceThemeOverlay;
        }
        requireContext().getTheme().applyStyle(i, false);
        fme0 fme0Var = new fme0(requireContext());
        this.mPreferenceManager = fme0Var;
        fme0Var.j = this;
        onCreatePreferences(bundle, getArguments() != null ? getArguments().getString("androidx.preference.PreferenceFragmentCompat.PREFERENCE_ROOT") : null);
    }

    public RecyclerView.Adapter onCreateAdapter(PreferenceScreen preferenceScreen) {
        return new ame0(preferenceScreen);
    }

    public RecyclerView.e onCreateLayoutManager() {
        return new LinearLayoutManager(requireContext());
    }

    public abstract void onCreatePreferences(Bundle bundle, String str);

    public RecyclerView onCreateRecyclerView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        RecyclerView recyclerView;
        if (requireContext().getPackageManager().hasSystemFeature("android.hardware.type.automotive") && (recyclerView = (RecyclerView) viewGroup.findViewById(mbh0.recycler_view)) != null) {
            return recyclerView;
        }
        RecyclerView recyclerView2 = (RecyclerView) layoutInflater.inflate(nuh0.preference_recyclerview, viewGroup, false);
        recyclerView2.setLayoutManager(onCreateLayoutManager());
        recyclerView2.setAccessibilityDelegateCompat(new ime0(recyclerView2));
        return recyclerView2;
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        TypedArray obtainStyledAttributes = requireContext().obtainStyledAttributes(null, n2i0.PreferenceFragmentCompat, fog0.preferenceFragmentCompatStyle, 0);
        this.mLayoutResId = obtainStyledAttributes.getResourceId(n2i0.PreferenceFragmentCompat_android_layout, this.mLayoutResId);
        Drawable drawable = obtainStyledAttributes.getDrawable(n2i0.PreferenceFragmentCompat_android_divider);
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(n2i0.PreferenceFragmentCompat_android_dividerHeight, -1);
        boolean z = obtainStyledAttributes.getBoolean(n2i0.PreferenceFragmentCompat_allowDividerAfterLastItem, true);
        obtainStyledAttributes.recycle();
        LayoutInflater cloneInContext = layoutInflater.cloneInContext(requireContext());
        View inflate = cloneInContext.inflate(this.mLayoutResId, viewGroup, false);
        View findViewById = inflate.findViewById(R.id.list_container);
        if (!(findViewById instanceof ViewGroup)) {
            ny61.r("Content has view with id attribute 'android.R.id.list_container' that is not a ViewGroup class");
            return null;
        }
        ViewGroup viewGroup2 = (ViewGroup) findViewById;
        RecyclerView onCreateRecyclerView = onCreateRecyclerView(cloneInContext, viewGroup2, bundle);
        if (onCreateRecyclerView == null) {
            kbs.g("Could not create RecyclerView");
            return null;
        }
        this.mList = onCreateRecyclerView;
        onCreateRecyclerView.addItemDecoration(this.mDividerDecoration);
        setDivider(drawable);
        if (dimensionPixelSize != -1) {
            setDividerHeight(dimensionPixelSize);
        }
        this.mDividerDecoration.c = z;
        if (this.mList.getParent() == null) {
            viewGroup2.addView(this.mList);
        }
        this.mHandler.post(this.mRequestFocus);
        return inflate;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        this.mHandler.removeCallbacks(this.mRequestFocus);
        this.mHandler.removeMessages(1);
        if (this.mHavePrefs) {
            unbindPreferences();
        }
        this.mList = null;
        super.onDestroyView();
    }

    @Override // defpackage.cme0
    public void onDisplayPreferenceDialog(Preference preference) {
        DialogFragment newInstance;
        getCallbackFragment();
        for (Fragment fragment = this; fragment != null; fragment = fragment.getParentFragment()) {
        }
        getContext();
        getActivity();
        if (getParentFragmentManager().F(DIALOG_FRAGMENT_TAG) != null) {
            return;
        }
        if (preference instanceof EditTextPreference) {
            newInstance = EditTextPreferenceDialogFragmentCompat.newInstance(preference.D);
        } else if (preference instanceof ListPreference) {
            newInstance = ListPreferenceDialogFragmentCompat.newInstance(preference.D);
        } else {
            if (!(preference instanceof MultiSelectListPreference)) {
                vg10.i("Cannot display dialog for an unknown Preference type: ", preference.getClass().getSimpleName(), ". Make sure to implement onPreferenceDisplayDialog() to handle displaying a custom dialog for this Preference.");
                return;
            }
            newInstance = MultiSelectListPreferenceDialogFragmentCompat.newInstance(preference.D);
        }
        newInstance.setTargetFragment(this, 0);
        newInstance.show(getParentFragmentManager(), DIALOG_FRAGMENT_TAG);
    }

    @Override // defpackage.dme0
    public void onNavigateToScreen(PreferenceScreen preferenceScreen) {
        getCallbackFragment();
        for (Fragment fragment = this; fragment != null; fragment = fragment.getParentFragment()) {
        }
        getContext();
        getActivity();
    }

    @Override // defpackage.eme0
    public boolean onPreferenceTreeClick(Preference preference) {
        if (preference.F == null) {
            return false;
        }
        boolean onPreferenceStartFragment = getCallbackFragment() instanceof PreferenceHeaderFragmentCompat ? ((PreferenceHeaderFragmentCompat) getCallbackFragment()).onPreferenceStartFragment(this, preference) : false;
        for (Fragment fragment = this; !onPreferenceStartFragment && fragment != null; fragment = fragment.getParentFragment()) {
            if (fragment instanceof PreferenceHeaderFragmentCompat) {
                onPreferenceStartFragment = ((PreferenceHeaderFragmentCompat) fragment).onPreferenceStartFragment(this, preference);
            }
        }
        if (!onPreferenceStartFragment) {
            getContext();
        }
        if (!onPreferenceStartFragment) {
            getActivity();
        }
        if (onPreferenceStartFragment) {
            return true;
        }
        FragmentManager parentFragmentManager = getParentFragmentManager();
        Bundle d = preference.d();
        Fragment a = parentFragmentManager.M().a(requireActivity().getClassLoader(), preference.F);
        a.setArguments(d);
        a.setTargetFragment(this, 0);
        androidx.fragment.app.a aVar = new androidx.fragment.app.a(parentFragmentManager);
        aVar.h(((View) requireView().getParent()).getId(), a, null);
        aVar.c(null);
        aVar.d();
        return true;
    }

    @Override // androidx.fragment.app.Fragment
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        PreferenceScreen preferenceScreen = getPreferenceScreen();
        if (preferenceScreen != null) {
            Bundle bundle2 = new Bundle();
            preferenceScreen.c(bundle2);
            bundle.putBundle(PREFERENCES_TAG, bundle2);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        fme0 fme0Var = this.mPreferenceManager;
        fme0Var.h = this;
        fme0Var.i = this;
    }

    @Override // androidx.fragment.app.Fragment
    public void onStop() {
        super.onStop();
        fme0 fme0Var = this.mPreferenceManager;
        fme0Var.h = null;
        fme0Var.i = null;
    }

    public void onUnbindPreferences() {
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        Bundle bundle2;
        PreferenceScreen preferenceScreen;
        super.onViewCreated(view, bundle);
        if (bundle != null && (bundle2 = bundle.getBundle(PREFERENCES_TAG)) != null && (preferenceScreen = getPreferenceScreen()) != null) {
            preferenceScreen.b(bundle2);
        }
        if (this.mHavePrefs) {
            bindPreferences();
            Runnable runnable = this.mSelectPreferenceRunnable;
            if (runnable != null) {
                runnable.run();
                this.mSelectPreferenceRunnable = null;
            }
        }
        this.mInitDone = true;
    }

    public void scrollToPreference(String str) {
        scrollToPreferenceInternal(null, str);
    }

    public void setDivider(Drawable drawable) {
        wle0 wle0Var = this.mDividerDecoration;
        if (drawable != null) {
            wle0Var.getClass();
            wle0Var.b = drawable.getIntrinsicHeight();
        } else {
            wle0Var.b = 0;
        }
        wle0Var.a = drawable;
        wle0Var.w.mList.invalidateItemDecorations();
    }

    public void setDividerHeight(int i) {
        wle0 wle0Var = this.mDividerDecoration;
        wle0Var.b = i;
        wle0Var.w.mList.invalidateItemDecorations();
    }

    public void setPreferenceScreen(PreferenceScreen preferenceScreen) {
        fme0 fme0Var = this.mPreferenceManager;
        PreferenceScreen preferenceScreen2 = fme0Var.g;
        if (preferenceScreen != preferenceScreen2) {
            if (preferenceScreen2 != null) {
                preferenceScreen2.o();
            }
            fme0Var.g = preferenceScreen;
            if (preferenceScreen != null) {
                onUnbindPreferences();
                this.mHavePrefs = true;
                if (this.mInitDone) {
                    postBindPreferences();
                }
            }
        }
    }

    public void setPreferencesFromResource(int i, String str) {
        requirePreferenceManager();
        PreferenceScreen e = this.mPreferenceManager.e(requireContext(), i, null);
        PreferenceScreen preferenceScreen = e;
        if (str != null) {
            Preference A = e.A(str);
            boolean z = A instanceof PreferenceScreen;
            preferenceScreen = A;
            if (!z) {
                ny61.g(oyr.p("Preference object with key ", str, " is not a PreferenceScreen"));
                return;
            }
        }
        setPreferenceScreen(preferenceScreen);
    }

    public void scrollToPreference(Preference preference) {
        scrollToPreferenceInternal(preference, null);
    }
}

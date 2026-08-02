package androidx.preference;

import android.R;
import android.app.DialogFragment;
import android.app.Fragment;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
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
import defpackage.ule0;
import defpackage.uvb1;

@Deprecated
/* loaded from: classes10.dex */
public abstract class PreferenceFragment extends Fragment implements eme0, cme0, dme0, rej {

    @Deprecated
    public static final String ARG_PREFERENCE_ROOT = "androidx.preference.PreferenceFragmentCompat.PREFERENCE_ROOT";
    private static final String DIALOG_FRAGMENT_TAG = "androidx.preference.PreferenceFragment.DIALOG";
    private static final int MSG_BIND_PREFERENCES = 1;
    private static final String PREFERENCES_TAG = "android:preferences";
    private boolean mHavePrefs;
    private boolean mInitDone;
    RecyclerView mList;
    private fme0 mPreferenceManager;
    private Runnable mSelectPreferenceRunnable;
    private Context mStyledContext;
    private final ule0 mDividerDecoration = new ule0(this);
    private int mLayoutResId = nuh0.preference_list_fragment;
    private final Handler mHandler = new Handler() { // from class: androidx.preference.PreferenceFragment.1
        @Override // android.os.Handler
        public void handleMessage(Message message) {
            if (message.what != 1) {
                return;
            }
            PreferenceFragment.this.bindPreferences();
        }
    };
    private final Runnable mRequestFocus = new a(0, this);

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
        b bVar = new b(this, preference, str);
        if (this.mList == null) {
            this.mSelectPreferenceRunnable = bVar;
        } else {
            bVar.run();
        }
    }

    private void unbindPreferences() {
        PreferenceScreen preferenceScreen = getPreferenceScreen();
        if (preferenceScreen != null) {
            preferenceScreen.o();
        }
        onUnbindPreferences();
    }

    @Deprecated
    public void addPreferencesFromResource(int i) {
        requirePreferenceManager();
        setPreferenceScreen(this.mPreferenceManager.e(this.mStyledContext, i, getPreferenceScreen()));
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
    @Deprecated
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

    @Deprecated
    public final RecyclerView getListView() {
        return this.mList;
    }

    @Deprecated
    public fme0 getPreferenceManager() {
        return this.mPreferenceManager;
    }

    @Deprecated
    public PreferenceScreen getPreferenceScreen() {
        return this.mPreferenceManager.g;
    }

    public void onBindPreferences() {
    }

    @Override // android.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        TypedValue typedValue = new TypedValue();
        getActivity().getTheme().resolveAttribute(fog0.preferenceTheme, typedValue, true);
        int i = typedValue.resourceId;
        if (i == 0) {
            i = e2i0.PreferenceThemeOverlay;
        }
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(getActivity(), i);
        this.mStyledContext = contextThemeWrapper;
        fme0 fme0Var = new fme0(contextThemeWrapper);
        this.mPreferenceManager = fme0Var;
        fme0Var.j = this;
        onCreatePreferences(bundle, getArguments() != null ? getArguments().getString("androidx.preference.PreferenceFragmentCompat.PREFERENCE_ROOT") : null);
    }

    @Deprecated
    public RecyclerView.Adapter onCreateAdapter(PreferenceScreen preferenceScreen) {
        return new ame0(preferenceScreen);
    }

    @Deprecated
    public RecyclerView.e onCreateLayoutManager() {
        return new LinearLayoutManager(getActivity());
    }

    @Deprecated
    public abstract void onCreatePreferences(Bundle bundle, String str);

    @Deprecated
    public RecyclerView onCreateRecyclerView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        RecyclerView recyclerView;
        if (this.mStyledContext.getPackageManager().hasSystemFeature("android.hardware.type.automotive") && (recyclerView = (RecyclerView) viewGroup.findViewById(mbh0.recycler_view)) != null) {
            return recyclerView;
        }
        RecyclerView recyclerView2 = (RecyclerView) layoutInflater.inflate(nuh0.preference_recyclerview, viewGroup, false);
        recyclerView2.setLayoutManager(onCreateLayoutManager());
        recyclerView2.setAccessibilityDelegateCompat(new ime0(recyclerView2));
        return recyclerView2;
    }

    @Override // android.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Context context = this.mStyledContext;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(null, n2i0.PreferenceFragment, uvb1.b(context, fog0.preferenceFragmentStyle, R.attr.preferenceFragmentStyle), 0);
        this.mLayoutResId = obtainStyledAttributes.getResourceId(n2i0.PreferenceFragment_android_layout, this.mLayoutResId);
        Drawable drawable = obtainStyledAttributes.getDrawable(n2i0.PreferenceFragment_android_divider);
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(n2i0.PreferenceFragment_android_dividerHeight, -1);
        boolean z = obtainStyledAttributes.getBoolean(n2i0.PreferenceFragment_allowDividerAfterLastItem, true);
        obtainStyledAttributes.recycle();
        LayoutInflater cloneInContext = layoutInflater.cloneInContext(this.mStyledContext);
        View inflate = cloneInContext.inflate(this.mLayoutResId, viewGroup, false);
        View findViewById = inflate.findViewById(R.id.list_container);
        if (!(findViewById instanceof ViewGroup)) {
            kbs.g("Content has view with id attribute 'android.R.id.list_container' that is not a ViewGroup class");
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

    @Override // android.app.Fragment
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
    @Deprecated
    public void onDisplayPreferenceDialog(Preference preference) {
        DialogFragment newInstance;
        getCallbackFragment();
        getActivity();
        if (getFragmentManager().findFragmentByTag(DIALOG_FRAGMENT_TAG) != null) {
            return;
        }
        if (preference instanceof EditTextPreference) {
            newInstance = EditTextPreferenceDialogFragment.newInstance(preference.D);
        } else if (preference instanceof ListPreference) {
            newInstance = ListPreferenceDialogFragment.newInstance(preference.D);
        } else {
            if (!(preference instanceof MultiSelectListPreference)) {
                ny61.g("Tried to display dialog for unknown preference type. Did you forget to override onDisplayPreferenceDialog()?");
                return;
            }
            newInstance = MultiSelectListPreferenceDialogFragment.newInstance(preference.D);
        }
        newInstance.setTargetFragment(this, 0);
        newInstance.show(getFragmentManager(), DIALOG_FRAGMENT_TAG);
    }

    @Override // defpackage.dme0
    @Deprecated
    public void onNavigateToScreen(PreferenceScreen preferenceScreen) {
        getCallbackFragment();
        getActivity();
    }

    @Override // defpackage.eme0
    @Deprecated
    public boolean onPreferenceTreeClick(Preference preference) {
        if (preference.F != null) {
            getCallbackFragment();
            getActivity();
        }
        return false;
    }

    @Override // android.app.Fragment
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        PreferenceScreen preferenceScreen = getPreferenceScreen();
        if (preferenceScreen != null) {
            Bundle bundle2 = new Bundle();
            preferenceScreen.c(bundle2);
            bundle.putBundle(PREFERENCES_TAG, bundle2);
        }
    }

    @Override // android.app.Fragment
    public void onStart() {
        super.onStart();
        fme0 fme0Var = this.mPreferenceManager;
        fme0Var.h = this;
        fme0Var.i = this;
    }

    @Override // android.app.Fragment
    public void onStop() {
        super.onStop();
        fme0 fme0Var = this.mPreferenceManager;
        fme0Var.h = null;
        fme0Var.i = null;
    }

    public void onUnbindPreferences() {
    }

    @Override // android.app.Fragment
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

    @Deprecated
    public void scrollToPreference(String str) {
        scrollToPreferenceInternal(null, str);
    }

    @Deprecated
    public void setDivider(Drawable drawable) {
        ule0 ule0Var = this.mDividerDecoration;
        if (drawable != null) {
            ule0Var.getClass();
            ule0Var.b = drawable.getIntrinsicHeight();
        } else {
            ule0Var.b = 0;
        }
        ule0Var.a = drawable;
        ule0Var.w.mList.invalidateItemDecorations();
    }

    @Deprecated
    public void setDividerHeight(int i) {
        ule0 ule0Var = this.mDividerDecoration;
        ule0Var.b = i;
        ule0Var.w.mList.invalidateItemDecorations();
    }

    @Deprecated
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

    @Deprecated
    public void setPreferencesFromResource(int i, String str) {
        requirePreferenceManager();
        PreferenceScreen e = this.mPreferenceManager.e(this.mStyledContext, i, null);
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

    @Deprecated
    public void scrollToPreference(Preference preference) {
        scrollToPreferenceInternal(preference, null);
    }
}

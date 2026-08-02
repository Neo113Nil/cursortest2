package androidx.preference;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import defpackage.ny61;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

@Deprecated
/* loaded from: classes10.dex */
public class MultiSelectListPreferenceDialogFragment extends PreferenceDialogFragment {
    private static final String SAVE_STATE_CHANGED = "MultiSelectListPreferenceDialogFragment.changed";
    private static final String SAVE_STATE_ENTRIES = "MultiSelectListPreferenceDialogFragment.entries";
    private static final String SAVE_STATE_ENTRY_VALUES = "MultiSelectListPreferenceDialogFragment.entryValues";
    private static final String SAVE_STATE_VALUES = "MultiSelectListPreferenceDialogFragment.values";
    CharSequence[] mEntries;
    CharSequence[] mEntryValues;
    Set<String> mNewValues = new HashSet();
    boolean mPreferenceChanged;

    @Deprecated
    public MultiSelectListPreferenceDialogFragment() {
    }

    private MultiSelectListPreference getListPreference() {
        return (MultiSelectListPreference) getPreference();
    }

    @Deprecated
    public static MultiSelectListPreferenceDialogFragment newInstance(String str) {
        MultiSelectListPreferenceDialogFragment multiSelectListPreferenceDialogFragment = new MultiSelectListPreferenceDialogFragment();
        Bundle bundle = new Bundle(1);
        bundle.putString("key", str);
        multiSelectListPreferenceDialogFragment.setArguments(bundle);
        return multiSelectListPreferenceDialogFragment;
    }

    @Override // androidx.preference.PreferenceDialogFragment, android.app.DialogFragment, android.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle != null) {
            this.mNewValues.clear();
            this.mNewValues.addAll(bundle.getStringArrayList(SAVE_STATE_VALUES));
            this.mPreferenceChanged = bundle.getBoolean(SAVE_STATE_CHANGED, false);
            this.mEntries = bundle.getCharSequenceArray(SAVE_STATE_ENTRIES);
            this.mEntryValues = bundle.getCharSequenceArray(SAVE_STATE_ENTRY_VALUES);
            return;
        }
        MultiSelectListPreference listPreference = getListPreference();
        CharSequence[] charSequenceArr = listPreference.o0;
        CharSequence[] charSequenceArr2 = listPreference.p0;
        if (charSequenceArr == null || charSequenceArr2 == null) {
            ny61.r("MultiSelectListPreference requires an entries array and an entryValues array.");
            return;
        }
        this.mNewValues.clear();
        this.mNewValues.addAll(listPreference.q0);
        this.mPreferenceChanged = false;
        this.mEntries = listPreference.o0;
        this.mEntryValues = charSequenceArr2;
    }

    @Override // androidx.preference.PreferenceDialogFragment
    @Deprecated
    public void onDialogClosed(boolean z) {
        MultiSelectListPreference listPreference = getListPreference();
        if (z && this.mPreferenceChanged) {
            Set<String> set = this.mNewValues;
            listPreference.a(set);
            listPreference.A(set);
        }
        this.mPreferenceChanged = false;
    }

    @Override // androidx.preference.PreferenceDialogFragment
    public void onPrepareDialogBuilder(AlertDialog.Builder builder) {
        super.onPrepareDialogBuilder(builder);
        int length = this.mEntryValues.length;
        boolean[] zArr = new boolean[length];
        for (int i = 0; i < length; i++) {
            zArr[i] = this.mNewValues.contains(this.mEntryValues[i].toString());
        }
        builder.setMultiChoiceItems(this.mEntries, zArr, new DialogInterface.OnMultiChoiceClickListener() { // from class: androidx.preference.MultiSelectListPreferenceDialogFragment.1
            @Override // android.content.DialogInterface.OnMultiChoiceClickListener
            public void onClick(DialogInterface dialogInterface, int i2, boolean z) {
                MultiSelectListPreferenceDialogFragment multiSelectListPreferenceDialogFragment = MultiSelectListPreferenceDialogFragment.this;
                if (z) {
                    multiSelectListPreferenceDialogFragment.mPreferenceChanged |= multiSelectListPreferenceDialogFragment.mNewValues.add(multiSelectListPreferenceDialogFragment.mEntryValues[i2].toString());
                } else {
                    multiSelectListPreferenceDialogFragment.mPreferenceChanged |= multiSelectListPreferenceDialogFragment.mNewValues.remove(multiSelectListPreferenceDialogFragment.mEntryValues[i2].toString());
                }
            }
        });
    }

    @Override // androidx.preference.PreferenceDialogFragment, android.app.DialogFragment, android.app.Fragment
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putStringArrayList(SAVE_STATE_VALUES, new ArrayList<>(this.mNewValues));
        bundle.putBoolean(SAVE_STATE_CHANGED, this.mPreferenceChanged);
        bundle.putCharSequenceArray(SAVE_STATE_ENTRIES, this.mEntries);
        bundle.putCharSequenceArray(SAVE_STATE_ENTRY_VALUES, this.mEntryValues);
    }
}

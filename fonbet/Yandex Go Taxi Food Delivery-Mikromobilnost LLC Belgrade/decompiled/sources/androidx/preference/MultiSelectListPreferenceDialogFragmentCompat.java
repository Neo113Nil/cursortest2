package androidx.preference;

import android.content.DialogInterface;
import android.os.Bundle;
import androidx.appcompat.app.AlertDialog;
import defpackage.ny61;
import defpackage.rq1;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes10.dex */
public class MultiSelectListPreferenceDialogFragmentCompat extends PreferenceDialogFragmentCompat {
    private static final String SAVE_STATE_CHANGED = "MultiSelectListPreferenceDialogFragmentCompat.changed";
    private static final String SAVE_STATE_ENTRIES = "MultiSelectListPreferenceDialogFragmentCompat.entries";
    private static final String SAVE_STATE_ENTRY_VALUES = "MultiSelectListPreferenceDialogFragmentCompat.entryValues";
    private static final String SAVE_STATE_VALUES = "MultiSelectListPreferenceDialogFragmentCompat.values";
    CharSequence[] mEntries;
    CharSequence[] mEntryValues;
    Set<String> mNewValues = new HashSet();
    boolean mPreferenceChanged;

    private MultiSelectListPreference getListPreference() {
        return (MultiSelectListPreference) getPreference();
    }

    public static MultiSelectListPreferenceDialogFragmentCompat newInstance(String str) {
        MultiSelectListPreferenceDialogFragmentCompat multiSelectListPreferenceDialogFragmentCompat = new MultiSelectListPreferenceDialogFragmentCompat();
        Bundle bundle = new Bundle(1);
        bundle.putString("key", str);
        multiSelectListPreferenceDialogFragmentCompat.setArguments(bundle);
        return multiSelectListPreferenceDialogFragmentCompat;
    }

    @Override // androidx.preference.PreferenceDialogFragmentCompat, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
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

    @Override // androidx.preference.PreferenceDialogFragmentCompat
    public void onDialogClosed(boolean z) {
        if (z && this.mPreferenceChanged) {
            MultiSelectListPreference listPreference = getListPreference();
            listPreference.a(this.mNewValues);
            listPreference.A(this.mNewValues);
        }
        this.mPreferenceChanged = false;
    }

    @Override // androidx.preference.PreferenceDialogFragmentCompat
    public void onPrepareDialogBuilder(AlertDialog.a aVar) {
        super.onPrepareDialogBuilder(aVar);
        int length = this.mEntryValues.length;
        boolean[] zArr = new boolean[length];
        for (int i = 0; i < length; i++) {
            zArr[i] = this.mNewValues.contains(this.mEntryValues[i].toString());
        }
        CharSequence[] charSequenceArr = this.mEntries;
        DialogInterface.OnMultiChoiceClickListener onMultiChoiceClickListener = new DialogInterface.OnMultiChoiceClickListener() { // from class: androidx.preference.MultiSelectListPreferenceDialogFragmentCompat.1
            @Override // android.content.DialogInterface.OnMultiChoiceClickListener
            public void onClick(DialogInterface dialogInterface, int i2, boolean z) {
                MultiSelectListPreferenceDialogFragmentCompat multiSelectListPreferenceDialogFragmentCompat = MultiSelectListPreferenceDialogFragmentCompat.this;
                if (z) {
                    multiSelectListPreferenceDialogFragmentCompat.mPreferenceChanged |= multiSelectListPreferenceDialogFragmentCompat.mNewValues.add(multiSelectListPreferenceDialogFragmentCompat.mEntryValues[i2].toString());
                } else {
                    multiSelectListPreferenceDialogFragmentCompat.mPreferenceChanged |= multiSelectListPreferenceDialogFragmentCompat.mNewValues.remove(multiSelectListPreferenceDialogFragmentCompat.mEntryValues[i2].toString());
                }
            }
        };
        rq1 rq1Var = aVar.a;
        rq1Var.p = charSequenceArr;
        rq1Var.x = onMultiChoiceClickListener;
        rq1Var.t = zArr;
        rq1Var.u = true;
    }

    @Override // androidx.preference.PreferenceDialogFragmentCompat, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putStringArrayList(SAVE_STATE_VALUES, new ArrayList<>(this.mNewValues));
        bundle.putBoolean(SAVE_STATE_CHANGED, this.mPreferenceChanged);
        bundle.putCharSequenceArray(SAVE_STATE_ENTRIES, this.mEntries);
        bundle.putCharSequenceArray(SAVE_STATE_ENTRY_VALUES, this.mEntryValues);
    }
}

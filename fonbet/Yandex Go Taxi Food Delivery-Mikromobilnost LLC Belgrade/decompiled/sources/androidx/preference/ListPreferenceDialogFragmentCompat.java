package androidx.preference;

import android.content.DialogInterface;
import android.os.Bundle;
import androidx.appcompat.app.AlertDialog;
import defpackage.ny61;
import defpackage.rq1;

/* loaded from: classes10.dex */
public class ListPreferenceDialogFragmentCompat extends PreferenceDialogFragmentCompat {
    private static final String SAVE_STATE_ENTRIES = "ListPreferenceDialogFragment.entries";
    private static final String SAVE_STATE_ENTRY_VALUES = "ListPreferenceDialogFragment.entryValues";
    private static final String SAVE_STATE_INDEX = "ListPreferenceDialogFragment.index";
    int mClickedDialogEntryIndex;
    private CharSequence[] mEntries;
    private CharSequence[] mEntryValues;

    private ListPreference getListPreference() {
        return (ListPreference) getPreference();
    }

    public static ListPreferenceDialogFragmentCompat newInstance(String str) {
        ListPreferenceDialogFragmentCompat listPreferenceDialogFragmentCompat = new ListPreferenceDialogFragmentCompat();
        Bundle bundle = new Bundle(1);
        bundle.putString("key", str);
        listPreferenceDialogFragmentCompat.setArguments(bundle);
        return listPreferenceDialogFragmentCompat;
    }

    @Override // androidx.preference.PreferenceDialogFragmentCompat, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle != null) {
            this.mClickedDialogEntryIndex = bundle.getInt(SAVE_STATE_INDEX, 0);
            this.mEntries = bundle.getCharSequenceArray(SAVE_STATE_ENTRIES);
            this.mEntryValues = bundle.getCharSequenceArray(SAVE_STATE_ENTRY_VALUES);
            return;
        }
        ListPreference listPreference = getListPreference();
        if (listPreference.o0 == null || listPreference.p0 == null) {
            ny61.r("ListPreference requires an entries array and an entryValues array.");
            return;
        }
        this.mClickedDialogEntryIndex = listPreference.A(listPreference.q0);
        this.mEntries = listPreference.o0;
        this.mEntryValues = listPreference.p0;
    }

    @Override // androidx.preference.PreferenceDialogFragmentCompat
    public void onDialogClosed(boolean z) {
        int i;
        if (!z || (i = this.mClickedDialogEntryIndex) < 0) {
            return;
        }
        String charSequence = this.mEntryValues[i].toString();
        ListPreference listPreference = getListPreference();
        listPreference.a(charSequence);
        listPreference.C(charSequence);
    }

    @Override // androidx.preference.PreferenceDialogFragmentCompat
    public void onPrepareDialogBuilder(AlertDialog.a aVar) {
        super.onPrepareDialogBuilder(aVar);
        CharSequence[] charSequenceArr = this.mEntries;
        int i = this.mClickedDialogEntryIndex;
        DialogInterface.OnClickListener onClickListener = new DialogInterface.OnClickListener() { // from class: androidx.preference.ListPreferenceDialogFragmentCompat.1
            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i2) {
                ListPreferenceDialogFragmentCompat listPreferenceDialogFragmentCompat = ListPreferenceDialogFragmentCompat.this;
                listPreferenceDialogFragmentCompat.mClickedDialogEntryIndex = i2;
                listPreferenceDialogFragmentCompat.onClick(dialogInterface, -1);
                dialogInterface.dismiss();
            }
        };
        rq1 rq1Var = aVar.a;
        rq1Var.p = charSequenceArr;
        rq1Var.r = onClickListener;
        rq1Var.w = i;
        rq1Var.v = true;
        aVar.h(null, null);
    }

    @Override // androidx.preference.PreferenceDialogFragmentCompat, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putInt(SAVE_STATE_INDEX, this.mClickedDialogEntryIndex);
        bundle.putCharSequenceArray(SAVE_STATE_ENTRIES, this.mEntries);
        bundle.putCharSequenceArray(SAVE_STATE_ENTRY_VALUES, this.mEntryValues);
    }
}

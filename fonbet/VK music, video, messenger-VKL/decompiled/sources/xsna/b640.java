package xsna;

import android.content.DialogInterface;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.d;
import androidx.preference.MultiSelectListPreference;
import java.util.ArrayList;
import java.util.HashSet;

/* compiled from: MultiSelectListPreferenceDialogFragmentCompat.java */
/* loaded from: classes12.dex */
public class b640 extends androidx.preference.a {
    public final HashSet F = new HashSet();
    public boolean G;
    public CharSequence[] H;
    public CharSequence[] I;

    /* compiled from: MultiSelectListPreferenceDialogFragmentCompat.java */
    public class a implements DialogInterface.OnMultiChoiceClickListener {
        public a() {
        }

        @Override // android.content.DialogInterface.OnMultiChoiceClickListener
        public final void onClick(DialogInterface dialogInterface, int i, boolean z) {
            b640 b640Var = b640.this;
            if (z) {
                b640Var.G = b640Var.F.add(b640Var.I[i].toString()) | b640Var.G;
            } else {
                b640Var.G = b640Var.F.remove(b640Var.I[i].toString()) | b640Var.G;
            }
        }
    }

    @Override // androidx.preference.a
    public final void Hn(boolean z) {
        if (z && this.G) {
            MultiSelectListPreference multiSelectListPreference = (MultiSelectListPreference) Dn();
            HashSet hashSet = this.F;
            if (multiSelectListPreference.a(hashSet)) {
                multiSelectListPreference.O(hashSet);
            }
        }
        this.G = false;
    }

    @Override // androidx.preference.a
    public final void In(@NonNull d.a aVar) {
        int length = this.I.length;
        boolean[] zArr = new boolean[length];
        for (int i = 0; i < length; i++) {
            zArr[i] = this.F.contains(this.I[i].toString());
        }
        aVar.e(this.H, zArr, new a());
    }

    @Override // androidx.preference.a, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        HashSet hashSet = this.F;
        if (bundle != null) {
            hashSet.clear();
            hashSet.addAll(bundle.getStringArrayList("MultiSelectListPreferenceDialogFragmentCompat.values"));
            this.G = bundle.getBoolean("MultiSelectListPreferenceDialogFragmentCompat.changed", false);
            this.H = bundle.getCharSequenceArray("MultiSelectListPreferenceDialogFragmentCompat.entries");
            this.I = bundle.getCharSequenceArray("MultiSelectListPreferenceDialogFragmentCompat.entryValues");
            return;
        }
        MultiSelectListPreference multiSelectListPreference = (MultiSelectListPreference) Dn();
        if (multiSelectListPreference.W == null || multiSelectListPreference.X == null) {
            throw new IllegalStateException("MultiSelectListPreference requires an entries array and an entryValues array.");
        }
        hashSet.clear();
        hashSet.addAll(multiSelectListPreference.Y);
        this.G = false;
        this.H = multiSelectListPreference.W;
        this.I = multiSelectListPreference.X;
    }

    @Override // androidx.preference.a, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onSaveInstanceState(@NonNull Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putStringArrayList("MultiSelectListPreferenceDialogFragmentCompat.values", new ArrayList<>(this.F));
        bundle.putBoolean("MultiSelectListPreferenceDialogFragmentCompat.changed", this.G);
        bundle.putCharSequenceArray("MultiSelectListPreferenceDialogFragmentCompat.entries", this.H);
        bundle.putCharSequenceArray("MultiSelectListPreferenceDialogFragmentCompat.entryValues", this.I);
    }
}

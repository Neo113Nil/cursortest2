package xsna;

import android.content.DialogInterface;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.d;
import androidx.preference.ListPreference;

/* compiled from: ListPreferenceDialogFragmentCompat.java */
/* loaded from: classes12.dex */
public class agz extends androidx.preference.a {
    public int F;
    public CharSequence[] G;
    public CharSequence[] H;

    /* compiled from: ListPreferenceDialogFragmentCompat.java */
    public class a implements DialogInterface.OnClickListener {
        public a() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public final void onClick(DialogInterface dialogInterface, int i) {
            agz agzVar = agz.this;
            agzVar.F = i;
            agzVar.E = -1;
            dialogInterface.dismiss();
        }
    }

    @Override // androidx.preference.a
    public final void Hn(boolean z) {
        int i;
        if (!z || (i = this.F) < 0) {
            return;
        }
        String charSequence = this.H[i].toString();
        ListPreference listPreference = (ListPreference) Dn();
        if (listPreference.a(charSequence)) {
            listPreference.R(charSequence);
        }
    }

    @Override // androidx.preference.a
    public final void In(@NonNull d.a aVar) {
        aVar.k(this.G, this.F, new a());
        aVar.j(null, null);
    }

    @Override // androidx.preference.a, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        if (bundle != null) {
            this.F = bundle.getInt("ListPreferenceDialogFragment.index", 0);
            this.G = bundle.getCharSequenceArray("ListPreferenceDialogFragment.entries");
            this.H = bundle.getCharSequenceArray("ListPreferenceDialogFragment.entryValues");
            return;
        }
        ListPreference listPreference = (ListPreference) Dn();
        if (listPreference.W == null || listPreference.X == null) {
            throw new IllegalStateException("ListPreference requires an entries array and an entryValues array.");
        }
        this.F = listPreference.O(listPreference.Y);
        this.G = listPreference.W;
        this.H = listPreference.X;
    }

    @Override // androidx.preference.a, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onSaveInstanceState(@NonNull Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putInt("ListPreferenceDialogFragment.index", this.F);
        bundle.putCharSequenceArray("ListPreferenceDialogFragment.entries", this.G);
        bundle.putCharSequenceArray("ListPreferenceDialogFragment.entryValues", this.H);
    }
}

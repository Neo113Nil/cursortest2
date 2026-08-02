package xsna;

import android.app.AlertDialog;
import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TabHost;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.cast.MediaInfo;
import com.google.android.gms.cast.MediaStatus;
import com.google.android.gms.cast.MediaTrack;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/* compiled from: com.google.android.gms:play-services-cast-framework@@22.3.1 */
/* loaded from: classes12.dex */
public class fip0 extends androidx.fragment.app.d {

    @Nullable
    public long[] A;

    @Nullable
    public AlertDialog B;

    @Nullable
    public lvf0 C;
    public boolean x;
    public ArrayList y;
    public ArrayList z;

    @Deprecated
    public fip0() {
    }

    public static int Dn(ArrayList arrayList, @Nullable long[] jArr, int i) {
        if (jArr != null && arrayList != null) {
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                for (long j : jArr) {
                    if (j == ((MediaTrack) arrayList.get(i2)).b) {
                        return i2;
                    }
                }
            }
        }
        return i;
    }

    @Override // androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        this.x = true;
        this.z = new ArrayList();
        this.y = new ArrayList();
        this.A = new long[0];
        g0a c = uz9.e(mo2getContext()).d().c();
        if (c != null && c.c()) {
            lvf0 k = c.k();
            this.C = k;
            if (k != null && k.k() && this.C.g() != null) {
                lvf0 lvf0Var = this.C;
                MediaStatus h = lvf0Var.h();
                if (h != null) {
                    this.A = h.l;
                }
                MediaInfo g = lvf0Var.g();
                if (g == null) {
                    this.x = false;
                    return;
                }
                List<MediaTrack> list = g.g;
                if (list == null) {
                    this.x = false;
                    return;
                }
                ArrayList arrayList = new ArrayList();
                for (MediaTrack mediaTrack : list) {
                    if (mediaTrack.c == 2) {
                        arrayList.add(mediaTrack);
                    }
                }
                this.z = arrayList;
                ArrayList arrayList2 = new ArrayList();
                for (MediaTrack mediaTrack2 : list) {
                    if (mediaTrack2.c == 1) {
                        arrayList2.add(mediaTrack2);
                    }
                }
                this.y = arrayList2;
                if (arrayList2.isEmpty()) {
                    return;
                }
                this.y.add(0, new MediaTrack(-1L, 1, "", null, String.format(Locale.ROOT, getActivity().getString(R.string.cast_tracks_chooser_dialog_none), new Object[0]), null, 2, null, null));
                return;
            }
        }
        this.x = false;
    }

    @Override // androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        Dialog dialog = this.s;
        if (dialog != null && getRetainInstance()) {
            dialog.setDismissMessage(null);
        }
        super.onDestroyView();
    }

    @Override // androidx.fragment.app.d
    @NonNull
    public final Dialog yn(@Nullable Bundle bundle) {
        int Dn = Dn(this.y, this.A, 0);
        int Dn2 = Dn(this.z, this.A, -1);
        w301 w301Var = new w301(getActivity(), this.y, Dn);
        w301 w301Var2 = new w301(getActivity(), this.z, Dn2);
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        View inflate = getActivity().getLayoutInflater().inflate(R.layout.cast_tracks_chooser_dialog_layout, (ViewGroup) null);
        ListView listView = (ListView) inflate.findViewById(R.id.text_list_view);
        ListView listView2 = (ListView) inflate.findViewById(R.id.audio_list_view);
        TabHost tabHost = (TabHost) inflate.findViewById(R.id.tab_host);
        tabHost.setup();
        if (w301Var.getCount() == 0) {
            listView.setVisibility(4);
        } else {
            listView.setAdapter((ListAdapter) w301Var);
            TabHost.TabSpec newTabSpec = tabHost.newTabSpec("textTab");
            newTabSpec.setContent(R.id.text_list_view);
            newTabSpec.setIndicator(String.format(Locale.ROOT, getActivity().getString(R.string.cast_tracks_chooser_dialog_subtitles), new Object[0]));
            tabHost.addTab(newTabSpec);
        }
        if (w301Var2.getCount() <= 1) {
            listView2.setVisibility(4);
        } else {
            listView2.setAdapter((ListAdapter) w301Var2);
            TabHost.TabSpec newTabSpec2 = tabHost.newTabSpec("audioTab");
            newTabSpec2.setContent(R.id.audio_list_view);
            newTabSpec2.setIndicator(String.format(Locale.ROOT, getActivity().getString(R.string.cast_tracks_chooser_dialog_audio), new Object[0]));
            tabHost.addTab(newTabSpec2);
        }
        AlertDialog.Builder view = builder.setView(inflate);
        Locale locale = Locale.ROOT;
        view.setPositiveButton(String.format(locale, getActivity().getString(R.string.cast_tracks_chooser_dialog_ok), new Object[0]), new q301(this, w301Var, w301Var2)).setNegativeButton(String.format(locale, getActivity().getString(R.string.cast_tracks_chooser_dialog_cancel), new Object[0]), new n301(this));
        AlertDialog alertDialog = this.B;
        if (alertDialog != null) {
            alertDialog.cancel();
            this.B = null;
        }
        AlertDialog create = builder.create();
        this.B = create;
        return create;
    }
}

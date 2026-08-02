package xsna;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.RadioButton;
import android.widget.TextView;
import androidx.annotation.Nullable;
import androidx.fragment.app.FragmentActivity;
import com.google.android.gms.cast.MediaTrack;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Locale;

/* compiled from: com.google.android.gms:play-services-cast-framework@@22.3.1 */
/* loaded from: classes12.dex */
public final class w301 extends ArrayAdapter implements View.OnClickListener {
    public final Context b;
    public int c;

    public w301(FragmentActivity fragmentActivity, ArrayList arrayList, int i) {
        super(fragmentActivity, R.layout.cast_tracks_chooser_dialog_row_layout, arrayList == null ? new ArrayList() : arrayList);
        this.b = fragmentActivity;
        this.c = i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0086, code lost:
    
        if (android.text.TextUtils.isEmpty(r2) == false) goto L23;
     */
    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final View getView(int i, @Nullable View view, ViewGroup viewGroup) {
        t301 t301Var;
        Context context = this.b;
        if (view == null) {
            LayoutInflater layoutInflater = (LayoutInflater) context.getSystemService("layout_inflater");
            exc0.i(layoutInflater);
            view = layoutInflater.inflate(R.layout.cast_tracks_chooser_dialog_row_layout, viewGroup, false);
            t301Var = new t301(this, (TextView) view.findViewById(R.id.text), (RadioButton) view.findViewById(R.id.radio));
            view.setTag(t301Var);
        } else {
            t301Var = (t301) view.getTag();
            exc0.i(t301Var);
        }
        RadioButton radioButton = t301Var.b;
        radioButton.setTag(Integer.valueOf(i));
        radioButton.setChecked(this.c == i);
        view.setOnClickListener(this);
        MediaTrack mediaTrack = (MediaTrack) getItem(i);
        exc0.i(mediaTrack);
        String str = mediaTrack.f;
        String str2 = mediaTrack.g;
        Locale forLanguageTag = TextUtils.isEmpty(str2) ? null : Locale.forLanguageTag(str2);
        if (TextUtils.isEmpty(str)) {
            if (mediaTrack.h == 2) {
                str = context.getString(R.string.cast_tracks_chooser_dialog_closed_captions);
            } else {
                if (forLanguageTag != null) {
                    str = forLanguageTag.getDisplayLanguage();
                }
                str = context.getString(R.string.cast_tracks_chooser_dialog_default_track_name, Integer.valueOf(i + 1));
            }
        }
        t301Var.a.setText(str);
        return view;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        t301 t301Var = (t301) view.getTag();
        exc0.i(t301Var);
        Object tag = t301Var.b.getTag();
        exc0.i(tag);
        this.c = ((Integer) tag).intValue();
        notifyDataSetChanged();
    }
}

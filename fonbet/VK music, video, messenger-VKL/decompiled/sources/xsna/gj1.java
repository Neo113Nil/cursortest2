package xsna;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.SpinnerAdapter;
import com.vk.attachpicker.widget.CustomSpinner;
import com.vk.mediastore.system.AlbumEntry;
import com.vkontakte.android.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import org.chromium.net.NetError;

/* compiled from: AlbumPickSpinnerAdapter.kt */
/* loaded from: classes15.dex */
public final class gj1 extends BaseAdapter implements SpinnerAdapter {
    public static final AlbumEntry f;
    public static final AlbumEntry g;
    public final Context b;
    public final hj1 c;
    public final ArrayList<AlbumEntry> d = new ArrayList<>();
    public CustomSpinner e;

    static {
        Context context = e43.a;
        if (context == null) {
            context = null;
        }
        f = new AlbumEntry(-100, context.getString(R.string.picker_other_photo), null, false, 0, null, 60, null);
        Context context2 = e43.a;
        g = new AlbumEntry(NetError.ERR_CERT_COMMON_NAME_INVALID, (context2 != null ? context2 : null).getString(R.string.picker_other_video), null, false, 0, null, 60, null);
    }

    public gj1(Context context, hj1 hj1Var) {
        this.b = context;
        this.c = hj1Var;
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        return this.d.size();
    }

    @Override // android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public final View getDropDownView(int i, View view, ViewGroup viewGroup) {
        Object tag = view != null ? view.getTag() : null;
        qxt0<AlbumEntry> qxt0Var = tag instanceof qxt0 ? (qxt0) tag : null;
        if (qxt0Var == null) {
            qxt0Var = this.c.a(new WeakReference<>(this.e));
        }
        return qxt0Var.a(this.b, view, i, this.d.get(i));
    }

    @Override // android.widget.Adapter
    public final Object getItem(int i) {
        return this.d.get(i);
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return 0L;
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        AdapterView adapterView = viewGroup instanceof AdapterView ? (AdapterView) viewGroup : null;
        if (adapterView != null) {
            i = adapterView.getSelectedItemPosition();
        }
        Object tag = view != null ? view.getTag() : null;
        qxt0<AlbumEntry> qxt0Var = tag instanceof qxt0 ? (qxt0) tag : null;
        if (qxt0Var == null) {
            qxt0Var = this.c.b(viewGroup);
        }
        return qxt0Var.a(this.b, view, i, i >= 0 ? this.d.get(i) : null);
    }
}

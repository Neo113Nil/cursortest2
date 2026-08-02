package xsna;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.vk.attachpicker.widget.CustomSpinner;
import com.vk.mediastore.system.AlbumEntry;
import com.vkontakte.android.R;
import java.lang.ref.WeakReference;

/* compiled from: AlbumPickSpinnerViewHolderProvider.kt */
/* loaded from: classes15.dex */
public final class p7a0 implements hj1 {

    /* compiled from: AlbumPickSpinnerViewHolderProvider.kt */
    public static final class a extends qxt0<AlbumEntry> {
        public TextView a;
        public final /* synthetic */ WeakReference<CustomSpinner> b;

        public a(WeakReference<CustomSpinner> weakReference) {
            this.b = weakReference;
        }

        @Override // xsna.qxt0
        public final View b(Context context) {
            View inflate = LayoutInflater.from(context).inflate(R.layout.picker_adapter_album_spinner_new, (ViewGroup) null);
            this.a = (TextView) inflate.findViewById(R.id.tv_title);
            return inflate;
        }

        @Override // xsna.qxt0
        public final void c(Context context, Object obj, int i) {
            AlbumEntry albumEntry = (AlbumEntry) obj;
            TextView textView = this.a;
            if (textView == null) {
                textView = null;
            }
            textView.setText(albumEntry.c);
            CustomSpinner customSpinner = this.b.get();
            int i2 = (customSpinner == null || customSpinner.getSelectedItemPosition() != i) ? R.attr.vk_ui_text_primary : R.attr.vk_ui_text_accent_themed;
            TextView textView2 = this.a;
            (textView2 != null ? textView2 : null).setTextColor(dhr0.t.c(i2));
        }
    }

    /* compiled from: AlbumPickSpinnerViewHolderProvider.kt */
    public static final class b extends qxt0<AlbumEntry> {
        public TextView a;
        public final /* synthetic */ ViewGroup b;

        public b(ViewGroup viewGroup) {
            this.b = viewGroup;
        }

        @Override // xsna.qxt0
        public final View b(Context context) {
            View inflate = LayoutInflater.from(context).inflate(R.layout.picker_adapter_album_spinner_selected_new, this.b, false);
            this.a = (TextView) inflate.findViewById(R.id.tv_title);
            return inflate;
        }

        @Override // xsna.qxt0
        public final void c(Context context, Object obj, int i) {
            String str;
            AlbumEntry albumEntry = (AlbumEntry) obj;
            if (albumEntry == null || (str = albumEntry.c) == null) {
                return;
            }
            TextView textView = this.a;
            if (textView == null) {
                textView = null;
            }
            textView.setText(str);
        }
    }

    @Override // xsna.hj1
    public final qxt0<AlbumEntry> a(WeakReference<CustomSpinner> weakReference) {
        return new a(weakReference);
    }

    @Override // xsna.hj1
    public final qxt0<AlbumEntry> b(ViewGroup viewGroup) {
        return new b(viewGroup);
    }
}

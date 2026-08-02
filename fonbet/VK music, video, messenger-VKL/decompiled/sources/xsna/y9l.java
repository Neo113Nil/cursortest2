package xsna;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.vk.attachpicker.widget.CustomSpinner;
import com.vk.attachpicker.widget.LocalImageView;
import com.vk.mediastore.system.AlbumEntry;
import com.vk.mediastore.system.MediaStoreEntry;
import com.vkontakte.android.R;
import java.lang.ref.WeakReference;
import java.util.List;

/* compiled from: AlbumPickSpinnerViewHolderProvider.kt */
/* loaded from: classes15.dex */
public final class y9l implements hj1 {

    /* compiled from: AlbumPickSpinnerViewHolderProvider.kt */
    public static final class a extends qxt0<AlbumEntry> {
        public LinearLayout a;
        public TextView b;
        public TextView c;
        public LocalImageView d;
        public final /* synthetic */ WeakReference<CustomSpinner> e;

        public a(WeakReference<CustomSpinner> weakReference) {
            this.e = weakReference;
        }

        @Override // xsna.qxt0
        public final View b(Context context) {
            LinearLayout linearLayout = (LinearLayout) LayoutInflater.from(context).inflate(R.layout.picker_adapter_album_spinner, (ViewGroup) null);
            this.a = linearLayout;
            if (linearLayout == null) {
                linearLayout = null;
            }
            this.b = (TextView) linearLayout.findViewById(R.id.tv_title);
            LinearLayout linearLayout2 = this.a;
            if (linearLayout2 == null) {
                linearLayout2 = null;
            }
            this.c = (TextView) linearLayout2.findViewById(R.id.tv_photos_count);
            LinearLayout linearLayout3 = this.a;
            if (linearLayout3 == null) {
                linearLayout3 = null;
            }
            this.d = (LocalImageView) linearLayout3.findViewById(R.id.tiv_album_image);
            LinearLayout linearLayout4 = this.a;
            if (linearLayout4 == null) {
                return null;
            }
            return linearLayout4;
        }

        @Override // xsna.qxt0
        public final void c(Context context, Object obj, int i) {
            AlbumEntry albumEntry = (AlbumEntry) obj;
            int i2 = albumEntry.f;
            List<MediaStoreEntry> list = albumEntry.d;
            MediaStoreEntry mediaStoreEntry = list.isEmpty() ? null : list.get(0);
            TextView textView = this.b;
            if (textView == null) {
                textView = null;
            }
            textView.setText(albumEntry.c);
            TextView textView2 = this.c;
            if (textView2 == null) {
                textView2 = null;
            }
            textView2.setText(String.valueOf(i2));
            AlbumEntry albumEntry2 = gj1.f;
            if (albumEntry.equals(albumEntry2)) {
                LocalImageView localImageView = this.d;
                if (localImageView == null) {
                    localImageView = null;
                }
                localImageView.setImageResource(R.drawable.vk_icon_deprecated_picker_ic_gallery_more_photos);
            } else if (albumEntry.equals(gj1.g)) {
                LocalImageView localImageView2 = this.d;
                if (localImageView2 == null) {
                    localImageView2 = null;
                }
                localImageView2.setImageResource(R.drawable.vk_icon_deprecated_picker_ic_gallery_more_videos);
            } else {
                LocalImageView localImageView3 = this.d;
                if (localImageView3 == null) {
                    localImageView3 = null;
                }
                localImageView3.W0(mediaStoreEntry);
            }
            CustomSpinner customSpinner = this.e.get();
            int i3 = (customSpinner == null || customSpinner.getSelectedItemPosition() != i) ? R.attr.vk_ui_text_muted : R.attr.vk_ui_text_accent;
            TextView textView3 = this.b;
            if (textView3 == null) {
                textView3 = null;
            }
            textView3.setTextColor(dhr0.t.c(i3));
            LocalImageView localImageView4 = this.d;
            if (localImageView4 == null) {
                localImageView4 = null;
            }
            localImageView4.setVisibility((mediaStoreEntry != null || albumEntry.equals(albumEntry2) || albumEntry.equals(gj1.g)) ? 0 : 8);
            TextView textView4 = this.c;
            (textView4 != null ? textView4 : null).setVisibility(i2 == 0 ? 8 : 0);
        }
    }

    /* compiled from: AlbumPickSpinnerViewHolderProvider.kt */
    public static final class b extends qxt0<AlbumEntry> {
        public View a;
        public TextView b;
        public final /* synthetic */ ViewGroup c;

        public b(ViewGroup viewGroup) {
            this.c = viewGroup;
        }

        @Override // xsna.qxt0
        public final View b(Context context) {
            View inflate = LayoutInflater.from(context).inflate(R.layout.picker_adapter_album_spinner_selected, this.c, false);
            this.a = inflate;
            inflate.setLayoutParams(new AbsListView.LayoutParams(-2, -1));
            View view = this.a;
            if (view == null) {
                view = null;
            }
            this.b = (TextView) view.findViewById(R.id.tv_title);
            View view2 = this.a;
            if (view2 == null) {
                return null;
            }
            return view2;
        }

        @Override // xsna.qxt0
        public final void c(Context context, Object obj, int i) {
            String str;
            AlbumEntry albumEntry = (AlbumEntry) obj;
            if (albumEntry == null || (str = albumEntry.c) == null) {
                return;
            }
            TextView textView = this.b;
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

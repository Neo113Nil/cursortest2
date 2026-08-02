package xsna;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.FrameLayout;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import com.vk.core.view.TintTextView;
import com.vk.imageloader.ImageScreenSize;
import com.vk.imageloader.view.VKImageView;
import com.vk.mediastore.system.AlbumEntry;
import com.vk.mediastore.system.MediaStoreEntry;
import com.vkontakte.android.R;
import java.lang.reflect.Field;
import java.util.ArrayList;
import xsna.e3m;

/* compiled from: AttachGalleryAlbumsAdapter.kt */
/* loaded from: classes15.dex */
public final class d24 extends BaseAdapter implements SpinnerAdapter {
    public final ArrayList b = new ArrayList();

    /* compiled from: AttachGalleryAlbumsAdapter.kt */
    public static final class a extends qxt0<AlbumEntry> {
        public final ViewGroup a;
        public View b;
        public TintTextView c;

        public a(ViewGroup viewGroup) {
            this.a = viewGroup;
        }

        @Override // xsna.qxt0
        public final View b(Context context) {
            View inflate = LayoutInflater.from(context).inflate(R.layout.holder_attach_spinner_item, this.a, false);
            this.b = inflate;
            this.c = inflate != null ? (TintTextView) inflate.findViewById(R.id.attach_spinner_item_text) : null;
            return this.b;
        }

        @Override // xsna.qxt0
        public final void c(Context context, Object obj, int i) {
            String str;
            AlbumEntry albumEntry = (AlbumEntry) obj;
            TintTextView tintTextView = this.c;
            if (tintTextView == null || albumEntry == null || (str = albumEntry.c) == null) {
                return;
            }
            tintTextView.setText(str);
        }
    }

    /* compiled from: AttachGalleryAlbumsAdapter.kt */
    public static final class b extends qxt0<AlbumEntry> {
        public final ViewGroup a;
        public View b;
        public VKImageView c;
        public TextView d;
        public TextView e;

        public b(ViewGroup viewGroup) {
            this.a = viewGroup;
        }

        @Override // xsna.qxt0
        public final View b(Context context) {
            TextView textView;
            TextView textView2;
            View inflate = LayoutInflater.from(context).inflate(R.layout.holder_attach_spinner_dropdown_gallery_item, this.a, false);
            bwt0.Z(R.attr.vk_ui_background_content, inflate);
            this.b = inflate;
            this.c = (VKImageView) inflate.findViewById(R.id.holder_attach_gallery_album_image);
            View view = this.b;
            TextView textView3 = null;
            if (view == null || (textView = (TextView) view.findViewById(R.id.holder_attach_gallery_album_title_text)) == null) {
                textView = null;
            } else {
                jno0.c(textView, R.attr.vk_ui_text_primary);
            }
            this.d = textView;
            View view2 = this.b;
            if (view2 != null && (textView2 = (TextView) view2.findViewById(R.id.holder_attach_gallery_album_amount_text)) != null) {
                jno0.c(textView2, R.attr.vk_ui_text_secondary);
                textView3 = textView2;
            }
            this.e = textView3;
            return this.b;
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x003c  */
        /* JADX WARN: Removed duplicated region for block: B:16:0x0040  */
        @Override // xsna.qxt0
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void c(Context context, Object obj, int i) {
            Resources resources;
            dpg0 dpg0Var;
            AlbumEntry albumEntry = (AlbumEntry) obj;
            if (albumEntry == null) {
                return;
            }
            int i2 = albumEntry.f;
            VKImageView vKImageView = this.c;
            if (vKImageView != null) {
                MediaStoreEntry mediaStoreEntry = (MediaStoreEntry) j5g.a0(albumEntry.d);
                if ((mediaStoreEntry != null ? mediaStoreEntry.f() : null) == null) {
                    if (context != null) {
                        e3m.a aVar = e3m.a;
                        Drawable a = m33.a(R.drawable.vk_icon_deprecated_picker_ic_gallery_more_photos, context);
                        if (a != null) {
                            dpg0Var = new dpg0(a, iah0.a(4));
                            if (dpg0Var != null) {
                                vKImageView.setImageResource(R.drawable.vk_icon_deprecated_picker_ic_gallery_more_photos);
                            } else {
                                vKImageView.setImageDrawable(dpg0Var);
                            }
                        }
                    }
                    dpg0Var = null;
                    if (dpg0Var != null) {
                    }
                } else {
                    Uri f = mediaStoreEntry.f();
                    Field field = mcr0.a;
                    vKImageView.L0(f, ImageScreenSize.SMALL);
                }
            }
            int i3 = 0;
            if (i2 == 0) {
                TextView textView = this.d;
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) (textView != null ? textView.getLayoutParams() : null);
                layoutParams.bottomMargin = 0;
                layoutParams.gravity = 16;
                TextView textView2 = this.d;
                if (textView2 != null) {
                    textView2.setLayoutParams(layoutParams);
                }
                TextView textView3 = this.e;
                if (textView3 != null) {
                    bwt0.p0(textView3, false);
                }
            } else {
                TextView textView4 = this.d;
                FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) (textView4 != null ? textView4.getLayoutParams() : null);
                if (context != null && (resources = context.getResources()) != null) {
                    i3 = resources.getDimensionPixelSize(R.dimen.newsfeed_newpost_holder_attach_gallery_album_title_bottom_space);
                }
                layoutParams2.bottomMargin = i3;
                layoutParams2.gravity = 80;
                TextView textView5 = this.d;
                if (textView5 != null) {
                    textView5.setLayoutParams(layoutParams2);
                }
                TextView textView6 = this.e;
                if (textView6 != null) {
                    bwt0.p0(textView6, true);
                }
                TextView textView7 = this.e;
                if (textView7 != null) {
                    textView7.setText(String.valueOf(i2));
                }
            }
            TextView textView8 = this.d;
            if (textView8 != null) {
                textView8.setText(albumEntry.c);
            }
        }
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        return this.b.size();
    }

    @Override // android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public final View getDropDownView(int i, View view, ViewGroup viewGroup) {
        b bVar = (view == null || view.getTag() == null) ? new b(viewGroup) : (b) view.getTag();
        Context context = e43.a;
        if (context == null) {
            context = null;
        }
        return bVar.a(context, view, i, this.b.get(i));
    }

    @Override // android.widget.Adapter
    public final Object getItem(int i) {
        return this.b.get(i);
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return i;
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        int selectedItemPosition;
        if ((viewGroup instanceof AdapterView) && (selectedItemPosition = ((AdapterView) viewGroup).getSelectedItemPosition()) >= 0) {
            i = selectedItemPosition;
        }
        return ((view == null || view.getTag() == null) ? new a(viewGroup) : (a) view.getTag()).a(viewGroup != null ? viewGroup.getContext() : null, view, i, this.b.get(i));
    }
}

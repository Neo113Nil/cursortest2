package xsna;

import android.content.Context;
import android.database.DataSetObserver;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import com.vkontakte.android.R;
import java.util.List;
import xsna.e3m;

/* compiled from: PlaylistsFiltersAdapter.kt */
/* loaded from: classes3.dex */
public final class ofb0 implements SpinnerAdapter {
    public final List<ucr> b;

    /* compiled from: PlaylistsFiltersAdapter.kt */
    public static final class a {
    }

    /* compiled from: PlaylistsFiltersAdapter.kt */
    public static final class b extends qxt0<ucr> {
        public TextView a;

        @Override // xsna.qxt0
        public final View b(Context context) {
            View inflate = LayoutInflater.from(context).inflate(R.layout.music_playlists_filter_drop_item, (ViewGroup) null);
            this.a = (TextView) inflate;
            return inflate;
        }

        @Override // xsna.qxt0
        public final void c(Context context, Object obj, int i) {
            ucr ucrVar = (ucr) obj;
            TextView textView = this.a;
            if (ucrVar != null) {
                if (textView != null) {
                    textView.setText(ucrVar.b);
                }
                s3q0 s3q0Var = s3q0.a;
            }
            TextView textView2 = this.a;
            if (textView2 != null) {
                textView2.setTextColor(dhr0.t.c(R.attr.vk_ui_text_muted));
            }
            TextView textView3 = this.a;
            if (textView3 != null) {
                textView3.setBackgroundColor(dhr0.t.c(R.attr.vk_ui_background_modal));
            }
        }
    }

    /* compiled from: PlaylistsFiltersAdapter.kt */
    public static final class c extends qxt0<ucr> {
        public final int a;
        public TextView b;

        public c(int i) {
            this.a = i;
        }

        @Override // xsna.qxt0
        public final View b(Context context) {
            View inflate = LayoutInflater.from(context).inflate(R.layout.music_playlist_title1, (ViewGroup) null);
            TextView textView = (TextView) inflate;
            this.b = textView;
            int i = this.a;
            if (i != 0) {
                Context context2 = textView.getContext();
                e3m.a aVar = e3m.a;
                his0.u(textView, m33.a(i, context2), e3m.c(R.attr.vk_ui_icon_accent_themed, textView.getContext()));
            }
            return inflate;
        }

        @Override // xsna.qxt0
        public final void c(Context context, Object obj, int i) {
            ucr ucrVar = (ucr) obj;
            TextView textView = this.b;
            if (ucrVar != null) {
                if (textView != null) {
                    textView.setText(ucrVar.b);
                }
                s3q0 s3q0Var = s3q0.a;
            }
        }
    }

    public ofb0(List<ucr> list) {
        this.b = list;
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        return this.b.size();
    }

    @Override // android.widget.SpinnerAdapter
    public final View getDropDownView(int i, View view, ViewGroup viewGroup) {
        return ((view == null || view.getTag() == null) ? new b() : (b) view.getTag()).a(viewGroup != null ? viewGroup.getContext() : null, view, i, this.b.get(i));
    }

    @Override // android.widget.Adapter
    public final Object getItem(int i) {
        return this.b.get(i);
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return this.b.get(i).a;
    }

    @Override // android.widget.Adapter
    public final int getItemViewType(int i) {
        return 0;
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        c cVar;
        List<ucr> list = this.b;
        if (view == null || view.getTag() == null) {
            cVar = new c(list.size() <= 1 ? 0 : R.drawable.ic_toolbar_spinner_arrow);
        } else {
            cVar = (c) view.getTag();
        }
        return (TextView) cVar.a(viewGroup != null ? viewGroup.getContext() : null, view, i, list.get(i));
    }

    @Override // android.widget.Adapter
    public final int getViewTypeCount() {
        return 1;
    }

    @Override // android.widget.Adapter
    public final boolean hasStableIds() {
        return false;
    }

    @Override // android.widget.Adapter
    public final boolean isEmpty() {
        return this.b.isEmpty();
    }

    @Override // android.widget.Adapter
    public final void registerDataSetObserver(DataSetObserver dataSetObserver) {
    }

    @Override // android.widget.Adapter
    public final void unregisterDataSetObserver(DataSetObserver dataSetObserver) {
    }
}

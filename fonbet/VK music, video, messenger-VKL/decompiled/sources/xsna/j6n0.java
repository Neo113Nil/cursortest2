package xsna;

import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;

/* compiled from: SuggestionsAdapter.java */
/* loaded from: classes11.dex */
public final class j6n0 extends lag0 implements View.OnClickListener {
    public int f;
    public int g;
    public int h;
    public int i;
    public int j;
    public int k;
    public int l;

    /* compiled from: SuggestionsAdapter.java */
    public static final class a {
    }

    public j6n0() {
        throw null;
    }

    @Override // xsna.tlk
    public final void a(View view, Cursor cursor) {
        a aVar = (a) view.getTag();
        int i = this.l;
        int i2 = i != -1 ? cursor.getInt(i) : 0;
        aVar.getClass();
        int i3 = this.f;
        if (i3 != 2 && (i3 != 1 || (i2 & 1) == 0)) {
            throw null;
        }
        throw null;
    }

    @Override // xsna.tlk
    public final void b(Cursor cursor) {
        try {
            super.b(cursor);
            if (cursor != null) {
                this.g = cursor.getColumnIndex("suggest_text_1");
                this.h = cursor.getColumnIndex("suggest_text_2");
                this.i = cursor.getColumnIndex("suggest_text_2_url");
                this.j = cursor.getColumnIndex("suggest_icon_1");
                this.k = cursor.getColumnIndex("suggest_icon_2");
                this.l = cursor.getColumnIndex("suggest_flags");
            }
        } catch (Exception e) {
            Log.e("SuggestionsAdapter", "error changing cursor and caching columns", e);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:?, code lost:
    
        throw null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Drawable c(String str) {
        if (str != null && !str.isEmpty() && !"0".equals(str)) {
            try {
                Integer.parseInt(str);
                throw null;
            } catch (Resources.NotFoundException unused) {
            } catch (NumberFormatException unused2) {
                throw null;
            }
        }
        return null;
    }

    @Override // xsna.tlk, android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public final View getDropDownView(int i, View view, ViewGroup viewGroup) {
        try {
            return super.getDropDownView(i, view, viewGroup);
        } catch (RuntimeException unused) {
            throw null;
        }
    }

    @Override // xsna.tlk, android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        try {
            super.getView(i, view, viewGroup);
            return view;
        } catch (RuntimeException unused) {
            throw null;
        }
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public final boolean hasStableIds() {
        return false;
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetChanged() {
        super.notifyDataSetChanged();
        Cursor cursor = this.c;
        Bundle extras = cursor != null ? cursor.getExtras() : null;
        if (extras != null) {
            extras.getBoolean("in_progress");
        }
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetInvalidated() {
        super.notifyDataSetInvalidated();
        Cursor cursor = this.c;
        Bundle extras = cursor != null ? cursor.getExtras() : null;
        if (extras != null) {
            extras.getBoolean("in_progress");
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (view.getTag() instanceof CharSequence) {
            throw null;
        }
    }
}

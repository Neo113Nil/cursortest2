package xsna;

import android.database.Cursor;
import android.util.Log;
import android.widget.Filter;

/* compiled from: CursorFilter.java */
/* loaded from: classes12.dex */
public final class cmk extends Filter {
    public tlk a;

    @Override // android.widget.Filter
    public final CharSequence convertResultToString(Object obj) {
        Cursor cursor = (Cursor) obj;
        ((j6n0) this.a).getClass();
        if (cursor == null) {
            return null;
        }
        int columnIndex = cursor.getColumnIndex("suggest_intent_query");
        String str = null;
        if (columnIndex != -1) {
            try {
                str = cursor.getString(columnIndex);
            } catch (Exception e) {
                Log.e("SuggestionsAdapter", "unexpected error retrieving valid column from cursor, did the remote process die?", e);
            }
        }
        str.getClass();
        return str;
    }

    @Override // android.widget.Filter
    public final Filter.FilterResults performFiltering(CharSequence charSequence) {
        ((j6n0) this.a).getClass();
        if (charSequence != null) {
            charSequence.toString();
        }
        throw null;
    }

    @Override // android.widget.Filter
    public final void publishResults(CharSequence charSequence, Filter.FilterResults filterResults) {
        tlk tlkVar = this.a;
        Cursor cursor = tlkVar.c;
        Object obj = filterResults.values;
        if (obj == null || obj == cursor) {
            return;
        }
        ((j6n0) tlkVar).b((Cursor) obj);
    }
}

package androidx.appcompat.app;

import android.R;
import android.content.Context;
import android.database.Cursor;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckedTextView;
import android.widget.CursorAdapter;
import defpackage.rq1;

/* loaded from: classes10.dex */
class AlertController$AlertParams$2 extends CursorAdapter {
    private final int mIsCheckedIndex;
    private final int mLabelIndex;
    final /* synthetic */ rq1 this$0;
    final /* synthetic */ a val$dialog;
    final /* synthetic */ AlertController$RecycleListView val$listView;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AlertController$AlertParams$2(rq1 rq1Var, Context context, Cursor cursor, boolean z, AlertController$RecycleListView alertController$RecycleListView, a aVar) {
        super(context, cursor, z);
        this.this$0 = rq1Var;
        this.val$listView = alertController$RecycleListView;
        this.val$dialog = aVar;
        Cursor cursor2 = getCursor();
        rq1Var.getClass();
        this.mLabelIndex = cursor2.getColumnIndexOrThrow(null);
        rq1Var.getClass();
        this.mIsCheckedIndex = cursor2.getColumnIndexOrThrow(null);
    }

    @Override // android.widget.CursorAdapter
    public void bindView(View view, Context context, Cursor cursor) {
        ((CheckedTextView) view.findViewById(R.id.text1)).setText(cursor.getString(this.mLabelIndex));
        this.val$listView.setItemChecked(cursor.getPosition(), cursor.getInt(this.mIsCheckedIndex) == 1);
    }

    @Override // android.widget.CursorAdapter
    public View newView(Context context, Cursor cursor, ViewGroup viewGroup) {
        return this.this$0.b.inflate(this.val$dialog.L, viewGroup, false);
    }
}

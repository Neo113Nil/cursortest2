package androidx.cursoradapter.widget;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import defpackage.ids0;
import defpackage.jds0;
import defpackage.ny61;

/* loaded from: classes10.dex */
public class SimpleCursorAdapter extends ResourceCursorAdapter {
    private ids0 mCursorToStringConverter;
    protected int[] mFrom;
    String[] mOriginalFrom;
    private int mStringConversionColumn;
    protected int[] mTo;
    private jds0 mViewBinder;

    @Deprecated
    public SimpleCursorAdapter(Context context, int i, Cursor cursor, String[] strArr, int[] iArr) {
        super(context, i, cursor);
        this.mStringConversionColumn = -1;
        this.mTo = iArr;
        this.mOriginalFrom = strArr;
        findColumns(cursor, strArr);
    }

    private void findColumns(Cursor cursor, String[] strArr) {
        if (cursor == null) {
            this.mFrom = null;
            return;
        }
        int length = strArr.length;
        int[] iArr = this.mFrom;
        if (iArr == null || iArr.length != length) {
            this.mFrom = new int[length];
        }
        for (int i = 0; i < length; i++) {
            this.mFrom[i] = cursor.getColumnIndexOrThrow(strArr[i]);
        }
    }

    @Override // androidx.cursoradapter.widget.CursorAdapter
    public void bindView(View view, Context context, Cursor cursor) {
        int[] iArr = this.mTo;
        int length = iArr.length;
        int[] iArr2 = this.mFrom;
        for (int i = 0; i < length; i++) {
            View findViewById = view.findViewById(iArr[i]);
            if (findViewById != null) {
                String string = cursor.getString(iArr2[i]);
                if (string == null) {
                    string = "";
                }
                if (findViewById instanceof TextView) {
                    setViewText((TextView) findViewById, string);
                } else {
                    if (!(findViewById instanceof ImageView)) {
                        ny61.r(findViewById.getClass().getName().concat(" is not a  view that can be bounds by this SimpleCursorAdapter"));
                        return;
                    }
                    setViewImage((ImageView) findViewById, string);
                }
            }
        }
    }

    public void changeCursorAndColumns(Cursor cursor, String[] strArr, int[] iArr) {
        this.mOriginalFrom = strArr;
        this.mTo = iArr;
        findColumns(cursor, strArr);
        super.changeCursor(cursor);
    }

    @Override // androidx.cursoradapter.widget.CursorAdapter, defpackage.kif
    public CharSequence convertToString(Cursor cursor) {
        int i = this.mStringConversionColumn;
        return i > -1 ? cursor.getString(i) : super.convertToString(cursor);
    }

    public ids0 getCursorToStringConverter() {
        return null;
    }

    public int getStringConversionColumn() {
        return this.mStringConversionColumn;
    }

    public jds0 getViewBinder() {
        return null;
    }

    public void setCursorToStringConverter(ids0 ids0Var) {
    }

    public void setStringConversionColumn(int i) {
        this.mStringConversionColumn = i;
    }

    public void setViewBinder(jds0 jds0Var) {
    }

    public void setViewImage(ImageView imageView, String str) {
        try {
            imageView.setImageResource(Integer.parseInt(str));
        } catch (NumberFormatException unused) {
            imageView.setImageURI(Uri.parse(str));
        }
    }

    public void setViewText(TextView textView, String str) {
        textView.setText(str);
    }

    @Override // androidx.cursoradapter.widget.CursorAdapter
    public Cursor swapCursor(Cursor cursor) {
        findColumns(cursor, this.mOriginalFrom);
        return super.swapCursor(cursor);
    }

    public SimpleCursorAdapter(Context context, int i, Cursor cursor, String[] strArr, int[] iArr, int i2) {
        super(context, i, cursor, i2);
        this.mStringConversionColumn = -1;
        this.mTo = iArr;
        this.mOriginalFrom = strArr;
        findColumns(cursor, strArr);
    }
}

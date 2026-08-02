package com.yandex.div.core.view2.backbutton;

import android.content.Context;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.yandex.div.core.view2.backbutton.BackKeyPressedHelper;
import io.requery.android.database.sqlite.SQLiteDatabase;

/* compiled from: BackHandlingRecyclerView.kt */
/* loaded from: classes7.dex */
public class BackHandlingRecyclerView extends RecyclerView {
    private final BackKeyPressedHelper backKeyPressedHelper;

    public BackHandlingRecyclerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.backKeyPressedHelper = new BackKeyPressedHelper(this);
    }

    @Override // android.view.View
    public boolean onKeyPreIme(int i, KeyEvent keyEvent) {
        return this.backKeyPressedHelper.onKeyAction(i, keyEvent) || super.onKeyPreIme(i, keyEvent);
    }

    @Override // android.view.View
    public void onVisibilityChanged(View view, int i) {
        this.backKeyPressedHelper.onVisibilityChanged();
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        this.backKeyPressedHelper.onWindowFocusChanged(z);
    }

    public void setOnBackClickListener(BackKeyPressedHelper.OnBackClickListener onBackClickListener) {
        setDescendantFocusability(onBackClickListener != null ? 131072 : SQLiteDatabase.OPEN_PRIVATECACHE);
        this.backKeyPressedHelper.setOnBackClickListener(onBackClickListener);
    }
}

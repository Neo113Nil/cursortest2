package com.vkontakte.android.ui;

import android.R;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewDebug;
import android.widget.Checkable;
import android.widget.CompoundButton;
import android.widget.RelativeLayout;

@Deprecated
/* loaded from: classes7.dex */
public class CheckableRelativeLayout extends RelativeLayout implements Checkable {
    public CompoundButton b;
    public b c;
    public final a d;

    public class a implements CompoundButton.OnCheckedChangeListener {
        public a() {
        }

        @Override // android.widget.CompoundButton.OnCheckedChangeListener
        public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            CheckableRelativeLayout checkableRelativeLayout = CheckableRelativeLayout.this;
            b bVar = checkableRelativeLayout.c;
            if (bVar != null) {
                bVar.b(checkableRelativeLayout, z);
            }
        }
    }

    public interface b {
        void b(View view, boolean z);
    }

    public CheckableRelativeLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.d = new a();
    }

    @Override // android.widget.Checkable
    @ViewDebug.ExportedProperty
    public final boolean isChecked() {
        return this.b.isChecked();
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        CompoundButton compoundButton = (CompoundButton) findViewById(R.id.checkbox);
        this.b = compoundButton;
        compoundButton.setOnCheckedChangeListener(this.d);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        return ((action == 0 || action == 3 || action == 1) ? this.b.onTouchEvent(motionEvent) : false) || super.onTouchEvent(motionEvent);
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z) {
        CompoundButton compoundButton = this.b;
        if (compoundButton != null) {
            compoundButton.setChecked(z);
        }
        b bVar = this.c;
        if (bVar != null) {
            bVar.b(this, z);
        }
    }

    public void setOnCheckedChangedListener(b bVar) {
        this.c = bVar;
    }

    @Override // android.widget.Checkable
    public final void toggle() {
        this.b.toggle();
    }
}

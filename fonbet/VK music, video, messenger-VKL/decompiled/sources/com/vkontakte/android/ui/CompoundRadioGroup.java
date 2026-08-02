package com.vkontakte.android.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Checkable;
import android.widget.LinearLayout;
import com.vkontakte.android.ui.CheckableRelativeLayout;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes7.dex */
public class CompoundRadioGroup extends LinearLayout {
    public final ArrayList b;
    public int c;
    public CheckableRelativeLayout.b d;
    public final a e;

    public class a implements CheckableRelativeLayout.b {
        public a() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.vkontakte.android.ui.CheckableRelativeLayout.b
        public final void b(View view, boolean z) {
            CompoundRadioGroup compoundRadioGroup = CompoundRadioGroup.this;
            if (z) {
                compoundRadioGroup.c = view.getId();
                Iterator it = compoundRadioGroup.b.iterator();
                while (it.hasNext()) {
                    KeyEvent.Callback callback = (View) it.next();
                    if (view != callback) {
                        ((Checkable) callback).setChecked(false);
                    }
                }
            }
            CheckableRelativeLayout.b bVar = compoundRadioGroup.d;
            if (bVar != null) {
                bVar.b(view, ((Checkable) view).isChecked());
            }
        }
    }

    public CompoundRadioGroup(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.b = new ArrayList();
        this.c = -1;
        this.e = new a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i, layoutParams);
        if (view instanceof CheckableRelativeLayout) {
            ArrayList arrayList = this.b;
            arrayList.add(view);
            ((CheckableRelativeLayout) view).setOnCheckedChangedListener(this.e);
            Checkable checkable = (Checkable) view;
            if (checkable.isChecked()) {
                this.c = view.getId();
                CheckableRelativeLayout.b bVar = this.d;
                if (bVar != null) {
                    bVar.b(view, checkable.isChecked());
                }
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    checkable.setChecked(view == ((View) it.next()));
                }
            }
        }
    }

    public int getCheckedId() {
        return this.c;
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
    }

    public void setCheckedId(int i) {
        ((Checkable) findViewById(i)).setChecked(true);
    }

    public void setOnCheckedChangeListener(CheckableRelativeLayout.b bVar) {
        this.d = bVar;
    }
}

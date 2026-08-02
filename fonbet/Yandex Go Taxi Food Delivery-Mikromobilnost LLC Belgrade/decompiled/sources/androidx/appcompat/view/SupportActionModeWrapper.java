package androidx.appcompat.view;

import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import androidx.appcompat.view.menu.MenuWrapperICS;
import defpackage.vw;

/* loaded from: classes10.dex */
public class SupportActionModeWrapper extends ActionMode {
    final Context mContext;
    final vw mWrappedObject;

    public SupportActionModeWrapper(Context context, vw vwVar) {
        this.mContext = context;
        this.mWrappedObject = vwVar;
    }

    @Override // android.view.ActionMode
    public void finish() {
        this.mWrappedObject.a();
    }

    @Override // android.view.ActionMode
    public View getCustomView() {
        return this.mWrappedObject.b();
    }

    @Override // android.view.ActionMode
    public Menu getMenu() {
        return new MenuWrapperICS(this.mContext, this.mWrappedObject.c());
    }

    @Override // android.view.ActionMode
    public MenuInflater getMenuInflater() {
        return this.mWrappedObject.d();
    }

    @Override // android.view.ActionMode
    public CharSequence getSubtitle() {
        return this.mWrappedObject.e();
    }

    @Override // android.view.ActionMode
    public Object getTag() {
        return this.mWrappedObject.a;
    }

    @Override // android.view.ActionMode
    public CharSequence getTitle() {
        return this.mWrappedObject.f();
    }

    @Override // android.view.ActionMode
    public boolean getTitleOptionalHint() {
        return this.mWrappedObject.b;
    }

    @Override // android.view.ActionMode
    public void invalidate() {
        this.mWrappedObject.g();
    }

    @Override // android.view.ActionMode
    public boolean isTitleOptional() {
        return this.mWrappedObject.h();
    }

    @Override // android.view.ActionMode
    public void setCustomView(View view) {
        this.mWrappedObject.i(view);
    }

    @Override // android.view.ActionMode
    public void setSubtitle(CharSequence charSequence) {
        this.mWrappedObject.k(charSequence);
    }

    @Override // android.view.ActionMode
    public void setTag(Object obj) {
        this.mWrappedObject.a = obj;
    }

    @Override // android.view.ActionMode
    public void setTitle(CharSequence charSequence) {
        this.mWrappedObject.m(charSequence);
    }

    @Override // android.view.ActionMode
    public void setTitleOptionalHint(boolean z) {
        this.mWrappedObject.n(z);
    }

    @Override // android.view.ActionMode
    public void setSubtitle(int i) {
        this.mWrappedObject.j(i);
    }

    @Override // android.view.ActionMode
    public void setTitle(int i) {
        this.mWrappedObject.l(i);
    }
}

package com.ybsdk.core.presentation;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.view.LayoutInflater;
import androidx.appcompat.app.b;
import defpackage.cr2;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/ybsdk/core/presentation/AppCompatContextWrapper;", "Landroid/content/ContextWrapper;", "baseContext", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "inflater", "Landroid/view/LayoutInflater;", "getSystemService", "", "name", "", "core-presentation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class AppCompatContextWrapper extends ContextWrapper {
    private LayoutInflater inflater;

    public AppCompatContextWrapper(Context context) {
        super(context);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Object getSystemService(String name) {
        if (!"layout_inflater".equals(name)) {
            return getBaseContext().getSystemService(name);
        }
        LayoutInflater layoutInflater = this.inflater;
        if (layoutInflater != null) {
            return layoutInflater;
        }
        LayoutInflater cloneInContext = LayoutInflater.from(getBaseContext()).cloneInContext(this);
        cloneInContext.setFactory2((LayoutInflater.Factory2) b.create((Activity) getBaseContext(), (cr2) null));
        this.inflater = cloneInContext;
        return cloneInContext;
    }
}

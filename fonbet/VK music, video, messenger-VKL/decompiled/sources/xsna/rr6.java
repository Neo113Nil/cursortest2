package xsna;

import android.content.Context;
import android.view.View;

/* compiled from: BaseView.java */
/* loaded from: classes2.dex */
public interface rr6<T> {
    T getPresenter();

    View getView();

    Context getViewContext();

    void pause();

    void release();

    void resume();

    void setPresenter(T t);
}

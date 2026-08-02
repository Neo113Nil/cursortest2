package xsna;

import android.view.View;
import java.util.List;

/* compiled from: FlexContainer.java */
/* loaded from: classes12.dex */
public interface eor {
    int a(int i, int i2, View view);

    int c(View view);

    void f(com.google.android.flexbox.a aVar);

    void g(View view, int i, int i2, com.google.android.flexbox.a aVar);

    int getAlignContent();

    int getAlignItems();

    int getFlexDirection();

    int getFlexItemCount();

    List<com.google.android.flexbox.a> getFlexLinesInternal();

    int getFlexWrap();

    int getLargestMainSize();

    int getMaxLine();

    int getPaddingBottom();

    int getPaddingEnd();

    int getPaddingLeft();

    int getPaddingRight();

    int getPaddingStart();

    int getPaddingTop();

    int getSumOfCrossSize();

    View h(int i);

    int i(int i, int i2, int i3);

    View j(int i);

    int k(int i, int i2, int i3);

    void l(int i, View view);

    boolean m();

    void setFlexLines(List<com.google.android.flexbox.a> list);
}

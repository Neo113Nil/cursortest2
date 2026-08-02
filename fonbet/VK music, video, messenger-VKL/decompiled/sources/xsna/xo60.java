package xsna;

import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

/* compiled from: NewsfeedListDiffer.kt */
/* loaded from: classes4.dex */
public interface xo60 {
    boolean a(List<? extends ol60> list);

    ol60 b(int i);

    long c(int i);

    void clear();

    void d(List<? extends ol60> list, c9x c9xVar);

    void e(RecyclerView recyclerView, Runnable runnable, Runnable runnable2, List list, c9x c9xVar);

    ol60 getItem(int i);

    int getItemCount();

    List<ol60> getItems();
}

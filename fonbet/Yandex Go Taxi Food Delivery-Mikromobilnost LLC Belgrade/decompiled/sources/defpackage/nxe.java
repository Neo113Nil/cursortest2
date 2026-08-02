package defpackage;

import java.util.List;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002À\u0006\u0003"}, d2 = {"Lnxe;", "Lewe;", "base"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes5.dex */
public interface nxe extends ewe {
    void displayListResult(List list);

    void hideProgress();

    void notifyItemChanged(int i);

    void setFilterHint(int i);

    default void setFilterValue(String str) {
        setFilterValue(str, false);
    }

    void setFilterValue(String str, boolean z);

    void showProgress();

    void updateSelection(mxe mxeVar);
}

package defpackage;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import yads.mo;

/* loaded from: classes7.dex */
public final /* synthetic */ class myv0 implements Runnable {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ ViewGroup b;
    public final /* synthetic */ boolean c;

    public /* synthetic */ myv0(ViewGroup viewGroup, boolean z) {
        this.b = viewGroup;
        this.c = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int childCount;
        int i = this.a;
        boolean z = this.c;
        ViewGroup viewGroup = this.b;
        switch (i) {
            case 0:
                if (z) {
                    viewGroup.setVisibility(0);
                    break;
                }
                break;
            default:
                if (viewGroup != null && viewGroup.getChildCount() > 0 && (childCount = viewGroup.getChildCount() - (!z ? 1 : 0)) > 0) {
                    ArrayList arrayList = new ArrayList(childCount);
                    for (int i2 = 0; i2 < childCount; i2++) {
                        View childAt = viewGroup.getChildAt(i2);
                        if (childAt instanceof mo) {
                            arrayList.add(childAt);
                        }
                    }
                    viewGroup.removeViews(0, childCount);
                    int size = arrayList.size();
                    for (int i3 = 0; i3 < size; i3++) {
                        ((mo) arrayList.get(i3)).b();
                    }
                    arrayList.clear();
                    break;
                }
                break;
        }
    }

    public /* synthetic */ myv0(boolean z, ViewGroup viewGroup) {
        this.c = z;
        this.b = viewGroup;
    }
}

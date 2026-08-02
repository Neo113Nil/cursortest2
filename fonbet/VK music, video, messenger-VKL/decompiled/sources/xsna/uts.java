package xsna;

import android.content.Context;
import android.content.res.Resources;
import com.vk.core.fragments.FragmentImpl;

/* compiled from: FriendsTab.kt */
/* loaded from: classes15.dex */
public final class uts {
    public final FragmentImpl a;
    public final int b;
    public final int c;
    public final int d;
    public final izs<aus, Integer> e;
    public final int f;
    public int g;

    /* JADX WARN: Multi-variable type inference failed */
    public uts(FragmentImpl fragmentImpl, int i, int i2, int i3, izs<? super aus, Integer> izsVar, int i4) {
        this.a = fragmentImpl;
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = izsVar;
        this.f = i4;
    }

    public final FragmentImpl a() {
        return this.a;
    }

    public final String b(Context context) {
        if (this.g == 0) {
            return context.getString(this.c);
        }
        Resources resources = context.getResources();
        int i = this.g;
        return resources.getQuantityString(this.d, i, Integer.valueOf(i));
    }

    public final int c() {
        return this.f;
    }

    public final void d(aus ausVar) {
        izs<aus, Integer> izsVar = this.e;
        this.g = izsVar != null ? izsVar.invoke(ausVar).intValue() : 0;
    }
}

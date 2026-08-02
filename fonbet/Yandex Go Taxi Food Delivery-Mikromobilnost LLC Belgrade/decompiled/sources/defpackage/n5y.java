package defpackage;

import androidx.compose.foundation.lazy.layout.h;
import java.util.Comparator;

/* loaded from: classes10.dex */
public final class n5y implements Comparator {
    public final /* synthetic */ int a;
    public final /* synthetic */ h b;

    public /* synthetic */ n5y(h hVar, int i) {
        this.a = i;
        this.b = hVar;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int i = this.a;
        h hVar = this.b;
        switch (i) {
        }
        return Integer.valueOf(hVar.a(((u5y) obj2).getKey())).compareTo(Integer.valueOf(hVar.a(((u5y) obj).getKey())));
    }
}

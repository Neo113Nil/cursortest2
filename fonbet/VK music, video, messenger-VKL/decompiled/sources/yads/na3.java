package yads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes10.dex */
public final class na3 {
    public final String a;
    public final List b;
    public final byte[] c;

    public na3(int i, String str, ArrayList arrayList, byte[] bArr) {
        this.a = str;
        this.b = arrayList == null ? Collections.EMPTY_LIST : Collections.unmodifiableList(arrayList);
        this.c = bArr;
    }
}

package xsna;

import java.util.HashMap;

/* compiled from: ValidatorSet.kt */
/* loaded from: classes17.dex */
public final class ijr0 {
    public int a;
    public int b;
    public int c;
    public final HashMap<Integer, Integer> d = new HashMap<>();
    public m4g e;
    public boolean f;

    public ijr0(int... iArr) {
        for (int i : iArr) {
            a(i, false);
        }
    }

    public final void a(int i, boolean z) {
        Integer valueOf = Integer.valueOf(i);
        HashMap<Integer, Integer> hashMap = this.d;
        if (!hashMap.containsKey(valueOf)) {
            hashMap.put(Integer.valueOf(i), Integer.valueOf(this.c));
            int i2 = this.b;
            int i3 = this.c;
            this.b = i2 | (1 << i3);
            this.c = i3 + 1;
        }
        int intValue = hashMap.get(Integer.valueOf(i)).intValue();
        int i4 = this.a;
        if ((i4 >> intValue) % 2 != z) {
            this.a = (1 << intValue) ^ i4;
        }
        m4g m4gVar = this.e;
        if (m4gVar != null) {
            boolean z2 = (this.b ^ this.a) == 0;
            if (z2 != this.f) {
                this.f = z2;
                m4gVar.invoke(Boolean.valueOf(z2));
            }
        }
    }
}

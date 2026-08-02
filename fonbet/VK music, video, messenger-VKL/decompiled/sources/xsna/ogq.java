package xsna;

import android.graphics.Bitmap;
import java.util.ArrayList;
import java.util.HashMap;
import xsna.sg90;

/* compiled from: ExtractDominantColorPostProcessor.kt */
/* loaded from: classes3.dex */
public final class ogq extends mk6 {
    public static final HashMap<String, Integer> f = new HashMap<>();
    public final io.reactivex.rxjava3.subjects.d<Integer> c = io.reactivex.rxjava3.subjects.d.N0();
    public final ppj0 d = new ppj0("ExtractDominantColorPostProcessor");
    public String e;

    @Override // xsna.mk6, xsna.ktc0
    public final ww8 a() {
        return this.d;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.mk6
    public final void d(Bitmap bitmap) {
        int intValue;
        String str = this.e;
        HashMap<String, Integer> hashMap = f;
        Integer num = hashMap.get(str);
        if (num != null) {
            intValue = num.intValue();
        } else {
            sg90.b bVar = new sg90.b(bitmap);
            ArrayList arrayList = bVar.b;
            if (arrayList != null) {
                arrayList.clear();
            }
            v3o0 v3o0Var = v3o0.e;
            bVar.a(v3o0Var);
            bVar.d = 256;
            bVar.e = -1;
            sg90 b = bVar.b();
            sg90.d dVar = (sg90.d) b.c.get(v3o0Var);
            Integer valueOf = (dVar == null && (dVar = b.e) == null) ? null : Integer.valueOf(dVar.d);
            intValue = valueOf != null ? valueOf.intValue() : 0;
        }
        if (str != null) {
            hashMap.put(str, Integer.valueOf(intValue));
        }
        this.c.onNext(Integer.valueOf(intValue));
        if (hashMap.size() < 64) {
            return;
        }
        for (String str2 : hashMap.keySet()) {
            if (!mcr0.p(str2)) {
                hashMap.remove(str2);
            }
        }
    }

    @Override // xsna.mk6, xsna.ktc0
    public final String getName() {
        return "ExtractDominantColorPostProcessor";
    }

    public final String toString() {
        return "ExtractDominantColorPostProcessor";
    }
}

package yads;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import java.io.DataInputStream;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;

/* loaded from: classes10.dex */
public final class ls {
    public final HashMap a = new HashMap();
    public final SparseArray b = new SparseArray();
    public final SparseBooleanArray c = new SparseBooleanArray();
    public final SparseBooleanArray d = new SparseBooleanArray();
    public final ks e;
    public ks f;

    public ls(kn0 kn0Var, File file) {
        is isVar = new is(kn0Var);
        js jsVar = new js(new File(file, "monetization_cached_content_index.exi"));
        this.e = isVar;
        this.f = jsVar;
    }

    public final hs a(String str) {
        hs hsVar = (hs) this.a.get(str);
        if (hsVar != null) {
            return hsVar;
        }
        SparseArray sparseArray = this.b;
        int size = sparseArray.size();
        int i = 0;
        int keyAt = size == 0 ? 0 : sparseArray.keyAt(size - 1) + 1;
        if (keyAt < 0) {
            while (i < size && i == sparseArray.keyAt(i)) {
                i++;
            }
            keyAt = i;
        }
        hs hsVar2 = new hs(keyAt, str, jc0.c);
        this.a.put(str, hsVar2);
        this.b.put(keyAt, str);
        this.d.put(keyAt, true);
        this.e.a(hsVar2);
        return hsVar2;
    }

    public final void b(String str) {
        hs hsVar = (hs) this.a.get(str);
        if (hsVar != null && hsVar.c.isEmpty() && hsVar.d.isEmpty()) {
            this.a.remove(str);
            int i = hsVar.a;
            boolean z = this.d.get(i);
            this.e.a(hsVar, z);
            if (z) {
                this.b.remove(i);
                this.d.delete(i);
            } else {
                this.b.put(i, null);
                this.c.put(i, true);
            }
        }
    }

    public final void a(long j) {
        ks ksVar;
        this.e.a(j);
        ks ksVar2 = this.f;
        if (ksVar2 != null) {
            ksVar2.a(j);
        }
        if (!this.e.a() && (ksVar = this.f) != null && ksVar.a()) {
            this.f.a(this.a, this.b);
            this.e.b(this.a);
        } else {
            this.e.a(this.a, this.b);
        }
        ks ksVar3 = this.f;
        if (ksVar3 != null) {
            ksVar3.b();
            this.f = null;
        }
    }

    public static jc0 a(DataInputStream dataInputStream) {
        int readInt = dataInputStream.readInt();
        HashMap hashMap = new HashMap();
        for (int i = 0; i < readInt; i++) {
            String readUTF = dataInputStream.readUTF();
            int readInt2 = dataInputStream.readInt();
            if (readInt2 >= 0) {
                int min = Math.min(readInt2, 10485760);
                byte[] bArr = mc3.f;
                int i2 = 0;
                while (i2 != readInt2) {
                    int i3 = i2 + min;
                    bArr = Arrays.copyOf(bArr, i3);
                    dataInputStream.readFully(bArr, i2, min);
                    min = Math.min(readInt2 - i3, 10485760);
                    i2 = i3;
                }
                hashMap.put(readUTF, bArr);
            } else {
                throw new IOException(nh2.a("Invalid value size: ", readInt2));
            }
        }
        return new jc0(hashMap);
    }

    public final void a() {
        this.e.a(this.a);
        int size = this.c.size();
        for (int i = 0; i < size; i++) {
            this.b.remove(this.c.keyAt(i));
        }
        this.c.clear();
        this.d.clear();
    }
}

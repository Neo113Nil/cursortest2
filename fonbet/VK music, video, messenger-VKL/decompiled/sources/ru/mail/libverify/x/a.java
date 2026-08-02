package ru.mail.libverify.x;

import androidx.annotation.NonNull;
import io.reactivex.rxjava3.internal.operators.mixed.j;
import java.util.ArrayList;
import ru.mail.libverify.x.a.InterfaceC2219a;

/* loaded from: classes9.dex */
final class a<T extends InterfaceC2219a> {
    private final ArrayList<T> a = new ArrayList<>();

    /* renamed from: ru.mail.libverify.x.a$a, reason: collision with other inner class name */
    public interface InterfaceC2219a {
        long a();

        long b();
    }

    public final T a(int i) {
        return this.a.get(i);
    }

    public final int b(@NonNull d dVar) {
        int a = a(dVar.b());
        if (a >= 0) {
            this.a.add(a, dVar);
            return a;
        }
        int i = ~a;
        if (i == this.a.size()) {
            this.a.add(dVar);
            return i;
        }
        this.a.add(i, dVar);
        return i;
    }

    public final void c(@NonNull d dVar) {
        int a = a(dVar);
        if (a >= 0) {
            this.a.remove(a);
        }
    }

    @NonNull
    public final String toString() {
        return j.b('}', new StringBuilder("LongSortedArray{items="), this.a);
    }

    public final int a(@NonNull d dVar) {
        int a = a(dVar.b());
        if (a < 0) {
            return a;
        }
        for (int i = a; i < this.a.size(); i++) {
            T t = this.a.get(i);
            if (t.b() != dVar.b()) {
                break;
            }
            if (t.a() == dVar.a()) {
                return i;
            }
        }
        for (int i2 = a - 1; i2 >= 0; i2--) {
            T t2 = this.a.get(i2);
            if (t2.b() != dVar.b()) {
                return -1;
            }
            if (t2.a() == dVar.a()) {
                return i2;
            }
        }
        return -1;
    }

    public final int a() {
        return this.a.size();
    }

    private int a(long j) {
        int size = this.a.size() - 1;
        int i = 0;
        while (i <= size) {
            int i2 = (i + size) >>> 1;
            long b = this.a.get(i2).b();
            if (b < j) {
                i = i2 + 1;
            } else {
                if (b <= j) {
                    return i2;
                }
                size = i2 - 1;
            }
        }
        return ~i;
    }
}

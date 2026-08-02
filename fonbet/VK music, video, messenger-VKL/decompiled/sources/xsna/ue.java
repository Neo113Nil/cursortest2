package xsna;

import java.util.Iterator;
import java.util.NoSuchElementException;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import xsna.vlk0;

/* compiled from: AbstractIterator.java */
/* loaded from: classes13.dex */
public abstract class ue<T> implements Iterator<T> {
    public a b;
    public String c;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: AbstractIterator.java */
    public static final class a {
        private static final /* synthetic */ a[] $VALUES;
        public static final a DONE;
        public static final a FAILED;
        public static final a NOT_READY;
        public static final a READY;

        static {
            a aVar = new a("READY", 0);
            READY = aVar;
            a aVar2 = new a("NOT_READY", 1);
            NOT_READY = aVar2;
            a aVar3 = new a("DONE", 2);
            DONE = aVar3;
            a aVar4 = new a(SignalingProtocol.HUNGUP_REASON_FAILED, 3);
            FAILED = aVar4;
            $VALUES = new a[]{aVar, aVar2, aVar3, aVar4};
        }

        public a() {
            throw null;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) $VALUES.clone();
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        String str;
        slb slbVar;
        a aVar = this.b;
        a aVar2 = a.FAILED;
        fxc0.z(aVar != aVar2);
        int ordinal = this.b.ordinal();
        if (ordinal == 0) {
            return true;
        }
        if (ordinal != 2) {
            this.b = aVar2;
            vlk0.b bVar = (vlk0.b) this;
            int i = bVar.f;
            while (true) {
                int i2 = bVar.f;
                if (i2 == -1) {
                    bVar.b = a.DONE;
                    str = null;
                    break;
                }
                int b = bVar.b(i2);
                CharSequence charSequence = bVar.d;
                if (b == -1) {
                    b = charSequence.length();
                    bVar.f = -1;
                } else {
                    bVar.f = bVar.a(b);
                }
                int i3 = bVar.f;
                if (i3 == i) {
                    int i4 = i3 + 1;
                    bVar.f = i4;
                    if (i4 > charSequence.length()) {
                        bVar.f = -1;
                    }
                } else {
                    while (true) {
                        slbVar = bVar.e;
                        if (i >= b || !slbVar.a(charSequence.charAt(i))) {
                            break;
                        }
                        i++;
                    }
                    while (b > i && slbVar.a(charSequence.charAt(b - 1))) {
                        b--;
                    }
                    int i5 = bVar.g;
                    if (i5 == 1) {
                        b = charSequence.length();
                        bVar.f = -1;
                        while (b > i && slbVar.a(charSequence.charAt(b - 1))) {
                            b--;
                        }
                    } else {
                        bVar.g = i5 - 1;
                    }
                    str = charSequence.subSequence(i, b).toString();
                }
            }
            this.c = str;
            if (this.b != a.DONE) {
                this.b = a.READY;
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Iterator
    public final T next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.b = a.NOT_READY;
        T t = (T) this.c;
        this.c = null;
        return t;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}

package xsna;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import xsna.slb;
import xsna.ue;

/* compiled from: Splitter.java */
/* loaded from: classes13.dex */
public final class vlk0 {
    public final slb a;
    public final c b;
    public final int c;

    /* compiled from: Splitter.java */
    public class a implements c {
        public final /* synthetic */ String a;

        public a(String str) {
            this.a = str;
        }

        @Override // xsna.vlk0.c
        public final Iterator a(vlk0 vlk0Var, CharSequence charSequence) {
            return new ulk0(this, vlk0Var, charSequence);
        }
    }

    /* compiled from: Splitter.java */
    public static abstract class b extends ue<String> {
        public final CharSequence d;
        public final slb e;
        public int f;
        public int g;

        public b(vlk0 vlk0Var, CharSequence charSequence) {
            this.b = ue.a.NOT_READY;
            this.f = 0;
            this.e = vlk0Var.a;
            this.g = vlk0Var.c;
            this.d = charSequence;
        }

        public abstract int a(int i);

        public abstract int b(int i);
    }

    /* compiled from: Splitter.java */
    public interface c {
        Iterator<String> a(vlk0 vlk0Var, CharSequence charSequence);
    }

    public vlk0(c cVar) {
        slb.d dVar = slb.d.c;
        this.b = cVar;
        this.a = dVar;
        this.c = Integer.MAX_VALUE;
    }

    public static vlk0 a(char c2) {
        return new vlk0(new tlk0(new slb.b(c2)));
    }

    public static vlk0 b(String str) {
        fxc0.q(str.length() != 0, "The separator may not be the empty string.");
        return str.length() == 1 ? a(str.charAt(0)) : new vlk0(new a(str));
    }

    public final List<String> c(CharSequence charSequence) {
        charSequence.getClass();
        Iterator<String> a2 = this.b.a(this, charSequence);
        ArrayList arrayList = new ArrayList();
        while (true) {
            ue ueVar = (ue) a2;
            if (!ueVar.hasNext()) {
                return Collections.unmodifiableList(arrayList);
            }
            arrayList.add((String) ueVar.next());
        }
    }
}

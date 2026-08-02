package xsna;

import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: DependencyNode.java */
/* loaded from: classes.dex */
public class mzl implements hzl {
    public final pnx0 d;
    public int f;
    public int g;
    public pnx0 a = null;
    public boolean b = false;
    public boolean c = false;
    public a e = a.UNKNOWN;
    public int h = 1;
    public azm i = null;
    public boolean j = false;
    public final ArrayList k = new ArrayList();
    public final ArrayList l = new ArrayList();

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: DependencyNode.java */
    /* loaded from: classes11.dex */
    public static final class a {
        private static final /* synthetic */ a[] $VALUES;
        public static final a BASELINE;
        public static final a BOTTOM;
        public static final a HORIZONTAL_DIMENSION;
        public static final a LEFT;
        public static final a RIGHT;
        public static final a TOP;
        public static final a UNKNOWN;
        public static final a VERTICAL_DIMENSION;

        static {
            a aVar = new a(GrsBaseInfo.CountryCodeSource.UNKNOWN, 0);
            UNKNOWN = aVar;
            a aVar2 = new a("HORIZONTAL_DIMENSION", 1);
            HORIZONTAL_DIMENSION = aVar2;
            a aVar3 = new a("VERTICAL_DIMENSION", 2);
            VERTICAL_DIMENSION = aVar3;
            a aVar4 = new a("LEFT", 3);
            LEFT = aVar4;
            a aVar5 = new a("RIGHT", 4);
            RIGHT = aVar5;
            a aVar6 = new a("TOP", 5);
            TOP = aVar6;
            a aVar7 = new a("BOTTOM", 6);
            BOTTOM = aVar7;
            a aVar8 = new a("BASELINE", 7);
            BASELINE = aVar8;
            $VALUES = new a[]{aVar, aVar2, aVar3, aVar4, aVar5, aVar6, aVar7, aVar8};
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

    public mzl(pnx0 pnx0Var) {
        this.d = pnx0Var;
    }

    @Override // xsna.hzl
    public final void a(hzl hzlVar) {
        ArrayList arrayList = this.l;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            if (!((mzl) it.next()).j) {
                return;
            }
        }
        this.c = true;
        pnx0 pnx0Var = this.a;
        if (pnx0Var != null) {
            pnx0Var.a(this);
        }
        if (this.b) {
            this.d.a(this);
            return;
        }
        Iterator it2 = arrayList.iterator();
        mzl mzlVar = null;
        int i = 0;
        while (it2.hasNext()) {
            mzl mzlVar2 = (mzl) it2.next();
            if (!(mzlVar2 instanceof azm)) {
                i++;
                mzlVar = mzlVar2;
            }
        }
        if (mzlVar != null && i == 1 && mzlVar.j) {
            azm azmVar = this.i;
            if (azmVar != null) {
                if (!azmVar.j) {
                    return;
                } else {
                    this.f = this.h * azmVar.g;
                }
            }
            d(mzlVar.g + this.f);
        }
        pnx0 pnx0Var2 = this.a;
        if (pnx0Var2 != null) {
            pnx0Var2.a(this);
        }
    }

    public final void b(pnx0 pnx0Var) {
        this.k.add(pnx0Var);
        if (this.j) {
            pnx0Var.a(pnx0Var);
        }
    }

    public final void c() {
        this.l.clear();
        this.k.clear();
        this.j = false;
        this.g = 0;
        this.c = false;
        this.b = false;
    }

    public void d(int i) {
        if (this.j) {
            return;
        }
        this.j = true;
        this.g = i;
        Iterator it = this.k.iterator();
        while (it.hasNext()) {
            hzl hzlVar = (hzl) it.next();
            hzlVar.a(hzlVar);
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.d.b.l0);
        sb.append(StringUtils.PROCESS_POSTFIX_DELIMITER);
        sb.append(this.e);
        sb.append("(");
        sb.append(this.j ? Integer.valueOf(this.g) : "unresolved");
        sb.append(") <t=");
        sb.append(this.l.size());
        sb.append(":d=");
        sb.append(this.k.size());
        sb.append(">");
        return sb.toString();
    }
}

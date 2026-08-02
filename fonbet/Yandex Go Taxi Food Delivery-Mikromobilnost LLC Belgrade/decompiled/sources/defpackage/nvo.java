package defpackage;

import com.yandex.xplat.xflags.b;
import com.yandex.xplat.xflags.c;
import com.yandex.xplat.xflags.d;
import com.yandex.xplat.xflags.e;
import com.yandex.xplat.xflags.f;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.Serializable;
import java.io.Writer;
import java.net.Socket;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Result;
import kotlin.collections.a;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes2.dex */
public final class nvo {
    public String a;
    public int b;

    public /* synthetic */ nvo(String str, int i) {
        this.a = str;
        this.b = i;
    }

    public Serializable a() {
        try {
            Socket socket = new Socket(this.a, this.b);
            try {
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
                String X = a.X(cma1.t0(bufferedReader), "", null, null, null, 62);
                bufferedReader.close();
                return X;
            } finally {
                socket.close();
            }
        } catch (Throwable th) {
            return new Result.Failure(th);
        }
    }

    public mvo b(int i, int i2) {
        Object b72Var;
        String str = this.a;
        int i3 = 0;
        if (i <= d3f0.c.a) {
            boolean z = i == 2 && wbz0.p(this.b, str, "!");
            if (z) {
                f("!");
            }
            int i4 = i + 1;
            int i5 = i2 + 1;
            mvo b = b(i4, i5);
            if (z) {
                b = new uk10(b);
            }
            c72 c = c(i);
            while (c != null) {
                mvo b2 = b(i4, i5);
                switch (c.b) {
                    case 0:
                        b72Var = new b72();
                        break;
                    case 1:
                        b72Var = new b();
                        break;
                    case 2:
                        b72Var = new c();
                        break;
                    case 3:
                        b72Var = new d();
                        break;
                    case 4:
                        b72Var = new z7u();
                        break;
                    case 5:
                        b72Var = new iov();
                        break;
                    case 6:
                        b72Var = new e();
                        break;
                    case 7:
                        b72Var = new f();
                        break;
                    case 8:
                        b72Var = new nf60();
                        break;
                    case 9:
                        b72Var = new pf60();
                        break;
                    case 10:
                        b72Var = new or60();
                        break;
                    default:
                        b72Var = new dh70();
                        break;
                }
                p370 p370Var = new p370(i3, b, b2, b72Var);
                c = c(i);
                b = p370Var;
            }
            return (i2 != 0 || this.b >= str.length()) ? b : new mf1((byte) 0, 23, com.yandex.xplat.common.c.f(this.b, 1, str));
        }
        if (wbz0.p(this.b, str, Extension.O_BRAKE)) {
            f(Extension.O_BRAKE);
            mvo b3 = b(0, i2 + 1);
            f(Extension.C_BRAKE);
            return b3;
        }
        if (!wbz0.p(this.b, str, "[")) {
            String d = d("'");
            eg01 eg01Var = null;
            bg1 bg1Var = d != null ? new bg1(d, 16) : null;
            if (bg1Var != null) {
                return bg1Var;
            }
            String d2 = d("\"");
            bg1 bg1Var2 = d2 != null ? new bg1(d2, 16) : null;
            if (bg1Var2 != null) {
                return bg1Var2;
            }
            int i6 = this.b;
            while (this.b < str.length()) {
                String f = com.yandex.xplat.common.c.f(this.b, 1, str);
                if ((f.compareTo("0") < 0 || f.compareTo("9") > 0) && ((f.compareTo("a") < 0 || f.compareTo("z") > 0) && !((f.compareTo("A") >= 0 && f.compareTo("Z") <= 0) || f.equals("_") || f.equals("-") || f.equals(Extension.DOT_CHAR)))) {
                    break;
                }
                this.b++;
            }
            String g = com.yandex.xplat.common.c.g(i6, Integer.valueOf(this.b), str);
            f(" ");
            Double i7 = avu0.i(g);
            if (evu0.y(g, Extension.DOT_CHAR, false) && i7 != null) {
                return new t6m(i7.doubleValue());
            }
            Integer l = bvu0.l(10, g);
            if (l != null) {
                return new dn60(l.intValue(), 5, (byte) 0);
            }
            if (g.equals("v")) {
                int i8 = this.b;
                if (wbz0.p(i8, str, Extension.O_BRAKE)) {
                    int d3 = wbz0.d(this.b + 1, str, Extension.C_BRAKE);
                    this.b = d3;
                    eg01Var = new eg01(new bg1(com.yandex.xplat.common.c.g(i8 + 2, Integer.valueOf(d3 - 1), str), 18));
                    f(Extension.C_BRAKE);
                }
                if (eg01Var != null) {
                    return eg01Var;
                }
            }
            return new mf1((byte) 0, 24, g);
        }
        f("[");
        ArrayList arrayList = new ArrayList();
        while (true) {
            String d4 = d("'");
            if (d4 != null) {
                arrayList.add(d4);
            }
            String d5 = d("\"");
            if (d5 != null) {
                arrayList.add(d5);
            }
            f(",");
            if (d4 == null && d5 == null) {
                a73 a73Var = new a73(arrayList);
                f("]");
                return a73Var;
            }
        }
    }

    public c72 c(int i) {
        List<c72> arrayList;
        LinkedHashMap linkedHashMap = d3f0.c.b;
        if (linkedHashMap.containsKey(Integer.valueOf(i))) {
            xcc.q((List) linkedHashMap.get(Integer.valueOf(i)), new nnq0(new g990(19), 1));
            arrayList = (List) linkedHashMap.get(Integer.valueOf(i));
        } else {
            arrayList = new ArrayList();
        }
        for (c72 c72Var : arrayList) {
            if (wbz0.p(this.b, this.a, c72Var.a)) {
                f(c72Var.a);
                return c72Var;
            }
        }
        return null;
    }

    public String d(String str) {
        int i = this.b;
        String str2 = this.a;
        if (!wbz0.p(i, str2, str)) {
            return null;
        }
        int d = wbz0.d(this.b + 1, str2, str);
        this.b = d;
        String g = com.yandex.xplat.common.c.g(i + 1, Integer.valueOf(d), str2);
        f(str);
        return g;
    }

    public Object e(String str) {
        try {
            Socket socket = new Socket(this.a, this.b);
            try {
                PrintWriter printWriter = new PrintWriter((Writer) new OutputStreamWriter(socket.getOutputStream()), true);
                printWriter.println(str);
                printWriter.flush();
                socket.close();
                return zy11.a;
            } catch (Throwable th) {
                socket.close();
                throw th;
            }
        } catch (Throwable th2) {
            return new Result.Failure(th2);
        }
    }

    public void f(String str) {
        String str2 = this.a;
        if (wbz0.p(this.b, str2, str)) {
            this.b = str.length() + this.b;
        }
        while (this.b < str2.length()) {
            if (!com.yandex.xplat.common.c.f(this.b, 1, str2).equals(" ") && !com.yandex.xplat.common.c.f(this.b, 1, str2).equals("\n")) {
                return;
            } else {
                this.b++;
            }
        }
    }
}

package defpackage;

import android.net.Uri;
import com.yandex.div.data.VariableMutationException;
import com.yandex.div.data.a;
import com.yandex.div.internal.parser.b;
import java.util.Iterator;
import kotlin.NoWhenBranchMatchedException;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public abstract class c231 {
    public final br60 a = new br60();

    public static String b(c231 c231Var) {
        String str;
        if (c231Var instanceof t131) {
            str = "ArrayVariable";
        } else if (c231Var instanceof u131) {
            str = "BooleanVariable";
        } else if (c231Var instanceof v131) {
            str = "ColorVariable";
        } else if (c231Var instanceof w131) {
            str = "DictVariable";
        } else if (c231Var instanceof x131) {
            str = "DoubleVariable";
        } else if (c231Var instanceof y131) {
            str = "IntegerVariable";
        } else if (c231Var instanceof a) {
            str = "PropertyVariable";
        } else if (c231Var instanceof z131) {
            str = "StringVariable";
        } else {
            if (!(c231Var instanceof a231)) {
                w511.b();
                return null;
            }
            str = "UrlVariable";
        }
        StringBuilder v = oyr.v(str, "(name: '");
        v.append(c231Var.c());
        v.append("')");
        return v.toString();
    }

    public void a(tls tlsVar) {
        synchronized (this) {
            this.a.a(tlsVar);
        }
    }

    public abstract String c();

    public final Object d() {
        if (this instanceof z131) {
            return ((z131) this).c;
        }
        if (this instanceof y131) {
            return Long.valueOf(((y131) this).c);
        }
        if (this instanceof u131) {
            return Boolean.valueOf(((u131) this).c);
        }
        if (this instanceof x131) {
            return Double.valueOf(((x131) this).c);
        }
        if (this instanceof v131) {
            return new jdc(((v131) this).c);
        }
        if (this instanceof a231) {
            return ((a231) this).c;
        }
        if (this instanceof w131) {
            return ((w131) this).d;
        }
        if (this instanceof t131) {
            return ((t131) this).j();
        }
        if (this instanceof a) {
            return ((a) this).l();
        }
        w511.b();
        return null;
    }

    public final void e(c231 c231Var) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((tls) it.next()).invoke(c231Var);
        }
    }

    public void f(tls tlsVar) {
        synchronized (this) {
            this.a.b(tlsVar);
        }
    }

    public final void g(String str) {
        if (this instanceof z131) {
            ((z131) this).j(str);
            return;
        }
        if (this instanceof y131) {
            try {
                ((y131) this).j(Long.parseLong(str));
                return;
            } catch (NumberFormatException e) {
                throw new VariableMutationException(g8e.o("Failed to convert value to Long: ", str), e);
            }
        }
        if (this instanceof u131) {
            u131 u131Var = (u131) this;
            Boolean j0 = evu0.j0(str);
            if (j0 == null) {
                try {
                    j0 = wwg.W(Integer.parseInt(str));
                    if (j0 == null) {
                        w511.c(2, null, "Failed to convert value to Boolean: ".concat(str));
                        return;
                    }
                } catch (NumberFormatException e2) {
                    throw new VariableMutationException("Failed to convert value to Int: ".concat(str), e2);
                }
            }
            u131Var.j(j0.booleanValue());
            return;
        }
        if (this instanceof x131) {
            try {
                ((x131) this).j(Double.parseDouble(str));
                return;
            } catch (NumberFormatException e3) {
                throw new VariableMutationException(g8e.o("Failed to convert value to Double: ", str), e3);
            }
        }
        if (this instanceof v131) {
            try {
                ((v131) this).j(((Number) b.b.invoke(str)).intValue());
                return;
            } catch (ClassCastException e4) {
                w511.c(1, e4, null);
                return;
            }
        }
        if (this instanceof a231) {
            try {
                ((a231) this).j(Uri.parse(str));
                return;
            } catch (IllegalArgumentException e5) {
                w511.c(1, e5, null);
                return;
            }
        }
        if (this instanceof w131) {
            try {
                ((w131) this).j(new JSONObject(str));
                return;
            } catch (JSONException e6) {
                w511.c(1, e6, null);
                return;
            }
        }
        if (this instanceof t131) {
            try {
                ((t131) this).k(new JSONArray(str));
                return;
            } catch (JSONException e7) {
                w511.c(1, e7, null);
                return;
            }
        }
        if (this instanceof a) {
            ((a) this).j().o(str);
        } else {
            w511.b();
        }
    }

    public final void h(c231 c231Var) {
        if ((this instanceof z131) && (c231Var instanceof z131)) {
            ((z131) this).j(((z131) c231Var).c);
            return;
        }
        if ((this instanceof y131) && (c231Var instanceof y131)) {
            ((y131) this).j(((y131) c231Var).c);
            return;
        }
        if ((this instanceof u131) && (c231Var instanceof u131)) {
            ((u131) this).j(((u131) c231Var).c);
            return;
        }
        if ((this instanceof x131) && (c231Var instanceof x131)) {
            ((x131) this).j(((x131) c231Var).c);
            return;
        }
        if ((this instanceof v131) && (c231Var instanceof v131)) {
            ((v131) this).j(((v131) c231Var).c);
            return;
        }
        if ((this instanceof a231) && (c231Var instanceof a231)) {
            ((a231) this).j(((a231) c231Var).c);
            return;
        }
        if ((this instanceof w131) && (c231Var instanceof w131)) {
            ((w131) this).j(((w131) c231Var).d);
            return;
        }
        if ((this instanceof t131) && (c231Var instanceof t131)) {
            ((t131) this).k(((t131) c231Var).j());
            return;
        }
        if ((this instanceof a) && (c231Var instanceof a)) {
            ((a) this).o(((a) c231Var).l());
            return;
        }
        throw new VariableMutationException(2, null, "Setting value to " + b(this) + " from " + b(c231Var) + " not supported!");
    }

    public final void i(Object obj) {
        try {
            if (this instanceof z131) {
                ((z131) this).j((String) obj);
                return;
            }
            if (this instanceof y131) {
                ((y131) this).j(((Number) obj).longValue());
                return;
            }
            if (this instanceof u131) {
                ((u131) this).j(((Boolean) obj).booleanValue());
                return;
            }
            if (this instanceof x131) {
                ((x131) this).j(((Number) obj).doubleValue());
                return;
            }
            if (this instanceof v131) {
                ((v131) this).j(((jdc) obj).a);
                return;
            }
            if (this instanceof a231) {
                ((a231) this).j((Uri) obj);
                return;
            }
            if (this instanceof w131) {
                ((w131) this).j((JSONObject) obj);
            } else if (this instanceof t131) {
                ((t131) this).k((JSONArray) obj);
            } else {
                if (!(this instanceof a)) {
                    throw new NoWhenBranchMatchedException();
                }
                ((a) this).o(obj);
            }
        } catch (ClassCastException unused) {
            StringBuilder sb = new StringBuilder("Unable to set value with type ");
            sb.append(obj.getClass());
            String b = b(this);
            sb.append(" to ");
            sb.append(b);
            throw new VariableMutationException(2, null, sb.toString());
        }
    }
}

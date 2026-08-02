package xsna;

import androidx.annotation.Nullable;
import com.google.android.datatransport.Priority;

/* compiled from: AutoValue_Event.java */
/* loaded from: classes.dex */
public final class xl5<T> extends wxp<T> {
    public final Integer a;
    public final T b;
    public final Priority c;
    public final wnd0 d;

    /* JADX WARN: Multi-variable type inference failed */
    public xl5(@Nullable Integer num, Object obj, Priority priority, @Nullable on5 on5Var) {
        this.a = num;
        if (obj == 0) {
            throw new NullPointerException("Null payload");
        }
        this.b = obj;
        if (priority == null) {
            throw new NullPointerException("Null priority");
        }
        this.c = priority;
        this.d = on5Var;
    }

    @Override // xsna.wxp
    @Nullable
    public final Integer a() {
        return this.a;
    }

    @Override // xsna.wxp
    public final T b() {
        return this.b;
    }

    @Override // xsna.wxp
    public final Priority c() {
        return this.c;
    }

    @Override // xsna.wxp
    @Nullable
    public final wnd0 d() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof wxp)) {
            return false;
        }
        wxp wxpVar = (wxp) obj;
        Integer num = this.a;
        if (num == null) {
            if (wxpVar.a() != null) {
                return false;
            }
        } else if (!num.equals(wxpVar.a())) {
            return false;
        }
        if (!this.b.equals(wxpVar.b()) || !this.c.equals(wxpVar.c())) {
            return false;
        }
        wnd0 wnd0Var = this.d;
        return wnd0Var == null ? wxpVar.d() == null : wnd0Var.equals(wxpVar.d());
    }

    public final int hashCode() {
        Integer num = this.a;
        int hashCode = ((((((num == null ? 0 : num.hashCode()) ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003;
        wnd0 wnd0Var = this.d;
        return ((wnd0Var != null ? wnd0Var.hashCode() : 0) ^ hashCode) * 1000003;
    }

    public final String toString() {
        return "Event{code=" + this.a + ", payload=" + this.b + ", priority=" + this.c + ", productData=" + this.d + ", eventContext=null}";
    }
}

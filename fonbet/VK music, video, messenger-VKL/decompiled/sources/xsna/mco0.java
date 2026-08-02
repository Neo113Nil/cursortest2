package xsna;

import android.content.Context;
import android.content.res.Resources;

/* compiled from: TextColorTestResult.kt */
/* loaded from: classes18.dex */
public abstract class mco0 extends tao0 {

    /* compiled from: TextColorTestResult.kt */
    public static final class a extends mco0 {
        public final jco0 a;

        public a(jco0 jco0Var) {
            this.a = jco0Var;
        }

        @Override // xsna.tao0
        public final uao0 a(Context context) {
            jco0 jco0Var = this.a;
            String a = jco0Var.a();
            Resources resources = context.getResources();
            Integer num = jco0Var.a;
            return new uao0(a, resources.getResourceName(num != null ? num.intValue() : 0));
        }
    }

    /* compiled from: TextColorTestResult.kt */
    public static final class b extends mco0 {
        public final jco0 a;
        public final String b;

        public b(jco0 jco0Var, String str) {
            this.a = jco0Var;
            this.b = str;
        }

        @Override // xsna.tao0
        public final uao0 a(Context context) {
            jco0 jco0Var = this.a;
            return new uao0(jco0Var.a(), "Value: " + jco0Var.c + "\nMatches with: " + this.b);
        }
    }

    /* compiled from: TextColorTestResult.kt */
    public static final class c extends mco0 {
        public final jco0 a;

        public c(jco0 jco0Var) {
            this.a = jco0Var;
        }

        @Override // xsna.tao0
        public final uao0 a(Context context) {
            jco0 jco0Var = this.a;
            String a = jco0Var.a();
            Resources resources = context.getResources();
            Integer num = jco0Var.b;
            return new uao0(a, resources.getResourceName(num != null ? num.intValue() : 0));
        }
    }
}

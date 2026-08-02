package xsna;

import java.util.ArrayList;
import xsna.zjv;

/* compiled from: Knet.kt */
/* loaded from: classes.dex */
public final class jjy {
    public final lti a;
    public final rt8 b;
    public final ArrayList c;

    /* compiled from: Knet.kt */
    public static final class a {
        public final lti a;
        public final ArrayList b = new ArrayList();

        public a(lti ltiVar) {
            this.a = ltiVar;
        }
    }

    /* compiled from: Knet.kt */
    public static final class b implements ojv {
        public final lti a;

        public b(lti ltiVar) {
            this.a = ltiVar;
        }

        @Override // xsna.ojv
        public final mkv a(zjv.a aVar) {
            return this.a.a(aVar.b(), aVar.a());
        }
    }

    public jjy(lti ltiVar, rt8 rt8Var, ArrayList arrayList) {
        this.a = ltiVar;
        this.b = rt8Var;
        this.c = arrayList;
    }
}

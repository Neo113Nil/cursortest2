package defpackage;

import kotlin.Metadata;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lhmj0;", "", "Companion", "gmj0", "fmj0", "go-client-android.features.requirements:models"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class hmj0 {
    public static final gmj0 Companion = new gmj0();
    public static final hmj0 h = new hmj0(0);
    public final String a;
    public final kmj0 b;
    public final nmj0 c;
    public final cnj0 d;
    public final qmj0 e;
    public final tmj0 f;
    public final emj0 g;

    public hmj0(int i, String str, kmj0 kmj0Var, nmj0 nmj0Var, cnj0 cnj0Var, qmj0 qmj0Var, tmj0 tmj0Var, emj0 emj0Var) {
        this.a = (i & 1) == 0 ? "" : str;
        if ((i & 2) == 0) {
            kmj0.Companion.getClass();
            this.b = kmj0.e;
        } else {
            this.b = kmj0Var;
        }
        if ((i & 4) == 0) {
            nmj0.Companion.getClass();
            this.c = nmj0.c;
        } else {
            this.c = nmj0Var;
        }
        if ((i & 8) == 0) {
            cnj0.Companion.getClass();
            this.d = cnj0.b;
        } else {
            this.d = cnj0Var;
        }
        if ((i & 16) == 0) {
            qmj0.Companion.getClass();
            this.e = qmj0.c;
        } else {
            this.e = qmj0Var;
        }
        if ((i & 32) == 0) {
            tmj0.Companion.getClass();
            this.f = tmj0.b;
        } else {
            this.f = tmj0Var;
        }
        if ((i & 64) != 0) {
            this.g = emj0Var;
        } else {
            emj0.Companion.getClass();
            this.g = emj0.b;
        }
    }

    public hmj0() {
        this(0);
    }

    public hmj0(int i) {
        kmj0.Companion.getClass();
        kmj0 kmj0Var = kmj0.e;
        nmj0.Companion.getClass();
        cnj0.Companion.getClass();
        qmj0.Companion.getClass();
        qmj0 qmj0Var = qmj0.c;
        tmj0.Companion.getClass();
        emj0.Companion.getClass();
        this.a = "";
        this.b = kmj0Var;
        this.c = nmj0.c;
        this.d = cnj0.b;
        this.e = qmj0Var;
        this.f = tmj0.b;
        this.g = emj0.b;
    }
}

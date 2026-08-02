package xsna;

import com.ironsource.X3;

/* compiled from: MentionFormatter.kt */
/* loaded from: classes18.dex */
public interface o320 {
    String d(i420 i420Var, String str);

    default String h(b9z b9zVar, String str) {
        return X3.j.d + b9zVar.b + '|' + str + ']';
    }
}

package xsna;

import java.lang.Character;
import java.util.Comparator;

/* compiled from: Comparisons.kt */
/* loaded from: classes2.dex */
public final class lbj<T> implements Comparator {
    public final /* synthetic */ izs b;

    public lbj(izs izsVar) {
        this.b = izsVar;
    }

    @Override // java.util.Comparator
    public final int compare(T t, T t2) {
        izs izsVar = this.b;
        Character y0 = erm0.y0((String) izsVar.invoke((qtd0) t));
        Character.UnicodeBlock of = Character.UnicodeBlock.of(y0 != null ? y0.charValue() : ' ');
        Character.UnicodeBlock unicodeBlock = Character.UnicodeBlock.CYRILLIC;
        Integer num = epx.f(of, unicodeBlock) ? 0 : r0;
        Character y02 = erm0.y0((String) izsVar.invoke((qtd0) t2));
        return jw5.b(num, epx.f(Character.UnicodeBlock.of(y02 != null ? y02.charValue() : ' '), unicodeBlock) ? 0 : 1);
    }
}

package xsna;

import com.vk.dto.common.Source;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: DialogThemesLangGetByIdCmd.kt */
/* loaded from: classes2.dex */
public final class llm extends le6<Map<String, ? extends String>> {
    public final Collection<String> b;
    public final Source c;
    public final boolean d = true;

    /* compiled from: DialogThemesLangGetByIdCmd.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Source.values().length];
            try {
                iArr[Source.CACHE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Source.NETWORK.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Source.ACTUAL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public llm(Collection collection, Source source) {
        this.b = collection;
        this.c = source;
    }

    @Override // xsna.le6
    public final Map<String, ? extends String> e(w2w w2wVar) {
        int i = a.$EnumSwitchMapping$0[this.c.ordinal()];
        if (i == 1) {
            return f(w2wVar);
        }
        if (i == 2) {
            return g(w2wVar);
        }
        if (i != 3) {
            throw new NoWhenBranchMatchedException();
        }
        LinkedHashMap f = f(w2wVar);
        return f.keySet().containsAll(this.b) ? f : g(w2wVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof llm)) {
            return false;
        }
        llm llmVar = (llm) obj;
        return epx.f(this.b, llmVar.b) && this.c == llmVar.c && this.d == llmVar.d;
    }

    public final LinkedHashMap f(w2w w2wVar) {
        Map<String, String> g = w2wVar.I0().i().g();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, String> entry : g.entrySet()) {
            if (this.b.contains(entry.getKey())) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        return linkedHashMap;
    }

    public final LinkedHashMap g(w2w w2wVar) {
        Map map = (Map) w2wVar.L0(this, new klm(Source.NETWORK, this.d));
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : map.entrySet()) {
            if (this.b.contains(entry.getKey())) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        return linkedHashMap;
    }

    @Override // xsna.le6, xsna.e1w
    public final int hashCode() {
        return Boolean.hashCode(this.d) + io.reactivex.rxjava3.internal.operators.mixed.k.c(this.b.hashCode() * 31, 31, this.c);
    }

    @Override // xsna.e1w
    public final String toString() {
        StringBuilder sb = new StringBuilder("DialogThemesLangGetByIdCmd(langIds=");
        sb.append(this.b);
        sb.append(", source=");
        sb.append(this.c);
        sb.append(", awaitNetwork=");
        return defpackage.q0.a(sb, this.d, ')');
    }
}

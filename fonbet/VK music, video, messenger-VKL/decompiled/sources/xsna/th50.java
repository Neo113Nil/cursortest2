package xsna;

import java.util.regex.MatchResult;

/* compiled from: MutableSingleMatchResult.kt */
/* loaded from: classes17.dex */
public final class th50 implements MatchResult {
    public int a;
    public int b;

    @Override // java.util.regex.MatchResult
    public final int end() {
        return this.b;
    }

    @Override // java.util.regex.MatchResult
    public final String group() {
        return "";
    }

    @Override // java.util.regex.MatchResult
    public final int groupCount() {
        return 1;
    }

    @Override // java.util.regex.MatchResult
    public final int start() {
        return this.a;
    }

    @Override // java.util.regex.MatchResult
    public final int end(int i) {
        return this.b;
    }

    @Override // java.util.regex.MatchResult
    public final String group(int i) {
        return "";
    }

    @Override // java.util.regex.MatchResult
    public final int start(int i) {
        return this.a;
    }
}

package defpackage;

import androidx.media3.common.a;
import java.util.List;

/* loaded from: classes10.dex */
public interface cgg {
    dgg createDashChunkSource(tyy tyyVar, egg eggVar, jc5 jc5Var, int i, int[] iArr, loo looVar, int i2, long j, boolean z, List list, syc0 syc0Var, cj01 cj01Var, vyc0 vyc0Var, t8c t8cVar);

    cgg experimentalParseSubtitlesDuringExtraction(boolean z);

    cgg experimentalSetCodecsToParseWithinGopSampleDependencies(int i);

    a getOutputTextFormat(a aVar);

    cgg setSubtitleParserFactory(o2v0 o2v0Var);
}

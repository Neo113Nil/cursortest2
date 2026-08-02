package com.yandex.go.requirements.comment.summary.ui.v3.data;

import com.yandex.go.requirements.comment.summary.ui.v3.data.experiment.SuggestForCommentExperiment;
import com.yandex.go.requirements.comment.summary.ui.v3.data.net.api.AIRequirementsCommentApi;
import com.yandex.go.requirements.comment.summary.ui.v3.data.net.request.SuggestCommentRequestDto;
import com.yandex.go.requirements.comment.summary.ui.v3.data.net.response.SuggestCommentDto;
import com.yandex.go.requirements.comment.summary.ui.v3.data.net.response.SuggestCommentResponseDto;
import defpackage.bvf0;
import defpackage.g4v0;
import defpackage.gci0;
import defpackage.ny61;
import defpackage.s5v0;
import defpackage.t5v0;
import defpackage.tcc;
import defpackage.w5v0;
import defpackage.xbv0;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes13.dex */
public final class c {
    public static final /* synthetic */ int e = 0;
    public final w5v0 a;
    public final xbv0 b;
    public final r0 c;
    public final gci0 d;

    static {
        int i = xbv0.d;
    }

    public c(w5v0 w5v0Var, xbv0 xbv0Var) {
        this.a = w5v0Var;
        this.b = xbv0Var;
        r0 c = bvf0.c(new s5v0(EmptyList.a));
        this.c = c;
        this.d = kotlinx.coroutines.flow.e.d(c);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(SuggestCommentRequestDto suggestCommentRequestDto, ContinuationImpl continuationImpl) {
        SuggestsRepository$loadSuggests$1 suggestsRepository$loadSuggests$1;
        int i;
        SuggestCommentResponseDto suggestCommentResponseDto;
        s5v0 s5v0Var;
        if (continuationImpl instanceof SuggestsRepository$loadSuggests$1) {
            suggestsRepository$loadSuggests$1 = (SuggestsRepository$loadSuggests$1) continuationImpl;
            int i2 = suggestsRepository$loadSuggests$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                suggestsRepository$loadSuggests$1.label = i2 - Integer.MIN_VALUE;
                Object obj = suggestsRepository$loadSuggests$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = suggestsRepository$loadSuggests$1.label;
                r0 r0Var = this.c;
                if (i != 0) {
                    kotlin.b.b(obj);
                    r0Var.getClass();
                    r0Var.m(null, t5v0.a);
                    suggestsRepository$loadSuggests$1.L$0 = null;
                    suggestsRepository$loadSuggests$1.label = 1;
                    obj = kotlinx.coroutines.a.w(((SuggestForCommentExperiment) r10.b.b.b()).c, new SuggestsRequestRemoteRepository$loadSuggests$2(((AIRequirementsCommentApi) this.b.c.getValue()).a(suggestCommentRequestDto), null), suggestsRepository$loadSuggests$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                suggestCommentResponseDto = (SuggestCommentResponseDto) obj;
                this.a.getClass();
                if (suggestCommentResponseDto != null) {
                    s5v0Var = new s5v0(EmptyList.a);
                } else {
                    List<SuggestCommentDto> list = suggestCommentResponseDto.a;
                    ArrayList arrayList = new ArrayList(tcc.n(list, 10));
                    for (SuggestCommentDto suggestCommentDto : list) {
                        arrayList.add(new g4v0(suggestCommentDto.a, suggestCommentDto.c));
                    }
                    s5v0Var = new s5v0(arrayList);
                }
                r0Var.getClass();
                r0Var.m(null, s5v0Var);
                return zy11.a;
            }
        }
        suggestsRepository$loadSuggests$1 = new SuggestsRepository$loadSuggests$1(this, continuationImpl);
        Object obj2 = suggestsRepository$loadSuggests$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = suggestsRepository$loadSuggests$1.label;
        r0 r0Var2 = this.c;
        if (i != 0) {
        }
        suggestCommentResponseDto = (SuggestCommentResponseDto) obj2;
        this.a.getClass();
        if (suggestCommentResponseDto != null) {
        }
        r0Var2.getClass();
        r0Var2.m(null, s5v0Var);
        return zy11.a;
    }
}

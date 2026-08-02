package com.yandex.go.requirements.comment.summary.ui.v3.data;

import com.yandex.go.requirements.comment.summary.ui.v3.data.experiment.SummaryCommentValidationExperiment;
import com.yandex.go.requirements.comment.summary.ui.v3.data.net.request.ValidateCommentRequestDto;
import defpackage.i3y;
import defpackage.l7b;
import defpackage.on2;
import defpackage.rz0;
import kotlin.coroutines.Continuation;

/* loaded from: classes13.dex */
public final class a {
    public static final /* synthetic */ int d = 0;
    public final on2 a;
    public final rz0 b;
    public final i3y c = kotlin.a.a(new l7b(23, this));

    public a(on2 on2Var, rz0 rz0Var) {
        this.a = on2Var;
        this.b = rz0Var;
    }

    public final Object a(ValidateCommentRequestDto validateCommentRequestDto, Continuation continuation) {
        return kotlinx.coroutines.a.w(((SummaryCommentValidationExperiment) this.b.b.b()).d, new CommentValidationRemoteRepository$validateComment$2(this, validateCommentRequestDto, null), continuation);
    }
}

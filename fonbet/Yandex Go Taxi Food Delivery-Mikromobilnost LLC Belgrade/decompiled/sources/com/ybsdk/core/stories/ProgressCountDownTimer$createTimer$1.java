package com.ybsdk.core.stories;

import android.os.CountDownTimer;
import defpackage.tif0;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"com/ybsdk/core/stories/ProgressCountDownTimer$createTimer$1", "Landroid/os/CountDownTimer;", "", "millisUntilFinished", "Lzy11;", "onTick", "(J)V", "onFinish", "()V", "core-stories_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ProgressCountDownTimer$createTimer$1 extends CountDownTimer {
    final /* synthetic */ tif0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProgressCountDownTimer$createTimer$1(long j, tif0 tif0Var) {
        super(j, 11L);
        this.this$0 = tif0Var;
    }

    @Override // android.os.CountDownTimer
    public void onFinish() {
        tif0 tif0Var = this.this$0;
        tif0Var.f = true;
        tif0Var.c.invoke();
    }

    @Override // android.os.CountDownTimer
    public void onTick(long millisUntilFinished) {
        tif0 tif0Var = this.this$0;
        tif0Var.e = millisUntilFinished;
        tif0Var.b.invoke(Long.valueOf(millisUntilFinished));
    }
}

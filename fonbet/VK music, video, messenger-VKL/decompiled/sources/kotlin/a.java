package kotlin;

import kotlin.Result;

/* compiled from: Result.kt */
/* loaded from: classes11.dex */
public final class a {
    public static final void a(Object obj) {
        if (obj instanceof Result.Failure) {
            throw ((Result.Failure) obj).exception;
        }
    }
}

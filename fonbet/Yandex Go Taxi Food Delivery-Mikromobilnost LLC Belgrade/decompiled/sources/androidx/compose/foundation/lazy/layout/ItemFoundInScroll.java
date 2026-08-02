package androidx.compose.foundation.lazy.layout;

import defpackage.kj2;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u00002\u00060\u0001j\u0002`\u0002R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007R#\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Landroidx/compose/foundation/lazy/layout/ItemFoundInScroll;", "Ljava/util/concurrent/CancellationException;", "Lkotlin/coroutines/cancellation/CancellationException;", "", "itemOffset", CA20Status.STATUS_USER_I, "a", "()I", "Lkj2;", "", "Loj2;", "previousAnimation", "Lkj2;", "b", "()Lkj2;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes10.dex */
final class ItemFoundInScroll extends CancellationException {
    private final int itemOffset;
    private final kj2 previousAnimation;

    public ItemFoundInScroll(int i, kj2 kj2Var) {
        this.itemOffset = i;
        this.previousAnimation = kj2Var;
    }

    /* renamed from: a, reason: from getter */
    public final int getItemOffset() {
        return this.itemOffset;
    }

    /* renamed from: b, reason: from getter */
    public final kj2 getPreviousAnimation() {
        return this.previousAnimation;
    }
}

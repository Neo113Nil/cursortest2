package xsna;

import com.vk.dto.common.Source;
import com.vk.im.engine.models.dialogs.DialogsFilter;
import com.vk.im.engine.models.dialogs.FolderType;

/* compiled from: BusinessNotificationsObserverImpl.kt */
/* loaded from: classes2.dex */
public final class lo8 implements ko8 {
    public final a1w a;
    public final g0s b;
    public final io.reactivex.rxjava3.core.w c = asu0.a.c();

    public lo8(a1w a1wVar, g0s g0sVar) {
        this.a = a1wVar;
        this.b = g0sVar;
    }

    @Override // xsna.ko8
    public final io.reactivex.rxjava3.core.q<io8> a() {
        io.reactivex.rxjava3.core.q<Boolean> a = this.b.a(FolderType.BUSINESS);
        io.reactivex.rxjava3.core.w wVar = this.c;
        return a.a0(wVar).r0(wVar).s0(new y7(new x7(this, 14), 2));
    }

    public final io.reactivex.rxjava3.internal.operators.single.r b() {
        return new io.reactivex.rxjava3.internal.operators.single.r(this.a.C(this, new qpm(DialogsFilter.BUSINESS_NOTIFY, Source.ACTUAL, 8)), new mm6(new hb(this, 12), 3));
    }
}

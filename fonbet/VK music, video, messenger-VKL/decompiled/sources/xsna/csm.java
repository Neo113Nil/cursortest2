package xsna;

import com.vk.dto.common.Source;
import com.vk.im.engine.models.dialogs.DialogsFilter;

/* compiled from: DialogsListBusinessNotificationsLoader.kt */
/* loaded from: classes18.dex */
public final class csm {
    public final a1w a;
    public final ko8 b;
    public final io.reactivex.rxjava3.core.w c = io.reactivex.rxjava3.schedulers.a.b();
    public final boolean d;

    public csm(a1w a1wVar, ko8 ko8Var) {
        this.a = a1wVar;
        this.b = ko8Var;
        this.d = a1wVar.r().h.o();
    }

    public final io.reactivex.rxjava3.internal.operators.single.r a() {
        return new io.reactivex.rxjava3.internal.operators.single.r(this.a.C(this, new qpm(DialogsFilter.BUSINESS_NOTIFY, Source.ACTUAL, 8)), new ps2(new vl1(this, 27), 16));
    }
}

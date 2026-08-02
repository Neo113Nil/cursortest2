package xsna;

import com.vk.dto.common.Source;
import com.vk.im.engine.models.dialogs.FolderType;

/* compiled from: FolderActionInteractorImpl.kt */
/* loaded from: classes.dex */
public final class sxr implements rxr {
    public final a1w a;

    public sxr(a1w a1wVar) {
        this.a = a1wVar;
    }

    @Override // xsna.rxr
    public final io.reactivex.rxjava3.core.a a() {
        return new io.reactivex.rxjava3.internal.operators.single.s(this.a.C(this, new wqm(FolderType.CHANNELS, Source.ACTUAL)), new o7(new i4h(this, 20), 15));
    }
}

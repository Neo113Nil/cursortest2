package xsna;

import com.vk.im.engine.models.dialogs.FolderType;

/* compiled from: FolderIdProviderImpl.kt */
/* loaded from: classes18.dex */
public final class vyr implements uyr {
    public final c1s a;

    public vyr(com.vk.folders.impl.model.a aVar) {
        this.a = aVar;
    }

    @Override // xsna.uyr
    public final io.reactivex.rxjava3.internal.operators.observable.y a(FolderType folderType) {
        return new io.reactivex.rxjava3.internal.operators.observable.y(this.a.f().U(new q7(new mmf(folderType, 29), 20)), io.reactivex.rxjava3.internal.functions.a.a, io.reactivex.rxjava3.internal.functions.b.a);
    }
}

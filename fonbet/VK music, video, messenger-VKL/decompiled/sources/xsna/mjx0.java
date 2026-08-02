package xsna;

/* compiled from: WebkitToCompatConverter.java */
/* loaded from: classes12.dex */
public final class mjx0 implements qsz {
    public final Object a;

    public /* synthetic */ mjx0(Object obj) {
        this.a = obj;
    }

    @Override // xsna.qsz
    public io.reactivex.rxjava3.core.q a() {
        return (io.reactivex.rxjava3.core.q) this.a;
    }

    @Override // xsna.qsz
    public frz b(frz frzVar, Object obj, drz drzVar, boolean z) {
        xrm xrmVar = (xrm) frzVar;
        a1s a1sVar = (a1s) obj;
        if (z) {
            drzVar.b("FolderChangeUpdater updateLoaderData");
            return xrmVar;
        }
        if (!(a1sVar instanceof e580) && !(a1sVar instanceof f580)) {
            return xrmVar;
        }
        drzVar.b("FolderChangeUpdater OnDialogsFolderEdited | OnDialogsFolderInvalidate");
        return xrmVar;
    }
}

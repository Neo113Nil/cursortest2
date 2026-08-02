package defpackage;

/* loaded from: classes7.dex */
public final class oz31 implements zeo {
    public static yeo a;

    @Override // defpackage.zeo
    public final void onCancel(Object obj) {
        a = null;
    }

    @Override // defpackage.zeo
    public final void onListen(Object obj, xeo xeoVar) {
        a = (yeo) xeoVar;
    }
}

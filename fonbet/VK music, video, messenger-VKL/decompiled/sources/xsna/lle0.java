package xsna;

/* compiled from: PushTokenDao_Impl.java */
/* loaded from: classes5.dex */
public final class lle0 extends s140 {
    @Override // xsna.s140
    public final String c() {
        return "UPDATE push_token SET invalidate_time = ? WHERE token =?";
    }
}

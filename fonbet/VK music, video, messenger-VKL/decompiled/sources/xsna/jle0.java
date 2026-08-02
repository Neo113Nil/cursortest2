package xsna;

/* compiled from: PushTokenDao_Impl.java */
/* loaded from: classes5.dex */
public final class jle0 extends s140 {
    @Override // xsna.s140
    public final String c() {
        return "DELETE FROM push_token WHERE package_info_id in (SELECT package_id FROM package_info WHERE package_name = ?)";
    }
}

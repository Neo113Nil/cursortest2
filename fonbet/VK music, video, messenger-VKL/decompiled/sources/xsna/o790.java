package xsna;

/* compiled from: PackageInfoDao_Impl.java */
/* loaded from: classes5.dex */
public final class o790 extends s140 {
    @Override // xsna.s140
    public final String c() {
        return "UPDATE package_info SET package_invalidate_time = ? WHERE package_name =?";
    }
}

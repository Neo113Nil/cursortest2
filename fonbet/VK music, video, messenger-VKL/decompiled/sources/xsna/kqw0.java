package xsna;

import com.vk.core.apps.BuildInfo;
import com.vk.core.files.PrivateFiles;
import com.vk.core.files.PrivateSubdir;
import java.io.File;

/* compiled from: VoipInitializer.kt */
/* loaded from: classes7.dex */
public final class kqw0 implements irw0 {
    @Override // xsna.irw0
    public final boolean a() {
        o2l.a.getClass();
        return o2l.b("__dbg_voip_v2_side_log", false) && (o2l.b("__dbg_log_to_file", false) || BuildInfo.p() || o25.a().i().c);
    }

    @Override // xsna.irw0
    public final String b() {
        PrivateFiles.a b;
        StringBuilder sb = new StringBuilder();
        b = e8r.a.b(r2, PrivateSubdir.LOGS.h(), true);
        sb.append(b.a.getAbsolutePath());
        sb.append(File.separator);
        sb.append((String) com.vk.core.apps.a.c.getValue());
        return sb.toString();
    }

    @Override // xsna.irw0
    public final boolean shouldHideSensitiveInformation() {
        return BuildInfo.m();
    }
}

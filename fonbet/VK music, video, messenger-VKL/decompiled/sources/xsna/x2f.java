package xsna;

import com.vk.core.files.PrivateFiles;
import com.vk.core.files.PrivateSubdir;
import java.io.File;

/* compiled from: ClipsSdkDraftsProviderVk.kt */
/* loaded from: classes14.dex */
public final class x2f implements mtd {
    public final eef a;

    /* compiled from: ClipsSdkDraftsProviderVk.kt */
    public static final class a implements osd {
        @Override // xsna.osd
        public final File a() {
            PrivateFiles.a b;
            b = e8r.a.b(r1, PrivateSubdir.CLIPS_AUDIO.h(), true);
            return b.a;
        }

        @Override // xsna.osd
        public final File b() {
            PrivateFiles.a b;
            b = e8r.a.b(r1, PrivateSubdir.CLIPS_PREVIEW.h(), true);
            return b.a;
        }

        @Override // xsna.osd
        public final File c() {
            PrivateFiles.a b;
            b = e8r.a.b(r1, PrivateSubdir.CLIPS_VIDEO.h(), true);
            return b.a;
        }
    }

    public x2f(tud tudVar, eef eefVar) {
        this.a = eefVar;
        new bpn0(new l35(6));
    }

    @Override // xsna.mtd
    public final osd a() {
        return new a();
    }
}

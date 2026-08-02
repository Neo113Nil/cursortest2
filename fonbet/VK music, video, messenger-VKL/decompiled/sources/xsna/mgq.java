package xsna;

import java.io.File;
import java.io.FilenameFilter;
import ru.ok.gl.effects.media.controller.video.ExtraVideoSupplier;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes9.dex */
public final /* synthetic */ class mgq implements FilenameFilter {
    @Override // java.io.FilenameFilter
    public final boolean accept(File file, String str) {
        boolean lambda$prepareVideoFile$0;
        lambda$prepareVideoFile$0 = ExtraVideoSupplier.lambda$prepareVideoFile$0(file, str);
        return lambda$prepareVideoFile$0;
    }
}

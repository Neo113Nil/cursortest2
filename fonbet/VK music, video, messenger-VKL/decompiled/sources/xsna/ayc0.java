package xsna;

import java.io.File;
import kotlin.jvm.internal.Lambda;
import xsna.aq90;

/* compiled from: PreferenceDataStoreFactory.jvm.kt */
/* loaded from: classes.dex */
public final class ayc0 extends Lambda implements gzs<aq90> {
    final /* synthetic */ gzs<File> $produceFile;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ayc0(gzs<? extends File> gzsVar) {
        super(0);
        this.$produceFile = gzsVar;
    }

    @Override // xsna.gzs
    public final aq90 invoke() {
        File invoke = this.$produceFile.invoke();
        if (nbr.m(invoke).equals("preferences_pb")) {
            String str = aq90.c;
            return aq90.a.b(invoke.getAbsoluteFile());
        }
        throw new IllegalStateException(("File extension for file: " + invoke + " does not match required extension for Preferences file: preferences_pb").toString());
    }
}

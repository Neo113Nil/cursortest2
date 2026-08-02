package xsna;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.io.ByteArrayOutputStream;
import one.video.stat.transport.SequencePosition;
import ru.ok.android.commons.io.OutputStreamWriter;

/* compiled from: DebugLogWriter.kt */
/* loaded from: classes8.dex */
public final class a6l implements z000 {
    @Override // xsna.z000
    public final void a(yi80 yi80Var, boolean z, SequencePosition sequencePosition) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        typ.a(yi80Var, new OutputStreamWriter(byteArrayOutputStream));
        byteArrayOutputStream.toString(C.UTF8_NAME);
        sequencePosition.toString();
    }
}

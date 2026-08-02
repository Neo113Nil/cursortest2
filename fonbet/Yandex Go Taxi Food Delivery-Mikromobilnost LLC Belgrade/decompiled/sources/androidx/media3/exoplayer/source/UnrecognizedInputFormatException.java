package androidx.media3.exoplayer.source;

import android.net.Uri;
import androidx.media3.common.ParserException;
import com.google.common.collect.ImmutableList;
import defpackage.r3t0;
import java.util.List;

/* loaded from: classes10.dex */
public class UnrecognizedInputFormatException extends ParserException {
    public final ImmutableList<r3t0> sniffFailures;
    public final Uri uri;

    public UnrecognizedInputFormatException(String str, Uri uri, List list) {
        super(1, str, null, false);
        this.uri = uri;
        this.sniffFailures = ImmutableList.l(list);
    }
}

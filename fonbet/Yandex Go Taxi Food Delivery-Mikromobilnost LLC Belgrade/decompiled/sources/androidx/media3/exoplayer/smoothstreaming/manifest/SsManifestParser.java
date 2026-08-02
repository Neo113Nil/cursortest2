package androidx.media3.exoplayer.smoothstreaming.manifest;

import android.net.Uri;
import androidx.media3.common.ParserException;
import defpackage.gg90;
import defpackage.ny61;
import defpackage.pxt0;
import defpackage.sxt0;
import java.io.InputStream;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

/* loaded from: classes10.dex */
public class SsManifestParser implements gg90 {
    public final XmlPullParserFactory a;

    public static class MissingFieldException extends ParserException {
        public MissingFieldException(String str) {
            super(4, "Missing required field: ".concat(str), null, true);
        }
    }

    public SsManifestParser() {
        try {
            this.a = XmlPullParserFactory.newInstance();
        } catch (XmlPullParserException e) {
            ny61.n("Couldn't create XmlPullParserFactory instance", e);
            throw null;
        }
    }

    @Override // defpackage.gg90
    public final Object parse(Uri uri, InputStream inputStream) {
        try {
            XmlPullParser newPullParser = this.a.newPullParser();
            newPullParser.setInput(inputStream, null);
            return (pxt0) new sxt0(uri.toString()).e(newPullParser);
        } catch (XmlPullParserException e) {
            throw ParserException.b(e, null);
        }
    }
}

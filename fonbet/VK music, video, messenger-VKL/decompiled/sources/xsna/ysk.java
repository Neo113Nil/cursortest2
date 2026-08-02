package xsna;

import android.net.Uri;
import androidx.media3.common.StreamKey;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.collections.EmptyList;
import one.video.exo.datasource.dash.parser.AudioTracksFilterMode;
import org.xmlpull.v1.XmlPullParser;

/* compiled from: DashManifestParserWithFilter.kt */
/* loaded from: classes8.dex */
public final class ysk extends usk {
    public final svz j;
    public final AudioTracksFilterMode k;

    /* compiled from: DashManifestParserWithFilter.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[AudioTracksFilterMode.values().length];
            try {
                iArr[AudioTracksFilterMode.FILTER_OUT_LOWEST.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AudioTracksFilterMode.FILTER_OUT_LOWER_MIDDLE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[AudioTracksFilterMode.KEEP_UPPER_MIDDLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[AudioTracksFilterMode.KEEP_HIGHEST.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public ysk(svz svzVar, AudioTracksFilterMode audioTracksFilterMode) {
        super(false);
        this.j = svzVar;
        this.k = audioTracksFilterMode;
    }

    @Override // xsna.usk, xsna.wsk
    public final rsk m(XmlPullParser xmlPullParser, Uri uri) {
        List<StreamKey> list;
        rsk m = super.m(xmlPullParser, uri);
        vki0 b = g5z.b(new eli0(new bli0(new atk(m, null)), new k87(this, 3), nli0.b, null));
        if (b.hasNext()) {
            T next = b.next();
            if (b.hasNext()) {
                ArrayList b2 = y57.b(next);
                while (b.hasNext()) {
                    b2.add(b.next());
                }
                list = b2;
            } else {
                list = Collections.singletonList(next);
            }
        } else {
            list = EmptyList.b;
        }
        return m.copy(list);
    }
}

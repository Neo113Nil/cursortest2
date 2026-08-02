package xsna;

import com.vk.catalog2.common.dto.api.ContentType;
import com.vk.dto.common.id.UserId;

/* compiled from: SearchResultsScreenItemClickHandler.kt */
/* loaded from: classes16.dex */
public final class jyh0 {
    public final UserId a;
    public final yp70 b;
    public final ovj c;
    public final hpj d;

    /* compiled from: SearchResultsScreenItemClickHandler.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ContentType.values().length];
            try {
                iArr[ContentType.ARTIST.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ContentType.PODCAST.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ContentType.AUDIO_BOOK.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ContentType.CURATOR.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public jyh0(UserId userId, yp70 yp70Var) {
        ovj b = hqu0.b();
        this.a = userId;
        this.b = yp70Var;
        this.c = b;
        this.d = zvj.a(whn0.a());
    }
}

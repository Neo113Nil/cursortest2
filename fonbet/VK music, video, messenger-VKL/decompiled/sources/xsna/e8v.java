package xsna;

import androidx.fragment.app.FragmentActivity;
import com.vk.bridges.ImageViewer;
import com.vk.dto.common.Peer;
import com.vk.im.engine.models.attaches.MediaType;
import com.vk.im.engine.models.dialogs.ChatSettings;

/* compiled from: HistoryAttachesComponentFactory.kt */
/* loaded from: classes2.dex */
public final class e8v {
    public final a1w a;
    public final mxv b;
    public final zdw c;
    public final ImageViewer d;
    public final FragmentActivity e;
    public final Peer f;
    public final boolean g;
    public final kkm h;

    /* compiled from: HistoryAttachesComponentFactory.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[MediaType.values().length];
            try {
                iArr[MediaType.PHOTO.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[MediaType.VIDEO.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[MediaType.AUDIO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[MediaType.DOC.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[MediaType.LINK.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[MediaType.APPS.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[MediaType.GAMES.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public e8v(a1w a1wVar, mxv mxvVar, zdw zdwVar, ImageViewer imageViewer, FragmentActivity fragmentActivity, Peer peer, boolean z, kkm kkmVar) {
        this.a = a1wVar;
        this.b = mxvVar;
        this.c = zdwVar;
        this.d = imageViewer;
        this.e = fragmentActivity;
        this.f = peer;
        this.g = z;
        this.h = kkmVar;
    }

    public final c8v a(MediaType mediaType, ChatSettings chatSettings) {
        switch (a.$EnumSwitchMapping$0[mediaType.ordinal()]) {
            case 1:
                return new m5a0(this.d, this.a, this.b, this.e, mediaType, this.f, this.g, this.h, chatSettings);
            case 2:
                return new j2s0(this.e, this.f, mediaType, chatSettings, this.h, this.b, this.a);
            case 3:
                this.c.j.getClass();
                return new jc4(this.e, this.a, this.b, mediaType, this.f, new xwv(), this.h, chatSettings);
            case 4:
                return new htn(this.a, this.b, this.e, this.d, mediaType, this.f, this.h, chatSettings);
            case 5:
                return new t8z(this.e, this.f, mediaType, chatSettings, this.h, this.b, this.a);
            case 6:
                return new yd3(this.a, this.b, this.e, mediaType, this.f, this.h);
            case 7:
                return new yd3(this.a, this.b, this.e, mediaType, this.f, this.h);
            default:
                throw new UnsupportedOperationException("HistoryAttaches don't support mediaType: " + mediaType);
        }
    }
}

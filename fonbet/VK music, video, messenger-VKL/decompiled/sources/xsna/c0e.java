package xsna;

import android.graphics.Bitmap;
import android.net.Uri;
import com.huawei.hms.framework.common.BundleUtil;
import com.vk.dto.stickers.AnimatedStickerInfo;
import com.vk.media.MediaUtils;
import com.vk.rlottie.RLottieDrawable;
import com.vk.superapp.api.dto.story.WebStickerType;
import com.vk.superapp.api.dto.story.WebTransform;
import java.lang.reflect.Field;
import java.util.List;

/* compiled from: ClipsEditorStickersLoadingInteractor.kt */
/* loaded from: classes16.dex */
public final class c0e {

    /* compiled from: ClipsEditorStickersLoadingInteractor.kt */
    public static final class a {
        public final WebStickerType a;
        public final Bitmap b;
        public final String c;
        public final i700 d;
        public final wk2 e;
        public int f;
        public int g;
        public final AnimatedStickerInfo h;
        public final String i;

        public a(WebStickerType webStickerType, Bitmap bitmap, String str, i700 i700Var, wk2 wk2Var, AnimatedStickerInfo animatedStickerInfo, String str2, int i) {
            bitmap = (i & 2) != 0 ? null : bitmap;
            str = (i & 4) != 0 ? null : str;
            i700Var = (i & 8) != 0 ? null : i700Var;
            wk2Var = (i & 16) != 0 ? null : wk2Var;
            animatedStickerInfo = (i & 128) != 0 ? null : animatedStickerInfo;
            str2 = (i & 256) != 0 ? null : str2;
            this.a = webStickerType;
            this.b = bitmap;
            this.c = str;
            this.d = i700Var;
            this.e = wk2Var;
            this.f = 0;
            this.g = 0;
            this.h = animatedStickerInfo;
            this.i = str2;
        }

        public static final void a(a aVar, String str) {
            int i;
            int i2 = 0;
            List a = n6j.a(0, BundleUtil.UNDERLINE_TAG, str);
            if (a.size() == 2) {
                String str2 = (String) a.get(0);
                bpn0 bpn0Var = cqm0.a;
                try {
                    i = Integer.parseInt(str2);
                } catch (Throwable unused) {
                    i = 0;
                }
                aVar.f = i;
                try {
                    i2 = Integer.parseInt((String) a.get(1));
                } catch (Throwable unused2) {
                }
                aVar.g = i2;
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a == aVar.a && epx.f(this.b, aVar.b) && epx.f(this.c, aVar.c) && epx.f(this.d, aVar.d) && epx.f(this.e, aVar.e) && this.f == aVar.f && this.g == aVar.g && epx.f(this.h, aVar.h) && epx.f(this.i, aVar.i);
        }

        public final int hashCode() {
            int hashCode = this.a.hashCode() * 31;
            Bitmap bitmap = this.b;
            int hashCode2 = (hashCode + (bitmap == null ? 0 : bitmap.hashCode())) * 31;
            String str = this.c;
            int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
            i700 i700Var = this.d;
            int hashCode4 = (hashCode3 + (i700Var == null ? 0 : i700Var.hashCode())) * 31;
            wk2 wk2Var = this.e;
            int a = shy.a(this.g, shy.a(this.f, (hashCode4 + (wk2Var == null ? 0 : wk2Var.hashCode())) * 31, 31), 31);
            AnimatedStickerInfo animatedStickerInfo = this.h;
            int hashCode5 = (a + (animatedStickerInfo == null ? 0 : animatedStickerInfo.hashCode())) * 31;
            String str2 = this.i;
            return hashCode5 + (str2 != null ? str2.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("StickerData(type=");
            sb.append(this.a);
            sb.append(", bitmap=");
            sb.append(this.b);
            sb.append(", bitmapUrl=");
            sb.append(this.c);
            sb.append(", lottie=");
            sb.append(this.d);
            sb.append(", animatedImageResult=");
            sb.append(this.e);
            sb.append(", stickerPackId=");
            sb.append(this.f);
            sb.append(", stickerId=");
            sb.append(this.g);
            sb.append(", animatedInfo=");
            sb.append(this.h);
            sb.append(", animationUrl=");
            return ho8.a(sb, this.i, ')');
        }
    }

    /* compiled from: ClipsEditorStickersLoadingInteractor.kt */
    public static final /* synthetic */ class c {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[WebStickerType.values().length];
            try {
                iArr[WebStickerType.EMOJI.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[WebStickerType.STICKER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[WebStickerType.PHOTO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[WebStickerType.LOTTIE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[WebStickerType.GIF.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public final io.reactivex.rxjava3.core.q<nov> a(b bVar, MediaUtils.d dVar) {
        io.reactivex.rxjava3.core.q U;
        WebStickerType webStickerType = bVar.c;
        String str = bVar.a;
        String str2 = bVar.d;
        int i = c.$EnumSwitchMapping$0[webStickerType.ordinal()];
        int i2 = 5;
        int i3 = 4;
        int i4 = 2;
        int i5 = 0;
        int i6 = 1;
        if (i == 1 || i == 2 || i == 3) {
            U = mcr0.h(Uri.parse(str)).U(new op0(new com.vk.video.ui.discovery.minimizable.related_videos.j(webStickerType, str2, str, i4), i2));
        } else {
            int i7 = 14;
            if (i == 4) {
                o0m0 o0m0Var = o0m0.b;
                bpn0 bpn0Var = yse0.a;
                if (RLottieDrawable.s) {
                    bpn0 bpn0Var2 = c7r0.a;
                    U = c7r0.i(str).U(new e10(new yl0(i4, str2, str), 12));
                } else {
                    bpn0 bpn0Var3 = c7r0.a;
                    U = c7r0.g(str, str2, false).U(new c7(new a0e(str2, str), i7));
                }
            } else if (i != 5) {
                b7l.a("ClipsEditorStickersLoadingInteractor Can't loadAndShow sticker type: " + webStickerType);
                U = io.reactivex.rxjava3.internal.operators.observable.g0.b;
            } else {
                Uri parse = Uri.parse(str);
                Field field = mcr0.a;
                U = new io.reactivex.rxjava3.internal.operators.observable.q(new qcr0(parse)).U(new e7(new b0e(str, i5), i7));
            }
        }
        return U.F(new mp0(new wl0(bVar, 18), 10)).L(new nm3(new z5b(this, bVar, dVar, i6), i3), false);
    }

    /* compiled from: ClipsEditorStickersLoadingInteractor.kt */
    public static final class b {
        public final String a;
        public final String b;
        public final WebStickerType c;
        public final String d;
        public final WebTransform e;
        public final q500 f;

        public b(WebTransform webTransform, q500 q500Var, String str, WebStickerType webStickerType, String str2, String str3) {
            this.a = str;
            this.b = str2;
            this.c = webStickerType;
            this.d = str3;
            this.e = webTransform;
            this.f = q500Var;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return epx.f(this.a, bVar.a) && epx.f(this.b, bVar.b) && this.c == bVar.c && epx.f(this.d, bVar.d) && epx.f(this.e, bVar.e) && epx.f(this.f, bVar.f);
        }

        public final int hashCode() {
            int hashCode = this.a.hashCode() * 31;
            String str = this.b;
            int a = urd0.a((this.c.hashCode() + ((hashCode + (str == null ? 0 : str.hashCode())) * 31)) * 31, 31, this.d);
            WebTransform webTransform = this.e;
            int hashCode2 = (a + (webTransform == null ? 0 : webTransform.hashCode())) * 31;
            q500 q500Var = this.f;
            return hashCode2 + (q500Var != null ? q500Var.hashCode() : 0);
        }

        public final String toString() {
            return "StickerLoadInfo(url=" + this.a + ", previewUrl=" + this.b + ", type=" + this.c + ", metaInfo=" + this.d + ", transform=" + this.e + ", visibleRange=" + this.f + ')';
        }

        public /* synthetic */ b(String str, String str2, WebStickerType webStickerType, String str3, int i) {
            this(null, null, str, webStickerType, (i & 2) != 0 ? null : str2, str3);
        }
    }
}

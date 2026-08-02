package com.yandex.div.core;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.PictureDrawable;
import android.util.Base64;
import com.yandex.div.core.util.ImageRepresentation;
import com.yandex.div.internal.KLog;
import com.yandex.div.internal.util.UiThreadHandler;
import com.yandex.div.logging.Severity;
import com.yandex.div.svg.SvgDecoder;
import java.io.ByteArrayInputStream;
import xsna.brm0;
import xsna.drm0;
import xsna.gzs;
import xsna.izs;
import xsna.s3q0;

/* compiled from: DecodeBase64ImageTask.kt */
/* loaded from: classes7.dex */
public final class DecodeBase64ImageTask implements Runnable {
    private final izs<ImageRepresentation, s3q0> onDecoded;
    private String rawBase64string;
    private final boolean synchronous;

    /* JADX WARN: Multi-variable type inference failed */
    public DecodeBase64ImageTask(String str, boolean z, izs<? super ImageRepresentation, s3q0> izsVar) {
        this.rawBase64string = str;
        this.synchronous = z;
        this.onDecoded = izsVar;
    }

    /* renamed from: asImageRepresentation-9g2PFUk, reason: not valid java name */
    private final PictureDrawable m111asImageRepresentation9g2PFUk(PictureDrawable pictureDrawable) {
        return ImageRepresentation.PictureDrawable.m129constructorimpl(pictureDrawable);
    }

    /* renamed from: asImageRepresentation-Mlk_otY, reason: not valid java name */
    private final Bitmap m112asImageRepresentationMlk_otY(Bitmap bitmap) {
        return ImageRepresentation.Bitmap.m123constructorimpl(bitmap);
    }

    private final Bitmap decodeToBitmap(byte[] bArr) {
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inPreferredConfig = Bitmap.Config.ARGB_8888;
        try {
            return BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options);
        } catch (IllegalArgumentException unused) {
            KLog kLog = KLog.INSTANCE;
            if (!kLog.isAtLeast(Severity.ERROR)) {
                return null;
            }
            kLog.print(6, "Div", "Problem with decoding base-64 preview image occurred");
            return null;
        }
    }

    private final PictureDrawable decodeToPictureDrawable(byte[] bArr) {
        return new SvgDecoder(false, 1, null).decode(new ByteArrayInputStream(bArr));
    }

    private final String extractFromDataUrl(String str) {
        return brm0.B(str, "data:", false) ? str.substring(drm0.L(str, ',', 0, 6) + 1) : str;
    }

    private final boolean isSvg(String str) {
        return brm0.B(str, "data:image/svg", false);
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            byte[] decode = Base64.decode(extractFromDataUrl(this.rawBase64string), 0);
            final ImageRepresentation imageRepresentation = null;
            if (isSvg(this.rawBase64string)) {
                PictureDrawable decodeToPictureDrawable = decodeToPictureDrawable(decode);
                PictureDrawable m111asImageRepresentation9g2PFUk = decodeToPictureDrawable != null ? m111asImageRepresentation9g2PFUk(decodeToPictureDrawable) : null;
                if (m111asImageRepresentation9g2PFUk != null) {
                    imageRepresentation = ImageRepresentation.PictureDrawable.m128boximpl(m111asImageRepresentation9g2PFUk);
                }
            } else {
                Bitmap decodeToBitmap = decodeToBitmap(decode);
                Bitmap m112asImageRepresentationMlk_otY = decodeToBitmap != null ? m112asImageRepresentationMlk_otY(decodeToBitmap) : null;
                if (m112asImageRepresentationMlk_otY != null) {
                    imageRepresentation = ImageRepresentation.Bitmap.m122boximpl(m112asImageRepresentationMlk_otY);
                }
            }
            if (this.synchronous) {
                this.onDecoded.invoke(imageRepresentation);
            } else {
                UiThreadHandler.INSTANCE.postOnMainThread(new gzs<s3q0>() { // from class: com.yandex.div.core.DecodeBase64ImageTask$run$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // xsna.gzs
                    public /* bridge */ /* synthetic */ s3q0 invoke() {
                        invoke2();
                        return s3q0.a;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2() {
                        izs izsVar;
                        izsVar = DecodeBase64ImageTask.this.onDecoded;
                        izsVar.invoke(imageRepresentation);
                    }
                });
            }
        } catch (IllegalArgumentException unused) {
            KLog kLog = KLog.INSTANCE;
            if (kLog.isAtLeast(Severity.ERROR)) {
                kLog.print(6, "Div", "Bad base-64 image preview");
            }
        }
    }
}

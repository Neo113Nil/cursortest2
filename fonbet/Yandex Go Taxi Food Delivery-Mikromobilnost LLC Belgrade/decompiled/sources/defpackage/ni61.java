package defpackage;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import com.yandex.plus.home.feature.webviews.internal.container.ModalContentViewContainer;
import java.util.List;

/* loaded from: classes7.dex */
public final class ni61 extends zt71 {
    public final j4n m;

    public ni61(List list) {
        byte[] bArr = (byte[]) list.get(0);
        int length = bArr.length;
        int i = ((bArr[0] & 255) << 8) | (bArr[1] & 255);
        int i2 = (bArr[3] & 255) | ((bArr[2] & 255) << 8);
        j4n j4nVar = new j4n();
        Paint paint = new Paint();
        j4nVar.a = paint;
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC));
        paint.setPathEffect(null);
        Paint paint2 = new Paint();
        j4nVar.b = paint2;
        paint2.setStyle(Paint.Style.FILL);
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OVER));
        paint2.setPathEffect(null);
        j4nVar.c = new Canvas();
        j4nVar.x = new c4n(sk51.DEFAULT_MAX_HEIGHT_TO_DISCARD, 575, 0, sk51.DEFAULT_MAX_HEIGHT_TO_DISCARD, 0, 575);
        j4nVar.y = new nm61(new int[]{0, -1, ModalContentViewContainer.BASE_SHADOW_COLOR, -8421505}, j4n.h(), j4n.i(), 0);
        j4nVar.z = new i4n(i, i2, 2);
        this.m = j4nVar;
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    @Override // defpackage.zt71
    public final defpackage.fh81 c(int r43, byte[] r44, boolean r45) {
        /*
            Method dump skipped, instructions count: 1142
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ni61.c(int, byte[], boolean):fh81");
    }
}

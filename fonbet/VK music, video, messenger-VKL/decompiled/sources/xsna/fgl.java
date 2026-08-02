package xsna;

import android.graphics.Bitmap;
import com.facebook.imagepipeline.decoder.DecodeException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Map;
import xsna.tiw;

/* compiled from: DefaultImageDecoder.java */
/* loaded from: classes.dex */
public final class fgl implements niw {
    public final niw a;
    public final niw b;
    public final ita0 c;
    public final a d = new a();
    public final Map<siw, niw> e;

    /* compiled from: DefaultImageDecoder.java */
    public class a implements niw {
        public a() {
        }

        @Override // xsna.niw
        public final svf a(rip ripVar, int i, cpe0 cpe0Var, liw liwVar) {
            niw niwVar;
            niw niwVar2;
            siw o = ripVar.o();
            Boolean bool = Boolean.FALSE;
            liwVar.getClass();
            siw siwVar = hgl.a;
            fgl fglVar = fgl.this;
            if (o == siwVar) {
                uvf<Bitmap> decodeJPEGFromEncodedImageWithColorSpace = fglVar.c.decodeJPEGFromEncodedImageWithColorSpace(ripVar, liwVar.b, null, i, null);
                try {
                    decodeJPEGFromEncodedImageWithColorSpace.getClass();
                    lcl B2 = xvf.B2(decodeJPEGFromEncodedImageWithColorSpace, cpe0Var, ripVar.getRotationAngle(), ripVar.w0());
                    B2.h(bool, "is_rounded");
                    return B2;
                } finally {
                    uvf.q(decodeJPEGFromEncodedImageWithColorSpace);
                }
            }
            if (o == hgl.c) {
                if (ripVar.getWidth() == -1 || ripVar.getHeight() == -1) {
                    throw new DecodeException("image width or height is incorrect", ripVar);
                }
                return (liwVar.a || (niwVar2 = fglVar.a) == null) ? fglVar.b(ripVar, liwVar) : niwVar2.a(ripVar, i, cpe0Var, liwVar);
            }
            if (o == hgl.j) {
                return (liwVar.a || (niwVar = fglVar.b) == null) ? fglVar.b(ripVar, liwVar) : niwVar.a(ripVar, i, cpe0Var, liwVar);
            }
            if (o == hgl.m) {
                return null;
            }
            if (o != siw.c) {
                return fglVar.b(ripVar, liwVar);
            }
            throw new DecodeException("unknown image format", ripVar);
        }
    }

    public fgl(niw niwVar, niw niwVar2, ita0 ita0Var, Map map) {
        this.a = niwVar;
        this.b = niwVar2;
        this.c = ita0Var;
        this.e = map;
    }

    @Override // xsna.niw
    public final svf a(rip ripVar, int i, cpe0 cpe0Var, liw liwVar) {
        InputStream p;
        niw niwVar;
        liwVar.getClass();
        siw o = ripVar.o();
        if ((o == null || o == siw.c) && (p = ripVar.p()) != null) {
            Object obj = tiw.d;
            try {
                o = tiw.a.a(p);
                ripVar.z(o);
            } catch (IOException e) {
                s200.J(e);
                throw null;
            }
        }
        Map<siw, niw> map = this.e;
        return (map == null || (niwVar = map.get(o)) == null) ? this.d.a(ripVar, i, cpe0Var, liwVar) : niwVar.a(ripVar, i, cpe0Var, liwVar);
    }

    public final lcl b(rip ripVar, liw liwVar) {
        uvf<Bitmap> decodeFromEncodedImageWithColorSpace = this.c.decodeFromEncodedImageWithColorSpace(ripVar, liwVar.b, null, null);
        try {
            decodeFromEncodedImageWithColorSpace.getClass();
            lcl B2 = xvf.B2(decodeFromEncodedImageWithColorSpace, gpw.d, ripVar.getRotationAngle(), ripVar.w0());
            B2.h(Boolean.FALSE, "is_rounded");
            return B2;
        } finally {
            uvf.q(decodeFromEncodedImageWithColorSpace);
        }
    }
}

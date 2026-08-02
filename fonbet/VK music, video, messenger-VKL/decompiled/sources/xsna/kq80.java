package xsna;

import android.content.Context;
import com.vk.api.generated.photos.dto.PhotosGetAlbumsResponseDto;
import com.vk.api.generated.photos.dto.PhotosPhotoAlbumFullDto;
import com.vkontakte.android.R;
import java.util.Iterator;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes17.dex */
public final /* synthetic */ class kq80 implements izs {
    public final /* synthetic */ int b = 0;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ kq80(Context context, oga0 oga0Var, int i) {
        this.d = context;
        this.e = oga0Var;
        this.c = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.izs
    public final Object invoke(Object obj) {
        Object obj2;
        bvi bviVar;
        long[] jArr;
        bvi bviVar2;
        long[] jArr2;
        int i;
        switch (this.b) {
            case 0:
                Context context = (Context) this.d;
                oga0 oga0Var = (oga0) this.e;
                Iterator<T> it = ((PhotosGetAlbumsResponseDto) obj).d().iterator();
                while (true) {
                    if (it.hasNext()) {
                        obj2 = it.next();
                        if (((PhotosPhotoAlbumFullDto) obj2).getId() == this.c) {
                        }
                    } else {
                        obj2 = null;
                    }
                }
                PhotosPhotoAlbumFullDto photosPhotoAlbumFullDto = (PhotosPhotoAlbumFullDto) obj2;
                if (photosPhotoAlbumFullDto == null) {
                    enj.q(R.string.access_error, 0, context);
                } else {
                    tfa0.a.getClass();
                    oga0.a(oga0Var, context, tfa0.a(photosPhotoAlbumFullDto), "link", 24);
                }
                break;
            default:
                androidx.compose.runtime.f fVar = (androidx.compose.runtime.f) this.d;
                eh50 eh50Var = (eh50) this.e;
                bvi bviVar3 = (bvi) obj;
                int i2 = fVar.e;
                int i3 = this.c;
                if (i2 == i3 && epx.f(eh50Var, fVar.f) && (bviVar3 instanceof ivi)) {
                    long[] jArr3 = eh50Var.a;
                    int length = jArr3.length - 2;
                    if (length >= 0) {
                        int i4 = 0;
                        while (true) {
                            long j = jArr3[i4];
                            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                int i5 = 8;
                                int i6 = 8 - ((~(i4 - length)) >>> 31);
                                int i7 = 0;
                                while (i7 < i6) {
                                    if ((255 & j) < 128) {
                                        int i8 = (i4 << 3) + i7;
                                        Object obj3 = eh50Var.b[i8];
                                        boolean z = eh50Var.c[i8] != i3;
                                        if (z) {
                                            i = i5;
                                            ivi iviVar = (ivi) bviVar3;
                                            bviVar2 = bviVar3;
                                            s101.J(iviVar.h, obj3, fVar);
                                            if (obj3 instanceof g1m) {
                                                g1m g1mVar = (g1m) obj3;
                                                jArr2 = jArr3;
                                                if (!iviVar.h.b(g1mVar)) {
                                                    s101.K(iviVar.k, g1mVar);
                                                }
                                                ph50<g1m<?>, Object> ph50Var = fVar.g;
                                                if (ph50Var != 0) {
                                                    ph50Var.n(obj3);
                                                }
                                            } else {
                                                jArr2 = jArr3;
                                            }
                                        } else {
                                            bviVar2 = bviVar3;
                                            jArr2 = jArr3;
                                            i = i5;
                                        }
                                        if (z) {
                                            eh50Var.h(i8);
                                        }
                                    } else {
                                        bviVar2 = bviVar3;
                                        jArr2 = jArr3;
                                        i = i5;
                                    }
                                    j >>= i;
                                    i7++;
                                    i5 = i;
                                    bviVar3 = bviVar2;
                                    jArr3 = jArr2;
                                }
                                bviVar = bviVar3;
                                jArr = jArr3;
                                if (i6 != i5) {
                                }
                            } else {
                                bviVar = bviVar3;
                                jArr = jArr3;
                            }
                            if (i4 != length) {
                                i4++;
                                bviVar3 = bviVar;
                                jArr3 = jArr;
                            }
                        }
                    }
                }
                break;
        }
        return s3q0.a;
    }

    public /* synthetic */ kq80(androidx.compose.runtime.f fVar, int i, eh50 eh50Var) {
        this.d = fVar;
        this.c = i;
        this.e = eh50Var;
    }
}

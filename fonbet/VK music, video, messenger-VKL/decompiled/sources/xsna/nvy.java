package xsna;

import com.vk.music.playlist.framework.presentation.PlaylistScreenContentType;
import java.io.Serializable;

/* compiled from: LazyDsl.kt */
/* loaded from: classes11.dex */
public interface nvy {
    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ void c(nvy nvyVar, int i, izs izsVar, jai jaiVar, int i2) {
        if ((i2 & 2) != 0) {
            izsVar = null;
        }
        nvyVar.e(i, izsVar, mvy.b, jaiVar);
    }

    static /* synthetic */ void g(nvy nvyVar, Serializable serializable, PlaylistScreenContentType playlistScreenContentType, yzs yzsVar, int i) {
        if ((i & 1) != 0) {
            serializable = null;
        }
        if ((i & 2) != 0) {
            playlistScreenContentType = null;
        }
        nvyVar.h(serializable, playlistScreenContentType, yzsVar);
    }

    default void b(jai jaiVar) {
        h("header", null, new jai(1691919627, new lvy(0, jaiVar), true));
    }

    default void e(int i, izs<? super Integer, ? extends Object> izsVar, izs<? super Integer, ? extends Object> izsVar2, zzs<? super ksy, ? super Integer, ? super androidx.compose.runtime.a, ? super Integer, s3q0> zzsVar) {
        throw new IllegalStateException("The method is not implemented");
    }

    default void h(Object obj, Object obj2, yzs<? super ksy, ? super androidx.compose.runtime.a, ? super Integer, s3q0> yzsVar) {
        throw new IllegalStateException("The method is not implemented");
    }
}

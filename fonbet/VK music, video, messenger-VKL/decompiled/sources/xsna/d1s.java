package xsna;

import com.vk.dto.music.Playlist;
import kotlin.jvm.internal.AdaptedFunctionReference;

/* compiled from: FoldersListLoaderImpl.kt */
/* loaded from: classes18.dex */
public final /* synthetic */ class d1s extends AdaptedFunctionReference implements izs {
    public final /* synthetic */ int b = 0;

    public /* synthetic */ d1s(int i, Object obj, Class cls, String str, String str2, int i2) {
        super(i, obj, cls, str, str2, i2);
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                ((io.reactivex.rxjava3.disposables.b) this.receiver).b((io.reactivex.rxjava3.disposables.c) obj);
                break;
            default:
                ((vh40) this.receiver).e((Playlist) obj, false);
                break;
        }
        return s3q0.a;
    }

    public d1s(vh40 vh40Var) {
        super(1, vh40Var, vh40.class, "deletePlaylist", "deletePlaylist(Lcom/vk/dto/music/Playlist;Z)V", 0);
    }
}
